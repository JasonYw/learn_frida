package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2377d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136735cVu;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontStandardCounterActivity$newInsufficientBalanceFragment$2 */
/* loaded from: classes17.dex */
public final class C2368x87051895 extends Lambda implements Function0<C2377d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayFrontStandardCounterActivity this$0;

    static {
        Covode.recordClassIndex(8591);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2368x87051895(CJPayFrontStandardCounterActivity cJPayFrontStandardCounterActivity) {
        super(0);
        this.this$0 = cJPayFrontStandardCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2377d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2377d c2377d = new C2377d();
        c2377d.LJIILL = new C136735cVu(c2377d, this);
        return c2377d;
    }
}
