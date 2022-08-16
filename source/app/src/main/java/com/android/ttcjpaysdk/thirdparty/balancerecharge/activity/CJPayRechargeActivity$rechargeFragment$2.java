package com.android.ttcjpaysdk.thirdparty.balancerecharge.activity;

import com.android.ttcjpaysdk.thirdparty.balancerecharge.p162a.C2301a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class CJPayRechargeActivity$rechargeFragment$2 extends Lambda implements Function0<C2301a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayRechargeActivity this$0;

    static {
        Covode.recordClassIndex(8035);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayRechargeActivity$rechargeFragment$2(CJPayRechargeActivity cJPayRechargeActivity) {
        super(0);
        this.this$0 = cJPayRechargeActivity;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.android.ttcjpaysdk.thirdparty.balancerecharge.a.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2301a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2301a c2301a = new C2301a();
        c2301a.LJII = this.this$0;
        return c2301a;
    }
}
