package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.live.broadcastgame.opengame.network.model.OpenPlatformRespExtra;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface AnchorGameNetApi {
    static {
        Covode.recordClassIndex(20329);
    }

    @GET("/webcast/openapi/business/diamond/rank_list/")
    Observable<C5171b<C3565l, OpenPlatformRespExtra>> getDiamondRankList(@Query("app_id") String str, @Query("room_id") long j);

    @GET("/webcast/openapi/business/diamond/total/")
    Observable<C5171b<C3557au, OpenPlatformRespExtra>> getTotalDiamonds(@Query("app_id") String str, @Query("room_id") long j);

    @FormUrlEncoded
    @POST("/webcast/openapi/app/start/")
    Observable<C5171b<C3600z, OpenPlatformRespExtra>> sendAppStart(@Field("room_id") long j, @Field("app_id") String str, @Field("launch_source") long j2, @Field("extra") String str2, @Field("is_before_start") boolean z, @Field("stamp") String str3, @Field("game_card") String str4);

    @POST("/webcast/openapi/app/stop/")
    Observable<C5171b<C3535aa, OpenPlatformRespExtra>> sendAppStop(@Query("start_id") String str, @Query("app_id") String str2, @Query("room_id") long j, @Query("extra") String str3);

    @POST("/webcast/openapi/channel/send_data_from_anchor/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> sendMessageToAudience(@Query("room_id") long j, @Query("app_id") String str, @Query("send_type") long j2, @Query("to_open_id") String str2, @Query("data") String str3, @Query("extra") String str4);

    @POST("/webcast/openapi/channel/send_status_msg/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> sendStatusMessage(@Query("room_id") long j, @Query("app_id") String str, @Query("send_type") long j2, @Query("status") long j3, @Query("extra") String str2);

    @POST("/webcast/openapi/corner_mark/reach/all/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> showAllAudienceCornerMark(@Query("app_id") String str, @Query("room_id") long j);

    @POST("/webcast/openapi/corner_mark/reach/spec/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> showSpecifyAudienceCornerMark(@Query("app_id") String str, @Query("room_id") long j, @Query("to_open_id") String str2);

    @POST("/webcast/openapi/follow/subscribe/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> subscribeAudienceFollowAction(@Query("app_id") String str, @Query("room_id") long j);

    @POST("/webcast/openapi/comment/subscribe/keyword/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> subscribeSpecifiedContentComment(@Query("app_id") String str, @Query("room_id") long j, @Query("keywords") String str2);

    @POST("/webcast/openapi/comment/subscribe/spec_user/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> subscribeSpecifiedUserComment(@Query("app_id") String str, @Query("room_id") long j, @Query("openids") String str2);

    @POST("/webcast/openapi/comment/unsubscribe/keyword/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> unSubscribeAllSpecifiedContentComment(@Query("app_id") String str, @Query("room_id") long j);

    @POST("/webcast/openapi/comment/unsubscribe/spec_user/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> unSubscribeAllSpecifiedUserComment(@Query("app_id") String str, @Query("room_id") long j);

    @POST("/webcast/openapi/follow/unsubscribe/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> unSubscribeAudienceFollowAction(@Query("app_id") String str, @Query("room_id") long j);
}
