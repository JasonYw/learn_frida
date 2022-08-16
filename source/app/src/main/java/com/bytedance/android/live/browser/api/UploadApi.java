package com.bytedance.android.live.browser.api;

import com.bytedance.android.live.base.model.user.C2854h;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;
import io.reactivex.Single;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface UploadApi {
    static {
        Covode.recordClassIndex(21963);
    }

    @POST("/webcast/certification/submit_cert_data/")
    Single<C5176i<C2854h>> upload(@Body TypedOutput typedOutput);

    @POST("/webcast/privilege/subscribe/emoji/add/")
    Observable<AbstractC100834PnQ<Object>> uploadSubscribeCustomEmoji(@Query("emoji_scale") int i, @Body TypedOutput typedOutput);
}
