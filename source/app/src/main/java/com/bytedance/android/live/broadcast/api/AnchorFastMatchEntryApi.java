package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.ShowFastMatchEntryResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface AnchorFastMatchEntryApi {
    static {
        Covode.recordClassIndex(14379);
    }

    @GET("/webcast/linkmic_audience/show_fast_match_entry/")
    Observable<AbstractC100834PnQ<ShowFastMatchEntryResult>> checkAnchorFastMatch(@Query("room_id") long j);
}
