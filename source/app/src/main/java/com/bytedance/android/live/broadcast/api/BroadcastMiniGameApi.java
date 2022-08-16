package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.LatestBanRecord;
import com.bytedance.android.live.broadcast.api.model.RealNameVerifyStatus;
import com.bytedance.android.live.broadcast.api.model.RoomStatusResponse;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.HashMap;
import p003X.C87007KQf;

/* loaded from: classes5.dex */
public interface BroadcastMiniGameApi {
    static {
        Covode.recordClassIndex(14385);
    }

    @FormUrlEncoded
    @POST("/webcast/gamelive/room/create/")
    Observable<C87007KQf<Room>> createMiniGameRoom(@FieldMap HashMap<String, String> hashMap);

    @GET("/webcast/certification/get_certification_status/")
    Observable<C5176i<RealNameVerifyStatus>> getCertificationStatus();

    @GET("/webcast/review/get_latest_ban_record/")
    Single<C5176i<LatestBanRecord>> getLatestBanRecord(@Query("ban_type") long j);

    @GET("/webcast/gamelive/room/stats/")
    Observable<C5176i<RoomStatusResponse>> getRoomStatus(@Query("user_id") long j, @Query("room_id") long j2);

    @FormUrlEncoded
    @POST("/webcast/certification/id_card_verify/")
    Observable<C5176i<Void>> idCardVerify(@Field("enter_from") String str);
}
