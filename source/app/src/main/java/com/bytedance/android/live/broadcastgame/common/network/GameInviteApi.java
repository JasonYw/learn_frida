package com.bytedance.android.live.broadcastgame.common.network;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface GameInviteApi {
    static {
        Covode.recordClassIndex(19654);
    }

    @POST("/webcast/game/invite/cancel/")
    Observable<C5176i<Object>> cancelInvite(@Query("room_id") long j);

    @POST("/webcast/game/invite/invite/")
    Observable<C5176i<Object>> invite(@Query("kind") int i, @Query("room_id") long j, @Query("user_id") long j2, @Query("game_id") long j3);

    @POST("/webcast/game/invite/reply/")
    Observable<C5176i<Object>> replyInvite(@Query("reply") int i, @Query("from_user_id") long j);
}
