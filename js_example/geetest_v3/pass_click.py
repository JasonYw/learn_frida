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
    #"1861_5969,1291_1710"
    det = ddddocr.DdddOcr(det=True,show_ad=False)
    ocr = ddddocr.DdddOcr(ocr=True,show_ad=False)
    ans = ''
    ocr_det = {}
    img = cv2.imread("click.jpg")
    size = img.shape
    w = size[1] 
    h = size[0] 
    b_img = img[w:h,0:w]
    t_img = img[0:w,0:w]
    size = t_img.shape
    w = size[1] 
    h = size[0] 
    cv2.imwrite("b_click.jpg", b_img)
    cv2.imwrite("t_click.jpg", t_img)
    b_img_bytes= open("b_click.jpg", 'rb').read()
    t_img_bytes= open("t_click.jpg", 'rb').read()
    #获取文字顺序
    b_ocr = ocr.classification(b_img_bytes)
    print(b_ocr)
    #根据det结果圈出文字并识别文字组成字典
    t_poses = det.detection(t_img_bytes)
    for i in t_poses:
        x1,y1,x2,y2 = i
        tmp_img = t_img[y1:y2,x1:x2]
        cv2.imwrite("tmp.jpg",tmp_img)
        world = ocr.classification(open("tmp.jpg", 'rb').read())
        if world:
            ocr_det[world] = f"{str(round(x1/w, 4))[2:]}_{str(round(y1/h, 4))[2:]}"
        else:
            raise "ocr error"
    print(ocr_det)
    for i in b_ocr:
        if ocr_det.get(i):
            ans += ocr_det[i] + ','
    ans = ans[:-1]
    print(ans)
        

        

     


    


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
    click_location = generateClickLocation()
    # w = callSolveJs("get_w",gt,challenge,click_location,c,s,pic)
    # t = int(str(time.time()).replace(".", "")[:13])
    # res = session.get(f"https://apiv6.geetest.com/ajax.php?gt={gt}&challenge={challenge}&lang=zh-cn&pt=0&client_type=web&w={w}&callback=geetest_{t}")
    # print(res.text)

if __name__ == "__main__":
    # generateClickLocation()
    startRequest()
