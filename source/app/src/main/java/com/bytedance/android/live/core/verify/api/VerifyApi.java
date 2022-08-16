package com.bytedance.android.live.core.verify.api;

import com.bytedance.android.live.core.verify.responbean.C4160a;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;
import java.util.Map;

/* loaded from: classes5.dex */
public interface VerifyApi {
    static {
        Covode.recordClassIndex(24149);
    }

    @FormUrlEncoded
    @POST("/webcast/certification/id_card_verify/")
    Observable<C5176i<C4160a>> getCertificationVerify(@FieldMap Map<String, String> map);
}
