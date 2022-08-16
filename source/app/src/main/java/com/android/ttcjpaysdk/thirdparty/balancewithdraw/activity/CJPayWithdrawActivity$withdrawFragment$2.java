package com.android.ttcjpaysdk.thirdparty.balancewithdraw.activity;

import com.android.ttcjpaysdk.thirdparty.balancewithdraw.p164a.C2305a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class CJPayWithdrawActivity$withdrawFragment$2 extends Lambda implements Function0<C2305a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayWithdrawActivity this$0;

    static {
        Covode.recordClassIndex(8061);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayWithdrawActivity$withdrawFragment$2(CJPayWithdrawActivity cJPayWithdrawActivity) {
        super(0);
        this.this$0 = cJPayWithdrawActivity;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.android.ttcjpaysdk.thirdparty.balancewithdraw.a.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2305a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2305a c2305a = new C2305a();
        c2305a.LJII = this.this$0;
        return c2305a;
    }
}
