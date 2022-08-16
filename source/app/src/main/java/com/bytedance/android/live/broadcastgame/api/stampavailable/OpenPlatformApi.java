package com.bytedance.android.live.broadcastgame.api.stampavailable;

import com.bytedance.android.live.broadcastgame.api.model.C3374af;
import com.bytedance.android.live.broadcastgame.api.model.p287a.C3364a;
import com.bytedance.android.live.broadcastgame.api.model.p287a.C3365b;
import com.bytedance.android.live.broadcastgame.api.model.p287a.C3366c;
import com.bytedance.android.live.broadcastgame.api.model.p287a.C3367d;
import com.bytedance.android.live.broadcastgame.api.model.p287a.C3368e;
import com.bytedance.android.live.broadcastgame.api.model.p287a.C3370f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes12.dex */
public interface OpenPlatformApi {
    static {
        Covode.recordClassIndex(19253);
    }

    @GET("/webcast/stamp/memory_ability/status/")
    Observable<AbstractC100834PnQ<C3365b>> getMemoryAbility();

    @GET("/webcast/stamp/memory_ability/get_memory")
    Observable<AbstractC100834PnQ<C3364a>> getMemoryData();

    @GET("/webcast/stamp/micro_app_entrance_permission/")
    Observable<AbstractC100834PnQ<C3368e>> requestEntrancePermission();

    @POST("/webcast/stamp/intro_panel_finished")
    Observable<AbstractC100834PnQ<C3370f>> requestIntroPanelFinished();

    @FormUrlEncoded
    @POST("/webcast/stamp/memory/available/")
    Observable<AbstractC100834PnQ<C3374af>> requestStampAvailable(@Field("stamps_json") String str);

    @FormUrlEncoded
    @POST("/webcast/stamp/memory_ability/set_memory/")
    Observable<AbstractC100834PnQ<C3366c>> setMemoryData(@Field("cache_data") String str);

    @POST("/webcast/stamp/memory_ability/update_status/")
    Observable<AbstractC100834PnQ<C3367d>> updateMemoryAbility(@Query("remember") boolean z);
}
