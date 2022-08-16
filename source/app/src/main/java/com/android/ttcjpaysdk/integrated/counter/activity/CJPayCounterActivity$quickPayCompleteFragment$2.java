package com.android.ttcjpaysdk.integrated.counter.activity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.service.ICJPayCounterService;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C137121cc9;
import p003X.C137130ccI;
import p003X.C137131ccJ;
import p003X.C137134ccM;
import p003X.C137228cds;
import p003X.C137356cfw;

/* loaded from: classes17.dex */
public final class CJPayCounterActivity$quickPayCompleteFragment$2 extends Lambda implements Function0<Fragment> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayCounterActivity this$0;

    static {
        Covode.recordClassIndex(7535);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayCounterActivity$quickPayCompleteFragment$2(CJPayCounterActivity cJPayCounterActivity) {
        super(0);
        this.this$0 = cJPayCounterActivity;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Fragment mo30099invoke() {
        Fragment fragment;
        C137134ccM c137134ccM;
        C137228cds c137228cds;
        C137134ccM c137134ccM2;
        C137130ccI c137130ccI;
        String str;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ICJPayCounterService iCJPayCounterService = this.this$0.f25498LJ;
        String str2 = null;
        if (iCJPayCounterService != null) {
            C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
            ICJPayCounterService iCJPayCounterService2 = this.this$0.f25498LJ;
            if (iCJPayCounterService2 != null) {
                str = iCJPayCounterService2.getSource();
            } else {
                str = null;
            }
            fragment = iCJPayCounterService.getCompleteFragment(c137121cc9.LIZIZ(str));
        } else {
            fragment = null;
        }
        Bundle bundle = new Bundle();
        C2278i c2278i = C2272a.LIZIZ;
        if (c2278i != null && (c137134ccM2 = c2278i.data) != null && (c137130ccI = c137134ccM2.trade_info) != null) {
            str2 = c137130ccI.trade_no;
        }
        bundle.putString("trade_no", str2);
        C2278i c2278i2 = C2272a.LIZIZ;
        if (c2278i2 != null && (c137134ccM = c2278i2.data) != null && (c137228cds = c137134ccM.cashdesk_show_conf) != null) {
            i = c137228cds.show_style;
        }
        bundle.putInt("cash_desk_show_style", i);
        bundle.putBoolean("is_from_outer_pay", C2272a.LJIJ);
        if (fragment != null) {
            fragment.setArguments(bundle);
        }
        ICJPayCounterService iCJPayCounterService3 = this.this$0.f25498LJ;
        if (iCJPayCounterService3 != null) {
            iCJPayCounterService3.setSharedParams(this.this$0.LJII);
        }
        ICJPayCounterService iCJPayCounterService4 = this.this$0.f25498LJ;
        if (iCJPayCounterService4 != null) {
            iCJPayCounterService4.setCompleteCallBack(new C137131ccJ(this));
        }
        return fragment;
    }
}
