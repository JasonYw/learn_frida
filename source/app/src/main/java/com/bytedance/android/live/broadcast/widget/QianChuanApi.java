package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes12.dex */
public interface QianChuanApi {
    static {
        Covode.recordClassIndex(18778);
    }

    @GET("https://aweme.snssdk.com/aweme/ecp/douplus/item/check/")
    Observable<C3315bi> getQianChuanSchema(@Query("item_type") int i, @Query("item_id") String str, @Query("screen_type") int i2, @Query("sec_anchor_id") String str2);
}
