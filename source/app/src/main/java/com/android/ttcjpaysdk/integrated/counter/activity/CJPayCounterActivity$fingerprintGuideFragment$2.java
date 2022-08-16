package com.android.ttcjpaysdk.integrated.counter.activity;

import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.service.ICJPayCounterService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C137121cc9;
import p003X.C137356cfw;

/* loaded from: classes17.dex */
public final class CJPayCounterActivity$fingerprintGuideFragment$2 extends Lambda implements Function0<Fragment> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayCounterActivity this$0;

    static {
        Covode.recordClassIndex(7519);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayCounterActivity$fingerprintGuideFragment$2(CJPayCounterActivity cJPayCounterActivity) {
        super(0);
        this.this$0 = cJPayCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Fragment mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ICJPayCounterService iCJPayCounterService = this.this$0.f25498LJ;
        String str = null;
        if (iCJPayCounterService == null) {
            return null;
        }
        C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
        ICJPayCounterService iCJPayCounterService2 = this.this$0.f25498LJ;
        if (iCJPayCounterService2 != null) {
            str = iCJPayCounterService2.getSource();
        }
        return iCJPayCounterService.getFingerprintGuideFragment(c137121cc9.LIZIZ(str));
    }
}
