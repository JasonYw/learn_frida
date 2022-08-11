// 枚举导入表
// var improts = Module.enumerateImports("libencryptlib.so");
// for(let i = 0; i < improts.length; i++){
//     //console.log(JSON.stringify(improts[i]));
//     console.log(improts[i].name + " " + improts[i].address);
// }

// 枚举导出表
// var exports = Module.enumerateExports("libencryptlib.so");
// for(let i = 0; i < exports.length; i++){
//     console.log(exports[i].name + " " + exports[i].address);
// }

// 枚举符号表
// var symbols = Module.enumerateSymbols("libencryptlib.so");
// for(let i = 0; i < symbols.length; i++){
//     console.log(symbols[i].name + " " + symbols[i].address);
// }

// 枚举进程中已加载的模块
// var modules = Process.enumerateModules();
// console.log(JSON.stringify(modules[0].enumerateExports()[0]));

// 导出函数的hook
// var funcAddr = Module.findExportByName("libencryptlib.so", "_ZN7MD5_CTX11MakePassMD5EPhjS0_");
// console.log(funcAddr);
// Interceptor.attach(funcAddr, {
//     onEnter: function (args) {
//         console.log("funcAddr onEnter args[1]: ", hexdump(args[1]));
//         console.log("funcAddr onEnter args[2]: ", args[2].toInt32());
//         this.args3 = args[3];
//     }, onLeave: function (retval) {
//         console.log("funcAddr onLeave args[3]: ", hexdump(this.args3));
//     }
// });

// 各种方式得到so基址
// var module1 = Process.findModuleByName("libencryptlib.so");
// //console.log(JSON.stringify(module1));
// console.log("module1", module1.base);
//
// var module2 = Process.getModuleByName("libencryptlib.so");
// console.log("module2", module2.base);
//
// var soAddr = Module.findBaseAddress("libencryptlib.so");
// console.log("soAddr", soAddr);
//
// var modules = Process.enumerateModules();
// for(let i = 0; i < modules.length; i++){
//     if(modules[i].name == "libencryptlib.so"){
//         console.log(modules[i].name + " " + modules[i].base);
//     }
// }
//
// var module = Process.findModuleByAddress(Module.findBaseAddress("libencryptlib.so"));
// console.log("module " + module.name + " " + module.base);

// hook任意函数
// var soAddr = Module.findBaseAddress("libencryptlib.so");
// // var so = 0x77ab999000;
// // console.log(ptr(so).add(0x1FA38)); // new NativePointer()
// var funcAddr = soAddr.add(0x1FA38);
// Interceptor.attach(funcAddr, {
//     onEnter: function (args) {
//         console.log("funcAddr onEnter args[1]: ", hexdump(args[1]));
//         console.log("funcAddr onEnter args[2]: ", args[2].toInt32());
//         this.args3 = args[3];
//     }, onLeave: function (retval) {
//         console.log("funcAddr onLeave args[3]: ", hexdump(this.args3));
//     }
// });

// 有手就行的so hook
function print_arg(addr){
    var module = Process.findRangeByAddress(addr);
    if(module != null) return hexdump(addr) + "\n";
    return ptr(addr) + "\n";
}
function hook_native_addr(funcPtr, paramsNum){
    var module = Process.findModuleByAddress(funcPtr);
    Interceptor.attach(funcPtr, {
        onEnter: function(args){
            this.logs = [];
            this.params = [];
            this.logs.push("call " + module.name + "!" + ptr(funcPtr).sub(module.base) + "\n");
            for(let i = 0; i < paramsNum; i++){
                this.params.push(args[i]);
				this.logs.push("this.args" + i + " onEnter: " + print_arg(args[i]));
            }
        }, onLeave: function(retval){
            for(let i = 0; i < paramsNum; i++){
                this.logs.push("this.args" + i + " onLeave: " + print_arg(this.params[i]));
            }
            this.logs.push("retval onLeave: " + print_arg(retval) + "\n");
            console.log(this.logs);
        }
    });
}

// var soAddr = Module.findBaseAddress("libencryptlib.so");
// var funcAddr = soAddr.add(0x1FA38);
// hook_native_addr(funcAddr, 4);
//枚举导入表
function hook_imports_all(){
    var imports  = Module.enumerateImports('libencryptlib.so')
    for(var i =0;i<imports.length;i++){

        console.log(imports[i].name,imports[i].address)
    }
}

//枚举导出表
//exports解析的是SHT_DYNSYM
function hook_exports_all(){
    var exports_ = Module.enumerateExports('libencryptlib.so')
    for(var i=0;i<exports_.length;i++){
        console.log(JSON.stringify(exports_[i]))
    }
}


//枚举符号表
//symbols解析的是SHT_SYMTAB
//SYMTAB更全，不是so运行所必须的，一般会被去掉
//DYNSYM是SYMTAB的子集
function hook_symbols_all(){
    var symbols = Module.enumerateSymbols('libencryptlib.so')
    for(var i=0;i<symbols.length;i++){
        console.log(JSON.stringify(symbols[i]))
    }
}

//枚举所有模块
//当不知道导入函数来源于那个so时，可以用此方法解决获取so直接遍历他的导出表
function hook_moudle_all(){
    var modules = Process.enumerateModules()
    for(var i=0;i<modules.length;i++){
        console.log(JSON.stringify(modules[i]))
        // console.log(JSON.stringify(modules[i]).enumerateExports())
        // console.log(JSON.stringify(modules[i]).enumerateImports())
        // console.log(JSON.stringify(modules[i]).enumerateSymbols())
        

    }
}


//在so导出表的函数，通过函数名获取函数地址
//函数名以汇编中为准
function hook_find_export_by_name(){
    var funcaddr =  Module.findExportByName('libencryptlib.so','_ZN7MD5_CTX11MakePassMD5EPhjS0_') // 获得函数地址
    console.log(funcaddr)
}

//获取地址后通过拦截器对函数进行hook
//拦截下来之后先执行onEnter之后执行原函数，之后再执行onleave
//如果返回值，或者拿到的参数是内存地址，可以使用hexdump
function hook_by_interceptor(){
    var funcaddr =  Module.findExportByName('libencryptlib.so','_ZN7MD5_CTX11MakePassMD5EPhjS0_')
    Interceptor.attach(funcaddr,{ //地址
        onEnter:function(args){ //args参数数组
            console.log(args[1],hexdump(args[1])) //打印参数,使用hexdump拿到地址中的值
            console.log(args[2],args[2].toInt32())
            console.log(args[3],hexdump(args[3])) //缓冲区，函数执行前拿不到，需要再onleave中获取
            this.args3 = args[3]
            // console.log(this.context.x1) // 打印寄存器内容
            // console.log(args[2].toInt32()) //默认显示16进制，转换成10进制
        },
        onLeave:function(retval){
            console.log(hexdump(this.args3))
        }
    })
}


//如果函数没有出现在导入表。导出表，frida无法获取其地址，需要自己计算
//计算公式so的基址+函数在so中的偏移[+1],指的是函数定义的位置
//thumb指令所以+1，arm指令不需要，android 32位基本都是 thumb指令， android64基本都是 64位 arm指令
//也可以通过汇编对应的机器码判断，如果是汇编中都是4个字节的机器码就是arm，否则就是thumb，多数是两个字节个别是4个字节也是thumb
//实在搞不清楚就都试一下
//获取so中的基址
function hook_get_address(){
    var module1 = Process.findModuleByName('libencryptlib.so') //获取到对象
    console.log(JSON.stringify(module1),module1.base) //module.base 获取基址
    var module2 = Process.getModuleByName('libencryptlib.so') 
    console.log(JSON.stringify(module2),module2.base)
    var addr = Module.findBaseAddress('libencryptlib.so') //获取指针
    console.log('addr',addr)
    //Process.enumerateModule 获取so文件对象数组
    //也可以通过遍历获取基址
    //之后加偏移
    var funcaddr = addr.add(0x1F9EC)
    var addr1 =  0x768285f000 //这是一个数字不是指针，使用ptr转换成指针
    console.log(funcaddr)
    console.log(ptr(addr1).add(0x1F9EC))
}   




//有地址获取模块
function hook_address_by_module(){
    var module1 = Process.findModuleByAddress('0x768285f000')
    console.log(JSON.stringify(module1))
    var module2 = Process.getModuleByAddress('0x768285f000')
    console.log(JSON.stringify(module2))

}

//有手就行
function hook_naticve_addr(address_){
    var module_ = Process.findModuleByAddress(address_)
    Interceptor.attach(address_,{
        onEnter:function(args){
            console.log("call",module_.name,"!",ptr(address_).sub(module_.base)) //打印偏移量
            this.args =args
            console.log("args:",args)
        },
        onLeave:function(retval){
            console.log("result:",this.args)
        },

    })
}

//解决okhttp3自带的ssl检测
function hook_ssl_okhttp3(){
    Java.perform(function(){
        var cer = Java.use('okhttp3.CertificatePinner')
        cer.check.overload('java.lang.String','java.util.List').implementation = function() {
            console.log(1)
        }
    })
}


//打印堆栈
function showStacks() {
    Java.perform(function(){
        console.log(
            Java.use('android.util.Log').getStackTraceString(
                Java.use('java.lang.Throwable').$new()
            )
        )
    })
}
//过简单的root
//吐司
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

//HOOK STRING
function hook_string(){
    Java.perform(function(){
        var hook_string = Java.use('java.lang.String')
        for(var k =0;k<hook_string['getBytes'].overloads.length;k++){
            hook_string.getBytes.overloads[k].implementation = function(argumensts){
                showStacks()
                return this.getBytes.apply(this,argumensts)
            }
        }
    })

}

//jnitrace
//pip install jnitrace
//最好记录一下版本 jnitrace不太稳定
//jnitrace -l so1的名字 -l so2的名字 包名
//-m指定启动模式 attach 或者spawn 默认为spawn
//-R ip：port 通过网络链接frida-server
//-o 输出到指定位置 json 


//解决ollvm加密
//如果字符串在jni中就可以用jnitrace 缺点只能用于jni函数
//找基址和偏移，打印 缺点麻烦 加密的字符串太多了
//sodump，dump内存中已经解密的数据 缺点需要修复
//分析so中的字符串解密函数然后还原
// D060
function solove_ovm(){
    var addr = Module.findBaseAddress('liblogin_encrypt.so')
    console.log(addr)
    console.log(hexdump(addr.add(0xD060)))
}


//sodump
function dump_so(so_name){
    Java.perform(function(){
        var currentapp = Java.use("android.app.ActivityThread").currentApplication()
        var dir = currentapp.getApplicationContext().getFilesDir().getPath()
        var libso = Process.getModuleByName(so_name)
        console.log("[name]",libso.name)
        console.log("[base]",libso.base)
        console.log("[size]",ptr(libso.size))
        console.log("[path]",libso.path)
        var file_path = dir +"/" + libso.name +"_" + libso.base +"_"+ptr(libso.size)+".so"
        var file_handle = new File(file_path,"wb")
        if (file_handle && file_handle != null){
            Memory.protect(ptr(libso.base),libso.size,"rwx") //首先给最大的权限，修改内存中的权限，frida api
            var libso_buffer = ptr(libso.base).readByteArray(libso.size)
            file_handle.write(libso_buffer)
            file_handle.flush()
            file_handle.close()
            console.log("[dump]",file_path)
        }
    })
}

//so修复使用sofixer
//so修复好后不能再运行了，但是可以进行静态分析