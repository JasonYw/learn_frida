package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6146ac;
import com.bytedance.android.livesdk.chatroom.model.interact.C6165i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6171k;
import com.bytedance.android.livesdk.chatroom.model.interact.C6172l;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Single;
import p003X.AbstractC100834PnQ;

/* loaded from: classes3.dex */
public interface LinkGuestBattleApi {
    static {
        Covode.recordClassIndex(29188);
    }

    @GET("/webcast/linkmic_audience/get_guest_battle_conf/")
    Single<C5176i<C6165i>> fetchGuestBattleConfig();

    @GET("/webcast/linkmic_audience/get_guest_battle_conf/")
    Single<C5176i<C6165i>> fetchGuestBattleConfig(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/finish_guest_battle/")
    Single<C5176i<C6171k>> finishBattle(@Query("room_id") long j, @Query("reason") int i);

    @GET("/webcast/linkmic_audience/get_play_mode_info/")
    Single<C5176i<C6146ac>> getPlayModeInfo(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/open_guest_battle/")
    Single<C5176i<C6171k>> openBattle(@Query("room_id") long j, @Query("duration") int i, @Query("is_anchor_involved") boolean z, @Query("loser_num") long j2);

    @GET("/webcast/linkmic_audience/pause_guest_battle/")
    Single<C5176i<C6171k>> pauseBattle(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/resume_guest_battle/")
    Single<C5176i<C6171k>> resumeBattle(@Query("room_id") long j, @Query("remain_duration") int i);

    @GET("/webcast/linkmic_profit/update_guest_battle_settings/")
    Single<AbstractC100834PnQ<C6172l>> updateGuestBattleSettings(@Query("room_id") long j, @Query("config_content") String str, @Query("update_fields") String str2);
}
