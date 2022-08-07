package com.p1594ss.android.ugc.aweme.profile.model;

import androidx.core.view.MotionEventCompat;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ott.sourceui.api.utils.ImmersedStatusBarUtils;
import com.p1594ss.android.ugc.aweme.base.model.UrlModel;
import com.p1594ss.android.ugc.aweme.base.share.ShareInfo;
import com.p1594ss.android.ugc.aweme.commerce.CommerceInfo;
import com.p1594ss.android.ugc.aweme.discover.model.Challenge;
import com.p1594ss.android.ugc.aweme.feed.model.RelationLabelUser;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import com.p1594ss.android.ugc.aweme.music.OriginalMusician;
import com.p1594ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p1594ss.android.ugc.aweme.setting.model.p2560ab.ABOppoRedPointAppearAgainTimeInterval;
import com.p1594ss.ttm.player.MediaPlayer;
import com.p1594ss.ugc.aweme.ActivityStruct;
import com.p1594ss.ugc.aweme.DouplusToastStruct;
import com.p1594ss.ugc.aweme.RFansGroupInfo;
import com.p1594ss.ugc.aweme.RecommendReasonData;
import com.p1594ss.ugc.aweme.RecommendTemplateStruct;
import com.p1594ss.ugc.aweme.UserVirtualCharacterStruct;
import com.p1594ss.ugc.aweme.UserVirtualEmotionStruct;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.umeng.commonsdk.config.C33817d;
import java.util.List;
import p003X.HandlerC95384Nhi;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ProtobufUserStructV2Adapter */
/* loaded from: classes20.dex */
public final class ProtobufUserStructV2Adapter extends ProtoAdapter<User> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(221043);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 111);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : ProtoAdapter.STRING.encodedSizeWithTag(1, uid(user)) + ProtoAdapter.STRING.encodedSizeWithTag(2, short_id(user)) + ProtoAdapter.STRING.encodedSizeWithTag(3, nickname(user)) + ProtoAdapter.INT32.encodedSizeWithTag(4, gender(user)) + ProtoAdapter.STRING.encodedSizeWithTag(5, signature(user)) + UrlModel.ADAPTER.encodedSizeWithTag(6, avatar_larger(user)) + UrlModel.ADAPTER.encodedSizeWithTag(7, avatar_thumb(user)) + UrlModel.ADAPTER.encodedSizeWithTag(8, avatar_medium(user)) + ProtoAdapter.STRING.encodedSizeWithTag(9, birthday(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(10, is_verified(user)) + ProtoAdapter.INT32.encodedSizeWithTag(11, allow_status(user)) + ProtoAdapter.INT32.encodedSizeWithTag(12, follow_status(user)) + ProtoAdapter.INT32.encodedSizeWithTag(13, aweme_count(user)) + ProtoAdapter.INT32.encodedSizeWithTag(14, following_count(user)) + ProtoAdapter.INT32.encodedSizeWithTag(15, follower_count(user)) + ProtoAdapter.INT32.encodedSizeWithTag(16, favoriting_count(user)) + ProtoAdapter.INT64.encodedSizeWithTag(17, total_favorited(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(18, is_block(user)) + ProtoAdapter.STRING.encodedSizeWithTag(19, third_name(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(20, hide_search(user)) + ProtoAdapter.INT32.encodedSizeWithTag(21, constellation(user)) + ProtoAdapter.STRING.encodedSizeWithTag(22, location(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(23, hide_location(user)) + ProtoAdapter.STRING.encodedSizeWithTag(24, weibo_verify(user)) + ProtoAdapter.STRING.encodedSizeWithTag(25, custom_verify(user)) + ProtoAdapter.STRING.encodedSizeWithTag(26, unique_id(user)) + ProtoAdapter.STRING.encodedSizeWithTag(27, bind_phone(user)) + ProtoAdapter.INT32.encodedSizeWithTag(28, special_lock(user)) + ProtoAdapter.INT32.encodedSizeWithTag(29, need_recommend(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(30, is_binded_weibo(user)) + ProtoAdapter.STRING.encodedSizeWithTag(31, weibo_name(user)) + ProtoAdapter.STRING.encodedSizeWithTag(32, weibo_schema(user)) + ProtoAdapter.STRING.encodedSizeWithTag(33, weibo_url(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(34, story_open(user)) + ProtoAdapter.INT32.encodedSizeWithTag(35, story_count(user)) + ProtoAdapter.STRING.encodedSizeWithTag(36, recommend_reason(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(37, has_facebook_token(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(38, has_twitter_token(user)) + ProtoAdapter.INT64.encodedSizeWithTag(39, fb_expire_time(user)) + ProtoAdapter.INT64.encodedSizeWithTag(40, tw_expire_time(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(41, has_youtube_token(user)) + ProtoAdapter.INT64.encodedSizeWithTag(42, youtube_expire_time(user)) + ProtoAdapter.INT64.encodedSizeWithTag(43, room_id(user)) + ProtoAdapter.INT32.encodedSizeWithTag(44, live_verify(user)) + ProtoAdapter.INT64.encodedSizeWithTag(45, authority_status(user)) + ProtoAdapter.STRING.encodedSizeWithTag(46, verify_info(user)) + ProtoAdapter.INT32.encodedSizeWithTag(47, shield_follow_notice(user)) + ProtoAdapter.INT32.encodedSizeWithTag(48, shield_digg_notice(user)) + ProtoAdapter.INT32.encodedSizeWithTag(49, shield_comment_notice(user)) + ProtoAdapter.STRING.encodedSizeWithTag(50, school_name(user)) + ProtoAdapter.STRING.encodedSizeWithTag(51, school_poi_id(user)) + ProtoAdapter.INT32.encodedSizeWithTag(52, school_type(user)) + ShareInfo.ADAPTER.encodedSizeWithTag(53, share_info(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(54, with_commerce_entry(user)) + ProtoAdapter.INT32.encodedSizeWithTag(55, verification_type(user)) + OriginalMusician.ADAPTER.encodedSizeWithTag(56, original_musician(user)) + ActivityStruct.ADAPTER.encodedSizeWithTag(57, activity(user)) + ProtoAdapter.STRING.encodedSizeWithTag(58, enterprise_verify_reason(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(59, is_ad_fake(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(60, star_use_new_download(user)) + ProtoAdapter.INT32.encodedSizeWithTag(61, mplatform_followers_count(user)) + FollowerDetail.ADAPTER.asRepeated().encodedSizeWithTag(62, followers_detail(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(63, has_activity_medal(user)) + ProtoAdapter.STRING.encodedSizeWithTag(64, region(user)) + ProtoAdapter.STRING.encodedSizeWithTag(65, account_region(user)) + ProtoAdapter.INT32.encodedSizeWithTag(66, sync_to_toutiao(user)) + ProtoAdapter.INT32.encodedSizeWithTag(67, commerce_user_level(user)) + CommerceInfo.ADAPTER.encodedSizeWithTag(68, commerce_info(user)) + ProtoAdapter.INT32.encodedSizeWithTag(69, live_agreement(user)) + PlatformInfo.ADAPTER.asRepeated().encodedSizeWithTag(70, platform_sync_info(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(71, with_shop_entry(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(72, is_discipline_member(user)) + ProtoAdapter.INT32.encodedSizeWithTag(73, secret(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(74, has_orders(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(75, prevent_download(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(76, show_image_bubble(user)) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(77, geofencing(user)) + ProtoAdapter.INT64.encodedSizeWithTag(78, unique_id_modify_time(user)) + UrlModel.ADAPTER.encodedSizeWithTag(79, video_icon(user)) + ProtoAdapter.STRING.encodedSizeWithTag(80, ins_id(user)) + ProtoAdapter.STRING.encodedSizeWithTag(81, google_account(user)) + ProtoAdapter.STRING.encodedSizeWithTag(82, youtube_channel_id(user)) + ProtoAdapter.STRING.encodedSizeWithTag(83, youtube_channel_title(user)) + ProtoAdapter.INT32.encodedSizeWithTag(84, apple_account(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(85, with_dou_entry(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(86, with_fusion_shop_entry(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(87, is_phone_binded(user)) + ProtoAdapter.INT32.encodedSizeWithTag(88, login_platform(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(89, accept_private_policy(user)) + ProtoAdapter.INT32.encodedSizeWithTag(90, realname_verify_status(user)) + ProtoAdapter.STRING.encodedSizeWithTag(91, twitter_id(user)) + ProtoAdapter.STRING.encodedSizeWithTag(92, twitter_name(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(93, user_canceled(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(94, has_email(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(95, is_gov_media_vip(user)) + ProtoAdapter.INT32.encodedSizeWithTag(96, dongtai_count(user)) + ProtoAdapter.INT32.encodedSizeWithTag(97, live_agreement_time(user)) + ProtoAdapter.INT64.encodedSizeWithTag(98, register_time(user)) + ProtoAdapter.INT32.encodedSizeWithTag(99, status(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(100, with_douplus_entry(user)) + ProtoAdapter.INT64.encodedSizeWithTag(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS, create_time(user)) + ProtoAdapter.STRING.encodedSizeWithTag(102, avatar_uri(user)) + ProtoAdapter.INT32.encodedSizeWithTag(103, follower_status(user)) + ProtoAdapter.INT32.encodedSizeWithTag(104, neiguang_shield(user)) + ProtoAdapter.INT32.encodedSizeWithTag(105, comment_setting(user)) + ProtoAdapter.INT32.encodedSizeWithTag(106, duet_setting(user)) + ProtoAdapter.INT64.encodedSizeWithTag(107, reflow_page_gid(user)) + ProtoAdapter.INT64.encodedSizeWithTag(108, reflow_page_uid(user)) + ProtoAdapter.INT32.encodedSizeWithTag(109, user_rate(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(110, with_new_goods(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(111, is_flowcard_member(user)) + UrlModel.ADAPTER.encodedSizeWithTag(112, room_cover(user)) + ProtoAdapter.INT32.encodedSizeWithTag(113, download_setting(user)) + ProtoAdapter.INT64.encodedSizeWithTag(114, download_prompt_ts(user)) + ProtoAdapter.INT32.encodedSizeWithTag(115, react_setting(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(116, live_commerce(user)) + ProtoAdapter.STRING.encodedSizeWithTag(117, college_name(user)) + ProtoAdapter.STRING.encodedSizeWithTag(118, enroll_year(user)) + ProtoAdapter.STRING.encodedSizeWithTag(119, country(user)) + ProtoAdapter.STRING.encodedSizeWithTag(120, province(user)) + ProtoAdapter.STRING.encodedSizeWithTag(121, city(user)) + UrlModel.ADAPTER.asRepeated().encodedSizeWithTag(OpenAuthTask.f22015g, cover_url(user)) + ProtoAdapter.STRING.encodedSizeWithTag(123, recommend_reason_relation(user)) + ProtoAdapter.STRING.encodedSizeWithTag(124, iso_country_code(user)) + ProtoAdapter.INT32.encodedSizeWithTag(C1399n.f22430f, show_gender_strategy(user)) + ProtoAdapter.STRING.encodedSizeWithTag(126, district(user)) + ProtoAdapter.STRING.encodedSizeWithTag(127, language(user)) + ProtoAdapter.STRING.encodedSizeWithTag(128, room_type_tag(user)) + ProtoAdapter.INT32.encodedSizeWithTag(129, dou_plus_share_location(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(130, has_insights(user)) + ProtoAdapter.STRING.encodedSizeWithTag(131, remark_name(user)) + ProtoAdapter.STRING.encodedSizeWithTag(132, video_icon_virtual_URI(user)) + ProtoAdapter.STRING.encodedSizeWithTag(133, share_qrcode_uri(user)) + ProtoAdapter.INT32.encodedSizeWithTag(134, profile_tab_type(user)) + AvatarDecoration.ADAPTER.encodedSizeWithTag(135, avatar_decoration(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(136, watch_status(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(137, with_commerce_newbie_task(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(138, with_item_commerce_entry(user)) + ProtoAdapter.INT32.encodedSizeWithTag(139, star_billboard_rank(user)) + ProtoAdapter.INT32.encodedSizeWithTag(140, education(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(141, can_modify_school_info(user)) + ProtoAdapter.INT32.encodedSizeWithTag(142, school_visible(user)) + UrlModel.ADAPTER.encodedSizeWithTag(143, avatar_pendant_larger(user)) + UrlModel.ADAPTER.encodedSizeWithTag(144, avatar_pendant_thumb(user)) + UrlModel.ADAPTER.encodedSizeWithTag(145, avatar_pendant_medium(user)) + RecommendAwemeItem.ADAPTER.asRepeated().encodedSizeWithTag(146, item_list(user)) + ProtoAdapter.INT32.encodedSizeWithTag(MediaPlayer.MEDIA_PLAYER_OPTION_ABR_STREAM_INFO, user_mode(user)) + ProtoAdapter.INT32.encodedSizeWithTag(148, user_period(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(149, is_effect_artist(user)) + EffectArtistDetail.ADAPTER.encodedSizeWithTag(150, effect_detail(user)) + CommercePermissionStruct.ADAPTER.encodedSizeWithTag(151, commerce_permissions(user)) + StoryBlockInfo.ADAPTER.encodedSizeWithTag(152, life_story_block(user)) + ProtoAdapter.INT32.encodedSizeWithTag(153, hide_following_follower_list(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(154, has_unread_story(user)) + UrlModel.ADAPTER.asRepeated().encodedSizeWithTag(155, new_story_cover(user)) + ProtoAdapter.INT32.encodedSizeWithTag(156, user_story_count(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(157, has_story(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(158, is_star(user)) + DouplusToastStruct.ADAPTER.encodedSizeWithTag(159, douplus_toast(user)) + ProtoAdapter.STRING.encodedSizeWithTag(160, cv_level(user)) + ProtoAdapter.INT32.encodedSizeWithTag(161, creator_level(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(162, is_mirror(user)) + ProtoAdapter.INT32.encodedSizeWithTag(163, pr_exempt(user)) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(164, type_label(user)) + ProtoAdapter.INT64.encodedSizeWithTag(165, avatar_decoration_id(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(166, with_luban_entry(user)) + UrlModel.ADAPTER.asRepeated().encodedSizeWithTag(167, ad_cover_url(user)) + AdCoverTitle.ADAPTER.encodedSizeWithTag(168, ad_cover_title(user)) + ProtoAdapter.STRING.encodedSizeWithTag(169, ad_order_id(user)) + RFansGroupInfo.ADAPTER.encodedSizeWithTag(170, r_fans_group_info(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(171, with_commerce_enterprise_tab_entry(user)) + HonorStruct.ADAPTER.encodedSizeWithTag(172, honor_info(user)) + ProtoAdapter.INT32.encodedSizeWithTag(173, comment_filter_status(user)) + ProtoAdapter.INT32.encodedSizeWithTag(174, notify_private_account(user)) + UrlModel.ADAPTER.encodedSizeWithTag(175, avatar_168x168(user)) + UrlModel.ADAPTER.encodedSizeWithTag(176, avatar_300x300(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(177, is_blocked(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(178, force_private_account(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(179, with_star_atlas_entry(user)) + HotSearchSprintStruct.ADAPTER.encodedSizeWithTag(180, sprint_support_user_info(user)) + ProtoAdapter.STRING.encodedSizeWithTag(181, signature_language(user)) + BlueVBrandInfo.ADAPTER.encodedSizeWithTag(182, brand_info(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(183, display_wvalantine_activity_entry(user)) + ProtoAdapter.STRING.encodedSizeWithTag(184, shop_micro_app(user)) + CommerceUserInfo.ADAPTER.encodedSizeWithTag(185, commerce_user_info(user)) + RelationLabelUser.ADAPTER.asRepeated().encodedSizeWithTag(186, relative_users(user)) + QuickShopInfo.ADAPTER.encodedSizeWithTag(187, quick_shop_info(user)) + ProtoAdapter.STRING.encodedSizeWithTag(188, relation_label(user)) + Challenge.ADAPTER.asRepeated().encodedSizeWithTag(189, cha_list(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(190, is_minor(user)) + ProtoAdapter.STRING.encodedSizeWithTag(191, sec_uid(user)) + ProtoAdapter.DOUBLE.encodedSizeWithTag(192, recommend_score(user)) + ProtoAdapter.INT32.encodedSizeWithTag(193, wx_tag(user)) + ProtoAdapter.INT64.encodedSizeWithTag(194, open_insight_time(user)) + GeneralPermission.ADAPTER.encodedSizeWithTag(195, general_permission(user)) + ProtoAdapter.INT32.encodedSizeWithTag(196, birthday_hide_level(user)) + ProtoAdapter.STRING.encodedSizeWithTag(197, bio_url(user)) + ProtoAdapter.STRING.encodedSizeWithTag(198, bio_email(user)) + ProtoAdapter.INT64.encodedSizeWithTag(199, latest_order_time(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(200, is_pro_account(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(201, with_stick_entry(user)) + ProtoAdapter.STRING.encodedSizeWithTag(202, email(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(203, is_email_verified(user)) + ProtoAdapter.STRING.encodedSizeWithTag(204, bio_secure_url(user)) + ProtoAdapter.INT32.encodedSizeWithTag(205, collect_count(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(206, nickname_update_reminder(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(207, avatar_update_reminder(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(208, is_activity_user(user)) + ProtoAdapter.STRING.encodedSizeWithTag(209, room_data(user)) + UnReadVideoInfo.ADAPTER.encodedSizeWithTag(210, video_unread_info(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(211, is_life_style(user)) + ProtoAdapter.INT32.encodedSizeWithTag(212, stitch_setting(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(213, is_mix_user(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(214, show_favorite_list_on_item(user)) + ProtoAdapter.INT32.encodedSizeWithTag(215, signature_display_lines(user)) + ProtoAdapter.INT64.encodedSizeWithTag(216, live_status(user)) + ProtoAdapter.BOOL.encodedSizeWithTag(217, is_series_user(user)) + RecommendTemplateStruct.ADAPTER.encodedSizeWithTag(218, recommend_template(user)) + ProtoAdapter.INT32.encodedSizeWithTag(219, new_friend_type(user)) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(221, common_interest(user)) + ProtoAdapter.STRING.encodedSizeWithTag(222, mkey(user)) + ProtoAdapter.INT32.encodedSizeWithTag(223, online_status(user)) + ProtoAdapter.INT64.encodedSizeWithTag(224, last_active_time(user)) + ProtoAdapter.INT64.encodedSizeWithTag(225, total_favorited_new(user)) + RecommendReasonData.ADAPTER.encodedSizeWithTag(226, recommend_reason_data(user)) + UserVirtualCharacterStruct.ADAPTER.encodedSizeWithTag(227, user_virtual_character(user)) + UserVirtualEmotionStruct.ADAPTER.encodedSizeWithTag(228, user_virtual_emotion(user));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, User user) {
        if (PatchProxy.proxy(new Object[]{protoWriter, user}, this, changeQuickRedirect, false, 112).isSupported) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uid(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, short_id(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, nickname(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, gender(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, signature(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 6, avatar_larger(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 7, avatar_thumb(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 8, avatar_medium(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, birthday(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, is_verified(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, allow_status(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, follow_status(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, aweme_count(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, following_count(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, follower_count(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, favoriting_count(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, total_favorited(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, is_block(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, third_name(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, hide_search(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, constellation(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, location(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, hide_location(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, weibo_verify(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, custom_verify(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, unique_id(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 27, bind_phone(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, special_lock(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 29, need_recommend(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, is_binded_weibo(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, weibo_name(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 32, weibo_schema(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 33, weibo_url(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 34, story_open(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 35, story_count(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 36, recommend_reason(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 37, has_facebook_token(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, has_twitter_token(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 39, fb_expire_time(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 40, tw_expire_time(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, has_youtube_token(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 42, youtube_expire_time(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 43, room_id(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 44, live_verify(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 45, authority_status(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 46, verify_info(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 47, shield_follow_notice(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 48, shield_digg_notice(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 49, shield_comment_notice(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 50, school_name(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 51, school_poi_id(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 52, school_type(user));
        ShareInfo.ADAPTER.encodeWithTag(protoWriter, 53, share_info(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 54, with_commerce_entry(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 55, verification_type(user));
        OriginalMusician.ADAPTER.encodeWithTag(protoWriter, 56, original_musician(user));
        ActivityStruct.ADAPTER.encodeWithTag(protoWriter, 57, activity(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 58, enterprise_verify_reason(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 59, is_ad_fake(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 60, star_use_new_download(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 61, mplatform_followers_count(user));
        FollowerDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 62, followers_detail(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 63, has_activity_medal(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 64, region(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 65, account_region(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 66, sync_to_toutiao(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 67, commerce_user_level(user));
        CommerceInfo.ADAPTER.encodeWithTag(protoWriter, 68, commerce_info(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 69, live_agreement(user));
        PlatformInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 70, platform_sync_info(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 71, with_shop_entry(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 72, is_discipline_member(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 73, secret(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 74, has_orders(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 75, prevent_download(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 76, show_image_bubble(user));
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 77, geofencing(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 78, unique_id_modify_time(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 79, video_icon(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 80, ins_id(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 81, google_account(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 82, youtube_channel_id(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 83, youtube_channel_title(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 84, apple_account(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 85, with_dou_entry(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 86, with_fusion_shop_entry(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 87, is_phone_binded(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 88, login_platform(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 89, accept_private_policy(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 90, realname_verify_status(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 91, twitter_id(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 92, twitter_name(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 93, user_canceled(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 94, has_email(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 95, is_gov_media_vip(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 96, dongtai_count(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 97, live_agreement_time(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 98, register_time(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 99, status(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 100, with_douplus_entry(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS, create_time(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 102, avatar_uri(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 103, follower_status(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 104, neiguang_shield(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 105, comment_setting(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 106, duet_setting(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 107, reflow_page_gid(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 108, reflow_page_uid(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 109, user_rate(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 110, with_new_goods(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 111, is_flowcard_member(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 112, room_cover(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 113, download_setting(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 114, download_prompt_ts(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 115, react_setting(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 116, live_commerce(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 117, college_name(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 118, enroll_year(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 119, country(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 120, province(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 121, city(user));
        UrlModel.ADAPTER.asRepeated().encodeWithTag(protoWriter, OpenAuthTask.f22015g, cover_url(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 123, recommend_reason_relation(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 124, iso_country_code(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, C1399n.f22430f, show_gender_strategy(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 126, district(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 127, language(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 128, room_type_tag(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 129, dou_plus_share_location(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 130, has_insights(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 131, remark_name(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 132, video_icon_virtual_URI(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 133, share_qrcode_uri(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 134, profile_tab_type(user));
        AvatarDecoration.ADAPTER.encodeWithTag(protoWriter, 135, avatar_decoration(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 136, watch_status(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 137, with_commerce_newbie_task(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 138, with_item_commerce_entry(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 139, star_billboard_rank(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 140, education(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 141, can_modify_school_info(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 142, school_visible(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 143, avatar_pendant_larger(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 144, avatar_pendant_thumb(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 145, avatar_pendant_medium(user));
        RecommendAwemeItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 146, item_list(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, MediaPlayer.MEDIA_PLAYER_OPTION_ABR_STREAM_INFO, user_mode(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 148, user_period(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 149, is_effect_artist(user));
        EffectArtistDetail.ADAPTER.encodeWithTag(protoWriter, 150, effect_detail(user));
        CommercePermissionStruct.ADAPTER.encodeWithTag(protoWriter, 151, commerce_permissions(user));
        StoryBlockInfo.ADAPTER.encodeWithTag(protoWriter, 152, life_story_block(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 153, hide_following_follower_list(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 154, has_unread_story(user));
        UrlModel.ADAPTER.asRepeated().encodeWithTag(protoWriter, 155, new_story_cover(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 156, user_story_count(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 157, has_story(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 158, is_star(user));
        DouplusToastStruct.ADAPTER.encodeWithTag(protoWriter, 159, douplus_toast(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 160, cv_level(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 161, creator_level(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 162, is_mirror(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 163, pr_exempt(user));
        ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 164, type_label(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 165, avatar_decoration_id(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 166, with_luban_entry(user));
        UrlModel.ADAPTER.asRepeated().encodeWithTag(protoWriter, 167, ad_cover_url(user));
        AdCoverTitle.ADAPTER.encodeWithTag(protoWriter, 168, ad_cover_title(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 169, ad_order_id(user));
        RFansGroupInfo.ADAPTER.encodeWithTag(protoWriter, 170, r_fans_group_info(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 171, with_commerce_enterprise_tab_entry(user));
        HonorStruct.ADAPTER.encodeWithTag(protoWriter, 172, honor_info(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 173, comment_filter_status(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 174, notify_private_account(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 175, avatar_168x168(user));
        UrlModel.ADAPTER.encodeWithTag(protoWriter, 176, avatar_300x300(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 177, is_blocked(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 178, force_private_account(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 179, with_star_atlas_entry(user));
        HotSearchSprintStruct.ADAPTER.encodeWithTag(protoWriter, 180, sprint_support_user_info(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 181, signature_language(user));
        BlueVBrandInfo.ADAPTER.encodeWithTag(protoWriter, 182, brand_info(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 183, display_wvalantine_activity_entry(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 184, shop_micro_app(user));
        CommerceUserInfo.ADAPTER.encodeWithTag(protoWriter, 185, commerce_user_info(user));
        RelationLabelUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 186, relative_users(user));
        QuickShopInfo.ADAPTER.encodeWithTag(protoWriter, 187, quick_shop_info(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 188, relation_label(user));
        Challenge.ADAPTER.asRepeated().encodeWithTag(protoWriter, 189, cha_list(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 190, is_minor(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 191, sec_uid(user));
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 192, recommend_score(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 193, wx_tag(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 194, open_insight_time(user));
        GeneralPermission.ADAPTER.encodeWithTag(protoWriter, 195, general_permission(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 196, birthday_hide_level(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 197, bio_url(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 198, bio_email(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 199, latest_order_time(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 200, is_pro_account(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 201, with_stick_entry(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 202, email(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 203, is_email_verified(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 204, bio_secure_url(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 205, collect_count(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 206, nickname_update_reminder(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 207, avatar_update_reminder(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 208, is_activity_user(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 209, room_data(user));
        UnReadVideoInfo.ADAPTER.encodeWithTag(protoWriter, 210, video_unread_info(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 211, is_life_style(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 212, stitch_setting(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 213, is_mix_user(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 214, show_favorite_list_on_item(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 215, signature_display_lines(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 216, live_status(user));
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 217, is_series_user(user));
        RecommendTemplateStruct.ADAPTER.encodeWithTag(protoWriter, 218, recommend_template(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 219, new_friend_type(user));
        ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 221, common_interest(user));
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 222, mkey(user));
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 223, online_status(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 224, last_active_time(user));
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 225, total_favorited_new(user));
        RecommendReasonData.ADAPTER.encodeWithTag(protoWriter, 226, recommend_reason_data(user));
        UserVirtualCharacterStruct.ADAPTER.encodeWithTag(protoWriter, 227, user_virtual_character(user));
        UserVirtualEmotionStruct.ADAPTER.encodeWithTag(protoWriter, 228, user_virtual_emotion(user));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: decode */
    public final User mo29749decode(ProtoReader protoReader) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{protoReader}, this, changeQuickRedirect, false, 113);
        if (proxy.isSupported) {
            return (User) proxy.result;
        }
        ProtoBuilder protoBuilder = new ProtoBuilder();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                protoReader.endMessage(beginMessage);
                return protoBuilder.LIZ();
            }
            switch (nextTag) {
                case 1:
                    protoBuilder.uid = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 2:
                    protoBuilder.short_id = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 3:
                    protoBuilder.nickname = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 4:
                    protoBuilder.gender = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 5:
                    protoBuilder.signature = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 6:
                    protoBuilder.avatar_larger = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 7:
                    protoBuilder.avatar_thumb = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 8:
                    protoBuilder.avatar_medium = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 9:
                    protoBuilder.birthday = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 10:
                    protoBuilder.is_verified = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 11:
                    protoBuilder.allow_status = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 12:
                    protoBuilder.follow_status = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 13:
                    protoBuilder.aweme_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 14:
                    protoBuilder.following_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_HAT_X /* 15 */:
                    protoBuilder.follower_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 16:
                    protoBuilder.favoriting_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                    protoBuilder.total_favorited = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 18:
                    protoBuilder.is_block = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                    protoBuilder.third_name = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 20:
                    protoBuilder.hide_search = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 21:
                    protoBuilder.constellation = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    protoBuilder.location = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    protoBuilder.hide_location = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    protoBuilder.weibo_verify = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_TILT /* 25 */:
                    protoBuilder.custom_verify = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 26:
                    protoBuilder.unique_id = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 27:
                    protoBuilder.bind_phone = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 28:
                    protoBuilder.special_lock = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 29:
                    protoBuilder.need_recommend = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 30:
                    protoBuilder.is_binded_weibo = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 31:
                    protoBuilder.weibo_name = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 32:
                    protoBuilder.weibo_schema = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    protoBuilder.weibo_url = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    protoBuilder.story_open = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    protoBuilder.story_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    protoBuilder.recommend_reason = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    protoBuilder.has_facebook_token = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    protoBuilder.has_twitter_token = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    protoBuilder.fb_expire_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 40:
                    protoBuilder.tw_expire_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    protoBuilder.has_youtube_token = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    protoBuilder.youtube_expire_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    protoBuilder.room_id = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    protoBuilder.live_verify = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    protoBuilder.authority_status = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    protoBuilder.verify_info = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    protoBuilder.shield_follow_notice = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 48:
                    protoBuilder.shield_digg_notice = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 49:
                    protoBuilder.shield_comment_notice = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 50:
                    protoBuilder.school_name = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case ImmersedStatusBarUtils.STATUS_BAR_ALPHA_20:
                    protoBuilder.school_poi_id = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 52:
                    protoBuilder.school_type = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 53:
                    protoBuilder.share_info = ShareInfo.ADAPTER.mo29749decode(protoReader);
                    break;
                case 54:
                    protoBuilder.with_commerce_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 55:
                    protoBuilder.verification_type = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 56:
                    protoBuilder.original_musician = OriginalMusician.ADAPTER.mo29749decode(protoReader);
                    break;
                case 57:
                    protoBuilder.activity = ActivityStruct.ADAPTER.mo29749decode(protoReader);
                    break;
                case 58:
                    protoBuilder.enterprise_verify_reason = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 59:
                    protoBuilder.is_ad_fake = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case ABOppoRedPointAppearAgainTimeInterval.VALUE_60 /* 60 */:
                    protoBuilder.star_use_new_download = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 61:
                    protoBuilder.mplatform_followers_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case BaseNotice.CREATOR /* 62 */:
                    protoBuilder.followers_detail.add(FollowerDetail.ADAPTER.mo29749decode(protoReader));
                    break;
                case LegoCommitOptExperiment.ALL /* 63 */:
                    protoBuilder.has_activity_medal = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case C33817d.f42505g /* 64 */:
                    protoBuilder.region = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 65:
                    protoBuilder.account_region = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 66:
                    protoBuilder.sync_to_toutiao = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 67:
                    protoBuilder.commerce_user_level = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 68:
                    protoBuilder.commerce_info = CommerceInfo.ADAPTER.mo29749decode(protoReader);
                    break;
                case 69:
                    protoBuilder.live_agreement = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 70:
                    protoBuilder.platform_sync_info.add(PlatformInfo.ADAPTER.mo29749decode(protoReader));
                    break;
                case 71:
                    protoBuilder.with_shop_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 72:
                    protoBuilder.is_discipline_member = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 73:
                    protoBuilder.secret = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 74:
                    protoBuilder.has_orders = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 75:
                    protoBuilder.prevent_download = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 76:
                    protoBuilder.show_image_bubble = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 77:
                    protoBuilder.geofencing.add(ProtoAdapter.STRING.mo29749decode(protoReader));
                    break;
                case 78:
                    protoBuilder.unique_id_modify_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 79:
                    protoBuilder.video_icon = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 80:
                    protoBuilder.ins_id = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 81:
                    protoBuilder.google_account = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 82:
                    protoBuilder.youtube_channel_id = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 83:
                    protoBuilder.youtube_channel_title = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 84:
                    protoBuilder.apple_account = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 85:
                    protoBuilder.with_dou_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 86:
                    protoBuilder.with_fusion_shop_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 87:
                    protoBuilder.is_phone_binded = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 88:
                    protoBuilder.login_platform = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 89:
                    protoBuilder.accept_private_policy = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 90:
                    protoBuilder.realname_verify_status = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 91:
                    protoBuilder.twitter_id = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 92:
                    protoBuilder.twitter_name = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 93:
                    protoBuilder.user_canceled = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 94:
                    protoBuilder.has_email = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 95:
                    protoBuilder.is_gov_media_vip = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 96:
                    protoBuilder.dongtai_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 97:
                    protoBuilder.live_agreement_time = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 98:
                    protoBuilder.register_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 99:
                    protoBuilder.status = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case HandlerC95384Nhi.LIZLLL:
                    protoBuilder.with_douplus_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS:
                    protoBuilder.create_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 102:
                    protoBuilder.avatar_uri = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 103:
                    protoBuilder.follower_status = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 104:
                    protoBuilder.neiguang_shield = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 105:
                    protoBuilder.comment_setting = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 106:
                    protoBuilder.duet_setting = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 107:
                    protoBuilder.reflow_page_gid = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 108:
                    protoBuilder.reflow_page_uid = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 109:
                    protoBuilder.user_rate = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 110:
                    protoBuilder.with_new_goods = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 111:
                    protoBuilder.is_flowcard_member = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 112:
                    protoBuilder.room_cover = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 113:
                    protoBuilder.download_setting = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 114:
                    protoBuilder.download_prompt_ts = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 115:
                    protoBuilder.react_setting = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 116:
                    protoBuilder.live_commerce = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 117:
                    protoBuilder.college_name = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 118:
                    protoBuilder.enroll_year = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 119:
                    protoBuilder.country = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 120:
                    protoBuilder.province = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 121:
                    protoBuilder.city = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case OpenAuthTask.f22015g /* 122 */:
                    protoBuilder.cover_url.add(UrlModel.ADAPTER.mo29749decode(protoReader));
                    break;
                case 123:
                    protoBuilder.recommend_reason_relation = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 124:
                    protoBuilder.iso_country_code = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case C1399n.f22430f /* 125 */:
                    protoBuilder.show_gender_strategy = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 126:
                    protoBuilder.district = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 127:
                    protoBuilder.language = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 128:
                    protoBuilder.room_type_tag = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 129:
                    protoBuilder.dou_plus_share_location = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 130:
                    protoBuilder.has_insights = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 131:
                    protoBuilder.remark_name = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 132:
                    protoBuilder.video_icon_virtual_URI = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 133:
                    protoBuilder.share_qrcode_uri = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 134:
                    protoBuilder.profile_tab_type = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 135:
                    protoBuilder.avatar_decoration = AvatarDecoration.ADAPTER.mo29749decode(protoReader);
                    break;
                case 136:
                    protoBuilder.watch_status = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 137:
                    protoBuilder.with_commerce_newbie_task = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 138:
                    protoBuilder.with_item_commerce_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 139:
                    protoBuilder.star_billboard_rank = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 140:
                    protoBuilder.education = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 141:
                    protoBuilder.can_modify_school_info = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 142:
                    protoBuilder.school_visible = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 143:
                    protoBuilder.avatar_pendant_larger = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 144:
                    protoBuilder.avatar_pendant_thumb = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 145:
                    protoBuilder.avatar_pendant_medium = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 146:
                    protoBuilder.item_list.add(RecommendAwemeItem.ADAPTER.mo29749decode(protoReader));
                    break;
                case MediaPlayer.MEDIA_PLAYER_OPTION_ABR_STREAM_INFO /* 147 */:
                    protoBuilder.user_mode = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 148:
                    protoBuilder.user_period = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 149:
                    protoBuilder.is_effect_artist = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 150:
                    protoBuilder.effect_detail = EffectArtistDetail.ADAPTER.mo29749decode(protoReader);
                    break;
                case 151:
                    protoBuilder.commerce_permissions = CommercePermissionStruct.ADAPTER.mo29749decode(protoReader);
                    break;
                case 152:
                    protoBuilder.life_story_block = StoryBlockInfo.ADAPTER.mo29749decode(protoReader);
                    break;
                case 153:
                    protoBuilder.hide_following_follower_list = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 154:
                    protoBuilder.has_unread_story = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 155:
                    protoBuilder.new_story_cover.add(UrlModel.ADAPTER.mo29749decode(protoReader));
                    break;
                case 156:
                    protoBuilder.user_story_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 157:
                    protoBuilder.has_story = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 158:
                    protoBuilder.is_star = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 159:
                    protoBuilder.douplus_toast = DouplusToastStruct.ADAPTER.mo29749decode(protoReader);
                    break;
                case 160:
                    protoBuilder.cv_level = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 161:
                    protoBuilder.creator_level = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 162:
                    protoBuilder.is_mirror = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 163:
                    protoBuilder.pr_exempt = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 164:
                    protoBuilder.type_label.add(ProtoAdapter.INT64.mo29749decode(protoReader));
                    break;
                case 165:
                    protoBuilder.avatar_decoration_id = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 166:
                    protoBuilder.with_luban_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 167:
                    protoBuilder.ad_cover_url.add(UrlModel.ADAPTER.mo29749decode(protoReader));
                    break;
                case 168:
                    protoBuilder.ad_cover_title = AdCoverTitle.ADAPTER.mo29749decode(protoReader);
                    break;
                case 169:
                    protoBuilder.ad_order_id = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 170:
                    protoBuilder.r_fans_group_info = RFansGroupInfo.ADAPTER.mo29749decode(protoReader);
                    break;
                case 171:
                    protoBuilder.with_commerce_enterprise_tab_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 172:
                    protoBuilder.honor_info = HonorStruct.ADAPTER.mo29749decode(protoReader);
                    break;
                case 173:
                    protoBuilder.comment_filter_status = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 174:
                    protoBuilder.notify_private_account = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 175:
                    protoBuilder.avatar_168x168 = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 176:
                    protoBuilder.avatar_300x300 = UrlModel.ADAPTER.mo29749decode(protoReader);
                    break;
                case 177:
                    protoBuilder.is_blocked = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 178:
                    protoBuilder.force_private_account = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 179:
                    protoBuilder.with_star_atlas_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 180:
                    protoBuilder.sprint_support_user_info = HotSearchSprintStruct.ADAPTER.mo29749decode(protoReader);
                    break;
                case 181:
                    protoBuilder.signature_language = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 182:
                    protoBuilder.brand_info = BlueVBrandInfo.ADAPTER.mo29749decode(protoReader);
                    break;
                case 183:
                    protoBuilder.display_wvalantine_activity_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 184:
                    protoBuilder.shop_micro_app = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 185:
                    protoBuilder.commerce_user_info = CommerceUserInfo.ADAPTER.mo29749decode(protoReader);
                    break;
                case 186:
                    protoBuilder.relative_users.add(RelationLabelUser.ADAPTER.mo29749decode(protoReader));
                    break;
                case 187:
                    protoBuilder.quick_shop_info = QuickShopInfo.ADAPTER.mo29749decode(protoReader);
                    break;
                case 188:
                    protoBuilder.relation_label = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 189:
                    protoBuilder.cha_list.add(Challenge.ADAPTER.mo29749decode(protoReader));
                    break;
                case 190:
                    protoBuilder.is_minor = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 191:
                    protoBuilder.sec_uid = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 192:
                    protoBuilder.recommend_score = ProtoAdapter.DOUBLE.mo29749decode(protoReader);
                    break;
                case 193:
                    protoBuilder.wx_tag = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 194:
                    protoBuilder.open_insight_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 195:
                    protoBuilder.general_permission = GeneralPermission.ADAPTER.mo29749decode(protoReader);
                    break;
                case 196:
                    protoBuilder.birthday_hide_level = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 197:
                    protoBuilder.bio_url = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 198:
                    protoBuilder.bio_email = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 199:
                    protoBuilder.latest_order_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 200:
                    protoBuilder.is_pro_account = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 201:
                    protoBuilder.with_stick_entry = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 202:
                    protoBuilder.email = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 203:
                    protoBuilder.is_email_verified = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 204:
                    protoBuilder.bio_secure_url = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 205:
                    protoBuilder.collect_count = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 206:
                    protoBuilder.nickname_update_reminder = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 207:
                    protoBuilder.avatar_update_reminder = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 208:
                    protoBuilder.is_activity_user = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 209:
                    protoBuilder.room_data = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 210:
                    protoBuilder.video_unread_info = UnReadVideoInfo.ADAPTER.mo29749decode(protoReader);
                    break;
                case 211:
                    protoBuilder.is_life_style = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 212:
                    protoBuilder.stitch_setting = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 213:
                    protoBuilder.is_mix_user = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 214:
                    protoBuilder.show_favorite_list_on_item = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 215:
                    protoBuilder.signature_display_lines = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 216:
                    protoBuilder.live_status = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 217:
                    protoBuilder.is_series_user = ProtoAdapter.BOOL.mo29749decode(protoReader);
                    break;
                case 218:
                    protoBuilder.recommend_template = RecommendTemplateStruct.ADAPTER.mo29749decode(protoReader);
                    break;
                case 219:
                    protoBuilder.new_friend_type = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 220:
                default:
                    protoReader.skip();
                    break;
                case 221:
                    protoBuilder.common_interest.add(ProtoAdapter.INT32.mo29749decode(protoReader));
                    break;
                case 222:
                    protoBuilder.mkey = ProtoAdapter.STRING.mo29749decode(protoReader);
                    break;
                case 223:
                    protoBuilder.online_status = ProtoAdapter.INT32.mo29749decode(protoReader);
                    break;
                case 224:
                    protoBuilder.last_active_time = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 225:
                    protoBuilder.total_favorited_new = ProtoAdapter.INT64.mo29749decode(protoReader);
                    break;
                case 226:
                    protoBuilder.recommend_reason_data = RecommendReasonData.ADAPTER.mo29749decode(protoReader);
                    break;
                case 227:
                    protoBuilder.user_virtual_character = UserVirtualCharacterStruct.ADAPTER.mo29749decode(protoReader);
                    break;
                case 228:
                    protoBuilder.user_virtual_emotion = UserVirtualEmotionStruct.ADAPTER.mo29749decode(protoReader);
                    break;
            }
        }
    }

    public ProtobufUserStructV2Adapter() {
        super(FieldEncoding.LENGTH_DELIMITED, User.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.model.ProtobufUserStructV2Adapter$ProtoBuilder */
    /* loaded from: classes20.dex */
    public static final class ProtoBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean accept_private_policy;
        public String account_region;
        public ActivityStruct activity;
        public AdCoverTitle ad_cover_title;
        public String ad_order_id;
        public Integer allow_status;
        public Integer apple_account;
        public Long authority_status;
        public UrlModel avatar_168x168;
        public UrlModel avatar_300x300;
        public AvatarDecoration avatar_decoration;
        public Long avatar_decoration_id;
        public UrlModel avatar_larger;
        public UrlModel avatar_medium;
        public UrlModel avatar_pendant_larger;
        public UrlModel avatar_pendant_medium;
        public UrlModel avatar_pendant_thumb;
        public UrlModel avatar_thumb;
        public Boolean avatar_update_reminder;
        public String avatar_uri;
        public Integer aweme_count;
        public String bind_phone;
        public String bio_email;
        public String bio_secure_url;
        public String bio_url;
        public String birthday;
        public Integer birthday_hide_level;
        public BlueVBrandInfo brand_info;
        public Boolean can_modify_school_info;
        public String city;
        public Integer collect_count;
        public String college_name;
        public Integer comment_filter_status;
        public Integer comment_setting;
        public CommerceInfo commerce_info;
        public CommercePermissionStruct commerce_permissions;
        public CommerceUserInfo commerce_user_info;
        public Integer commerce_user_level;
        public Integer constellation;
        public String country;
        public Long create_time;
        public Integer creator_level;
        public String custom_verify;
        public String cv_level;
        public Boolean display_wvalantine_activity_entry;
        public String district;
        public Integer dongtai_count;
        public Integer dou_plus_share_location;
        public DouplusToastStruct douplus_toast;
        public Long download_prompt_ts;
        public Integer download_setting;
        public Integer duet_setting;
        public Integer education;
        public EffectArtistDetail effect_detail;
        public String email;
        public String enroll_year;
        public String enterprise_verify_reason;
        public Integer favoriting_count;
        public Long fb_expire_time;
        public Integer follow_status;
        public Integer follower_count;
        public Integer follower_status;
        public Integer following_count;
        public Boolean force_private_account;
        public Integer gender;
        public GeneralPermission general_permission;
        public String google_account;
        public Boolean has_activity_medal;
        public Boolean has_email;
        public Boolean has_facebook_token;
        public Boolean has_insights;
        public Boolean has_orders;
        public Boolean has_story;
        public Boolean has_twitter_token;
        public Boolean has_unread_story;
        public Boolean has_youtube_token;
        public Integer hide_following_follower_list;
        public Boolean hide_location;
        public Boolean hide_search;
        public HonorStruct honor_info;
        public String ins_id;
        public Boolean is_activity_user;
        public Boolean is_ad_fake;
        public Boolean is_binded_weibo;
        public Boolean is_block;
        public Boolean is_blocked;
        public Boolean is_discipline_member;
        public Boolean is_effect_artist;
        public Boolean is_email_verified;
        public Boolean is_flowcard_member;
        public Boolean is_gov_media_vip;
        public Boolean is_life_style;
        public Boolean is_minor;
        public Boolean is_mirror;
        public Boolean is_mix_user;
        public Boolean is_phone_binded;
        public Boolean is_pro_account;
        public Boolean is_series_user;
        public Boolean is_star;
        public Boolean is_verified;
        public String iso_country_code;
        public String language;
        public Long last_active_time;
        public Long latest_order_time;
        public StoryBlockInfo life_story_block;
        public Integer live_agreement;
        public Integer live_agreement_time;
        public Boolean live_commerce;
        public Long live_status;
        public Integer live_verify;
        public String location;
        public Integer login_platform;
        public String mkey;
        public Integer mplatform_followers_count;
        public Integer need_recommend;
        public Integer neiguang_shield;
        public Integer new_friend_type;
        public String nickname;
        public Boolean nickname_update_reminder;
        public Integer notify_private_account;
        public Integer online_status;
        public Long open_insight_time;
        public OriginalMusician original_musician;
        public Integer pr_exempt;
        public Boolean prevent_download;
        public Integer profile_tab_type;
        public String province;
        public QuickShopInfo quick_shop_info;
        public RFansGroupInfo r_fans_group_info;
        public Integer react_setting;
        public Integer realname_verify_status;
        public String recommend_reason;
        public RecommendReasonData recommend_reason_data;
        public String recommend_reason_relation;
        public Double recommend_score;
        public RecommendTemplateStruct recommend_template;
        public Long reflow_page_gid;
        public Long reflow_page_uid;
        public String region;
        public Long register_time;
        public String relation_label;
        public String remark_name;
        public UrlModel room_cover;
        public String room_data;
        public Long room_id;
        public String room_type_tag;
        public String school_name;
        public String school_poi_id;
        public Integer school_type;
        public Integer school_visible;
        public String sec_uid;
        public Integer secret;
        public ShareInfo share_info;
        public String share_qrcode_uri;
        public Integer shield_comment_notice;
        public Integer shield_digg_notice;
        public Integer shield_follow_notice;
        public String shop_micro_app;
        public String short_id;
        public Boolean show_favorite_list_on_item;
        public Integer show_gender_strategy;
        public Boolean show_image_bubble;
        public String signature;
        public Integer signature_display_lines;
        public String signature_language;
        public Integer special_lock;
        public HotSearchSprintStruct sprint_support_user_info;
        public Integer star_billboard_rank;
        public Boolean star_use_new_download;
        public Integer status;
        public Integer stitch_setting;
        public Integer story_count;
        public Boolean story_open;
        public Integer sync_to_toutiao;
        public String third_name;
        public Long total_favorited;
        public Long total_favorited_new;
        public Long tw_expire_time;
        public String twitter_id;
        public String twitter_name;
        public String uid;
        public String unique_id;
        public Long unique_id_modify_time;
        public Boolean user_canceled;
        public Integer user_mode;
        public Integer user_period;
        public Integer user_rate;
        public Integer user_story_count;
        public UserVirtualCharacterStruct user_virtual_character;
        public UserVirtualEmotionStruct user_virtual_emotion;
        public Integer verification_type;
        public String verify_info;
        public UrlModel video_icon;
        public String video_icon_virtual_URI;
        public UnReadVideoInfo video_unread_info;
        public Boolean watch_status;
        public String weibo_name;
        public String weibo_schema;
        public String weibo_url;
        public String weibo_verify;
        public Boolean with_commerce_enterprise_tab_entry;
        public Boolean with_commerce_entry;
        public Boolean with_commerce_newbie_task;
        public Boolean with_dou_entry;
        public Boolean with_douplus_entry;
        public Boolean with_fusion_shop_entry;
        public Boolean with_item_commerce_entry;
        public Boolean with_luban_entry;
        public Boolean with_new_goods;
        public Boolean with_shop_entry;
        public Boolean with_star_atlas_entry;
        public Boolean with_stick_entry;
        public Integer wx_tag;
        public String youtube_channel_id;
        public String youtube_channel_title;
        public Long youtube_expire_time;
        public List<FollowerDetail> followers_detail = Internal.newMutableList();
        public List<PlatformInfo> platform_sync_info = Internal.newMutableList();
        public List<String> geofencing = Internal.newMutableList();
        public List<UrlModel> cover_url = Internal.newMutableList();
        public List<RecommendAwemeItem> item_list = Internal.newMutableList();
        public List<UrlModel> new_story_cover = Internal.newMutableList();
        public List<Long> type_label = Internal.newMutableList();
        public List<UrlModel> ad_cover_url = Internal.newMutableList();
        public List<RelationLabelUser> relative_users = Internal.newMutableList();
        public List<Challenge> cha_list = Internal.newMutableList();
        public List<Integer> common_interest = Internal.newMutableList();

        static {
            Covode.recordClassIndex(221044);
        }

        public final User LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
            if (proxy.isSupported) {
                return (User) proxy.result;
            }
            User user = new User();
            String str = this.uid;
            if (str != null) {
                user.uid = str;
            }
            String str2 = this.short_id;
            if (str2 != null) {
                user.shortId = str2;
            }
            String str3 = this.nickname;
            if (str3 != null) {
                user.nickname = str3;
            }
            Integer num = this.gender;
            if (num != null) {
                user.gender = num.intValue();
            }
            String str4 = this.signature;
            if (str4 != null) {
                user.signature = str4;
            }
            UrlModel urlModel = this.avatar_larger;
            if (urlModel != null) {
                user.avatarLarger = urlModel;
            }
            UrlModel urlModel2 = this.avatar_thumb;
            if (urlModel2 != null) {
                user.avatarThumb = urlModel2;
            }
            UrlModel urlModel3 = this.avatar_medium;
            if (urlModel3 != null) {
                user.avatarMedium = urlModel3;
            }
            String str5 = this.birthday;
            if (str5 != null) {
                user.birthday = str5;
            }
            Boolean bool = this.is_verified;
            if (bool != null) {
                user.isVerified = bool;
            }
            Integer num2 = this.allow_status;
            if (num2 != null) {
                user.allowStatus = num2.intValue();
            }
            Integer num3 = this.follow_status;
            if (num3 != null) {
                user.followStatus = num3.intValue();
            }
            Integer num4 = this.aweme_count;
            if (num4 != null) {
                user.awemeCount = num4.intValue();
            }
            Integer num5 = this.following_count;
            if (num5 != null) {
                user.followingCount = num5.intValue();
            }
            Integer num6 = this.follower_count;
            if (num6 != null) {
                user.followerCount = num6.intValue();
            }
            Integer num7 = this.favoriting_count;
            if (num7 != null) {
                user.favoritingCount = num7.intValue();
            }
            Long l = this.total_favorited;
            if (l != null) {
                user.totalFavorited = l.longValue();
            }
            Boolean bool2 = this.is_block;
            if (bool2 != null) {
                user.isBlock = bool2.booleanValue();
            }
            String str6 = this.third_name;
            if (str6 != null) {
                user.thirdName = str6;
            }
            Boolean bool3 = this.hide_search;
            if (bool3 != null) {
                user.hideSearch = bool3.booleanValue();
            }
            Integer num8 = this.constellation;
            if (num8 != null) {
                user.constellation = num8.intValue();
            }
            String str7 = this.location;
            if (str7 != null) {
                user.city = str7;
            }
            Boolean bool4 = this.hide_location;
            if (bool4 != null) {
                user.hideCity = bool4.booleanValue();
            }
            String str8 = this.weibo_verify;
            if (str8 != null) {
                user.weiboVerify = str8;
            }
            String str9 = this.custom_verify;
            if (str9 != null) {
                user.customVerify = str9;
            }
            String str10 = this.unique_id;
            if (str10 != null) {
                user.uniqueId = str10;
            }
            String str11 = this.bind_phone;
            if (str11 != null) {
                user.bindPhone = str11;
            }
            Integer num9 = this.special_lock;
            if (num9 != null) {
                user.specialLock = num9;
            }
            Integer num10 = this.need_recommend;
            if (num10 != null) {
                user.needRecommend = num10.intValue();
            }
            Boolean bool5 = this.is_binded_weibo;
            if (bool5 != null) {
                user.isBindedWeibo = bool5.booleanValue();
            }
            String str12 = this.weibo_name;
            if (str12 != null) {
                user.weiboNickname = str12;
            }
            String str13 = this.weibo_schema;
            if (str13 != null) {
                user.weiboSchema = str13;
            }
            String str14 = this.weibo_url;
            if (str14 != null) {
                user.weiboUrl = str14;
            }
            Boolean bool6 = this.story_open;
            if (bool6 != null) {
                user.storyOpen = bool6.booleanValue();
            }
            Integer num11 = this.story_count;
            if (num11 != null) {
                user.storyCount = num11.intValue();
            }
            String str15 = this.recommend_reason;
            if (str15 != null) {
                user.recommendReason = str15;
            }
            Boolean bool7 = this.has_facebook_token;
            if (bool7 != null) {
                user.hasFacebookToken = bool7.booleanValue();
            }
            Boolean bool8 = this.has_twitter_token;
            if (bool8 != null) {
                user.hasTwitterToken = bool8.booleanValue();
            }
            Long l2 = this.fb_expire_time;
            if (l2 != null) {
                user.fbExpireTime = l2.longValue();
            }
            Long l3 = this.tw_expire_time;
            if (l3 != null) {
                user.twExpireTime = l3.longValue();
            }
            Boolean bool9 = this.has_youtube_token;
            if (bool9 != null) {
                user.hasYoutubeToken = bool9.booleanValue();
            }
            Long l4 = this.youtube_expire_time;
            if (l4 != null) {
                user.youtubeExpireTime = l4.longValue();
            }
            Long l5 = this.room_id;
            if (l5 != null) {
                user.roomId = l5.longValue();
            }
            Integer num12 = this.live_verify;
            if (num12 != null) {
                user.verifyStatus = num12.intValue();
            }
            Long l6 = this.authority_status;
            if (l6 != null) {
                user.authorityStatus = l6.longValue();
            }
            String str16 = this.verify_info;
            if (str16 != null) {
                user.verifyInfo = str16;
            }
            Integer num13 = this.shield_follow_notice;
            if (num13 != null) {
                user.shieldFollowNotice = num13.intValue();
            }
            Integer num14 = this.shield_digg_notice;
            if (num14 != null) {
                user.shieldDiggNotice = num14.intValue();
            }
            Integer num15 = this.shield_comment_notice;
            if (num15 != null) {
                user.shieldCommentNotice = num15.intValue();
            }
            String str17 = this.school_name;
            if (str17 != null) {
                user.schoolName = str17;
            }
            String str18 = this.school_poi_id;
            if (str18 != null) {
                user.schoolPoiId = str18;
            }
            Integer num16 = this.school_type;
            if (num16 != null) {
                user.schoolType = num16.intValue();
            }
            ShareInfo shareInfo = this.share_info;
            if (shareInfo != null) {
                user.shareInfo = shareInfo;
            }
            Boolean bool10 = this.with_commerce_entry;
            if (bool10 != null) {
                user.withCommerceEntry = bool10.booleanValue();
            }
            Integer num17 = this.verification_type;
            if (num17 != null) {
                user.verificationType = num17.intValue();
            }
            OriginalMusician originalMusician = this.original_musician;
            if (originalMusician != null) {
                user.originalMusician = originalMusician;
            }
            ActivityStruct activityStruct = this.activity;
            if (activityStruct != null) {
                user.activity = activityStruct;
            }
            String str19 = this.enterprise_verify_reason;
            if (str19 != null) {
                user.enterpriseVerifyReason = str19;
            }
            Boolean bool11 = this.is_ad_fake;
            if (bool11 != null) {
                user.isAdFake = bool11.booleanValue();
            }
            Boolean bool12 = this.star_use_new_download;
            if (bool12 != null) {
                user.starUseNewDownload = bool12.booleanValue();
            }
            Integer num18 = this.mplatform_followers_count;
            if (num18 != null) {
                user.fansCount = num18.intValue();
            }
            List<FollowerDetail> list = this.followers_detail;
            if (list != null) {
                user.followerDetailList = list;
            }
            Boolean bool13 = this.has_activity_medal;
            if (bool13 != null) {
                user.hasMedal = bool13.booleanValue();
            }
            String str20 = this.region;
            if (str20 != null) {
                user.region = str20;
            }
            String str21 = this.account_region;
            if (str21 != null) {
                user.accountRegion = str21;
            }
            Integer num19 = this.sync_to_toutiao;
            if (num19 != null) {
                user.isSyncToutiao = num19.intValue();
            }
            Integer num20 = this.commerce_user_level;
            if (num20 != null) {
                user.commerceUserLevel = num20.intValue();
            }
            CommerceInfo commerceInfo = this.commerce_info;
            if (commerceInfo != null) {
                user.commerceInfo = commerceInfo;
            }
            Integer num21 = this.live_agreement;
            if (num21 != null) {
                user.liveAgreement = num21.intValue();
            }
            List<PlatformInfo> list2 = this.platform_sync_info;
            if (list2 != null) {
                user.platformInfos = list2;
            }
            Boolean bool14 = this.with_shop_entry;
            if (bool14 != null) {
                user.withShopEntry = bool14.booleanValue();
            }
            Boolean bool15 = this.is_discipline_member;
            if (bool15 != null) {
                user.isDisciplineMember = bool15.booleanValue();
            }
            Integer num22 = this.secret;
            if (num22 != null) {
                user.secret = num22.intValue();
            }
            Boolean bool16 = this.has_orders;
            if (bool16 != null) {
                user.hasOrders = bool16.booleanValue();
            }
            Boolean bool17 = this.prevent_download;
            if (bool17 != null) {
                user.preventDownload = bool17.booleanValue();
            }
            Boolean bool18 = this.show_image_bubble;
            if (bool18 != null) {
                user.showImageBubble = bool18.booleanValue();
            }
            List<String> list3 = this.geofencing;
            if (list3 != null) {
                user.geofencing = list3;
            }
            Long l7 = this.unique_id_modify_time;
            if (l7 != null) {
                user.unique_id_modify_time = l7.longValue();
            }
            UrlModel urlModel4 = this.video_icon;
            if (urlModel4 != null) {
                user.avatarVideoUri = urlModel4;
            }
            String str22 = this.ins_id;
            if (str22 != null) {
                user.insId = str22;
            }
            String str23 = this.google_account;
            if (str23 != null) {
                user.googleAccount = str23;
            }
            String str24 = this.youtube_channel_id;
            if (str24 != null) {
                user.youtubeChannelId = str24;
            }
            String str25 = this.youtube_channel_title;
            if (str25 != null) {
                user.youtubeChannelTitle = str25;
            }
            Integer num23 = this.apple_account;
            if (num23 != null) {
                user.appleAccount = num23;
            }
            Boolean bool19 = this.with_dou_entry;
            if (bool19 != null) {
                user.withDouEntry = bool19.booleanValue();
            }
            Boolean bool20 = this.with_fusion_shop_entry;
            if (bool20 != null) {
                user.withFusionShopEntry = bool20.booleanValue();
            }
            Boolean bool21 = this.is_phone_binded;
            if (bool21 != null) {
                user.isPhoneBinded = bool21.booleanValue();
            }
            Integer num24 = this.login_platform;
            if (num24 != null) {
                user.loginPlatform = num24.intValue();
            }
            Boolean bool22 = this.accept_private_policy;
            if (bool22 != null) {
                user.acceptPrivatePolicy = bool22.booleanValue();
            }
            Integer num25 = this.realname_verify_status;
            if (num25 != null) {
                user.verifyStatus = num25.intValue();
            }
            String str26 = this.twitter_id;
            if (str26 != null) {
                user.twitterId = str26;
            }
            String str27 = this.twitter_name;
            if (str27 != null) {
                user.twitterName = str27;
            }
            Boolean bool23 = this.user_canceled;
            if (bool23 != null) {
                user.userCancelled = bool23.booleanValue();
            }
            Boolean bool24 = this.has_email;
            if (bool24 != null) {
                user.hasEmail = bool24.booleanValue();
            }
            Boolean bool25 = this.is_gov_media_vip;
            if (bool25 != null) {
                user.mIsGovMediaVip = bool25.booleanValue();
            }
            Integer num26 = this.dongtai_count;
            if (num26 != null) {
                user.dongtai_count = num26.intValue();
            }
            Integer num27 = this.live_agreement_time;
            if (num27 != null) {
                user.liveAgreementTime = num27;
            }
            Long l8 = this.register_time;
            if (l8 != null) {
                user.registerTime = l8.longValue();
            }
            Integer num28 = this.status;
            if (num28 != null) {
                user.status = num28;
            }
            Boolean bool26 = this.with_douplus_entry;
            if (bool26 != null) {
                user.withDouplusEntry = bool26.booleanValue();
            }
            Long l9 = this.create_time;
            if (l9 != null) {
                user.createTime = l9;
            }
            String str28 = this.avatar_uri;
            if (str28 != null) {
                user.avatarUri = str28;
            }
            Integer num29 = this.follower_status;
            if (num29 != null) {
                user.followerStatus = num29.intValue();
            }
            Integer num30 = this.neiguang_shield;
            if (num30 != null) {
                user.neiguangShield = num30.intValue();
            }
            Integer num31 = this.comment_setting;
            if (num31 != null) {
                user.commentSetting = num31.intValue();
            }
            Integer num32 = this.duet_setting;
            if (num32 != null) {
                user.duetSetting = num32.intValue();
            }
            Long l10 = this.reflow_page_gid;
            if (l10 != null) {
                user.reflowPageGid = l10;
            }
            Long l11 = this.reflow_page_uid;
            if (l11 != null) {
                user.reflowPageUid = l11;
            }
            Integer num33 = this.user_rate;
            if (num33 != null) {
                user.userRate = num33.intValue();
            }
            Boolean bool27 = this.with_new_goods;
            if (bool27 != null) {
                user.withNewGoods = bool27.booleanValue();
            }
            Boolean bool28 = this.is_flowcard_member;
            if (bool28 != null) {
                user.isFlowcardMember = bool28.booleanValue();
            }
            UrlModel urlModel5 = this.room_cover;
            if (urlModel5 != null) {
                user.roomCover = urlModel5;
            }
            Integer num34 = this.download_setting;
            if (num34 != null) {
                user.downloadSetting = num34.intValue();
            }
            Long l12 = this.download_prompt_ts;
            if (l12 != null) {
                user.downloadPromptTs = l12;
            }
            Integer num35 = this.react_setting;
            if (num35 != null) {
                user.reactSetting = num35;
            }
            Boolean bool29 = this.live_commerce;
            if (bool29 != null) {
                user.liveCommerce = bool29.booleanValue();
            }
            String str29 = this.college_name;
            if (str29 != null) {
                user.collegeName = str29;
            }
            String str30 = this.enroll_year;
            if (str30 != null) {
                user.enrollYear = str30;
            }
            String str31 = this.country;
            if (str31 != null) {
                user.country = str31;
            }
            String str32 = this.province;
            if (str32 != null) {
                user.province = str32;
            }
            String str33 = this.city;
            if (str33 != null) {
                user.cityName = str33;
            }
            List<UrlModel> list4 = this.cover_url;
            if (list4 != null) {
                user.coverUrls = list4;
            }
            String str34 = this.recommend_reason_relation;
            if (str34 != null) {
                user.recommendReasonRelation = str34;
            }
            String str35 = this.iso_country_code;
            if (str35 != null) {
                user.isoCountryCode = str35;
            }
            Integer num36 = this.show_gender_strategy;
            if (num36 != null) {
                user.showGenderStrategy = num36.intValue();
            }
            String str36 = this.district;
            if (str36 != null) {
                user.district = str36;
            }
            String str37 = this.language;
            if (str37 != null) {
                user.language = str37;
            }
            String str38 = this.room_type_tag;
            if (str38 != null) {
                user.roomTypeTag = str38;
            }
            Integer num37 = this.dou_plus_share_location;
            if (num37 != null) {
                user.douPlusShareLocation = num37.intValue();
            }
            Boolean bool30 = this.has_insights;
            if (bool30 != null) {
                user.isCreater = bool30.booleanValue();
            }
            String str39 = this.remark_name;
            if (str39 != null) {
                user.remarkName = str39;
            }
            String str40 = this.video_icon_virtual_URI;
            if (str40 != null) {
                user.videoIconVirtualUri = str40;
            }
            String str41 = this.share_qrcode_uri;
            if (str41 != null) {
                user.shareQrcodeUri = str41;
            }
            Integer num38 = this.profile_tab_type;
            if (num38 != null) {
                user.tabType = num38.intValue();
            }
            AvatarDecoration avatarDecoration = this.avatar_decoration;
            if (avatarDecoration != null) {
                user.avatarDecoration = avatarDecoration;
            }
            Boolean bool31 = this.watch_status;
            if (bool31 != null) {
                user.watchStatus = bool31.booleanValue();
            }
            Boolean bool32 = this.with_commerce_newbie_task;
            if (bool32 != null) {
                user.withCommerceNewbieTask = bool32.booleanValue();
            }
            Boolean bool33 = this.with_item_commerce_entry;
            if (bool33 != null) {
                user.withItemCommerceEntry = bool33.booleanValue();
            }
            Integer num39 = this.star_billboard_rank;
            if (num39 != null) {
                user.starBillboardRank = num39.intValue();
            }
            Integer num40 = this.education;
            if (num40 != null) {
                user.education = num40.intValue();
            }
            Boolean bool34 = this.can_modify_school_info;
            if (bool34 != null) {
                user.canModifySchoolInfo = bool34.booleanValue();
            }
            Integer num41 = this.school_visible;
            if (num41 != null) {
                user.schoolInfoShowRange = num41.intValue();
            }
            UrlModel urlModel6 = this.avatar_pendant_larger;
            if (urlModel6 != null) {
                user.avatarPendantLarger = urlModel6;
            }
            UrlModel urlModel7 = this.avatar_pendant_thumb;
            if (urlModel7 != null) {
                user.avatarPendantThumb = urlModel7;
            }
            UrlModel urlModel8 = this.avatar_pendant_medium;
            if (urlModel8 != null) {
                user.avatarPendantMedium = urlModel8;
            }
            List<RecommendAwemeItem> list5 = this.item_list;
            if (list5 != null) {
                user.recommendAwemeItems = list5;
            }
            Integer num42 = this.user_mode;
            if (num42 != null) {
                user.userMode = num42.intValue();
            }
            Integer num43 = this.user_period;
            if (num43 != null) {
                user.userPeriod = num43.intValue();
            }
            Boolean bool35 = this.is_effect_artist;
            if (bool35 != null) {
                user.isEffectArtist = bool35.booleanValue();
            }
            EffectArtistDetail effectArtistDetail = this.effect_detail;
            if (effectArtistDetail != null) {
                user.effectArtistDetail = effectArtistDetail;
            }
            CommercePermissionStruct commercePermissionStruct = this.commerce_permissions;
            if (commercePermissionStruct != null) {
                user.commercePermission = commercePermissionStruct;
            }
            StoryBlockInfo storyBlockInfo = this.life_story_block;
            if (storyBlockInfo != null) {
                user.storyBlockInfo = storyBlockInfo;
            }
            Integer num44 = this.hide_following_follower_list;
            if (num44 != null) {
                user.hideFollowingFollowerList = num44.intValue();
            }
            Boolean bool36 = this.has_unread_story;
            if (bool36 != null) {
                user.hasUnreadStory = bool36;
            }
            List<UrlModel> list6 = this.new_story_cover;
            if (list6 != null) {
                user.latestStoryCover = list6;
            }
            Integer num45 = this.user_story_count;
            if (num45 != null) {
                user.userStoryCount = num45.intValue();
            }
            Boolean bool37 = this.has_story;
            if (bool37 != null) {
                user.hasStory = bool37.booleanValue();
            }
            Boolean bool38 = this.is_star;
            if (bool38 != null) {
                user.isStar = bool38.booleanValue();
            }
            DouplusToastStruct douplusToastStruct = this.douplus_toast;
            if (douplusToastStruct != null) {
                user.douplusToast = douplusToastStruct;
            }
            String str42 = this.cv_level;
            if (str42 != null) {
                user.cvLevel = str42;
            }
            Integer num46 = this.creator_level;
            if (num46 != null) {
                user.creatorLevel = num46;
            }
            Boolean bool39 = this.is_mirror;
            if (bool39 != null) {
                user.isMirror = bool39;
            }
            Integer num47 = this.pr_exempt;
            if (num47 != null) {
                user.prExempt = num47;
            }
            List<Long> list7 = this.type_label;
            if (list7 != null) {
                user.typeLabels = list7;
            }
            Long l13 = this.avatar_decoration_id;
            if (l13 != null) {
                user.avatarDecorationId = l13;
            }
            Boolean bool40 = this.with_luban_entry;
            if (bool40 != null) {
                user.withLubanEntry = bool40.booleanValue();
            }
            List<UrlModel> list8 = this.ad_cover_url;
            if (list8 != null) {
                user.adCoverUrl = list8;
            }
            AdCoverTitle adCoverTitle = this.ad_cover_title;
            if (adCoverTitle != null) {
                user.adCoverTitle = adCoverTitle;
            }
            String str43 = this.ad_order_id;
            if (str43 != null) {
                user.adOrderId = str43;
            }
            RFansGroupInfo rFansGroupInfo = this.r_fans_group_info;
            if (rFansGroupInfo != null) {
                user.rFansGroupInfo = rFansGroupInfo;
            }
            Boolean bool41 = this.with_commerce_enterprise_tab_entry;
            if (bool41 != null) {
                user.withCommerceEnterpriseTabEntry = bool41.booleanValue();
            }
            HonorStruct honorStruct = this.honor_info;
            if (honorStruct != null) {
                user.honorStruct = honorStruct;
            }
            Integer num48 = this.comment_filter_status;
            if (num48 != null) {
                user.commentFilterStatus = num48.intValue();
            }
            Integer num49 = this.notify_private_account;
            if (num49 != null) {
                user.notifyPrivateAccount = num49.intValue();
            }
            UrlModel urlModel9 = this.avatar_168x168;
            if (urlModel9 != null) {
                user.avatar168x168 = urlModel9;
            }
            UrlModel urlModel10 = this.avatar_300x300;
            if (urlModel10 != null) {
                user.avatar300x300 = urlModel10;
            }
            Boolean bool42 = this.is_blocked;
            if (bool42 != null) {
                user.isBlocked = bool42.booleanValue();
            }
            Boolean bool43 = this.force_private_account;
            if (bool43 != null) {
                user.forcePrivateAccount = bool43.booleanValue();
            }
            Boolean bool44 = this.with_star_atlas_entry;
            if (bool44 != null) {
                user.withStarAtlasEntry = bool44.booleanValue();
            }
            HotSearchSprintStruct hotSearchSprintStruct = this.sprint_support_user_info;
            if (hotSearchSprintStruct != null) {
                user.sprintSupportUserInfo = hotSearchSprintStruct;
            }
            String str44 = this.signature_language;
            if (str44 != null) {
                user.signatureLanguage = str44;
            }
            BlueVBrandInfo blueVBrandInfo = this.brand_info;
            if (blueVBrandInfo != null) {
                user.brandInfo = blueVBrandInfo;
            }
            Boolean bool45 = this.display_wvalantine_activity_entry;
            if (bool45 != null) {
                user.displayWvalantineActivityEntry = bool45.booleanValue();
            }
            String str45 = this.shop_micro_app;
            if (str45 != null) {
                user.shopMicroApp = str45;
            }
            CommerceUserInfo commerceUserInfo = this.commerce_user_info;
            if (commerceUserInfo != null) {
                user.commerceUserInfo = commerceUserInfo;
            }
            List<RelationLabelUser> list9 = this.relative_users;
            if (list9 != null) {
                user.relativeUserInfos = list9;
            }
            QuickShopInfo quickShopInfo = this.quick_shop_info;
            if (quickShopInfo != null) {
                user.quickShopInfo = quickShopInfo;
            }
            String str46 = this.relation_label;
            if (str46 != null) {
                user.relationLabel = str46;
            }
            List<Challenge> list10 = this.cha_list;
            if (list10 != null) {
                user.challengeList = list10;
            }
            Boolean bool46 = this.is_minor;
            if (bool46 != null) {
                user.isMinor = bool46.booleanValue();
            }
            String str47 = this.sec_uid;
            if (str47 != null) {
                user.secUid = str47;
            }
            Double d = this.recommend_score;
            if (d != null) {
                user.recommendScore = d.doubleValue();
            }
            Integer num50 = this.wx_tag;
            if (num50 != null) {
                user.wxTag = num50.intValue();
            }
            Long l14 = this.open_insight_time;
            if (l14 != null) {
                user.openInsightTime = l14;
            }
            GeneralPermission generalPermission = this.general_permission;
            if (generalPermission != null) {
                user.mGeneralPermission = generalPermission;
            }
            Integer num51 = this.birthday_hide_level;
            if (num51 != null) {
                user.birthdayHideLevel = num51.intValue();
            }
            String str48 = this.bio_url;
            if (str48 != null) {
                user.bioUrl = str48;
            }
            String str49 = this.bio_email;
            if (str49 != null) {
                user.bioEmail = str49;
            }
            Long l15 = this.latest_order_time;
            if (l15 != null) {
                user.latestOrderTime = l15;
            }
            Boolean bool47 = this.is_pro_account;
            if (bool47 != null) {
                user.isProAccount = bool47.booleanValue();
            }
            Boolean bool48 = this.with_stick_entry;
            if (bool48 != null) {
                user.withStickEntry = bool48;
            }
            String str50 = this.email;
            if (str50 != null) {
                user.email = str50;
            }
            Boolean bool49 = this.is_email_verified;
            if (bool49 != null) {
                user.isEmailVerified = bool49.booleanValue();
            }
            String str51 = this.bio_secure_url;
            if (str51 != null) {
                user.bioSecureUrl = str51;
            }
            Integer num52 = this.collect_count;
            if (num52 != null) {
                user.collectCount = num52.intValue();
            }
            Boolean bool50 = this.nickname_update_reminder;
            if (bool50 != null) {
                user.nicknameUpdateReminder = bool50.booleanValue();
            }
            Boolean bool51 = this.avatar_update_reminder;
            if (bool51 != null) {
                user.avatarUpdateReminder = bool51.booleanValue();
            }
            Boolean bool52 = this.is_activity_user;
            if (bool52 != null) {
                user.isActivityUser = bool52.booleanValue();
            }
            String str52 = this.room_data;
            if (str52 != null) {
                user.roomData = str52;
            }
            UnReadVideoInfo unReadVideoInfo = this.video_unread_info;
            if (unReadVideoInfo != null) {
                user.unReadVideoInfo = unReadVideoInfo;
            }
            Boolean bool53 = this.is_life_style;
            if (bool53 != null) {
                user.lifeStyle = bool53.booleanValue();
            }
            Integer num53 = this.stitch_setting;
            if (num53 != null) {
                user.stitchSetting = num53;
            }
            Boolean bool54 = this.is_mix_user;
            if (bool54 != null) {
                user.isMixUser = bool54.booleanValue();
            }
            Boolean bool55 = this.show_favorite_list_on_item;
            if (bool55 != null) {
                user.showFavoriteListOnItem = bool55.booleanValue();
            }
            Integer num54 = this.signature_display_lines;
            if (num54 != null) {
                user.signatureDisplayLines = num54;
            }
            Long l16 = this.live_status;
            if (l16 != null) {
                user.liveStatus = l16.longValue();
            }
            Boolean bool56 = this.is_series_user;
            if (bool56 != null) {
                user.isSeriesUser = bool56;
            }
            RecommendTemplateStruct recommendTemplateStruct = this.recommend_template;
            if (recommendTemplateStruct != null) {
                user.recommendTemplate = recommendTemplateStruct;
            }
            Integer num55 = this.new_friend_type;
            if (num55 != null) {
                user.newFriendType = num55.intValue();
            }
            List<Integer> list11 = this.common_interest;
            if (list11 != null) {
                user.commonInterest = list11;
            }
            String str53 = this.mkey;
            if (str53 != null) {
                user.mkey = str53;
            }
            Integer num56 = this.online_status;
            if (num56 != null) {
                user.onlineStatus = num56.intValue();
            }
            Long l17 = this.last_active_time;
            if (l17 != null) {
                user.lastActiveTime = l17.longValue();
            }
            Long l18 = this.total_favorited_new;
            if (l18 != null) {
                user.totalFavoritedNew = l18.longValue();
            }
            RecommendReasonData recommendReasonData = this.recommend_reason_data;
            if (recommendReasonData != null) {
                user.recommendReasonData = recommendReasonData;
            }
            UserVirtualCharacterStruct userVirtualCharacterStruct = this.user_virtual_character;
            if (userVirtualCharacterStruct != null) {
                user.userVirtualCharacter = userVirtualCharacterStruct;
            }
            UserVirtualEmotionStruct userVirtualEmotionStruct = this.user_virtual_emotion;
            if (userVirtualEmotionStruct != null) {
                user.userVirtualEmotion = userVirtualEmotionStruct;
            }
            return user;
        }
    }

    public final String account_region(User user) {
        return user.accountRegion;
    }

    public final ActivityStruct activity(User user) {
        return user.activity;
    }

    public final AdCoverTitle ad_cover_title(User user) {
        return user.adCoverTitle;
    }

    public final List<UrlModel> ad_cover_url(User user) {
        return user.adCoverUrl;
    }

    public final String ad_order_id(User user) {
        return user.adOrderId;
    }

    public final Integer apple_account(User user) {
        return user.appleAccount;
    }

    public final UrlModel avatar_168x168(User user) {
        return user.avatar168x168;
    }

    public final UrlModel avatar_300x300(User user) {
        return user.avatar300x300;
    }

    public final AvatarDecoration avatar_decoration(User user) {
        return user.avatarDecoration;
    }

    public final Long avatar_decoration_id(User user) {
        return user.avatarDecorationId;
    }

    public final UrlModel avatar_larger(User user) {
        return user.avatarLarger;
    }

    public final UrlModel avatar_medium(User user) {
        return user.avatarMedium;
    }

    public final UrlModel avatar_pendant_larger(User user) {
        return user.avatarPendantLarger;
    }

    public final UrlModel avatar_pendant_medium(User user) {
        return user.avatarPendantMedium;
    }

    public final UrlModel avatar_pendant_thumb(User user) {
        return user.avatarPendantThumb;
    }

    public final UrlModel avatar_thumb(User user) {
        return user.avatarThumb;
    }

    public final String avatar_uri(User user) {
        return user.avatarUri;
    }

    public final String bind_phone(User user) {
        return user.bindPhone;
    }

    public final String bio_email(User user) {
        return user.bioEmail;
    }

    public final String bio_secure_url(User user) {
        return user.bioSecureUrl;
    }

    public final String bio_url(User user) {
        return user.bioUrl;
    }

    public final String birthday(User user) {
        return user.birthday;
    }

    public final BlueVBrandInfo brand_info(User user) {
        return user.brandInfo;
    }

    public final List<Challenge> cha_list(User user) {
        return user.challengeList;
    }

    public final String city(User user) {
        return user.cityName;
    }

    public final String college_name(User user) {
        return user.collegeName;
    }

    public final CommerceInfo commerce_info(User user) {
        return user.commerceInfo;
    }

    public final CommercePermissionStruct commerce_permissions(User user) {
        return user.commercePermission;
    }

    public final CommerceUserInfo commerce_user_info(User user) {
        return user.commerceUserInfo;
    }

    public final List<Integer> common_interest(User user) {
        return user.commonInterest;
    }

    public final String country(User user) {
        return user.country;
    }

    public final List<UrlModel> cover_url(User user) {
        return user.coverUrls;
    }

    public final Long create_time(User user) {
        return user.createTime;
    }

    public final Integer creator_level(User user) {
        return user.creatorLevel;
    }

    public final String custom_verify(User user) {
        return user.customVerify;
    }

    public final String cv_level(User user) {
        return user.cvLevel;
    }

    public final String district(User user) {
        return user.district;
    }

    public final DouplusToastStruct douplus_toast(User user) {
        return user.douplusToast;
    }

    public final Long download_prompt_ts(User user) {
        return user.downloadPromptTs;
    }

    public final EffectArtistDetail effect_detail(User user) {
        return user.effectArtistDetail;
    }

    public final String email(User user) {
        return user.email;
    }

    public final String enroll_year(User user) {
        return user.enrollYear;
    }

    public final String enterprise_verify_reason(User user) {
        return user.enterpriseVerifyReason;
    }

    public final List<FollowerDetail> followers_detail(User user) {
        return user.followerDetailList;
    }

    public final GeneralPermission general_permission(User user) {
        return user.mGeneralPermission;
    }

    public final List<String> geofencing(User user) {
        return user.geofencing;
    }

    public final String google_account(User user) {
        return user.googleAccount;
    }

    public final Boolean has_unread_story(User user) {
        return user.hasUnreadStory;
    }

    public final HonorStruct honor_info(User user) {
        return user.honorStruct;
    }

    public final String ins_id(User user) {
        return user.insId;
    }

    public final Boolean is_mirror(User user) {
        return user.isMirror;
    }

    public final Boolean is_series_user(User user) {
        return user.isSeriesUser;
    }

    public final Boolean is_verified(User user) {
        return user.isVerified;
    }

    public final String iso_country_code(User user) {
        return user.isoCountryCode;
    }

    public final List<RecommendAwemeItem> item_list(User user) {
        return user.recommendAwemeItems;
    }

    public final String language(User user) {
        return user.language;
    }

    public final Long latest_order_time(User user) {
        return user.latestOrderTime;
    }

    public final StoryBlockInfo life_story_block(User user) {
        return user.storyBlockInfo;
    }

    public final Integer live_agreement_time(User user) {
        return user.liveAgreementTime;
    }

    public final String location(User user) {
        return user.city;
    }

    public final String mkey(User user) {
        return user.mkey;
    }

    public final List<UrlModel> new_story_cover(User user) {
        return user.latestStoryCover;
    }

    public final String nickname(User user) {
        return user.nickname;
    }

    public final Long open_insight_time(User user) {
        return user.openInsightTime;
    }

    public final OriginalMusician original_musician(User user) {
        return user.originalMusician;
    }

    public final List<PlatformInfo> platform_sync_info(User user) {
        return user.platformInfos;
    }

    public final Integer pr_exempt(User user) {
        return user.prExempt;
    }

    public final String province(User user) {
        return user.province;
    }

    public final QuickShopInfo quick_shop_info(User user) {
        return user.quickShopInfo;
    }

    public final RFansGroupInfo r_fans_group_info(User user) {
        return user.rFansGroupInfo;
    }

    public final Integer react_setting(User user) {
        return user.reactSetting;
    }

    public final String recommend_reason(User user) {
        return user.recommendReason;
    }

    public final RecommendReasonData recommend_reason_data(User user) {
        return user.recommendReasonData;
    }

    public final String recommend_reason_relation(User user) {
        return user.recommendReasonRelation;
    }

    public final RecommendTemplateStruct recommend_template(User user) {
        return user.recommendTemplate;
    }

    public final Long reflow_page_gid(User user) {
        return user.reflowPageGid;
    }

    public final Long reflow_page_uid(User user) {
        return user.reflowPageUid;
    }

    public final String region(User user) {
        return user.region;
    }

    public final String relation_label(User user) {
        return user.relationLabel;
    }

    public final List<RelationLabelUser> relative_users(User user) {
        return user.relativeUserInfos;
    }

    public final String remark_name(User user) {
        return user.remarkName;
    }

    public final UrlModel room_cover(User user) {
        return user.roomCover;
    }

    public final String room_data(User user) {
        return user.roomData;
    }

    public final String room_type_tag(User user) {
        return user.roomTypeTag;
    }

    public final String school_name(User user) {
        return user.schoolName;
    }

    public final String school_poi_id(User user) {
        return user.schoolPoiId;
    }

    public final String sec_uid(User user) {
        return user.secUid;
    }

    public final ShareInfo share_info(User user) {
        return user.shareInfo;
    }

    public final String share_qrcode_uri(User user) {
        return user.shareQrcodeUri;
    }

    public final String shop_micro_app(User user) {
        return user.shopMicroApp;
    }

    public final String short_id(User user) {
        return user.shortId;
    }

    public final String signature(User user) {
        return user.signature;
    }

    public final Integer signature_display_lines(User user) {
        return user.signatureDisplayLines;
    }

    public final String signature_language(User user) {
        return user.signatureLanguage;
    }

    public final Integer special_lock(User user) {
        return user.specialLock;
    }

    public final HotSearchSprintStruct sprint_support_user_info(User user) {
        return user.sprintSupportUserInfo;
    }

    public final Integer status(User user) {
        return user.status;
    }

    public final Integer stitch_setting(User user) {
        return user.stitchSetting;
    }

    public final String third_name(User user) {
        return user.thirdName;
    }

    public final String twitter_id(User user) {
        return user.twitterId;
    }

    public final String twitter_name(User user) {
        return user.twitterName;
    }

    public final List<Long> type_label(User user) {
        return user.typeLabels;
    }

    public final String uid(User user) {
        return user.uid;
    }

    public final String unique_id(User user) {
        return user.uniqueId;
    }

    public final UserVirtualCharacterStruct user_virtual_character(User user) {
        return user.userVirtualCharacter;
    }

    public final UserVirtualEmotionStruct user_virtual_emotion(User user) {
        return user.userVirtualEmotion;
    }

    public final String verify_info(User user) {
        return user.verifyInfo;
    }

    public final UrlModel video_icon(User user) {
        return user.avatarVideoUri;
    }

    public final String video_icon_virtual_URI(User user) {
        return user.videoIconVirtualUri;
    }

    public final UnReadVideoInfo video_unread_info(User user) {
        return user.unReadVideoInfo;
    }

    public final String weibo_name(User user) {
        return user.weiboNickname;
    }

    public final String weibo_schema(User user) {
        return user.weiboSchema;
    }

    public final String weibo_url(User user) {
        return user.weiboUrl;
    }

    public final String weibo_verify(User user) {
        return user.weiboVerify;
    }

    public final Boolean with_stick_entry(User user) {
        return user.withStickEntry;
    }

    public final String youtube_channel_id(User user) {
        return user.youtubeChannelId;
    }

    public final String youtube_channel_title(User user) {
        return user.youtubeChannelTitle;
    }

    public final Boolean accept_private_policy(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 50);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.acceptPrivatePolicy);
    }

    public final Integer allow_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.allowStatus);
    }

    public final Long authority_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.authorityStatus);
    }

    public final Boolean avatar_update_reminder(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.avatarUpdateReminder);
    }

    public final Integer aweme_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.awemeCount);
    }

    public final Integer birthday_hide_level(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 96);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.birthdayHideLevel);
    }

    public final Boolean can_modify_school_info(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 76);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.canModifySchoolInfo);
    }

    public final Integer collect_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 99);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.collectCount);
    }

    public final Integer comment_filter_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 87);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.commentFilterStatus);
    }

    public final Integer comment_setting(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 60);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.commentSetting);
    }

    public final Integer commerce_user_level(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 37);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.commerceUserLevel);
    }

    public final Integer constellation(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.constellation);
    }

    public final Boolean display_wvalantine_activity_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 92);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.displayWvalantineActivityEntry);
    }

    public final Integer dongtai_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 55);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.dongtai_count);
    }

    public final Integer dou_plus_share_location(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 68);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.douPlusShareLocation);
    }

    public final Integer download_setting(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 65);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.downloadSetting);
    }

    public final Integer duet_setting(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 61);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.duetSetting);
    }

    public final Integer education(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 75);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.education);
    }

    public final Integer favoriting_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.favoritingCount);
    }

    public final Long fb_expire_time(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.fbExpireTime);
    }

    public final Integer follow_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.followStatus);
    }

    public final Integer follower_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.followerCount);
    }

    public final Integer follower_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 58);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.followerStatus);
    }

    public final Integer following_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.followingCount);
    }

    public final Boolean force_private_account(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 90);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.forcePrivateAccount);
    }

    public final Integer gender(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.gender);
    }

    public final Boolean has_activity_medal(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 35);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hasMedal);
    }

    public final Boolean has_email(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 53);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hasEmail);
    }

    public final Boolean has_facebook_token(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hasFacebookToken);
    }

    public final Boolean has_insights(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 69);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isCreater);
    }

    public final Boolean has_orders(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 42);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hasOrders);
    }

    public final Boolean has_story(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 83);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hasStory);
    }

    public final Boolean has_twitter_token(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hasTwitterToken);
    }

    public final Boolean has_youtube_token(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hasYoutubeToken);
    }

    public final Integer hide_following_follower_list(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 81);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.hideFollowingFollowerList);
    }

    public final Boolean hide_location(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hideCity);
    }

    public final Boolean hide_search(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.hideSearch);
    }

    public final Boolean is_activity_user(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 102);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isActivityUser);
    }

    public final Boolean is_ad_fake(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 32);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isAdFake);
    }

    public final Boolean is_binded_weibo(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isBindedWeibo);
    }

    public final Boolean is_block(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isBlock);
    }

    public final Boolean is_blocked(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 89);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isBlocked);
    }

    public final Boolean is_discipline_member(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 40);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isDisciplineMember);
    }

    public final Boolean is_effect_artist(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 80);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isEffectArtist);
    }

    public final Boolean is_email_verified(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 98);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isEmailVerified);
    }

    public final Boolean is_flowcard_member(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 64);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isFlowcardMember);
    }

    public final Boolean is_gov_media_vip(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 54);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.mIsGovMediaVip);
    }

    public final Boolean is_life_style(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 103);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.lifeStyle);
    }

    public final Boolean is_minor(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 93);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isMinor);
    }

    public final Boolean is_mix_user(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 104);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isMixUser);
    }

    public final Boolean is_phone_binded(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 48);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isPhoneBinded);
    }

    public final Boolean is_pro_account(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 97);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isProAccount);
    }

    public final Boolean is_star(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 84);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.isStar);
    }

    public final Long last_active_time(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 109);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.lastActiveTime);
    }

    public final Integer live_agreement(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 38);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.liveAgreement);
    }

    public final Boolean live_commerce(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 66);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.liveCommerce);
    }

    public final Long live_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 106);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.liveStatus);
    }

    public final Integer live_verify(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.verifyStatus);
    }

    public final Integer login_platform(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 49);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.loginPlatform);
    }

    public final Integer mplatform_followers_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 34);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.fansCount);
    }

    public final Integer need_recommend(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.needRecommend);
    }

    public final Integer neiguang_shield(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 59);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.neiguangShield);
    }

    public final Integer new_friend_type(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 107);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.newFriendType);
    }

    public final Boolean nickname_update_reminder(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 100);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.nicknameUpdateReminder);
    }

    public final Integer notify_private_account(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 88);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.notifyPrivateAccount);
    }

    public final Integer online_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 108);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.onlineStatus);
    }

    public final Boolean prevent_download(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 43);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.preventDownload);
    }

    public final Integer profile_tab_type(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 70);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.tabType);
    }

    public final Integer realname_verify_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 51);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.verifyStatus);
    }

    public final Double recommend_score(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 94);
        if (proxy.isSupported) {
            return (Double) proxy.result;
        }
        return Double.valueOf(user.recommendScore);
    }

    public final Long register_time(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 56);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.registerTime);
    }

    public final Long room_id(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.roomId);
    }

    public final Integer school_type(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 29);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.schoolType);
    }

    public final Integer school_visible(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 77);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.schoolInfoShowRange);
    }

    public final Integer secret(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 41);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.secret);
    }

    public final Integer shield_comment_notice(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.shieldCommentNotice);
    }

    public final Integer shield_digg_notice(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 27);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.shieldDiggNotice);
    }

    public final Integer shield_follow_notice(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.shieldFollowNotice);
    }

    public final Boolean show_favorite_list_on_item(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 105);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.showFavoriteListOnItem);
    }

    public final Integer show_gender_strategy(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 67);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.showGenderStrategy);
    }

    public final Boolean show_image_bubble(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 44);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.showImageBubble);
    }

    public final Integer star_billboard_rank(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 74);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.starBillboardRank);
    }

    public final Boolean star_use_new_download(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 33);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.starUseNewDownload);
    }

    public final Integer story_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.storyCount);
    }

    public final Boolean story_open(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.storyOpen);
    }

    public final Integer sync_to_toutiao(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 36);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.isSyncToutiao);
    }

    public final Long total_favorited(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.totalFavorited);
    }

    public final Long total_favorited_new(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 110);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.totalFavoritedNew);
    }

    public final Long tw_expire_time(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.twExpireTime);
    }

    public final Long unique_id_modify_time(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 45);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.unique_id_modify_time);
    }

    public final Boolean user_canceled(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 52);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.userCancelled);
    }

    public final Integer user_mode(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 78);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.userMode);
    }

    public final Integer user_period(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 79);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.userPeriod);
    }

    public final Integer user_rate(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 62);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.userRate);
    }

    public final Integer user_story_count(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 82);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.userStoryCount);
    }

    public final Integer verification_type(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 31);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.verificationType);
    }

    public final Boolean watch_status(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 71);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.watchStatus);
    }

    public final Boolean with_commerce_enterprise_tab_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 86);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withCommerceEnterpriseTabEntry);
    }

    public final Boolean with_commerce_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 30);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withCommerceEntry);
    }

    public final Boolean with_commerce_newbie_task(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 72);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withCommerceNewbieTask);
    }

    public final Boolean with_dou_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 46);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withDouEntry);
    }

    public final Boolean with_douplus_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 57);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withDouplusEntry);
    }

    public final Boolean with_fusion_shop_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 47);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withFusionShopEntry);
    }

    public final Boolean with_item_commerce_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 73);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withItemCommerceEntry);
    }

    public final Boolean with_luban_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 85);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withLubanEntry);
    }

    public final Boolean with_new_goods(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 63);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withNewGoods);
    }

    public final Boolean with_shop_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 39);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withShopEntry);
    }

    public final Boolean with_star_atlas_entry(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 91);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(user.withStarAtlasEntry);
    }

    public final Integer wx_tag(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 95);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(user.wxTag);
    }

    public final Long youtube_expire_time(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        return Long.valueOf(user.youtubeExpireTime);
    }
}
