package com.android.ttcjpaysdk.integrated.counter.fragment;

import com.android.ttcjpaysdk.base.p135ui.Utils.p136a.C2174c;
import com.android.ttcjpaysdk.base.p135ui.data.RetainInfo;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136656cUd;
import p003X.C137127ccF;
import p003X.C137130ccI;
import p003X.C137134ccM;
import p003X.C137147ccZ;

/* loaded from: classes17.dex */
public final class CJPayConfirmFragment$keepDialogConfig$2 extends Lambda implements Function0<C2174c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2285b this$0;

    static {
        Covode.recordClassIndex(7726);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayConfirmFragment$keepDialogConfig$2(C2285b c2285b) {
        super(0);
        this.this$0 = c2285b;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.android.ttcjpaysdk.base.ui.Utils.a.c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.android.ttcjpaysdk.base.ui.Utils.a.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2174c mo30099invoke() {
        String str;
        RetainInfo retainInfo;
        C137134ccM c137134ccM;
        C137130ccI c137130ccI;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2285b c2285b = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c2285b, C2285b.LIZ, false, 58);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C2278i c2278i = C2272a.LIZIZ;
        if (c2278i == null || (c137134ccM = c2278i.data) == null || (c137130ccI = c137134ccM.trade_info) == null || (str = c137130ccI.trade_no) == null) {
            str = "";
        }
        C137147ccZ LIZ = C2272a.LIZ();
        if (LIZ != null) {
            retainInfo = LIZ.retain_info;
        } else {
            retainInfo = null;
        }
        return new C137127ccF(c2285b, str, retainInfo, false, new C136656cUd(c2285b));
    }
}
