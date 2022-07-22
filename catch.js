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


function main() {
    Java.perform(function(){
        // com.bytedance.retrofit2.client.Response.getBody
        var response = Java.use("com.bytedance.retrofit2.client.Response")
        response.getBody.implementation = function(){
            var result = this.getBody()
            var arry = Java.use(result.$className)
            var new_result = Java.cast(result,arry)
            console.log('result =>',new_result,hexToString(bytesToHex(new_result.getBytes())))
            return result
        }

        // var req = Java.use('com.bytedance.retrofit2.client.Request')
        // req.getHeaders.implementation= function(){
        //     var result = this.getHeaders()
        
        //     // var a = JSON.stringify(result)
        //     // var b = JSON.parse(a)
        //     var Map = Java.use('java.util.Collections$UnmodifiableRandomAccessList')
        //     var NewP = Java.cast(result, Map)
        //     console.log('header =>',NewP) 
        //     return result
        // }
        // req.getUrl.implementation = function(){
        //     var result = this.getUrl()
        //     // var a = result.includes('https://aweme.snssdk.com/aweme/v2/video/safety/check/') 
        //     // var b = result.includes('https://bsync.snssdk.com/v2%2Fpipeline?')
        //     // var c = result.includes('https://aweme.snssdk.com/aweme/v1/aweme/stats/')
        //     // var d = result.includes('https://aweme.snssdk.com/service/2/app_log/')
        //     // var e = result.includes('aweme-poi/poi_loc/')
        //     var f = result.includes('https://aweme.snssdk.com/aweme/v2/feed/')
        //     if(f){
        //         console.log('url =>',result)
        //     }
        //     return result
        // }

        // req.getMethod.implementation = function(){
        //     var result = this.getMethod()
        //     console.log('method =>',result)
        //     return result
        // }
        // req.getFirstHeader.overload('java.lang.String').implementation = function(str_){
        //     var result = this.getFirstHeader(str_)
        //     console.log('getFirstHeader args =>',str_)
        //     console.log('getFirstHeader =>',result)
        //     return result
        // }
        // var client = Java.use('com.bytedance.retrofit2.client.SsCall')
        // client.execute.implementation = function(){
        //     var result = this.execute()
        //     console.log(result)
        //     return result
        // }
        // client.cancel.implementation = function(){
        //     var result = this.cancel()
        //     console.log(result)
        //     return result
        // }
        // client.getRequest.implementation = function(){
        //     var result = this.getRequest()
        //     console.log(result)
        //     return result
        // }
        // client.setThrottleNetSpeed.implementation = function(long_){
        //     var result = this.setThrottleNetSpeed(long_)
        //     console.log(result)
        //     return result
        // }
        // var client = Java.use('com.bytedance.retrofit2.SsHttpCall')
        // client.getResponseWithInterceptorChain.implementation = function(){
        //     var result = this.getResponseWithInterceptorChain()
        //     var js_result = Java.cast(result,Java.use('com.bytedance.retrofit2.SsResponse'))
        //     var header = Java.cast(js_result.headers(),Java.use(js_result.headers().$className))
        //     var body = Java.cast(js_result.body(),Java.use(js_result.body().$className))
        //     var raw_response 
        //     console.log('header =>',header)
        //     console.log('body =>',body)
            

            // shadow$_monitor_,hashCode,shadow$_klass_,identityHashCodeNative,wait,notify,notifyAll,equals,clone,identityHashCode,finalize,internalClone,toString,getClass,isSuccessful,_errorBody,message,code,success,rawResponse,retrofitMetrics,errorBody,headers,body,setRetrofitMetrics,_body,getRetrofitMetrics,error,raw,changeQuickRedirect
            // return this.encrypt(s3)
            // console.log(String.getBytes(JSON.stringify(result.rawResponse)))
            // console.log('key =>',Object.keys(result))
            // console.log('result1 =>',JSON.stringify(result.rawResponse))
            
            // var passwordAddr = new ptr(0xc00bda54)
            // var passwordAddr = new ptr(0xf2d8fa8d)
 
 
            // var pwd = Memory.readUtf8String(Memory.readPointer(passwordAddr));
            // console.log(pwd);
            // console.log(hexdump(new ptr(0xf2d8d475) ,{
            //     offset: 0,
            //     length: 64,
            //     header: true,
            //     ansi: true,
            // }))
            // return result

        
        // }
        // client.enqueue.overload('com.bytedance.retrofit2.Callback').implementation = function(obj_){
        //     var result = this.enqueue(obj_)
        //     var a = JSON.stringify(obj_)
        //     console.log('result =>',result,'args =>',a)
        //     return result
        // }


        
    })
}
setImmediate(main)
// com.bytedance.retrofit2.client.Request.safeCreateUri
// (agent) Hooking com.bytedance.retrofit2.client.Request.getBody()
// (agent) Hooking com.bytedance.retrofit2.client.Request.getExtraInfo()
// (agent) Hooking com.bytedance.retrofit2.client.Request.getFirstHeader(java.lang.String)
// (agent) Hooking com.bytedance.retrofit2.client.Request.getHeaders()
// (agent) Hooking com.bytedance.retrofit2.client.Request.getHost()
// (agent) Hooking com.bytedance.retrofit2.client.Request.getMaxLength()
// (agent) Hooking com.bytedance.retrofit2.client.Request.getMethod()
// (agent) Hooking com.bytedance.retrofit2.client.Request.getMetrics()
// (agent) Hooking com.bytedance.retrofit2.client.Request.getPath()

// (agent) Hooking com.bytedance.retrofit2.client.SsCall.cancel()
// (agent) Hooking com.bytedance.retrofit2.client.SsCall.execute()   
// (agent) Hooking com.bytedance.retrofit2.client.SsCall.getRequest()
// (agent) Hooking com.bytedance.retrofit2.client.SsCall.setThrottleNetSpeed(long)

// 3367397876
// 4074296437
// 4074306189