package com.bytedance.android.live.broadcast.imagex.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface ImageXUploadApi {
    static {
        Covode.recordClassIndex(16837);
    }

    @GET("/webcast/gamecp/imageX/get_imageX_token")
    Observable<AbstractC100834PnQ<C3142a>> getImageXToken();
}
