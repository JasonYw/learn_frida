import requests
from parsel import Selector
import execjs
import re

session = requests.Session()


headers = {
    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
    "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8",
    "Referer": "http://www.fangdi.com.cn/new_house/new_house_detail.html",
    "Host": "www.fangdi.com.cn",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36",
}

response = session.get(
    "http://www.fangdi.com.cn/new_house/new_house_detail.html",
    headers=headers,
    verify=False,
)
print(response.status_code, session.cookies)
ts_js_url = Selector(response.text).xpath("//script/@src").getall()[0]
content = Selector(response.text).xpath("//meta/@content").getall()[1]
html_js = Selector(response.text).xpath("//script/text()").getall()[0]
ts_js = session.get(
    "http://www.fangdi.com.cn" + ts_js_url,
    headers=headers,
    verify=False,
).text

env_js = open("env.js").read().replace("var content;", f'var content = "{content}"')

js_raw = f"""
{env_js}
{ts_js}
{html_js}
"""

open("example.js", "w", encoding="utf-8").write(js_raw)


js_ = execjs.compile(js_raw)
cookie_d = js_.call("getCookie").split(";")[0].split("=")
cookies = session.cookies.get_dict()
print(cookies)
cookies.update({cookie_d[0]: cookie_d[1]})
print(cookies)
headers = {
    "Accept": "*/*",
    "Accept-Language": "zh-CN,zh;q=0.9",
    "Referer": "http://www.fangdi.com.cn/",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36",
    "Host": "www.fangdi.com.cn",
}
response = session.get(
    "http://www.fangdi.com.cn/new_house/new_house_detail.html",
    headers=headers,
    cookies=cookies,
    verify=False,
)
print(response.status_code)
