package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2376c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136767cWQ;

/* loaded from: classes17.dex */
public final class CJPayFrontStandardCounterActivity$frontMethodFragment$2 extends Lambda implements Function0<C2376c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayFrontStandardCounterActivity this$0;

    static {
        Covode.recordClassIndex(8578);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFrontStandardCounterActivity$frontMethodFragment$2(CJPayFrontStandardCounterActivity cJPayFrontStandardCounterActivity) {
        super(0);
        this.this$0 = cJPayFrontStandardCounterActivity;
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
        c2376c.f25533LJ = new C136767cWQ(c2376c, this);
        return c2376c;
    }
}
