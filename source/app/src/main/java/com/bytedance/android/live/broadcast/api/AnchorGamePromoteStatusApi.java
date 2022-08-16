package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdkapi.depend.model.live.C9500b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface AnchorGamePromoteStatusApi {
    static {
        Covode.recordClassIndex(14380);
    }

    @AbstractC102307QQr(LIZ = "preview")
    @GET("/webcast/gamecp/promotion/games/")
    Observable<AbstractC100834PnQ<C9500b>> getGamePromoteStatus();

    @GET("/webcast/gamecp/anchor/promotion_games/")
    Observable<AbstractC100834PnQ<C2874a>> getPromoteGameList(@Query("category") Long l);

    @AbstractC102307QQr(LIZ = "preview")
    @FormUrlEncoded
    @POST("/webcast/gamecp/page/set_status/")
    Observable<C5176i<Object>> setGamePromoteStatus(@Field("set_type") String str);

    @GET("/webcast/gamecp/anchor/multi_stop_promotion/")
    Observable<AbstractC100834PnQ<Object>> stopGamePromotion(@Query("game_ids") String str);
}
