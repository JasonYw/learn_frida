package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6145ab;
import com.bytedance.android.livesdk.chatroom.model.interact.C6146ac;
import com.bytedance.android.livesdk.chatroom.model.interact.C6153ak;
import com.bytedance.android.livesdk.chatroom.model.interact.C6155an;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Single;

/* loaded from: classes3.dex */
public interface LinkProfitApi {
    static {
        Covode.recordClassIndex(29191);
    }

    @GET("/webcast/linkmic_profit/create_teamfight/")
    Single<C5176i<C6155an>> createTeamFight(@Query("room_id") long j, @Query("duration") long j2, @Query("option") int i, @Query("need_switch_scene") boolean z);

    @GET("/webcast/linkmic_profit/get_teamfight_conf/")
    Single<C5176i<C6153ak>> fetchTeamFightConfig();

    @GET("/webcast/linkmic_profit/get_teamfight_conf/")
    Single<C5176i<C6153ak>> fetchTeamFightConfig(@Query("type") int i);

    @GET("/webcast/linkmic_profit/finish_teamfight/")
    Single<C5176i<C6155an>> finishTeamFight(@Query("room_id") long j, @Query("reason") int i, @Query("teamfight_id") long j2, @Query("need_switch_scene") boolean z);

    @GET("/webcast/linkmic_profit/get_play_mode_announce/")
    Single<C5176i<C6145ab>> getPlayModeAnnounce(@Query("play_mode") long j, @Query("room_id") long j2);

    @GET("/webcast/linkmic_audience/get_play_mode_info/")
    Single<C5176i<C6146ac>> getPlayModeInfo(@Query("room_id") long j);

    @GET("/webcast/linkmic_profit/read_play_mode_announce/")
    Single<C5176i<Object>> readPlayModeAnnounce(@Query("room_id") long j, @Query("announce_ids") String str);

    @GET("/webcast/linkmic_profit/start_teamfight/")
    Single<C5176i<C6155an>> startTeamFight(@Query("room_id") long j, @Query("duration") int i);
}
