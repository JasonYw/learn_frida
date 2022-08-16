package com.bytedance.android.live.broadcastgame.opengame.p296im;

import com.bytedance.android.tools.p859a.p860a.d$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.im.BroadcastGameMessageApi */
/* loaded from: classes8.dex */
public interface BroadcastGameMessageApi {
    static {
        Covode.recordClassIndex(20184);
    }

    @FormUrlEncoded
    @POST("/webcast/im/fetch/")
    Call<d$b> fetchMessageShortConnection(@Field("room_id") long j, @Field("fetch_rule") int i, @FieldMap Map<String, String> map);
}
