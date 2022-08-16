package com.bytedance.android.live.broadcastgame.common.network;

import com.bytedance.android.live.broadcastgame.effectgame.choosemusic.C3470f;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface AnchorGameApi {
    static {
        Covode.recordClassIndex(19653);
    }

    @POST("/webcast/game/status/ranklist/")
    Observable<C5176i<C3448b>> getGameRankList(@Query("game_id") long j, @Query("anchor_id") long j2, @Query("offset") int i, @Query("count") int i2, @Query("rank_type") int i3);

    @POST("/webcast/game/status/round_start/")
    Observable<C5176i<C3449c>> getGameRoundStartData(@Query("game_id") long j, @Query("room_id") long j2, @Query("extra") String str);

    @POST("/webcast/game/status/round_stop/")
    Observable<C5176i<C3450d>> getGameRoundStopData(@Query("game_id") long j, @Query("room_id") long j2, @Query("extra") String str);

    @AbstractC102307QQr(LIZ = "live_game")
    @POST("/webcast/interact/effect_game/dance_music_list/")
    Observable<C5176i<C3470f>> getMusicList(@Query("effect_id") long j, @Query("room_id") long j2, @Query("offset") long j3, @Query("count") long j4, @Query("need_beat") boolean z);
}
