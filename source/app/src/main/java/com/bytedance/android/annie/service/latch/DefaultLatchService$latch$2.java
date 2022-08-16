package com.bytedance.android.annie.service.latch;

import com.bytedance.android.latch.jsb2.AbstractC2767a;
import com.bytedance.android.latch.jsb2.C2768b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C99763PQv;
import p003X.C99764PQw;
import p003X.PR4;
import p003X.PR5;
import p003X.PR8;
import p003X.PR9;
import p003X.PRA;
import p003X.PRB;

/* loaded from: classes7.dex */
public final class DefaultLatchService$latch$2 extends Lambda implements Function0<AbstractC2767a> {
    public static final DefaultLatchService$latch$2 INSTANCE = new DefaultLatchService$latch$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11082);
    }

    public DefaultLatchService$latch$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.latch.jsb2.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.latch.jsb2.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.latch.jsb2.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC2767a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PRA pra = AbstractC2767a.LIZIZ;
        LatchScriptContentLoader latchScriptContentLoader = new LatchScriptContentLoader();
        C26321 c26321 = C26321.INSTANCE;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{latchScriptContentLoader, c26321}, pra, PRA.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C106862S5w.LIZ(latchScriptContentLoader, c26321);
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{latchScriptContentLoader, c26321}, pra.LIZJ, PRB.LIZ, false, 1);
        if (proxy3.isSupported) {
            return proxy3.result;
        }
        C106862S5w.LIZ(latchScriptContentLoader, c26321);
        C2768b c2768b = new C2768b(latchScriptContentLoader);
        c26321.invoke(c2768b);
        return new PR9(c2768b, (byte) 0);
    }

    /* renamed from: com.bytedance.android.annie.service.latch.DefaultLatchService$latch$2$1 */
    /* loaded from: classes7.dex */
    public static final class C26321 extends Lambda implements Function1<C2768b, Unit> {
        public static final C26321 INSTANCE = new C26321();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(11083);
        }

        public C26321() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C2768b c2768b) {
            C2768b c2768b2 = c2768b;
            if (!PatchProxy.proxy(new Object[]{c2768b2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c2768b2);
                PR8 pr8 = PR4.LIZIZ;
                if (!PatchProxy.proxy(new Object[]{pr8}, c2768b2, C2768b.LJFF, false, 1).isSupported) {
                    C106862S5w.LIZ(pr8);
                    c2768b2.LJI = pr8;
                }
                C99764PQw c99764PQw = C99764PQw.LIZIZ;
                if (!PatchProxy.proxy(new Object[]{c99764PQw}, c2768b2, PR5.LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(c99764PQw);
                    c2768b2.LIZJ = c99764PQw;
                }
                Set<String> of = SetsKt__SetsKt.setOf((Object[]) new String[]{"__prefetch", "fetch"});
                if (!PatchProxy.proxy(new Object[]{of}, c2768b2, PR5.LIZ, false, 3).isSupported) {
                    C106862S5w.LIZ(of);
                    c2768b2.LIZLLL = of;
                }
                C99763PQv c99763PQv = C99763PQv.LIZIZ;
                if (!PatchProxy.proxy(new Object[]{c99763PQv}, c2768b2, PR5.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(c99763PQv);
                    c2768b2.LIZIZ = c99763PQv;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
