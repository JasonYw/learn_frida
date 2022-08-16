package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.interact.UpdateLinkTypeApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.UpdateLinkTypeReplyResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Single;

/* loaded from: classes3.dex */
public interface LinkCameraApi {
    static {
        Covode.recordClassIndex(29187);
    }

    @GET("/webcast/linkmic_audience/update_link_type/apply/")
    Single<C5176i<UpdateLinkTypeApplyResponse>> updateLinkTypeApply(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("link_type") int i, @Query("is_chorus") boolean z);

    @GET("/webcast/linkmic_audience/update_link_type/reply/")
    Single<C5176i<UpdateLinkTypeReplyResponse>> updateLinkTypeReply(@Query("room_id") long j, @Query("to_user_id") long j2, @Query("reply_type") int i);
}
