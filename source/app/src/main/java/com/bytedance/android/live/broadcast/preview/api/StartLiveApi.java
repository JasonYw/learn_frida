package com.bytedance.android.live.broadcast.preview.api;

import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.HashMap;
import p003X.AbstractC102307QQr;
import p003X.C87007KQf;

/* loaded from: classes12.dex */
public interface StartLiveApi {
    static {
        Covode.recordClassIndex(17202);
    }

    @GET("/webcast/room/continue/")
    Observable<C87007KQf<Room>> continueRoom(@Query("resolution_key") String str);

    @FormUrlEncoded
    @POST("/webcast/room/create/")
    Observable<C87007KQf<Room>> createRoom(@FieldMap HashMap<String, String> hashMap);

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/room/create_info/")
    Observable<C5176i<RoomCreateInfo>> getPreviewRoomCreateInfo(@Query("platform") int i, @Query("last_related_circle_id") long j, @Query("enable_preview_stream") boolean z, @Query("preview_resolutionkey") String str);

    @GET("/webcast/user/permission/")
    Observable<C5176i<PermissionResult>> getUserPermissionWithId(@Query("sec_anchor_id") String str, @Query("micro_app_entrance_visibility") String str2);
}
