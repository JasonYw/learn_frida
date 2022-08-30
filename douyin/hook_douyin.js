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


function hook_okhttp3ssl(){
    Java.perform(function(){
        var OkHttpClient$Builder = Java.use("okhttp3.OkHttpClient$Builder")
        OkHttpClient$Builder.hostnameVerifier.implementation = function(args){
            console.log('OkHTTP 3.x OkHttpClient$Builder hostnameVerifier() called')
        }
        var X509TrustManager = Java.use('javax.net.ssl.X509TrustManager')
	    var SSLContext = Java.use('javax.net.ssl.SSLContext')
        var TrustManager
        TrustManager = Java.registerClass({
			name: 'org.wooyun.TrustManager',
			implements: [X509TrustManager],
			methods: {
				checkClientTrusted: function(chain, authType) {},
				checkServerTrusted: function(chain, authType) {},
				getAcceptedIssuers: function() {
					return []
				}
			}
		})
        var TrustManagers = [TrustManager.$new()]
        var TLS_SSLContext = SSLContext.getInstance("TLS")
		TLS_SSLContext.init(null, TrustManagers, null)
        var SSLContext_init = SSLContext.init.overload('[Ljavax.net.ssl.KeyManager;', '[Ljavax.net.ssl.TrustManager;', 'java.security.SecureRandom')
        SSLContext_init.implementation = function(keyManager, trustManager, secureRandom) {
            console.log('Overriding SSLContext.init() with the custom TrustManager')
            SSLContext_init.call(this, null, TrustManagers, null)
        }
        var CertificatePinner = Java.use('okhttp3.CertificatePinner')
        CertificatePinner.check.overload('java.lang.String', 'java.util.List').implementation = function() {
            console.log('OkHTTP 3.x check() called')
        }

    })

}

hook_okhttp3ssl()



    
