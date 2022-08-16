package com.bytedance.android.live.broadcast.gamedetail.audience;

import com.bytedance.android.live.broadcast.gamedetail.order.model.C3110f;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3111g;
import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.Map;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface AudienceGamePromoteDetailApi {
    static {
        Covode.recordClassIndex(16109);
    }

    @FormUrlEncoded
    @POST("/webcast/gamecp/user/reserve/cancel/")
    Observable<AbstractC5172c> cancelOrderGame(@Field("game_id") String str);

    @FormUrlEncoded
    @POST("/webcast/gamecp/game/dynamic_detail/")
    Observable<C5176i<Object>> fetchGamePromoteDetail(@FieldMap Map<String, String> map);

    @GET("/webcast/gamecp/user/game_detail/")
    Observable<AbstractC100834PnQ<C3046d>> getAudienceGamePromoteDetail(@Query("room_id") String str, @Query("anchor_id") String str2, @Query("game_id") String str3);

    @GET("/webcast/gamecp/user/reserve/status/")
    Observable<AbstractC100834PnQ<C3111g>> getGameReserveStatus(@Query("game_id") String str);

    @FormUrlEncoded
    @POST("/webcast/gamecp/user/reserve/")
    Observable<AbstractC100834PnQ<C3110f>> orderGame(@Field("game_id") String str, @Field("anchor_id") long j, @Field("room_id") long j2, @Field("user_nick_name") String str2);

    @FormUrlEncoded
    @POST("/webcast/gamecp/user/auto_download/")
    Observable<AbstractC5172c> setAutoDownload(@Field("game_id") String str);
}
