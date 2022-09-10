from appium import webdriver
import time
from multiprocessing import Process
import frida
import requests
import json
import logging
logging.basicConfig(level=logging.INFO,format="[%(asctime)s %(funcName)s]-%(levelname)s : %(message)s",filename='result.log')





class Control():

    def __init__(self):
        self.driver =None
        self.elementlist = ['com.ss.android.ugc.aweme:id/c41','com.android.packageinstaller:id/permission_deny_button','com.android.packageinstaller:id/permission_deny_button','com.ss.android.ugc.aweme:id/ik3']
        self.connect()        

    def connect(self):
        device_config= {
            "platformName": "Android",
            "appium:deviceName": "Pixel_2",
            "appium:platformVersion": "8.1",
            "appium:appPackage": "com.ss.android.ugc.aweme",
            "appium:appActivity": "com.ss.android.ugc.aweme.main.MainActivity"
        }
        self.driver = webdriver.Remote('http://127.0.0.1:4723/wd/hub',device_config)
        

    def get_size(self):
        x = self.driver.get_window_size()['width']
        y = self.driver.get_window_size()['height']
        return x,y


    def pass_ask(self):
        print('pass_ask')
        if self.elementlist:
            for i in self.elementlist:
                try:
                    self.driver.find_element(value=i).click()
                    self.elementlist.remove(i)
                except:
                    pass

    def wait_for_elementid_click(self,elementid):
        for i in range(5):
            try:
                self.driver.find_element(value=elementid).click()
                break
            except:
                time.sleep(2)
                continue
        

    def next_video(self):
        print('swipe')
        self.driver.swipe(100,1500,100,200)
        time.sleep(2)





class Spider():


    jsscript = '''
function hook_RecyclerView(){
    Java.perform(function(){
        var panelC =Java.use("com.ss.android.ugc.aweme.feed.panel.c")
        panelC.LIZ.overload("com.ss.android.ugc.aweme.feed.model.Aweme",'boolean').implementation = function(aweme,int0){
            var result = this.LIZ(aweme,int0)
            send(aweme.toString())
            return result
        }
    })
}
hook_RecyclerView()
    
    '''

    def __init__(self) -> None:
        self.scrapy_result = open('result.log','a',encoding='utf-8')
        self.attach()


    def recive(self,message,data):
        # logging.info(message['payload'].strip('Aweme'))
        self.scrapy_result.write(message['payload']+'\n')

        
            

    def attach(self):
        device = frida.get_usb_device()
        time.sleep(1)
        session = device.attach("抖音")
        script = session.create_script(Spider.jsscript)
        script.on("message",self.recive)
        script.load()
        input()


    

def main():
    #主进程开始控制手机
    Controler = Control()
    #子进程为监听抓取，并设置为守护进程
    SpiderProcess = Process(target=Spider)
    SpiderProcess.daemon = True
    SpiderProcess.start()
    #主进程开始控制手机
    while True:
        Controler.pass_ask()
        Controler.next_video()


if __name__ == "__main__":
    Spider()
    


    


    



    
