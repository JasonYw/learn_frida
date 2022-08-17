from appium import webdriver
from random import uniform,randint
import time
from douyin.scrapy import attach
from multiprocessing import Process

DRIVER =None
ELEMENTLIST = ['com.ss.android.ugc.aweme:id/c41','com.android.packageinstaller:id/permission_deny_button','com.android.packageinstaller:id/permission_deny_button','com.ss.android.ugc.aweme:id/ik3']

def connect():
    global DRIVER
    device_config= {
        "platformName": "Android",
        "appium:deviceName": "Pixel_2",
        "appium:platformVersion": "8.1",
        "appium:appPackage": "com.ss.android.ugc.aweme",
        "appium:appActivity": "com.ss.android.ugc.aweme.main.MainActivity"
    }
    DRIVER = webdriver.Remote('http://127.0.0.1:4723/wd/hub',device_config)
    

def get_size():
    x = DRIVER.get_window_size()['width']
    y = DRIVER.get_window_size()['height']
    return x,y


def pass_ask():
    print('pass_ask')
    global ELEMENTLIST
    if ELEMENTLIST:
        for i in ELEMENTLIST:
            try:
                DRIVER.find_element(value=i).click()
                ELEMENTLIST.remove(i)
            except:
                pass




def wait_for_elementid_click(elementid):
    for i in range(5):
        try:
            DRIVER.find_element(value=elementid).click()
            break
        except:
            time.sleep(2)
            continue
    

def random_scrool():
    # size = get_size()
    # x1 = size[0]*uniform(0.4,0.6)
    # x2 = size[0]*uniform(0.4,0.6)
    # y1 = size[1]*uniform(0.6,0.8)
    # y2 = size[1]*uniform(0.3,0.4)
    # print(size,x1,x2,y1,y2)
    # duration = randint(1000,1500)
    print('swipe')
    DRIVER.swipe(100,1500,100,200)
    time.sleep(2)


if __name__ == "__main__":
    connect()
    while True:
        if ELEMENTLIST:
            pass_ask()
        random_scrool()




