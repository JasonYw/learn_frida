package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.List;

/* loaded from: classes5.dex */
public interface GroupPurchaseApi {
    static {
        Covode.recordClassIndex(18344);
    }

    @GET("/webcast/room/toolbar_permission")
    Observable<C5176i<List<C3320s>>> checkShowPermission();

    @GET("https://aweme.snssdk.com/data/life/live/groupon_entry_link/")
    Observable<C3321v> getGrouponEntry();

    @GET("https://aweme.snssdk.com/data/life/live/agg/card/detail/")
    Observable<C3319r> getSelectedCard(@Query("agg_card_id") int i, @Query("room_id") int i2, @Query("anchor_id") int i3);
}
