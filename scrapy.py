import frida
import time
import requests
import json
import json
import logging
import subprocess

import json
from google.protobuf.json_format import MessageToDict
logging.basicConfig(level=logging.INFO,format="[%(asctime)s %(funcName)s]-%(levelname)s : %(message)s",filename='log/scrapy.log')


def decodes(data):
    """
    如果上传到linux线上服务器，需要chmod+x protoc赋予权限。
    """
    process = subprocess.Popen([r'protoc', '--decode_raw'],stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    output = error = None
    try:
        output, error = process.communicate(data)
    except OSError as e:
        pass
    finally:
        if process.poll() != 0:
            process.wait()
    return output


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
                decodes(bytes(bs))
                # c = open(f'result/{now}.json','wb')
                # c.write(bs)
                # c.close()
                # info = Protobufaweme_v2_feed_responseAdapter_pb2.Protobufaweme_v2_feed_responseAdapter()
                # info.ParseFromString(bytes(bs))
                # print(json.dumps(MessageToDict(info, preserving_proto_field_name=True), ensure_ascii=False))
                # c = open(f'result/{now}','wb')
                # c.write(bs)
                # c.close()
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
    

    

if __name__ == "__main__":
    attach()