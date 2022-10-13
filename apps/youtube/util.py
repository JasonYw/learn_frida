import requests
import re
import json
from parsel import Selector
from urllib.parse import urljoin
from tqdm import tqdm


session = requests.Session()
header = {
    'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36',
}

def findall(rule,text):
    try:
        return re.findall(rule,text)[0]
    except:
        return ''

def get_url_list(text):
    return re.findall(r'"url":"(/watch.v=.*?)",',text) or []

def make_payload(text):
    return {
        "context": {
            "client": {
                "hl": findall(r'"hl":"(.*?)",',text),
                "gl": findall(r'"gl":"(.*?)",',text),
                "remoteHost": findall(r'"remoteHost":"(.*?)",',text),
                "deviceMake": findall(r'"deviceMake":"(.*?)",',text),
                "deviceModel": findall(r'"deviceModel":"(.*?)",',text),
                "visitorData": findall(r'"visitorData":"(.*?)",',text),
                "userAgent": findall(r'"userAgent":"(.*?)",',text),
                "clientName": findall(r'"clientName":"(.*?)",',text),
                "clientVersion": findall(r'"clientVersion":"(.*?)",',text),
                "osName": findall(r'"osName":"(.*?)",',text),
                "osVersion": findall(r'"osVersion":"(.*?)",',text),
                "originalUrl": findall(r'"originalUrl":"(.*?)",',text),
                "platform": findall(r'"platform":"(.*?)",',text),
                "clientFormFactor": findall(r'"clientFormFactor":"(.*?)",',text),
                "configInfo": {
                    "appInstallData": findall(r'"appInstallData":"(.*?)",',text),
                },
                "timeZone": findall(r'"timeZone":"(.*?)",',text),
                "browserName": findall(r'"browserName":"(.*?)",',text),
                "browserVersion": findall(r'"browserVersion":"(.*?)",',text),
                "acceptHeader": findall(r'"acceptHeader":"(.*?)",',text),
            },
            "user": {
                "lockedSafetyMode": False,
            },
            "request": {
                "useSsl": True,
                "internalExperimentFlags": [],
                "consistencyTokenJars": []
            },
            # "clickTracking": {
            #     "clickTrackingParams": findall(r'"clickTrackingParams":"(.*?)",',text),
            # },
        },
        "continuation": findall(r'"continuationCommand":{"token":"(.*?)",',text),
    }

def get_index_list(url ='https://www.youtube.com/c/RelativitySpace/videos'):
    video_list = []
    res = session.get(url,headers=header,verify=False)
    open('index.html','w').write(res.text)
    payload = make_payload(res.text)
    key = findall(r'"INNERTUBE_API_KEY":"(.*?)"',res.text)
    next_url = f'https://www.youtube.com/youtubei/v1/browse?key={key}&prettyPrint=false'
    while True:
        video_list = video_list + get_url_list(res.text)
        r = continuation_list(next_url,payload,res.text)
        if not r:
            video_list = video_list + get_url_list(res.text)
            break
        else:
            res = r   
    print(len(video_list)) 
    return video_list
        
def continuation_list(url,payload,text):
    continuation = findall(r'"continuationCommand":{"token":"(.*?)",',text)
    if continuation:
        payload['continuation'] = continuation
        # payload['context']['clickTracking']['clickTrackingParams'] = findall(r'"clickTrackingParams":"(.*?)",',text)
        r = session.post(url,headers=header,data=json.dumps(make_payload(text)),verify=False)
        return r
    else:
        return

def parse_video_list(urllist):
    for i in tqdm(urllist):
        make_video(i)

def make_video(url):
    url = urljoin('https://www.youtube.com/',url)
    res = session.get(url=url,headers=header)
    json_str = re.findall('var ytInitialPlayerResponse = (.*?);var', res.text)[0]
    json_data = json.loads(json_str)
    video_url = json_data['streamingData']['adaptiveFormats'][0]['url']
    audio_url = json_data['streamingData']['adaptiveFormats'][-2]['url']
    title = json_data['videoDetails']['title']
    title = title.replace(' ', '')
    title = re.sub(r'[\/:|?*"<>]', '', title) 
    video = session.get(video_url, stream=True)
    audio = session.get(audio_url, stream=True)   
    with open(f'{title}.mp4', mode='wb') as f:
        for video_chunk in tqdm(video.iter_content(1024*1024*2)):
            f.write(video_chunk)
    with open(f'{title}.mp3', mode='wb') as f:
        for audio_chunk in tqdm(audio.iter_content(1024*1024*2)):
            f.write(audio_chunk)
    # f'ffmpeg.exe -i {title}.mp4 -i {title}.mp3 -acodec copy -vcodec copy {title} -out.mp4' 
    

if __name__ == "__main__":
    parse_video_list(get_index_list())
    


