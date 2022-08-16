package com.bytedance.android.live.broadcast.preview.api;

import com.bytedance.android.live.broadcast.api.model.C2903am;
import com.bytedance.android.live.broadcast.api.model.C2904an;
import com.bytedance.android.live.broadcast.api.model.C2905ao;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import p003X.AbstractC102307QQr;

/* loaded from: classes3.dex */
public interface StartLiveVisibilityApi {
    static {
        Covode.recordClassIndex(17203);
    }

    @AbstractC102307QQr(LIZ = "preview")
    @GET("/webcast/user/visible/cancel/")
    Observable<C5176i<Object>> cancelVisibilityUser(@Query("invisible_uids") String str, @Query("visible_uids") String str2, @Query("op_user") long j);

    @AbstractC102307QQr(LIZ = "preview")
    @GET("/webcast/user/follow/list/")
    Observable<C5176i<C2904an>> getFollowList(@Query("cursor") long j, @Query("count") int i, @Query("follow_type") int i2);

    @AbstractC102307QQr(LIZ = "preview")
    @GET("/webcast/user/friend/list/")
    Observable<C5176i<C2905ao>> getFriendsList(@Query("cursor") long j, @Query("count") int i);

    @AbstractC102307QQr(LIZ = "preview")
    @GET("/webcast/user/visible/list/")
    Observable<C5176i<C2903am>> getVisibleList(@Query("offset") int i, @Query("count") int i2, @Query("relation_type") int i3, @Query("user_sence") String str);

    @AbstractC102307QQr(LIZ = "preview")
    @FormUrlEncoded
    @POST("/webcast/room/update_setting/")
    Observable<C5176i<Object>> updateVisibilityType(@Field("setting_key") int i, @Field("visibility_range") int i2);

    @AbstractC102307QQr(LIZ = "preview")
    @GET("/webcast/user/visible/update/")
    Observable<C5176i<Object>> updateVisibilityUser(@Query("invisible_uids") String str, @Query("visible_uids") String str2, @Query("op_user") long j);
}
