package com.bytedance.android.live.playtogether.api;

import com.bytedance.android.live.playtogether.p409c.C5192a;
import com.bytedance.android.live.playtogether.p409c.C5198e;
import com.bytedance.android.live.playtogether.p409c.C5201g;
import com.bytedance.android.live.playtogether.p409c.C5206i;
import com.bytedance.android.live.playtogether.p409c.C5210k;
import com.bytedance.android.live.playtogether.p409c.C5222t;
import com.bytedance.android.live.playtogether.p409c.C5225u;
import com.bytedance.android.live.playtogether.p409c.C5231y;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface PlayTogetherAnchorApi {
    static {
        Covode.recordClassIndex(32849);
    }

    @FormUrlEncoded
    @POST("/webcast/gameplay/team/close/")
    Observable<AbstractC100834PnQ<C5198e.C5199a>> closeTeam(@Field("play_id") long j, @Field("type") int i);

    @GET("/webcast/gameplay/entrance/")
    Observable<AbstractC100834PnQ<C5201g.C5202a>> fetchEntranceData();

    @GET("/webcast/gameplay/team/panel/anchor/")
    Observable<AbstractC100834PnQ<C5192a.C5193a>> getAnchorTeamPanel(@Query("play_id") long j);

    @FormUrlEncoded
    @POST("/webcast/gameplay/team/invite_join_game/")
    Observable<AbstractC100834PnQ<C5206i.C5207a>> inviteJoinGame(@Field("play_id") long j, @Field("user_id") long j2);

    @FormUrlEncoded
    @POST("/webcast/gameplay/team/kick_out/")
    Observable<AbstractC100834PnQ<C5210k.C5211a>> kickOutMember(@Field("play_id") long j, @Field("target_uid") long j2);

    @GET("/webcast/gameplay/play/detail/")
    Observable<AbstractC100834PnQ<C5222t.C5223a>> queryPlayRecordDetail(@Query("play_id") long j);

    @GET("/webcast/gameplay/play/query/")
    Observable<AbstractC100834PnQ<C5225u.C5226a>> queryPlayTogetherService(@Query("room_id") long j, @Query("offset") int i, @Query("count") int i2, @Query("status") int i3, @Query("play_id") long j2);

    @FormUrlEncoded
    @POST("/webcast/gameplay/team/submit/")
    Observable<AbstractC100834PnQ<C5231y.C5232a>> submitTeam(@Field("play_type") int i, @Field("game_id") String str, @Field("desc") String str2, @Field("fare") int i2, @Field("pay_desc") String str3, @Field("people_count") int i3, @Field("room_id") long j);
}
