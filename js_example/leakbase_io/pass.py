import sys
import os


sys.path.append(os.getcwd())
sys.dont_write_bytecode = True
import requests
import execjs
import time
import re
from utils import Proxy

session = requests.Session()
address = "http://proxy.lfk.qianxin-inc.cn:3128"
address = Proxy.getTunnelStr()
proxies = {"http": address, "https": address}

headers = {
    "Referer": "https://leakbase.io/",
    "Host": "leakbase.io",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36",
}


res = session.get("https://leakbase.io/", headers=headers, proxies=proxies)

print(res.headers)


code = re.findall(r"a\[.+?\]\=(.+)?\;", res.text)
js_code = "function getA(){" + "return " + code[0] + "}"
execjs.compile(js_code).call("getA")
blazing_answer = execjs.compile(js_code).call("getA")
print(blazing_answer)

res = session.get(
    "https://leakbase.io/bf.jquery.max.js", headers=headers, proxies=proxies
)
print(res.headers)

res = session.get(
    f"https://leakbase.io/blzgfst-shark/?bfu=/&blazing_answer={blazing_answer}",
    headers=headers,
    allow_redirects=True,
    proxies=proxies,
)
print(res.headers)
print(session.cookies.get_dict())
print(res.status_code)
print(res.text)


requests.get()
