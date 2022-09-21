
function showStacks() {
    Java.perform(function () {
        console.log(
            Java.use('android.util.Log').getStackTraceString(
                Java.use('java.lang.Throwable').$new()
            )
        )
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






// function HookCheckRootPathSU() {
//     Java.perform(function () {
//         Java.enumerateClassLoaders({
//             onMatch: function (loader) {
//                 try {
//                     Java.classFactory.loader = loader
//                     console.log('loader', loader)
//                     var RootCheck = Java.classFactory.use('com.peopledailychina.activity.utills.RootCheck')
//                     RootCheck.CheckRootPathSU.implementation = function () {
//                         var result = this.CheckRootPathSU()
//                         console.log(result)
//                         return false
//                     }
//                 } catch (e) {
//                     console.log("wrong loader", loader)
//                 }
//             },
//             onComplete: function () { }
//         })
//     })
// }

// function HookCheckRootPathSU() {

//     Java.perform(function () {
//         var application = Java.use("android.app.Application");
//         application.attach.overload('android.content.Context').implementation = function (context) {
//             console.log(context)
//             var result = this.attach(context); // 先执行原来的attach方法
//             var classloader = context.getClassLoader(); // 获取classloader
//             Java.classFactory.loader = classloader;
//             var Hook_class = Java.classFactory.use("com.peopledailychina.activity.utills.RootCheck");
//             console.log("Hook_class: " + Hook_class);
//             // 下面代码和写正常的hook一样
//             Hook_class.CheckRootPathSU.implementation = function () {
//                 var result = this.CheckRootPathSU()
//                 console.log(result)
//                 return false
//             }
//             return result;
//         }
//     });
// }


Java.perform(function () {
    var sys = Java.use("java.lang.System");
    sys.exit.overload("int").implementation = function(var_0) {
        send("java.lang.System.exit(I)V  // We avoid exiting the application  :)");
    };
 
    send("Done Java hooks installed.");
});



hook_checkroot()