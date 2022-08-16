package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.C6141g;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface StartLiveBannerApi {
    static {
        Covode.recordClassIndex(14407);
    }

    @GET("/webcast/room/live_page_banner/")
    Observable<C5176i<C6141g.C6142a>> queryStartLiveBanner(@Query("live_page_type") String str, @Query("user_type") int i);
}
