package cn.everphoto.template_panel.model;

import cn.everphoto.model.EpTemplate;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: cn.everphoto.template_panel.model.d */
/* loaded from: classes24.dex */
public final class C0791d {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final EpTemplate LIZJ;
    public final List<String> LIZLLL;

    /* renamed from: LJ */
    public final List<String> f21074LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;

    static {
        Covode.recordClassIndex(3814);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, this.f21074LJ, Integer.valueOf(this.LJFF), Integer.valueOf(this.LJI), this.LJII};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0791d) {
            return C106862S5w.LIZ(((C0791d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("TemplateDataWrapper:%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C0791d(boolean z, EpTemplate epTemplate, List<String> list, List<String> list2, int i, int i2, String str) {
        this.LIZIZ = z;
        this.LIZJ = epTemplate;
        this.LIZLLL = list;
        this.f21074LJ = list2;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = str;
    }

    public /* synthetic */ C0791d(boolean z, EpTemplate epTemplate, List list, List list2, int i, int i2, String str, int i3) {
        this(true, null, null, null, 0, 0, null);
    }
}
