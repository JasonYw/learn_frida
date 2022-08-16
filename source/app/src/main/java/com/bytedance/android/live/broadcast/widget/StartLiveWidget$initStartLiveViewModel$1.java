package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveWidget$initStartLiveViewModel$1 extends Lambda implements Function1<C2918r, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveWidget this$0;

    static {
        Covode.recordClassIndex(18815);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$initStartLiveViewModel$1(StartLiveWidget startLiveWidget) {
        super(1);
        this.this$0 = startLiveWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2918r c2918r) {
        C2918r c2918r2 = c2918r;
        if (!PatchProxy.proxy(new Object[]{c2918r2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2918r2);
            StartLiveWidget startLiveWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{c2918r2}, startLiveWidget, StartLiveWidget.LIZ, false, 12).isSupported && c2918r2 != null) {
                startLiveWidget.LJIILLIIL = c2918r2;
                if (startLiveWidget.LJIIJJI().LIZ().LIZ() == LiveMode.THIRD_PARTY) {
                    startLiveWidget.m15857LJ();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
