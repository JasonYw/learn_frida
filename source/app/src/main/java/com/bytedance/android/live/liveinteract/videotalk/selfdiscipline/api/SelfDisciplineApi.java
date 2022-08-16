package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6146ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC100834PnQ;

/* loaded from: classes3.dex */
public interface SelfDisciplineApi {
    static {
        Covode.recordClassIndex(30399);
    }

    @GET("/webcast/linkmic_audience/get_play_mode_info/")
    Observable<AbstractC100834PnQ<C6146ac>> getPlayModeInfo(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/self_discipline_config/")
    Observable<C5176i<Object>> setStatus(@Query("room_id") long j, @Query("switch_status") int i, @Query("target") String str);
}
