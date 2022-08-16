package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C3163j;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes12.dex */
public interface LiveForenoticeApi {
    static {
        Covode.recordClassIndex(14399);
    }

    @POST("/webcast/anchor/scheduled_time/renewal/")
    Observable<C5176i<C3163j>> updateSchedule(@Query("master_switch") boolean z, @Query("profile_switch") boolean z2, @Query("anchor_scheduled_time") String str, @Query("anchor_scheduled_days") int i, @Query("notice_switch") boolean z3);
}
