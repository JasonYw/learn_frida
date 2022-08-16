package com.android.ttcjpaysdk.thirdparty.balancerecharge.activity;

import com.android.ttcjpaysdk.thirdparty.balancerecharge.p162a.C2302b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class CJPayRechargeActivity$rechargeResultFragment$2 extends Lambda implements Function0<C2302b> {
    public static final CJPayRechargeActivity$rechargeResultFragment$2 INSTANCE = new CJPayRechargeActivity$rechargeResultFragment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(8036);
    }

    public CJPayRechargeActivity$rechargeResultFragment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.android.ttcjpaysdk.thirdparty.balancerecharge.a.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2302b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2302b();
    }
}
