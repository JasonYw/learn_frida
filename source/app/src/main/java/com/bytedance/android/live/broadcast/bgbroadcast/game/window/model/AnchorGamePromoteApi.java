package com.bytedance.android.live.broadcast.bgbroadcast.game.window.model;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface AnchorGamePromoteApi {
    static {
        Covode.recordClassIndex(14911);
    }

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/gamecp/anchor/promotion_games/")
    Observable<C5176i<C2951b>> getPromoteGameList(@Query("room_id") String str);

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/gamecp/anchor/start_introduce/")
    Observable<C5176i<C2951b>> startPromoteIntroduce(@Query("room_id") String str, @Query("game_id") String str2);

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/gamecp/anchor/start_prop_introduce/")
    Observable<C5176i<C2955f>> startPropIntroduce(@Query("prop_id") String str, @Query("prop_sku_id") Long l, @Query("game_id") String str2, @Query("room_id") Long l2);

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/gamecp/anchor/reserve/start_introduce/")
    Observable<C5176i<C2951b>> startReservePromoteIntroduce(@Query("room_id") String str, @Query("game_id") String str2);

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/gamecp/anchor/stop_introduce/")
    Observable<C5176i<C2951b>> stopPromoteIntroduce(@Query("room_id") String str, @Query("game_id") String str2);

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/gamecp/anchor/stop_prop_introduce/")
    Observable<C5176i<C2956g>> stopPropIntroduce(@Query("prop_id") String str, @Query("prop_sku_id") Long l, @Query("game_id") String str2, @Query("room_id") Long l2);

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/gamecp/anchor/reserve/stop_introduce/")
    Observable<C5176i<C2951b>> stopReservePromoteIntroduce(@Query("room_id") String str, @Query("game_id") String str2);
}
