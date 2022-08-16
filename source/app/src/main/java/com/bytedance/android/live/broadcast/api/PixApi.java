package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C3162h;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface PixApi {
    static {
        Covode.recordClassIndex(14405);
    }

    @GET("/webcast/linkmic/get_blind_box/")
    Observable<C5176i<C3162h>> getBlindBox();

    @GET("/webcast/linkmic/unlock_blind_box/")
    Observable<C5176i<WaitingReviewInfo>> unlockBlindBox(@Query("resource_id") String str, @Query("extra") String str2);
}
