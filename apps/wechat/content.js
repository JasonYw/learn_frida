// Java.perform(function(){
//     // 完整代码：
    
//     var SQLiteDatabase = Java.use('com.tencent.wcdb.database.SQLiteDatabase');
//     var Set = Java.use("java.util.Set");
//     var ContentValues = Java.use("android.content.ContentValues");
//     var xml = Java.use("com.tencent.mm.sdk.platformtools.SemiXml");
//     // Java.openClassFile('/data/local/tmp/fastjson.dex').load();
//     // var JSONObject = Java.use('com.alibaba.fastjson.JSONObject')
//     // ContentValues.put.overload('java.lang.String', 'java.lang.String').implementation = function(arg0,arg1) {
//     //     var ret = this.put(arg0,arg1)
//     //     console.log(arg0,arg1)
//     //     return ret
//     // }

//     SQLiteDatabase.updateWithOnConflict.implementation = function (arg0,arg1,arg2,arg3,arg4) {

//         // 调用此函数，让其正常执行
//         var ret = this.updateWithOnConflict(arg0,arg1,arg2,arg3,arg4)    
//         // 我们重点关注一下参数，因为参数中包含着我们想要的数据
//         // var values = Java.cast(arg3, ContentValues)
//         // console.log(Object.keys(values))
//         // console.log(JSON.stringify(Object.getValues))
//         // var sets = Java.cast(values.keySet(), Set);
//         // var arr = sets.toArray().toString().split(",");
//         // console.log(arr)
//         // for (var i = 0; i < arr.length; i++){
//         //     var key = arr[i];
//         //     var value = values.get(key);
//         //     if(key === "content"){
//         //         var str_ = xml.decode(value)
//         //         console.log(str_)
//         //         // var res = JSONObject.toJSONString(str_);
//         //         // var data = JSONObject.parseObject(res)
//         //         // var value_data = data.getString(".msg.appmsg.mmreader.category.item.url")
//         //         // console.log(value_data);
//         //         // send_wechat(value_data)
//         //     }
//         // }
//         // console.log("____________________________________");
//         return ret;
//     };

// });





Java.perform(function(){
    // 完整代码：
    
    var SQLiteDatabase = Java.use('com.tencent.wcdb.database.SQLiteDatabase');
    var Set = Java.use("java.util.Set");
    var ContentValues = Java.use("android.content.ContentValues");
    var xml = Java.use("com.tencent.mm.sdk.platformtools.SemiXml");
    // Java.openClassFile('/data/local/tmp/fastjson.dex').load();
    // var JSONObject = Java.use('com.alibaba.fastjson.JSONObject')

    SQLiteDatabase.insertWithOnConflict.implementation = function (arg1, arg2, arg3, arg4) {
        // 调用此函数，让其正常执行
        var ret = this.insertWithOnConflict(arg1, arg2, arg3, arg4)
        // console.log(JSON.stringify(arg3))
        // 我们重点关注一下参数，因为参数中包含着我们想要的数据
        var values = Java.cast(arg3, ContentValues);
        // console.log(Object.keys(values))
        // console.log(values.mValues,JSON.stringify(values.mValues),JSON.stringify(values.keySet()))
        var sets = Java.cast(values.keySet(), Set)
        var keyliststr = sets.toArray().toString()
        // console.log(sets.toArray().toString())
        if(keyliststr.indexOf('content') != -1){
            var value = values.get('content')
            // console.log(value,Object.keys(value),JSON.stringify(value))
            var str_ = xml.decode(value)
            console.log(str_,JSON.stringify(str_))
        }
      
            // var value = values.get(key);
            // if(key === "content"){
            //     var str_ = xml.decode(value)
            //     console.log(str_)
            //     // var res = JSONObject.toJSONString(str_);
            //     // var data = JSONObject.parseObject(res)
            //     // var value_data = data.getString(".msg.appmsg.mmreader.category.item.url")
            //     // console.log(value_data);
            //     // send_wechat(value_data)
            // }
        // }
        console.log("____________________________________");
        return ret;
    };

});

// function send_wechat(send_msg){
// 	Java.perform(function(){
// 		var req = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=";
// 		var OkHttpClient =  Java.use("com.android.okhttp.OkHttpClient");
//     	var Builder = Java.use("com.android.okhttp.Request$Builder").$new();

// 		var RequestBody = Java.use("com.android.okhttp.RequestBody").$new();
// 		var object_text = Java.use("org.json.JSONObject").$new();
// 		var object = Java.use("org.json.JSONObject").$new();
// 		object_text.put(Java.use("java.lang.String").$new("content"),Java.use("java.lang.String").$new(send_msg))
// 		object.put(Java.use("java.lang.String").$new("msgtype"),Java.use("java.lang.String").$new("text"))
// 		object.put(Java.use("java.lang.String").$new("text"),object_text)

// 		var post_body = Java.use("java.lang.String").$new().valueOf(object)
// 		var media_type = Java.use("com.android.okhttp.MediaType").$new("","","","").parse(Java.use("java.lang.String").$new("application/json; charset=utf-8"))
		
// 		var body = RequestBody.create(media_type, post_body)
		

//     	var request = Builder.url(Java.use("java.lang.String").$new(req)).post(body).build();
//     	OkHttpClient.$new().newCall(request).execute();

// 	});
// };