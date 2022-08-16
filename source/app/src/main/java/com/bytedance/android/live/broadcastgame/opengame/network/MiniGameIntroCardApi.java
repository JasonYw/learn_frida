package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.live.broadcastgame.opengame.network.model.C3579j;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3580k;
import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface MiniGameIntroCardApi {
    static {
        Covode.recordClassIndex(20335);
    }

    @GET("/webcast/stamp/game_card_info/")
    Observable<AbstractC100834PnQ<C3579j>> getIntroCardInfo(@Query("room_id") long j);

    @GET("/webcast/stamp/game_card_status/")
    Observable<AbstractC100834PnQ<C3580k>> getMiniGameIntroCardStatus(@Query("app_id") String str, @Query("room_id") long j);

    @FormUrlEncoded
    @POST("/webcast/stamp/game_card_status_update/")
    Observable<AbstractC5172c> updateGameCardStatus(@Field("app_id") String str, @Field("room_id") long j, @Field("display_status") int i);
}
