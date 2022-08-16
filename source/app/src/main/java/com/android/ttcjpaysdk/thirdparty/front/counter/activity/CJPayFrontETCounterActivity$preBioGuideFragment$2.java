package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2316m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136423cQs;

/* loaded from: classes17.dex */
public final class CJPayFrontETCounterActivity$preBioGuideFragment$2 extends Lambda implements Function0<C2316m> {
    public static final CJPayFrontETCounterActivity$preBioGuideFragment$2 INSTANCE = new CJPayFrontETCounterActivity$preBioGuideFragment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(8551);
    }

    public CJPayFrontETCounterActivity$preBioGuideFragment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.android.ttcjpaysdk.thirdparty.counter.c.m] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2316m mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2316m c2316m = new C2316m();
        c2316m.LIZJ = C136423cQs.LIZIZ.LIZ();
        return c2316m;
    }
}
