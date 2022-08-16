package com.bytedance.android.live.core.verify.api;

import com.bytedance.android.live.base.model.p250e.C2825a;
import com.bytedance.android.live.base.model.p250e.C2826b;
import com.bytedance.android.live.core.verify.responbean.C4160a;
import com.bytedance.android.live.core.verify.responbean.CertificationQuery;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.model.GetCertificationEntranceResponse;
import com.bytedance.android.livesdk.model.ZhimaStatusResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import java.util.Map;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface ZhimaVerifyApi {
    static {
        Covode.recordClassIndex(24151);
    }

    @AbstractC102307QQr(LIZ = "preview")
    @GET("/webcast/anchor/permission/creator_certification_chk/")
    Observable<C5176i<C2825a>> getCertificationCheck();

    @FormUrlEncoded
    @POST("/webcast/certification/common/submit/")
    Observable<C5176i<C4160a>> getCertificationCommonSubmit(@FieldMap Map<String, String> map);

    @GET("/webcast/certification/get_certification_entrance/")
    Observable<C5176i<GetCertificationEntranceResponse>> getCertificationEntrance();

    @GET("/webcast/certification/get_certification_status/")
    Observable<C5176i<ZhimaStatusResponse>> getCertificationStatus();

    @GET("/webcast/certification/certification_page_init/")
    Observable<C5176i<C2826b>> getCertificationStatusForAll();

    @FormUrlEncoded
    @POST("/webcast/certification/submit/")
    Observable<C5176i<C4160a>> getCertificationSubmit(@FieldMap Map<String, String> map);

    @GET("/webcast/certification/common/query/")
    Observable<C5176i<CertificationQuery>> queryCertificationCommonResult(@QueryMap Map<String, String> map);

    @GET("/webcast/certification/common/query/")
    Observable<C5176i<JsonObject>> queryCertificationCommonResultForString(@QueryMap Map<String, String> map);

    @GET("/webcast/certification/query/")
    Observable<C5176i<CertificationQuery>> queryCertificationResult(@QueryMap Map<String, String> map);

    @GET("/webcast/certification/query/")
    Observable<C5176i<JsonObject>> queryCertificationResultForString(@QueryMap Map<String, String> map);
}
