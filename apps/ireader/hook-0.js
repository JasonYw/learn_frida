
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





hook_RegisterNatives()
