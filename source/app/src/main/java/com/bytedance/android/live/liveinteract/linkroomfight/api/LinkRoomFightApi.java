package com.bytedance.android.live.liveinteract.linkroomfight.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6177q;
import com.bytedance.android.livesdk.chatroom.model.interact.C6178r;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import kotlin.Unit;
import p003X.C80097Hhj;

/* loaded from: classes3.dex */
public interface LinkRoomFightApi {
    static {
        Covode.recordClassIndex(27547);
    }

    @GET("/webcast/linkmic_audience/cancel_invite_cross_room_link/")
    Single<C5176i<Unit>> cancelInvite(@Query("cross_type") int i, @Query("canceller_room_id") long j, @Query("cancellee_room_id") long j2);

    @GET("/webcast/linkmic_profit/create_room_battle/")
    Single<C5176i<Object>> createRoomBattle(@Query("room_id") long j, @Query("start_type") int i);

    @GET("/webcast/linkmic_audience/invite_cross_room_link_list/")
    Single<C5176i<C4449a>> fetchList(@Query("invite_type") int i, @Query("room_id") long j);

    @GET("/webcast/linkmic_profit/finish_room_battle/")
    Single<C5176i<C4451b>> finishRoomBattle(@Query("room_id") long j, @Query("finish_type") int i, @Query("finish_teamfight_reason") int i2);

    @GET("/webcast/linkmic_profit/list_room_battle_record/")
    Single<C5176i<C4452c>> getLinkRoomFightRecord(@Query("offset") long j, @Query("count") long j2, @Query("room_id") long j3);

    @GET("/webcast/linkmic_audience/invite_cross_room_link/")
    Single<C5176i<Object>> invite(@Query("inviter_room_id") long j, @Query("invitee_room_id") long j2, @Query("cross_type") int i, @Query("invite_source") int i2);

    @GET("/webcast/linkmic_profit/invite_room_battle/")
    Single<C5176i<Unit>> inviteRoomBattle(@Query("start_type") int i, @Query("inviter_room_id") long j, @Query("invitee_room_id") long j2);

    @GET("/webcast/linkmic_audience/reply_cross_room_link/")
    Single<C5176i<C4454d>> reply(@Query("reply_type") int i, @Query("cross_type") int i2, @Query("invitee_room_id") long j, @Query("inviter_room_id") long j2, @Query("auto_refuse_this_inviter") boolean z);

    @GET("/webcast/linkmic_profit/reply_room_battle/")
    Single<C5176i<Unit>> replyRoomBattle(@Query("reply_type") int i, @Query("start_type") int i2, @Query("invitee_room_id") long j, @Query("inviter_room_id") long j2, @Query("auto_refuse_this_inviter") boolean z);

    @GET("/webcast/linkmic/rivals/search/")
    Observable<C5176i<C6177q>> searchRivals(@Query("query_word") String str, @Query("offset") int i, @Query("count") int i2, @Query("search_id") String str2, @Query("activity_name") String str3, @Query("search_scene") int i3);

    @GET("https://i.snssdk.com/api/suggest_words/")
    Observable<C80097Hhj<List<C6178r>, Extra>> searchRivalsHint(@Query("pd") String str, @Query("business_id") long j, @Query("query") String str2);

    @GET("/webcast/linkmic_audience/select_guests/")
    Single<C5176i<C4455e>> selectGuests(@Query("cross_type") int i, @Query("select_type") int i2, @Query("user_ids") String str, @Query("to_scene") int i3, @Query("to_ui_layout") int i4, @Query("room_id") long j);

    @GET("/webcast/linkmic_profit/update_room_battle_settings")
    Observable<C5176i<C6177q>> updateRoomBattleSettings(@Query("room_id") long j, @Query("content") String str);
}
