package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2374a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136423cQs;

/* loaded from: classes17.dex */
public final class CJPayFrontStandardCounterActivity$completeFragment$2 extends Lambda implements Function0<C2374a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayFrontStandardCounterActivity this$0;

    static {
        Covode.recordClassIndex(8572);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFrontStandardCounterActivity$completeFragment$2(CJPayFrontStandardCounterActivity cJPayFrontStandardCounterActivity) {
        super(0);
        this.this$0 = cJPayFrontStandardCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.android.ttcjpaysdk.thirdparty.front.counter.fragment.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2374a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2374a c2374a = new C2374a();
        c2374a.LIZIZ = this.this$0.LJIILJJIL;
        c2374a.LIZJ = this.this$0.LJIILLIIL;
        c2374a.LJFF = this.this$0.LJIIZILJ;
        c2374a.LJIILIIL = C136423cQs.LIZIZ.LIZ();
        c2374a.LJIILL = this.this$0.LJFF;
        c2374a.LIZLLL = this.this$0.LJIILL;
        return c2374a;
    }
}