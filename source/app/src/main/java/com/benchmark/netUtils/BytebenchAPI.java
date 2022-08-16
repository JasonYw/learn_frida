package com.benchmark.netUtils;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Header;
import com.bytedance.retrofit2.http.HeaderMap;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;
import okhttp3.RequestBody;

/* loaded from: classes23.dex */
public interface BytebenchAPI {
    static {
        Covode.recordClassIndex(9697);
    }

    @GET
    @Streaming
    Call<TypedInput> doGet(@Url String str, @QueryMap(encode = true) Map<String, String> map);

    @POST
    @Streaming
    Call<TypedInput> doPost(@Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderMap Map<String, String> map2, @Body RequestBody requestBody);

    @POST("/bytebench/api/sdk/bytebench/config")
    Call<Object<Object>> getByteBenchGlobalConfig(@HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @Body RequestBody requestBody);

    @GET("/bytebench/api/task/group")
    Call<TypedInput> getDefaultBenchmark(@HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @POST("/bytebench/api/sdk/device/info")
    Call<Object<Object>> getDeviceInfo(@Header("x-bytebench-signature") String str, @QueryMap Map<String, String> map, @Body RequestBody requestBody);

    @POST("/bytebench/api/sdk/device/score")
    Call<Object<Object>> getDeviceScore(@HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @Body RequestBody requestBody);

    @GET("/model/api/arithmetics")
    Call<TypedInput> getModels(@QueryMap Map<String, String> map);

    @POST("/bytebench/api/sdk/device/strategy/score")
    Call<Object<Object>> getSceneScore(@Header("x-bytebench-signature") String str, @QueryMap Map<String, String> map, @Body RequestBody requestBody);

    @POST("/bytebench/api/sdk/device/strategy/batch")
    Call<Object<Object>> getStrategyComprise(@HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @Body RequestBody requestBody);

    @POST("/bytebench/api/sdk/device/strategy/batch/v2")
    Call<TypedInput> getStrategyCompriseV2(@HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @Body RequestBody requestBody);

    @POST("/bytebench/api/sdk/device/strategy/result")
    Call<Object<Object>> getStrategyResult(@Header("x-bytebench-signature") String str, @QueryMap Map<String, String> map, @Body RequestBody requestBody);

    @POST("/bytebench/api/sdk/device/task/result")
    Call<Object<Object>> getTaskResult(@Header("x-bytebench-signature") String str, @QueryMap Map<String, String> map, @Body RequestBody requestBody);

    @POST("/bytebench/api/task/result")
    Call<TypedInput> reportResult(@QueryMap Map<String, String> map, @Body RequestBody requestBody);
}
