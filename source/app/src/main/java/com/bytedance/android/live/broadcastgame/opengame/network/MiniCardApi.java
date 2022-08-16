package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.live.base.model.user.C2852e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livehostapi.business.depend.livead.p486a.C5795a;
import com.bytedance.android.livehostapi.business.depend.livead.p486a.C5801h;
import com.bytedance.android.livehostapi.business.depend.livead.p486a.C5805l;
import com.bytedance.android.livehostapi.business.depend.livead.p486a.C5814u;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;
import io.reactivex.Single;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface MiniCardApi {
    static {
        Covode.recordClassIndex(20334);
    }

    @GET
    Observable<C5801h> checkMiniAppAuthList(@Url String str);

    @GET
    Observable<C5176i<C5814u>> checkStamp(@Url String str, @Query("type") Integer num, @Query("text") String str2);

    @GET
    Observable<AbstractC100834PnQ<C3559c>> getCardFromPath(@Url String str, @Query("app_id") String str2, @Query("start_page_url") String str3, @Query("title") String str4, @Query("screen_shot_uri") String str5);

    @GET
    Observable<AbstractC100834PnQ<C3553aq>> getCardInfo(@Url String str, @Query("app_id") String str2, @Query("room_id") Long l);

    @GET
    Observable<C5176i<C3555as>> getDeveloperCustomizedInfo(@Url String str, @Query("stamp_id") String str2, @Query("type") int i, @Query("path_query") String str3);

    @GET
    Observable<AbstractC100834PnQ<C3560d>> getEnterRoomCardInfo(@Url String str, @Query("room_id") Long l);

    @GET
    Observable<C5176i<C5805l>> getStampInfo(@Url String str, @Query("room_id") String str2);

    @FormUrlEncoded
    @POST
    Observable<AbstractC100834PnQ<C3560d>> saveCardInfo(@Url String str, @Field("app_id") String str2, @Field("room_id") Long l, @Field("scene") Integer num, @Field("title") String str3, @Field("customized_title") String str4, @Field("customized_cover_uri") String str5, @Field("screen_shot_uri") String str6, @Field("start_page_url") String str7, @Field("card_content") String str8, @Field("status") int i);

    @FormUrlEncoded
    @POST
    Observable<C5176i<C5805l>> saveStamp(@Url String str, @Field("room_id") String str2, @Field("stamps") String str3);

    @FormUrlEncoded
    @POST
    Observable<C5176i<C5795a>> updateCardStatus(@Url String str, @Field("room_id") String str2, @Field("type") int i, @Field("stamp_id") String str3, @Field("status") int i2);

    @FormUrlEncoded
    @POST
    Observable<C5176i<C5795a>> updateStamp(@Url String str, @Field("room_id") String str2, @Field("type") int i, @Field("stamp_id") String str3, @Field("status") int i2);

    @POST("/webcast/room/upload/image/")
    Single<C5176i<C2852e>> uploadAvatar(@Body TypedOutput typedOutput);
}
