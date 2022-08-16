package com.bytedance.android.live.core.verify.api;

import com.bytedance.android.live.core.verify.responbean.CertificationAuthData;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface IOcrGetTokenApi {
    static {
        Covode.recordClassIndex(24147);
    }

    @GET("webcast/certification/auth/")
    Observable<C5176i<CertificationAuthData>> getCertificationEntrance(@Query("verify_channel") String str, @Query("cert_scene") String str2, @Query("cert_name") String str3, @Query("cert_id") String str4, @Query("skip_record_verify") boolean z, @Query("enter_from") String str5);
}
