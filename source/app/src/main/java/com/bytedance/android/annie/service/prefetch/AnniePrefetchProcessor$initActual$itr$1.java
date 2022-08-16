package com.bytedance.android.annie.service.prefetch;

import com.bytedance.android.annie.service.prefetch.AbstractC2642g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class AnniePrefetchProcessor$initActual$itr$1 extends Lambda implements Function1<AbstractC2642g, Observable<AbstractC2642g.C2643a>> {
    public static final AnniePrefetchProcessor$initActual$itr$1 INSTANCE = new AnniePrefetchProcessor$initActual$itr$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11152);
    }

    public AnniePrefetchProcessor$initActual$itr$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.Observable<com.bytedance.android.annie.service.prefetch.g$a>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Observable<AbstractC2642g.C2643a> invoke(AbstractC2642g abstractC2642g) {
        AbstractC2642g abstractC2642g2 = abstractC2642g;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC2642g2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(abstractC2642g2);
        return abstractC2642g2.LIZ();
    }
}
