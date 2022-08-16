package cn.ever.cloud.network_impl.api;

import cn.ever.cloud.network.entity.C0735e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.Headers;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* loaded from: classes23.dex */
public interface RetrofitUploadApi {
    static {
        Covode.recordClassIndex(3277);
    }

    @Headers({"Content-Type:application/octet-stream"})
    @POST("/sf/{sf}/v4/UploadChunk")
    Call<C0735e> uploadChunk(@Path("sf") String str, @Body TypedOutput typedOutput, @QueryMap Map<String, String> map);
}
