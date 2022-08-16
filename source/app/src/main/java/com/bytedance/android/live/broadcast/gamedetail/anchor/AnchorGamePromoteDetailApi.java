package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdkapi.depend.model.live.C9500b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import io.reactivex.Observable;
import java.util.Map;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface AnchorGamePromoteDetailApi {
    static {
        Covode.recordClassIndex(16019);
    }

    @FormUrlEncoded
    @POST("/webcast/gamecp/anchor/audit_recommend/")
    Observable<AbstractC100834PnQ<C3041o>> auditRecommend(@Field("game_id") String str, @Field("recommend") String str2);

    @FormUrlEncoded
    @POST("/webcast/gamecp/anchor/reserve/stop_promotion/")
    Observable<AbstractC5172c> cancelPromoteReserveGame(@Field("game_id") String str, @Field("room_id") String str2);

    @GET("/webcast/gamecp/game/detail/")
    Observable<AbstractC100834PnQ<C3036d>> getGamePromoteDetail(@QueryMap Map<String, String> map, @Query("scene") Integer num);

    @GET("/webcast/gamecp/promotion/games/")
    Observable<AbstractC100834PnQ<C9500b>> getGamePromoteStatus();

    @FormUrlEncoded
    @POST("/webcast/gamecp/anchor/reserve/start_promotion/")
    Observable<AbstractC5172c> promoteReserveGame(@Field("game_id") String str, @Field("room_id") String str2, @Field("category") long j);

    @FormUrlEncoded
    @POST("/webcast/gamecp/page/set_status/")
    Observable<C5176i<Object>> setGamePromoteStatus(@Field("set_type") String str);

    @FormUrlEncoded
    @POST("/webcast/gamecp/anchor/start_promotion/")
    Observable<C5176i<Object>> startGamePromote(@Field("game_id") String str, @Field("room_id") String str2, @Field("category") long j, @Field("scene") Long l);

    @FormUrlEncoded
    @POST("/webcast/gamecp/anchor/stop_promotion/")
    Observable<C5176i<Object>> stopGamePromote(@Field("game_id") String str, @Field("room_id") String str2, @Field("scene") Long l);

    @FormUrlEncoded
    @POST("/webcast/game/anchor/message/update_status/")
    Observable<C5176i<Object>> updateGainSharingMsg(@Field("msg_id") String str, @Field("oper") int i);
}
