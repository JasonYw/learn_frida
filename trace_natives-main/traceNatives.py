# -*- coding:utf-8 -*-
import os
from idaapi import plugin_t
from idaapi import PLUGIN_PROC
from idaapi import PLUGIN_OK
import ida_nalt
import idaapi
import idautils
import idc
import time
from copy import deepcopy





# 获取SO文件名和路径
def getSoPathAndName():
    fullpath = ida_nalt.get_input_file_path()
    filepath,filename = os.path.split(fullpath)
    return filepath,filename

# 获取代码段的范围
def getSegAddr():
    textStart = []
    textEnd = []

    for seg in idautils.Segments():
        if (idc.get_segm_name(seg)).lower() == '.text' or (
        idc.get_segm_name(seg)).lower() == 'text':
            tempStart = idc.get_segm_start(seg)
            tempEnd = idc.get_segm_end(seg)

            textStart.append(tempStart)
            textEnd.append(tempEnd)

    return min(textStart), max(textEnd)


class traceNatives(plugin_t):
    flags = PLUGIN_PROC
    comment = "traceNatives"
    help = ""
    wanted_name = "traceNatives"
    wanted_hotkey = ""

    def init(self):
        print("traceNatives(v0.1) plugin has been loaded.")
        return PLUGIN_OK

    def run(self, arg):
        # 查找需要的函数
        ea, ed = getSegAddr()
        search_result = []
        for func in idautils.Functions(ea, ed):
            try:
                functionName = str(idaapi.ida_funcs.get_func_name(func))
                if len(list(idautils.FuncItems(func))) > 10:
                    # 如果是thumb模式，地址+1
                    arm_or_thumb = idc.get_sreg(func, "T")
                    if arm_or_thumb:
                        func += 1
                    search_result.append(hex(func))
            except:
                pass
        
        search_result_cp = deepcopy(search_result)
        so_path, so_name = getSoPathAndName()
        search_result = [f"-a '{so_name}!{offset}'" for offset in search_result]
        search_result = " ".join(search_result)

        script_name = so_name.split(".")[0] + "_" + str(int(time.time())) +".txt"
        save_path = os.path.join(so_path, script_name)
        with open(save_path, "w", encoding="utf-8")as F:
            F.write(search_result)

        self.build_js(so_name,search_result_cp,so_path)
        print("使用方法如下：")
        print(f"frida-trace -UF -O {save_path}")


    def build_js(self,so_name,search_result,so_path):
        '''
            自功能
        '''
        PLAIN_TEXT ='''


function print_arg(addr){
    var module = Process.findRangeByAddress(addr)
    if(module != null) return hexdump(addr) + "\\n"
    return ptr(addr) + "\\n"
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
            this.logs.push("retval onLeave=>"+print_arg(retval)+"\\n")
            console.log("funcaddr:",addr.toString(16),"relativePtr:",relativePtr.toString(16),"====>")
            console.log(this.logs)
            console.log('====================================================================\\n')
        }
    })
}



function hook_suspected_function(targetSo) {
    const funcs = {{ funcs }}
    for (var i =0;i<funcs.length;i++) {
        var funcPtr =targetSo.add(funcs[i])
        hook_so_func(funcPtr,6,funcs[i])
    }
}


function main() {
    var targetSo = Module.findBaseAddress("{{ soname }}")
    hook_suspected_function(targetSo)
}

main()
        '''
        if search_result:
            PLAIN_TEXT = PLAIN_TEXT.replace("{{ soname }}",so_name) 
            search_result =f"[{','.join(list(map(lambda x:str(x),search_result)))}]"
            PLAIN_TEXT = PLAIN_TEXT.replace("{{ funcs }}",search_result)
            script_name = f'{so_name.split(".")[0]}_traceNatives_{str(int(time.time()))}.js'
            save_path = os.path.join(so_path, script_name)
            with open(save_path, "w", encoding="utf-8")as F:
                F.write(PLAIN_TEXT)



   


    def term(self):
        pass


def PLUGIN_ENTRY():
    return traceNatives()
