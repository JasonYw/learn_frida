
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
        Sys.currentTimeMillis.implementation = function(){
            var result = this.currentTimeMillis()
            console.log('currentTimeMillis hooked => ',result)
            return result
        }
        Random.nextInt.overload('int').implementation = function(args){
            var result = this.nextInt(args)
            console.log('nextInt hooked !','args => ',args,'result => ',result)
            return result
        }
        

    })

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


function randomAndtimer(){

}

hook_exit()
// hook_hashmap()
// AesEncryptionHelper()
// Cipher()
PushConfig()