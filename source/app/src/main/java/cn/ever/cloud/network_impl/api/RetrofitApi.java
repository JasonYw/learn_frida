package cn.ever.cloud.network_impl.api;

import cn.ever.cloud.network.entity.C0731a;
import cn.ever.cloud.network.entity.C0732b;
import cn.ever.cloud.network.entity.C0733c;
import cn.ever.cloud.network.entity.C0734d;
import cn.ever.cloud.network.entity.C0736f;
import cn.ever.cloud.network.entity.C0737g;
import cn.ever.cloud.network.entity.NGetAssetEncRequest;
import cn.ever.cloud.network.entity.NGetUpdatesRequest;
import cn.ever.cloud.network.entity.NGetVideoPlayerRequest;
import cn.ever.cloud.network.entity.NPostSyncCommandRequest;
import cn.ever.cloud.network.entity.NUploadCompleteRequest;
import cn.ever.cloud.network.entity.NUploadStateRequest;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.Headers;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;

/* loaded from: classes23.dex */
public interface RetrofitApi {
    static {
        Covode.recordClassIndex(3275);
    }

    @Headers({"Content-Type:application/json"})
    @POST("/sf/{sf}/{method}")
    Call<C0731a> getAssetEnc(@Path("sf") String str, @Path(encode = false, value = "method") String str2, @Body NGetAssetEncRequest nGetAssetEncRequest);

    @Headers({"Content-Type:application/json"})
    @POST("/sf/{sf}/{method}")
    Call<C0732b> getUpdates(@Path("sf") String str, @Path(encode = false, value = "method") String str2, @Body NGetUpdatesRequest nGetUpdatesRequest);

    @Headers({"Content-Type:application/json"})
    @POST("/sf/{sf}/{method}")
    Call<C0733c> getVideoPlayer(@Path("sf") String str, @Path(encode = false, value = "method") String str2, @Body NGetVideoPlayerRequest nGetVideoPlayerRequest);

    @Headers({"Content-Type:application/json"})
    @POST("/sf/{sf}/{method}")
    Call<C0734d> postSyncCommand(@Path("sf") String str, @Path(encode = false, value = "method") String str2, @Body NPostSyncCommandRequest nPostSyncCommandRequest);

    @Headers({"Content-Type:application/json"})
    @POST("/sf/{sf}/{method}")
    Call<C0736f> uploadComplete(@Path("sf") String str, @Path(encode = false, value = "method") String str2, @Body NUploadCompleteRequest nUploadCompleteRequest);

    @Headers({"Content-Type:application/json"})
    @POST("/sf/{sf}/{method}")
    Call<C0737g> uploadState(@Path("sf") String str, @Path(encode = false, value = "method") String str2, @Body NUploadStateRequest nUploadStateRequest);
}
