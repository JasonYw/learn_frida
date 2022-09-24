function hexToString(hexStr) {
    var hex = hexStr.toString();//force conversion
    var str = '';
    for (var i = 0; i < hex.length; i += 2)
        str += String.fromCharCode(parseInt(hex.substr(i, 2), 16));
    return str;
}

function bytesToHex(bytes) {
    for (var hex = [], i = 0; i < bytes.length; i++) {
        hex.push((bytes[i] >>> 4).toString(16));
        hex.push((bytes[i] & 0xF).toString(16));
    }
    return hex.join("");
}

function byteToString(arr) {
    if(typeof arr === 'string') {
        return arr;
    }
    var str = '',
        _arr = arr;
    for(var i = 0; i < _arr.length; i++) {
        var one = _arr[i].toString(2),
            v = one.match(/^1+?(?=0)/);
        if(v && one.length == 8) {
            var bytesLength = v[0].length;
            var store = _arr[i].toString(2).slice(7 - bytesLength);
            for(var st = 1; st < bytesLength; st++) {
                store += _arr[st + i].toString(2).slice(2);
            }
            str += String.fromCharCode(parseInt(store, 2));
            i += bytesLength - 1;
        } else {
            str += String.fromCharCode(_arr[i]);
        }
    }
    return str;
}

function hook_RegisterNatives(){
    //这个方法是jni函数 RegisterNatives
    //两种方法获取jni函数 一个是枚举libart.so的符号 另一个是使用frida api获取env结构体的地址，之后再通过偏移找到函数的指针地址，之后再读指针的地址
    //这里用第一种
    var symbols = Process.getModuleByName('libart.so').enumerateSymbols()
    var registernativesaddr = null
    for(var i =0;i<symbols.length;i++){
        var symbol = symbols[i]
        if(symbol.name.indexOf('CheckJNI') == -1 && symbol.name.indexOf('RegisterNatives') != -1){
            registernativesaddr = symbol.address
        }
    }
    console.log(registernativesaddr)
    Interceptor.attach(registernativesaddr,{
        onEnter:function(args){
            //可以获取到jclass，注册到哪个类上面
            //得到method结构体 获取函数再java层的名字 以及签名 so函数的地址
            //可以获取注册了多少个函数
            var env = Java.vm.tryGetEnv()
            var classname = env.getClassName(args[1]) //获取类名
            var method_num = args[3].toInt32() //获取方法数量
            for(var i=0;i<method_num;i++){
                //结构体 里面是3个指针，所以64位就是 8个字节 一共 64位
                //args[2]获取到结构体指针，在读取第一个指针获取名字字符串，没有偏移
                var name = args[2].add(Process.pointerSize*3*i).readPointer().readCString()
                //结构体第二个指针需要8个偏移 也是字符串获取签名
                //指针占位可以使用frida的api,因为32位是4个字节，64位是8个字节所以使用api 可以解决这个问题，自动识别32位还是64位
                var signature = args[2].add(Process.pointerSize*3*i).add(Process.pointerSize).readPointer().readCString()
                //结构体第三个指针需要16个字节的偏移，返回的是函数指针 获取的是函数地址
                var funcaddr = args[2].add(Process.pointerSize*3*i).add(Process.pointerSize*2).readPointer()
                //通过函数地址获取so,有可能找到的模块是空
                var somodule = Process.getModuleByAddress(funcaddr)
                console.log('=======================')
                console.log('classname =>',classname)
                console.log('name =>',name)
                console.log('signature =>',signature)
                console.log('funcaddr =>',funcaddr)
                console.log('so_name =>',somodule.name)
                console.log('so_addr =>',somodule.base)
                console.log('funcaddr_sub_soaddr =>',funcaddr.sub(somodule.base))
                console.log('=======================\n')
            }
        },
        onLeave:function(retval){},
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



// Java_com_tencent_mm_protocal_MMProtocalJni_unpack
function hook_unpack_so(){
    var funcaddr = Module.findExportByName("libMMProtocalJni.so","Java_com_tencent_mm_protocal_MMProtocalJni_unpack")
    console.log(funcaddr)
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            console.log(ptr(args[0]))
            console.log(hexdump(args[0]))
            console.log(hexdump(args[1]))
            console.log(hexdump(args[2]))
            console.log(hexdump(args[3]))
            // console.log(hexdump(args[0].readPointer()))
        },
        onLeave:function(retval){
        },
    })
}   

function hook_mmlnts_so(){
    var funcaddr = Module.findExportByName("libwechatnetwork.so","Java_com_tencent_mars_mm_MMLogic_setMmtlsCtrlInfo")
    console.log(funcaddr)
    // Interceptor.replace(funcaddr,new NativeCallback(function(a,b,c,d,e){
    //     console.log(a,b,c,d,e)
    // },'int',[]))

}



function hook_log(){
    Java.perform(function(){
        // var LOG = Java.use("com.tencent.mm.sdk.platformtools.Log")
        // LOG.setConsoleLogOpen.implementation = function(args){
        //     console.log(1,args)
        //     return this.setConsoleLogOpen(true)
        // }
        var XLOG =  Java.use("com.tencent.mars.xlog.Xlog")
        XLOG.setConsoleLogOpen.implementation = function(args1,arg2){
            console.log(2,args1,arg2)
            return this.setConsoleLogOpen(args1,true)
        }
        // XLOG.setLogLevel.implementation = function(args){
        //     console.log(3,args)
        //     return this.setLogLevel(0)
        // }

    })
}

function hook_mmlnts(){
    Java.perform(function(){
        var MMLogic = Java.use("com.tencent.mars.mm.MMLogic")
        MMLogic.setMmtlsCtrlInfo.implementation = function(args0){
            console.log(args0)
            result =  this.setMmtlsCtrlInfo(args0)
            console.log(result)
            return result

        }
        // var stnLogic = Java.use("com.tencent.mars.stn.StnLogic")
        // stnLogic.makesureLongLinkConnected.implementation = function(){
        //     console.log('makesureLongLinkConnected!')

        // }

    })
}

function hook_unpack(){
    Java.perform(function(){
        var MMProtocalJni = Java.use("com.tencent.mm.protocal.MMProtocalJni")
        // var PByteArray = Java.use("com.tencent.mm.pointers.PByteArray")
        // var  PInt = Java.use("com.tencent.mm.pointers.PInt")
        // var AT_y = Java.use("com.tencent.mm.at.y")
        MMProtocalJni.unpack.implementation = function(arg0, arg1, arg2, arg3, arg4, arg5, arg6,args7){
            console.log('unpack=>\n')
            console.log(arg0,JSON.stringify(arg0),Object.keys(arg0),arg0.value,JSON.stringify(arg0.value))
            var result = this.unpack(arg0, arg1, arg2, arg3, arg4, arg5, arg6,args7)
            return  result
        }
        // AT_y.c.implementation = function(arg17, arg18, arg19, arg20){
        //     console.log("arg17", arg17)
        //     console.log("arg18", arg18)
        //     console.log("arg19", arg19)
        //     console.log("arg20", arg20)
        //     var result = this.c(arg17, arg18, arg19, arg20)
        //     return result
        // }
        MMProtocalJni.pack.implementation = function(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13,arg14){
            console.log('pack=>\n')
            console.log(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13,arg14)
            var result = this.unpack(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13,arg14)
            // console.log(byteToString(arg0))
            return result
        }
        // MMProtocalJni.packHybrid.implementation = function(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12){
        //     console.log(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)
        //     var result = this.unpack(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)
        //     return  result
        // }
    })
}

// hook_log()
// hook_mmlnts()
hook_unpack_so()
// hook_mmlnts_so()
// hook_mmlnts()
// hook_unpack()

// ___| |_|_|___ ___| |_|_|___ ___
// | . | . | | -_|  _|  _| | . |   |
// |___|___| |___|___|_| |_|___|_|_|
//       |___|(object)inject(ion) v1.11.0

//      Runtime Mobile Exploration
//         by: @leonjza from @sensepost

// [tab] for command suggestions
// com.tencent.mm on (google: 8.1.0) [usb] # (agent) [286474] Called com.tencent.mm.protocal.MMProtocalJni.generateECKey(int, com.tencent.mm.pointers.PByteArray, com.tencent.mm.pointers.PByteArray)
// (agent) [286474] Called com.tencent.mm.protocal.MMProtocalJni.packHybridEcdh(com.tencent.mm.pointers.PByteArray, [B, java.lang.String, int, int, int, [B, int, int, int)  
// (agent) [286474] Called com.tencent.mm.protocal.MMProtocalJni.unpack(com.tencent.mm.pointers.PByteArray, [B, [B, com.tencent.mm.pointers.PByteArray, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt)
// com.tencent.mm on (google: 8.1.0) [usb] #
// com.tencent.mm on (google: 8.1.0) [usb] #
// com.tencent.mm on (google: 8.1.0) [usb] #
// com.tencent.mm on (google: 8.1.0) [usb] # exit
// Exiting...
// Asking jobs to stop...
// Unloading objection agent...




// com.tencent.mm.protocal.MMProtocalJni.generateECKey(Native Method)
// com.tencent.mm.protocal.l$f.toProtoBuf(SourceFile:318)
// com.tencent.mm.at.w.a(SourceFile:144)
// com.tencent.mm.protocal.j$a.onTransact(SourceFile:180)
// android.os.Binder.execTransact(Binder.java:697)


// -----BEGIN PUBLIC KEY-----
// MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEeYFo7GeLKRFVaPCU/6e6RjuPmjRZ
// ZHR5JkH8yB+xsAVsHqw4U3skGuHzIE6moG7cemH1AXc7KU9nUelgO+Bh7g==
// -----END PUBLIC KEY-----

//私
//.êe?..ù]Ó..w#Òª××ïw.Ñ~Èÿß.Gã.....O_Ùçc.+.õOpÇØuúß.Q.l.(.ùìUuÓ¦åÀ. 





// https://github.com/LSilent/PyMicroChat



// com.tencent.mm.protocal.g$a.onTransact


// (agent) Hooking com.tencent.mars.mm.MMLogic.getNetworkId(java.lang.String)
// (agent) Hooking com.tencent.mars.mm.MMLogic.getNetworkServerIp()
// (agent) Hooking com.tencent.mars.mm.MMLogic.getSnsIps(boolean, com.tencent.mars.mm.MMLogic$GetDnsReturn)
// (agent) Hooking com.tencent.mars.mm.MMLogic.getSnsIpsForScene(java.util.List, boolean)
// (agent) Hooking com.tencent.mars.mm.MMLogic.reportFailIp(java.lang.String)
// (agent) Hooking com.tencent.mars.mm.MMLogic.reportFlow(int, int, int, int)
// (agent) Hooking com.tencent.mars.mm.MMLogic.reportStat(com.tencent.mars.mm.MMLogic$ReportInfo)
// (agent) Hooking com.tencent.mars.mm.MMLogic.reportV6Status(boolean)
// (agent) Hooking com.tencent.mars.mm.MMLogic.saveAuthLongIPs(java.lang.String, [Ljava.lang.String;)
// (agent) Hooking com.tencent.mars.mm.MMLogic.saveAuthLongList(java.lang.Object, [I)
// (agent) Hooking com.tencent.mars.mm.MMLogic.saveAuthPorts([I, [I)
// (agent) Hooking com.tencent.mars.mm.MMLogic.saveAuthShortIPs(java.lang.String, [Ljava.lang.String;)
// (agent) Hooking com.tencent.mars.mm.MMLogic.saveAuthShortList(java.lang.Object, [I)
// (agent) Hooking com.tencent.mars.mm.MMLogic.setDebugHost(java.lang.String)
// (agent) Hooking com.tencent.mars.mm.MMLogic.setDebugIP(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
// (agent) Hooking com.tencent.mars.mm.MMLogic.setHostInfo([Ljava.lang.String;, [Ljava.lang.String;, [I)
// (agent) Hooking com.tencent.mars.mm.MMLogic.setMMtlsRegion(int)
// (agent) Hooking com.tencent.mars.mm.MMLogic.setMmtlsCtrlInfo(boolean)
// (agent) Hooking com.tencent.mars.mm.MMLogic.setNetIdAndIsp(java.lang.String, java.lang.String, java.lang.String)
// (agent) Hooking com.tencent.mars.mm.MMLogic.setNetworkId(java.lang.String, java.lang.String, java.lang.String, int)
// (agent) Hooking com.tencent.mars.mm.MMLogic.setNewDnsDebugHost(java.lang.String, java.lang.String)
// (agent) Hooking com.tencent.mars.mm.MMLogic.simpleTestCommand(java.lang.String)
// (agent) Hooking com.tencent.mars.mm.MMLogic.switchProcessActiveState(boolean)
// (agent) Hooking com.tencent.mars.mm.MMLogic.testReportFlush()
// (agent) Hooking com.tencent.mars.mm.MMLogic.uploadFile(java.lang.String, java.lang.String, java.lang.String)
// (agent) Hooking com.tencent.mars.mm.MMLogic.uploadLog([I, boolean, java.lang.String, java.lang.String)
// (agent) Registering job 989474. Type: watch-class for: com.tencent.mars.mm.MMLogic