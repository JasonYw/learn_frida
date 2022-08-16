package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.C2910f;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface BroadcastConfigRetrofitApi {
    static {
        Covode.recordClassIndex(14383);
    }

    @GET("/webcast/room/live_scenario/")
    Observable<C5176i<C2910f>> getBroadcastConfig();
}
