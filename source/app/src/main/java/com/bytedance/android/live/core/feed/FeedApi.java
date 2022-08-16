package com.bytedance.android.live.core.feed;

import com.bytedance.android.live.base.model.feed.C2827a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.C5169a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import io.reactivex.Observable;
import java.util.Map;
import p003X.AbstractC102307QQr;

/* loaded from: classes8.dex */
public interface FeedApi {
    static {
        Covode.recordClassIndex(23449);
    }

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> drawerFeed(@Url String str, @Query("max_time") long j, @Query("enter_source") String str2, @QueryMap Map<String, Object> map);

    @AbstractC102307QQr(LIZ = "feed")
    @GET("/webcast/feed/")
    Observable<C5169a<FeedItem, C2827a>> feed(@Query("is_draw") long j, @Query("draw_room_id") long j2, @Query("max_time") long j3, @Query("need_map") long j4, @Query("source_key") String str, @Query("action_type") String str2, @Query("relevant_category") int i, @Query("enter_source") String str3, @Query("white_cate_first_level_tag_id") long j5);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("is_draw") long j2, @Query("draw_room_id") long j3);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("is_draw") long j2, @Query("draw_room_id") long j3, @Query("draw_room_owner_id") long j4, @Query("episode_id") long j5, @Query("enter_source") String str3, @Query("offset") long j6, @Query("offset_type") int i, @Query("episode_id_list") String str4, @Query("inner_outer_same") boolean z);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("is_draw") long j2, @Query("draw_room_id") long j3, @Query("draw_room_owner_id") long j4, @Query("enter_source") String str3);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("is_draw") long j2, @Query("draw_room_id") long j3, @Query("draw_room_owner_id") long j4, @Query("enter_source") String str3, @Query("exempt_impression_gid_list") String str4, @QueryMap Map<String, Object> map);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("is_draw") long j2, @Query("draw_room_id") long j3, @Query("draw_room_owner_id") long j4, @Query("enter_source") String str3, @Query("exempt_impression_gid_list") String str4, @QueryMap Map<String, Object> map, @Query("follow_group_id") long j5, @Query("follow_group_type") long j6);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("enter_source") String str3);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("enter_source") String str3, @Query("draw_room_tag_id") long j2);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("enter_source") String str3, @Query("offset") long j2, @Query("offset_type") int i, @Query("time_zone_offset") long j3);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("enter_source") String str3, @Query("offset") long j2, @Query("offset_type") int i, @Query("time_zone_offset") long j3, @Query("draw_room_tag_id") long j4);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("enter_source") String str3, @QueryMap Map<String, Object> map);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> feed(@Url String str, @Query("max_time") long j, @Query("enter_source") String str2, @QueryMap Map<String, Object> map);

    @AbstractC102307QQr(LIZ = "feed")
    @GET
    Observable<C5169a<FeedItem, C2827a>> newFeed(@Url String str, @Query("max_time") long j, @Query("req_from") String str2, @Query("offset") long j2);
}
