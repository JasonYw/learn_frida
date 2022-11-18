// function hook_hash_so(){
//     var soaddr = Module.findBaseAddress("libtingReader.so")
//     var funcaddr = soaddr.add(0x8E49)
//     Interceptor.attach(funcaddr,{
//         onEnter:function(args){
//             print_arg(args[0])
//             print_arg(args[1])
//             print_arg(args[2])
//             print_arg(args[3])

//         },
//         onLeave:function(retval){
//             print_arg(retval)
//         }
//     })
// }

// function print_arg(addr){
//     var module = Process.findRangeByAddress(addr)
//     if(module != null){
//         console.log(hexdump(addr)+"\n")
//     }
//     else{
//         console.log(ptr(addr)+"\n") 
//     }

// }
// hook_hash_so()

// keyFactory = KeyFactory.getInstance("RSA");
// PKCS8EncodedKeySpec keySpec = keyFactory.getKeySpec(privateKey, PKCS8EncodedKeySpec.class);
// byte[] buffer = keySpec.getEncoded();
// privateKeyStr = Base64.getEncoder().encodeToString(buffer);


Java.perform(function(){
    console.log(1)
    var KeyFactory = Java.use("java.security.KeyFactory")
    var X509EncodedKeySpec = Java.use("java.security.spec.X509EncodedKeySpec")
    var PKCS8EncodedKeySpec = Java.use("java.security.spec.PKCS8EncodedKeySpec")
    var KeyGenerator = Java.use("javax.crypto.KeyGenerator")
    var SecretKeySpec = Java.use("javax.crypto.spec.SecretKeySpec")
    var BASE64 = Java.use("com.zhangyue.iReader.tools.BASE64")
    var PublicKey = Java.use("java.security.PublicKey")
    var OpenSSLRSAPublicKey = Java.use("com.android.org.conscrypt.OpenSSLRSAPublicKey")
    var String = Java.use("java.lang.String")
    var AesKey = Java.use("ee.z")
    var EnPassword = Java.use("ee.a")
    var MakeAes = Java.use("ee.a")
    var Security = Java.use("com.zhangyue.iReader.JNI.runtime.Security")
    // O7.c.implementation = function(a){
    //     console.log(a)
    //     console.log(JSON.stringify(a))
    //     console.log(Object.keys(a))
    //     console.log(String.valueOf(a))
    //     return this.c(a)
    // }


    // var result =E_.d("LpifkYsojPWAHlByZtY02w==",)
    // console.log(result)
    // Security.hash.implementation = function(a){
    //     console.log(a)
    //     return this.hash(a)
        
    // }
    // EnPassword.e.implementation = function(a,b){
    //     console.log(a)
    //     console.log(b)
    //     var result = this.e(a,b)
    //     console.log(result)
    //     return result
    // }
    // console.log(MakeAes.h())
    // var key_ = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCAqSnnZ9BVOZjIMTkATIn29nM0hLOsQsXlPbqrGE4CUmDCncVBHdkfEIF73tSKjhYfLuPH1gDtHRKeCC1DQ4uYJL83oeHtXSldGUlfuv9rh0Q/2Hxl3iG8TUc1drTKTZFfkQWWseTb3vAx8Ggse9xZNTjI6enOEjNyGlAIF+RKrwIDAQAB"
    // var aes ='Fsq7gFGS3+7bGQemF0bK5Q=='
    var sign_ = 'channel_id=108045&data={"AesKey":"aBgcuFZbJsArDrptemtXhoCcUeJnlbFW55KIAc66C2vHkb5xCD80L8glqsxPRqFDs9T/xOodxHdIN5vzrJnGkw5UImNkLHEr09SVHmSWf5lJCj9SfSfTMiWifg4iPIsIXbfpAgBsIn3iORIFex9FlA73EuH0CL3dl/tyZvC7FXI=","Data":"7mHPW/avZZKQNabDONASS0nP9hMw5vLNPz4602WVYQk="}&device=Pixel 2&encrypt_method=1&imei=__39827dd5eb14217a&is_mergeme=1&timestamp=1668583815052&user_name=15801367777&ver=1.0&version_id=17490003'
    // console.log(AesKey.d(aes,key_))
    console.log(Security.hash(sign_))
    //EnPassword.e('{"password":"0123456789"}',"KMENBpdAyWPqri/7Q/nV1g==") 
    //ygw0Elm8L77eh7hVwlorfsQA0ZbeB+Qil5oQYWvaif0=
    // E_.e.implementation  = function(a,b){
    //     var result = this.e(a,b)
    //     var result_ = Java.cast(result,PublicKey)
    //     console.log(Object.keys(result_))
    //     console.log(JSON.stringify(result_))
    //     return result
    // }
    // KeyGenerator.generateKey.implementation = function(){
    //     var result = this.generateKey();
    //     var a = Java.cast(result,SecretKeySpec)
    //     console.log(a.getEncoded())
    //     console.log(BASE64.encode(a.getEncoded()))
    //     return result
    // }
    // KeyFactory.getInstance.overload("java.lang.String").implementation = function(a){
    //     console.log(a)
    //     var result = this.getInstance(a)
    //     var keySpec = KeyFactory.getKeySpec(result,PKCS8EncodedKeySpec.class);

    //     var result_cast = Java.cast(result,KeyFactory)
    //     console.log(Object.keys(result_cast))
    //     console.log(result_cast.toString())
    //     // console.log(JSON.stringify(result))
    //     // console.log(Object.keys(result))
    //     // console.log(result.toString())
    //     // console.log(result.generatePublic())
    //     return result
    // }
})
// pWewULcNJ3f7fLw2oHvoHgTVfSA+wm5gVZG5HVBaxAW7+eMKTLHJoxdPFmhusKJ+5PxYURI2BkLUy0UtyYCNiCkoIa9RVKbaXK7xy4MkNEWm9qsXUmpGd5gZETMF+iClAhOdmpP6BuzYK1p6EmIQbWTs9AuFU7ORq+2EHkwAi9A=
// pWewULcNJ3f7fLw2oHvoHgTVfSA+wm5gVZG5HVBaxAW7+eMKTLHJoxdPFmhusKJ+5PxYURI2BkLUy0UtyYCNiCkoIa9RVKbaXK7xy4MkNEWm9qsXUmpGd5gZETMF+iClAhOdmpP6BuzYK1p6EmIQbWTs9AuFU7ORq+2EHkwAi9A=


// (agent) [527657] Arguments ee.z.d(LpifkYsojPWAHlByZtY02w==, MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCAqSnnZ9BVOZjIMTkATIn29nM0hLOsQsXlPbqrGE4CUmDCncVBHdkfEIF73tSKjhYfLuPH1gDtHRKeCC1DQ4uYJL83oeHtXSldGUlfuv9rh0Q/2Hxl3iG8TUc1drTKTZFfkQWWseTb3vAx8Ggse9xZNTjI6enOEjNyGlAIF+RKrwIDAQAB)
// (agent) [527657] Return Value: cwLRVleMYw89sAMNWyAGMSMWehfZqSiQRxqibyK+T7vQ0neWlqc1mj9KJ56d9hB4/C3i8JSDOrrjBpGw29OJ/c1bY7iltyJjyr/0SC5dXksL3MjBMFiWFW4ET1IuWWyTQVdDw3cVJvp73M2G9Bop3qMht0E6XGulHB+bHPAc1iM=
// com.chaozh.iReaderFree on (google: 10) [usb] #
// com.chaozh.iReaderFree on (google: 10) [usb] #