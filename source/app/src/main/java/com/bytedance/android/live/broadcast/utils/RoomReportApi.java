package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface RoomReportApi {
    static {
        Covode.recordClassIndex(17970);
    }

    @FormUrlEncoded
    @POST("/webcast/room/event_report/")
    Observable<C5176i<Object>> roomEventReport(@Field("item_type") int i, @Field("item_id") long j, @Field("event_scene_type") int i2, @Field("room_id") long j2, @Field("extra") String str);
}
