



function hook_init(){
    Java.perform(function(){
        var su_root = Java.use('com.hoge.android.factory.util.system.SystemUtils')
        su_root.checkSuFile.implementation = function(){
            return false
        }
        var kill_update = Java.use('com.hoge.android.factory.util.file.UpDateInfoUtil')
        kill_update.checkUpdate.overload('android.content.Context').implementation =  function(a){
            console.log(7)
        }
        // var so_sig = Java.use('com.hoge.android.jni.Utils')
        // so_sig.signature.implementation = function(a,b) {
        //     var result = this.signature(a,b)
        //     console.log(a,b,result)
        //     return result
        // }

    })
    
}

function sig(){
    Java.perform(function(){
        var so_sig = Java.use('com.hoge.android.jni.Utils')
        console.log(so_sig.$new().signature('4.0.0','1660190400065kY2fYp'))
    })
}



function hook_libm2o_jni(){
    var func_addr =  Module.findExportByName('libm2o_jni.so','sha1_encode') 
    Interceptor.attach(func_addr,{
        onEnter:function(args){
            this.values = args[2]
        },
        onLeave:function(retval){
            console.log('RESULT')
            console.log(hexdump(this.values.readPointer()))
        }
    })
}



