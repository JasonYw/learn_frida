


function print_arg(addr){
    var module = Process.findRangeByAddress(addr)
    if(module != null) return hexdump(addr) + "
"
    return ptr(addr) + "
"
}


function hook_so_func(addr,paramsnum){
    var so_addr = Module.findBaseAddress("libNativeHelper.so")
    var func_addr = so_addr.add(addr)
    Interceptor.attach(func_addr,{
        onEnter:function(args){
            console.log(addr.toString(16),"====>")
            this.logs = []
            this.params =[]
            for(var i=0;i<paramsnum;i++){
                this.params.push(args[i])
                this.logs.push("args-"+i+"-onEnter:"+print_arg(args[i]))
            }
        },
        onLeave:function(retval){
            for(var i=0;i<paramsnum;i++){
                this.logs.push("args-"+i+"-onLeave:"+print_arg(this.params[i]))
            }
            this.logs.push("retval onLeave=>"+print_arg(retval)+"
")
            console.log(this.logs)
            console.log('====================================================================')
        }
    })
}




function monitor_constants(targetSo) {
    let const_array = [];
    let const_name = [];
    let const_addr = [['padding used in hashing algorithms (0x80 0 ... 0)', '0x34008']];

    for (var i = 0; i < const_addr.length; i++) {
        const_array.push({base:targetSo.add(const_addr[i][1]),size:0x1});
        const_name.push(const_addr[i][0]);
    }

    MemoryAccessMonitor.enable(const_array, {
        onAccess: function (details) {
            console.log("\n");
            console.log("监控到疑似加密常量的内存访问\n");
            console.log(const_name[details.rangeIndex]);
            console.log("访问来自:"+details.from.sub(targetSo)+"(可能有误差)");
    }
});
}

function hook_suspected_function(targetSo) {
    const funcs = [['sub_2454', '函数sub_2454疑似哈希函数运算部分。', '0x2454'], ['sub_3350', '函数sub_3350疑似哈希函数运算部分。', '0x3350'], ['sub_4C54', '函数sub_4C54疑似哈希函数运算部分。', '0x4c54'], ['sub_6044', '函数sub_6044疑似哈希函数，包含初始化魔数的代码。', '0x6044'], ['sub_672C', '函数sub_672C疑似哈希函数，包含初始化魔数的代码。', '0x672c'], ['sub_8AD8', '函数sub_8AD8疑似哈希函数，包含初始化魔数的代码。', '0x8ad8']];
    for (var i in funcs) {
        let relativePtr = funcs[i][2];
        let funcPtr = targetSo.add(relativePtr);
        let describe = funcs[i][1];
        let handler = (function() {
        return function(args) {
            console.log("\n");
            console.log(describe);
            console.log(Thread.backtrace(this.context,Backtracer.ACCURATE).map(DebugSymbol.fromAddress).join("\n"));
        };
        })();
        hook_so_func(funcPtr,6)
        //Interceptor.attach(funcPtr, {onEnter: handler});
    }
}


function main() {
    var targetSo = Module.findBaseAddress('libNativeHelper.so');
    // 对疑似哈希算法常量的地址进行监控，使用frida MemoryAccessMonitor API，有几个缺陷，在这里比较鸡肋。
    // 1.只监控第一次访问，所以如果此区域被多次访问，后续访问无法获取。可以根据这篇文章做改良和扩展。https://bbs.pediy.com/thread-262104-1.htm
    // 2.ARM 64无法使用
    // 3.无法查看调用栈
    // 在这儿用于验证这些常量是否被访问，访问了就说明可能使用该哈希算法。
    // MemoryAccessMonitor在别处可能有较大用处，比如ollvm过的so，或者ida xref失效/过多等情况。
    // hook和monitor这两个函数，只能分别注入和测试，两个同时会出错，这可能涉及到frida inline hook的原理
    // 除非hook_suspected_function 没结果，否则不建议使用monitor_constants。
    // monitor_constants(targetSo);

    hook_suspected_function(targetSo);
}

setImmediate(main);
    