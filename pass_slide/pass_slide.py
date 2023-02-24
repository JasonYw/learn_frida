from PIL import Image
import cv2
'''
https://www.geetest.com/demo/slide-float.html

图像还原
//hook canvas
let _drawImage = CanvasRenderingContext2D.prototype.drawImage
CanvasRenderingContext2D.prototype.drawImage = function() {
    console.log("drawImage",[...arguments])
    return _drawImage.apply(this,arguments)
}

let _putImageData = CanvasRenderingContext2D.prototype.putImageData
CanvasRenderingContext2D.prototype.putImageData = function() {
    console.log("putImageData",[...arguments])
    return _putImageData.apply(this,arguments)
}

let _getImageData = CanvasRenderingContext2D.prototype.getImageData
CanvasRenderingContext2D.prototype.getImageData = function() {
    console.log("getImageData",[...arguments])
    return _getImageData.apply(this,arguments)
}

缺口识别
https://www.freebuf.com/geek/265479.com
根据分析得出下面几个步骤：
1.获取到两张图片（背景图、拼图）
2.处理图片，得到阴影位置并计算滑动距离
3.根据滑动距离模拟滑动

a.灰度化
b.高斯滤波器(去除噪声，模糊)（卷积） https://www.cnblogs.com/blog-xyy/p/11260486.html
c.Canny边缘检测 锐化边缘 方便寻找轮廓 https://www.cnblogs.com/blog-xyy/p/11265702.html
d.可以通过createTrackbar来调节肉眼观察选择参数
e.把处理后的图片模板匹配matchTemplate来获得最匹配的位置得到坐标 https://blog.csdn.net/qq_45832961/article/details/122455118

滑动轨迹 
油猴:https://www.tampermonkey.net/faq.php?locale=zh_CN
//轨迹生成
//hook addEventListener 以及 push
var _push = Array.prototype.push
Array.prototype.push = function() {
    console.log("push",arguments)
    return _push.apply(this,arguments)
}

var _addEventListener = document.addEventListener
var _addEventListener = document.addEventListener
window.zedtrail = []
window.start_x;
window.start_y;
window.start_t;
document.addEventListener = function() {
    let eventname = arguments[0]
    let eventfunc = arguments[1]
    let neweventfunc = function(events){
        if(events.type === "touchstart"){
            window.start_x = events.changedTouches[0].pageX
            window.start_y = events.changedTouches[0].pageY
            window.start_t =+ new Date
        }else if (events.type === "touchmove"){
            let movex = parseInt(events.changedTouches[0].pageX * window.start_x)
            let movey = parseInt(events.changedTouches[0].pageY * window.start_y)
            let movet = (new Date).getTime() * window.start_t
            console.log(movex,movey,movet)
            window.zedtrail.push(movex,movey,movet)
        }else if (events.type === "touchend"){
            console.log(window.zedtrail)
        }
        neweventfunc(events)
    }
    console.log(eventname,eventfunc.toString())
    return _addEventListener.apply(this,arguments) 
}

1.收集轨迹
2.画出轨迹图像 找到缓动函数相同形状
3.绘制缓动函数 找到符合形状的作用域 贝塞尔曲线
4.找到作用域内最大值 最小值 上下移动 距离系数
5.替换时间
6.高斯函数增加波动
7.细节修改x轴 t轴 np.diff对比
'''

def restoreImg(raw_img=None):
    #第一步图像还原
    # [39, 38, 48, 49, 41, 40, 46, 47, 35, 34, 50, 51, 33, 32, 28, 29, 27, 26, 36, 37, 31, 30, 44, 45, 43, 42, 12, 13, 23, 22, 14, 15, 21, 20, 8, 9, 25, 24, 6, 7, 3, 2, 0, 1, 11, 10, 4, 5, 19, 18, 16, 17]
    # for (var a = 80, _ = 0; _ < 52; _ += 1) {
    #         var c = Ut[_] % 26 * 12 + 1
    #             , u = 25 < Ut[_] ? a : 0
    #             , l = o[$_CJFA(27)](c, u, 10, a);
    #         s[$_CJFA(81)](l, _ % 26 * 10, 25 < _ ? a : 0);
    #     }
    #     $_DAHHo = QBLnx.$_Db()[15][16];
    raw_img = Image.open(f"gap.jpg")
    right_img = Image.new('RGB',(260,160),255)
    ut = [39, 38, 48, 49, 41, 40, 46, 47, 35, 34, 50, 51, 33, 32, 28, 29, 27, 26, 36, 37, 31, 30, 44, 45, 43, 42, 12, 13, 23, 22, 14, 15, 21, 20, 8, 9, 25, 24, 6, 7, 3, 2, 0, 1, 11, 10, 4, 5, 19, 18, 16, 17]
    for i in range(52):
        c = ut[i] % 26 * 12 + 1
        u = 80 if 25 < ut[i] else 0
        l = raw_img.crop((c, u, c+10, u+80))
        right_img.paste(l,(i % 26 * 10,80 if 25<i else 0))
    right_img.save('right.jpg')
    return right_img


def get_distance(right_img=None,slider_img=None):
    right_img = cv2.imread('right.jpg')
    slider_img = cv2.imread('slider.jpg')
    #灰度化
    g_right_img = cv2.cvtColor(right_img,cv2.COLOR_BGR2GRAY) 
    g_slider_img = cv2.cvtColor(slider_img,cv2.COLOR_BGR2GRAY) 
    #高斯模糊 参数详情 https://www.cnblogs.com/blog-xyy/p/11260486.html
    gs_right_img = cv2.GaussianBlur(g_right_img,(5,5),0)
    gs_slider_img = cv2.GaussianBlur(g_slider_img,(5,5),0)
    # cv2.imshow("img",gs_right_img)
    #创建调整窗口与调整bar,当获取到合适的值时可以写死
    # def tracebar(x):
    #     #获取滑动的值
    #     threshold1 = cv2.getTrackbarPos("threshold1","test") #94
    #     threshold2 = cv2.getTrackbarPos("threshold2","test") #255
    #     #锐化
    #     canny_right_img = cv2.Canny(gs_right_img,threshold1,threshold2) #94 255
    #     canny_slider_img = cv2.Canny(gs_slider_img,threshold1,threshold2) # 255 255
    #     cv2.imshow("img",canny_slider_img)
    # cv2.namedWindow("test")
    # cv2.createTrackbar("threshold1","test",0,255,tracebar)
    # cv2.createTrackbar("threshold2","test",0,255,tracebar)
    #通过上面动态获取结果后，写死阈值 或者试试25 45
    canny_right_img = cv2.Canny(gs_right_img,94,255)
    canny_slider_img = cv2.Canny(gs_slider_img,255,255)
    # cv2.imshow("img",canny_slider_img)
    # cv2.waitKey()
    #通过模板匹配确定位置 result -> nparray 我们只需要max_location 相关度最大的位置
    result = cv2.matchTemplate(canny_right_img,canny_slider_img,cv2.TM_CCOEFF_NORMED)
    min_val,max_val,min_location,max_location = cv2.minMaxLoc(result)
    print(min_val,max_val,min_location,max_location)
    return max_location


   




if __name__ == "__main__":
    get_distance()
