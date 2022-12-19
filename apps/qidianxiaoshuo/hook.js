
    //strstr strcmp open read fread readlink
var strstr = Module.findExportByName("libc.so", "strstr");
var strcmp = Module.findExportByName("libc.so", "strcmp");
var read = Module.findExportByName("libc.so", "read")
var open = Module.findExportByName("libc.so", "open")
var readlink = Module.findExportByName("libc.so", "readlink")
var strncmp = Module.findExportByName("libc.so", "strncmp")
var open = Module.findExportByName("libc.so","open");
var openfunc = new NativeFunction(open, 'int', ['pointer', 'int']);
var readfunc = new NativeFunction(read, 'int', ['int', 'pointer', "int"]);
var fakePath = "/data/local/tmp/maps"
var file = new File(fakePath, "w")
var buffer = Memory.alloc(512)

// Interceptor.attach(open,{
//     onEnter:function(args){
//         this.filename = args[0];
//         console.log("file:",this.filename.readCString())
//     },onLeave:function(retval){
//         return retval;
//     }
// })

Interceptor.attach(strstr,{
    onEnter:function(args){
        this.target0 = ptr(args[0]).readCString()
        this.target1 = ptr(args[1]).readCString()
    },
    onLeave:function(retval){
        if(this.target0.indexOf("frida")!= -1){
            // console.log('strstr => args0:',this.target0,',args1:',this.target1,",retval:",retval)
            retval.replace(0x0)
        }
        if(this.target0.indexOf("local/tmp")!= -1){
            // console.log('strstr => args0:',this.target0,',args1:',this.target1,",retval:",retval)
            retval.replace(0x0)
        }
        if(this.target0.indexOf("gadget")!= -1){
            // console.log('strstr => args0:',this.target0,',args1:',this.target1,",retval:",retval)
            retval.replace(0x0)
        }
        if(this.target0.indexOf("LIBFRIDA")!= -1){
            // console.log('strstr => args0:',this.target0,',args1:',this.target1,",retval:",retval)
            retval.replace(0x0)
        }
        if(this.target0.indexOf("5DBA")!= -1){
            // console.log('strstr => args0:',this.target0,',args1:',this.target1,",retval:",retval)
            retval.replace(0x0)
        }
    }
})

Interceptor.attach(strcmp,{
    onEnter:function(args){
        this.target2 = ptr(args[0]).readCString()
        this.target3 = ptr(args[1]).readCString()
    },
    onLeave:function(retval){
        if(this.target3.indexOf("REJECT") != -1){
            // console.log('strcmp => args0:',this.target2,'args1:',this.target3)
            retval.replace(0x1)
        }
    }
})



// Interceptor.replace(open, new NativeCallback(function (pathnameptr, flag) {
//     var pathname = Memory.readUtf8String(pathnameptr);
//     var realFd = openfunc(pathnameptr, flag);
//     if (pathname.indexOf("maps") != 0) {
//         while (parseInt(readfunc(realFd, buffer, 512)) !== 0) {
//             var oneLine = Memory.readCString(buffer);
//             if (oneLine.indexOf("tmp") === -1) {
//                 file.write(oneLine);
//             }
//         }
//         var filename = Memory.allocUtf8String(fakePath);
//         return openfunc(filename, flag);
//     }
//     var fd = openfunc(pathnameptr, flag);
//     return fd;
// }, 'int', ['pointer', 'int']));


// Interceptor.attach(readlink,{
//     onEnter:function(args){
//         this.target4 = ptr(args[0]).readCString()
//         // console.log('readlink => args0:',this.target4)
//     },
//     onLeave:function(retval){}
// })

// Interceptor.attach(strncmp,{
//     onEnter:function(args){
//         this.target5 = ptr(args[0]).readCString()
//         this.target6 = ptr(args[1]).readCString()
//         // console.log('strncmp => args0:',this.target5,'args1:',this.target6)
//     },
//     onLeave:function(retval){}
// })


// Java.perform(function(){
//     // let p = Java.use("e.a.a.g.a$p");
//     // var URLEncoder = Java.use("java.net.URLEncoder")
//     // URLEncoder.encode.overload('java.lang.String', 'java.lang.String').implementation = function(a,b){
//     //     var result = this.encode(a,b)
//     //     console.log('URLEncoder.encode args:',a,b,'result:',result)
//     //     return result
//     // }
//     var RSA = Java.use("e.a.a.d")
//     RSA.a.implementation = function(args0){
//         var result = this.a(args0)
//         console.log('a args:',args0,'result:',result)
//         return result
//     }
//     var Sodlib = Java.use("a.d")
//     Sodlib.c.implementation = function(args0){
//         var result = this.c(args0)
//         console.log('c args:',args0,'result:',result)
//         return result
//     }
// })




