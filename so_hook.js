//https://github.com/gchq/CyberChef/releases

function stringToBytes(str){
    return hexToBytes(stringToHex(str));
}

// Convert a ASCII string to a hex string
function stringToHex(str) {
    return str.split("").map(function(c) {
        return ("0" + c.charCodeAt(0).toString(16)).slice(-2);
    }).join("");
}

function hexToBytes(hex) {
    for (var bytes = [], c = 0; c < hex.length; c += 2)
        bytes.push(parseInt(hex.substr(c, 2), 16));
    return bytes;
}

// Convert a hex string to a ASCII string
function hexToString(hexStr) {
    var hex = hexStr.toString();//force conversion
    var str = '';
    for (var i = 0; i < hex.length; i += 2)
        str += String.fromCharCode(parseInt(hex.substr(i, 2), 16));
    return str;
}

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


//so是何时加载的
//java层代码加载，执行 某个函数时 类加载了 加载所调用的so


//修改数值参数 使用ptr 和 replace
//165C libxiaojianbang.so
function hook_change_int(){
    var addr = Module.findBaseAddress("libxiaojianbang.so")
    var funcaddr = addr.add(0x165C)
    console.log(funcaddr)
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            args[2] = ptr(1000) //修改参数 指针给他一个指针 new NativePointer
            console.log(args[2],args[3],args[4])
        },
        onLeave:function(restval){
            restval.replace(1000) //修改返回值
            console.log(restval.toInt32()) //输出返回值,
        }
    })
}


//修改字符串-1
//1D68 libxiaojianbang.so
function hook_change_str_1(){
    var addr = Module.findBaseAddress("libxiaojianbang.so")
    var funcaddr = addr.add(0x1D68)
    console.log(funcaddr)
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            var newstr = "test"
            //修改字符串 明文 arg[1]
            //1.直接写内存，因为 arg[1]已经是指针了，所以直接写入字节数组,字符串末尾结束符00
            //这种方式有缺陷，新字符串不能超过原字符串的长度，会占用内存，直接写内存要考虑 大小问题，会影响其他函数
            //字符串结尾要加00
            args[1].writeByteArray(hexToBytes(stringToHex(newstr) + "00"))
            //修改数字直接ptr
            args[2] = ptr(newstr.length)
            console.log(hexdump(args[1]))
            console.log(args[2].toInt32())

        },
        onLeave:function(restval){
            console.log(hexdump(restval))

        }
    })
}
//修改字符串-2
//字符串地址38A1
function hook_change_str_2(){
    var addr = Module.findBaseAddress("libxiaojianbang.so")
    var funcaddr = addr.add(0x1D68)
    console.log(funcaddr)
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            var newstr = "test"
            //修改字符串 明文 arg[1]
            //1.把so中已有的字符串传给函数
            //不需要使用ptr 因为已经是个指针了
            //缺点必须是已有的
            args[1] = addr.add(0x38A1)

            //修改数字直接ptr
            args[2] = ptr(addr.add(0x38A1).readCString().length)
            console.log(hexdump(args[1]))
            console.log(args[2].toInt32())

        },
        onLeave:function(restval){
            console.log(hexdump(restval))

        }
    })
}
//修改结构体
//针对md5算法 直接改buffer，ctx的结构
function hook_change_struct(){
    var addr = Module.findBaseAddress("libxiaojianbang.so")
    var funcaddr = addr.add(0x1D68)
    console.log(funcaddr)
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            //ctx 位参数0

            this.args0 = args[0]
            // console.log(hexdump(args[0]))
        },
        onLeave:function(restval){
            //由于进入函数的时候才开始拷贝，所以要在onlevae时查看结构体
            //前8个字节位长度,后面的16个字节是初始化魔术
            //memcpy((void *)(a1 + 24 + v5), a2, v4); ida代码已经告诉我们偏倚了24位
            //由于字节数一样所以不需要加00
            console.log(hexdump(this.args0.add(24).writeByteArray(stringToBytes("dadajianbang"))))
        }
    })
}

//构建新的字符串
function hook_create_str(){
    var addr = Module.findBaseAddress("libxiaojianbang.so")
    var funcaddr = addr.add(0x1D68)
    console.log(funcaddr)
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            //需要使用frida提供的内存操作函数
            //Memory.alloc 操作内存
            //Memory.allocUtf8String 操作字符串 操作中文推utf8 英文无所谓
            //Memory.allocAnsiString 操作字符串
            //Memory.allocUtf16String 操作字符串
            this.args0 = args[0]
            var newstr = "dadadajianbangdadadadadadadadad"
            //直接返回指针，一定要先赋值给一个变量
            //newstrpointer为局部变量，所以onEnter结束后会被回收
            //要把newstrpointer定义为全局变量或者使用this
            this.newstrpointer = Memory.allocUtf8String(newstr)
            args[1] = this.newstrpointer
            args[2] = ptr(newstr.length)
            console.log(hexdump(args[1]))
            console.log(args[2].toInt32())
        },
        onLeave:function(restval){
            console.log(hexdump(this.args0))
        }
    })

}

//获取指针参数返回值
//c语言把参数当返回值使用
function hook_get_pointer_return(){
    var addr = Module.findBaseAddress("libxiaojianbang.so")
    var funcaddr = addr.add(0x3540)
    console.log(funcaddr)
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            //参数0为ctx
            this.args1 = args[1]
        },
        onLeave:function(restval){
            //由于函数本身返回的就是字节形式 所以要看左边，字符串形式看右边
            //如果是二级指针，使readpointer 之后再hexdump
            console.log(hexdump(this.args1))

        }
    })
}

function hook_func(addr){
    Interceptor.attach(addr,{
        onEnter:function(args){
        },
        onLeave:function(retval){
        }
    })
}

//hook_dlopen
//想要hook so需要先加载so才能hook
//但是有一些函数只有so首次加载时就会执行 以后就不执行了
//监控so何时会加载，加载就hook，dlopen
//高版本 android_dlopen_ext
//低版本 dlopen
//合并 兼容高低版本
function hook_dlopen(addr,soname){
    // var soname = "libxiaojianbang.so"
    // var dlopen = Module.findExportByName(null,"dlopen")
    // console.log(JSON.stringify(Process.getModuleByAddress(dlopen)))
    // var android_dlopen_ext = Module.findExportByName(null,"android_dlopen_ext")
    // console.log(JSON.stringify(Process.getModuleByAddress(android_dlopen_ext)))
    Interceptor.attach(addr,{
        onEnter:function(args){
            // console.log(hexdump(args[0])) //输出的是so的path
            var sopath = args[0].readCString()
            if(sopath.indexOf(soname)!=-1){
                //说明已经记载了
                this.hook = true
            }
        },
        onLeave:function(retval){
            if (this.hook){
                //离开的时候真正进行hook
                //hook_func(addr)
            }
        }
    })
}


//内存读写
//读取字符串
function read_str(){
    var soaddr = Module.findBaseAddress("libxiaojianbang.so")
    console.log(hexdump(soaddr.add(0x38A1)))
    //读取字符串
    console.log(soaddr.add(0x38A1).readCString())
    //读取多少个字节数组
    console.log(soaddr.add(0x38A1).readByteArray(32))
    //写内存,
    //writeByteArray可以放js数组也可以放字节数组
    console.log(soaddr.add(0x38A1).writeByteArray())
    // console.log(soaddr.add(0x38A1).writeInt())
    //申请内存
    //申请13字节的内存
    var myaddr = Memory.alloc(13)
    //\0 表示字符串结尾
    myaddr.writeByteArray(stringToBytes("xiaojianbang\0"))
    //如果只写字符串用
    var straddr = Memory.allocUtf8String("xiaojianbang")
    console.log(straddr.readCString())
    //如果某些地方无法读写内存成功，要修改内存地址权限
    //第一个给so的基址，第二个给多大的内存，第三个 更改权限
    Memory.protect(straddr,13,'rwx')

}

//汇编分arm64 x86 x64
//64为寄存器开头为x，32位的寄存器开头位w
//sp是栈寄存器，栈是放函数 参数 局部变量的
//SUB SP 代表开辟栈空间 栈是往低地址发展的 减的时候是以0x10 的倍数发展的，提升的空间必须是16字节的倍数
//STR 把寄存器 保存到内存去 把参数保存到栈空间里去
//LDR 读内存 汇编的操作 不能两边都是 内存 至少有一边是寄存器
//ADD sp 代表函数结束 ADD 与 SUB 的值要一样 函数结束要降低堆栈
//nop 指令不执行代码
//RET 返回了 ret一定要在 堆栈平衡后ret
//利用frida修改指令，汇编级别
// 165c
//利用armconverter 将汇编指令变成机器码 https://armconverter.com/
function read_opcode(){
    var soaddr = Module.findBaseAddress("libxiaojianbang.so")
    console.log(hexdump(soaddr.add(0x1684))) //左边读取到的都是机器码
    var needchangeaddr = soaddr.add(0x1684)
    Memory.protect(needchangeaddr,4,'rwx')
    needchangeaddr.writeByteArray(hexToBytes("0001094B"))
    console.log(hexdump(needchangeaddr))
    //将机器码转会成汇编指令
    console.log(Instruction.parse(needchangeaddr).toString())
    //获取下一条代码的地址
    console.log(Instruction.parse(needchangeaddr).next)

    //frida提供了一些api帮助写汇编代码
    //将soaddr.add(0x167C) 这个地址使用nop指令替换
    new Arm64Writer(soaddr.add(0x167C)).putNop()
    console.log(Instruction.parse(soaddr.add(0x167C)).toString())



}

function meomery_patch_code(){
    var soaddr = Module.findBaseAddress("libxiaojianbang.so")
    var needchangeaddr = soaddr.add(0x1684)
    //三个参数 第一个是地址 第二个是大小 第三个是回调函数
    //code 也是一个指针
    //相当于当汇编执行到needchangeaddr的时候，执行回调函数中的代码,但是如果回调函数没有操作则接着执行原来的汇编
    Memory.patchCode(needchangeaddr,4,function(code){
        var writer = new Arm64Writer(code,needchangeaddr)
        writer.putBytes(hexToBytes("0001094B")) //直接写入机器码 sub wo,w8,w9
        writer.flush() //写入保存
    })
    console.log(Instruction.parse(needchangeaddr).toString())
}


//so层主动调用
//首先拿到函数地址
//声明函数指针
//通过函数指针传递参数主动调用获取返回值
//主动调用libxiaojianbang.so中的 jstring2cstr
//此函数传递了一个jnienv 一个jclass 一个jstring
function use_so(){
    //获取函数地址
    var soaddr = Module.findBaseAddress("libxiaojianbang.so")
    var funcaddr = soaddr.add(0x124C)
    //声明函数指针,函数地址，返回值类型，参数数组也是类型，jnienv是指针类型
    var jstring =  new NativeFunction(funcaddr,"pointer",['pointer','pointer'])
    //构建参数,以下两个都可以的到javaenv
    // Java.vm.getEnv()，这个env是frida包装过的
    // 若没有拿到jenv 则可以封装到java.perform中
    var env = Java.vm.tryGetEnv()
    console.log(JSON.stringify(env))
    //获取jstring
    var jstr = env.newStringUtf("xiaojianbang")
    console.log(jstr)
    //主动调用生成结果
    //返回的是指针
    //在内存中看到的字符串都是cstring 都不是 jstring
    var result = jstring(env,jstr)
    console.log(result.readCString())
}

//hook libc 读写文件
//frida 没有提供读的api
//由于frida没有提供读的api，所以需要自己去hook，一般c语言库函数都在lib.so中
function write(){
    //获取地址
    var fopenaddr =  Module.findExportByName("libc.so","fopen")
    var fputsaddr =  Module.findExportByName("libc.so","fputs")
    var fcloseaddr =  Module.findExportByName("libc.so","fclose")
    console.log(fopenaddr,fputsaddr,fcloseaddr)
    //声明函数指针
    var fopen = new NativeFunction(fopenaddr,'pointer',['pointer','pointer'])
    var fputs = new NativeFunction(fputsaddr,'int',['pointer','pointer'])
    var fclose = new NativeFunction(fcloseaddr,'int',['pointer'])
    //声明参数,由于不能用jsstring，并且函数接收的是pointer，c语言的字符串所以要生成
    var filepath = Memory.allocUtf8String("/data/data/com.xiaojianbang.app/wechat.log")
    var mode = Memory.allocUtf8String("w")
    var data = Memory.allocUtf8String("xiaojianbang\n")
    //主动调用
    var filepoint = fopen(filepath,mode)
    console.log(filepoint)
    fputs(data,filepoint)
    fclose(filepoint)
}


//so层打印堆栈
//obj传递this即可
function print_trace(obj){
    //FUZZY 是模糊的 但是对所有的so都有效，但是不准确
    //ACCURATE 是准确的 但是并不是对所有so都有效
    console.log(Thread.backtrace(obj.context,Backtracer.FUZZY).map(DebugSymbol.fromAddress).join('\n')+'\n')
}

//jni函数hook
//jni函数均来自 libart.so文件 ，可以在这个文件中找导出表
//libart.so 需要从手机中拖出来 手机版本不同 位置不同
//10.0以下 /system/lib64 下面
//10.0以上 /system 目录下 直接 find -name libart.so 找到对应版本的so 64位或者32位
//也可以自己计算函数地址，定位jninativeinterface这个结构体，找到函数指针计算偏移量

function hook_jni_byenumerate(){
    //jni函数在func中可以通过枚举符号表
    var symbols = Process.getModuleByName('libart.so').enumerateSymbols()
    var newStringUtfaddr = null
    for (var i =0;i<symbols.length;i++){
        if(symbols[i].name.indexOf("CheckJNI") == -1 && symbols[i].name.indexOf("NewStringUTF") != -1){
            newStringUtfaddr  = symbols[i].address
        }
    }
    Interceptor.attach(newStringUtfaddr,{
        onEnter: function(args){
            //args[0]为jnienv
            print_trace(this) //打印so堆栈信息
            console.log(args[1].readCString())
        },
        onLeave:function(retval){}

    })

}
//计算地址方式来hook jni
//首先获取env结构体
//64位 指针8字节
function hook_jni_bycount(){
    // console.log(JSON.stringify(Java.vm.tryGetEnv()))
    //Java.vm.tryGetEnv().handle 是jnienv结构体的指针，也就是双指针，所以要readPointer()
    // console.log(hexdump(Java.vm.tryGetEnv().handle.readPointer()))
    var env = Java.vm.tryGetEnv().handle.readPointer()
    //结构体里的都是记录的函数的指针的地址，一个指针在64位中是8字节所以，要获取函数的地址还要进行readPointer
    var funcaddr = env.add(0x48).readPointer()
    //获取函数的第一个汇编指令 提升堆栈 验证一下 也可以不要
    console.log(Instruction.parse(funcaddr).toString())
    //开始hook
    Interceptor.attach(funcaddr,{
        onEnter:function(args){
            console.log(args[1].readCString())

        },
        onLeave:function(retval){

        }
    })


}

//主动调用jni函数
//使用frida封装的函数来调用jni
//jni里为大驼峰 js中为小驼峰 jni中第一个参数都是env，frida都是给隐藏好了
function call_jni(){
    //使用newStringUtf 创建jstring 获取的是jsting，所以需要转换
    var jstring = Java.vm.tryGetEnv().newStringUtf("xiaojianbang")
    console.log(jstring)
    //主动调用getStringUtfChars jenv方法讲jstring转换成cstring，之后读取cstring
    var cstring = Java.vm.tryGetEnv().getStringUtfChars(jstring).readCString()
    console.log(cstring)
}
//如果frida没有封装的函数
//首先要获取函数地址 获取jni函数地址也有两种方式，枚举或者计算
function call_jni2(){
    //枚举方法
    var funcaddr = null
    var symbols = Process.getModuleByName('libart.so').enumerateSymbols()
    for(var i =0;i<symbols.length;i++){
        if(symbols[i].name.indexOf("CheckJNI") == -1 && symbols[i].name.indexOf("NewStringUTF") != -1){
            funcaddr = symbols[i].address
        }
    }
    //使用NativeFunction 创建一个方法，接受函数的地址，返回值类型，参数类型数组，第一个参数为jenv
    var func = new NativeFunction(funcaddr,'pointer',['pointer','pointer'])
    //要传真正的jenv，并且要传字符串的指针不是字符串
    var jstring = func(Java.vm.tryGetEnv().handle,Memory.allocUtf8String("xiaojianbang"))
    console.log(jstring)
    //计算地址
    var envaddr =  Java.vm.tryGetEnv().handle.readPointer()
    var funcaddr = envaddr.add(0x548).readPointer()
    var getstringutfchar_func = new NativeFunction(funcaddr,'pointer',['pointer','pointer','pointer'])
    //jsting 已经是指针了
    var cstring =  getstringutfchar_func(Java.vm.tryGetEnv().handle,jstring,ptr(0))
    console.log(cstring.readCString())
}



//二级指针的构造
//17D0 xiaojiaobang.so
function double_pointer(){
    var soaddress = Module.findBaseAddress("libxiaojianbang.so")
    var xiguastraddr = soaddress.add(0x17D0)
    var xiguastr =  new NativeFunction(xiguastraddr,'int64',['pointer'])
    //一级指针
    var first_poniter  = Memory.allocUtf8String("xiaojianbang") 
    console.log(hexdump(first_poniter))
    //64位指针是8字节 
    var second_pointer = Memory.alloc(8).writePointer(first_poniter)
    console.log(hexdump(second_pointer))
    xiguastr(second_pointer)
    //函数把指针当成参数也当成返回值，因为是指针
    console.log(hexdump(first_poniter))
    console.log(hexdump(second_pointer))


}

//如果确认native函数在哪个so中
//静态分析不靠谱
//hook系统函数获取绑定的函数地址，之后再得到so地址
//动态注册 RegisterNatives jni函数
//静态注册，名字不能混淆必须按照命名规则，hook dlsym

function hook_dlsym(){
    //静态注册用这个方法
    //dlsym在固定的so中
    //dlsym 有两个参数 第一个放的是soinfo的结构体，第二个是字符串 要找的symble，返回值是symble地址
    var dlsymaddr = Module.findExportByName("libdl.so","dlsym")
    Interceptor.attach(dlsymaddr,{
        onEnter:function(args){
            this.args1 = args[1]    
        },
        onLeave:function(retval){
            //retval 返回的是地址
            var module_ = Process.findModuleByAddress(retval)
            if(module_==null) return;
            console.log('=======================')
            // console.log('func_name =>',this.args1.readCString(),module_.name,retval,retval.sub(module_.base))
            console.log('func_name =>',this.args1.readCString())
            console.log('so_name =>',module_.name)
            console.log('func_address =>',retval)
            console.log('funcaddr_sub_soaddr =>',retval.sub(module_.base))
            console.log('=======================\n')
        }
    })


}

//快速定位动态注册函数
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
    // console.log(registernativesaddr)
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

//inlinehook 
//在32位so中 是不稳定的 
//汇编级别的hook hook某一行汇编的
function inlinehook(){
    //首先获取基址
    var soaddr = Module.findBaseAddress('libxiaojianbang.so')
    var hookaddr = soaddr.add(0x17BC)
    Interceptor.attach(hookaddr,{
        onEnter:function(args){
            //没有参数和返回值的概念
            //输出寄存器x8的值
            console.log('onEnter:',this.context.x8)
        
        
        },
        onLeave:function(retval){
            console.log('onLeave:',this.context.x8.toInt32())
            //与7进行位移
            console.log(this.context.x8 & 7)
        }
    })
  
}

// 1B70
//inline hook 读取指针类型
function inlinehook_point(){
    //首先获取基址
    var soaddr = Module.findBaseAddress('libxiaojianbang.so')
    var hookaddr = soaddr.add(0x1B70)
    Interceptor.attach(hookaddr,{
        onEnter:function(args){
            console.log('onEnter:',hexdump(this.context.x1))
        },
        onLeave:function(retval){
        }
    })
  
}

//源码分析 art下的system.LOADLIBRARY
//安卓在线源码查看http://aospxref.com
//了解三个东西init initarry jnionload 什么时候被调用的
//init initarry 是在dlopen内部调用的 jnionload 是在 dlopen调用后调用的
//hook init initarry 等so加载完毕
//调用dlopn后会调call_constructors 在call_constructors中会调用init init_array
//最佳hook点是call_constructors
//这个函数是与加载so相关的 在linker64中 对于64位的机器来说 system/bin/linker64
//在这个函数执行之间就要hook 因为这个函数之前so已经加载完毕了，可以得到so基址
//首先要hook dlopen要确定so是哪个

//思路 如果要hook initarray，因为 initarry 是在constructors调用的， 就要hook constructors,又因为constructors是在dlopen函数内部调用的，如果只hook dlopen 是无法hook到的
//在dlopen on enter hook时 so没有加载，在on leave hook 已经没有意义了 因为constructors已经执行完了，先用dlopen判断是否已经加载目标so，已经加载了的话就可以hook constructors

function hook_initarray(){
    function hook_initarray_by_hook_constructors(){
        var symbols =  Process.getModuleByName('linker64').enumerateSymbols()
        var constructorsaddr = null
        var is_hooked = false
        for (var i=0;i<symbols.length;i++){
            var symbol = symbols[i]
            if(symbol.name.indexOf('__dl__ZN6soinfo17call_constructorsEv') != -1){
                constructorsaddr = symbol.address
            }
        }
        console.log(constructorsaddr)
        Interceptor.attach(constructorsaddr,{
            onEnter:function(args){
                if(!is_hooked){
                    var soaddr =  Module.findBaseAddress('libxiaojianbang.so')
                    //要hook的init array函数地址1C54 1C7C   1C2C
                    var func1  = soaddr.add(0x1C54)
                    var func2  = soaddr.add(0x1C7C)
                    var func3  = soaddr.add(0x1C2C)
                    Interceptor.replace(func1,new NativeCallback(function(a){
                        console.log('func1 is replaced')
                    },'void',['void']))
                    Interceptor.replace(func2,new NativeCallback(function(a){
                        console.log('func2 is replaced')
                    },'void',['void']))
                    Interceptor.replace(func3,new NativeCallback(function(a){
                        console.log('func3 is replaced')
                    },'void',['void']))
                    is_hooked = true
                }
    
            },
            onLeave:function(retval){}
        })
    
    
    }
    //这一步是确定要hook的so,通过hook dlopen
    // function hook_initarray_find_target_so(){
    function hook_dlopen(addr,soname,callback){
        Interceptor.attach(addr,{
            onEnter:function(args){ 
                var sopath = args[0].readCString()
                if(sopath.indexOf(soname) != -1){
                    callback()
                }
            },
            onLeave:function(retval){}
        })

    }
    var dlopen = Module.findExportByName('libdl.so','dlopen')
    var android_dlopen_ext = Module.findExportByName('libdl.so','android_dlopen_ext')
    hook_dlopen(dlopen,'libxiaojianbang.so',hook_initarray_by_hook_constructors)
    hook_dlopen(android_dlopen_ext,'libxiaojianbang.so',hook_initarray_by_hook_constructors)
    // }
}



//jnionload 是在dlopen完全加载后开始的，所以在dlopen onleave的时候开始的
function hook_JNIonload(){
    function hook_dlopen(addr,soname,callback){
        Interceptor.attach(addr,{
            onEnter:function(args){ 
                var sopath = args[0].readCString()
                if(sopath.indexOf(soname) != -1){
                    this.hook = true
                }
            },
            onLeave:function(retval){
                if(this.hook) callback()
            }
        })

    }
    function hook_func_jnionload(){
        //1CCC  
        var soadder = Module.findBaseAddress('libxiaojianbang.so')
        var funcaddr = soadder.add(0x1CCC)
        Interceptor.replace(funcaddr,new NativeCallback(function(){
            console.log('this func is replaced')
        },'void',[]))

    }

    var dlopen = Module.findExportByName('libdl.so','dlopen')
    var android_dlopen_ext = Module.findExportByName('libdl.so','android_dlopen_ext')
    hook_dlopen(dlopen,'libxiaojianbang.so',hook_func_jnionload)
    hook_dlopen(android_dlopen_ext,'libxiaojianbang.so',hook_func_jnionload)
}


//一般实时检测都是放在hook_pthread_create 中开启一个线程去处理
//hook它来检查开启了哪些子线程，把和检测相关的子线程干掉
//pthread_create一般是在libc.so中
//通过查看输出可以看到除了系统的so启动的线程，app自己启动的线程的函数地址以及函数偏移，以及so名字，定位
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

//打印so的函数栈
//env 和 env.handle 可以在一定程度上通用，或者自动完成转换，使用frida封装的jni相关的api，必须使用env当参数需求jnienv*时，可以使用env和env.handle
//21B0 MD5 xiaojianbang.so
function hook_xiaojianbangmd5(){
    var soaddr = Module.findBaseAddress('libxiaojianbang.so')
    var md5_upodatefunc = soaddr.add(0x21B0)
    Interceptor.attach(md5_upodatefunc,{
        onEnter:function(args){
            console.log("=========================================================================")
            console.log(soaddr)
            //打印函数栈就这一行 map详单与把前面的地址 依次给到DebugSymbol.fromAddress
            console.log(Thread.backtrace(this.context,Backtracer.ACCURATE).map(function(value){
                var symbol = DebugSymbol.fromAddress(value) 
                //map返回的还是数组
                if(symbol.moduleName === 'libxiaojianbang.so'){
                    return symbol + " offset: " + value.sub(soaddr)
                }
                return symbol
            }).join('\n'))
        },
        onLeave:function(retval){}
    })
}

//replcae 替换函数
//在进行hook必须调用原函数 如果不想调用原函数 就直接replace
function hook_add_by_replace(){
    var soaddr = Module.findBaseAddress('libxiaojianbang.so')
    var addfunc = soaddr.add(0x1A0C) //add
    //Interceptor.replace 两个参数都是指针，一个是目标函数指针，一个是要替换的函数指针
    //因为new NativeCallback 返回的是函数指针所以直接这么用
    // Interceptor.replace(addfunc,new NativeCallback(function(){
    //     console.log(100)
    // },'void',[]))

    //构建函数，主动调用
    var add =  new NativeFunction(addfunc,'int',['pointer','pointer','int','int','int'])

    //一般替换函数时要保证返回值 最好是同一个类型
    //如果返回值类型不一样 
    Interceptor.replace(addfunc,new NativeCallback(function(a,b,c,d,e){
        console.log(a,b,c,d,e)
        var oldresult = add(a,b,c,d,e)
        console.log(oldresult)
        return oldresult
    },'int',['pointer','pointer','int','int','int']))
}



//hexdump
function hook_xiaojianbangmd5_hexdump(){
    var soaddr = Module.findBaseAddress('libxiaojianbang.so')
    var md5_upodatefunc = soaddr.add(0x21B0)
    Interceptor.attach(md5_upodatefunc,{
        onEnter:function(args){
            //ansi 输出颜色
            //length 给一个整数字节
            //header 是否要头 
            //offset 偏移多少个字节 从什么地方开始显示 一般offset 为0
            console.log(hexdump(args[1],{offset:0,length:args[2].toInt32(),header:false,ansi:true}))
            console.log("======================================")
        },
        onLeave:function(retval){}
    })
}


//frida-trace+tracenatives
//tracenatives IDA中的插件

//内存读写监控 并不推荐frida 不是很精确 利用了frida 的异常回调 
//原理是 通过权限控制 触发权限异常，之后再通过setExceptionHandler 异常发生时 处理异常，之后解决掉异常 让frida继续执行，解决异常的方式就是修复权限
//如果想监控内存读的情况 就把读权限制空，如果是写就把写制空
function monitor_ram_wr(){
    function _set_read_write_break(){
        //details 为里面的异常信息
        Process.setExceptionHandler(function(details){
            //解决下面主动触发的异常
            console.log(JSON.stringify(details)) // 包含的是错误信息
            console.log("lr",DebugSymbol.fromAddress(details.context.lr))
            console.log("pc",DebugSymbol.fromAddress(details.context.pc))
            //通过修改权限解决异常
            Memory.protect(details.memory.address,Process.pointerSize,'rwx')
            //打印堆栈
            console.log(Thread.backtrace(details.context,Backtracer.ACCURATE).map(DebugSymbol.fromAddress).join('\n')+'\n')
            return true
        })
        var addr = Module.findBaseAddress('libxiaojianbang.so').add(0x3CFD) // 要监控的地址
        Memory.protect(addr,8,'---') //修改的是内存页的权限，之后触发异常，所以修改的是 4096个地址的 所以那一页的访问都会报错
    }
    function _hook_dlopen(addr,soname,callback){
        Interceptor.attach(addr,{
            onEnter:function(args){
                var sopath = args[0].readCString()
                if(sopath.indexOf(soname) != -1){
                    this.hook = true
                }
            },
            onLeave:function(retval){
                if(this.hook) callback()
            }
        })
    }

    //为了监控内存还需要用到dlopen,通过hook dlopen 在一开始去监控内存
    var dlopen = Module.findExportByName('libdl.so','dlopen')
    var android_dlopen_ext = Module.findExportByName('libdl.so','android_dlopen_ext')
    _hook_dlopen(dlopen,'libxiaojianbang.so',_set_read_write_break)
    _hook_dlopen(android_dlopen_ext,'libxiaojianbang.so',_set_read_write_break)
}


//frida检测
//相关文章 https://bbs.pediy.com/thread-217482.htm
//1.ptrace 占坑 开启一个子进程附加主进程 原理一个app进程只能被一个app附加 
//Failed to attach: unable to access process with pid 8961 due to system restrictions; try `sudo sysctl kernel.yama.ptrace_scope=0`, or run Frida as root 提示无法附加 通常就是 ptrac
//解决办法 以spawn方式进行注入 spwan 模式注入成功后 会被kill掉 之后就可以进行frida attach 方式注入 ptrace 是一瞬间的事情
//com.wujie.chengxin 用的是双进程  PID 指定的父进程id 用子进程附加自己
//app 可以双进程 1.守护进程 防止app挂掉 当主进程挂掉 保证 服务不会死  2.子进程附加主进程 目的是 不让别人附加 3.普通的双进程
//2.进程名检测 检测frida-server是否在进程列表里 解决改名字 
//3.端口检测  检测frida-server的端口  frida 可以指定端口
//4.dbus协议通信 向每个端口发送dbus 认证消息 哪个端口回复了reject 就是frida-server 也可以每个端口都试一下 从0-65535端口 过dubs hook strcmp 改参数 或者改返回值 hook strstr
//5.扫描maps文件 maps文件是一个app加载的依赖库  /proc/进程pid/maps
//内存地址 权限 
//749419a000-749419b000 r-xp 00000000 103:1d 3375610                       /data/app/com.xiaojianbang.app-QTWcjBSoZCLsdnHN86PaQw==/lib/arm64/libxiaojianbangA.so
//frida注入时 会注入frida-agent 一个so
// 7490223000-74908d9000 r--p 00000000 103:1d 2523142                       /data/local/tmp/re.frida.server/frida-agent-64.so
// 74908da000-74916c9000 r-xp 006b6000 103:1d 2523142                       /data/local/tmp/re.frida.server/frida-agent-64.so
// 74916c9000-7491764000 r--p 014a4000 103:1d 2523142                       /data/local/tmp/re.frida.server/frida-agent-64.so
// 7491764000-749177b000 rw-p 0153e000 103:1d 2523142                       /data/local/tmp/re.frida.server/frida-agent-64.so
//6.扫描task目录 /proc/进程pid/task
//task目录下的数字代表app代表进程开启的线程
//每个数字目录下面 会有 status文件 文件里会记录线程相关的信息 
//status 中 name为 gdbus 或者gmain 或者 gum-js-loop 或者 pool-frida为 frida注入特征   
//status 中 tracepid 不为  0  代表被附加
//所以一些app会遍历  /proc/进程pid/task/ 目录
//8.通过readlink查看/proc/self/fd /proc/self/task/pid/fd下 打开所有文件 检测是否有frida相关文件
//9.常用frida检测的系统函数 strstr strcmp open read fread readlink
//readlink打开的同时进行读取
//10.扫描内存中是否有frida库特征是否出现 例如 LIBFRIDA
//11.frida-serve 启动后 会 /data/local/tmp/re.frida.server 有这个目录 所以这也是一个监测点 
//hluwa的去掉字符串特征的frida-server 课件里有 主要是去掉了一些字符串的信息
//12.frida检测补充
//riru的特征文件 /system/lib/libmemtrack.so /system/lib/libmemtrack_real.so
//下面都是/proc/进程pid/
//task/xxx/cmdline 检测进程名，防止重打包 cmdline 有包名
//task/xxx/status 检测进程是否被附加 
//task/xxx/stat 检测进程是否被附加 stat 里很多数值 和  status差不多 
//task/xxx/status 检测线程name是否包含frida关键字
//fd/xxx 检测app是否打开的frida相关文件 fd记录app所打开的一些文件
//maps 检测app是否加载依赖库里含有frida
//net/tcp 检测app打开端口
//huluwa
//huluda-server 处理了re.frida.server文件夹以及该文件夹下面的的文件名字，若使用这个server 并不放在 /data/local/tmp目录下就可以不用担心fd和maps检测
//frida-agent相关文章 https://bbs.pediy.com/thread-269866.htm 关于frida持久化的知识


//frida-gadget 持久化介绍 不需要root权限 
//通过魔改系统来实现frida-gadget持久化，比重打包的方式更通用 脱离pc
//关于编译
//编译报错或者修改文件系统以后，都可以直接make，已经编译的部分会跳过
//make clean 会清楚已经编译的 全部重来 在编译不同的lunch选项时使用
//修改art源码时需要make clean 否则编译出来system/lib 里面的so不变(fart)
//单独编译的system.img 在根目录下
//source build/envsetup.sh
//lunch xxx
//make systemimage -j4
//单独编译某个模块 mmm packages/apps/xiaojianbang
//将文件打包成img镜像 make snod
//更多其它编译方式自行百度
//参考https://wuxiaolong.me/2018/08/15/AOSP3
//这个先跳过不看了缺少学习环境 


//ida 插件 
//https://github.com/polymorf/findcrypt-yara
//pip install yara-python
// https://github.com/L4ys/IDASignsrch
// https://github.com/Pr0214/findhash

