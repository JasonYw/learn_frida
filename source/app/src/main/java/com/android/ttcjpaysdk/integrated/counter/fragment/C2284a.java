package com.android.ttcjpaysdk.integrated.counter.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.integrated.counter.b$c;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.data.TradeQueryBean;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.android.ttcjpaysdk.integrated.counter.p156d.C2274a;
import com.android.ttcjpaysdk.integrated.counter.p158e.C2281a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC136089cLU;
import p003X.AbstractC137193cdJ;
import p003X.AbstractC137355cfv;
import p003X.C106862S5w;
import p003X.C136467cRa;
import p003X.C137121cc9;
import p003X.C137130ccI;
import p003X.C137134ccM;
import p003X.C137168ccu;
import p003X.C137169ccv;
import p003X.C137172ccy;
import p003X.C137174cd0;
import p003X.C137218cdi;
import p003X.C137222cdm;
import p003X.C137228cds;
import p003X.C137309cfB;
import p003X.C137322cfO;
import p003X.C137356cfw;
import p003X.C137357cfx;
import p003X.C137366cg6;
import p003X.C137375cgF;
import p003X.RunnableC137208cdY;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.fragment.a */
/* loaded from: classes17.dex */
public final class C2284a extends AbstractC136089cLU<C2281a> implements b$c {
    public static ChangeQuickRedirect LIZ;
    public AbstractC137355cfv LIZIZ;

    /* renamed from: LJ */
    public TradeQueryBean f25501LJ;
    public AbstractC137193cdJ LJFF;
    public HashMap LJIIJ;

    static {
        Covode.recordClassIndex(7727);
    }

    @Override // p003X.AbstractC136089cLU, p003X.AbstractC136022cKP
    public final void LIZ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (hashMap = this.LJIIJ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690615;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "支付收银台";
    }

    @Override // p003X.AbstractC136022cKP
    public final C2124b LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2274a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStart();
        if (this.LJFF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStop();
        if (this.LJFF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
    }

    @Override // p003X.AbstractC136089cLU, p003X.AbstractC136022cKP, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        AbstractC137193cdJ abstractC137193cdJ = this.LJFF;
        if (abstractC137193cdJ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC137193cdJ.LIZ();
        super.onDestroyView();
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("alipay", r2) != false) goto L26;
     */
    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZJ() {
        /*
            r5 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.integrated.counter.fragment.C2284a.LIZ
            r0 = 2
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            X.cdJ r0 = r5.LJFF
            java.lang.String r4 = ""
            if (r0 != 0) goto L18
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L18:
            r0.LIZJ()
            com.android.ttcjpaysdk.base.a r0 = com.android.ttcjpaysdk.base.C2118a.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult r0 = r0.LIZJ
            r3 = 1
            if (r0 == 0) goto L5f
            int r0 = r0.getCode()
            if (r0 != 0) goto L5f
            com.android.ttcjpaysdk.integrated.counter.b.a r0 = r5.LJJIIZI
            r2 = 0
            if (r0 == 0) goto L5d
            com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo r0 = r0.LJII
            if (r0 == 0) goto L5d
            java.lang.String r1 = r0.paymentType
        L38:
            java.lang.String r0 = "wx"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L52
            com.android.ttcjpaysdk.integrated.counter.b.a r0 = r5.LJJIIZI
            if (r0 == 0) goto L4a
            com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo r0 = r0.LJII
            if (r0 == 0) goto L4a
            java.lang.String r2 = r0.paymentType
        L4a:
            java.lang.String r0 = "alipay"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L5f
        L52:
            X.cdJ r0 = r5.LJFF
            if (r0 != 0) goto L59
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L59:
            r0.LIZ(r3)
            return
        L5d:
            r1 = r2
            goto L38
        L5f:
            X.cdJ r0 = r5.LJFF
            if (r0 != 0) goto L66
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L66:
            r0.LIZ(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.fragment.C2284a.LIZJ():void");
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onResume();
        AbstractC137193cdJ abstractC137193cdJ = this.LJFF;
        if (abstractC137193cdJ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC137193cdJ.LIZLLL != null) {
            AbstractC137193cdJ abstractC137193cdJ2 = this.LJFF;
            if (abstractC137193cdJ2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!abstractC137193cdJ2.f18147LJ) {
                AbstractC137193cdJ abstractC137193cdJ3 = this.LJFF;
                if (abstractC137193cdJ3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC137193cdJ3.f18147LJ = true;
                setIsQueryConnecting(true);
                AbstractC137193cdJ abstractC137193cdJ4 = this.LJFF;
                if (abstractC137193cdJ4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                RunnableC137208cdY runnableC137208cdY = abstractC137193cdJ4.LIZLLL;
                if (runnableC137208cdY != null && !PatchProxy.proxy(new Object[0], runnableC137208cdY, RunnableC137208cdY.LIZ, false, 2).isSupported) {
                    runnableC137208cdY.LIZJ.set(true);
                    if (runnableC137208cdY.LIZIZ != null) {
                        Thread thread = runnableC137208cdY.LIZIZ;
                        Intrinsics.checkNotNull(thread);
                        if (thread.isAlive()) {
                            return;
                        }
                    }
                    Thread thread2 = runnableC137208cdY.LIZIZ;
                    if (thread2 != null) {
                        thread2.start();
                    }
                }
            }
        }
    }

    private final void LJIIIIZZ() {
        TradeQueryBean tradeQueryBean;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && getContext() != null && (tradeQueryBean = this.f25501LJ) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String jsonString = tradeQueryBean.data.trade_info.toJsonString();
            Intrinsics.checkNotNullExpressionValue(jsonString, "");
            linkedHashMap.put("trade_info", jsonString);
            String str = C137322cfO.LJII;
            Intrinsics.checkNotNullExpressionValue(str, "");
            linkedHashMap.put("sign", str);
            linkedHashMap.put("sign_type", "MD5");
            C2118a.LIZ().LIZ(linkedHashMap);
            if (!TextUtils.isEmpty(tradeQueryBean.data.trade_info.status)) {
                String str2 = tradeQueryBean.data.trade_info.status;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1149187101:
                            if (str2.equals("SUCCESS")) {
                                LIZ(0);
                                return;
                            }
                            break;
                        case -595928767:
                            if (str2.equals("TIMEOUT")) {
                                LIZ(103);
                                return;
                            }
                            break;
                        case 2150174:
                            if (str2.equals("FAIL")) {
                                LIZ(102);
                                return;
                            }
                            break;
                        case 907287315:
                            if (str2.equals("PROCESSING")) {
                                LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                                return;
                            }
                            break;
                    }
                }
                LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                return;
            }
            LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 3).isSupported) {
            return;
        }
        AbstractC137193cdJ abstractC137193cdJ = this.LJFF;
        if (abstractC137193cdJ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC137193cdJ.LIZLLL();
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$c
    /* renamed from: c_ */
    public final void mo16050c_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        LIZIZ((TradeQueryBean) null);
        setIsQueryConnecting(false);
    }

    private final void LIZ(int i) {
        C2118a LIZ2;
        String str;
        TradeQueryBean.CJPayTradeQueryData cJPayTradeQueryData;
        C137130ccI c137130ccI;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 14).isSupported && (LIZ2 = C2118a.LIZ().LIZ(i)) != null) {
            C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
            TradeQueryBean tradeQueryBean = this.f25501LJ;
            if (tradeQueryBean != null && (cJPayTradeQueryData = tradeQueryBean.data) != null && (c137130ccI = cJPayTradeQueryData.trade_info) != null) {
                str = c137130ccI.ptcode;
            } else {
                str = null;
            }
            LIZ2.LIZ(c137121cc9.LIZ(str));
        }
    }

    private final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 16).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("result", str);
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ("wallet_cashier_pay_finish_page_imp", jSONObject);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported || z) {
            return;
        }
        AbstractC137193cdJ abstractC137193cdJ = this.LJFF;
        if (abstractC137193cdJ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC137193cdJ.LIZ(false);
        super.onHiddenChanged(z);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        AbstractC137193cdJ c137172ccy;
        C137134ccM c137134ccM;
        C137228cds c137228cds;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, C137357cfx.LIZ, C137375cgF.LIZ, false, 1);
        int i2 = 5;
        if (proxy.isSupported) {
            c137172ccy = (AbstractC137193cdJ) proxy.result;
        } else {
            C106862S5w.LIZ(view);
            if (C137366cg6.LIZ.m21712LJ()) {
                c137172ccy = new C137174cd0(view, 2131690617);
            } else {
                C2278i c2278i = C2272a.LIZIZ;
                if (c2278i != null && (c137134ccM = c2278i.data) != null && (c137228cds = c137134ccM.cashdesk_show_conf) != null && c137228cds.result_page_show_style == 1) {
                    c137172ccy = new C137169ccv(view, 2131690618);
                } else {
                    if (C2272a.LIZIZ != null) {
                        i = C2272a.LIZIZ.data.cashdesk_show_conf.show_style;
                    }
                    if (i == 5) {
                        c137172ccy = new C137168ccu(view, 2131690619);
                    } else {
                        c137172ccy = new C137172ccy(view, 2131690619);
                    }
                }
            }
        }
        this.LJFF = c137172ccy;
        AbstractC137193cdJ abstractC137193cdJ = this.LJFF;
        if (abstractC137193cdJ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC137193cdJ.LIZIZ();
        AbstractC137193cdJ abstractC137193cdJ2 = this.LJFF;
        if (abstractC137193cdJ2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC137193cdJ2.LIZJ = this.LIZIZ;
        AbstractC137193cdJ abstractC137193cdJ3 = this.LJFF;
        if (abstractC137193cdJ3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (C2272a.LIZIZ != null && C2272a.LIZIZ.data.cashdesk_show_conf.query_result_time_s > 0) {
            i2 = C2272a.LIZIZ.data.cashdesk_show_conf.query_result_time_s;
        }
        abstractC137193cdJ3.LIZLLL = new RunnableC137208cdY(500, i2);
        AbstractC137193cdJ abstractC137193cdJ4 = this.LJFF;
        if (abstractC137193cdJ4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        RunnableC137208cdY runnableC137208cdY = abstractC137193cdJ4.LIZLLL;
        if (runnableC137208cdY != null) {
            runnableC137208cdY.LJFF = new C137218cdi(this);
        }
        AbstractC137193cdJ abstractC137193cdJ5 = this.LJFF;
        if (abstractC137193cdJ5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC137193cdJ5.LJFF = new C137309cfB(this);
        AbstractC137193cdJ abstractC137193cdJ6 = this.LJFF;
        if (abstractC137193cdJ6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC137193cdJ6.LJI = new C137222cdm(this);
    }

    private final void LIZIZ(TradeQueryBean tradeQueryBean) {
        if (PatchProxy.proxy(new Object[]{tradeQueryBean}, this, LIZ, false, 12).isSupported) {
            return;
        }
        try {
            LJIIIIZZ();
            if (tradeQueryBean == null) {
                AbstractC137193cdJ abstractC137193cdJ = this.LJFF;
                if (abstractC137193cdJ == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC137193cdJ.mo21706LJ();
                LIZ("网络异常", "0");
            } else if (!Intrinsics.areEqual("CA0000", tradeQueryBean.code)) {
                AbstractC137193cdJ abstractC137193cdJ2 = this.LJFF;
                if (abstractC137193cdJ2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                String str = tradeQueryBean.code;
                Intrinsics.checkNotNullExpressionValue(str, "");
                abstractC137193cdJ2.LIZ(str);
                AbstractC137193cdJ abstractC137193cdJ3 = this.LJFF;
                if (abstractC137193cdJ3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                RunnableC137208cdY runnableC137208cdY = abstractC137193cdJ3.LIZLLL;
                if (runnableC137208cdY != null && runnableC137208cdY.LIZJ()) {
                    LIZ("支付处理中", "0");
                }
            } else if (tradeQueryBean.data.trade_info != null && !TextUtils.isEmpty(tradeQueryBean.data.trade_info.status)) {
                String str2 = tradeQueryBean.data.trade_info.status;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1149187101:
                            if (str2.equals("SUCCESS")) {
                                AbstractC137193cdJ abstractC137193cdJ4 = this.LJFF;
                                if (abstractC137193cdJ4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                abstractC137193cdJ4.LJI();
                                LIZ("支付成功", "1");
                                return;
                            }
                            break;
                        case -595928767:
                            if (str2.equals("TIMEOUT")) {
                                AbstractC137193cdJ abstractC137193cdJ5 = this.LJFF;
                                if (abstractC137193cdJ5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                abstractC137193cdJ5.LJIIIIZZ();
                                LIZ("支付超时", "0");
                                return;
                            }
                            break;
                        case 2150174:
                            if (str2.equals("FAIL")) {
                                AbstractC137193cdJ abstractC137193cdJ6 = this.LJFF;
                                if (abstractC137193cdJ6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                abstractC137193cdJ6.LJII();
                                LIZ("支付失败", "0");
                                return;
                            }
                            break;
                        case 907287315:
                            if (str2.equals("PROCESSING")) {
                                AbstractC137193cdJ abstractC137193cdJ7 = this.LJFF;
                                if (abstractC137193cdJ7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                abstractC137193cdJ7.LJFF();
                                AbstractC137193cdJ abstractC137193cdJ8 = this.LJFF;
                                if (abstractC137193cdJ8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                RunnableC137208cdY runnableC137208cdY2 = abstractC137193cdJ8.LIZLLL;
                                if (runnableC137208cdY2 != null && runnableC137208cdY2.LIZJ()) {
                                    LIZ("支付处理中", "0");
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                }
                AbstractC137193cdJ abstractC137193cdJ9 = this.LJFF;
                if (abstractC137193cdJ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC137193cdJ9.LJFF();
                AbstractC137193cdJ abstractC137193cdJ10 = this.LJFF;
                if (abstractC137193cdJ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                RunnableC137208cdY runnableC137208cdY3 = abstractC137193cdJ10.LIZLLL;
                if (runnableC137208cdY3 != null && runnableC137208cdY3.LIZJ()) {
                    LIZ("支付处理中", "0");
                }
            } else {
                AbstractC137193cdJ abstractC137193cdJ11 = this.LJFF;
                if (abstractC137193cdJ11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC137193cdJ11.LJFF();
                AbstractC137193cdJ abstractC137193cdJ12 = this.LJFF;
                if (abstractC137193cdJ12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                RunnableC137208cdY runnableC137208cdY4 = abstractC137193cdJ12.LIZLLL;
                if (runnableC137208cdY4 != null && runnableC137208cdY4.LIZJ()) {
                    LIZ("支付处理中", "0");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$c
    public final void LIZ(TradeQueryBean tradeQueryBean) {
        if (PatchProxy.proxy(new Object[]{tradeQueryBean}, this, LIZ, false, 10).isSupported) {
            return;
        }
        if (tradeQueryBean != null) {
            this.f25501LJ = tradeQueryBean;
            AbstractC137193cdJ abstractC137193cdJ = this.LJFF;
            if (abstractC137193cdJ == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC137193cdJ.LIZIZ = tradeQueryBean;
            AbstractC137193cdJ abstractC137193cdJ2 = this.LJFF;
            if (abstractC137193cdJ2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC137193cdJ2.LJII = tradeQueryBean.data.trade_info.ptcode;
            if (Intrinsics.areEqual("GW400008", tradeQueryBean.code)) {
                AbstractC137193cdJ abstractC137193cdJ3 = this.LJFF;
                if (abstractC137193cdJ3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                RunnableC137208cdY runnableC137208cdY = abstractC137193cdJ3.LIZLLL;
                if (runnableC137208cdY != null) {
                    runnableC137208cdY.LIZ();
                }
                C2118a.LIZ().LIZ(108);
                C136467cRa.LIZ();
                setIsQueryConnecting(false);
            } else {
                LIZIZ(tradeQueryBean);
            }
        } else {
            LIZIZ((TradeQueryBean) null);
        }
        AbstractC137193cdJ abstractC137193cdJ4 = this.LJFF;
        if (abstractC137193cdJ4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        RunnableC137208cdY runnableC137208cdY2 = abstractC137193cdJ4.LIZLLL;
        if (runnableC137208cdY2 != null) {
            runnableC137208cdY2.f18150LJ = false;
        }
    }

    private final void LIZ(String str, String str2) {
        String str3;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 15).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", str2);
            jSONObject.put("status", str);
            AbstractC137355cfv abstractC137355cfv = this.LIZIZ;
            if (abstractC137355cfv != null) {
                str3 = abstractC137355cfv.LIZIZ();
            } else {
                str3 = null;
            }
            jSONObject.put("risk_type", str3);
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ(getContext(), "wallet_cashier_result", jSONObject);
        LIZIZ(str);
    }
}
