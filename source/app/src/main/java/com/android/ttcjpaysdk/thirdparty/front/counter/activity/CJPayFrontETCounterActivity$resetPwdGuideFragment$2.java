package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2317n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class CJPayFrontETCounterActivity$resetPwdGuideFragment$2 extends Lambda implements Function0<C2317n> {
    public static final CJPayFrontETCounterActivity$resetPwdGuideFragment$2 INSTANCE = new CJPayFrontETCounterActivity$resetPwdGuideFragment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(8554);
    }

    public CJPayFrontETCounterActivity$resetPwdGuideFragment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.android.ttcjpaysdk.thirdparty.counter.c.n] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2317n mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2317n();
    }
}
