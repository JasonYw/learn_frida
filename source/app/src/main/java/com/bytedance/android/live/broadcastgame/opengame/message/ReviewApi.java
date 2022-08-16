package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.Headers;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import p003X.AbstractC102307QQr;

/* loaded from: classes.dex */
public interface ReviewApi {
    static {
        Covode.recordClassIndex(20258);
    }

    @POST("/wsos_v2/webcast_interact_open/object_exists/")
    Observable<UploadCheckRsp> preUploadCheck(@Body PreUploadCheckBean preUploadCheckBean);

    @AbstractC102307QQr(LIZ = "live_game")
    @FormUrlEncoded
    @POST("/webcast/openapi/panel/hide/")
    Observable<C5176i<Object>> reportPanelHide(@Field("app_id") String str, @Field("room_id") long j);

    @AbstractC102307QQr(LIZ = "live_game")
    @FormUrlEncoded
    @POST("/webcast/openapi/panel/show/")
    Observable<C5176i<Object>> reportPanelShow(@Field("app_id") String str, @Field("room_id") long j);

    @AbstractC102307QQr(LIZ = "live_game")
    @FormUrlEncoded
    @POST("/webcast/openapi/screenshot/audit/")
    Observable<C5176i<Object>> sendScreenShotAudit(@Field("app_id") String str, @Field("room_id") long j, @Field("recall_id") long j2, @Field("audit_list") String str2);

    @Headers({"Content-Type:image/jpeg"})
    @POST("/wsos_v2/webcast_interact_open/upload/")
    Observable<UploadFileRsp> uploadFiles(@Body RequestBody requestBody);
}
