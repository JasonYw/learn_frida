package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.widget.AbsAnchorResolutionMonitorWidget;
import com.bytedance.android.live.core.widget.AbstractC4165j;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.Observable;
import p003X.AbstractC134734bzd;
import p003X.K06;
import p003X.K2Z;
import p003X.K45;
import p003X.K5Q;
import p003X.K5U;

/* renamed from: com.bytedance.android.live.broadcast.aq */
/* loaded from: classes5.dex */
public interface AbstractC2928aq {
    static {
        Covode.recordClassIndex(14603);
    }

    K45 LIZ(long j, Context context, AbstractC2863ai abstractC2863ai);

    K5Q LIZ(Context context, K45 k45);

    K5U LIZ(DataCenter dataCenter);

    Fragment LIZ(K06 k06, K2Z k2z, Bundle bundle);

    Fragment LIZ(K2Z k2z, Bundle bundle);

    AbsAnchorResolutionMonitorWidget LIZ(AbstractC5436a abstractC5436a);

    AbstractC4165j LIZ(WidgetManager widgetManager, int i);

    Observable<C5176i<Object>> LIZ(int i, long j, int i2, String str);

    void LIZ(long j);

    boolean LIZ();

    AbstractC134734bzd LIZIZ();

    String LIZJ();

    Class<? extends Widget> LIZLLL();
}
