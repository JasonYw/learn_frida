package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.liveinteract.api.chatroom.model.C4275a;
import com.bytedance.android.live.liveinteract.api.chatroom.model.C4276b;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p351e.C4309c;
import com.bytedance.android.live.liveinteract.plantform.model.C4818m;
import com.bytedance.android.live.liveinteract.plantform.model.C4821p;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.C4928a;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.TalkRoomEmojiListResponse;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.interact.model.C6047ai;
import com.bytedance.android.livesdk.chatroom.interact.model.C6048aj;
import com.bytedance.android.livesdk.chatroom.interact.model.C6056k;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.C6089a;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6095af;
import com.bytedance.android.livesdk.chatroom.model.C6136bs;
import com.bytedance.android.livesdk.chatroom.model.LinkFinishResult;
import com.bytedance.android.livesdk.chatroom.model.interact.C6151ai;
import com.bytedance.android.livesdk.chatroom.model.interact.C6152aj;
import com.bytedance.android.livesdk.chatroom.model.interact.C6159aq;
import com.bytedance.android.livesdk.chatroom.model.interact.C6161c;
import com.bytedance.android.livesdk.chatroom.model.interact.C6162e;
import com.bytedance.android.livesdk.chatroom.model.interact.C6173m;
import com.bytedance.android.livesdk.chatroom.model.interact.C6175o;
import com.bytedance.android.livesdk.chatroom.model.interact.C6176p;
import com.bytedance.android.livesdk.chatroom.model.interact.C6177q;
import com.bytedance.android.livesdk.chatroom.model.interact.C6178r;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;
import com.bytedance.android.livesdk.message.linker.C8690o;
import com.bytedance.android.livesdk.message.linker.LinkerChangePlayModeContent;
import com.bytedance.android.livesdk.rank.model.C9215d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC445823kG;
import p003X.C80097Hhj;

/* loaded from: classes3.dex */
public interface LinkApi {
    static {
        Covode.recordClassIndex(29183);
    }

    @GET("/webcast/linkmic/leave/")
    Single<C5176i<C6173m>> anchorLeave(@Query("channel_id") long j, @Query("scene") int i, @Query("request_source") String str);

    @GET("/webcast/linkmic/cancel/")
    Observable<C5176i<Void>> cancel(@Query("channel_id") long j, @Query("to_room_id") long j2, @Query("to_user_id") long j3, @Query("sec_to_user_id") String str, @Query("scene") int i, @Query("cancel_type") int i2, @Query("request_source") String str2, @Query("sign_extra") String str3);

    @GET("/webcast/linkmic_audience/change_play_mode/")
    Single<C5176i<LinkerChangePlayModeContent>> changePlayMode(@Query("room_id") long j, @Query("linker_id") long j2, @Query("scene") int i, @Query("play_mode") int i2, @Query("type") int i3);

    @GET("/webcast/linkmic_audience/check_permission/")
    Single<C5171b<Void, C6162e>> checkPermissionV1(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("linkmic_layout") int i, @Query("link_type") int i2);

    @GET("/webcast/linkmic_audience/finish/")
    Single<AbstractC100834PnQ<LinkFinishResult>> finishV1(@Query("room_id") long j, @Query("layout") int i, @Query("request_source") String str);

    @GET("/webcast/linkmic/finish/")
    Observable<C5176i<Void>> finishV3(@Query("channel_id") long j, @Query("is_to_audience") int i, @Query("scene") int i2, @Query("request_source") String str);

    @GET("/webcast/linkmic/finish/")
    Observable<C5176i<Void>> finishV3(@Query("channel_id") long j, @Query("is_to_audience") int i, @Query("request_source") String str);

    @GET("/webcast/battle/record/")
    Observable<C5176i<C6056k>> getBattleRecords(@Query("offset") int i, @Query("count") int i2, @Query("activity_name") String str, @Query("from_type") int i3);

    @GET("/webcast/linkmic/get_cross_room_rtc_info/")
    Observable<C5176i<C4818m>> getCrossRoomRtcInfo(@Query("channel_id") long j, @Query("room_id") long j2, @Query("request_source") int i);

    @GET("/webcast/review/get_latest_ban_record/")
    Single<C5176i<C4275a>> getLatestBanRecord(@Query("ban_type") long j);

    @GET("/webcast/linkmic_audience/get_layout_config/")
    Single<C5176i<C4276b>> getLayouConfig(@Query("room_id") long j);

    @GET("/webcast/ranklist/linker/")
    Observable<C5176i<C9215d>> getLinkerRankList(@Query("room_id") long j, @Query("sec_anchor_id") String str, @Query("sec_linker_user_id") String str2, @Query("scene") long j2);

    @GET("/webcast/linkmic_audience/get_linkmic_info_with_rtc_info/")
    Observable<C5176i<C8690o>> getLinkmicInfoWithRtcInfo(@Query("room_id") Long l);

    @GET("/webcast/linkmic_audience/prepare_apply_list/")
    Single<C5176i<C4821p>> getPrepareApplyList(@Query("room_id") long j, @Query("cursor") String str, @Query("count") int i);

    @GET("/webcast/linkmic_audience/get_settings/")
    Single<C5176i<C6161c>> getSetting(@Query("room_id") long j, @Query("sec_owner_id") String str);

    @GET("/webcast/linkmic_audience/list_emojis/")
    Observable<C5176i<TalkRoomEmojiListResponse>> getTalkRoomEmojiList(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/list_emojis/")
    Observable<C5176i<TalkRoomEmojiListResponse>> getTalkRoomEmojiList(@Query("room_id") long j, @Query("scene") int i, @Query("type") int i2);

    @GET("/webcast/linkmic_audience/list_emojis/")
    Observable<C5176i<TalkRoomEmojiListResponse>> getTalkRoomEmojiList(@Query("room_id") long j, @Query("scene") int i, @Query("type") int i2, @Query("category") int i3);

    @GET("/webcast/linkmic_audience/waiting_list/")
    Single<AbstractC100834PnQ<C6136bs>> getWaitingList(@Query("room_id") long j, @Query("cursor") String str, @Query("count") int i);

    @AbstractC445823kG(LIZ = 10004)
    @GET("/webcast/linkmic/invite/")
    Observable<C5176i<C6068x>> invite(@Query("to_room_id") long j, @Query("room_id") long j2, @Query("invite_type") int i, @Query("match_type") int i2, @Query("sec_to_user_id") String str, @Query("scene") int i3, @Query("theme") String str2, @Query("duration") int i4, @Query("activity_name") String str3, @Query("match_sub_type") long j3, @Query("sign_extra") String str4, @Query("invite_source") int i5, @Query("invitee_scene") int i6, @Query("invitee_followed_user_ids") String str5, @Query("multi_pk_mode") int i7);

    @AbstractC445823kG(LIZ = 10004)
    @GET("/webcast/linkmic/invite/")
    Observable<C5176i<C6068x>> inviteWithBattleOn(@Query("layout") int i, @Query("vendor") int i2, @Query("to_room_id") long j, @Query("room_id") long j2, @Query("theme") String str, @Query("duration") int i3, @Query("match_type") int i4, @Query("invite_type") int i5, @Query("sub_type") int i6, @Query("sec_to_user_id") String str2);

    @GET("/webcast/linkmic_audience/join_channel/")
    Single<C5176i<C6094ae>> joinChannelV1(@Query("room_id") long j);

    @AbstractC445823kG(LIZ = 10006)
    @GET("/webcast/linkmic/join_channel/")
    Observable<C5176i<C6089a>> joinChannelV3(@Query("channel_id") long j);

    @AbstractC445823kG(LIZ = 10006)
    @GET("/webcast/linkmic/join_channel/")
    Observable<C5176i<C6089a>> joinChannelV3(@Query("channel_id") long j, @Query("is_from_audience") int i, @Query("scene") int i2, @Query("resource_id") long j2);

    @GET("/webcast/linkmic_audience/kick_out/")
    Single<C5176i<Void>> kickOut(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("sec_to_user_id") String str, @Query("request_source") String str2);

    @GET("/webcast/linkmic_audience/leave/")
    Single<C5176i<C6095af>> leave(@Query("room_id") long j, @Query("request_source") String str);

    @GET("/webcast/linkmic_audience/lock_position/")
    Single<C5176i<Object>> lockPostion(@Query("room_id") long j, @Query("position") int i, @Query("lock_status") int i2);

    @GET("/webcast/linkmic/silence/")
    Single<C5176i<Void>> mute(@Query("room_id") long j, @Query("scene") int i, @Query("to_user_id") long j2, @Query("channel_id") long j3);

    @GET("/webcast/linkmic/silence/")
    Single<C5176i<Void>> mute(@Query("room_id") long j, @Query("scene") int i, @Query("to_user_id") long j2, @Query("channel_id") long j3, @Query("to_room_id") long j4, @Query("silence_action") int i2);

    @GET("/webcast/linkmic_audience/permit/")
    Single<C5176i<LinkInitResult>> permit(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("sec_to_user_id") String str);

    @AbstractC445823kG(LIZ = 10005)
    @GET("/webcast/linkmic/reply/")
    Observable<C5176i<C6175o>> reply(@Query("channel_id") long j, @Query("room_id") long j2, @Query("reply_status") int i, @Query("invite_user_id") long j3, @Query("sec_invite_user_id") String str, @Query("scene") int i2, @Query("resource_id") long j4, @Query("sign_extra") String str2, @Query("multi_pk_mode") int i3, @Query("request_source") String str3);

    @FormUrlEncoded
    @POST("/webcast/linkmic/monitor/vendor/")
    Observable<C5176i<Void>> reportStartLinkStatus(@Field("vendor") String str, @Field("status") int i, @Field("err_code") int i2);

    @GET("/webcast/linkmic/rivals/")
    Observable<C5171b<C6048aj, C4309c>> rivalsList(@Query("rivals_type") int i, @Query("use_last_recommend_result") boolean z);

    @GET("/webcast/battle/rivals/recommend/")
    Observable<C5176i<C6047ai>> searchRankRecommendRivals(@Query("entrance") int i, @Query("tab_name") String str, @Query("reuse_last_recommend") boolean z, @Query("tab_type") int i2, @Query("activity_name") String str2, @Query("new_recommend_type") int i3);

    @GET("/webcast/linkmic/rivals/search/")
    Observable<C5176i<C6177q>> searchRivals(@Query("query_word") String str, @Query("offset") int i, @Query("count") int i2, @Query("search_id") String str2, @Query("activity_name") String str3, @Query("search_scene") int i3);

    @GET("https://i.snssdk.com/api/suggest_words/")
    Observable<C80097Hhj<List<C6178r>, Extra>> searchRivalsHint(@Query("pd") String str, @Query("business_id") long j, @Query("query") String str2);

    @FormUrlEncoded
    @POST("/webcast/linkmic_audience/send_signaling/")
    Single<C5176i<Unit>> sendSignalV1(@Field("room_id") long j, @Field("content") String str, @Field("to_user_ids") long[] jArr, @Field("extra") String str2);

    @GET("/webcast/linkmic/send_signal/")
    Observable<C5176i<Void>> sendSignalV3(@Query("channel_id") long j, @Query("content") String str, @Query("to_user_ids") long[] jArr, @Query("scene") int i);

    @GET("/webcast/linkmic_audience/send_emoji/")
    Observable<C5176i<C4928a>> sendTalkRoomEmoji(@Query("room_id") long j, @Query("emoji_id") long j2);

    @GET("/webcast/linkmic_audience/send_emoji/")
    Observable<C5176i<C4928a>> sendTalkRoomInteractEmoji(@Query("room_id") long j, @Query("emoji_id") long j2, @Query("scene") int i, @Query("type") int i2, @Query("to_user_id") long j3);

    @GET("/webcast/linkmic_audience/set_position_attribute/")
    Single<C5176i<Void>> setPositionAttribute(@Query("room_id") long j, @Query("position") int i, @Query("position_name") String str);

    @GET("/webcast/linkmic/settings/")
    Observable<C5176i<Void>> settings(@Query("link_mic_stats") int i);

    @GET("/webcast/linkmic_audience/silence/")
    Single<C5176i<C6151ai>> silence(@Query("room_id") long j, @Query("to_user_id") long j2);

    @GET("/webcast/linkmic_audience/silence/")
    Single<C5176i<C6151ai>> silence(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("silence_type") int i);

    @GET("/webcast/linkmic_audience/silence/")
    Single<C5176i<C6151ai>> silence(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("silence_type") int i, @Query("resume_last_silence") boolean z);

    @GET("/webcast/linkmic_audience/silence/")
    Single<C5176i<C6151ai>> silenceLinkRoom(@Query("room_id") long j, @Query("to_room_id") long j2, @Query("silence_type") int i);

    @GET("/webcast/linkmic_audience/switch_scene/")
    Single<C5176i<C6152aj>> switchScene(@Query("room_id") long j, @Query("linker_id") long j2, @Query("from_scene") int i, @Query("to_scene") int i2, @Query("to_ui_layout") int i3, @Query("reason") String str);

    @GET("/webcast/linkmic_audience/unsilence/")
    Single<C5176i<C6159aq>> unSilence(@Query("room_id") long j, @Query("to_user_id") long j2);

    @GET("/webcast/linkmic_audience/unsilence/")
    Single<C5176i<C6159aq>> unSilence(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("enforced") boolean z);

    @GET("/webcast/linkmic_audience/unsilence/")
    Single<C5176i<C6159aq>> unSilenceLinkRoom(@Query("room_id") long j, @Query("to_room_id") long j2, @Query("un_silence_type") int i);

    @GET("/webcast/linkmic_audience/update_position/")
    Single<C5176i<C6176p>> updateLinkerPosition(@Query("room_id") long j, @Query("channel_id") long j2, @Query("to_position") long j3, @Query("scene") long j4);

    @FormUrlEncoded
    @POST("/webcast/linkmic_audience/ktv/update_mc/")
    Single<C5176i<Void>> updateMcStatus(@Field("room_id") long j, @Field("to_user_id") long j2, @Field("update_type") int i);

    @GET("/webcast/linkmic_audience/update_settings/")
    Single<C5176i<Void>> updateSetting(@Query("room_id") long j, @QueryMap Map<String, Object> map);

    @GET("/webcast/linkmic_audience/update_settings/")
    Single<C5176i<Void>> updateSettingV2(@Query("room_id") long j, @QueryMap Map<String, Object> map, @Query("source") int i);

    /* loaded from: classes12.dex */
    public enum UpdateMcAction {
        NONE,
        SET_KTV_HOST,
        UNSET_KTV_HOST;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static UpdateMcAction[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (UpdateMcAction[]) proxy.result;
            }
            return (UpdateMcAction[]) values().clone();
        }

        static {
            Covode.recordClassIndex(29184);
        }

        public static UpdateMcAction valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (UpdateMcAction) proxy.result;
            }
            return (UpdateMcAction) Enum.valueOf(UpdateMcAction.class, str);
        }
    }
}
