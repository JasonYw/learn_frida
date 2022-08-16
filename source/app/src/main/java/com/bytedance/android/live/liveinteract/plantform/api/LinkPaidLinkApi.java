package com.bytedance.android.live.liveinteract.plantform.api;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6146ac;
import com.bytedance.android.livesdk.chatroom.model.interact.C6181w;
import com.bytedance.android.livesdk.chatroom.model.interact.C6182x;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Single;

/* loaded from: classes3.dex */
public interface LinkPaidLinkApi {
    static {
        Covode.recordClassIndex(29190);
    }

    @GET("/webcast/linkmic_profit/get_paid_linkmic_explain_card_info/")
    Single<C5176i<C6181w>> getPaidExplainCardInfo(@Query("room_id") long j);

    @GET("/webcast/linkmic_profit/get_paid_info_before_apply/")
    Single<C5176i<C6182x>> getPaidInfoBeforeApply(@Query("room_id") long j);

    @GET("/webcast/linkmic_audience/get_play_mode_info/")
    Single<C5176i<C6146ac>> getPlayModeInfo(@Query("room_id") long j);
}
