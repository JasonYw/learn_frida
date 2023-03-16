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
    start_time = int(str(time.time()).replace(".", "")[:13])
    det = ddddocr.DdddOcr(det=True, show_ad=False)
    ocr = ddddocr.DdddOcr(ocr=True, show_ad=False)
    ans = ''
    count = 0
    ocr_det = {}
    img = cv2.imread("click.jpg")
    size = img.shape
    w = size[1]
    h = size[0]
    print("w:",w,",h:",h)
    b_img = img[w:h, 0:w]
    t_img = img[0:w, 0:w]
    # 获取文字顺序
    b_ocr = ocr.classification(cv2.imencode('.jpg', b_img)[1].tobytes())
    print(b_ocr)
    # #根据det结果圈出文字并识别文字组成字典
    t_poses = det.detection(cv2.imencode('.jpg', t_img)[1].tobytes())
    for i in t_poses:
        x1, y1, x2, y2 = i
        word = ocr.classification(cv2.imencode(
            '.jpg', t_img[y1:y2, x1:x2])[1].tobytes())
        if word:
            ocr_det[word] = i
    if len(b_ocr) <= len(ocr_det):
        for i in ocr_det:
            if i not in b_ocr:
                temp = ocr_det[i]
                count += 1
        if count <= 1:
            count = 1
            for i in b_ocr:
                if ocr_det.get(i):
                    x1, y1, x2, y2 = ocr_det[i]
                else:
                    x1, y1, x2, y2 = temp
                x = int((x1+x2)/2)
                y = int((y1+y2)/2)
                # "1861_5969,1291_1710"
                word_ans = str(int(round(x / 333.3828125 * 100 * 100, 0))) + \
                    "_" + str(int(round(y / 333.3828125 * 100 * 100, 0)))
                ans = ans + word_ans + ','
                img = cv2.rectangle(img, (x1, y1), (x2, y2),
                                    color=(0, 0, 255), thickness=2)
                img = cv2.putText(img, str(count), (x, y),
                                  cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 255, 255), 2)
                print(i, x1, y1, x2, y2, word_ans)
                count += 1
            cv2.imwrite("click.jpg", img)
            print(ans[:-1])
    print("==============================")
    passtime = int(str(time.time()).replace(".", "")[:13]) - start_time
    return ans[:-1],passtime


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
    click_location,passtime = generateClickLocation()
    if passtime < 1000:
        passtime += 1000
        time.sleep(1)
    if not click_location:
        while True:
            t = int(str(time.time()).replace(".", "")[:13])
            res = session.get(f'https://apiv6.geetest.com/refresh.php?gt={gt}&challenge={challenge}&lang=zh-cn&type=click&callback=geetest_{t}')
            pic_info = json.loads(res.text.lstrip(f"geetest_{t}(").rstrip(")"))
            pic = pic_info["data"]["pic"]
            res = session.get(f"https://static.geetest.com{pic}")
            open("click.jpg", "wb").write(res.content)
            click_location,passtime = generateClickLocation()
            if passtime < 1000:
                passtime += 1000
                time.sleep(1)
            if click_location:
                break
    w = callSolveJs("get_w", gt, challenge, click_location, c, s, pic,passtime)
    t = int(str(time.time()).replace(".", "")[:13])
    res = session.get(
        f"https://apiv6.geetest.com/ajax.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w={w}&callback=geetest_{t}")
    print(res.text)


if __name__ == "__main__":
    # generateClickLocation()
    startRequest()
