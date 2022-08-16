package com.android.ttcjpaysdk.thirdparty.front.counter.fragment;

import com.android.ttcjpaysdk.base.p135ui.Utils.p136a.C2174c;
import com.android.ttcjpaysdk.base.p135ui.data.RetainInfo;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136373cQ4;
import p003X.C136687cV8;
import p003X.C136800cWx;

/* loaded from: classes17.dex */
public final class NewInsufficientBalanceFragment$keepDialogConfig$2 extends Lambda implements Function0<C2174c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2377d this$0;

    static {
        Covode.recordClassIndex(8657);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewInsufficientBalanceFragment$keepDialogConfig$2(C2377d c2377d) {
        super(0);
        this.this$0 = c2377d;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.android.ttcjpaysdk.base.ui.Utils.a.c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.android.ttcjpaysdk.base.ui.Utils.a.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2174c mo30099invoke() {
        String str;
        RetainInfo retainInfo;
        CJPayTradeInfo cJPayTradeInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2377d c2377d = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c2377d, C2377d.LIZ, false, 31);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C136373cQ4 c136373cQ4 = CJPayCheckoutCounterActivity.LJIIIZ;
        if (c136373cQ4 == null || (cJPayTradeInfo = c136373cQ4.trade_info) == null || (str = cJPayTradeInfo.trade_no) == null) {
            str = "";
        }
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo = c2377d.LIZIZ;
        if (cJPayInsufficientBalanceHintInfo != null) {
            retainInfo = cJPayInsufficientBalanceHintInfo.retain_info;
        } else {
            retainInfo = null;
        }
        return new C136687cV8(c2377d, str, retainInfo, false, new C136800cWx(c2377d));
    }
}
