package com.bytedance.android.live.broadcastgame.opengame;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcastgame.api.openplatform.AbstractC3398b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.h */
/* loaded from: classes5.dex */
public interface AbstractC3497h {

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.h$a */
    /* loaded from: classes5.dex */
    public interface AbstractC3498a {
        static {
            Covode.recordClassIndex(20182);
        }

        void LIZ();

        void LIZ(Throwable th);
    }

    static {
        Covode.recordClassIndex(20181);
    }

    void initDebug(Context context, DataCenter dataCenter, ViewGroup viewGroup, AbstractC3398b abstractC3398b, Map<String, ? extends Object> map, AbstractC3498a abstractC3498a);

    void releaseDebug();

    void stopDebug();
}
