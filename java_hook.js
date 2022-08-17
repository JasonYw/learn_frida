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




function hook_all_ssl(){
    var obj = Java.use('javax.net.ssl.TrustManagerFactory');
    var methods = obj.class.getDeclaredMethods();
    for(var i in methods){
        var methodname =methods[i].getName();
        if(methodname =="init" && methodname =="instance"){
            console.log(methodname)
            for(var j =0;j<obj.$init.overloads.length;j++){
                console.log(j)
                obj.$init.overloads[j].implementation = function(){
                    var result = this.$init.apply(this,arguments)
                    console.log(methods[i],'result =>',result)
                    return result
                }
            }

        }else{
            console.log(methodname)
            for(var k =0;k<obj[methodname].overloads.length;k++){
                obj[methodname].overloads[k].implementation = function(){
                    var result = this[methodname].apply(this,arguments)
                    console.log(methods[i],'result =>',result)
                    return result
                }
            }
        }
    }
}



function main() {
    Java.perform(function(){
        // hook_response();
        // hook_headers();
        // hook_url();
        // hook_protodecode();
        // hook_ssresponse();
        // hook_RecyclerView();
        // hook_package()
    })
}
