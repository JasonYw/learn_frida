package com.bytedance.android.live.broadcast.welfare.coupon.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface GameCouponApi {
    static {
        Covode.recordClassIndex(18190);
    }

    @GET("/webcast/gamecp/coupon/user_coupons")
    Observable<AbstractC100834PnQ<C3267f>> getUserCouponList(@Query("room_id") Long l, @Query("anchor_id") Long l2, @Query("game_id") String str, @Query("need_valid") boolean z, @Query("use_scene") Long l3, @Query("before_coupon_prices") String str2, @Query("only_default") Boolean bool);

    @GET("/webcast/gamecp/coupon/user_claim")
    Observable<AbstractC100834PnQ<C3266e>> receiveCoupon(@Query("coupon_id") String str, @Query("anchor_id") Long l, @Query("room_id") Long l2, @Query("game_id") String str2);
}
