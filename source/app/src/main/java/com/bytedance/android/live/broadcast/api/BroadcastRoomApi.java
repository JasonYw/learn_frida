package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.C2899a;
import com.bytedance.android.live.broadcast.api.model.C2901ag;
import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.network.response.C5175h;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.C6127bf;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.List;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface BroadcastRoomApi {
    static {
        Covode.recordClassIndex(14386);
    }

    @GET("/webcast/gamelive/category/review/")
    Observable<C5176i<C2901ag>> checkSensitiveWords(@Query("text") String str);

    @GET("/webcast/room/get_all_category/")
    Observable<C5176i<List<CategoryNode>>> getAllCategory(@Query("platform") int i);

    @POST("/webcast/room/get_latest_room/")
    Observable<C5176i<Room>> getLatestRoom();

    @GET("/webcast/room/game_list/")
    Observable<C5175h<Game>> getLiveGameList(@Query("game_icon") int i);

    @GET("/webcast/room/get_obs_audit_status/")
    Observable<C5176i<C2918r>> getObsAuditStatusInfo();

    @GET("/webcast/anchor/permission/status/")
    Observable<C5176i<C2899a>> getPCLivePermissionStatus(@Query("permission_name") String str);

    @AbstractC102307QQr(LIZ = "room")
    @GET("/webcast/room/create_info/")
    Observable<C5176i<RoomCreateInfo>> getPreviewRoomCreateInfo(@Query("platform") int i);

    @GET("/webcast/room/tag_list/")
    Observable<C5175h<C6127bf>> getRoomTags();

    @FormUrlEncoded
    @POST("/webcast/room/modify_category/")
    Observable<C5176i<CategoryNode>> modifyCategory(@Field("platform") long j, @Field("room_id") long j2, @Field("old_category_id") long j3, @Field("new_category_id") long j4);

    @GET("/webcast/anchor/cover/neednotice/")
    Observable<C5176i<Object>> shouldShowCoverNotice();

    @FormUrlEncoded
    @POST("/webcast/room/update_room_challenge/")
    Observable<C5176i<Object>> updateRoomHashTag(@Field("room_id") long j, @Field("old_challenge_id") long j2, @Field("new_challenge_id") long j3, @Field("new_challenge_name") String str);
}
