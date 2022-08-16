package com.bytedance.android.live.effect.network;

import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes5.dex */
public interface CommodityNoFilterApi {
    static {
        Covode.recordClassIndex(24570);
    }

    @FormUrlEncoded
    @POST("/webcast/room/update_setting/")
    Observable<AbstractC5172c> updateSetting(@Field("setting_key") int i, @Field("commodity_no_filter") int i2);
}
