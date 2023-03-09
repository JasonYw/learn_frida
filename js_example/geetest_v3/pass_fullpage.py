# https://www.geetest.com/demo/fullpage.html
import requests
import time
import json
import execjs
def generateWindowPerformance():
    start_time = int(str(time.time()).replace(".", "")[:13])
    tm = {
        "a": 1678012625623,
        "b": 1678012626005,
        "c": 1678012626005,
        "d": 0,
        "e": 0,
        "f": 1678012625729,
        "g": 1678012625729,
        "h": 1678012625729,
        "i": 1678012625729,
        "j": 1678012625729,
        "k": 0,
        "l": 1678012625762,
        "m": 1678012625999,
        "n": 1678012626001,
        "o": 1678012626007,
        "p": 1678012626146,
        "q": 1678012626146,
        "r": 1678012626147,
        "s": 1678012626150,
        "t": 1678012626150,
        "u": 1678012626150
    }
    new_tm = {}
    for i in tm:
        if tm[i] == 0:
            new_tm[i] = 0
        else:
            new_tm[i] = tm[i] - tm["a"] + start_time
    return new_tm

def callSolveJs(func, *args):
    ctx = execjs.compile(open("solve_fullpage.js").read())
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
    session.get("https://www.geetest.com/demo/fullpage.html")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(f"https://www.geetest.com/demo/gt/register-slide?t={t}").json()
    challenge = res.get("challenge")
    gt = res.get("gt")
    t = int(str(time.time()).replace(".", "")[:13])
    session.get(f"https://apiv6.geetest.com/gettype.php?gt={gt}&callback=geetest_{t}")
    res =session.get(f'https://apiv6.geetest.com/get.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w=')
    info = json.loads(res.text.lstrip(f"geetest_{t}(").rstrip(")")).get("data",{})
    c = info.get("c")
    s = info.get("s")
    passtime = int(str(time.time()).replace(".", "")[:13]) - t
    w = callSolveJs("get_w",c,s,generateWindowPerformance(),passtime,gt,challenge)
    res = session.get(f'https://api.geevisit.com/ajax.php?gt=e52c06c937981b90b275d0aff1d40076&challenge=12e77610e5952ae40b077534272bb02c&lang=zh-cn&pt=0&client_type=web&w={w}&callback=geetest_{int(str(time.time()).replace(".", "")[:13])}')
    print(res.text)

if __name__ == "__main__":
    startRequest()