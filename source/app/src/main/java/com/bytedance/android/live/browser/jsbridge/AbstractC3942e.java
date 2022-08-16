package com.bytedance.android.live.browser.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C99586PKa;

/* renamed from: com.bytedance.android.live.browser.jsbridge.e */
/* loaded from: classes7.dex */
public interface AbstractC3942e {
    static {
        Covode.recordClassIndex(22259);
    }

    Observable<C3943a> LIZ();

    /* renamed from: com.bytedance.android.live.browser.jsbridge.e$a */
    /* loaded from: classes7.dex */
    public static final class C3943a {
        public static ChangeQuickRedirect LIZ;
        public final String LIZIZ;
        public final String LIZJ;

        /* renamed from: LJ */
        public static final C99586PKa f26139LJ = new C99586PKa((byte) 0);
        public static final C3943a LIZLLL = new C3943a("__invalid__", "");

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
            if (obj instanceof C3943a) {
                return C106862S5w.LIZ(((C3943a) obj).LIZ(), LIZ());
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
            Covode.recordClassIndex(22260);
        }

        public C3943a(String str, String str2) {
            C106862S5w.LIZ(str2);
            this.LIZIZ = str;
            this.LIZJ = str2;
        }
    }
}
