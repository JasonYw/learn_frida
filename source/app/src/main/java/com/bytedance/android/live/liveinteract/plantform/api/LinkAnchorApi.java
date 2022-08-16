package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.liveinteract.chatroom.chatroom.model.C4366b;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.model.C4367c;
import com.bytedance.android.live.liveinteract.plantform.model.C4808a;
import com.bytedance.android.live.liveinteract.plantform.model.C4810d;
import com.bytedance.android.live.liveinteract.plantform.model.C4813g;
import com.bytedance.android.live.liveinteract.plantform.model.C4814h;
import com.bytedance.android.live.liveinteract.plantform.model.C4817l;
import com.bytedance.android.live.liveinteract.plantform.model.C4819n;
import com.bytedance.android.live.liveinteract.plantform.model.C4823s;
import com.bytedance.android.live.liveinteract.plantform.model.PlayerInfoListData;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.interact.model.C6052c;
import com.bytedance.android.livesdk.message.linker.C8680a;
import com.bytedance.android.livesdk.message.linker.C8693r;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;

/* loaded from: classes3.dex */
public interface LinkAnchorApi {
    static {
        Covode.recordClassIndex(29182);
    }

    @GET("/webcast/linkmic/apply/")
    Observable<C5176i<C4808a>> apply(@Query("room_id") long j, @Query("to_room_id") long j2, @Query("sec_to_user_id") String str, @Query("apply_type") int i, @Query("scene") int i2, @Query("channel_id") long j3, @Query("sign_extra") String str2);

    @GET("/webcast/linkmic_profit/bid_paid_linkmic_bid_end/")
    Single<C5176i<Void>> bidPaidLinkMicBidEnd(@Query("room_id") long j);

    @GET("/webcast/linkmic_profit/bid_paid_linkmic_turn_off/")
    Single<C5176i<C4813g>> bidPaidLinkMickTurnOff(@Query("room_id") long j, @Query("reason") int i);

    @GET("/webcast/linkmic_profit/bid_paid_linkmic_turn_on/")
    Single<C5176i<C4814h>> bidPaidLinkMickTurnOn(@Query("room_id") long j, @Query("start_price") long j2, @Query("max_price") long j3, @Query("link_duration") long j4, @Query("bid_duration") long j5);

    @GET("/webcast/linkmic_profit/close_paid_linkmic_guide/")
    Single<C5176i<Void>> closePaidLinkGuide(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/list/")
    Single<C5176i<PlayerInfoListData>> getAllList(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("link_status") int i, @Query("link_type") int i2, @Query("enable_pagination") boolean z);

    @GET("/webcast/linkmic_audience/list/")
    Single<C5176i<PlayerInfoListData>> getAllList(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("link_status") int i, @Query("link_type") int i2, @Query("enable_pagination") boolean z, @Query("request_source") String str);

    @GET("/webcast/linkmic_audience/list_friends/")
    Observable<C5176i<C4366b>> getAnchorFriends(@Query("count") long j);

    @GET("/webcast/linkmic/get_settings/")
    Single<C5176i<C6052c>> getAnchorLinkSetting(@Query("room_id") long j, @Query("sec_user_id") String str);

    @GET("/webcast/linkmic_audience/invite_list/")
    Single<C5176i<PlayerInfoListData>> getInviteList(@Query("room_id") long j, @Query("type") int i);

    @GET("/webcast/linkmic/list/")
    Single<C5176i<C8680a>> getLinkAnchorList(@Query("channel_id") long j, @Query("link_status") long j2, @Query("offset") long j3, @Query("count") long j4, @Query("scene") int i, @Query("use_local_cache") boolean z, @Query("request_source") String str, @Query("room_id") long j5);

    @GET("/webcast/linkmic_audience/list/v2/")
    Single<C5176i<C4819n>> getLinkListV2(@Query("room_id") long j, @Query("anchor_id") long j2);

    @GET("/webcast/linkmic_audience/list/v2/")
    Single<C5176i<C4819n>> getLinkListV2(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("need_follow_info") boolean z);

    @GET("/webcast/linkmic_audience/list/v2/")
    Single<C5176i<C4819n>> getLinkListV2(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("need_follow_info") boolean z, @Query("is_ochannel_room") boolean z2);

    @GET("/webcast/linkmic_audience/waiting_list/")
    Single<C5176i<C4823s>> getLinkWaitingList(@Query("room_id") long j, @Query("count") long j2, @Query("cursor") String str);

    @GET("/webcast/linkmic_audience/list/")
    Single<C5176i<PlayerInfoListData>> getPageList(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("link_status") int i, @Query("link_type") int i2, @Query("count") long j3, @Query("enable_pagination") boolean z, @Query("extra") String str, @Query("modify_time_after_in_nano") long j4, @Query("cursor") String str2, @Query("request_source") String str3);

    @GET("/webcast/linkmic_audience/list_pair_users/")
    Single<C5176i<C4817l>> getPairUserList(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/invite_friend/")
    Single<C5176i<C4367c>> inviteFriends(@Query("room_id") long j, @Query("to_user_id_list") String str, @Query("is_quick_invite") int i, @Query("msg_board_item_id") long j2);

    @GET("/webcast/linkmic/kick_out/")
    Single<C5176i<Void>> kickOut(@Query("channel_id") long j, @Query("to_user_id") long j2, @Query("sec_to_user_id") String str, @Query("scene") int i, @Query("request_source") String str2);

    @GET("/webcast/linkmic_audience/open_pair/")
    Single<C5176i<Void>> openPair(@Query("room_id") long j, @Query("guest_id") long j2, @Query("investor_id") long j3);

    @GET("/webcast/linkmic/permit/")
    Observable<C5176i<C4810d>> permit(@Query("channel_id") long j, @Query("permit_status") int i, @Query("room_id") long j2, @Query("apply_user_id") long j3, @Query("sec_apply_user_id") String str, @Query("scene") int i2, @Query("sign_extra") String str2);

    @GET("/webcast/linkmic_audience/prepare_apply_permit/")
    Observable<C5176i<Void>> permitPreApply(@Query("room_id") long j, @Query("to_user_id") long j2);

    @GET("/webcast/linkmic_audience/invite_search/")
    Single<C5176i<PlayerInfoListData>> searchInvite(@Query("room_id") long j, @Query("query_word") String str);

    @GET("/webcast/linkmic_audience/call_to_linkmic/")
    Single<C5176i<Object>> sendLinkCall(@Query("room_id") long j);

    @GET("/webcast/linkmic_profit/bid_paid_linkmic_start/")
    Single<C5176i<Object>> startBidPaidLinkMic(@Query("room_id") long j);

    @GET("/webcast/linkmic/switch_scene/")
    Single<C5176i<C8693r>> switchScene(@Query("channel_id") long j, @Query("room_id") long j2, @Query("from_scene") int i, @Query("to_scene") int i2);

    @GET("/webcast/linkmic_profit/bid_paid_linkmic_terminate/")
    Single<C5176i<Void>> terminatePaidLinkMicBid(@Query("room_id") long j);

    @GET("/webcast/linkmic/update_settings/")
    Single<C5176i<Void>> updateAnchorLinkSetting(@Query("room_id") long j, @Query("sec_user_id") String str, @Query("effective_field") int i, @QueryMap Map<String, Object> map);

    @GET("/webcast/linkmic/update_cross_room_info/")
    Single<C5176i<Void>> updateCrossRoomInfo(@Query("channel_id") long j, @Query("room_id") long j2, @Query("to_room_id") long j3, @Query("scene") int i, @Query("effective_fields") String str, @Query("room_linker_silence_status") int i2, @Query("room_linker_is_background") int i3);

    @GET("/webcast/linkmic_audience/update_pair_user/")
    Single<C5176i<C4817l>> updatePairUser(@Query("room_id") long j, @Query("guest_id") long j2, @Query("investor_id") long j3);
}
