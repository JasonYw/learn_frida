import sys
import os


sys.path.append(os.getcwd())
import requests
from parsel import Selector
import json
import time
from utils import Proxy

address = "http://proxy.lfk.qianxin-inc.cn:3128"
proxies = {
    "http": address,
    "https": address,
}


url = "https://breachforums.st/member?action=login"
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"
}
res = requests.get(url, headers=headers, proxies=proxies, timeout=30)
html = Selector(res.text)
sitekey = html.xpath("//*/@data-sitekey").get()
token = "5xes4QRYiOcTwihFUojuEAivAfgPMZ_buXDHW8__8GA"

print(sitekey)


# 定制类接口-Hcaptcha
_headers = {"Content-Type": "application/json"}
_custom_url = "http://api.jfbym.com/api/YmServer/funnelApi"
payload = {
    "sitekey": sitekey,
    "pageurl": "https://breachforums.st/member?action=login",
    "token": token,
    "type": "50013",
}
result = requests.post(_custom_url, headers=_headers, data=json.dumps(payload)).json()
print(result)
captcha_id = result.get("data").get("captchaId")
record_id = result.get("data").get("recordId")
times = 0
while times < 150:
    try:
        url = f"http://api.jfbym.com/api/YmServer/funnelApiResult"
        data = {"token": token, "captchaId": captcha_id, "recordId": record_id}
        result = requests.post(url, headers=_headers, json=data).json()
        print(result)
        # {'msg': '结果准备中，请稍后再试', 'code': 10009, 'data': []}
        if result["msg"] == "结果准备中，请稍后再试":
            time.sleep(5)
            times += 5
            continue
        if result["msg"] == "请求成功" and result["code"] == 10001:

            print(result["data"]["data"])
            # {'msg': '请求成功', 'code': 10001, 'data': {'data': '03AGdBq2611GTOgA2v9HUpMMEUE70p6dwOtYyHJQK4xhdKF0Y8ouSGsFZt647SpJvZ22qinYrm6MYBJGFQxMUIApFfSBN6WTGspk6DmFdQAoWxynObRGV7qNMQOjZ_m4w3_6iRu8SJ3vSUXH_HHuA7wXARJbKEpU4J4R921NfpKdahgeFD8rK1CFYAqLd5fz4l-8_VRmRE83dRSfkgyTN338evQ1doWKJRipZbk4ie-89Ud0KGdOsP4QzG3stRZgj2oaEoMDSAP62vxKGYqtDEqTcwtlgo-ot3rF5SmntaoKGwcKPo0NrekWA5gtj0vqKLU6lY2GcnSci_tgBzBwuH40uvyR1PFu02VK_E44mopJ7FOO4cUukNaLGqypU2YCA8QuaaebOIoCMU7RGqGs_41RYNCG1GSdthiwcwk2hHFbi-TXuICXSwh4Er5mgVW9A3t_9Ndp0eJcyr3HtuJrcA7BtlcgruuQxK5h4Ew4ert4KPH_aQGN9ww5VsUtbSManzUDnUOs7aEdvFk1DOOPmLys-aX20ZFN2CcQcZZSO-7HZpZZt3EDeWWE5S02HFDY8gl3_0xqIts8774Tr4GMVJaddG0NR6pcBFC11FqNcK2a18gM3gaKDy3_2ZMeSU4nj4NWwoAhPjQN2BS8JxX4kKVpX4rD959kc93vczVD3TYD6_4GJahGSpBvM7Y5_GGIdLL8imXde1R35mZnEcFYXQ40zcy3DdJFkk_gzGTVOEb1Q1IZpjMxzCxyGgwjgL9dtDIgst5H5CSZoerX_Lz-DmsBvYIYZdpbPLEMROx9MODImaEw8Cp6M8Xj7_foijiGE9hh-pzJSTlKl3HytiSUyJJ7r1BssrX5C_TFWxl0IXNg8azP8H-ZIOWwnYlMWCS1w9piHdoLg5zACiYIN3Txdlsvi61MuPmzJggJd1_dlyMdAlzb5_zdfweqj0_Ko1ODP378YT7sV7LECgRj5QJU6sF5nlf4m2g5sFypBw9GFAkEE-OaWGYxRJOy2ioU41ggAJIkcza2B_N5AL2KLROtm0-c2MxplM4ZzHxrUv9A24zlgzo3Pz4NONwU_gaOcDB7j1dZKXD8UaoIrZv0BTd8JeojYowm9Usdg7Rt4Fpo_vDLJdrEUfbxVlXieDD9Fr1fu72-d4AduT_J3n-rIhyX4gFav-KfP-qOxqOZsmjXZirsBxZs7042NYeirRYnLv35cxIAJARz03FJmeKViUivwC5mCWw64hjRad9XyyBOP2n8KFOrTXhPskC-WwEfksGtfLxi6VW76FHGvRdwHXzMwVfNqe3P5H_WZUc-vxeTAsTnqZz3WA97lM4MLrX0nTZYgXxCEiS6raSOiEMqcx_Nv7Zxre-abj4LZRbFpH8nx1SEiaOV2Dm-a1iPFEmCs0L4kDtt6VImSVIQaTOAd3KFSo7W_XTvRPsQJOtblrcKyuagztX_Yr0lT0YqN9I9MZAARo7M5OfwSLJW16rdmp4NuRefEvNPNHO2cVh1Xha1qNGuF_QDvWFFmWG0Y6IbRqLmF-Dv8BY4TWyOeVnADJftGQw2QSr8RmbCHryA'}}
    except Exception as e:
        print(e)
        continue
