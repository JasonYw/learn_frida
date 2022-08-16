package com.bytedance.android.live.broadcast.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface AutoReplyApi {
    static {
        Covode.recordClassIndex(14382);
    }

    @FormUrlEncoded
    @POST("/webcast/room/set_auto_gift_thanks/")
    Observable<Object> enableAutoReply(@Field("enabled") String str);
}
