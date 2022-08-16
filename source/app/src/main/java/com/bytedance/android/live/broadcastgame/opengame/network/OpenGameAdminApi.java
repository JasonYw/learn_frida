package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.live.broadcastgame.opengame.network.model.OpenPlatformRespExtra;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface OpenGameAdminApi {
    static {
        Covode.recordClassIndex(20336);
    }

    @AbstractC102307QQr(LIZ = "live_game")
    @FormUrlEncoded
    @POST("/webcast/openapi/app/start/")
    Observable<C5171b<C3600z, OpenPlatformRespExtra>> sendAppStart(@Field("room_id") long j, @Field("app_id") String str, @Field("launch_source") long j2, @Field("extra") String str2);

    @AbstractC102307QQr(LIZ = "live_game")
    @FormUrlEncoded
    @POST("/webcast/openapi/app/stop/")
    Observable<C5171b<C3535aa, OpenPlatformRespExtra>> sendAppStop(@Field("start_id") String str, @Field("app_id") String str2, @Field("room_id") long j, @Field("extra") String str3);

    @AbstractC102307QQr(LIZ = "live_game")
    @FormUrlEncoded
    @POST("/webcast/openapi/channel/send_status_msg/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> sendStatusMessage(@Field("room_id") long j, @Field("app_id") String str, @Field("send_type") long j2, @Field("status") long j3, @Field("extra") String str2);
}
