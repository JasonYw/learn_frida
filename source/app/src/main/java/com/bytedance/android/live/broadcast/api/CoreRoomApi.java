package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.CounteractInfo;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface CoreRoomApi {
    static {
        Covode.recordClassIndex(14391);
    }

    @GET("/webcast/room/ending_counteract_info/")
    Observable<C5176i<CounteractInfo>> fetchEndingBlockingStrategy(@Query("room_id") long j);

    @GET("/webcast/room/auditing/info/")
    Observable<C5176i<WaitingReviewInfo>> getReviewInfo(@Query("room_id") long j);

    @FormUrlEncoded
    @POST("/webcast/room/event_report/")
    Observable<C5176i<Object>> roomEventReport(@Field("item_type") int i, @Field("item_id") long j, @Field("event_scene_type") int i2, @Field("room_id") long j2, @Field("extra") String str);

    @FormUrlEncoded
    @POST("/webcast/room/update_location_info/")
    Observable<C5176i<Void>> updateLocationInfo(@Field("room_id") long j);
}
