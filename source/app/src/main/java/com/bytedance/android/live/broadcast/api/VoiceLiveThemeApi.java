package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdkapi.depend.model.live.audio.C9494b;
import com.bytedance.android.livesdkapi.depend.model.live.audio.C9497e;
import com.bytedance.android.livesdkapi.depend.model.live.audio.C9498f;
import com.bytedance.android.livesdkapi.depend.model.live.audio.C9499g;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;

/* loaded from: classes3.dex */
public interface VoiceLiveThemeApi {
    static {
        Covode.recordClassIndex(14412);
    }

    @POST("/webcast/room/bg_add/")
    Observable<C5176i<C9497e>> addUgcBgTheme(@Query("room_id") long j, @Query("img_uri") String str, @Query("file_format") String str2, @Query("show_area") String str3, @Query("bg_type") int i);

    @GET("/webcast/room/audio/bg_delete/")
    Observable<C5176i<Object>> deleteTheme(@Query("room_id") long j, @Query("image_uri") String str, @Query("bg_type") int i);

    @GET("/webcast/room/audio/bg/")
    Observable<C5176i<C9499g>> fetchOneKeyVoiceLiveThemeList(@Query("bg_type") int i, @Query("image_type") int i2);

    @GET("/webcast/room/audio/bg/")
    Observable<C5176i<C9499g>> fetchVoiceLiveThemeList(@Query("bg_type") int i);

    @GET("/webcast/room/latest_bg/")
    Observable<C5176i<C9494b>> getLatestOfficeBg(@Query("bg_type") int i);

    @GET("/webcast/room/audio/bg_set/")
    Observable<C5176i<Object>> selectTheme(@Query("room_id") long j, @Query("image_uri") String str, @Query("image_type") int i, @Query("bg_type") int i2);

    @POST("/webcast/room/audio/bg_upload/")
    Observable<C5176i<C9497e>> uploadBackgroundImg(@Query("room_id") long j, @Body TypedOutput typedOutput);

    @POST("/webcast/image/upload/")
    Observable<C5176i<C9498f>> uploadFile(@Query("scene") String str, @Body TypedOutput typedOutput);
}
