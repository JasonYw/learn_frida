package com.bytedance.android.annie.service.prefetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Set;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C99591PKf;
import p003X.PLH;

/* loaded from: classes7.dex */
public final class AnniePrefetchProcessor$providers$2 extends Lambda implements Function0<Set<? extends AbstractC2642g>> {
    public static final AnniePrefetchProcessor$providers$2 INSTANCE = new AnniePrefetchProcessor$providers$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11158);
    }

    public AnniePrefetchProcessor$providers$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Set<? extends com.bytedance.android.annie.service.prefetch.g>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Set<? extends AbstractC2642g> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return SetsKt__SetsKt.setOf((Object[]) new AbstractC2642g[]{new C99591PKf(), new PLH()});
    }
}
