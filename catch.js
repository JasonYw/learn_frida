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
            send({"url":url,"body":body})
        } catch (error) {
            // console.log("error")
            send({"url":url,"body":null})
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


function hook_ssl(){
    var obj = Java.use('javax.net.ssl.TrustManagerFactory');
    obj.getAlgorithm.implementation = function() {
        var result  = this.getAlgorithm()
        console.log('getAlgorithm =>',result)
        return result
    },
    obj.getTrustManagers.implementation = function() {
        var result  = this.getTrustManagers()
        var arry = Java.use(result.$className)
        var new_result = Java.cast(result,arry)

        console.log('getTrustManagers =>',new_result)
        return result
    }
    obj.getInstance.overload("java.lang.String").implementation = function(params){
        var result  = this.getInstance(params)
        console.log('getInstance =>',result)
        return result

    }

}
//X.akO.onFullFeedVideoChangeEvent
function hook_RecyclerView(){
    var obj =Java.use("X.akO")
    // Java.choose("androidx.recyclerview.widget.RecyclerView",{
    //     onMatch:function(instance){
    //         console.log('a')
    //         instance.getAdapter();
    //     },
    //     onComplete:function(instance){
    //         instance.getAdapter();

    //     }
    // });
    obj.onFullFeedVideoChangeEvent.implementation = function(args){
        var result = this.onFullFeedVideoChangeEvent(args)

        console.log(args)
        return result
    }

}



// javax.net.ssl.TrustManagerFactory.getInstance
// function hook_ssl(){
//     var obj = Java.use('javax.net.ssl.TrustManagerFactory');
//     var methods = obj.class.getDeclaredMethods();
//     for(var i in methods){
//         var methodname =methods[i].getName();
//         if(methodname =="init" && methodname =="instance"){
//             console.log(methodname)
//             // for(var j =0;j<obj.$init.overloads.length;j++){
//             //     console.log(j)
//             //     obj.$init.overloads[j].implementation = function(){
//             //         var result = this.$init.apply(this,arguments)
//             //         console.log(methods[i],'result =>',result)
//             //         return result
//             //     }
//             // }

//         }else{
//             console.log(methodname)
//             for(var k =0;k<obj[methodname].overloads.length;k++){
//                 obj[methodname].overloads[k].implementation = function(){
//                     var result = this[methodname].apply(this,arguments)
//                     console.log(methods[i],'result =>',result)
//                     return result
//                 }
//             }
//         }
//     }
// }



function main() {
    Java.perform(function(){
        // hook_response();
        // hook_headers();
        // hook_url();
        // hook_protodecode();
        // hook_ssresponse();
        hook_RecyclerView();
    })
}
setImmediate(main)

// (agent) Hooking com.bytedance.retrofit2.client.SsCall.cancel()
// (agent) Hooking com.bytedance.retrofit2.client.SsCall.execute()
// (agent) Hooking com.bytedance.retrofit2.client.SsCall.getRequest()
// (agent) Hooking com.bytedance.retrofit2.client.SsCall.setThrottleNetSpeed(long)
// public final java.lang.String javax.net.ssl.TrustManagerFactory.getAlgorithm()
// public final java.security.Provider javax.net.ssl.TrustManagerFactory.getProvider()
// public final javax.net.ssl.TrustManager[] javax.net.ssl.TrustManagerFactory.getTrustManagers()
// public final void javax.net.ssl.TrustManagerFactory.init(java.security.KeyStore) throws java.security.KeyStoreException
// public final void javax.net.ssl.TrustManagerFactory.init(javax.net.ssl.ManagerFactoryParameters) throws java.security.InvalidAlgorithmParameterException
// public static final java.lang.String javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
// public static final javax.net.ssl.TrustManagerFactory javax.net.ssl.TrustManagerFactory.getInstance(java.lang.String) throws java.security.NoSuchAlgorithmException
// public static final javax.net.ssl.TrustManagerFactory javax.net.ssl.TrustManagerFactory.getInstance(java.lang.String,java.lang.String) throws java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException
// public static final javax.net.ssl.TrustManagerFactory javax.net.ssl.TrustManagerFactory.getInstance(java.lang.String,java.security.Provider) throws java.security.NoSuchAlgorithmException
