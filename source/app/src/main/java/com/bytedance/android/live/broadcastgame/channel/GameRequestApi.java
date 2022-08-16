package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes3.dex */
public interface GameRequestApi {
    static {
        Covode.recordClassIndex(19360);
    }

    @POST("/webcast/game/effect/data/")
    Observable<C5176i<C3433m>> requestServer(@Query("room_id") long j, @Query("game_id") long j2, @Query("anchor_id") long j3, @Query("name") String str, @Query("extra") String str2);
}
