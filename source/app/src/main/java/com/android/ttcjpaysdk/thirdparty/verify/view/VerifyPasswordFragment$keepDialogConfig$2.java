package com.android.ttcjpaysdk.thirdparty.verify.view;

import com.android.ttcjpaysdk.base.p135ui.Utils.p136a.C2174c;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayPayInfo;
import com.android.ttcjpaysdk.base.p135ui.data.RetainInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC136583cTS;
import p003X.AbstractC136594cTd;
import p003X.C136593cTc;
import p003X.C136596cTf;
import p003X.C136598cTh;

/* loaded from: classes17.dex */
public final class VerifyPasswordFragment$keepDialogConfig$2 extends Lambda implements Function0<C2174c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C136598cTh this$0;

    static {
        Covode.recordClassIndex(8978);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasswordFragment$keepDialogConfig$2(C136598cTh c136598cTh) {
        super(0);
        this.this$0 = c136598cTh;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.android.ttcjpaysdk.base.ui.Utils.a.c] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.android.ttcjpaysdk.base.ui.Utils.a.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2174c mo30099invoke() {
        String str;
        RetainInfo retainInfo;
        AbstractC136583cTS LJIJ;
        CJPayPayInfo LIZLLL;
        AbstractC136583cTS LJIJ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C136598cTh c136598cTh = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c136598cTh, C136598cTh.LIZIZ, false, 25);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        AbstractC136594cTd abstractC136594cTd = c136598cTh.LIZLLL;
        if (abstractC136594cTd == null || (LJIJ2 = abstractC136594cTd.LJIJ()) == null || (str = LJIJ2.LJI()) == null) {
            str = "";
        }
        AbstractC136594cTd abstractC136594cTd2 = c136598cTh.LIZLLL;
        if (abstractC136594cTd2 == null || (LJIJ = abstractC136594cTd2.LJIJ()) == null || (LIZLLL = LJIJ.LIZLLL()) == null || (retainInfo = LIZLLL.retain_info) == null) {
            retainInfo = new RetainInfo(null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, 65535, null);
        }
        return new C136593cTc(c136598cTh, str, retainInfo, str, retainInfo, c136598cTh.LJIIJ, c136598cTh.LJIIJJI, new C136596cTf(c136598cTh));
    }
}
