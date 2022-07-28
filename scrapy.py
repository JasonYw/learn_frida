import frida
import time
import requests
import blackboxprotobuf
import json
import json




def recive(message,data):
    if message.get('payload') and isinstance(message.get('payload'),dict):
        # message["payload"] = json.loads(message["payload"])
        if message.get('payload').get('body'):
            now = time.time()
            bs = bytearray()
            # print(message.get("payload").get("url"),now)
            for i in message.get('payload').get('body'):
                if i<0:
                    bs.append(i+256)
                else:
                    bs.append(i)
            if 'https://aweme.snssdk.com/aweme/v2/feed/?' in message.get("payload").get("url"):
                # print(message.get("payload").get("url"),now)
                c = open(f'{now}.json','w',encoding='utf-8')
                for i in range(3):
                    try:
                        message_, typedef = blackboxprotobuf.protobuf_to_json(bs)
                        c.write(message_)
                        c.close()
                        break
                    except:
                        continue
            elif 'https://aweme.snssdk.com/aweme/v1/search/item/' in message.get("payload").get("url"):
                c = open(f'{now}.json','wb')
                c.write(bs)
                c.close()
        

    # print(message)
    # if message.get('payload'):
    #     bs = bytearray()
    #     for i in  message.get('payload'):
    #         if i<0:
    #             bs.append(i+256)
    #         else:
    #             bs.append(i)
    #     # try:
    #     #     res = bs.decode("gbk")
    #     # except:
    #     # try:
    #     #     res = bs.decode("utf-8")
    #     # except:
    #     #     res = bs.decode("gbk")
      
    #     c = open(f'scrapy_{time.time()}.log','wb')
    #     c.write(bs)
    #     c.close()
          

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
    
    # access-control-expose-headers: tt-idc-switch, 
    # content-encoding: , 
    # content-type: application/json, 
    # date: Thu, 28 Jul 2022 07:51:00 GMT, 
    # server: nginx, 
    # server-timing: inner; dur=542, cdn-cache;desc=MISS,origin;dur=560,edge;dur=6, 
    # tt-idc-switch: 10000@20220720205549, 
    # tt_api_type: STREAM_FORECAST, 
    # tt_stable: 1, 
    # vary: Accept-Encoding, 
    # via: n108-232-063.bjalibgp01,n63-029-045.bjpbs, 
    # x-agw-info: oFHGI0RM0cEpMt_W9eGUiAJN2vwNUii_x_W8-PjVAxiXqiPFXzpdIiB-fO1-dBpTQBbGjVbUEBZcrwV-Ema4vL0m1-INpHBL9HjGD6FVWEbr6x0cYzcv6qif3zAovobUqMPXzx3T1RPbdWDfKn_-BSI-vFLWAczqFHvE7Fj8ceWp6DVeqCxDpyf_8ypzKli8CoM=, 
    # x-dsa-origin-status: 200, 
    # x-dsa-trace-id: 16589946607b368926130b7f1bbfc6654835ed985b, 
    # x-net-info.remoteaddr: 124.202.165.101:443, 
    # x-request-ip: 124.193.98.160, 
    # x-trans-level: 0, 
    # x-tt-agw-login: 0,
    # x-tt-logid: 202207281551000101381712260F4A86FB, 
    # x-tt-trace-host: 0104c4a8f52a9998b98d61526851d67ecf9190cbdd085aa43d70c59eeeaaa64de39d06230753ebe381cee8c2926dd8e3f1eb4bec5b61e041e2467fa3c98f91b8ee9513f3eb72146624b54f9baf77cbe192de31196239cccec40248e6fe394681fd92d91b89234c9b735c6318a088bf675b, 
    # x-tt-trace-id: 00-43c9a72e0de546d67147828b99240468-43c9a72e0de546d6-01, 
    # x-tt-trace-tag: id=5
    attach()
    # req('https://aweme.snssdk.com/aweme/v2/feed/?type=0&max_cursor=0&min_cursor=0&count=6&volume=0.0&pull_type=0&need_relieve_aweme=0&filter_warn=0&req_from=enter_auto&is_cold_start=1&address_book_access=2&gps_access=2&cached_item_num=0&last_ad_show_interval=-1&mac_address=40%3A4E%3A36%3A86%3AC1%3AF9&preload_aweme_ids&action_mask=-1&action_mask_detail=%7B%7D&action_mask_info=%7B%7D&ad_extra&teen_protector_vote_aweme_count=0&last_teen_protector_vote_aweme_interval=0&sp=-1&is_order_flow=0&user_avatar_shrink=96_96&screen_type=0&pitaya_type=0&location_permission=false&font_category=2&feed_recommend_req_index=1&audio_value=0&launch_times=135&recent_items=%5B%5D&play_style=0&filter_live_cell=false&addiction_info&client_extra=%7B%22charging%22%3A1%2C%22qoe%22%3A100%2C%22har_info%22%3A%7B%7D%2C%22recommend_client_vid%22%3A6%7D&iid=1412242872480222&device_id=4033478531512360&ac=wifi&channel=sem_shenma_dy_ls077&aid=1128&app_name=aweme&version_code=210500&version_name=21.5.0&device_platform=android&os=android&ssmix=a&device_type=Pixel%202&device_brand=google&language=zh&os_api=27&os_version=8.1.0&openudid=103464fba0335b6a&manifest_version_code=210501&resolution=1080*1794&dpi=420&update_version_code=21509900&_rticket=1658973246781&package=com.ss.android.ugc.aweme&is_guest_mode=0&app_type=normal&minor_status=0&appTheme=light&need_personal_recommend=1&is_android_pad=0&cpu_support64=true&host_abi=armeabi-v7a&ts=1658973246&cdid=3d9c863a-41f8-42c0-bb4b-4935abe2dc51&download_sdk_info=%7B%22su%22%3A107550%2C%22pure_mode%22%3A4%7D')


