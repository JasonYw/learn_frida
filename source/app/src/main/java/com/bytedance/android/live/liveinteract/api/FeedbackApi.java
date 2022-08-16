package com.bytedance.android.live.liveinteract.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.rank.model.C9220h;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public interface FeedbackApi {
    static {
        Covode.recordClassIndex(25101);
    }

    @FormUrlEncoded
    @POST("/webcast/linkmic_audience/feedback/")
    Observable<C5176i<Unit>> feedback(@FieldMap Map<String, Object> map);

    @GET("/webcast/linkmic_audience/get_feedback_type/")
    Observable<C5176i<C9220h>> getFeedbackType(@Query("room_id") long j, @Query("channel_id") long j2, @Query("scene") int i, @Query("third_party_scene") String str);
}
