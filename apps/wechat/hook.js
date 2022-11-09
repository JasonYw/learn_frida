var host ="{host}"
var port ="{port}"
var MobileID = "{MobileID}"
var PackageName = "{PackageName}"
var req = "http://" + host + ":" + port + "/app/hook/data?MobileID=" + MobileID + "&PackageName=" + PackageName 

Java.perform(function(){
    // 完整代码：

    var SQLiteDatabase = Java.use('com.tencent.wcdb.database.SQLiteDatabase');
    var Set = Java.use("java.util.Set");
    var ContentValues = Java.use("android.content.ContentValues");
    var xml = Java.use("com.tencent.mm.sdk.platformtools.SemiXml");
    Java.openClassFile('/data/local/tmp/fastjson.dex').load();
    var JSONObject = Java.use('com.alibaba.fastjson.JSONObject')
    var Log = Java.use("android.util.Log")

    Log.i.overload('java.lang.String', 'java.lang.String').implementation = function(a,b){
        send_wechat("start hook wechat by beta1")
        a = a + ':hooked:' + req
        return this.i(a,b)
    }

    SQLiteDatabase.insertWithOnConflict.implementation = function (arg1, arg2, arg3, i) {

        // 调用此函数，让其正常执行
        var ret = this.insertWithOnConflict.call(this, arg1, arg2, arg3, i);

        // 我们重点关注一下参数，因为参数中包含着我们想要的数据
        var values = Java.cast(arg3, ContentValues);
        var sets = Java.cast(values.keySet(), Set);
        var arr = sets.toArray().toString().split(",");

        for (var i = 0; i < arr.length; i++){
            var key = arr[i];
            var value = values.get(key);
            if(key === "content"){
                var str_ = xml.decode(value)
                var res = JSONObject.toJSONString(str_);
                var data = JSONObject.parseObject(res)
                var value_data = data.getString(".msg.appmsg.mmreader.category.item.url")
                send_wechat(value_data)
            }
        }
        return ret;
    }
})


function send_wechat(send_msg){
    Java.perform(function(){
        var OkHttpClient =  Java.use("com.android.okhttp.OkHttpClient");
        var Builder = Java.use("com.android.okhttp.Request$Builder").$new();
        var RequestBody = Java.use("com.android.okhttp.RequestBody").$new();
        var post_body = Java.use("java.lang.String").$new("Data="+send_msg)
        console.log(post_body)
        var media_type = Java.use("com.android.okhttp.MediaType").$new("","","","").parse(Java.use("java.lang.String").$new("application/x-www-form-urlencoded"))
        var body = RequestBody.create(media_type, post_body)
        var request = Builder.url(Java.use("java.lang.String").$new(req)).post(body).build();
        OkHttpClient.$new().newCall(request).execute();

    })
}