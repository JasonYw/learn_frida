package com.android.ttcjpaysdk.integrated.counter.activity;

import com.android.ttcjpaysdk.integrated.counter.fragment.C2285b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C137124ccC;

/* loaded from: classes17.dex */
public final class CJPayCounterActivity$confirmFragment$2 extends Lambda implements Function0<C2285b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayCounterActivity this$0;

    static {
        Covode.recordClassIndex(7514);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayCounterActivity$confirmFragment$2(CJPayCounterActivity cJPayCounterActivity) {
        super(0);
        this.this$0 = cJPayCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.android.ttcjpaysdk.integrated.counter.fragment.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2285b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2285b c2285b = new C2285b();
        c2285b.LJJIIZI = this.this$0.LIZJ;
        c2285b.LIZIZ = new C137124ccC(c2285b, this);
        return c2285b;
    }
}
