

function main(){
    Java.perform(function(){
        var Sys = Java.use("java.lang.System")
        var Util = Java.use("com.zhangyue.iReader.tools.Util")
        var Process = Java.use("android.os.Process")

        Util.getSortedParamStr.implementation = function(a){
            console.log(JSON.stringify(a))
            var result = this.getSortedParamStr(a)
            console.log(result)
            return result
        }
    
        Sys.exit.overload("int").implementation = function(var_0) {
            console.log('exit hooked',var_0)
        }

        Process.killProcess.implementation = function(a){
            console.log('killProcess hooked',a)
        }

        Process.sendSignal.implementation = function(a,b){
            console.log('sendSignal hooked',a,b)
        }
        //int pid = Process.myPid();
        //android.os.Process.killProcess(pid);	
        // 或者 Process.sendSignal(pid, Process.SIGNAL_KILL);
    })
}


function hook_pthread_create(){
    var soaddr = Module.findExportByName('libc.so','pthread_create')
    console.log('soaddr =>',soaddr)
    Interceptor.attach(soaddr,{
        onEnter:function(args){
            var Moudle = Process.findModuleByAddress(args[2])
            if(Moudle){
                console.log(Moudle.name,'func addr=>',args[2],'funcaddr sub soaddr=>',args[2].sub(Moudle.base))
            }
        },
        onLeave:function(retval){}
    })
}

setTimeout(main,500);