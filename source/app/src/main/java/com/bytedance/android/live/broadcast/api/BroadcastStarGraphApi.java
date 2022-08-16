package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.C2912i;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.List;

/* loaded from: classes3.dex */
public interface BroadcastStarGraphApi {
    static {
        Covode.recordClassIndex(14387);
    }

    @GET("/webcast/game/commerce/star_status/")
    Observable<C5176i<C2912i>> getAnchorStarStatusRequest(@Query("anchor_id") long j, @Query("live_room_mode") long j2);

    @FormUrlEncoded
    @POST("/webcast/game/commerce/star_open/")
    Observable<C5176i<Object>> setAnchorStarOpenRequest(@Field("anchor_id") long j, @Field("set_type") int i, @Field("star_status") int i2, @Field("star_tasks") List<String> list, @Field("live_room_mode") long j2);
}
