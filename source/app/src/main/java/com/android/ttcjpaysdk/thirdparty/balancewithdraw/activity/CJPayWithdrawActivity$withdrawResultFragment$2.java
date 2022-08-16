package com.android.ttcjpaysdk.thirdparty.balancewithdraw.activity;

import com.android.ttcjpaysdk.thirdparty.balancewithdraw.p164a.C2306b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class CJPayWithdrawActivity$withdrawResultFragment$2 extends Lambda implements Function0<C2306b> {
    public static final CJPayWithdrawActivity$withdrawResultFragment$2 INSTANCE = new CJPayWithdrawActivity$withdrawResultFragment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(8062);
    }

    public CJPayWithdrawActivity$withdrawResultFragment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.android.ttcjpaysdk.thirdparty.balancewithdraw.a.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2306b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2306b();
    }
}
