import frida
import time
f = open('catch.js','r').read()

def attach():
    #单进程可以使用名字，双进程app使用pid，可以设置超时时间
    device = frida.get_usb_device(timeout=10).attach("抖音")
    # device = frida.get_usb_device().attach(pid)
    script = device.create_script(f)
    script.load()
    input()
    

def spwan():
    device = frida.get_usb_device()
    #以挂起的方式创建进程,获取进程的pid
    pid =  device.spawn(["包名"])
    #直接附加pid
    process = device.attach(pid)
    #加载脚本
    script = process.create_script(f)
    script.load()
    #恢复进程
    device.resume(pid)
    input()



def muilty_remote():
    #frida链接多个设备
    process0 = frida.get_device_manager().add_remote_device('ip:port').attach('进程名')
    process1 = frida.get_device_manager().add_remote_device('ip:port').attach('进程名')
    #上述进程可以加载不同的脚本也可以加载同一个脚本
    script0 = process0.create_script(f)
    script1 = process1.create_script(f)
    script0.load()
    script1.load()
    input(1)


def rec_js_send():
    
    def recive_message(message,data):
        if message.get('type') == 'send':
            print(message.get('payload'))
        else:
            print(message)


    #接收js使用send发送出来的数据
    #使用send要在python中注册事件，使用script.on('message',func)
    device = frida.get_usb_device()
    pid =  device.spawn(["包名"])
    process = device.attach(pid)
    script = process.create_script(f)
    script.load()
    #注册事件     
    script.on('message',recive_message)
    device.resume(pid)
    input()


def post_to_js():
    
    def post_message(message,data):
        if message.get('type') == 'send':
            #将处理好的数据.发送给js,js那边recv处理
            script.post({'data':'python data'})
        else:
            print(message)

    device = frida.get_usb_device()
    pid =  device.spawn(["包名"])
    process = device.attach(pid)
    script = process.create_script(f)
    script.load()
    #注册事件     
    script.on('message',post_message)
    device.resume(pid)
    input()


    '''
        # recv().wait() 是一个函数 阻塞等待python传的数据 recv函数里接收一个函数处理python传回的数据

        js
        recv(function(obj){
            console.log(obj.data)
        }).wait()
    '''


def rpc_():
    '''
        js
        function test(data){
            var result = null
            java.perform(function(){
                console.log(data)
                result = 1
            })
            return result
        }
        rpc.exports = {
            #最好纯小写
            rpcfunc0:test
        }
    '''
    device = frida.get_usb_device()
    pid =  device.spawn(["包名"])
    process = device.attach(pid)
    script = process.create_script(f)
    script.load()
    device.resume(pid)
    #通过rpc调
    res = script.exports.rpcfunc0('aaaa')
    print(res)
    input()


#fiddler script
#和mitmproxy有点相似



#unidbg介绍
#unicorn好比是一个cpu，可以模拟各种指令
#提供了很多编程语言接口，可以操作内存，寄存器等
#unicorn并不是系统
#基于unicorn开发的框架
#unidbg java开发的
#cemu 学习汇编用的
#AndroidNativeEmu Python开发的

#unidbg
#支持模拟jni调用
#支持系统调用指令
#支持arm32和arm64
#支持android ios
#目的模拟运行so 
#项目地址 https://github.com/zhkl0228/unidbg




