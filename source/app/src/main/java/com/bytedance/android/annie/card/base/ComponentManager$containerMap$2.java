package com.bytedance.android.annie.card.base;

import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ComponentManager$containerMap$2 extends Lambda implements Function0<HashMap<String, WeakReference<IHybridComponent>>> {
    public static final ComponentManager$containerMap$2 INSTANCE = new ComponentManager$containerMap$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10674);
    }

    public ComponentManager$containerMap$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.bytedance.android.annie.api.card.IHybridComponent>>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ HashMap<String, WeakReference<IHybridComponent>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new HashMap<>();
    }
}
