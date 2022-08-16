package com.bytedance.android.live.core.verify.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import java.util.Map;

/* loaded from: classes8.dex */
public interface IOcrVerifyApi {
    static {
        Covode.recordClassIndex(24148);
    }

    @GET("/webcast/certification/query/")
    Observable<C5176i<JsonObject>> queryPollingStatus(@Query("verify_channel") String str, @Query("byte_token") String str2, @Query("scene") int i, @Query("enter_from") String str3, @Query("skip_record_verify") boolean z, @Query("cert_type") String str4, @Query("byte_scene") String str5, @Query("children_cert_token") String str6, @Query("youth_cert_scene") int i2, @QueryMap Map<String, String> map);

    @GET("/webcast/certification/query/")
    Observable<C5176i<JsonObject>> queryPollingStatus(@Query("verify_channel") String str, @Query("byte_token") String str2, @Query("enter_from") String str3, @Query("skip_record_verify") boolean z, @Query("cert_type") String str4, @Query("byte_scene") String str5, @Query("children_cert_token") String str6, @Query("youth_cert_scene") int i, @QueryMap Map<String, String> map);
}
