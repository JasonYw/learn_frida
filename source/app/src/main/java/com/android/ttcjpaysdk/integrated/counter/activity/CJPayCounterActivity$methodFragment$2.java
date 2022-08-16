package com.android.ttcjpaysdk.integrated.counter.activity;

import com.android.ttcjpaysdk.integrated.counter.fragment.C2286c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C137125ccD;

/* loaded from: classes17.dex */
public final class CJPayCounterActivity$methodFragment$2 extends Lambda implements Function0<C2286c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayCounterActivity this$0;

    static {
        Covode.recordClassIndex(7528);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayCounterActivity$methodFragment$2(CJPayCounterActivity cJPayCounterActivity) {
        super(0);
        this.this$0 = cJPayCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.android.ttcjpaysdk.integrated.counter.fragment.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2286c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2286c c2286c = new C2286c();
        c2286c.LJJIIZI = this.this$0.LIZJ;
        c2286c.LJIIJJI = new C137125ccD(c2286c, this);
        return c2286c;
    }
}
