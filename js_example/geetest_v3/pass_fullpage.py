# https://www.geetest.com/demo/fullpage.html
import requests
import time
import json
import execjs

ctx = execjs.compile(open("solve_fullpage.js").read())


def generateTrail():
    start = int(str(time.time()).replace(".", "")[:13])
    min = 1678365170924
    BDEK = [
        [
            "move",
            705,
            160,
            1678365170924,
            "pointermove"
        ],
        [
            "move",
            722,
            180,
            1678365170939,
            "pointermove"
        ],
        [
            "move",
            730,
            191,
            1678365170950,
            "pointermove"
        ],
        [
            "move",
            737,
            203,
            1678365170952,
            "pointermove"
        ],
        [
            "move",
            743,
            214,
            1678365170961,
            "pointermove"
        ],
        [
            "move",
            749,
            225,
            1678365170968,
            "pointermove"
        ],
        [
            "move",
            754,
            237,
            1678365170976,
            "pointermove"
        ],
        [
            "move",
            758,
            250,
            1678365170984,
            "pointermove"
        ],
        [
            "move",
            763,
            262,
            1678365170992,
            "pointermove"
        ],
        [
            "move",
            768,
            275,
            1678365171001,
            "pointermove"
        ],
        [
            "move",
            767,
            275,
            1678365171177,
            "pointermove"
        ],
        [
            "move",
            763,
            277,
            1678365171185,
            "pointermove"
        ],
        [
            "move",
            760,
            278,
            1678365171193,
            "pointermove"
        ],
        [
            "move",
            760,
            278,
            1678365171202,
            "pointermove"
        ],
        [
            "move",
            756,
            280,
            1678365171209,
            "pointermove"
        ],
        [
            "move",
            752,
            282,
            1678365171218,
            "pointermove"
        ],
        [
            "move",
            742,
            287,
            1678365171225,
            "pointermove"
        ],
        [
            "move",
            731,
            291,
            1678365171233,
            "pointermove"
        ],
        [
            "move",
            719,
            295,
            1678365171241,
            "pointermove"
        ],
        [
            "move",
            714,
            297,
            1678365171252,
            "pointermove"
        ],
        [
            "move",
            703,
            300,
            1678365171257,
            "pointermove"
        ],
        [
            "move",
            694,
            302,
            1678365171265,
            "pointermove"
        ],
        [
            "move",
            684,
            304,
            1678365171273,
            "pointermove"
        ],
        [
            "move",
            676,
            305,
            1678365171281,
            "pointermove"
        ],
        [
            "move",
            669,
            305,
            1678365171289,
            "pointermove"
        ],
        [
            "move",
            667,
            306,
            1678365171297,
            "pointermove"
        ],
        [
            "move",
            662,
            306,
            1678365171305,
            "pointermove"
        ],
        [
            "move",
            659,
            306,
            1678365171314,
            "pointermove"
        ],
        [
            "move",
            656,
            306,
            1678365171321,
            "pointermove"
        ],
        [
            "move",
            654,
            306,
            1678365171330,
            "pointermove"
        ],
        [
            "move",
            653,
            306,
            1678365171337,
            "pointermove"
        ],
        [
            "move",
            653,
            306,
            1678365171347,
            "pointermove"
        ],
        [
            "move",
            652,
            306,
            1678365171353,
            "pointermove"
        ],
        [
            "move",
            652,
            306,
            1678365171364,
            "pointermove"
        ],
        [
            "move",
            652,
            306,
            1678365171385,
            "pointermove"
        ],
        [
            "move",
            652,
            307,
            1678365171397,
            "pointermove"
        ],
        [
            "move",
            651,
            307,
            1678365171401,
            "pointermove"
        ],
        [
            "move",
            651,
            308,
            1678365171409,
            "pointermove"
        ],
        [
            "move",
            650,
            309,
            1678365171417,
            "pointermove"
        ],
        [
            "move",
            649,
            310,
            1678365171425,
            "pointermove"
        ],
        [
            "move",
            648,
            311,
            1678365171433,
            "pointermove"
        ],
        [
            "move",
            647,
            312,
            1678365171441,
            "pointermove"
        ],
        [
            "move",
            646,
            313,
            1678365171449,
            "pointermove"
        ],
        [
            "move",
            644,
            314,
            1678365171458,
            "pointermove"
        ],
        [
            "move",
            643,
            315,
            1678365171465,
            "pointermove"
        ],
        [
            "move",
            642,
            315,
            1678365171473,
            "pointermove"
        ],
        [
            "move",
            641,
            316,
            1678365171481,
            "pointermove"
        ],
        [
            "move",
            640,
            316,
            1678365171489,
            "pointermove"
        ],
        [
            "move",
            639,
            316,
            1678365171497,
            "pointermove"
        ],
        [
            "move",
            639,
            317,
            1678365171505,
            "pointermove"
        ],
        [
            "move",
            639,
            317,
            1678365171515,
            "pointermove"
        ],
        [
            "move",
            638,
            317,
            1678365171521,
            "pointermove"
        ],
        [
            "move",
            638,
            317,
            1678365171532,
            "pointermove"
        ],
        [
            "move",
            638,
            317,
            1678365171537,
            "pointermove"
        ],
        [
            "down",
            638,
            317,
            1678365171566,
            "pointerdown"
        ],
        [
            "up",
            638,
            317,
            1678365171664,
            "pointerup"
        ]
    ]
    for i in BDEK:
        i[3] = i[3] - min + start
    return BDEK
    


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
    print(f'func -> {func}')
    print(f'args -> {args}')
    result = ctx.call(func, *args) 
    print(f'result -> {result}')
    return result


def startRequest():
    session = requests.session()
    session.get("https://www.geetest.com/demo/fullpage.html")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(
        f"https://www.geetest.com/demo/gt/register-fullpage?t={t}").json()
    challenge = res.get("challenge")
    gt = res.get("gt")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(
        f"https://apiv6.geetest.com/gettype.php?gt={gt}&callback=geetest_{t}")
    print(res.text)
    w0 = callSolveJs("get_w0",gt,challenge)
    key_ = w0[1]
    res = session.get(
        f'https://apiv6.geetest.com/get.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w={w0[0]}')
    info = json.loads(res.text[1:-1])['data']
    c = info.get("c")
    s = info.get("s")
    w = callSolveJs("get_w", key_,c, s, gt, challenge,generateWindowPerformance(),generateTrail())
    res = session.get(
        f'https://api.geevisit.com/ajax.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w={w}&callback=geetest_{int(str(time.time()).replace(".", "")[:13])}')
    print(res.text)
    


if __name__ == "__main__":
    # generateTrail()
    startRequest()
