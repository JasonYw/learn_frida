import hashlib
import re

import requests
import execjs

# proxies = {
#     "http":"http://qianxin:Qianxin_666@8.219.207.157:9966",
#     "https:":"http://qianxin:Qianxin_666@8.219.207.157:9966"
# }
proxies = {
    "http":"http://127.0.0.1:7890",
    "https:":"http://127.0.0.1:7890"
}
def getCookie(data):
    chars = len(data["chars"])
    for i in range(chars):
        for j in range(chars):
            clearance = (
                data["bts"][0] + data["chars"][i] + data["chars"][j] + data["bts"][1]
            )
            encrypt = None
            if data["ha"] == "md5":
                encrypt = hashlib.md5()
            elif data["ha"] == "sha1":
                encrypt = hashlib.sha1()
            elif data["ha"] == "sha256":
                encrypt = hashlib.sha256()
            encrypt.update(clearance.encode())
            result = encrypt.hexdigest()
            if result == data["ct"]:
                return clearance

def main():
    session = requests.Session()
    headers = {
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
        "Cache-Control": "max-age=0",
        "Connection": "keep-alive",
        "Content-Type": "application/x-www-form-urlencoded",
        "Origin": "https://www.cnvd.org.cn",
        "Referer": "https://www.cnvd.org.cn/flaw/list?flag=true",
        "Sec-Fetch-Dest": "document",
        "Sec-Fetch-Mode": "navigate",
        "Sec-Fetch-Site": "same-origin",
        "Sec-Fetch-User": "?1",
        "sec-ch-ua-mobile": "?0",
        "sec-ch-ua": '" Not;A Brand";v="99", "Microsoft Edge";v="91", "Chromium";v="91"',
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
        "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8,zh-TW;q=0.7",
        "Upgrade-Insecure-Requests": "1",
    }
    cookies={}
    res = session.get(
        "https://www.cnvd.org.cn/flaw/list?flag=true",
        headers=headers,
        proxies=proxies,
        cookies=cookies
    )
    jsl_clearance_s = re.findall(r"cookie=(.*?);location", res.text)[0]
    jsl_clearance_s = (
        str(execjs.eval(jsl_clearance_s)).split("=")[1].split(";")[0]
    )
    jasule_uid = res.headers['set-cookie'].split("=")[1].split(";")[0]
    cookies.update({
        "__jsluid_s": jasule_uid,
        "__jsl_clearance_s": jsl_clearance_s,
    })

    res = session.get(
        "https://www.cnvd.org.cn/flaw/list?flag=true",
        headers=headers,
        proxies=proxies,
        cookies=cookies
        
    )
    data = eval(re.findall(r";go.(.*?).</script>", res.text)[0])
    jsl_clearance_s = getCookie(data)
   
    cookies.update({
        "__jsl_clearance_s": jsl_clearance_s,
    })

   

    data = {
        "number": "请输入精确编号",
        "startDate": "",
        "endDate": "",
        "field": "",
        "order": "",
        "flag": "true",
        "numPerPage": "10",
        "offset": "10",
        "max": "10"
    }

    res = session.post(
        url="https://www.cnvd.org.cn/flaw/list?flag=true",
        headers=headers,
        data=data,
        proxies=proxies,
        timeout=10,
        cookies=cookies
    )
    print(res.status_code)
    # if res.status_code == 200:
    #     print(1)
    #     return requests.utils.dict_from_cookiejar(self.session.cookies)

if __name__ == '__main__':
    main()
    