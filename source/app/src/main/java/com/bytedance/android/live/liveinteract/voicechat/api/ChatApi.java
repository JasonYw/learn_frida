package com.bytedance.android.live.liveinteract.voicechat.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.C6192s;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Single;

/* loaded from: classes3.dex */
public interface ChatApi {
    static {
        Covode.recordClassIndex(30869);
    }

    @GET("/webcast/linkmic_audience/fast_match/")
    Single<C5176i<C6192s>> cityFastMatch(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("is_manual") boolean z, @Query("re_match") boolean z2, @Query("match_type") int i, @Query("match_scene") int i2, @Query("city_code") int i3);

    @GET("/webcast/linkmic_audience/fast_match/")
    Single<C5176i<C6192s>> fastMatch(@Query("room_id") long j, @Query("anchor_id") long j2, @Query("is_manual") boolean z, @Query("re_match") boolean z2, @Query("match_type") int i);
}
