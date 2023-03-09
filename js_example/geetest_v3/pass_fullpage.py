# https://www.geetest.com/demo/fullpage.html
from pass_slide import generateWindowPerformance
import requests
import time
import json
import execjs

def callSolveJs(func, *args):
    ctx = execjs.compile(open("solve.js").read())
    if args:
        result = ctx.call(func, *args)
    else:
        result = ctx.call(func)
    print(f'func -> {func}')
    if args:
        print(*args)
    print(f'result -> {result}')
    print("=================================")
    return result

def startRequest():
    session = requests.session()
    session.get("https://www.geetest.com/demo/slide-float.html")
    session.get("https://www.geetest.com/demo/libs/gt.js")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(f"https://www.geetest.com/demo/gt/register-slide?t={t}").json()
    challenge = res.get("challenge")
    gt = res.get("gt")
    session.get(f"https://apiv6.geetest.com/gettype.php?gt={gt}&callback=geetest_{t}")
    session.get(f'https://apiv6.geetest.com/get.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w=')
    t = int(str(time.time()).replace(".", "")[:13])
    session.get(f"https://api.geetest.com/ajax.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w=")
    res = session.get(f"https://api.geetest.com/get.php?is_next=true&type=slide3&gt={gt}&challenge={challenge}&lang=zh-cn&https=true&protocol=https%3A%2F%2F&offline=false&product=embed&api_server=api.geetest.com&isPC=true&autoReset=true&width=100%25&callback=geetest_{t}")
    slide_info = json.loads(res.text.lstrip(f"geetest_{t}(").rstrip(")"))
    challenge = slide_info.get("challenge")
    gt = slide_info.get("gt")

