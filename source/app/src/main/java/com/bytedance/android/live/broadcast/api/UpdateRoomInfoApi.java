package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.C2900af;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface UpdateRoomInfoApi {
    static {
        Covode.recordClassIndex(14411);
    }

    @FormUrlEncoded
    @POST("/webcast/room/update_room_info/")
    Observable<C2900af> updateRoomInfo(@Field("room_id") long j, @Field("poi_id") long j2);

    @FormUrlEncoded
    @POST("/webcast/room/update_room_info/")
    Observable<C2900af> updateRoomInfo(@Field("room_id") long j, @Field("cover_uri") String str, @Field("gift_auth") int i, @Field("chat_auth") int i2, @Field("share_auth") int i3);
}
