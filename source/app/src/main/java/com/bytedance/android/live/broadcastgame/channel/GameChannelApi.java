package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import kotlin.Unit;

/* loaded from: classes5.dex */
public interface GameChannelApi {
    static {
        Covode.recordClassIndex(19358);
    }

    @POST("/webcast/game/status/enter/")
    Observable<C5176i<C3434o>> getStatusMessage(@Query("room_id") long j, @Query("game_id") long j2, @Query("kind") long j3, @Query("status") long j4, @Query("reload") long j5);

    @FormUrlEncoded
    @POST("/webcast/game/channel/send_by_audience/")
    Observable<C5176i<Unit>> sendMsgToAnchor(@Field("room_id") long j, @Field("game_id") long j2, @Field("anchor_id") long j3, @Field("send_type") long j4, @Field("extra") String str);

    @FormUrlEncoded
    @POST("/webcast/game/channel/send_by_anchor/")
    Observable<C5176i<Unit>> sendMsgToAudience(@Field("room_id") long j, @Field("game_id") long j2, @Field("message_type") long j3, @Field("send_type") long j4, @Field("extra") String str, @Field("scene") int i);
}
