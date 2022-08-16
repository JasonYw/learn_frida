package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2314h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136423cQs;

/* loaded from: classes17.dex */
public final class CJPayFrontETCounterActivity$fingerprintGuideFragment$2 extends Lambda implements Function0<C2314h> {
    public static final CJPayFrontETCounterActivity$fingerprintGuideFragment$2 INSTANCE = new CJPayFrontETCounterActivity$fingerprintGuideFragment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(8533);
    }

    public CJPayFrontETCounterActivity$fingerprintGuideFragment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.android.ttcjpaysdk.thirdparty.counter.c.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2314h mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2314h c2314h = new C2314h();
        c2314h.LJFF = C136423cQs.LIZIZ.LIZ();
        return c2314h;
    }
}
