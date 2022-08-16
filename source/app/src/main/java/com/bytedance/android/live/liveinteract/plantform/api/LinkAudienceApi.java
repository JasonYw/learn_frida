package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.liveinteract.plantform.model.C4812f;
import com.bytedance.android.live.liveinteract.plantform.model.C4815i;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.C6091ac;
import com.bytedance.android.livesdk.chatroom.model.C6092ad;
import com.bytedance.android.livesdk.chatroom.model.C6096ag;
import com.bytedance.android.livesdk.chatroom.model.C6118az;
import com.bytedance.android.livesdk.chatroom.model.C6119b;
import com.bytedance.android.livesdk.chatroom.model.C6143i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6150ah;
import com.bytedance.android.livesdk.chatroom.model.interact.C6160b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6163g;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;

/* loaded from: classes3.dex */
public interface LinkAudienceApi {
    static {
        Covode.recordClassIndex(29186);
    }

    @FormUrlEncoded
    @POST("/webcast/linkmic_audience/apply/")
    Single<C5176i<C6119b>> apply(@Field("room_id") long j, @Field("anchor_id") long j2, @FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/webcast/linkmic_audience/apply_callback/")
    Observable<C5176i<Object>> applyCallbackReq(@Field("room_id") long j, @Field("callback_type") int i);

    @GET("/webcast/linkmic_audience/check_linkers/")
    Single<C5176i<C6143i>> checkLinkers(@Query("room_id") long j, @Query("linkmic_id_list") String str, @Query("request_source") String str2);

    @GET("/webcast/linkmic_audience/interact_entrance/")
    Observable<C5176i<C6091ac>> fetchInteractEntrances(@Query("room_id") long j, @Query("to_user_id") long j2);

    @GET("/webcast/linkmic_audience/get_audience_settings/")
    Single<C5176i<C6096ag>> getAudienceSettings(@Query("keys") String str, @Query("room_id") long j);

    @GET("/webcast/linkmic_profit/bid_paid_linkmic_get_info/")
    Observable<C5176i<C4812f>> getBidPaidLinkmicGetInfo(@Query("room_id") long j);

    @GET("/webcast/linkmic_profit/get_info_before_add_price/")
    Single<C5176i<C4815i>> getInfoBeforeAddPrice(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/get_user_waiting_offset/")
    Single<C5176i<C6163g>> getUserWaitingRankPosition(@Query("room_id") long j, @Query("linker_id") long j2, @Query("scene") int i, @Query("type") int i2);

    @GET("/webcast/linkmic_profit/bid_paid_linkmic_give_up/")
    Observable<C5176i<Object>> giveUpLinkPaid(@Query("room_id") long j);

    @GET("/webcast/linkmic_profit/normal_paid_linkmic_add_price/")
    Single<C5176i<Void>> increasePriceApply(@Query("room_id") long j, @Query("add_price_value") long j2);

    @GET("/webcast/linkmic_audience/interact_list/")
    Single<C5176i<C6092ad>> interactList(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/invite/")
    Observable<C5176i<C6068x>> invite(@Query("room_id") long j, @Query("sec_to_user_id") String str, @Query("layout") int i, @Query("position") int i2);

    @GET("/webcast/linkmic_audience/invite/")
    Observable<C5176i<C6068x>> invite(@Query("room_id") long j, @Query("sec_to_user_id") String str, @Query("layout") int i, @Query("position") int i2, @Query("teamfight_team_id") int i3, @Query("msg_board_item_id") long j2);

    @GET("/webcast/linkmic_audience/notify_join_rtc/")
    Single<C5176i<Void>> notifyJoinRtc(@Query("room_id") long j, @Query("token") String str);

    @FormUrlEncoded
    @POST("/webcast/linkmic_audience/prepare_apply/")
    Single<C5176i<C6118az>> prepareApply(@Field("room_id") long j, @Field("guest_supported_vendor") int i, @Field("link_type") int i2, @Field("silence_status") int i3);

    @GET("/webcast/linkmic_audience/cancel_prepare_apply/")
    Single<C5176i<Void>> prepareApplyCancel(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/reply/")
    Observable<C5176i<C6160b>> reply(@Query("room_id") long j, @Query("sec_to_user_id") String str, @Query("reply_type") int i, @Query("layout") int i2, @Query("link_type") int i3, @Query("user_distribution_source") String str2);

    @POST("/webcast/linkmic_audience/enlarge_guest/reply/")
    Single<C5176i<Object>> replyCPosition(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("reply_type") int i);

    @FormUrlEncoded
    @POST("/webcast/linkmic_profit/bid_paid_linkmic_bid/")
    Observable<C5176i<Object>> sendBidPrice(@Field("room_id") long j, @Field("bid_price") int i);

    @POST("/webcast/linkmic_audience/enlarge_guest/invite/")
    Single<C5176i<Void>> setCPosition(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("invite_type") int i);

    @FormUrlEncoded
    @POST("/webcast/linkmic_audience/show_guideline/")
    Single<C5176i<C6150ah>> showApplyPopupSuccess(@Field("room_id") long j, @Field("guideline_type") long j2);

    @GET("/webcast/linkmic_audience/update_application_reason/")
    Single<C5176i<Void>> updateApplyReason(@Query("room_id") long j, @Query("scene") int i, @Query("type") int i2, @Query("reason") String str);

    @FormUrlEncoded
    @POST("/webcast/linkmic_audience/update_audience_settings/")
    Single<C5176i<Void>> updateAudienceSettings(@Field("room_id") long j, @Field("settings") String str);
}
