package com.bytedance.android.live.broadcast.filter.message.api;

import com.bytedance.android.live.broadcast.filter.message.p265a.C3011e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface MsgFilterApi {
    static {
        Covode.recordClassIndex(15809);
    }

    @GET("/webcast/room/get_msg_filter/")
    Observable<C5176i<C3011e>> requestMsgFilter(@Query("room_id") long j);

    @POST("/webcast/room/set_msg_filter/")
    Observable<C5176i<Object>> updateMsgFilter(@Query("room_id") long j, @Query("fans_club_level") int i, @Query("user_level") int i2, @Query("consume_total") int i3, @Query("gift_amount") int i4, @Query("only_see_fans") boolean z, @Query("only_see_send_gift") boolean z2);
}
