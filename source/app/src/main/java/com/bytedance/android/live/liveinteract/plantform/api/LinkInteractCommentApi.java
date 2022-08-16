package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.interact.model.C6067w;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Single;

/* loaded from: classes3.dex */
public interface LinkInteractCommentApi {
    static {
        Covode.recordClassIndex(29189);
    }

    @GET("/webcast/interaction/intercom/close/")
    Single<C5176i<C6067w>> intercomClose(@Query("room_id") long j, @Query("channel_id") long j2);

    @GET("/webcast/interaction/intercom/invite/")
    Single<C5176i<C6067w>> intercomInvite(@Query("room_id") long j, @Query("channel_id") long j2);

    @GET("/webcast/interaction/intercom/reply/")
    Single<C5176i<C6067w>> intercomReply(@Query("room_id") long j, @Query("channel_id") long j2, @Query("reply_status") int i, @Query("always_reject") boolean z);
}
