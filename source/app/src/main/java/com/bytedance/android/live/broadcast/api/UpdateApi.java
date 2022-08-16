package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.user.C2852e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;

/* loaded from: classes3.dex */
public interface UpdateApi {
    static {
        Covode.recordClassIndex(14410);
    }

    @POST("/webcast/room/video/capture/")
    Observable<C5176i<Object>> updateCaptureVideo(@Query("video_type") String str, @Query("file_type") String str2, @Query("data_size") long j, @Query("pixel_x") int i, @Query("pixel_y") int i2, @Body TypedOutput typedOutput);

    @POST("/webcast/review/upload_origin_screen/")
    Observable<C5176i<C2852e>> uploadOriginScreen(@Body TypedOutput typedOutput, @Query("room_id") long j, @Query("video_id") String str);
}
