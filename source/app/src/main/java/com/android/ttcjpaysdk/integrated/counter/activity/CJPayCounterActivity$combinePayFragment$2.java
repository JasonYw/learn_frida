package com.android.ttcjpaysdk.integrated.counter.activity;

import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.service.ICJPayCombineService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class CJPayCounterActivity$combinePayFragment$2 extends Lambda implements Function0<Fragment> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayCounterActivity this$0;

    static {
        Covode.recordClassIndex(7512);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayCounterActivity$combinePayFragment$2(CJPayCounterActivity cJPayCounterActivity) {
        super(0);
        this.this$0 = cJPayCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Fragment mo30099invoke() {
        Fragment fragment;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ICJPayCombineService iCJPayCombineService = this.this$0.LJI;
        if (iCJPayCombineService != null) {
            iCJPayCombineService.setShareData(this.this$0.LIZJ);
        }
        ICJPayCombineService iCJPayCombineService2 = this.this$0.LJI;
        if (iCJPayCombineService2 == null || (fragment = iCJPayCombineService2.getFragment()) == null) {
            return new Fragment();
        }
        return fragment;
    }
}
