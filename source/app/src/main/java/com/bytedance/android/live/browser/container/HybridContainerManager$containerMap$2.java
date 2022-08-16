package com.bytedance.android.live.browser.container;

import com.bytedance.android.live.p311c.AbstractC4059b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class HybridContainerManager$containerMap$2 extends Lambda implements Function0<HashMap<String, WeakReference<AbstractC4059b>>> {
    public static final HybridContainerManager$containerMap$2 INSTANCE = new HybridContainerManager$containerMap$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21990);
    }

    public HybridContainerManager$containerMap$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.bytedance.android.live.c.b>>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ HashMap<String, WeakReference<AbstractC4059b>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new HashMap<>();
    }
}
