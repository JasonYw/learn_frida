package com.bytedance.android.live.broadcastgame.api.roomcat;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* loaded from: classes8.dex */
public interface RoomcatRetrofitApi {
    static {
        Covode.recordClassIndex(19249);
    }

    @FormUrlEncoded
    @POST("/webcast/game/cat/create/")
    Observable<C5176i<CatData>> createCat(@Field("user_id") long j, @Field("name") String str, @Field("category") int i, @Field("extra") String str2);

    @FormUrlEncoded
    @POST("/webcast/game/cat/update/")
    Observable<C5176i<CatData>> deleteCat(@Field("name") String str, @Field("cat_id") long j, @Field("status") int i, @Field("add_cat_weight") int i2, @Field("add_bowl_storage") int i3, @Field("add_bowl_weight") int i4, @Field("cat_pos_x") int i5, @Field("cat_pos_y") int i6, @Field("bowl_pos_x") int i7, @Field("bowl_pos_y") int i8, @Field("last_interact_time") long j2, @Field("last_feed_time") int i9, @Field("extra") String str2);

    @FormUrlEncoded
    @POST("/webcast/game/cat/status/")
    Observable<C5176i<CatData>> pullCatInfo(@Field("user_id") long j);

    @FormUrlEncoded
    @POST("/webcast/game/cat/update_age/")
    Observable<C5176i<CatData>> updateAge(@Field("cat_id") long j);

    @FormUrlEncoded
    @POST("/webcast/game/cat/update/")
    Observable<C5176i<CatData>> updateCatRequest(@Field("name") String str, @Field("cat_id") long j, @Field("status") int i, @Field("add_cat_weight") int i2, @Field("add_bowl_storage") int i3, @Field("add_bowl_weight") int i4, @Field("cat_pos_x") int i5, @Field("cat_pos_y") int i6, @Field("bowl_pos_x") int i7, @Field("bowl_pos_y") int i8, @Field("last_interact_time") long j2, @Field("last_feed_time") int i9);
}
