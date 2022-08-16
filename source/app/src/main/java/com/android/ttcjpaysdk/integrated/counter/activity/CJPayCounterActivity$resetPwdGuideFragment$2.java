package com.android.ttcjpaysdk.integrated.counter.activity;

import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayCounterService;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class CJPayCounterActivity$resetPwdGuideFragment$2 extends Lambda implements Function0<Fragment> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayCounterActivity this$0;

    static {
        Covode.recordClassIndex(7538);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayCounterActivity$resetPwdGuideFragment$2(CJPayCounterActivity cJPayCounterActivity) {
        super(0);
        this.this$0 = cJPayCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Fragment mo30099invoke() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ICJPayCounterService iCJPayCounterService = this.this$0.f25498LJ;
        String str2 = null;
        if (iCJPayCounterService == null) {
            return null;
        }
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        if (cJPayHostInfo != null) {
            str = cJPayHostInfo.merchantId;
        } else {
            str = null;
        }
        CJPayHostInfo cJPayHostInfo2 = C2272a.LIZJ;
        if (cJPayHostInfo2 != null) {
            str2 = cJPayHostInfo2.appId;
        }
        return iCJPayCounterService.getResetPwdGuideFragment(CJPayParamsUtils.LIZ(str, str2));
    }
}
