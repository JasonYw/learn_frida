package com.bytedance.android.live.playtogether.api;

import com.bytedance.android.live.playtogether.p409c.C5218s;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes3.dex */
public interface GameRecordApi {
    static {
        Covode.recordClassIndex(32847);
    }

    @GET("/webcast/gameplay/order/query/")
    Observable<AbstractC100834PnQ<C5218s.C5219a>> queryOrderInfo(@Query("play_type") Integer num, @Query("game_id") String str, @Query("offset") int i, @Query("count") int i2);
}
