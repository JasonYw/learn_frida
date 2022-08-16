package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C3158d;
import com.bytedance.android.live.broadcast.model.C3161g;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface BroadcastGameApi {
    static {
        Covode.recordClassIndex(14384);
    }

    @AbstractC102307QQr(LIZ = "live_game")
    @POST("/webcast/interact/draw_something/finish/")
    Observable<C5176i<Object>> finishDrawGame(@Query("room_id") long j, @Query("draw_something_id") long j2, @Query("is_cut_short") boolean z);

    @AbstractC102307QQr(LIZ = "live_game")
    @GET("/webcast/interact/draw_something/word_list/")
    Observable<C5176i<C3161g>> getBroadcastDrawWords(@Query("room_id") long j);

    @POST("/webcast/interact/draw_something/start_again/")
    Observable<C5176i<C3158d>> reStartDrawGame(@Query("room_id") long j, @Query("word") String str);

    @AbstractC102307QQr(LIZ = "live_game")
    @POST("/webcast/interact/draw_something/start/")
    Observable<C5176i<C3158d>> startDrawGame(@Query("room_id") long j, @Query("word") String str);
}
