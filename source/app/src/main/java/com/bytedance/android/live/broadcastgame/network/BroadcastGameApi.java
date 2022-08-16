package com.bytedance.android.live.broadcastgame.network;

import com.bytedance.android.live.broadcastgame.api.model.C3381l;
import com.bytedance.android.live.broadcastgame.api.model.C3387w;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Multipart;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Part;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import p003X.AbstractC102307QQr;

/* loaded from: classes5.dex */
public interface BroadcastGameApi {
    static {
        Covode.recordClassIndex(19878);
    }

    @AbstractC102307QQr(LIZ = "live_game")
    @POST("/webcast/room/interact_entrance/")
    Observable<C5176i<C3381l>> getGameEntrance(@Query("room_id") long j, @Query("effect_sdk_version") String str, @Query("cache_hash") String str2);

    @AbstractC102307QQr(LIZ = "live_game")
    @POST("/webcast/game/resource/config/")
    Observable<C5176i<C3477a>> getGameFeedbackTagList(@Query("game_id") long j, @Query("room_id") long j2, @Query("play_kind") int i);

    @POST("/webcast/game/channel/open_entrance/")
    Observable<C5176i<Object>> notifyAudiencePreloadGameFloatResource(@Query("game_id") long j, @Query("room_id") long j2, @Query("entrance") String str);

    @POST("/webcast/game/status/start/")
    Observable<C5176i<C3387w>> notifyServerGameStart(@Query("game_id") long j, @Query("room_id") long j2, @Query("open_type") String str, @Query("game_token") long j3);

    @POST("/webcast/game/status/stop/")
    Observable<C5176i<Object>> notifyServerGameStop(@Query("game_id") long j, @Query("room_id") long j2, @Query("play_id") long j3, @Query("game_data") String str, @Query("is_cut_short") boolean z, @Query("stop_reason") int i, @Query("game_token") long j4);

    @Multipart
    @POST("https://i.snssdk.com/feedback/2/post_message/")
    Observable<C3478b> postGameFeedback(@Part("content") RequestBody requestBody);
}
