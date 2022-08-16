package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.ScreenChatSettingGetResponse;
import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import kotlin.Unit;
import p003X.AbstractC102307QQr;

/* loaded from: classes12.dex */
public interface LivePrivilegeSettingApi {
    static {
        Covode.recordClassIndex(14404);
    }

    @AbstractC102307QQr(LIZ = "preview")
    @POST("/webcast/privilege/screen_chat/setting/get/")
    Observable<C5176i<ScreenChatSettingGetResponse>> getPrivilegeBarrageSetting();

    @GET("/webcast/privilege/subscribe/buy_switch")
    Observable<AbstractC5172c> setBuyVIPSetting(@Query("switch") int i);

    @AbstractC102307QQr(LIZ = "preview")
    @POST("/webcast/privilege/screen_chat/setting/set/")
    Observable<C5176i<Unit>> setPrivilegeBarrageSetting(@Query("allow") boolean z, @Query("follow_type") int i, @Query("fansclub_type") int i2, @Query("active_type") int i3);
}
