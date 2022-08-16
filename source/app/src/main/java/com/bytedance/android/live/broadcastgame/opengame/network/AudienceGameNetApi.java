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
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface AudienceGameNetApi {
    static {
        Covode.recordClassIndex(20330);
    }

    @GET("/webcast/openapi/business/order/gen_id/")
    Observable<C5171b<C3563j, OpenPlatformRespExtra>> createOrderId(@Query("app_id") String str, @Query("room_id") long j);

    @GET("/webcast/openapi/user/collection_status/")
    Observable<C5171b<C3593s, OpenPlatformRespExtra>> getCollectionStatus(@Query("app_id") String str, @Query("room_id") long j);

    @GET("/webcast/stamp/entrance_visiable/")
    Observable<AbstractC100834PnQ<C3584n>> getEntranceVisiable(@Query("room_id") long j, @Query("elem_type") long j2, @Query("elem_id") long j3);

    @GET("/webcast/stamp/im/info/")
    Observable<AbstractC100834PnQ<C3596u>> getIMInfo(@Query("room_id") long j, @Query("app_id") String str, @Query("im_extra") String str2);

    @GET("/webcast/openapi/follow/status/")
    Observable<C5171b<C3585o, OpenPlatformRespExtra>> isFollowAnchor(@Query("app_id") String str, @Query("room_id") long j);

    @FormUrlEncoded
    @POST("/webcast/openapi/business/diamond/pay/")
    Observable<C5171b<C3546aj, OpenPlatformRespExtra>> payDiamond(@Query("app_id") String str, @Query("room_id") long j, @Query("order_id") String str2, @Query("diamonds") long j2, @Query("pay_tag") String str3, @Field("tags_extra") String str4);

    @FormUrlEncoded
    @POST("/webcast/openapi/business/order/pay/")
    Observable<C5171b<C3547ak, OpenPlatformRespExtra>> payDiamondV3(@Query("app_id") String str, @Query("room_id") long j, @Query("order_id") String str2, @Query("diamonds") long j2, @Query("pay_tag") String str3, @Field("tags_extra") String str4);

    @GET("/webcast/openapi/business/diamond/query/")
    Observable<C5171b<C3548al, OpenPlatformRespExtra>> queryOrderStatus(@Query("app_id") String str, @Query("order_id") String str2, @Query("room_id") long j);

    @POST("/webcast/openapi/channel/send_data_from_audience/")
    Observable<C5171b<Object, OpenPlatformRespExtra>> sendMessageToAnchor(@Query("room_id") long j, @Query("app_id") String str, @Query("data") String str2, @Query("extra") String str3);
}
