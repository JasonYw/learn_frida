package com.bytedance.android.live.profit.dress.api;

import com.bytedance.android.live.profit.dress.C5251a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.List;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface DressApi {
    static {
        Covode.recordClassIndex(33241);
    }

    @GET("/webcast/dress/list/")
    Observable<AbstractC100834PnQ<C5251a>> fetchAllDressList(@Query("version") String str, @Query("room_id") long j);

    @GET("/webcast/dress/list/")
    Observable<AbstractC100834PnQ<C5251a>> fetchDressList(@Query("dress_ids") List<String> list, @Query("room_id") long j);
}
