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
// function hook_response(){
//     Java.perform(function(){
//         var response = Java.use("com.bytedance.retrofit2.client.Response")
//         response.getBody.implementation = function(){
//             var result = this.getBody()
//             var arry = Java.use(result.$className)
//             var new_result = Java.cast(result,arry)
//             // console.log(Object.keys(new_result))
//             try {
//                 send(new_result.getBytes())
//             }
//             catch(error){}
//             // console.log(new_result.toString())
//             // console.log('result =>',new_result,hexToString(bytesToHex(new_result.getBytes())))
//             return result
//         }

//     })
// }

//com.bytedance.retrofit2.client.Request
// function hook_all(){
//     Java.perform(function(){
//         Java.enumerateLoadedClasses({
//             onMatch: function(name){
//                 var clazz = Java.use(name);
//                 console.log(name);
//                 for(var method in clazz.class.getDeclaredMethods()){
//                     console.log(method);
//                 }
//                 console.log(methods);
//             },
//             onComplete: function(){}
//         })
//     })
// }

// function hook_all_sync(){
//     Java.perform(function(){
//         var classes = Java.enumerateLoadedClassesSync();
//         for (var i in classes){
//             var obj = Java.use(classes[i])
//             var methods = obj.class.getDeclaredMethods()
//             for(var j in methods){
//                 console.log(classes[i],"=>",methods[j].getName());
//             }
//         }
//     })
// }


// function hook_ssl(){
//     Java.perform(function(){
//         var obj = Java.use('javax.net.ssl.TrustManagerFactory');
//         obj.getAlgorithm.implementation = function() {
//             var result  = this.getAlgorithm()
//             console.log('getAlgorithm =>',result)
//             return result
//         },
//         obj.getTrustManagers.implementation = function() {
//             var result  = this.getTrustManagers()
//             var arry = Java.use(result.$className)
//             var new_result = Java.cast(result,arry)

//             console.log('getTrustManagers =>',new_result)
//             return result
//         }
//         obj.getInstance.overload("java.lang.String").implementation = function(params){
//             var result  = this.getInstance(params)
//             console.log('getInstance =>',result)
//             return result

//         }

//     })
// }




// function hook_all_ssl(){
//     Java.perform(function(){
//         var obj = Java.use('javax.net.ssl.TrustManagerFactory');
//         var methods = obj.class.getDeclaredMethods();
//         for(var i in methods){
//             var methodname =methods[i].getName();
//             if(methodname =="init" && methodname =="instance"){
//                 console.log(methodname)
//                 for(var j =0;j<obj.$init.overloads.length;j++){
//                     console.log(j)
//                     obj.$init.overloads[j].implementation = function(){
//                         var result = this.$init.apply(this,arguments)
//                         console.log(methods[i],'result =>',result)
//                         return result
//                     }
//                 }

//             }else{
//                 console.log(methodname)
//                 for(var k =0;k<obj[methodname].overloads.length;k++){
//                     obj[methodname].overloads[k].implementation = function(){
//                         var result = this[methodname].apply(this,arguments)
//                         console.log(methods[i],'result =>',result)
//                         return result
//                     }
//                 }
//             }
//         }
//     })
// }



// HTTPS就是 http+ssl
// 数据发送加密 收到数据解密 都是由ssl或者tsl完成的
// 首先浏览器请求服务端 服务端返回证书 包含公钥 
// 之后会产生随机密钥 使用公钥把随机生成的密钥对称加密
// 发送加密后的对称私钥
// 通过对称密钥加密的密文通信 

//中间人攻击 要解密ssl必须需要替换证书
//浏览器只会校验证书路径 会校验每个证书的颁发者 也就是必须校验链的头证书颁发者必须是根证书 
//常见的抓包检测 代理检测
//hook openConnection
//hook OkHttpClient.Builder().proxy()
//hook System.getProperty 这个也有可能在so层做
//使用vpn抓包就可以绕过 所以一般不需要管代理检测

//vpn抓包会有vpn检测
//主要检测方法java.net.NetworkInterface.getName


function hook_vpn_1(){
    Java.perform(function(){
        var NetworkInterface = Java.use("java.net.NetwrokInterface")
        NetworkInterface.getName.implementation = function(){
            var name =this.getName()
            if(name == "tun0" || name == "ppp0"){
                return "rmnet_data0"
            }else{
                return name
            }
        }
    })
}

//另一种方法 getNatworkCapabilities()
// @RequiresApi(api = Build.VERSION_CODES.M)
//     public void networkCheck() {
//         try {
//             ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
//             Network network = connectivityManager.getActiveNetwork();

//             NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
//             Log.i("TAG", "networkCapabilities -> " + networkCapabilities.toString());
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//第一种方法
function hook_vpn_2(){
    Java.perform(function(){
        var NetworkCapabilities = Java.use("android.net.NetworkCapabilities")
        NetworkCapabilities.hasTransport.implementation = function(){
            return false
        }
    })
}
//第二种方法toString里面的函数入手
function hook_vpn_3(){
    Java.perform(function(){
        var NetworkCapabilities = Java.use("android.net.NetworkCapabilities")
        NetworkCapabilities.transportNameOf.implementation = function(){
            return "wifi"
        }
    })
}

//第三种方式
function hook_vpn_4(){
    Java.perform(function(){
        var NetworkCapabilities = Java.use("android.net.NetworkCapabilities")
        NetworkCapabilities.appendStringRepresentationOfBitMaskToStringBuilder.implementation = function(sb,bitMask,nameFetcher,separator){
            console.log(sb,bitMask,nameFetcher,separator)
            if(bitMask==18){
                sb.append("WIFI")
            }else{
                this.appendStringRepresentationOfBitMaskToStringBuilder(sb,bitMask,nameFetcher,separator)
            }
        }
    })
}


//httpsurlconnection自吐
//关键类com.android.okhttp.internal.huc.HttpsURLConnectionImpl 
//关键类javax.net.ssl.HttpsURLConnection
//关键类java.net.URLConnection
//httpsurlconnection 证书检测
//单向校验 客户端校验
//类com.android.okhttp.internal.huc.HttpsURLConnectionImpl 
//setHostnameVerifier()
//setSSLSocketFactory()
//不一定是哪个类会调用检测休要配合objection去使用 上面三个关键类需要看一下

//okhttp3框架
//拦截器
//网络拦截器  和 应用拦截器
