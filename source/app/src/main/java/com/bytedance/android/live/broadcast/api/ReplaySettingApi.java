package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.C2923z;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes12.dex */
public interface ReplaySettingApi {
    static {
        Covode.recordClassIndex(14406);
    }

    @GET("/webcast/room/replay/setting/")
    Observable<C5176i<C2923z>> getSettingInfo();

    @FormUrlEncoded
    @POST("/webcast/room/replay/setting_update/")
    Observable<C5176i<C2923z>> updateSetting(@Field("replay_switch") int i, @Field("enabled") boolean z);

    @FormUrlEncoded
    @POST("/webcast/room/replay/setting_update/")
    Observable<C5176i<C2923z>> updateSetting(@Field("replay_switch") int i, @Field("enabled") boolean z, @Field("room_id") long j);
}
