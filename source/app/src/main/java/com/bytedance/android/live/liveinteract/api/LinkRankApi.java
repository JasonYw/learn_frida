package com.bytedance.android.live.liveinteract.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.rank.model.C9215d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes12.dex */
public interface LinkRankApi {
    static {
        Covode.recordClassIndex(25103);
    }

    @GET("/webcast/ranklist/linker/")
    Observable<C5176i<C9215d>> getLinkerRankList(@Query("room_id") long j, @Query("sec_anchor_id") String str, @Query("sec_linker_user_id") String str2, @Query("scene") long j2);
}
