package com.android.ttcjpaysdk.thirdparty.verify.p177vm;

import com.android.ttcjpaysdk.base.p135ui.Utils.p136a.C2174c;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayPayInfo;
import com.android.ttcjpaysdk.base.p135ui.data.RetainInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC136583cTS;
import p003X.C136452cRL;
import p003X.C136546cSr;
import p003X.C136550cSv;
import p003X.C136555cT0;
import p003X.C136559cT4;

/* renamed from: com.android.ttcjpaysdk.thirdparty.verify.vm.VerifyOneStepPaymentVM$keepDialogConfig$2 */
/* loaded from: classes17.dex */
public final class VerifyOneStepPaymentVM$keepDialogConfig$2 extends Lambda implements Function0<C2174c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C136550cSv this$0;

    static {
        Covode.recordClassIndex(9135);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyOneStepPaymentVM$keepDialogConfig$2(C136550cSv c136550cSv) {
        super(0);
        this.this$0 = c136550cSv;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.android.ttcjpaysdk.base.ui.Utils.a.c] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.android.ttcjpaysdk.base.ui.Utils.a.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2174c mo30099invoke() {
        String str;
        RetainInfo retainInfo;
        AbstractC136583cTS abstractC136583cTS;
        CJPayPayInfo LIZLLL;
        C136546cSr LIZ;
        AbstractC136583cTS abstractC136583cTS2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C136550cSv c136550cSv = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c136550cSv, C136550cSv.LIZLLL, false, 23);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C136452cRL c136452cRL = c136550cSv.LIZIZ;
        if (c136452cRL == null || (LIZ = c136452cRL.LIZ()) == null || (abstractC136583cTS2 = LIZ.LJIILIIL) == null || (str = abstractC136583cTS2.LJI()) == null) {
            str = "";
        }
        C136452cRL c136452cRL2 = c136550cSv.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(c136452cRL2, "");
        C136546cSr LIZ2 = c136452cRL2.LIZ();
        if (LIZ2 != null && (abstractC136583cTS = LIZ2.LJIILIIL) != null && (LIZLLL = abstractC136583cTS.LIZLLL()) != null) {
            retainInfo = LIZLLL.retain_info;
        } else {
            retainInfo = null;
        }
        return new C136559cT4(c136550cSv, str, retainInfo, true, true, new C136555cT0(c136550cSv));
    }
}
