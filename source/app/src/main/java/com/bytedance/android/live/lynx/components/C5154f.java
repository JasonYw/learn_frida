package com.bytedance.android.live.lynx.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewBuilder;
import com.lynx.tasm.LynxViewClient;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.lynx.components.f */
/* loaded from: classes5.dex */
public class C5154f {
    public static ChangeQuickRedirect LIZJ;

    static {
        Covode.recordClassIndex(32210);
    }

    public void LIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZJ, false, 15).isSupported;
    }

    public void LIZ(LynxView lynxView) {
        if (PatchProxy.proxy(new Object[]{lynxView}, this, LIZJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZ(LynxView lynxView, LynxError lynxError) {
        if (PatchProxy.proxy(new Object[]{lynxView, lynxError}, this, LIZJ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZ(LynxView lynxView, LynxPerfMetric lynxPerfMetric) {
        if (PatchProxy.proxy(new Object[]{lynxView, lynxPerfMetric}, this, LIZJ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZ(LynxView lynxView, String str) {
        if (PatchProxy.proxy(new Object[]{lynxView, str}, this, LIZJ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZ(LynxView lynxView, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{lynxView, str, str2}, this, LIZJ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView, str, str2);
    }

    public void LIZ(LynxView lynxView, boolean z) {
        if (PatchProxy.proxy(new Object[]{lynxView, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZ(LynxViewBuilder lynxViewBuilder) {
        if (PatchProxy.proxy(new Object[]{lynxViewBuilder}, this, LIZJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxViewBuilder);
    }

    public void LIZIZ(LynxView lynxView) {
        if (PatchProxy.proxy(new Object[]{lynxView}, this, LIZJ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZIZ(LynxView lynxView, LynxPerfMetric lynxPerfMetric) {
        if (PatchProxy.proxy(new Object[]{lynxView, lynxPerfMetric}, this, LIZJ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZIZ(LynxView lynxView, String str) {
        if (PatchProxy.proxy(new Object[]{lynxView, str}, this, LIZJ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZJ(LynxView lynxView) {
        if (PatchProxy.proxy(new Object[]{lynxView}, this, LIZJ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZLLL(LynxView lynxView) {
        if (PatchProxy.proxy(new Object[]{lynxView}, this, LIZJ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
    }

    public void LIZIZ(LynxView lynxView, LynxViewClient.ScrollInfo scrollInfo) {
        if (PatchProxy.proxy(new Object[]{lynxView, scrollInfo}, this, LIZJ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
        new StringBuilder("on scroll stop, info ").append(scrollInfo);
    }

    public void LIZ(LynxView lynxView, LynxViewClient.ScrollInfo scrollInfo) {
        if (PatchProxy.proxy(new Object[]{lynxView, scrollInfo}, this, LIZJ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
        new StringBuilder("on scroll start, info ").append(scrollInfo);
    }
}
