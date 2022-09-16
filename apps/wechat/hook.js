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




function hook_unpack_so(){
    var funcaddr = Module.findExportByName("libMMProtocalJni.so","Java_com_tencent_mm_protocal_MMProtocalJni_unpack")
    console.log(funcaddr)
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            this.args_ = args
            //v2, arg18, arg19, v5, v6, v7, v8, v9
            console.log(ptr(args[0]),hexdump(args[0]))
            console.log(ptr(args[1]))
            console.log(ptr(args[2]))
            console.log(ptr(args[3]))
            console.log(ptr(args[4]))
            console.log(ptr(args[5]))
            console.log(ptr(args[6]))
            console.log(ptr(args[7]))
        },
        onLeave:function(retval){
            // console.log((this.args_[0]))
            // console.log(hexdump(this.args_[1]))
            // console.log(hexdump(this.args_[2]))
            // console.log(hexdump(this.args_[3]))
            // console.log(ptr(this.args_[4]))
            // console.log(ptr(this.args_[5]))
            // console.log(ptr(this.args_[6]))
            // console.log(ptr(this.args_[7]))

        },
    })
}   



function hook_log(){
    Java.perform(function(){
        var LOG = Java.use("com.tencent.mm.sdk.platformtools.Log")
        LOG.setConsoleLogOpen.implementation = function(args){
            console.log(1,args)
            return this.setConsoleLogOpen(true)
        }
        var XLOG =  Java.use("com.tencent.mars.ilink.xlog.Xlog")
        XLOG.setConsoleLogOpen.implementation = function(args){
            console.log(2,args)
            return this.setConsoleLogOpen(true)
        }
        XLOG.setLogLevel.implementation = function(args){
            console.log(3,args)
            return this.setLogLevel(0)
        }
    })
}

function hook_unpack(){
    Java.perform(function(){
        // com.tencent.mm.protocal.MMProtocalJni.unpack
        var MMProtocalJni = Java.use("com.tencent.mm.protocal.MMProtocalJni")
        var PByteArray = Java.use("com.tencent.mm.pointers.PByteArray")
        var  PInt = Java.use("com.tencent.mm.pointers.PInt")
        var AT_y = Java.use("com.tencent.mm.at.y")
        // MMProtocalJni.unpack.implementation = function(a, b, c, d, e, f, g, h){
        //     console.log(a, b, c, d, e, f, g, h.value)
        //     var result = this.unpack(a, b, c, d, e, f, g, h)
        //     var c_ = Java.cast(c,PInt)
        //     console.log(Object.keys(c_),JSON.stringify(c_))
        //     // console.log(result)
        //     // showStacks()
        //     return  result

        // }
        AT_y.c.implementation = function(arg17, arg18, arg19, arg20){
            console.log("arg17", arg17)
            console.log("arg18", arg18)
            console.log("arg19", arg19)
            console.log("arg20", arg20)
            var result = this.c(arg17, arg18, arg19, arg20)
            return result
        }



        // MMProtocalJni.pack.implementation = function(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13,arg14){
        //     console.log(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13,arg14)
        //     var result = this.unpack(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13,arg14)
        //     console.log(byteToString(arg0))
        //     // console.log(result)
        //     // showStacks()
        //     return  result

        // }
    })
}


// var a  = [6,-125,103,56,-17,10,6,-13,-39,-95,113,-83,-27,-100,31,-112,-1,-29,-36,75,-126,48,75,-86,-21,-21,99,-45,53,-49,18,35,-104,-113,13,27,-66,-52,-38,37,94,-34,-55,107,39,83,-13,31,-73,42,-11,38,-1,-126,82,-103,-102,-85,-71,0,120,29,-120,-15,15,-98,-47,49,-33,-63,50,109,-31,13,82,-12,4,35,-76,-46,50,-100,-103,-9,104,24,109,106,-75,-126,38,85,32,59,2,-87,87,-7,78,13,-124,23,43,-84,91,69,21,55,105,119,-37,121,15,-85,66,-44,-25,-115,-126,26,6,9,19,-42,-116,62,-70,-50,11,-119,31,-34,38,-39,95,102,-95,-82,-108,69,21,-66,-18,5,-114,80,27,91,-79,58,-43,42,-86,-42,51,88,119,-100,73,29,53,-106,114,107,6,-62,-11,-103,-2,-88,-35,69,75,-114,-115,57,60,-103,-122,-68,30,10,79,73,60,108,81,-2,-114,42,10,19,122,-56,39,95,16,97,96,21,-109,-62,-64,107,-35,49,-117,-114,-75,27,26,-100,61,-15,-91,77,49,127,-64,-8,-90,49,19,113,55,-5,49,19,75,3,-66,-65,-63,112,-25,50,52,-91,107,40,-96,87,42,-87,105,122,79,-25,-35,69,-3,28,123,-119,-60,-7,-2,-44,122,101,54,73,-10,21,-97,-128,49,62,50,20,22,-92,96,106,-120,-44,-23,-119,-48,29,-124,-81,-38,44,123,98,126,112,-104,-24,-110,45,111,16,112,-38,61,-32,37,-40,-28,-63,-33,124,-120,-106,-85,-37,30,21,88,-83,-63,-109,66,-117,-16,-51,7,-34,27,-4,84,-114,-113,53,48,-94,-91,61,121,-117,-90,88,-59,-114,-115,-109,-110,122,-118,-48,83,-10,47,34,-73,58,-76,-66,113,-5,66,-44,16,-62,53,117,-86,37,-49,-94,-44,-54,-26,-94,36,26,88,0,-107,107,-71,-81,127,24,50,-128,73,74,42,-22,-24,-23,-45,-55,-114,77,125,94,75,95,68,71,-98,-50,86,104,-125,19,60,54,-86,27,-3,-113,-13,-64,43,-5,119,111,82,-91,-104,-65,-11,56,-108,-23,-7,92,-77,40,-105,18,-94,-39,-107,102,44,1,58,23,109,108,-64,-32,39,35,100,5,4,20,67,-6,29,68,124,-45,39,80,34,-70,-12,-55,127,83,18,-27,-70,-57,38,103,124,-33,-97,12,36,57,-59,113,-124,-75,67,63,49,-50,37,3,-96,106,80,19,-17,-83,45,92,-68,89,25,41,-100,-40,-28,-59,33,95,-41,108,-64,-117,62,-96,-79,49,81,78,96,-2,-9,105,-76,-64,-38,-100,4,22,111,75,96,90,45,-100,-95,-4,63,69,-51,-31,-121,51,88,96,116,-52,22,125,26,-66,34,-69,46,-35,-4,127,-64,-122,117,34,109,22,23,-88,-24,67,109,-70,27,9,-77,-7,22,48,114,94,44,-15,-90,100,-54,-100,124,-9,78,30,-43,-8,-11,22,-117,7,-111,112,-59,-119,-126,34,67,11,-48,13,-50,-121,-122,25,-24,-33,23,19,2,60,-22,32,-4,-72,-112,-103,6,40,5,48,0,58,-6,1,8,-12,1,18,-12,1,10,0,16,2,26,-29,1,10,-32,1,48,48,48,100,50,50,51,100,51,101,48,52,48,48,48,48,48,49,48,48,48,48,48,48,48,48,48,48,52,48,56,55,102,55,55,101,97,53,100,48,53,100,56,56,54,97,56,53,53,53,99,52,50,50,54,51,50,48,48,48,48,48,48,48,102,99,56,101,54,52,50,99,98,53,98,52,57,49,100,56,97,48,53,97,53,48,48,52,100,52,57,99,102,56,98,57,53,50,99,49,98,56,49,57,100,98,49,100,100,48,102,102,48,48,57,98,48,50,48,51,56,97,54,100,50,97,99,56,99,57,48,55,57,57,48,100,52,51,48,50,102,48,53,50,102,53,51,55,57,51,51,51,102,49,51,55,100,51,51,100,98,51,101,56,97,53,51,100,97,57,98,54,54,54,97,55,55,100,99,98,51,54,48,57,97,48,100,54,100,54,99,57,53,51,51,51,49,100,51,57,102,49,102,53,51,99,57,55,54,102,57,53,101,98,52,97,101,56,49,48,100,49,97,51,32,-4,-72,-112,-103,6,40,2,48,0,66,46,8,42,18,42,76,111,103,105,110,95,102,53,49,98,54,102,56,100,45,101,56,98,49,45,52,56,55,52,45,57,99,55,50,45,101,100,99,99,51,102,51,53,55,50,48,54,-54,1,14,99,111,109,46,116,101,110,99,101,110,116,46,109,109,-46,1,74,8,-97,3,18,69,8,65,18,65,4,-34,-27,14,44,9,-128,-45,91,-84,73,-13,14,46,-38,40,69,-79,30,-74,-2,-100,45,-8,57,-58,-7,-75,-120,-84,-101,39,92,-81,66,46,15,-33,-9,-34,-82,-110,48,-19,-86,51,-64,-38,117,47,53,-27,92,-88,-42,-42,-124,-19,21,11,32,88,-101,-38,103]
// console.log(byteToString(a))
// hook_unpack()
// hook_unpack_so()
hook_log()
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



