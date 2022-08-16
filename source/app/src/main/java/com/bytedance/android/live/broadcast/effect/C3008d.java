package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.stream.capture.p279a.C3239a;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.KE8;

/* renamed from: com.bytedance.android.live.broadcast.effect.d */
/* loaded from: classes5.dex */
public final class C3008d implements KE8 {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final C3239a LIZJ;

    static {
        Covode.recordClassIndex(15747);
    }

    @Override // p003X.KE8
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported || !this.LIZIZ) {
            return;
        }
        C3239a c3239a = this.LIZJ;
        if (!PatchProxy.proxy(new Object[0], c3239a, C3239a.LIZ, false, 3).isSupported) {
            c3239a.LIZJ.LIZ((String) null, 1.0f, true);
        }
    }

    public C3008d(C3239a c3239a) {
        C106862S5w.LIZ(c3239a);
        this.LIZJ = c3239a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003X.KE8
    public final void LIZ(String str, float f, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!this.LIZIZ) {
            return;
        }
        C3239a c3239a = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{str, Float.valueOf(f), Byte.valueOf((byte) z)}, c3239a, C3239a.LIZ, false, 1).isSupported) {
            c3239a.LIZIZ = str;
            if (z != 0) {
                ALogger.m15801d("FilterEffect: ", "useV3 no animation filePath:" + c3239a.LIZIZ + " intensity:" + f);
                c3239a.LIZJ.LIZ(c3239a.LIZIZ, f, false);
                return;
            }
            ALogger.m15801d("FilterEffect: ", "useV2 no animation filePath:" + c3239a.LIZIZ + " intensity1.0");
            c3239a.LIZJ.LIZ(c3239a.LIZIZ, 1.0f, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003X.KE8
    public final void LIZ(String str, String str2, float f, float f2, float f3, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, str2, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (!this.LIZIZ) {
            return;
        }
        C3239a c3239a = this.LIZJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf((byte) z)}, c3239a, C3239a.LIZ, false, 2);
        if (proxy.isSupported) {
            ((Integer) proxy.result).intValue();
        } else if (z != 0) {
            ALogger.m15801d("FilterEffect ", "useV3 with animation leftPath:" + str + " leftIntensity:" + f2 + " rightPath:" + str2 + " rightIntensity" + f3);
            c3239a.LIZJ.LIZ(str, str2, f, f2, f3, false);
        } else {
            ALogger.m15801d("FilterEffect: ", "useV2 with animation leftPath:" + str + " leftIntensity:" + f2 + " rightPath:" + str2 + " rightIntensity" + f3);
            c3239a.LIZJ.LIZ(str, str2, f, f2, f3, true);
        }
    }
}
