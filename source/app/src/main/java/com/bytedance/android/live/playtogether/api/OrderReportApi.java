package com.bytedance.android.live.playtogether.api;

import com.bytedance.android.live.playtogether.p409c.C5194b;
import com.bytedance.android.live.playtogether.p409c.C5200f;
import com.bytedance.android.live.playtogether.p409c.C5204h;
import com.bytedance.android.live.playtogether.p409c.C5228w;
import com.bytedance.android.live.playtogether.p409c.C5229x;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface OrderReportApi {
    static {
        Covode.recordClassIndex(32848);
    }

    @FormUrlEncoded
    @POST("/webcast/gameplay/order/refund/apply/")
    Observable<AbstractC100834PnQ<C5194b>> applyRefund(@Field("play_type") int i, @Field("order_id") String str, @Field("serial_id") long j, @Field("reason_desc") String str2, @Field("game_nick_name") String str3, @Field("images") String str4);

    @GET("/webcast/gameplay/order/refund/get_reason/")
    Observable<AbstractC100834PnQ<C5204h.C5205a>> getReFundReasons(@Query("play_type") int i, @Query("game_id") String str);

    @GET("/webcast/gameplay/order/refund/process_query/")
    Observable<AbstractC100834PnQ<C5228w>> getRefundProcess(@Query("order_id") String str, @Query("play_id") long j);

    @GET("/webcast/gameplay/report/get_reason/")
    Observable<AbstractC100834PnQ<C5204h.C5205a>> getReportReasons(@Query("play_type") int i, @Query("game_id") String str);

    @FormUrlEncoded
    @POST("/webcast/gameplay/order/confirm/")
    Observable<AbstractC100834PnQ<C5200f>> orderConfirm(@Field("order_id") String str, @Field("play_id") long j);

    @FormUrlEncoded
    @POST("/webcast/gameplay/report/submit/")
    Observable<AbstractC100834PnQ<C5229x.C5230a>> submitReport(@Field("play_type") int i, @Field("order_id") String str, @Field("report_desc") String str2, @Field("serial_id") long j, @Field("play_id") long j2, @Field("game_id") String str3, @Field("game_nick_name") String str4, @Field("images") String str5);
}
