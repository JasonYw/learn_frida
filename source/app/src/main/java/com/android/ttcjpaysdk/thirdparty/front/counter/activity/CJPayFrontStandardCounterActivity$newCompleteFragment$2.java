package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import android.os.Bundle;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2312d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136423cQs;

/* loaded from: classes17.dex */
public final class CJPayFrontStandardCounterActivity$newCompleteFragment$2 extends Lambda implements Function0<C2312d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayFrontStandardCounterActivity this$0;

    static {
        Covode.recordClassIndex(8590);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFrontStandardCounterActivity$newCompleteFragment$2(CJPayFrontStandardCounterActivity cJPayFrontStandardCounterActivity) {
        super(0);
        this.this$0 = cJPayFrontStandardCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.android.ttcjpaysdk.thirdparty.counter.c.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2312d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2312d c2312d = new C2312d();
        c2312d.LIZIZ = this.this$0.LJIILJJIL;
        c2312d.LIZJ = this.this$0.LJIILLIIL;
        c2312d.LJIIL = this.this$0.LJIIZILJ;
        c2312d.LJFF = C136423cQs.LIZIZ.LIZ();
        Bundle bundle = new Bundle();
        bundle.putInt("cash_desk_show_style", 6);
        c2312d.setArguments(bundle);
        return c2312d;
    }
}
