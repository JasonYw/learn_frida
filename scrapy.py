import frida
import time
import requests
import json
import json
import logging
logging.basicConfig(level=logging.INFO,format="[%(asctime)s %(funcName)s]-%(levelname)s : %(message)s",filename='log/scrapy.log')


def recive(message,data):
    if message.get('payload') and isinstance(message.get('payload'),dict):
        if message.get('payload').get('body'):
            logging.info(f'catch=> {message.get("payload").get("url")}')
            now = time.time()
            bs = bytearray()
            for i in message.get('payload').get('body'):
                if i<0:
                    bs.append(i+256)
                else:
                    bs.append(i)
            if 'https://aweme.snssdk.com/aweme/v2/feed/?' in message.get("payload").get("url"):
                c = open(f'result/{now}','wb')
                c.write(bs)
                c.close()
            elif 'https://aweme.snssdk.com/aweme/v1/search/item/' in message.get("payload").get("url"):
                c = open(f'result/{now}.json','wb')
                c.write(bs)
                c.close()
        
          

def attach():
    device = frida.get_usb_device()
    # pid = device.spawn(["com.ss.android.ugc.aweme"])
    # pid = device.attach("com.ss.android.ugc.aweme")
    # device.resume(pid)
    time.sleep(1)
    # session = device.attach(pid)
    session = device.attach("抖音")
    f = open('catch.js','r')
    script = session.create_script(f.read())
    script.on("message",recive)
    script.load()
    f.close()
    input()
    

def req(url):
    d = open('req.json','w',encoding='utf-8')
    headers ={
        'x-tt-dt':'AAAVYLBJAGWCCOZTEGZHXMZS7JZDUEL4TS4VWANJ7JFOLBYIVDJBZRMBXHNCIEE2QC5Q7ZHL27BCV22VAWDQYKXQFJAEQW5M5ZWJGPRYWQPZ34AIXPMDDJCSKMSABKW6U4VLZAE7EVWAINFTHUT5WYA', 
        'activity_now_client': '1658972527167', 
        'X-SS-REQ-TICKET': '1658972530971',
        'x-tt-request-tag': 't=0;n=0',
        'x-vc-bdturing-sdk-version': '2.2.1.cn', 
        'sdk-version': '2', 
        'passport-sdk-version': '20369',
    }
    res = requests.post(url,headers=headers)
    message, typedef = blackboxprotobuf.protobuf_to_json(res.content)
    # message = json.loads(message)
    
    d.write(message+'\n')
    d.close()
    # print(message)
    

if __name__ == "__main__":
    attach()