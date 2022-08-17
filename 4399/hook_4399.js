//com.m4399.gamecenter


function hook_update(){
    Java.perform(function(){
        var upgrade_ = Java.use('com.upgrade.AppUpgradeManager')
        upgrade_.checkUpgrade.implementation =function(a){
            console.log(1)
            // var  result = this.AppUpgradeDialog(a,b)
            // return result
        }
    })

}
function hook_kill(){
    Java.perform(function(){
        var kill_ = Java.use('com.framework.utils.AppUtils')
        kill_.killCurrentProcess.implementation = function(){
            console.log('hook kill')
        }
    })
}


function hook_chekupgradecondition(){
    Java.perform(function(){
        var check_condition = Java.use('com.upgrade.AppUpgradeManager')
        check_condition.checkUpgradeCondition.implementation = function(){
            console.log(2)
            return false
        }
    })
}



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

function hook_netwrok(){
    Java.perform(function(){
        var net_ = Java.use('com.framework.manager.network.NetworkStats')
        net_.networkAvalible.implementation = function(){
            return true
        }
    })
}

function hook_file(){
    Java.perform(function(){
        var file_ = Java.use('java.io.File')
        for(var i =0;i<file_.$init.overloads.length;i++){
            file_.$init.overloads[i].implementation = function(){
                var result = this.$init.apply(this,arguments)
                console.log('args =>',JSON.stringify(arguments))
                showStacks()
                return result
            }
        }
    })
}


function hook_downmodel(){
    Java.perform(function(){
        var downmodel = Java.use('com.download.DownloadModel')
        // var long = Java.use('java.lang.Long')
        downmodel.getExtra.overload('java.lang.String','java.lang.Object').implementation = function(a,b){
            console.log(a,JSON.stringify(b))
            var result = this.getExtra(a,b)
            showStacks()
            return result
            
        }
    })
}

// hook_update()
// hook_file()
hook_toast()
// hook_kill()


// android hooking watch class_method com.android.okhttp.CertificatePinner$Builder.add --dump-args --dump-backtrace --dump-return