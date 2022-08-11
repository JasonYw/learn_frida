import frida
import time
import requests
import json
import json
import logging
import douyin_pb2
import json
from google.protobuf.json_format import MessageToDict

import json
from google.protobuf.json_format import MessageToDict
logging.basicConfig(level=logging.INFO,format="[%(asctime)s %(funcName)s]-%(levelname)s : %(message)s",filename='log/scrapy.log')





def decode_proto(bs):
    info = douyin_pb2.feeditemlist()
    info.ParseFromString(bs)
    return(
        json.dumps(
            MessageToDict(info, preserving_proto_field_name=True), ensure_ascii=True
        )
    )
    



def recive(message,data):
    if message.get('payload') and isinstance(message.get('payload'),dict):
        if message.get('payload').get('body'):
            logging.info(f'url=> {message.get("payload").get("url")}')
            logging.info(f'header=>\n{message.get("payload").get("header")}')
            now = time.time()
            bs = bytearray()
            for i in message.get('payload').get('body'):
                if i<0:
                    bs.append(i+256)
                else:
                    bs.append(i)
            if 'https://aweme.snssdk.com/aweme/v2/feed/?' in message.get("payload").get("url"):
                try:
                    logging.info(f'body=>\n{decode_proto(bytes(bs))}')
                except:
                    logging.error(f'body=>')
            elif 'https://aweme.snssdk.com/aweme/v1/search/item/' in message.get("payload").get("url"):
                logging.info(f'body=>\n{bytes(bs).decode()}')
            
            else:
                try:
                    logging.info(f'body=>\n{bytes(bs).decode()}')
                except:
                    logging.error(f'body=>')
            
    
          

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
    

    

if __name__ == "__main__":
    attach()