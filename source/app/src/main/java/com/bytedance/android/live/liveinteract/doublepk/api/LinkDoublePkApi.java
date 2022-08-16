package com.bytedance.android.live.liveinteract.doublepk.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6146ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Single;

/* loaded from: classes3.dex */
public interface LinkDoublePkApi {
    static {
        Covode.recordClassIndex(26753);
    }

    @GET("/webcast/linkmic_profit/create_duo_battle/")
    Single<C5176i<Void>> createDoublePk(@Query("room_id") long j, @Query("duration") long j2, @Query("score_type") int i, @Query("need_switch_scene") boolean z);

    @GET("/webcast/linkmic_profit/vote/")
    Single<C5176i<Void>> doublePkVote(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("delta") long j3, @Query("vote_for") int i);

    @GET("/webcast/linkmic_profit/end_duo_battle/")
    Single<C5176i<Void>> endDoublePk(@Query("room_id") long j);

    @GET("/webcast/linkmic_profit/finish_duo_battle/")
    Single<C5176i<Void>> finishDoublePk(@Query("room_id") long j, @Query("need_switch_scene") boolean z);

    @GET("/webcast/linkmic_audience/get_play_mode_info/")
    Single<C5176i<C6146ac>> getPlayModeInfo(@Query("room_id") long j);

    @GET("/webcast/linkmic_profit/start_duo_battle/")
    Single<C5176i<Void>> startDoublePk(@Query("room_id") long j, @Query("duration") long j2, @Query("score_type") int i, @Query("players") String str, @Query("option") long j3);
}
