package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.C2909e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes12.dex */
public interface ChoosePVCountApi {
    static {
        Covode.recordClassIndex(14390);
    }

    @FormUrlEncoded
    @POST("/webcast/room/update_setting/")
    Observable<C5176i<C2909e>> updateSetting(@Field("setting_key") int i, @Field("audience_display_type") int i2);
}
