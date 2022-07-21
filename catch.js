function main() {
    // com.bytedance.retrofit2.client.Request.getHeaders
    Java.perform(function(){
        // var req = Java.use('com.bytedance.retrofit2.client.Request')
        // req.getHeaders.implementation= function(){
        //     var result = this.getHeaders()
        //     var a = JSON.stringify(result)
        //     var b = JSON.parse(a)
        //     console.log('element =>',a,b) 
        //     return result
        // }
        // req.getUrl.implementation = function(){
        //     var result = this.getUrl()
        //     console.log('getUrl =>',result)
        //     return result
        // }
        // req.getMethod.implementation = function(){
        //     var result = this.getMethod()
        //     console.log('getMethod =>',result)
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
        var client = Java.use('com.bytedance.retrofit2.SsHttpCall')
        client.getResponseWithInterceptorChain.implementation = function(){
            var result = this.getResponseWithInterceptorChain()
            // console.log('key =>',Object.keys(result),result.body)
            // for(var k in result){
            //     if(k == '$ownMembers'){
            //         console.log('return =>',result,k,'=>',result[k])
            //         for(var i in result[k]){
            //             console.log('return =>',result[k][i])
            //         }
            //     }
            // }
            // var result1 = this.enqueue(result)
            console.log('result1 =>',JSON.stringify(result.rawResponse))
            console.log(hexdump(new ptr(0xc8b669f4) ,{
                offset: 0,
                length: 64,
                header: true,
                ansi: true,
            }))
            console.log(hexdump(new ptr(0xf2d8d475) ,{
                offset: 0,
                length: 64,
                header: true,
                ansi: true,
            }))
            console.log(hexdump(new ptr(0xf2d8fa8d) ,{
                offset: 0,
                length: 64,
                header: true,
                ansi: true,
            }))
            return result
        }
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

3367397876
4074296437
4074306189