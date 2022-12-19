function hookCheckFrida(){
    //strstr strcmp open read fread readlink
    var strstr = Module.findExportByName("libc.so", "strstr");
    var strcmp = Module.findExportByName("libc.so", "strcmp");
    var read = Module.findExportByName("libc.so", "read")
    var open = Module.findExportByName("libc.so", "open")
    var funcOpen = new NativeFunction(open,'int',['pointer','int']);
    var funcRead = new NativeFunction(read,'int',['int','pointer','int'])
    var mapfilepath = "/data/local/tmp/maps"
    var file = new File(mapfilepath,"w")
    var buffer = Memory.alloc(512)

    // Interceptor.attach(strcmp,{
    //     onEnter:function(args){
    //         if(ptr(args[1]).readCString().indexOf("REJECT") != -1){
    //             console.log(ptr(args[0]).readCString(),ptr(args[1]).readCString())
    //         }
    //     },
    //     onLeave:function(retval){}
    // })

    Interceptor.attach(strstr,{
        onEnter:function(args){
            this.target0 = ptr(args[0]).readCString()
            this.target1 = ptr(args[1]).readCString()
            if(this.target1.indexOf("REJECT") != -1){
                console.log(this.target0,this.target1)
            }
        },
        onLeave:function(retval){
            if(this.target0.indexOf("frida")!= -1){
                retval.replace(0x0)
            }
            if(this.target0.indexOf("local/tmp")!= -1){
                retval.replace(0x0)
            }
        }
    })

    // Interceptor.replace(open,new NativeCallback(function (pathnameptr,flag) {
    //     var pathname = Memory.readUtf8String(pathnameptr)
    //     var readid = funcOpen(pathnameptr,flag)
    //     if(pathname.indexOf("maps")>=0){
    //         while(parseInt(funcRead(readid,buffer,512)) !== 0) {
    //             var oneline = Memory.readCString(buffer)
    //             if(oneline.indexOf("tmp") === -1) {
    //                 file.write(oneline)
    //             }
    //         }
    //         var filename = Memory.allocUtf8String(mapfilepath)
    //         return funcOpen(filename,flag)
    //     }
    //     var fd = funcOpen(pathnameptr,flag);
    //     return fd;
    // },'int',['pointer','int']))

    Java.perform(function(){
        console.log("start hookCheckFrida")
        var CheckClass = Java.use("com.geetest.onelogin.e.a.i")
        CheckClass.a.overload("android.content.Context", "com.geetest.onelogin.e.a.f").implementation = function(a,b){
            console.log("hooked func a(android.content.Context, com.geetest.onelogin.e.a.f)")
        }
        CheckClass.a.overload("android.content.Context", "org.json.JSONObject").implementation = function(a,b){
            console.log("hooked func a(android.content.Context, org.json.JSONObject)")
            return false
        }
        CheckClass.a.overload("android.content.Context", "java.lang.String").implementation = function(a,b){
            console.log("hooked func a(android.content.Context, java.lang.String)")
        }
        CheckClass.a.overload("com.geetest.onelogin.e.a.f").implementation = function(a){
            console.log("hooked func a(com.geetest.onelogin.e.a.f)")
        }
        CheckClass.a.overload("android.content.Context").implementation = function(a){
            console.log("hooked func a(android.content.Context)")
            return false
        }
        CheckClass.b.implementation = function(a){
            console.log("hooked func b")
        }
    })
}

function hookMaps() {
    const openPtr = Module.getExportByName('libc.so', 'open');
    const open = new NativeFunction(openPtr, 'int', ['pointer', 'int']);
    var readPtr = Module.findExportByName("libc.so", "read");
    var read = new NativeFunction(readPtr, 'int', ['int', 'pointer', "int"]);
    var fakePath = "/data/local/tmp/maps";
    var file = new File(fakePath, "w");
    var buffer = Memory.alloc(512);
    Interceptor.replace(openPtr, new NativeCallback(function (pathnameptr, flag) {
        var pathname = Memory.readUtf8String(pathnameptr);
        var realFd = open(pathnameptr, flag);
        if (pathname.indexOf("maps") != 0) {
            while (parseInt(read(realFd, buffer, 512)) !== 0) {
                var oneLine = Memory.readCString(buffer);
                if (oneLine.indexOf("tmp") === -1) {
                    file.write(oneLine);
                }
            }
            var filename = Memory.allocUtf8String(fakePath);
            return open(filename, flag);
        }
        var fd = open(pathnameptr, flag);
        return fd;
    }, 'int', ['pointer', 'int']));
}


function hookCheckSoLoad(){
    //查看加载了哪些so
    // Java.perform(function () {
    //     var enumMoudle = Process.enumerateModules();
    //     for (var i = 0; i < enumMoudle.length; i++){
    //         console.log("", enumMoudle[i].name)
    //     }
    // });
    var open = Module.findExportByName("libc.so","open");
    Interceptor.attach(open,{
        onEnter:function(args){
            this.filename = args[0];
            console.log("",this.filename.readCString())
        },onLeave:function(retval){
            return retval;
        }
    })
}

// hookCheckSoLoad()
hookCheckFrida()