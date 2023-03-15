# https://www.geetest.com/demo/click-float.html
# https://github.com/sml2h3/ddddocr

import requests
import time
import json
import execjs
import ddddocr
ctx = execjs.compile(open("solve_click.js").read())
import cv2

def callSolveJs(func, *args):
    print(f'func -> {func}')
    print(f'args -> {args}')
    result = ctx.call(func, *args) 
    print(f'result -> {result}')
    return result

def generateClickLocation():
    det = ddddocr.DdddOcr(det=True)
    with open("click.jpg", 'rb') as f:
        image = f.read()
    poses = det.detection(image)
    n = int(len(poses)/2)
    ans = []
    im = cv2.imread("click.jpg")
    size = im.shape
    w = size[1] #宽度
    h = size[0] #高度
    print(w,h)
    for box in poses:
        x1, y1, x2, y2 = box
        print(x1, y1, x2, y2)
        im = cv2.rectangle(im, (x1, y1), (x2, y2), color=(0, 0, 255), thickness=2)
    cv2.imwrite("click_result.jpg", im)
    


def startRequest():
    session = requests.session()
    session.get("https://www.geetest.com/demo/click-float.html")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(
        f"https://www.geetest.com/demo/gt/register-click?t={t}").json()
    challenge = res.get("challenge")
    gt = res.get("gt")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(
        f"https://apiv6.geetest.com/gettype.php?gt={gt}&callback=geetest_{t}")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(f"https://apiv6.geetest.com/get.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w=&callback=geetest_{t}")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(f"https://apiv6.geetest.com/ajax.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w=&callback=geetest_{t}")
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(f"https://apiv6.geetest.com/get.php?is_next=true&type=click&gt={gt}&challenge={challenge}&lang=zh-cn&https=true&protocol=https%3A%2F%2F&offline=false&product=float&api_server=apiv6.geetest.com&isPC=true&autoReset=true&width=100%25&callback=geetest_{t}")
    info = json.loads(res.text.lstrip(f"geetest_{t}(").rstrip(")"))
    c = info["data"]["c"]
    s = info["data"]["s"]
    pic = info["data"]["pic"]
    res = session.get(f"https://static.geetest.com{pic}")
    open("click.jpg","wb").write(res.content)
    print(info)

if __name__ == "__main__":
    generateClickLocation()
    # startRequest()
