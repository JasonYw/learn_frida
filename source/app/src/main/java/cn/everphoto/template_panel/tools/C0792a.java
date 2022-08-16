package cn.everphoto.template_panel.tools;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: cn.everphoto.template_panel.tools.a */
/* loaded from: classes4.dex */
public final class C0792a {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final View LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final long f21075LJ;

    static {
        Covode.recordClassIndex(3817);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ, Integer.valueOf(this.LIZLLL), Long.valueOf(this.f21075LJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0792a) {
            return C106862S5w.LIZ(((C0792a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BotPanelAnimParam:%s,%s,%s,%s", LIZ());
    }

    public C0792a(boolean z, View view, int i, long j) {
        C106862S5w.LIZ(view);
        this.LIZIZ = z;
        this.LIZJ = view;
        this.LIZLLL = i;
        this.f21075LJ = j;
    }
}
