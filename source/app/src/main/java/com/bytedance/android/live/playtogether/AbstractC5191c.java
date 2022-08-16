package com.bytedance.android.live.playtogether;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;

/* renamed from: com.bytedance.android.live.playtogether.c */
/* loaded from: classes5.dex */
public interface AbstractC5191c extends OnMessageListener {
    static {
        Covode.recordClassIndex(32856);
    }

    Observable<AbstractC5233d> LIZ(Context context, long j, boolean z, DataCenter dataCenter);
}
