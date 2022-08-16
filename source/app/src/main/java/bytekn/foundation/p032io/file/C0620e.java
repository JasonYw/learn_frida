package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: bytekn.foundation.io.file.e */
/* loaded from: classes4.dex */
public final class C0620e {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final C0622g LIZJ;
    public final C0622g LIZLLL;

    /* renamed from: LJ */
    public final Double f20856LJ;
    public final Double LJFF;
    public final Long LJI;
    public final FileType LJII;

    static {
        Covode.recordClassIndex(2649);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f20856LJ, this.LJFF, this.LJI, this.LJII};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0620e) {
            return C106862S5w.LIZ(((C0620e) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("FileMeta:%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C0620e(String str, C0622g c0622g, C0622g c0622g2, Double d, Double d2, Long l, FileType fileType) {
        C106862S5w.LIZ(str, c0622g, c0622g2, fileType);
        this.LIZIZ = str;
        this.LIZJ = c0622g;
        this.LIZLLL = c0622g2;
        this.f20856LJ = d;
        this.LJFF = d2;
        this.LJI = l;
        this.LJII = fileType;
    }
}
