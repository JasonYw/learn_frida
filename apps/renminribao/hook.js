
function showStacks() {
    Java.perform(function () {
        console.log(
            Java.use('android.util.Log').getStackTraceString(
                Java.use('java.lang.Throwable').$new()
            )
        )
    })
}


function hook_hashmap(){
    Java.perform(function(){
        var HashMap = Java.use("java.util.HashMap")
        HashMap.put.implementation = function(a,b) {
            console.log(
                Java.use('android.util.Log').getStackTraceString(
                    Java.use('java.lang.Throwable').$new()
                )
            )
            var result =  this.put(a,b)
            return result
        }

    })
}

function hook_exit(){

    Java.perform(function () {
        var Sys = Java.use("java.lang.System");
        var Random = Java.use("java.util.Random")
        Sys.exit.overload("int").implementation = function(var_0) {
            console.log('exit hooked',var_0)
        }
        // Sys.currentTimeMillis.implementation = function(){
        //     var result = this.currentTimeMillis()
        //     console.log('currentTimeMillis hooked => ',result)
        //     return result
        // }
        // Random.nextInt.overload('int').implementation = function(args){
        //     var result = this.nextInt(args)
        //     console.log('nextInt hooked !','args => ',args,'result => ',result)
        //     return result
        // }
        

    })

}


function print_arg(addr){
    var module = Process.findRangeByAddress(addr)
    if(module != null) return hexdump(addr) + "\n"
    return ptr(addr) + "\n"
}


function hook_toast() {
    Java.perform(function () {
        var toast = Java.use("android.widget.Toast")
        toast.show.implementation = function () {
            console.log(4)
            console.log(
                Java.use('android.util.Log').getStackTraceString(
                    Java.use('java.lang.Throwable').$new()
                )
            )
            return this.show()
        }
    })
}

//com.peopledaily.common.manager.toast.factory.SystemToast.show
function hook_SystemToast() {
    Java.perform(function () {
        var toast = Java.use("com.peopledaily.common.manager.toast.factory.SystemToast")
        toast.show.implementation = function () {
            console.log(4)
            console.log(
                Java.use('android.util.Log').getStackTraceString(
                    Java.use('java.lang.Throwable').$new()
                )
            )
            return this.show()
        }
    })
}


//com.peopledailychina.activity.application.NewsApplication.checkRoot
function hook_checkroot() {
    Java.perform(function () {
        Java.enumerateClassLoaders({
            onMatch: function (loader) {
                try {
                    Java.classFactory.loader = loader
                    console.log('loader', loader)
                    var NewsApplication = Java.classFactory.use('com.peopledailychina.activity.application.NewsApplication')
                    NewsApplication.checkRoot.implementation = function () {
                        console.log('hooked checkRoot')
                        // var result = this.checkRoot()
                        // console.log(result)
                        // return result
                    }
                } catch (e) {
                    console.log("wrong loader", loader)
                }
            },
            onComplete: function () { }
        })
    })
}


function hook_dexclassloaderload(){
    Java.perform(function(){
        var DexClassLoader = Java.use("java.lang.BootClassLoader")
        var Hook_class
        DexClassLoader.loadClass.overload('java.lang.String','boolean').implementation = function(name,arg){
            var result = this.loadClass(name,arg)
            console.log(name)
            // com.peopledailychina.activity.application.PeopleDailyApplication
            // var hookname = "com.peopledailychina.activity.application.NewsApplication";
            // var result = this.loadClass(name,false);
            // if(name === "com.peopledailychina.activity.application.PeopleDailyApplication"){
            //     var NewsApplication = Java.use(hookname)
            //     NewsApplication.checkRoot.implementation = function () {
            //         console.log('hooked checkRoot!!!')
            //     }
            // }
            return result;
        }
    })
}


function AesEncryptionHelper_createKey(){
    var funcaddr = Module.findExportByName("libcom.peopledailychina.activity_alijtca_plus.so","Java_com_peopledaily_common_utils_encrtption_AesEncryptionHelper_createKey__Ljava_lang_String_2")
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            this.args = args[2]
            // console.log("args0 = >",hexdump(args[0]))
            // console.log("args1 = >",hexdump(args[1]))
            console.log("args2 = >",hexdump(args[2]))
            console.log("args2.s = >",args[2].readCString())


        },
        onLeave:function(retval){
            console.log('retval = >',hexdump(retval))
            console.log("after args2 = >",hexdump(this.args))
        }
    })

}
// com.peopledaily.common.utils.encrtption.AesEncryptionHelper.createKey
function AesEncryptionHelper(){
    Java.perform(function(){
        var AesEncryptionHelper = Java.use("com.peopledaily.common.utils.encrtption.AesEncryptionHelper")
        AesEncryptionHelper.createKey.implementation = function(args){
            console.log("AesEncryptionHelper ========================================================================")
            console.log(args)
            var result = this.createKey(args)
            console.log(result.getEncoded())
            // console.log(result)
            // console.log(Object.keys(result))
            // console.log(JSON.stringify(result))
            return result
        }

    })
}


function Cipher(){
    Java.perform(function(){
        var SecretKeySpec = Java.use("javax.crypto.spec.SecretKeySpec")
        var IvParameterSpec = Java.use("javax.crypto.spec.IvParameterSpec")
        var Cipher = Java.use("javax.crypto.Cipher")
        Cipher.init.overload('int', 'java.security.Key', 'java.security.spec.AlgorithmParameterSpec').implementation = function(a,b,c){
            console.log(a)
            var b_ = Java.cast(b,SecretKeySpec)
            var c_ = Java.cast(c,IvParameterSpec)
            console.log(b.getEncoded())
            console.log(c_.getIV())
            return this.init(a,b,c)
        }
    })
}

// io.rong.push.pushconfig
function PushConfig(){
    Java.perform(function(){
        var PushConfig = Java.use("io.rong.push.pushconfig.PushConfig")
        PushConfig.getAppKey.implementation = function(){
            var result = this.getAppKey()
            console.log(result)
            return result
        }
    })

}


function sodump(so_name){
    Java.perform(function(){
        var currentapp = Java.use("android.app.ActivityThread").currentApplication()
        var dir = currentapp.getApplicationContext().getFilesDir().getPath()
        var libso = Process.getModuleByName(so_name)
        console.log("[name]",libso.name)
        console.log("[base]",libso.base)
        console.log("[size]",ptr(libso.size))
        console.log("[path]",libso.path)
        var file_path = dir + "/" + libso.name + "_" + libso.base + "_" + ptr(libso.size) + ".so"
        var file_handle = new File(file_path,"wb")
        if (file_handle && file_handle != null){
            Memory.protect(ptr(libso.base),libso.size,"rwx")
            var libso_buffer = ptr(libso.base).readByteArray(libso.size)
            file_handle.write(libso_buffer)
            file_handle.flush()
            file_handle.close()
            console.log("[dump]",file_path)
        }
    })
}




function hook_so_func(addr,paramsnum,funcname){
    Interceptor.attach(addr,{
        onEnter:function(args){
            this.logs = []
            this.params =[]
            for(var i=0;i<paramsnum;i++){
                this.params.push(args[i])
                this.logs.push("args"+i+"-onEnter:"+print_arg(args[i]))
            }
        },
        onLeave:function(retval){
            for(var i=0;i<paramsnum;i++){
                this.logs.push("args"+i+"-onLeave:"+print_arg(this.params[i]))
            }
            this.logs.push("retval onLeave=>"+print_arg(retval)+"\n")
            console.log("funcname: ",funcname,"funcaddr: ",addr.toString(16),"====>")
            this.logs.push("backtrace => \n")
            this.logs.push(Thread.backtrace(this.context,Backtracer.FUZZY).map(DebugSymbol.fromAddress).join('\n')+'\n')
            console.log(this.logs)
            console.log('====================================================================\n')
        }
    })
}



function hook_suspected_function(targetSo,funcname,argnum) {
    var funcPtr =Module.findExportByName(targetSo,funcname)
    hook_so_func(funcPtr,argnum,funcname)
  
}


// hook_suspected_function("libcom.peopledailychina.activity_alijtca_plus.so","Java_com_peopledaily_common_http_NewNetWorkUtil_safeNetObject__Lorg_xutils_http_RequestParams_2ILcom_peopledaily_common_http_callback_NetDataCallback_2Ljava_lang_Class_2Ljava_lang_String_2",7)
// hook_suspected_function("libcom.peopledailychina.activity_alijtca_plus.so","Java_com_peopledaily_common_http_GetParamsUtil_getParams__Z",3)
// hook_suspected_function("libcom.peopledailychina.activity_alijtca_plus.so","Java_com_peopledaily_common_http_GetParamsUtil_tryInitUA__",2)

        
hook_exit()
// hook_hashmap()
// AesEncryptionHelper()
// Cipher()
// PushConfig()

