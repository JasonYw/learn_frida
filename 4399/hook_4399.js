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

function print_arg(addr){
    var module = Process.findRangeByAddress(addr)
    if(module != null) return hexdump(addr) + "\n"
    return ptr(addr) + "\n"
}


function hook_so_func(addr,paramsnum){
    var so_addr = Module.findBaseAddress("libNativeHelper.so")
    var func_addr = so_addr.add(addr)
    Interceptor.attach(func_addr,{
        onEnter:function(args){
            this.logs = []
            this.params =[]
            for(var i=0;i<paramsnum;i++){
                this.params.push(args[i])
                this.logs.push("this.args-"+i+"-onEnter:"+print_arg(args[i]))
            }
        },
        onLeave:function(retval){
            for(var i=0;i<paramsnum;i++){
                this.logs.push("this.args-"+i+"-onLeave:"+print_arg(this.params[i]))
            }
            this.logs.push("retval onLeave =>"+print_arg(retval)+"\n")
            console.log(this.logs)
        }
    })
}


hook_so_func(0x71fc)
hook_so_func(0x78b0)
hook_so_func(0x22bc)
hook_so_func(0x46c0)
hook_so_func(0x2454)
hook_so_func(0x1fec)
hook_so_func(0x5ae4)
hook_so_func(0x4a4c)
hook_so_func(0x4c54)
hook_so_func(0x596c)


    //   /* TID 0x1acb */
    //   14407 ms  sub_71fc()
    //   14407 ms     | sub_78b0()
    //   14407 ms     | sub_22bc()
    //   14407 ms     | sub_46c0()
    //   14407 ms     |    | sub_2454()
    //   14408 ms     |    | sub_2454()
    //   14408 ms     | sub_1fec()
    //   14408 ms  sub_5ae4()
    //   14408 ms     | sub_4a4c()
    //   14409 ms     |    | sub_4c54()
    //   14409 ms     | sub_596c()
    //   14409 ms     |    | sub_4a4c()
    //   14409 ms     |    | sub_4a4c()
    //   14409 ms     |    |    | sub_4c54()


// hook_login()
// android hooking watch class_method com.android.okhttp.CertificatePinner$Builder.add --dump-args --dump-backtrace --dump-return