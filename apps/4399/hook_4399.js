//com.m4399.gamecenter

function showStacks() {
    Java.perform(function(){
        console.log(
            Java.use('android.util.Log').getStackTraceString(
                Java.use('java.lang.Throwable').$new()
            )
        )
    })
}



function hook_toast(){
    Java.perform(function(){
        var toast = Java.use('android.widget.Toast')
        toast.show.implementation = function(){
            console.log(4)
            showStacks()
            return this.show()
        }
    })
}



function hook_login(){
    Java.perform(function(){
        var buildparam = Java.use('com.m4399.gamecenter.plugin.main.providers.be.al')
        buildparam.setPassword.implementation = function(a){
            console.log(a)
            return this.setPassword(a)
        }
        Java.choose('com.m4399.gamecenter.plugin.main.providers.be.al',{
            onMatch:function(instance){
                console.log(instance.dsf.value)
            },
            onComplete:function(){

            }
        })
            
        
    })
}



function print_trace(obj){
    //FUZZY 是模糊的 但是对所有的so都有效，但是不准确
    //ACCURATE 是准确的 但是并不是对所有so都有效
    console.log(Thread.backtrace(obj.context,Backtracer.FUZZY).map(DebugSymbol.fromAddress).join('\n')+'\n')
}


function hook_jni_byenumerate(){
    //jni函数在func中可以通过枚举符号表
    var symbols = Process.getModuleByName('libart.so').enumerateSymbols()
    var newStringUtfaddr = null
    for (var i =0;i<symbols.length;i++){
        if(symbols[i].name.indexOf("CheckJNI") == -1 && symbols[i].name.indexOf("NewStringUTF") != -1){
            newStringUtfaddr  = symbols[i].address
        }
    }
    Interceptor.attach(newStringUtfaddr,{
        onEnter: function(args){
            //args[0]为jnienv
            print_trace(this) //打印so堆栈信息
            console.log(args[1].readCString())
        },
        onLeave:function(retval){}

    })

}


function hook_46c0(){
    var soaddr = Module.findBaseAddress("libNativeHelper.so")
    var libso = Process.getModuleByName("libNativeHelper.so")
    var sub46c0 = soaddr.add(0x46C0)
    Memory.protect(ptr(libso.base),libso.size,"rwx")
    console.log(sub46c0)
    Interceptor.attach(sub46c0,{
        onEnter:function(args){
            console.log('===============================')
            // console.log(hexdump(args[0]))
            // console.log(hexdump(args[1]))
            // console.log(ptr(args[2]))
            console.log(hexdump(args[3]))
            // console.log(hexdump(args[4]))
            // console.log(ptr(args[4].readPointer()))
            // console.log(args[4].readCString())
        },
        onLeave:function(retval){
            // console.log(retval)
        }
    })
}

function hook_2454(){
    var soaddr = Module.findBaseAddress("libNativeHelper.so")
    // var libso = Process.getModuleByName("libNativeHelper.so")
    var sub2454 = soaddr.add(0x2454)
    // Memory.protect(ptr(libso.base),libso.size,"rwx")
    // console.log(sub2454)
    Interceptor.attach(sub2454,{
        onEnter:function(args){
            console.log('===============================')
            console.log(hexdump(args[0]))
            console.log(hexdump(args[1]))
            // console.log(hexdump(args[2]))
        },
        onLeave:function(retval){
            console.log(hexdump(retval))
        }
    })
}



function hook_22BC(){
    var soaddr = Module.findBaseAddress("libNativeHelper.so")
    // var libso = Process.getModuleByName("libNativeHelper.so")
    var sub22BC = soaddr.add(0x22BC)
    Interceptor.attach(sub22BC,{
        onEnter:function(args){
            console.log('===============================')
            console.log(hexdump(args[0]))
            console.log(hexdump(args[1]))
        },
        onLeave:function(retval){
            // console.log(hexdump(retval))
        }
    })
}

//efcdab9078563412 efcdab9078563412

hook_22BC()