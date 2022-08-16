package com.bytedance.android.live.liveinteract.chatroom.chatroom.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.rank.model.C9217e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import io.reactivex.Observable;
import java.util.Map;

/* loaded from: classes3.dex */
public interface PkFeedbackApi {
    static {
        Covode.recordClassIndex(25319);
    }

    @GET("/webcast/linkmic/battle/feedback/")
    Observable<C5176i<Void>> feedback(@QueryMap Map<String, Object> map);

    @GET("/webcast/linkmic/battle/feedback_issues/")
    Observable<C5176i<C9217e>> getFeedbackIssues(@Query("scene") String str, @Query("room_id") long j, @Query("channel_id") long j2, @Query("anchor_id") long j3);
}
