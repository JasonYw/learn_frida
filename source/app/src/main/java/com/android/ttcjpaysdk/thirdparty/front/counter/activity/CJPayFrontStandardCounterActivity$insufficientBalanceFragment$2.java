package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2375b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C137393cgX;

/* loaded from: classes17.dex */
public final class CJPayFrontStandardCounterActivity$insufficientBalanceFragment$2 extends Lambda implements Function0<C2375b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayFrontStandardCounterActivity this$0;

    static {
        Covode.recordClassIndex(8583);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFrontStandardCounterActivity$insufficientBalanceFragment$2(CJPayFrontStandardCounterActivity cJPayFrontStandardCounterActivity) {
        super(0);
        this.this$0 = cJPayFrontStandardCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.android.ttcjpaysdk.thirdparty.front.counter.fragment.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2375b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2375b c2375b = new C2375b();
        c2375b.LIZ(new C137393cgX(this));
        return c2375b;
    }
}
