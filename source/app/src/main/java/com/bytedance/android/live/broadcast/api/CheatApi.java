package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.bgbroadcast.game.sensor_data.model.ScreenShotCheatDetectResponse;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface CheatApi {
    static {
        Covode.recordClassIndex(14389);
    }

    @FormUrlEncoded
    @POST("/webcast/room/screenshot_cheat_detect/")
    Observable<C5176i<ScreenShotCheatDetectResponse>> flushSensorData(@Field("data") String str);
}
