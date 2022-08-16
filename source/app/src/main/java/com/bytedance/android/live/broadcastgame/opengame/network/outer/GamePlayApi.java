package com.bytedance.android.live.broadcastgame.opengame.network.outer;

import com.bytedance.android.live.broadcastgame.opengame.network.model.C3573e;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3577h;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3582m;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface GamePlayApi {
    static {
        Covode.recordClassIndex(20466);
    }

    @GET("/webcast/gameplay/applet/collection/remove/")
    Observable<AbstractC100834PnQ<C3573e>> cancelCollectGame(@Query("app_id") String str, @Query("game_id") Long l);

    @GET("/webcast/gameplay/applet/collection/add/")
    Observable<AbstractC100834PnQ<C3577h>> collectGame(@Query("app_id") String str, @Query("game_id") Long l);

    @GET("/webcast/gameplay/applet/user/info/")
    Observable<AbstractC100834PnQ<C3582m.C3583a>> fetchCollectStatus(@Query("app_id") String str, @Query("game_id") Long l);
}
