package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.effect.model.C4205a;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;

/* loaded from: classes3.dex */
public interface PixelLoopStickerApi {
    static {
        Covode.recordClassIndex(24295);
    }

    @GET("/webcast/room/props/bg/")
    Observable<C5176i<C4205a>> getPictures();

    @POST("/webcast/room/props/bg_upload/")
    Observable<C5176i<Object>> uploadPicture(@Body TypedOutput typedOutput, @Query("room_id") long j);
}
