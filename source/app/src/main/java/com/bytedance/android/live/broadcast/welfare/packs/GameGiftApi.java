package com.bytedance.android.live.broadcast.welfare.packs;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes.dex */
public interface GameGiftApi {
    static {
        Covode.recordClassIndex(18220);
    }

    @GET("/webcast/gamecp/gift/platform/list/")
    Observable<AbstractC100834PnQ<C3271b>> getGiftList(@Query("room_id") String str, @Query("anchor_id") String str2, @Query("game_id") String str3, @Query("offset") int i, @Query("count") int i2);
}
