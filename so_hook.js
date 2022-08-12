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