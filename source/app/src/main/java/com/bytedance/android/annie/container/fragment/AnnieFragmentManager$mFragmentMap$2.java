package com.bytedance.android.annie.container.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes26.dex */
public final class AnnieFragmentManager$mFragmentMap$2 extends Lambda implements Function0<LinkedHashMap<String, WeakReference<C2606a>>> {
    public static final AnnieFragmentManager$mFragmentMap$2 INSTANCE = new AnnieFragmentManager$mFragmentMap$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10754);
    }

    public AnnieFragmentManager$mFragmentMap$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap<java.lang.String, java.lang.ref.WeakReference<com.bytedance.android.annie.container.fragment.a>>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LinkedHashMap<String, WeakReference<C2606a>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinkedHashMap<>();
    }
}
