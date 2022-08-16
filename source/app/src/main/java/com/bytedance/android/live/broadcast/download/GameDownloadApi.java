package com.bytedance.android.live.broadcast.download;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;
import java.util.Map;
import p003X.AbstractC102307QQr;

/* loaded from: classes12.dex */
public interface GameDownloadApi {
    static {
        Covode.recordClassIndex(15527);
    }

    @AbstractC102307QQr(LIZ = "room")
    @FormUrlEncoded
    @POST("/webcast/gamecp/user/download_action/")
    Observable<C5176i<Object>> logDownloadAction(@FieldMap Map<String, String> map);
}
