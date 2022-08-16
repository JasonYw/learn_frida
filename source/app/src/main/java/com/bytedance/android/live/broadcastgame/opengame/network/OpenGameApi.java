package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.live.broadcastgame.opengame.network.model.OpenPlatformRespExtra;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.network.response.ExtraResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface OpenGameApi {
    static {
        Covode.recordClassIndex(20337);
    }

    @GET("/webcast/openapi/business/individual/player/")
    Observable<C5171b<C3562i, OpenPlatformRespExtra>> checkIndividualPlayer(@Query("app_id") String str, @Query("room_id") long j);

    @POST("/webcast/openapi/performance/task/status/")
    Observable<AbstractC100834PnQ<C3550an>> checkPerfTestStatus(@Query("app_id") String str, @Query("room_id") long j, @Query("task_id") String str2);

    @POST("/webcast/openapi/game_prop/usage_order/create/")
    Observable<ExtraResponse<C3564k, OpenPlatformRespExtra>> createPropUsageOrder(@Query("app_id") String str, @Query("room_id") long j, @Query("prop_id") long j2, @Query("prop_num") long j3);

    @POST("/webcast/openapi/apiconfig/")
    Observable<ExtraResponse<C3588p, OpenPlatformRespExtra>> getApiConfig(@Query("room_id") long j, @Query("app_id") String str, @Query("cache_hash") String str2);

    @POST("/webcast/openapi/bootconfig/")
    Observable<C5176i<C3531a>> getBootConfig(@Query("app_id") String str, @Query("room_id") long j);

    @POST("/webcast/openapi/crypt/room/")
    Observable<C5176i<C3589q>> getCrypt(@Query("app_id") String str, @Query("room_id") long j);

    @GET("/webcast/openapi/user/info/mine/")
    Observable<C5171b<C3540af, OpenPlatformRespExtra>> getCurrentUserInfo(@Query("app_id") String str, @Query("room_id") long j);

    @GET("/webcast/stamp/entrance_info/")
    Observable<AbstractC100834PnQ<C3567m>> getEntranceInfo(@Query("room_id") long j);

    @GET("/webcast/openapi/room/info/")
    Observable<C5171b<C3538ae, OpenPlatformRespExtra>> getRoomInfo(@Query("app_id") String str, @Query("room_id") long j);

    @GET("/webcast/openapi/user/unencrypted_info/mine")
    Observable<ExtraResponse<C3542ag, OpenPlatformRespExtra>> getUserInfoV2(@Query("app_id") String str, @Query("room_id") long j);

    @GET("/webcast/openapi/game_prop/player/query/")
    Observable<ExtraResponse<C3595t, OpenPlatformRespExtra>> getUserPropInfo(@Query("app_id") String str, @Query("room_id") long j, @Query("prop_ids_str") String str2);

    @POST("/webcast/openapi/linkmic/invite/")
    Observable<ExtraResponse<C3597v, OpenPlatformRespExtra>> inviteLiveUser(@Query("app_id") String str, @Query("room_id") long j, @Query("open_id_list") String str2);

    @POST("/webcast/openapi/linkmic/kickout/")
    Observable<ExtraResponse<C3598w, OpenPlatformRespExtra>> kickOutUser(@Query("app_id") String str, @Query("room_id") long j, @Query("open_id_list") String str2);

    @POST("/webcast/openapi/linkmic/camera/disable/")
    Observable<ExtraResponse<C3544ah, OpenPlatformRespExtra>> operateUserCamera(@Query("app_id") String str, @Query("room_id") long j, @Query("open_id_list") String str2, @Query("disable") int i);

    @POST("/webcast/openapi/linkmic/microphone/disable/")
    Observable<ExtraResponse<C3545ai, OpenPlatformRespExtra>> operateUserMicrophone(@Query("app_id") String str, @Query("room_id") long j, @Query("open_id_list") String str2, @Query("disable") int i);

    @POST("/webcast/openapi/performance/task/run/")
    Observable<AbstractC100834PnQ<C3549am>> runPerfTestTask(@Query("app_id") String str, @Query("task_id") String str2, @Query("room_id") long j, @Query("app_version") String str3);

    @GET("/webcast/openapi/applet/audience/start/")
    Observable<ExtraResponse<C3536ab, OpenPlatformRespExtra>> sendAudienceStart(@Query("room_id") Long l, @Query("app_id") String str, @Query("anchor_id") Long l2, @Query("live_scene_type") int i);

    @GET("/webcast/openapi/applet/audience/stop/")
    Observable<ExtraResponse<C3537ac, OpenPlatformRespExtra>> sendAudienceStop(@Query("start_id") Long l, @Query("app_id") String str);

    @POST("/webcast/openapi/channel/send_panel_ctrl_msg/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> sendPanelCtrlMessage(@Query("room_id") long j, @Query("app_id") String str, @Query("send_type") long j2, @Query("panel_type") long j3, @Query("to_open_id") String str2, @Query("extra") String str3);

    @POST("/webcast/openapi/performance/task/finish/")
    Observable<AbstractC100834PnQ<C3551ao>> submitPerfTestTask(@Query("app_id") String str, @Query("room_id") long j, @Query("task_id") String str2);

    @POST("/webcast/openapi/performance/data/upload/")
    Observable<AbstractC100834PnQ<C3552ap>> uploadPerfTestData(@Query("app_id") String str, @Query("room_id") long j, @Query("task_id") String str2, @Query("data") String str3);
}
