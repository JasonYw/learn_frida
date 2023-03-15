# https://www.geetest.com/demo/click-float.html
# https://github.com/sml2h3/ddddocr

import requests
import time
import json
import execjs
import ddddocr
import cv2

ctx = execjs.compile(open("solve_click.js").read())


def callSolveJs(func, *args):
    print(f'func -> {func}')
    print(f'args -> {args}')
    result = ctx.call(func, *args)
    print(f'result -> {result}')
    return result


def generateClickLocation():
    # "1861_5969,1291_1710"
    det = ddddocr.DdddOcr(det=True, show_ad=False)
    ocr = ddddocr.DdddOcr(ocr=True, show_ad=False)
    ans = ''
    ocr_det = {}
    img = cv2.imread("click.jpg")
    size = img.shape
    w = size[1]
    h = size[0]
    b_img = img[w:h, 0:w]
    t_img = img[0:w, 0:w]
    cv2.imwrite("b_click.jpg", b_img)
    cv2.imwrite("t_click.jpg", t_img)
    b_img_bytes = open("b_click.jpg", 'rb').read()
    t_img_bytes = open("t_click.jpg", 'rb').read()
    # 获取文字顺序
    b_ocr = ocr.classification(b_img_bytes)
    print(b_ocr)
    # #根据det结果圈出文字并识别文字组成字典
    t_poses = det.detection(t_img_bytes)
    print(t_poses)
    count = 0
    for i in t_poses:
        x1, y1, x2, y2 = i
        cv2.imwrite(f"tmp_{count}.jpg", t_img[y1:y2, x1:x2])
        word = ocr.classification(open(f"tmp_{count}.jpg", 'rb').read())
        count += 1
        if word:
            x = int((x1+x2)/2)
            y = int((y1+y2)/2)
            ocr_det[word] = str(int(round(x / 333.375 * 100 * 100, 0))) + "_" + str(int(round(y / 333.375 * 100 * 100, 0)))
            print(word, ocr_det[word])
    count = 0
    if len(b_ocr) <= len(ocr_det):
        for i in ocr_det:
            if i not in b_ocr:
                temp = ocr_det[i]
                count += 1
        if count <= 1:
            for i in b_ocr:
                if ocr_det.get(i):
                    ans += ocr_det[i] + ','
                else:
                    ans += temp + ','
            print(ans[:-1])
            print("==============================")
            return ans[:-1]
        else:
            print("==============================")
            return None
    else:
        print("==============================")
        return None


def startRequest():
    while True:
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
        res = session.get(
            f"https://apiv6.geetest.com/get.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w=&callback=geetest_{t}")
        t = int(str(time.time()).replace(".", "")[:13])
        res = session.get(
            f"https://apiv6.geetest.com/ajax.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w=&callback=geetest_{t}")
        t = int(str(time.time()).replace(".", "")[:13])
        res = session.get(
            f"https://apiv6.geetest.com/get.php?is_next=true&type=click&gt={gt}&challenge={challenge}&lang=zh-cn&https=true&protocol=https%3A%2F%2F&offline=false&product=float&api_server=apiv6.geetest.com&isPC=true&autoReset=true&width=100%25&callback=geetest_{t}")
        info = json.loads(res.text.lstrip(f"geetest_{t}(").rstrip(")"))
        c = info["data"]["c"]
        s = info["data"]["s"]
        pic = info["data"]["pic"]
        res = session.get(f"https://static.geetest.com{pic}")
        open("click.jpg", "wb").write(res.content)
        click_location = generateClickLocation()
        if not click_location:
            continue
        w = callSolveJs("get_w", gt, challenge, click_location, c, s, pic)
        t = int(str(time.time()).replace(".", "")[:13])
        res = session.get(
            f"https://apiv6.geetest.com/ajax.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w={w}&callback=geetest_{t}")
        print(res.text)
        break


if __name__ == "__main__":
    # generateClickLocation()
    startRequest()
