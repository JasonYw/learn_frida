package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.gift.model.C7189e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface StickerGiftApi {
    static {
        Covode.recordClassIndex(14408);
    }

    @GET("/webcast/gift/user_name/check/")
    Observable<C5176i<C7189e>> checkUserNameLegality(@Query("name") String str);
}
