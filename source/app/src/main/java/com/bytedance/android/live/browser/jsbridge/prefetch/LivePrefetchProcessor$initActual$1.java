package com.bytedance.android.live.browser.jsbridge.prefetch;

import com.bytedance.android.live.browser.jsbridge.AbstractC3942e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class LivePrefetchProcessor$initActual$1 extends Lambda implements Function1<AbstractC3942e, Observable<AbstractC3942e.C3943a>> {
    public static final LivePrefetchProcessor$initActual$1 INSTANCE = new LivePrefetchProcessor$initActual$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(22895);
    }

    public LivePrefetchProcessor$initActual$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.Observable<com.bytedance.android.live.browser.jsbridge.e$a>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Observable<AbstractC3942e.C3943a> invoke(AbstractC3942e abstractC3942e) {
        AbstractC3942e abstractC3942e2 = abstractC3942e;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3942e2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(abstractC3942e2);
        return abstractC3942e2.LIZ();
    }
}
