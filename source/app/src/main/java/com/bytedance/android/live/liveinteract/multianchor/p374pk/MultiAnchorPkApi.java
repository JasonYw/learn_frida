package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.interact.model.C6064t;
import com.bytedance.android.livesdk.chatroom.interact.model.C6065u;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import io.reactivex.Single;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.MultiAnchorPkApi */
/* loaded from: classes3.dex */
public interface MultiAnchorPkApi {
    static {
        Covode.recordClassIndex(28165);
    }

    @GET("/webcast/linkmic/multi_battle_finish/")
    Observable<C5176i<Void>> battleFinish(@Query("channel_id") long j, @Query("finish_source") int i);

    @GET("/webcast/linkmic/multi_battle_open/")
    Observable<C5176i<Void>> battleOpen(@Query("channel_id") long j, @Query("invitee_ids") String str, @Query("duration") long j2);

    @GET("/webcast/linkmic/change_multi_pk_mode_tab/")
    Single<C5176i<C6064t>> changeMultiPkModeTab(@Query("channel_id") long j, @Query("room_id") long j2, @Query("multi_pk_mode_tab") int i);

    @GET("/webcast/linkmic/change_multi_pk_team/")
    Single<C5176i<C6065u>> changeMultiPkTeam(@Query("channel_id") long j, @Query("room_id") long j2);
}
