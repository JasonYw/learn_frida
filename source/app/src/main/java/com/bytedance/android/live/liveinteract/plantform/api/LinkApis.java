package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.liveinteract.api.data.C4282c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.C6130bj;
import com.bytedance.android.livesdk.chatroom.model.SyncStreamInfoReqBean;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import io.reactivex.Single;
import p003X.AbstractC445823kG;

/* loaded from: classes3.dex */
public interface LinkApis {
    static {
        Covode.recordClassIndex(29185);
    }

    @GET("/webcast/linkmic_audience/degrade_alert/")
    Observable<String> degradeAlertRequest(@Query("room_id") long j, @Query("degrade_alert_content") String str);

    @GET("/webcast/linkmic_audience/galileo/")
    Observable<C5176i<C4282c>> galileoParamsRequest();

    @GET("/webcast/linkmic_audience/init/v2/")
    Single<C5176i<LinkInitResult>> initV2(@Query("room_id") long j, @Query("linkmic_vendor") int i, @Query("linkmic_layout") int i2, @Query("passive_start") boolean z, @Query("scene") int i3, @Query("supported_scenes") String str, @Query("source") int i4);

    @GET("/webcast/linkmic_audience/init/v2/")
    Single<C5176i<LinkInitResult>> initV2(@Query("room_id") long j, @Query("linkmic_vendor") int i, @Query("linkmic_layout") int i2, @Query("passive_start") boolean z, @Query("scene") int i3, @Query("supported_scenes") String str, @Query("source") int i4, @Query("ui_layout") int i5, @Query("init_type") int i6);

    @GET("/webcast/linkmic_audience/init/v2/")
    Single<C5176i<LinkInitResult>> initV2(@Query("room_id") long j, @Query("linkmic_vendor") int i, @Query("passive_start") boolean z, @Query("scene") int i2, @Query("supported_scenes") String str);

    @AbstractC445823kG(LIZ = 10003)
    @POST("/webcast/im/send_sync_stream_info/")
    Observable<C5176i<C6130bj>> sendSyncStreamInfoRequest(@Body SyncStreamInfoReqBean syncStreamInfoReqBean);
}
