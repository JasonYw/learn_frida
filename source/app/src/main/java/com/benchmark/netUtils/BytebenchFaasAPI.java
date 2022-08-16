package com.benchmark.netUtils;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;
import okhttp3.RequestBody;

/* loaded from: classes23.dex */
public interface BytebenchFaasAPI {
    static {
        Covode.recordClassIndex(9698);
    }

    @POST("/")
    Call<TypedInput> reportResult(@QueryMap Map<String, String> map, @Body RequestBody requestBody);
}
