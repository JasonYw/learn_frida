


function print_arg(addr){
    var module = Process.findRangeByAddress(addr)
    if(module != null) return hexdump(addr) + "\n"
    return ptr(addr) + "\n"
}


function hook_so_func(addr,paramsnum,relativePtr){
    Interceptor.attach(addr,{
        onEnter:function(args){
            this.logs = []
            this.params =[]
            for(var i=0;i<paramsnum;i++){
                this.params.push(args[i])
                this.logs.push("args"+i+"-onEnter:"+print_arg(args[i]))
            }
        },
        onLeave:function(retval){
            for(var i=0;i<paramsnum;i++){
                this.logs.push("args"+i+"-onLeave:"+print_arg(this.params[i]))
            }
            this.logs.push("retval onLeave=>"+print_arg(retval)+"\n")
            console.log("funcaddr:",addr.toString(16),"relativePtr:",relativePtr.toString(16),"====>")
            console.log(this.logs)
            console.log('====================================================================\n')
        }
    })
}



function hook_suspected_function(targetSo) {
    const funcs = [0x1fec,0x212c,0x22bc,0x2454,0x3350,0x46c0,0x4a4c,0x4c54,0x596c,0x5ae4,0x6044,0x672c,0x6fc4,0x71fc,0x7468,0x7624,0x78b0,0x79dc,0x7be8,0x8450,0x8734,0x8ad8,0x8de0,0x8f94,0x904c,0x916c,0xa188,0xa2f0,0xa6d4,0xbf0c,0xc038,0xc528,0xc7bc,0xca3c,0xcd1c,0xd300,0xd44c,0xd718,0xd86c,0xde74,0xe47c,0xea5c,0xf064,0xf66c,0xf7fc,0xfb40,0xfcdc,0xfebc,0x1007c,0x10b90,0x10f04,0x11464,0x115f0,0x11dcc,0x122b4,0x12940,0x12a4c,0x12ccc,0x145c4,0x146ec,0x14d58,0x15388,0x15ba8,0x15be4,0x15c7c,0x15d54,0x15db4,0x15e14,0x15f1c,0x169f8,0x16a74,0x16b50,0x16b8c,0x177cc,0x17884,0x18328,0x18368,0x18948,0x18acc,0x18e34,0x190e4,0x19204,0x195ac,0x199dc,0x19b6c,0x19d2c,0x1a0f4,0x1a0fc,0x1a10c,0x1a11c,0x1a140,0x1a2ec]
    for (var i =0;i<funcs.length;i++) {
        var funcPtr =targetSo.add(funcs[i])
        hook_so_func(funcPtr,6,funcs[i])
    }
}


function main() {
    var targetSo = Module.findBaseAddress("libNativeHelper.so")
    hook_suspected_function(targetSo)
}

main()
        