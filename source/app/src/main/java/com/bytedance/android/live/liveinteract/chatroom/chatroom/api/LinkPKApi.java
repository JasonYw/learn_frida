package com.bytedance.android.live.liveinteract.chatroom.chatroom.api;

import com.bytedance.android.live.liveinteract.api.data.C4281b;
import com.bytedance.android.live.liveinteract.api.data.LinkAutoMatchModel;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p351e.C4308a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p351e.C4309c;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.interact.model.C6042a;
import com.bytedance.android.livesdk.chatroom.interact.model.C6055j;
import com.bytedance.android.livesdk.chatroom.interact.model.C6061r;
import com.bytedance.android.livesdk.message.model.p726a.C8722f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface LinkPKApi {
    static {
        Covode.recordClassIndex(25318);
    }

    @GET("/webcast/linkmic/battle/auto_match/")
    Observable<C5171b<LinkAutoMatchModel, C4309c>> autoMatch(@Query("room_id") long j, @Query("is_first") int i, @Query("match_type") int i2, @Query("sub_type") int i3, @Query("high_way") boolean z, @Query("activity_name") String str, @Query("new_anchor_first") boolean z2, @Query("speed_up_level") int i4);

    @GET("/webcast/linkmic/battle/auto_match/")
    Observable<C5171b<LinkAutoMatchModel, C4309c>> autoMatch(@Query("room_id") long j, @Query("is_first") int i, @Query("match_type") int i2, @Query("sub_type") int i3, @Query("high_way") boolean z, @Query("activity_name") String str, @Query("new_anchor_first") boolean z2, @Query("speed_up_level") int i4, @Query("participants_str") String str2);

    @GET("/webcast/battle/cancel_invite/")
    Observable<C5176i<Void>> battleCancelInvite(@Query("channel_id") long j, @Query("invite_type") int i);

    @GET("/webcast/linkmic/battle/invite/")
    Observable<C5176i<Void>> battleInvite(@Query("channel_id") long j, @Query("after_punish") boolean z, @Query("invite_type") int i, @Query("activity_name") String str, @Query("battle_id") long j2);

    @GET("/webcast/linkmic/battle/reject/")
    Observable<C5176i<Void>> battleReject(@Query("channel_id") long j, @Query("invite_type") int i);

    @GET("/webcast/linkmic/battle/reply/")
    Observable<C5176i<Void>> battleReply(@Query("channel_id") long j, @Query("battle_id") long j2, @Query("invite_uid") long j3, @Query("reply_status") int i, @Query("invite_type") int i2);

    @GET("/webcast/linkmic/battle/stats/")
    Observable<C5176i<C4281b>> battleStats(@Query("anchor_id") long j, @Query("room_id") long j2, @Query("from_type") int i);

    @GET("/webcast/linkmic/battle/cancel_match/")
    Observable<C5176i<Void>> cancelMatch(@Query("activity_name") String str, @Query("cancel_multi_match") boolean z, @Query("participants_str") String str2, @Query("cancel_scene") int i);

    @GET("/webcast/linkmic/battle/cancel_match/")
    Observable<C5176i<Void>> cancleMatch(@Query("activity_name") String str);

    @GET("/webcast/linkmic/battle/cut_short_count/")
    Observable<C5176i<C4308a>> cutShortCount();

    @GET("/webcast/linkmic/battle/finish/")
    Observable<C5176i<C8722f>> finish(@Query("channel_id") long j, @Query("battle_source") int i, @Query("is_cut_short") int i2, @Query("sub_type") long j2, @Query("mode") long j3, @Query("reason") int i3, @Query("token") String str);

    @GET("/hotsoon/linkmic/v3/battle/mode_finish/")
    Observable<C5176i<Object>> finishMode(@Query("mode") int i, @Query("channel_id") long j);

    @GET("/webcast/linkmic/battle/get_settings/")
    Single<C5176i<C6042a>> getAnchorBattleSetting(@Query("room_id") long j, @Query("sec_user_id") String str, @Query("user_id") long j2, @Query("scene") int i);

    @GET("/webcast/linkmic/battle/get_settings_list/")
    Single<C5176i<C6061r>> getAnchorBattleSettingList(@Query("room_id") long j, @Query("sec_user_id") String str, @Query("user_id") long j2, @Query("cursor") String str2, @Query("count") long j3, @Query("battle_setting_type") int i);

    @GET("/hotsoon/linkmic/v3/battle/mode_get/")
    Observable<C5176i<List<Object>>> getMode(@Query("mode") int i);

    @GET("/webcast/linkmic/battle/get_panel_list/")
    Single<C5176i<C6055j>> getPanelList(@Query("channel_id") long j, @Query("from_type") int i);

    @GET("/webcast/linkmic/battle/open/")
    Observable<C5176i<Void>> openBattle(@Query("channel_id") long j, @Query("duration") int i, @Query("match_type") int i2, @Query("theme") String str);

    @GET("/webcast/linkmic/battle/open/")
    Observable<C5176i<Void>> openBattle(@Query("channel_id") long j, @Query("duration") long j2, @Query("theme") String str, @Query("mode") long j3, @Query("config") String str2, @Query("invite_type") int i, @Query("token") String str3, @Query("activity_name") String str4, @Query("sign_extra") String str5);

    @GET("/webcast/battle/precision/match/")
    Observable<C5176i<Void>> replyPrecisionMatch(@Query("respond") int i, @Query("precision_match_id") long j);

    @GET("/hotsoon/linkmic/v3/battle/mode_set/")
    Observable<C5176i<Void>> setMode(@Query("mode") int i, @Query("open") int i2);

    @GET("/hotsoon/linkmic/v3/battle/mode_start/")
    Observable<C5176i<Void>> startMode(@Query("mode") int i, @Query("channel_id") long j);

    @GET("/webcast/linkmic/battle/update_settings/")
    Single<C5176i<Void>> updateAnchorBattleSetting(@Query("room_id") long j, @Query("sec_user_id") String str, @Query("battle_effective_field") int i, @QueryMap Map<String, Object> map);

    @GET("/webcast/linkmic/battle/use_card/")
    Observable<C5176i<Void>> useRewardCard(@Query("channel_id") long j, @Query("battle_id") long j2, @Query("item_card_type") int i, @Query("card_value") String str, @Query("extra") String str2);
}
