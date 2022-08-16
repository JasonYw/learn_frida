package com.bytedance.android.live.broadcast.preview.api;

import com.bytedance.android.live.broadcast.model.C3157c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface BanUserInfoApi {
    static {
        Covode.recordClassIndex(17201);
    }

    @GET("/webcast/user/ban_detail/")
    Observable<C5176i<C3157c>> getBanUserInfo();
}
