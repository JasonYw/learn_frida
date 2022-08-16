package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.p253d.C2880a;
import com.bytedance.android.live.broadcast.api.p253d.C2881b;
import com.bytedance.android.live.broadcast.download.p262ai.C3000h;
import com.bytedance.android.live.broadcast.p271l.C3146b;
import com.bytedance.android.live.broadcast.playrank.C3171a;
import com.bytedance.android.live.broadcast.promotelist.C3214k;
import com.bytedance.android.live.broadcast.props.p278a.C3216a;
import com.bytedance.android.live.broadcast.props.p278a.C3217b;
import com.bytedance.android.live.broadcast.props.p278a.C3220e;
import com.bytedance.android.live.broadcast.props.p278a.C3223h;
import com.bytedance.android.live.broadcast.props.p278a.C3225j;
import com.bytedance.android.live.broadcast.props.p278a.C3226k;
import com.bytedance.android.live.broadcast.props.p278a.C3227l;
import com.bytedance.android.live.broadcast.welfare.packs.detail.C3273d;
import com.bytedance.android.live.broadcast.welfare.packs.p281a.C3270c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface GamePromoteApi {
    static {
        Covode.recordClassIndex(14392);
    }

    @FormUrlEncoded
    @POST("/webcast/gamecp/bind_account/")
    Observable<AbstractC100834PnQ<C3216a>> bindAccountInfo(@Field("game_id") String str, @Field("guid") String str2, @Field("nick_name") String str3, @Field("avatar_icon") String str4, @Field("server_id") Long l, @Field("server_name") String str5, @Field("real_role_id") String str6, @Field("bind_source") String str7);

    @FormUrlEncoded
    @POST("/webcast/gamecp/buy_goods/")
    Observable<AbstractC100834PnQ<C3217b>> buyGoods(@Field("anchor_id") Long l, @Field("sku_id") Long l2, @Field("room_id") Long l3, @Field("num") Long l4, @Field("prop_type") Long l5, @Field("enter_from") Long l6, @Field("coupon_claim_id") String str, @Field("coupon_discount_amount") Long l7);

    @FormUrlEncoded
    @POST("/webcast/gamecp/shark_check/")
    Observable<AbstractC100834PnQ<C2880a>> checkSharkResult(@Field("event") String str, @Field("game_id") String str2, @Field("download_status") Long l, @Field("scene") Long l2);

    @FormUrlEncoded
    @POST("/webcast/gamecp/get_bind_role_list/")
    Observable<AbstractC100834PnQ<C3220e>> fetchAccountList(@Field("game_id") String str);

    @GET("/webcast/gamecp/user/anchor_promotions/")
    Observable<C5176i<C3214k>> getAnchorPromoteList(@Query("room_id") String str, @Query("anchor_id") String str2);

    @GET("/webcast/gamecp/user/get_permit_auth_data/")
    Observable<C5176i<C3171a>> getDownloadPlayerRankStatus();

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/gamecp/user/account_bind_info/")
    Observable<C5176i<C3146b>> getMyGameList();

    @FormUrlEncoded
    @POST("/webcast/gamecp/user/prop_detail/")
    Observable<AbstractC100834PnQ<C3223h>> getPropDetail(@Field("anchor_id") Long l, @Field("prop_id") String str, @Field("room_id") Long l2, @Field("game_id") String str2, @Field("place_channel") Long l3);

    @FormUrlEncoded
    @POST("/webcast/gamecp/user/game_props/")
    Observable<AbstractC100834PnQ<C3227l>> getPropList(@Field("anchor_id") Long l, @Field("room_id") Long l2, @Field("game_id") String str);

    @GET("/webcast/gamecp/user/get_game_prop_data_auth/")
    Observable<C5176i<C3171a>> getPropPlayerRankStatus();

    @FormUrlEncoded
    @POST("/webcast/gamecp/gift/receive_list/")
    Observable<AbstractC100834PnQ<C3270c>> getReceivePacksList(@Field("anchor_id") Long l, @Field("room_id") Long l2, @Field("offset") Long l3, @Field("count") Long l4);

    @GET("/webcast/gamecp/user/simple_anchor_promotions/")
    Observable<C5176i<C3000h>> getSimpleAnchorPromoteList(@Query("anchor_id") String str);

    @GET("/webcast/gamecp/ecom_schema/")
    Observable<AbstractC100834PnQ<C2881b>> getWalletSchema(@Query("page") String str, @Query("params") String str2);

    @FormUrlEncoded
    @POST("/webcast/gamecp/get_gamecp_user_info_by_guid/")
    Observable<AbstractC100834PnQ<C3225j>> queryAccountInfo(@Field("game_id") String str, @Field("guid") String str2);

    @GET("/webcast/wallet_content_trade_api/get_game_item_pay_result/")
    Observable<AbstractC100834PnQ<C3226k>> queryOrderState(@Query("order_id") String str);

    @FormUrlEncoded
    @POST("/webcast/gamecp/gift/platform/receive/")
    Observable<C5176i<C3273d>> receivePacks(@Field("anchor_id") Long l, @Field("game_id") String str, @Field("gift_id") Long l2, @Field("room_id") Long l3);

    @FormUrlEncoded
    @POST("/webcast/gamecp/user/set_permit_auth_data/")
    Observable<C5176i<Object>> setDownloadPlayerRankStatus(@Field("auth") int i, @Field("platform") int i2);

    @FormUrlEncoded
    @POST("/webcast/gamecp/user/set_game_prop_data_auth/")
    Observable<C5176i<Object>> setPropPlayerRankStatus(@Field("auth") int i, @Field("platform") int i2);

    @FormUrlEncoded
    @POST("/webcast/gamecp/game/app_download_status/")
    Observable<C5176i<Object>> updateDownloadStatus(@Field("game_id") String str, @Field("game_name") String str2, @Field("anchor_id") String str3, @Field("status") int i, @Field("platform") int i2, @Field("scene") int i3);
}
