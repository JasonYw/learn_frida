package com.bytedance.android.live.p238ai.impl.business.gamePrediction;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

/* renamed from: com.bytedance.android.live.ai.impl.business.gamePrediction.ReportDownloadProbabilityApi */
/* loaded from: classes.dex */
public interface ReportDownloadProbabilityApi {
    static {
        Covode.recordClassIndex(13873);
    }

    @FormUrlEncoded
    @POST("/webcast/gamecp/room/report_download_probability")
    Observable<C5176i<Object>> reportDownloadProbability(@Field("anchor_id") long j, @Field("room_id") long j2, @Field("game_id_to_prob_json") String str, @Field("decision_key") String str2);
}
