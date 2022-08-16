package com.bytedance.android.live.profit.fansclub.transfer;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes12.dex */
public interface FansClubApi {
    static {
        Covode.recordClassIndex(33329);
    }

    @GET("/webcast/discipulus/get_discipulus_group/")
    Observable<Object> queryFansClubInfoForXT(@Query("anchor_id") long j);

    @GET("/webcast/fansclub/me/")
    Observable<C5176i<C5275e>> queryFansClubMe(@Query("anchor_id") long j);
}
