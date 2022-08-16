package com.bytedance.android.live.liveinteract.voicechat.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdkapi.depend.model.live.audio.C9493a;
import com.bytedance.android.livesdkapi.depend.model.live.audio.C9496d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;

/* loaded from: classes3.dex */
public interface KtvDigitAvatarApi {
    static {
        Covode.recordClassIndex(30870);
    }

    @GET("/webcast/linkmic_audience/ktv/get_avatar_audit/")
    Observable<C5176i<C9493a>> getAvatarAuditResult();

    @POST("/webcast/linkmic_audience/ktv/upload_avatar_img/")
    Observable<C5176i<C9496d>> uploadImage4Audit(@Query("room_id") long j, @Body TypedOutput typedOutput);
}
