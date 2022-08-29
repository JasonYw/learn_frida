function showStacks() {
    Java.perform(function(){
        console.log(
            Java.use('android.util.Log').getStackTraceString(
                Java.use('java.lang.Throwable').$new()
            )
        )
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
            showStacks()
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
function find_locateokhttp3_byArrayList(){
    Java.perform(function(){
        var arrayList = Java.use("java.util.ArrayList")
        arrayList.add.overload('java.lang.Object').implementation = function (a) {
            // console.log("realStr: ", a.toString());
            if (a.toString().startsWith("sha1/")) {
                showStacks();
            }else if (a.toString().startsWith("sha256/")) {
                showStacks();
            }
            return this.add(a);
        }
    })
}
//3.java.util.List get方法
//4.java.security.MessageDigest digest方法
function find_locateokhttp3_byMessageDigest(){
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
            showStacks();
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
            showStacks();
            console.log(args);
            return this.$init(args);
        }
    })

}
//5.直接adblogcat 抓包 会报错 直接hook错误 
function find_locateokhttp3_bySSLHandshakeException(){
    Java.perform(function(){
        var SSLHandshakeException = Java.use("javax.net.ssl.SSLHandshakeException");
        SSLHandshakeException.$init.implementation = function (args) {
            showStacks();
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



find_locateokhttp3_byArrayList()


