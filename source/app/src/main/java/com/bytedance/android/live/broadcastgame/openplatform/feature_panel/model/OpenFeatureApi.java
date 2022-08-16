package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.model;

import com.bytedance.android.live.broadcastgame.api.model.C3372ac;
import com.bytedance.android.live.broadcastgame.api.model.C3382n;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface OpenFeatureApi {
    static {
        Covode.recordClassIndex(21360);
    }

    @GET("/webcast/stamp/interact_entrance/")
    Observable<AbstractC100834PnQ<C3382n>> fetchFeatureList(@Query("scene") long j, @Query("room_id") long j2, @Query("effect_sdk_version") String str, @Query("cache_hash") String str2);

    @GET("/webcast/stamp/search_entrance/")
    Observable<AbstractC100834PnQ<C3372ac>> searchEntrance(@Query("scene") long j, @Query("room_id") Long l, @Query("key_word") String str, @Query("effect_sdk_version") String str2);
}
