package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface StickerReportApi {
    static {
        Covode.recordClassIndex(14409);
    }

    @FormUrlEncoded
    @POST("/webcast/gift/set_room_supported/")
    Observable<C5176i<Object>> reportFaceGift(@Field("room_id") long j, @Field("gift_ids") String str);
}
