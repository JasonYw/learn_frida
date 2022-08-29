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



function showStacks(this) {
    Java.perform(function(){
        console.log(
            Java.use('android.util.Log').getStackTraceString(
                Java.use('java.lang.Throwable').$new()
            )
        )
    })
}


//so层打印堆栈
//obj传递this即可
function print_trace(obj){
    //FUZZY 是模糊的 但是对所有的so都有效，但是不准确
    //ACCURATE 是准确的 但是并不是对所有so都有效
    console.log(Thread.backtrace(obj.context,Backtracer.FUZZY).map(DebugSymbol.fromAddress).join('\n')+'\n')
}


//关键代码定位
//先抓包之后通过这些打印的参数确定位置
//查看线程池中的堆栈
function hook_ThreadPoolExecutor(){
    Java.perform(function() {
        var ThreadPoolExecutor = Java.use("java.util.concurrent.ThreadPoolExecutor");
        ThreadPoolExecutor.execute.implementation = function (a) {
            showStacks(this);
            console.log("ThreadPoolExecutor ============================================== ");
            return this.execute(a);
        }
        ThreadPoolExecutor.submit.overload('java.lang.Runnable').implementation = function (a) {
            showStacks(this);
            console.log("ThreadPoolExecutor ============================================== ");
            return this.submit(a);
        }
        ThreadPoolExecutor.submit.overload('java.util.concurrent.Callable').implementation = function (a) {
            showStacks(this);
            console.log("ThreadPoolExecutor ============================================== ");
            return this.submit(a);
        }
        ThreadPoolExecutor.submit.overload('java.lang.Runnable', 'java.lang.Object').implementation = function (a, b) {
            showStacks(this);
            console.log("ThreadPoolExecutor ============================================== ");
            return this.submit(a, b);
        }
    })
}


//hook ArrayList 的 add方法 addall set 
function hook_ArrayList(){
    Java.perform(function() {
        var arrayList = Java.use("java.util.ArrayList");
        arrayList.add.overload('java.lang.Object').implementation = function (a) {
            showStacks(this);
            console.log("arrayList.add: ", a);
            console.log("arrayList.add: ", a);
            return this.add(a);
        }
        arrayList.add.overload('int', 'java.lang.Object').implementation = function (a, b) {
            console.log("arrayList.add: ", a, b);
            return this.add(a, b);
        }
    })
}

//hook Collections java.util.Arrays sort toString
function hook_Collections(){
    Java.perform(function(){
        var collections = Java.use("java.util.Collections");
        collections.sort.overload('java.util.List').implementation = function (a) {
            showStacks(this);
            try{
                var result = Java.cast(a, Java.use("java.util.LinkedList"));
                console.log("collections.sort List: ", result.toString());
            }catch (e) {
                result = Java.cast(a, Java.use("java.util.ArrayList"));
                console.log("collections.sort List: ", result.toString());
            }
            return this.sort(a);
        }
        collections.sort.overload('java.util.List', 'java.util.Comparator').implementation = function (a, b) {
            showStacks(this);
            try{
                var result = Java.cast(a, Java.use("java.util.LinkedList"));
                console.log("collections.sort List Comparator: ", result.toString());
            }catch (e) {
                result = Java.cast(a, Java.use("java.util.ArrayList"));
                console.log("collections.sort List Comparator: ", result.toString());
            }
            return this.sort(a, b);
        }
    })

}

//hook HashMap
function hook_HashMap(){
    Java.perform(function(){
        var HashMap = Java.use("java.util.HashMap")
        HashMap.put.implementation = function(a,b){
            showStacks(this)
            console.log(a,b)
            return this.put(a,b)
        }
    })
}

//hook log
function hook_Log(){
    Java.perform(function(){
        var Log = Java.use("android.util.Log")
        Log.w.overload('java.lang.String','java.lang.String').implementation = function(tag,message){
            showStacks(this)
            console.log(tag,message)
            return this.w(tag,message)
        }
    })
}

//hook TextUtils
function hook_TextUtils(){
    Java.perform(function(){
        var TextUtils = Java.use("android.text.TextUtils")
        TextUtils.isEmpty.implementation = function(a){
            showStacks(this)
            console.log(a)
            return this.isEmpty(a)
        }
    })
}


//快速定位webview 找到app资源路径
function hook_WebView(){
    Java.perform(function(){
        var WebView = Java.use("android.webkit.WebView")
        WebView.loadData.implementation = function(a,b,c){
            showStacks(this)
            console.log(a,b,c)
            return this.loadData(a,b,c)
        }
        WebView.loadUrl.overload("java.lang.String").implementation = function(a){
            showStacks(this)
            console.log(a)
            return this.loadUrl(a)
        }
        WebView.loadUrl.overload("java.lang.String","java.util.Map").implementation = function(a,b){
            showStacks(this)
            console.log(a,b)
            return this.loadUrl(a,b)
        }

    })
}



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






// function hook_all(){
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

function hook_HttpsURLConnectionImpl_ssl(){
    Java.perform(function(){
        var HttpsURLConnectionImpl = Java.use("com.android.okhttp.internal.huc.HttpsURLConnectionImpl")
        HttpsURLConnectionImpl.setHostnameVerifier.implementation = function(hostnameVerifier){
            return
        }
        HttpsURLConnectionImpl.setSSLSocketFactory.implementation = function(SSLSocketFactory){
            return
        }

    })
}






//okhttp使用示例
// public class Okhttp3Utils {

//     public static OkHttpClient client = new OkHttpClient.Builder().build();

//     public static void doRequest(){
//         new Thread(){
//             public void run(){
//                 FormBody formBody = new FormBody.Builder().add("user", "xiaojianbang").add("pass", "xiaojianbang").build();
//                 Request request = new Request.Builder()
//                         .url("https://www.baidu.com/")
//                         .post(formBody)
//                         .addHeader(
//                                 "User-Agent",
//                                 "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 UBrowser/6.2.4098.3 Safari/537.36"
//                         )
//                         .build();
//                 try {
//                     Response response = client.newCall(request).execute();
//                     Log.d("xiaojianbang", "response: " + response.body().string());
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }.start();
//     }

// }


//自吐与快速定位
//okhttp3定位协议头 
//可以直接定位到添加协议头的地方，但是okhttp3可能会混淆
//也可以直接hook java.util.ArrayList 的 add方法
function getokhttp3header(){
    Java.perform(function(){
        var okhttp3_builder = Java.use("okhttp3.Request$Builder")
        okhttp3_builder.addHeader.implementation = function(a,b){
            showStacks(this)
            return this.addHeader(a,b)
        }
    })
}

//okhttp3自吐
//使用拦截器的方式 自吐
//把拦截器的java代码 编译成dex文件之后放到手机中，利用frida给okhttp3添加上
//优点证书检测无效果，缺点okhttp3 会被混淆 
function hook_by_interceptor(){
    Java.perform(function(){
        //需要先将okhtt3Interceptor.dex放入手机的/data/local/tmp/okhtt3Interceptor.dex 记得修改权限
        Java.openClassFile("/data/local/tmp/okhtt3Interceptor.dex").load()
        var okhttp3Logging = Java.use("com.example.demo.okhttp3Logging")
        var Builer = Java.use("okhttp3.OkHttpClient$Builder")
        Builer.build.implementation = function(){
            console.log("okhttp3.OkHttpClient$Builder is called!")
            return this.addNetworkInterceptor(okhttp3Logging.$new()).build()
        }
    })
}


//okhttp3的证书检测
// public static OkHttpClient client = new OkHttpClient.Builder()
//  .sslSocketFactory(getSSLSocketFactory(new ByteArrayInputStream(certificate.getBytes())), trustManager)
//  .hostnameVerifier(VERIFY)
//  .certificatePinner(new CertificatePinner.Builder().add("www.baidu.com", "sha1/P6gCFiWqW5mhUGKcOK8ENmbVUJA=").build()) //ssl pinning 证书锁定 比httpsurlconnection 多的地方
//  .build();
//主要的监测点 sslSocketFactory  hostnameVerifier certificatePinner 三个检测点
// android hooking watch class okhttp3.OkHttpClient
// android hooking watch class okhttp3.OkHttpClient$1
// android hooking watch class okhttp3.OkHttpClient$Builder



function hook_okhttp3ssl(){
    Java.perform(function(){
        //hostnameVerifier 0
        var OkHttpClient$Builder = Java.use("okhttp3.OkHttpClient$Builder")
        // console.log('okhttp3.OkHttpClient$Builder Found')
        OkHttpClient$Builder.hostnameVerifier.implementation = function(){
            console.log('OkHTTP 3.x OkHttpClient$Builder hostnameVerifier() called')
            //需要返回一个OkHttpClient$Builder
            return this
        }

        //hostnameVerifier 1

        var OkHttpClient = Java.use("okhttp3.OkHttpClient")
        //引入接口
        var HostnameVerifier = Java.use("javax.net.ssl.HostnameVerifier")
        //实现自己的类实现接口，并注册
        var myHostnameVerifier = Java.registerClass({
            //类名
            name:"com.demo.myHostnameVerifier",
            //实现的接口
            implements:[HostnameVerifier],
            methods:{
                //实现接口方法
                verify:function(hostname,session){
                    //信任所有方法
                    return true
                }
            }

        })
        console.log('okhttp3.OkHttpClient Found')
        OkHttpClient.hostnameVerifier.implementation = function(){
            console.log("OkHTTP 3.x OkHttpClient hostnameVerifier() called")
            //需要返回javax.net.ssl.HostnameVerifier
            //javax.net.ssl.HostnameVerifier 是一个接口，不能实例化，需要注册一个类，信任所有的hostname注册一个类
            //所以在上面实现接口
            return myHostnameVerifier.$new() //实例化一个对象
        }

        //sslSocketFactory
        var X509TrustManager = Java.use('javax.net.ssl.X509TrustManager');
	    var SSLContext = Java.use('javax.net.ssl.SSLContext');
        var TrustManager;
        TrustManager = Java.registerClass({
			name: 'org.wooyun.TrustManager',
			implements: [X509TrustManager],
			methods: {
				checkClientTrusted: function(chain, authType) {},
				checkServerTrusted: function(chain, authType) {},
				getAcceptedIssuers: function() {
					return [];
				}
			}
		});
        var TrustManagers = [TrustManager.$new()];
        var TLS_SSLContext = SSLContext.getInstance("TLS");
		TLS_SSLContext.init(null, TrustManagers, null);
        var SSLContext_init = SSLContext.init.overload('[Ljavax.net.ssl.KeyManager;', '[Ljavax.net.ssl.TrustManager;', 'java.security.SecureRandom')
        SSLContext_init.implementation = function(keyManager, trustManager, secureRandom) {
            console.log('Overriding SSLContext.init() with the custom TrustManager');
            SSLContext_init.call(this, null, TrustManagers, null)
        }

        //certificatePinner
        var CertificatePinner = Java.use('okhttp3.CertificatePinner');
        // console.log('okhttp3.CertificatePinner 3.x Found')
        CertificatePinner.check.overload('java.lang.String', 'java.util.List').implementation = function() {
            console.log('OkHTTP 3.x check() called')
        }
    })
}






//okhttp混淆后的定位方法
//1.反编译后直接搜索关键字List<Certificate>
//2.从系统函数入手 java.util.ArrayList add方法
function locateokhttp3_byArrayList(){
    Java.perform(function(){
        var arrayList = Java.use("java.util.ArrayList")
        arrayList.add.overload('java.lang.Object').implementation = function (a) {
            // console.log("realStr: ", a.toString());
            if (a.toString().startsWith("sha1/")) {
                showStacks(this);
            }else if (a.toString().startsWith("sha256/")) {
                showStacks(this);
            }
            return this.add(a);
        }
    })
}
//3.java.util.List get方法
//4.java.security.MessageDigest digest方法
function locateokhttp3_byMessageDigest(){
    Java.perform(function(){
        var ByteString = Java.use("com.android.okhttp.okio.ByteString");
        function toBase64(tag, data) {
            console.log(tag + " Base64: ", ByteString.of(data).base64());
        }
        function toHex(tag, data) {
            console.log(tag + " Hex: ", ByteString.of(data).hex());
        }
        function toUtf8(tag, data) {
            console.log(tag + " Utf8: ", ByteString.of(data).utf8());
        }
        var messageDigest = Java.use("java.security.MessageDigest");
        messageDigest.digest.overload('[B').implementation = function (data) {
            console.log("MessageDigest.digest('[B') is called!");
            showStacks(this);
            var algorithm = this.getAlgorithm();
            var tag = algorithm + " digest data";
            toUtf8(tag, data);
            toHex(tag, data);
            toBase64(tag, data);
            var result = this.digest(data);
            var tags = algorithm + " digest result";
            toHex(tags, result);
            toBase64(tags, result);
            console.log("=======================================================");
            return result;
        }
        var SSLHandshakeException = Java.use("javax.net.ssl.SSLHandshakeException");
        SSLHandshakeException.$init.implementation = function (args) {
            showStacks(this);
            console.log(args);
            return this.$init(args);
        }
    })

}
//5.直接adblogcat 抓包 会报错 直接hook错误 
function locateokhttp3_bySSLHandshakeException(){
    Java.perform(function(){
        var SSLHandshakeException = Java.use("javax.net.ssl.SSLHandshakeException");
        SSLHandshakeException.$init.implementation = function (args) {
            showStacks(this);
            console.log(args);
            return this.$init(args);
        }
    })

}
//6.确认一下是否CertificatePinner
function confirm_certificatepinner(){
    Java.perform(function(){
        var CertificatePinner = Java.use('okhttp3.CertificatePinner');
        CertificatePinner.check.overload('java.lang.String', 'java.util.List').implementation = function(a, b) {
            console.log('OkHTTP 3.x check() called. Not throwing an exception.');
            return this.check(a, b);
        }    
    })

}


//okhttp3底层
//com.android.org.conscrypt.Java8FileDescriptorSocket  getOutoutStream
//安卓在线源码查看http://aospxref.com
// HTTPS的流程
// com.android.org.conscrypt.Java8FileDescriptorSocket
// getOutputStream
// com.android.org.conscrypt.ConscryptFileDescriptorSocket$SSLOutputStream
// NativeCrypto.SSL_write(ssl, this, fd, handshakeCallbacks, buf, offset, len, timeoutMillis);
// com.android.org.conscrypt.NativeCrypto SSL_write
// HTTP的流程
// java.net.Socket
// getOutputStream


//java层ssl源码，https自吐
function hook_java_SSL(){
    Java.perform(function () {

        var ByteString = Java.use("com.android.okhttp.okio.ByteString");
        function toBase64(tag, data) {
            console.log(tag + " Base64: \n", ByteString.of(data).base64())
        }
        function toHex(tag, data) {
            console.log(tag + " Hex: \n", ByteString.of(data).hex())
        }
        function toUtf8(tag, data) {
            console.log(tag + " Utf8: \n", ByteString.of(data).utf8())
        }
    
        var NativeCrypto = Java.use("com.android.org.conscrypt.NativeCrypto");
        NativeCrypto.SSL_write.implementation = function (ssl, nativeCrypto, fd, handshakeCallbacks, buf, offset, len, timeoutMillis) {
            console.log(offset, len)
            toUtf8("SSL_write: ", buf)
            console.log("=======================================================")
            this.SSL_write(ssl, nativeCrypto, fd, handshakeCallbacks, buf, offset, len, timeoutMillis)
        }
    
        NativeCrypto.SSL_read.implementation = function (ssl, nativeCrypto, fd, handshakeCallbacks, buf, offset, len, timeoutMillis) {
            console.log(offset, len)
            toUtf8("SSL_read", buf)
            console.log("=======================================================")
            return this.SSL_read(ssl, nativeCrypto, fd, handshakeCallbacks, buf, offset, len, timeoutMillis)
        }

    })

}


//jni层ssl系统源码
// /external/conscrypt/common/src/jni/main/cpp/conscrypt/native_crypto.cc
// static void NativeCrypto_SSL_write(JNIEnv* env, jclass, jlong ssl_address, CONSCRYPT_UNUSED jobject ssl_holder, jobject fdObject,
// 8286                                     jobject shc, jbyteArray b, jint offset, jint len,
// 8287                                     jint write_timeout_millis)
// /external/conscrypt/common/src/jni/main/cpp/conscrypt/native_crypto.cc
// static int sslWrite(JNIEnv* env, SSL* ssl, jobject fdObject, jobject shc, const char* buf, jint len,
// 8146                      SslError* sslError, int write_timeout_millis)
// boringssl是谷歌从openssl改过来的，ssl_lib.cc会编译到libssl.so中
// /external/boringssl/src/ssl/ssl_lib.cc
// int SSL_write(SSL *ssl, const void *buf, int num) 一般选择这进行hook 
// int SSL_read(SSL *ssl, void *buf, int num)
// 以上两个函数就是r0capture的hook点

// /external/boringssl/src/ssl/s3_pkt.cc
// int ssl3_write_app_data(SSL *ssl, bool *out_needs_handshake, const uint8_t *in,
// 130                          int len)
// /external/boringssl/src/ssl/s3_pkt.cc
// static int do_ssl3_write(SSL *ssl, int type, const uint8_t *in, unsigned len)
// 在这之前，数据是明文
// hook点就是上述的函数
// ========================================================================================================
// 在这之后，数据是密文
// /external/boringssl/src/ssl/s3_pkt.cc
// static int ssl3_write_pending(SSL *ssl, int type, const uint8_t *in,
// 205                                unsigned int len)
// /external/boringssl/src/ssl/ssl_buffer.cc
// int ssl_write_buffer_flush(SSL *ssl) 
// static int dtls_write_buffer_flush(SSL *ssl)
// /external/boringssl/src/crypto/bio/bio.c
// int BIO_write(BIO *bio, const void *in, int inl)


// libcrypto.so
// /external/boringssl/src/crypto/bio/socket.c
// static int sock_read(BIO *b, char *out, int outl) {
// 108    int ret = 0;
// 109  
// 110    if (out == NULL) {
// 111      return 0;
// 112    }
// 113  
// 114    bio_clear_socket_error();
// 115  #if defined(OPENSSL_WINDOWS)
// 116    ret = recv(b->num, out, outl, 0);
// 117  #else
// 118    ret = read(b->num, out, outl);
// 119  #endif
// 120    BIO_clear_retry_flags(b);
// 121    if (ret <= 0) {
// 122      if (bio_fd_should_retry(ret)) {
// 123        BIO_set_retry_read(b);
// 124      }
// 125    }
// 126    return ret;
// 127  }
// 128  
// 129  static int sock_write(BIO *b, const char *in, int inl) {
// 130    int ret;
// 131  
// 132    bio_clear_socket_error();
// 133  #if defined(OPENSSL_WINDOWS)
// 134    ret = send(b->num, in, inl, 0);
// 135  #else
// 136    ret = write(b->num, in, inl);
// 137  #endif
// 138    BIO_clear_retry_flags(b);
// 139    if (ret <= 0) {
// 140      if (bio_fd_should_retry(ret)) {
// 141        BIO_set_retry_write(b);
// 142      }
// 143    }
// 144    return ret;
// 145  }

// 最终交给libc.so中的 write函数
//如果遇到gzip压缩的话，需要from hexdump 之后 找1f 8b gzip起始位置，之后gunzip 就可以获取加密后的结果
function hook_so_ssl(){
    var SSL_write_addr = Module.findExportByName("libssl.so","SSL_write")
    var SSL_read_addr = Module.findExportByName("libssl.so","SSL_read")
    var write_addr = Module.findExportByName("libc.so","write")
    var read_addr = Module.findExportByName("libc.so","read")
    Interceptor.attach(SSL_write_addr,{
        onEnter:function(args){
            // print_trace(this)
            console.log("SSL_write_addr:",Process.getCurrentThreadId())
            console.log(hexdump(args[1],{length:args[2].toInt32()}))
        },
        onLeave:function(retval){}
    })
    Interceptor.attach(SSL_read_addr,{
        onEnter:function(args){
            this.args1 =  args[1]
        },
        onLeave:function(retval){
            // print_trace(this)
            var nums = retval.toInt32()
            if(nums > 0){
                console.log("SSL_read_addr:",Process.getCurrentThreadId())
                console.log(hexdump(this.args1,{length:nums}))
            }
        }
    })

    Interceptor.attach(write_addr,{
        onEnter:function(args){
            // print_trace(this)
            console.log("write_addr:",Process.getCurrentThreadId())
            console.log(hexdump(args[1],{length:args[2].toInt32()}))
        },
        onLeave:function(retval){}
    })

    Interceptor.attach(read_addr,{
        onEnter:function(args){
            this.args1 =  args[1]
        },
        onLeave:function(retval){
            // print_trace(this)
            var nums = retval.toInt32()
            if(nums > 0){
                console.log("read_addr:",Process.getCurrentThreadId())
                console.log(hexdump(this.args1,{length:nums}))
            }
        }
    })
    

}

//r0capture的使用
//https://github.com/r0ysue/r0capture
//pip install hexdump
//Spawn 模式：
//python3 r0capture.py -U -f com.qiyi.video -v
//Attach 模式，抓包内容保存成pcap文件供后续分析
//python3 r0capture.py -U com.qiyi.video -v -p iqiyi.pcap
//此项目从frida_ssl_logger项目改的

//证书的dump
//首先要在没有抓包的时候先试一试能否正常访问
//在抓包的同时开启logcat 查看是否有报错
//抓包工具中 有正常返回 但是返回的是 400 则 是服务端校验 客户端没有校验证书
//如果是客户端校验 需要去找证书
//证书一般是 p12 bks结尾 证书一般也需要密码 都需要得到
//KeyStore.load 此方法第一个参数就是证书的输入流，第二个参数是密码
//KeyStore.setcertificateEntry
function hook_KeyStore(){
    Java.perform(function () {
        var KeyStore = Java.use("java.security.KeyStore");
        var str = Java.use("java.lang.String");
        KeyStore.load.overload("java.io.InputStream", "[C").implementation = function (input, pwdStr) {
            //input证书的输入流 pwdstr 证书密码
            if (input) {
                console.log("pwdStr: ", str.$new(pwdStr));
                var file = Java.use("java.io.File").$new("/data/data/com.xh.xinghe/xiaojianbang.p12"); //保存的位置
                var output = Java.use("java.io.FileOutputStream").$new(file);
                var r, myArr = [];
                for (var i = 0; i < 1024; i++) {
                    myArr[i] = 0;
                }
                var buffer = Java.array("byte", myArr);
                while((r = input.read(buffer)) > 0) {
                    output.write(buffer, 0, r);
                }
                console.log("save");
                output.close();
            }
            return this.load(input, pwdStr);
        }
    
    });
}

//如果没有用java.security.KeyStore，可以直接脱壳反编译，之后看字符串是否被加密，如果没有被混淆直接搜索字符串.p12 或者.bks