package com.bytedance.android.live.impl.strategy;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes17.dex */
public interface StrategyPlatformApi {
    static {
        Covode.recordClassIndex(25029);
    }

    @POST("/webcast/strategy/setting/")
    Observable<C5176i<C4252a>> fetchStrategySource();
}
