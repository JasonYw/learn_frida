package com.bytedance.android.annie.service.prefetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.PKY;

/* renamed from: com.bytedance.android.annie.service.prefetch.g */
/* loaded from: classes7.dex */
public interface AbstractC2642g {
    static {
        Covode.recordClassIndex(11193);
    }

    Observable<C2643a> LIZ();

    /* renamed from: com.bytedance.android.annie.service.prefetch.g$a */
    /* loaded from: classes7.dex */
    public static final class C2643a {
        public static ChangeQuickRedirect LIZ;
        public final String LIZIZ;
        public final String LIZJ;

        /* renamed from: LJ */
        public static final PKY f25632LJ = new PKY((byte) 0);
        public static final C2643a LIZLLL = new C2643a("__invalid__", "");

        private Object[] LIZ() {
            return new Object[]{this.LIZIZ, this.LIZJ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2643a) {
                return C106862S5w.LIZ(((C2643a) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("IPrefetchConfigProvider$ChanneledConfig:%s,%s", LIZ());
        }

        static {
            Covode.recordClassIndex(11194);
        }

        public C2643a(String str, String str2) {
            C106862S5w.LIZ(str2);
            this.LIZIZ = str;
            this.LIZJ = str2;
        }
    }
}
