import requests
from tqdm import tqdm
session = requests.session()
header ={
    'User-Agent':'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36'
}

def login():
    url = 'https://home.cgpower.cn/'
    session.get(url,headers=header)
    data = {
        'mobile': '15801367721',
        'pwd': '123456',
        'async': 'false',
        'channel': '1',
    }
    res = session.post('https://me.cgpower.cn/app/login/login',headers=header,data=data)
    token = res.json().get('data').get('token')
    uid = res.json().get('data').get('uid')
    return token,str(uid)

def getCourse(token,uid):
    header.update({
        'token': token,
        'uid':uid,
        'Host': 'me.cgpower.cn',
        'Origin': 'https://home.cgpower.cn',
        'Referer': 'https://home.cgpower.cn/'
    })
    url = 'https://me.cgpower.cn/app/lesson/ownonlinelist?uid=20452&page=1&limit=8'
    res = session.get(url,headers=header)
    goodlist =[] 
    i = res.json()['data']['list'][1]
    for j in range(5,8):
        goodlist.append(
            f'https://me.cgpower.cn/app/lesson/luobolist?uid={uid}&good_id={i["good_id"]}&limit=8&page={j}&token={token}'
        )
    return goodlist

def getGoodsInfo(url,uid):
    goodsdictlist = []
    res = session.get(url,headers=header)
    for i in tqdm(res.json()['data']['list']):
        temp = session.get(f'https://me.cgpower.cn/app/lesson/webvideo?uuid=8f29ac0f83537139cbc3666c6726b2ec&uid={uid}&uuid={i["uuid"]}')
        item = {
            'uuid':i['uuid'],
            'title':f"{i['title']}.mp4",
            'url': f'https://1311742623.vod2.myqcloud.com/{temp.json()["data"]}&uuid={i["uuid"]}'
        }
        video = session.get(item['url'],stream=True)
        with open(item['title'],'wb') as f:
            for video_chunk in video.iter_content(1024*1024*7):
                f.write(video_chunk)
        goodsdictlist.append(item)
    
    




if __name__ == "__main__":
    token,uid = login()
    for i in getCourse(token,uid):
        print(i)
        getGoodsInfo(i,uid)
    

