package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2376c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136766cWP;

/* loaded from: classes17.dex */
public final class CJPayFrontETCounterActivity$frontMethodFragment$2 extends Lambda implements Function0<C2376c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayFrontETCounterActivity this$0;

    static {
        Covode.recordClassIndex(8534);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFrontETCounterActivity$frontMethodFragment$2(CJPayFrontETCounterActivity cJPayFrontETCounterActivity) {
        super(0);
        this.this$0 = cJPayFrontETCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.android.ttcjpaysdk.thirdparty.front.counter.fragment.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2376c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2376c c2376c = new C2376c();
        c2376c.f25533LJ = new C136766cWP(c2376c, this);
        return c2376c;
    }
}
