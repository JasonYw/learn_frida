package com.bytedance.android.live.playtogether.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.playtogether.p409c.C5195c;
import com.bytedance.android.live.playtogether.p409c.C5208j;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface PlayTogetherAudienceApi {
    static {
        Covode.recordClassIndex(32851);
    }

    @GET("/webcast/gameplay/team/panel/audience/")
    Observable<AbstractC100834PnQ<C5195c.C5196a>> getAudiencePanelInfo(@Query("play_id") long j);

    @GET("/webcast/gameplay/team/join/")
    Observable<C5171b<C5208j.C5209a, Extra>> joinGame(@Query("play_id") long j, @Query("fare_count") int i, @Query("fare_value") int i2);
}
