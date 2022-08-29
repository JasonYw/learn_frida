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

//com.bytedance.retrofit2.client.Response.getBody
function hook_response(){
    var response = Java.use("com.bytedance.retrofit2.client.Response")
    response.getBody.implementation = function(){
        var result = this.getBody()
        var arry = Java.use(result.$className)
        var new_result = Java.cast(result,arry)
        // console.log(Object.keys(new_result))
        try {
            send(new_result.getBytes())
        }
        catch(error){}
        // console.log(new_result.toString())
        // console.log('result =>',new_result,hexToString(bytesToHex(new_result.getBytes())))
        return result
    }
}

//com.bytedance.retrofit2.client.Request
function hook_headers(){
    var req = Java.use('com.bytedance.retrofit2.client.Request')
    req.getHeaders.implementation= function(){
        var result = this.getHeaders()
        // var a = JSON.stringify(result)
        // var b = JSON.parse(a)
        var Map = Java.use('java.util.Collections$UnmodifiableRandomAccessList')
        var NewP = Java.cast(result, Map)
        // console.log('header =>',NewP)
        send(NewP.toString())
        return result
    }
}

//com.bytedance.retrofit2.client.Request
function hook_method(){
    var req = Java.use('com.bytedance.retrofit2.client.Request')
    req.getMethod.implementation = function(){
        var result = this.getMethod()
        console.log('method =>',result)
        return result
    }

}


//com.bytedance.retrofit2.client.Request
function hook_url(){
    var req = Java.use('com.bytedance.retrofit2.client.Request')
    req.getUrl.implementation = function(){
        var result = this.getUrl()
        // var a = result.includes('https://aweme.snssdk.com/aweme/v2/video/safety/check/')
        // var b = result.includes('https://bsync.snssdk.com/v2%2Fpipeline?')
        // var c = result.includes('https://aweme.snssdk.com/aweme/v1/aweme/stats/')
        // var d = result.includes('https://aweme.snssdk.com/service/2/app_log/')
        // var e = result.includes('aweme-poi/poi_loc/')
        // var f = result.includes('https://aweme.snssdk.com/aweme/v2/feed/')
        // if(f){
        // console.log('url =>',result)
        send(result)
        // }
        return result
    }
}


function hook_protodecode(){
    var proto = Java.use("com.ss.android.ugc.aweme.feed.model.Protobufaweme_v2_feed_responseAdapter")
    proto.decode.overload('com.squareup.wire.ProtoReader').implementation = function(param_){
        var result = this.decode(param_)
        console.log(result.toString(),Object.values(result))
        // var new_result = Java.cast(result.items,Java.use('com.ss.android.ugc.aweme.feed.model.FeedItemList')).toString()
        // console.log(new_result)
        return result

    }
}



function hook_ssresponse(){
    var req = Java.use("com.bytedance.retrofit2.SsResponse")
    req.raw.implementation = function(){
        var result = this.raw()
        var url = result.getUrl()
        // console.log("url =>",url)
        var header = Java.cast(result.getHeaders(),Java.use(result.getHeaders().$className)).toString()
        // console.log("header =>",header)
        var extra  = Java.cast(result.getExtraInfo(),Java.use(result.getExtraInfo().$className))
        try {
            send(url)
            var body = Java.cast(result.getBody(),Java.use(result.getBody().$className)).getBytes()
            send({"url":url,"body":body,'header':header})
        } catch (error) {
            // console.log("error")
            send({"url":url,"body":null,'header':header})
        }

        return result
    }
}


function hook_all(){
    Java.enumerateLoadedClasses({
        onMatch: function(name){
            var clazz = Java.use(name);
            console.log(name);
            for(var method in clazz.class.getDeclaredMethods()){
                console.log(method);
            }
            console.log(methods);
        },
        onComplete: function(){}
    })
}

function hook_all_sync(){
    var classes = Java.enumerateLoadedClassesSync();
    for (var i in classes){
        var obj = Java.use(classes[i])
        var methods = obj.class.getDeclaredMethods()
        for(var j in methods){
            console.log(classes[i],"=>",methods[j].getName());
        }
    }
}





function hook_package(){
    var obj = Java.use('com.bytedance.retrofit2.SsHttpCall')
    obj.com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_lancet_NetIOCheckLancet_execute.implementation = function(arg_) {
        var result = this.com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_lancet_NetIOCheckLancet_execute(arg_)
        // console.log(result,arg_,Object.keys(result),Object.keys(arg_))
        var request_ = arg_.request()
        var header = Java.cast(request_.getHeaders(),Java.use(request_.getHeaders().$className)).toString()
        console.log(request_.getUrl(),header)
        return result
    }
}

function hook_RecyclerView(){
    Java.perform(function(){
        var panelC =Java.use("com.ss.android.ugc.aweme.feed.panel.c")
        panelC.LIZ.overload("com.ss.android.ugc.aweme.feed.model.Aweme",'boolean').implementation = function(aweme,int0){
            var result = this.LIZ(aweme,int0)
            // send(aweme.toString())
            console.log(Object.keys(aweme))
            return result
        }
    })
}
hook_RecyclerView()



    
