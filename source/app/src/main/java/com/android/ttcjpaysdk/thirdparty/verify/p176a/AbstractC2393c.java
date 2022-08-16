package com.android.ttcjpaysdk.thirdparty.verify.p176a;

import android.view.View;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeConfirmResponseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C136452cRL;
import p003X.C136509cSG;
import p003X.C136550cSv;
import p003X.View$OnClickListenerC136391cQM;
import p003X.View$OnClickListenerC136392cQN;

/* renamed from: com.android.ttcjpaysdk.thirdparty.verify.a.c */
/* loaded from: classes17.dex */
public abstract class AbstractC2393c {
    public static ChangeQuickRedirect LIZ;
    public C136452cRL LIZIZ;
    public boolean LIZJ;

    static {
        Covode.recordClassIndex(8905);
    }

    public void LIZ() {
    }

    public void LIZ(int i, int i2, int i3, boolean z) {
    }

    public void LIZ(String str, int i, int i2, boolean z) {
    }

    public void LIZ(JSONObject jSONObject) {
    }

    public abstract boolean LIZ(CJPayTradeConfirmResponseBean cJPayTradeConfirmResponseBean);

    public abstract boolean LIZ(CJPayTradeConfirmResponseBean cJPayTradeConfirmResponseBean, AbstractC2393c abstractC2393c);

    public abstract void LIZIZ();

    public abstract void LIZIZ(CJPayTradeConfirmResponseBean cJPayTradeConfirmResponseBean);

    public boolean LIZJ() {
        return false;
    }

    public AbstractC2392a LIZLLL() {
        return null;
    }

    /* renamed from: LJ */
    public boolean mo16029LJ() {
        return false;
    }

    public boolean LJFF() {
        return false;
    }

    public int LJIIIIZZ() {
        return -1;
    }

    public boolean LJIIJ() {
        return true;
    }

    public final boolean LJIIIZ() {
        return this instanceof C136550cSv;
    }

    public C136509cSG LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (C136509cSG) proxy.result;
        }
        return new C136509cSG();
    }

    public final CJPayHostInfo LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (CJPayHostInfo) proxy.result;
        }
        CJPayHostInfo cJPayHostInfo = new CJPayHostInfo();
        cJPayHostInfo.merchantId = this.LIZIZ.LIZ().LJI.mo16028LJ();
        cJPayHostInfo.appId = this.LIZIZ.LIZ().LJI.LIZLLL();
        return cJPayHostInfo;
    }

    public AbstractC2393c(C136452cRL c136452cRL) {
        this.LIZIZ = c136452cRL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (((java.lang.Boolean) r3.result).booleanValue() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.android.ttcjpaysdk.base.framework.BaseActivity r12, com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.verify.p176a.AbstractC2393c.LIZ(com.android.ttcjpaysdk.base.framework.BaseActivity, com.android.ttcjpaysdk.base.ui.data.CJPayButtonInfo):void");
    }

    private View.OnClickListener LIZ(int i, BaseActivity baseActivity, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), baseActivity, str}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (View.OnClickListener) proxy.result;
        }
        if (baseActivity != null && !baseActivity.isFinishing()) {
            return new View$OnClickListenerC136391cQM(this, baseActivity, i, str);
        }
        return null;
    }

    private View.OnClickListener LIZ(int i, BaseActivity baseActivity, String str, CJPayButtonInfo cJPayButtonInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), baseActivity, str, cJPayButtonInfo}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (View.OnClickListener) proxy.result;
        }
        if (baseActivity != null && !baseActivity.isFinishing()) {
            return new View$OnClickListenerC136392cQN(this, baseActivity, i, cJPayButtonInfo, str);
        }
        return null;
    }
}
