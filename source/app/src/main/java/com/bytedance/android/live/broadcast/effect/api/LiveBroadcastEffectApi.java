package com.bytedance.android.live.broadcast.effect.api;

import com.bytedance.android.live.broadcast.model.C3164k;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface LiveBroadcastEffectApi {
    static {
        Covode.recordClassIndex(15741);
    }

    @GET("/webcast/activity/room_head_effect_heart_beat/")
    Observable<C5176i<C3164k>> sendStickerStatus(@Query("effect_id") long j, @Query("heartbeat_id") String str, @Query("canceled") boolean z);

    @FormUrlEncoded
    @POST("/webcast/room/internal_ci_info/")
    Observable<C5176i<Void>> uploadBeautyParams(@Field("room_id") long j, @Field("filter_name") String str, @Field("whitening") int i, @Field("beauty_skin") int i2, @Field("big_eyes") int i3, @Field("face_lift") int i4, @Field("use_filter") boolean z, @Field("commerce_use_filter") boolean z2);
}
