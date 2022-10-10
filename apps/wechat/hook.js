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


Java.perform(function(){
    // 完整代码：
    
    var SQLiteDatabase = Java.use('com.tencent.wcdb.database.SQLiteDatabase');
    var Set = Java.use("java.util.Set");
    var ContentValues = Java.use("android.content.ContentValues");
    var xml = Java.use("com.tencent.mm.sdk.platformtools.SemiXml");
    Java.openClassFile('/data/local/tmp/fastjson.dex').load();
    var JSONObject = Java.use('com.alibaba.fastjson.JSONObject')

    SQLiteDatabase.insertWithOnConflict.implementation = function (arg1, arg2, arg3, i) {

        // 调用此函数，让其正常执行
        var ret = this.insertWithOnConflict.call(this, arg1, arg2, arg3, i);
        
        // 我们重点关注一下参数，因为参数中包含着我们想要的数据
        var values = Java.cast(arg3, ContentValues);
        var sets = Java.cast(values.keySet(), Set);
        var arr = sets.toArray().toString().split(",");

        for (var i = 0; i < arr.length; i++){
            var key = arr[i];
            var value = values.get(key);
            if(key === "content"){
                var str_ = xml.decode(value)
                var res = JSONObject.toJSONString(str_);
                var data = JSONObject.parseObject(res)
                var value_data = data.getString(".msg.appmsg.mmreader.category.item.url")
                console.log(value_data);
            }
        }
        console.log("____________________________________");
        return ret;
    };

});
