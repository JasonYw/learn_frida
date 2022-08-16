package com.android.ttcjpaysdk.integrated.counter.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayPayInfo;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.ICJPayWXPaymentService;
import com.android.ttcjpaysdk.base.service.bean.H5SchemeParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.integrated.counter.b$a;
import com.android.ttcjpaysdk.integrated.counter.data.C2279k;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.android.ttcjpaysdk.integrated.counter.data.TradeQueryBean;
import com.android.ttcjpaysdk.integrated.counter.data.UserInfo;
import com.android.ttcjpaysdk.integrated.counter.p153a.C2269a;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.android.ttcjpaysdk.integrated.counter.p156d.C2274a;
import com.android.ttcjpaysdk.integrated.counter.p158e.C2282b;
import com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper;
import com.android.ttcjpaysdk.ttcjpayapi.ICustomActionListener;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.dypay.api.DyPay;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC136089cLU;
import p003X.AbstractC137216cdg;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135465cBQ;
import p003X.C137118cc6;
import p003X.C137121cc9;
import p003X.C137130ccI;
import p003X.C137132ccK;
import p003X.C137155cch;
import p003X.C137192cdI;
import p003X.C137206cdW;
import p003X.C137295cex;
import p003X.C137354cfu;
import p003X.C137356cfw;
import p003X.C137370cgA;
import p003X.C137373cgD;
import p003X.C137376cgG;
import p003X.C137390cgU;
import p003X.DialogC136955cZS;
import p003X.DialogC137460chc;
import p003X.RunnableC137198cdO;
import p003X.RunnableC137209cdZ;
import p003X.RunnableC137232cdw;
import p003X.View$OnClickListenerC137224cdo;
import p003X.View$OnClickListenerC137252ceG;
import p003X.View$OnClickListenerC137340cfg;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.fragment.b */
/* loaded from: classes17.dex */
public final class C2285b extends AbstractC136089cLU<C2282b> implements b$a {
    public static ChangeQuickRedirect LIZ;
    public AbstractC137216cdg LIZIZ;

    /* renamed from: LJ */
    public BaseConfirmWrapper f25502LJ;
    public C2269a LJIIJ;
    public DialogC137460chc LJIIJJI;
    public volatile boolean LJIIL;
    public volatile boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIJI;
    public boolean LJIJJLI;
    public HashMap LJJ;
    public static final C137118cc6 LJIJ = new C137118cc6((byte) 0);
    public static final String LJIIZILJ = "CJPayConfirmFragment";
    public ArrayList<PaymentMethodInfo> LJFF = new ArrayList<>();
    public int LJIJJ = 1;
    public String LJIILL = "";
    public final Lazy LJIILLIIL = LazyKt__LazyJVMKt.lazy(new CJPayConfirmFragment$keepDialogConfig$2(this));
    public boolean LJIL = true;

    @Override // p003X.AbstractC136089cLU, p003X.AbstractC136022cKP
    public final void LIZ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 79).isSupported && (hashMap = this.LJJ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690616;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "支付收银台";
    }

    public final void LJIJI() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 56).isSupported;
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$a
    public final void LIZ(C2279k c2279k) {
        JSONObject jSONObject;
        C2279k c2279k2;
        C137354cfu c137354cfu;
        C137295cex c137295cex;
        C137132ccK c137132ccK;
        CJPayPayInfo cJPayPayInfo;
        ICJPayH5Service iCJPayH5Service;
        C137354cfu c137354cfu2;
        C137295cex c137295cex2;
        C137132ccK c137132ccK2;
        CJPayPayInfo cJPayPayInfo2;
        C137354cfu c137354cfu3;
        C137295cex c137295cex3;
        C137132ccK c137132ccK3;
        CJPayPayInfo cJPayPayInfo3;
        AbstractC137216cdg abstractC137216cdg;
        if (!PatchProxy.proxy(new Object[]{c2279k}, this, LIZ, false, 26).isSupported && c2279k != null) {
            if (!c2279k.isResponseOk()) {
                this.LJIILJJIL = false;
                if (PatchProxy.proxy(new Object[]{c2279k}, this, LIZ, false, 29).isSupported) {
                    return;
                }
                LJIILL();
                C2272a.LJIIIIZZ();
                String str = c2279k.error.type;
                if (str != null && str.hashCode() == -1483538319 && str.equals("single_btn_box")) {
                    String str2 = c2279k.error.type_cnt;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    if (str2.length() != 0) {
                        C137390cgU c137390cgU = (C137390cgU) CJPayJsonParser.fromJson(c2279k.error.type_cnt, C137390cgU.class);
                        if (c137390cgU == null) {
                            return;
                        }
                        CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(getActivity());
                        defaultBuilder.setTitle(c137390cgU.body_text);
                        defaultBuilder.setSingleBtnStr(c137390cgU.btn_text);
                        defaultBuilder.setSingleBtnListener(new View$OnClickListenerC137340cfg(this));
                        defaultBuilder.setWidth(270);
                        C116971W2r.LIZJ(CJPayDialogUtils.initDialog(defaultBuilder));
                        return;
                    }
                }
                CJPayBasicUtils.displayToast(getContext(), c2279k.error.msg);
            } else if (PatchProxy.proxy(new Object[]{c2279k}, this, LIZ, false, 28).isSupported) {
            } else {
                C2272a.f25499LJ = c2279k;
                String str3 = c2279k.data.pay_params.ptcode;
                if (str3 != null) {
                    int hashCode = str3.hashCode();
                    if (hashCode != -951532658) {
                        if (hashCode == 96067571 && str3.equals("dypay")) {
                            LJIILLIIL();
                            String str4 = C2272a.f25499LJ.data.pay_params.data;
                            Intrinsics.checkNotNullExpressionValue(str4, "");
                            new DyPay(getActivity()).pay(MapsKt__MapsKt.mapOf(TuplesKt.m137to("token", C135465cBQ.LIZ(str4).optString("token")), TuplesKt.m137to("version", "1")), new C137373cgD(this));
                            return;
                        }
                    } else if (str3.equals("qrcode")) {
                        C2272a.f25499LJ.data.pay_params.qrcode_data = (C137376cgG) CJPayJsonParser.fromJson(new JSONObject(C2272a.f25499LJ.data.pay_params.data), C137376cgG.class);
                        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported && (abstractC137216cdg = this.LIZIZ) != null) {
                            abstractC137216cdg.LJFF();
                        }
                        LJIILL();
                        return;
                    }
                }
                C2272a.f25499LJ.data.pay_params.channel_data = (C137132ccK) CJPayJsonParser.fromJson(new JSONObject(C2272a.f25499LJ.data.pay_params.data), C137132ccK.class);
                try {
                    jSONObject = new JSONObject(C2272a.f25499LJ.data.pay_params.data);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                AbstractC137216cdg abstractC137216cdg2 = this.LIZIZ;
                if (abstractC137216cdg2 != null) {
                    abstractC137216cdg2.LIZ(jSONObject);
                }
                if (this.LJIILJJIL) {
                    AbstractC137216cdg abstractC137216cdg3 = this.LIZIZ;
                    if (abstractC137216cdg3 != null) {
                        abstractC137216cdg3.mo21705LJ();
                    }
                    this.LJIILJJIL = false;
                    return;
                }
                C2279k c2279k3 = C2272a.f25499LJ;
                String str5 = null;
                if (!Intrinsics.areEqual("Pre_Pay_Credit", (c2279k3 == null || (c137354cfu3 = c2279k3.data) == null || (c137295cex3 = c137354cfu3.pay_params) == null || (c137132ccK3 = c137295cex3.channel_data) == null || (cJPayPayInfo3 = c137132ccK3.pay_info) == null) ? null : cJPayPayInfo3.business_scene) || (c2279k2 = C2272a.f25499LJ) == null || (c137354cfu = c2279k2.data) == null || (c137295cex = c137354cfu.pay_params) == null || (c137132ccK = c137295cex.channel_data) == null || (cJPayPayInfo = c137132ccK.pay_info) == null || cJPayPayInfo.is_credit_activate || C2272a.LIZIZ()) {
                    LJIIL();
                    return;
                }
                C2279k c2279k4 = C2272a.f25499LJ;
                if (c2279k4 != null && (c137354cfu2 = c2279k4.data) != null && (c137295cex2 = c137354cfu2.pay_params) != null && (c137132ccK2 = c137295cex2.channel_data) != null && (cJPayPayInfo2 = c137132ccK2.pay_info) != null) {
                    str5 = cJPayPayInfo2.credit_activate_url;
                }
                if (!PatchProxy.proxy(new Object[]{str5}, this, LIZ, false, 21).isSupported && (iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class)) != null) {
                    H5SchemeParamBuilder h5SchemeParamBuilder = new H5SchemeParamBuilder();
                    h5SchemeParamBuilder.setContext(getContext());
                    h5SchemeParamBuilder.setUrl(str5);
                    h5SchemeParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(C2272a.LIZJ));
                    iCJPayH5Service.startH5ByScheme(h5SchemeParamBuilder);
                }
                LJIILL();
                BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
                if (baseConfirmWrapper == null) {
                    return;
                }
                baseConfirmWrapper.LIZLLL(true);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$a
    public final void LIZ(TradeQueryBean tradeQueryBean) {
        TradeQueryBean.CJPayTradeQueryData cJPayTradeQueryData;
        C137130ccI c137130ccI;
        String str;
        Resources resources;
        Resources resources2;
        Resources resources3;
        if (PatchProxy.proxy(new Object[]{tradeQueryBean}, this, LIZ, false, 33).isSupported) {
            return;
        }
        String str2 = null;
        if (tradeQueryBean != null && (cJPayTradeQueryData = tradeQueryBean.data) != null && (c137130ccI = cJPayTradeQueryData.trade_info) != null && (str = c137130ccI.status) != null) {
            int hashCode = str.hashCode();
            if (hashCode == -1149187101) {
                if (str.equals("SUCCESS")) {
                    LJIIIIZZ();
                    return;
                }
            } else if (hashCode == 907287315 && str.equals("PROCESSING")) {
                int i = this.LJIJJ;
                if (i == 2) {
                    this.LJIJJ = 1;
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
                        return;
                    }
                    if (this.LJIIJJI == null) {
                        ICJPayWXPaymentService iCJPayWXPaymentService = (ICJPayWXPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayWXPaymentService.class);
                        CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(getActivity());
                        Context context = CJPayHostInfo.applicationContext;
                        defaultBuilder.setTitle((context == null || (resources3 = context.getResources()) == null) ? null : resources3.getString(2131561753));
                        Context context2 = CJPayHostInfo.applicationContext;
                        defaultBuilder.setLeftBtnStr((context2 == null || (resources2 = context2.getResources()) == null) ? null : resources2.getString(2131561919));
                        Context context3 = CJPayHostInfo.applicationContext;
                        if (context3 != null && (resources = context3.getResources()) != null) {
                            str2 = resources.getString(2131561920);
                        }
                        defaultBuilder.setRightBtnStr(str2);
                        defaultBuilder.setLeftBtnListener(new View$OnClickListenerC137252ceG(this, iCJPayWXPaymentService));
                        defaultBuilder.setRightBtnListener(new View$OnClickListenerC137224cdo(this, iCJPayWXPaymentService));
                        defaultBuilder.setWidth(270);
                        defaultBuilder.setHeight(107);
                        this.LJIIJJI = CJPayDialogUtils.initDialog(defaultBuilder);
                    }
                    DialogC137460chc dialogC137460chc = this.LJIIJJI;
                    Intrinsics.checkNotNull(dialogC137460chc);
                    if (dialogC137460chc.isShowing() || getActivity() == null) {
                        return;
                    }
                    FragmentActivity activity = getActivity();
                    Intrinsics.checkNotNull(activity);
                    Intrinsics.checkNotNullExpressionValue(activity, "");
                    if (activity.isFinishing()) {
                        return;
                    }
                    DialogC137460chc dialogC137460chc2 = this.LJIIJJI;
                    if (dialogC137460chc2 != null) {
                        C116971W2r.LIZJ(dialogC137460chc2);
                    }
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 66).isSupported) {
                        return;
                    }
                    try {
                        C137356cfw.LIZIZ.LIZ("wallet_rd_wxpay_complete_dialog_show", new JSONObject());
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                this.LJIJJ = i + 1;
                C2282b c2282b = (C2282b) this.LIZLLL;
                if (c2282b == null) {
                    return;
                }
                c2282b.LIZ();
                return;
            }
        }
        LJIIIZ();
    }

    public final void LIZ(String str, boolean z, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2}, this, LIZ, false, 52).isSupported && getActivity() != null) {
            BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
            if (baseConfirmWrapper != null) {
                baseConfirmWrapper.LIZJ();
            }
            BaseConfirmWrapper baseConfirmWrapper2 = this.f25502LJ;
            if (baseConfirmWrapper2 != null) {
                baseConfirmWrapper2.LIZLLL(baseConfirmWrapper2.LIZ(this.LJFF));
            }
            BaseConfirmWrapper baseConfirmWrapper3 = this.f25502LJ;
            if (baseConfirmWrapper3 != null) {
                baseConfirmWrapper3.LIZJ(true);
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.equals("CD002104", str2)) {
                CJPayBasicUtils.displayToastInternal(getActivity(), str, 0);
            }
            LJIILL();
            setIsQueryConnecting(false);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 70).isSupported) {
            return;
        }
        super.LIZ(z);
        if (!z) {
            return;
        }
        CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.INTEGRATED_COUNTER, CJPayPageLoadTrace.Section.END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(JSONObject jSONObject, boolean z, String str, String str2, String str3) {
        String str4;
        BaseConfirmWrapper baseConfirmWrapper;
        PaymentMethodInfo LIZIZ;
        ArrayList<PaymentMethodInfo> arrayList;
        String str5 = str2;
        if (PatchProxy.proxy(new Object[]{jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str5, str3}, this, LIZ, false, 73).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        String str6 = "";
        if (jSONObject == null || (str4 = jSONObject.optString("bank_card_id")) == null) {
            str4 = str6;
        }
        this.LJIILL = str4;
        PaymentMethodInfo paymentMethodInfo = null;
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("combine_limit_button") : null;
        if (!TextUtils.isEmpty(this.LJIILL) && (baseConfirmWrapper = this.f25502LJ) != null && (LIZIZ = baseConfirmWrapper.LIZIZ(this.LJIILL)) != null) {
            C2272a c2272a = this.LJJIIZI;
            if (c2272a != null) {
                c2272a.LJIIIIZZ = LIZIZ;
            }
            this.LJFF.clear();
            ArrayList<PaymentMethodInfo> arrayList2 = this.LJFF;
            BaseConfirmWrapper baseConfirmWrapper2 = this.f25502LJ;
            if (baseConfirmWrapper2 == null || (arrayList = baseConfirmWrapper2.LIZIZ(C2272a.LIZIZ)) == null) {
                arrayList = new ArrayList<>();
            }
            arrayList2.addAll(arrayList);
            Iterator<PaymentMethodInfo> it = this.LJFF.iterator();
            while (it.hasNext()) {
                PaymentMethodInfo next = it.next();
                if (Intrinsics.areEqual(next.paymentType, "bytepay")) {
                    next.isChecked = true;
                    next.subMethodInfo.set(0, LIZIZ);
                    C2272a c2272a2 = this.LJJIIZI;
                    if (c2272a2 != null) {
                        c2272a2.LJII = LIZIZ;
                    }
                    C2272a c2272a3 = this.LJJIIZI;
                    if (c2272a3 != null) {
                        c2272a3.LJIIIIZZ = LIZIZ;
                    }
                } else {
                    next.isChecked = false;
                }
            }
            BaseConfirmWrapper baseConfirmWrapper3 = this.f25502LJ;
            if (baseConfirmWrapper3 != null) {
                C2272a c2272a4 = this.LJJIIZI;
                if (c2272a4 != null) {
                    paymentMethodInfo = c2272a4.LJII;
                }
                baseConfirmWrapper3.LJI = paymentMethodInfo;
            }
            BaseConfirmWrapper baseConfirmWrapper4 = this.f25502LJ;
            if (baseConfirmWrapper4 != null) {
                baseConfirmWrapper4.LIZLLL(baseConfirmWrapper4.LIZ(this.LJFF));
            }
            BaseConfirmWrapper baseConfirmWrapper5 = this.f25502LJ;
            if (baseConfirmWrapper5 != null) {
                baseConfirmWrapper5.LIZ(C2272a.LIZIZ);
            }
            C2269a c2269a = this.LJIIJ;
            if (c2269a != null) {
                c2269a.LIZ(this.LJFF);
            }
            if (!PatchProxy.proxy(new Object[]{optJSONObject, Byte.valueOf((byte) z), str, str5, str3}, this, LIZ, false, 71).isSupported) {
                C106862S5w.LIZ(str);
                FragmentActivity activity = getActivity();
                if (activity != null && (!activity.isFinishing())) {
                    DialogC136955cZS LIZ2 = new DialogC136955cZS(activity, 0, 2).LIZ(optJSONObject);
                    LIZ2.LIZ(new C137206cdW(this, optJSONObject, str5, str3, z, str));
                    C116971W2r.LIZJ(LIZ2);
                    C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
                    JSONObject jSONObject2 = new JSONObject();
                    if (str5 == null) {
                        str5 = str6;
                    }
                    jSONObject2.put("error_code", str5);
                    if (str3 != null) {
                        str6 = str3;
                    }
                    jSONObject2.put(PushMessageHelper.ERROR_MESSAGE, str6);
                    if (z != 0) {
                        new StringBuilder();
                        jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, C0002O.m25086C(str, "_addcard"));
                    } else {
                        new StringBuilder();
                        jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, C0002O.m25086C(str, "_quickpay"));
                    }
                    c137121cc9.LIZ("wallet_cashier_combineno_pop_show", jSONObject2);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(7734);
    }

    private final void LJJIIJZLJL() {
        AbstractC137216cdg abstractC137216cdg;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported && CJPayBasicUtils.isClickValid() && (abstractC137216cdg = this.LIZIZ) != null) {
            abstractC137216cdg.LJI();
        }
    }

    @Override // p003X.AbstractC136022cKP
    public final C2124b LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2274a();
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        DialogC137460chc dialogC137460chc = this.LJIIJJI;
        if (dialogC137460chc != null) {
            C116971W2r.LIZ(dialogC137460chc);
        }
        this.LJIIL = false;
        this.LJIILIIL = false;
    }

    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        LIZJ();
    }

    public final void LJIIZILJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 48).isSupported) {
            return;
        }
        LIZIZ(3);
    }

    public final void LJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 62).isSupported) {
            return;
        }
        C137356cfw.LIZIZ.LIZ("wallet_cashier_look_coupon_click", new JSONObject());
    }

    private final void LJJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported && C2272a.f25499LJ != null && getActivity() != null && CJPayBasicUtils.isClickValid()) {
            AbstractC137216cdg abstractC137216cdg = this.LIZIZ;
            if (abstractC137216cdg != null) {
                abstractC137216cdg.LIZ();
            }
            BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
            if (baseConfirmWrapper != null) {
                baseConfirmWrapper.LIZLLL(baseConfirmWrapper.LIZ(this.LJFF));
            }
        }
    }

    private final void LJJIFFI() {
        AbstractC137216cdg abstractC137216cdg;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported && C2272a.f25499LJ != null && getActivity() != null && CJPayBasicUtils.isClickValid() && (abstractC137216cdg = this.LIZIZ) != null) {
            abstractC137216cdg.LJIIJ();
        }
    }

    private final void LJJII() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 40).isSupported && C2272a.f25499LJ != null && getActivity() != null && CJPayBasicUtils.isClickValid()) {
            AbstractC137216cdg abstractC137216cdg = this.LIZIZ;
            if (abstractC137216cdg != null) {
                abstractC137216cdg.LJII();
            }
            BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
            if (baseConfirmWrapper != null) {
                baseConfirmWrapper.LIZLLL(baseConfirmWrapper.LIZ(this.LJFF));
            }
        }
    }

    private final boolean LJJIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 69);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C2272a.LIZIZ != null) {
            return false;
        }
        if (this.LJIL) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            this.LJIL = false;
        }
        return true;
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        DialogC137460chc dialogC137460chc = this.LJIIJJI;
        if (dialogC137460chc != null) {
            C116971W2r.LIZ(dialogC137460chc);
        }
        this.LJIIL = false;
        this.LJIILIIL = false;
        AbstractC137216cdg abstractC137216cdg = this.LIZIZ;
        if (abstractC137216cdg != null) {
            abstractC137216cdg.LIZLLL();
        }
    }

    public final void LJIILL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 45).isSupported || !this.LJIJJLI) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC137209cdZ(this), 500L);
    }

    public final void LJIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 51).isSupported) {
            return;
        }
        for (PaymentMethodInfo paymentMethodInfo : this.LJFF) {
            paymentMethodInfo.isLoading = false;
        }
        C2269a c2269a = this.LJIIJ;
        if (c2269a != null) {
            c2269a.LIZ(this.LJFF);
        }
    }

    public final void LJIJJ() {
        PaymentMethodInfo paymentMethodInfo;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 60).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            C2272a c2272a = this.LJJIIZI;
            String str = null;
            if (c2272a != null && (paymentMethodInfo = c2272a.LJII) != null) {
                C137155cch c137155cch = C137370cgA.LIZ;
                BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
                if (baseConfirmWrapper != null) {
                    str = baseConfirmWrapper.LIZ(paymentMethodInfo);
                }
                jSONObject.put("activity_info", c137155cch.LIZ(paymentMethodInfo, str));
            }
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ(getContext(), "wallet_cashier_choose_method_click", jSONObject);
    }

    public final void LJIJJLI() {
        PaymentMethodInfo paymentMethodInfo;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 61).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            C2272a c2272a = this.LJJIIZI;
            String str = null;
            if (c2272a != null && (paymentMethodInfo = c2272a.LJII) != null) {
                C137155cch c137155cch = C137370cgA.LIZ;
                BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
                if (baseConfirmWrapper != null) {
                    str = baseConfirmWrapper.LIZ(paymentMethodInfo);
                }
                jSONObject.put("activity_info", c137155cch.LIZ(paymentMethodInfo, str));
            }
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ("wallet_cashier_more_method_click", jSONObject);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onResume();
        if (LJJIIZ()) {
            return;
        }
        C2272a.LJIIIIZZ();
        new Handler(Looper.getMainLooper()).post(new RunnableC137198cdO(this));
    }

    private final boolean LJJ() {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 37);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (getActivity() != null && !CJPayBasicUtils.isNetworkAvailable(getActivity())) {
            FragmentActivity activity = getActivity();
            FragmentActivity activity2 = getActivity();
            Intrinsics.checkNotNull(activity2);
            Intrinsics.checkNotNullExpressionValue(activity2, "");
            String string = activity2.getResources().getString(2131558456);
            if (C2272a.f25499LJ == null) {
                i = -1;
            } else {
                i = C2272a.f25499LJ.data.pay_params.channel_data.cashdesk_show_conf.show_style;
            }
            CJPayBasicUtils.displayToastInternal(activity, string, i);
            return false;
        }
        return true;
    }

    private final void LJJIII() {
        String str;
        Boolean bool;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported || C2272a.f25499LJ == null || (str = C2272a.f25499LJ.data.pay_params.channel_data.user_info.pwd_check_way) == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            if (hashCode == 49 && str.equals("1")) {
                AbstractC137216cdg abstractC137216cdg = this.LIZIZ;
                if (abstractC137216cdg != null) {
                    bool = abstractC137216cdg.LJIIIIZZ();
                } else {
                    bool = null;
                }
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    LJJII();
                } else {
                    LJJI();
                }
            }
        } else if (str.equals("0")) {
            LJJI();
        }
    }

    private final void LJJIIJ() {
        C2272a c2272a;
        String str;
        String str2;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethodInfo paymentMethodInfo2;
        PaymentMethodInfo paymentMethodInfo3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported) {
            return;
        }
        C2272a c2272a2 = this.LJJIIZI;
        if ((c2272a2 == null || !c2272a2.LJIIL) && (c2272a = this.LJJIIZI) != null) {
            C2272a c2272a3 = this.LJJIIZI;
            String str3 = null;
            if (c2272a3 != null && (paymentMethodInfo3 = c2272a3.LJII) != null) {
                str = paymentMethodInfo3.card_add_ext;
            } else {
                str = null;
            }
            C2272a c2272a4 = this.LJJIIZI;
            if (c2272a4 != null && (paymentMethodInfo2 = c2272a4.LJII) != null) {
                str2 = paymentMethodInfo2.front_bank_code;
            } else {
                str2 = null;
            }
            C2272a c2272a5 = this.LJJIIZI;
            if (c2272a5 != null && (paymentMethodInfo = c2272a5.LJII) != null) {
                str3 = paymentMethodInfo.card_type_name;
            }
            c2272a.LIZ(str, str2, str3);
        }
        AbstractC137216cdg abstractC137216cdg = this.LIZIZ;
        if (abstractC137216cdg != null) {
            abstractC137216cdg.mo21705LJ();
        }
    }

    public final String LJIILIIL() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
        if (baseConfirmWrapper == null || ((i = baseConfirmWrapper.LJII()) != 3 && i != 4)) {
            C2272a c2272a = this.LJJIIZI;
            if (c2272a != null && c2272a.LJIIL) {
                return "Pre_Pay_NewCard";
            }
            if (i == 2) {
                return "Pre_Pay_BankCard";
            }
            if (i == 5 || i == 6) {
                return "";
            }
            if (i == 1 || i == 11) {
                return "Pre_Pay_BankCard";
            }
            if (i != 7 && i != 12) {
                if (i == BaseConfirmWrapper.SelectPayTypeEnum.QrCodePay.value) {
                    return "";
                }
                if (i == BaseConfirmWrapper.SelectPayTypeEnum.INCOMEPay.value) {
                    return "Pre_Pay_Income";
                }
                if (i != BaseConfirmWrapper.SelectPayTypeEnum.CREDITPay.value) {
                    return "";
                }
                return "Pre_Pay_Credit";
            }
            return "Pre_Pay_Balance";
        }
        return "Pre_Pay_NewCard";
    }

    public final String LJIILJJIL() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
        if (baseConfirmWrapper != null) {
            i = baseConfirmWrapper.LJII();
            if (i == 5) {
                return "wx";
            }
            if (i == 6) {
                return "alipay";
            }
        }
        if (i == BaseConfirmWrapper.SelectPayTypeEnum.QrCodePay.value) {
            return "qrcode";
        }
        if (i == BaseConfirmWrapper.SelectPayTypeEnum.SelectNone.value) {
            return "";
        }
        if (i == BaseConfirmWrapper.SelectPayTypeEnum.DyPay.value) {
            return "dypay";
        }
        return "bytepay";
    }

    public final void LJIILLIIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported && this.LJIJJLI) {
            if (getActivity() != null) {
                FragmentActivity activity = getActivity();
                Intrinsics.checkNotNull(activity);
                Intrinsics.checkNotNullExpressionValue(activity, "");
                if (activity.isFinishing()) {
                    return;
                }
            }
            C2272a c2272a = this.LJJIIZI;
            if (c2272a != null) {
                c2272a.LJIILIIL = true;
            }
            C2272a c2272a2 = this.LJJIIZI;
            if (c2272a2 != null && c2272a2.LJIIL) {
                C2269a c2269a = this.LJIIJ;
                if (c2269a != null) {
                    c2269a.LIZ();
                }
                C2269a c2269a2 = this.LJIIJ;
                if (c2269a2 != null) {
                    c2269a2.LIZIZ();
                }
            } else {
                BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
                if (baseConfirmWrapper != null) {
                    baseConfirmWrapper.LIZJ();
                }
            }
            LJIJ();
        }
    }

    @Override // p003X.AbstractC136089cLU, p003X.AbstractC136022cKP, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDestroyView();
        DialogC137460chc dialogC137460chc = this.LJIIJJI;
        if (dialogC137460chc != null) {
            C116971W2r.LIZ(dialogC137460chc);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            ICJPayBasisPaymentService iCJPayBasisPaymentService = (ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class);
            ICJPayBasisPaymentService iCJPayBasisPaymentService2 = (ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayWXPaymentService.class);
            if (iCJPayBasisPaymentService != null) {
                iCJPayBasisPaymentService.releasePaySession();
            }
            if (iCJPayBasisPaymentService2 != null) {
                iCJPayBasisPaymentService2.releasePaySession();
            }
        }
        CJPayPerformance.LIZ().LIZLLL("wallet_rd_counter_integrated_enter");
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r4.length() > 0) goto L62;
     */
    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.fragment.C2285b.LIZJ():void");
    }

    public final void LJIIJ() {
        ArrayList<PaymentMethodInfo> arrayList;
        PaymentMethodInfo paymentMethodInfo;
        String str;
        PaymentMethodInfo paymentMethodInfo2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        ArrayList<PaymentMethodInfo> LIZ2 = LIZ(this.LJFF);
        this.LJFF.clear();
        ArrayList<PaymentMethodInfo> arrayList2 = this.LJFF;
        BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
        if (baseConfirmWrapper == null || (arrayList = baseConfirmWrapper.LIZ(getContext(), C2272a.LIZIZ, this.LJJIIZI, LIZ2)) == null) {
            arrayList = new ArrayList<>();
        }
        arrayList2.addAll(arrayList);
        BaseConfirmWrapper baseConfirmWrapper2 = this.f25502LJ;
        PaymentMethodInfo paymentMethodInfo3 = null;
        if (baseConfirmWrapper2 != null) {
            C2272a c2272a = this.LJJIIZI;
            if (c2272a != null && (paymentMethodInfo2 = c2272a.LJIIIIZZ) != null) {
                str = paymentMethodInfo2.paymentType;
            } else {
                str = null;
            }
            baseConfirmWrapper2.LIZJ(str);
        }
        C2269a c2269a = this.LJIIJ;
        if (c2269a != null) {
            c2269a.LIZ(this.LJFF);
        }
        BaseConfirmWrapper baseConfirmWrapper3 = this.f25502LJ;
        if (baseConfirmWrapper3 != null) {
            C2272a c2272a2 = this.LJJIIZI;
            if (c2272a2 != null) {
                paymentMethodInfo = c2272a2.LJIIIIZZ;
            } else {
                paymentMethodInfo = null;
            }
            baseConfirmWrapper3.LJI = paymentMethodInfo;
        }
        BaseConfirmWrapper baseConfirmWrapper4 = this.f25502LJ;
        if (baseConfirmWrapper4 != null) {
            baseConfirmWrapper4.LIZ(this.LJFF, this.LJJIIZI);
        }
        BaseConfirmWrapper baseConfirmWrapper5 = this.f25502LJ;
        if (baseConfirmWrapper5 != null) {
            baseConfirmWrapper5.LJFF();
        }
        BaseConfirmWrapper baseConfirmWrapper6 = this.f25502LJ;
        if (baseConfirmWrapper6 != null) {
            C2272a c2272a3 = this.LJJIIZI;
            if (c2272a3 != null) {
                paymentMethodInfo3 = c2272a3.LJIIIIZZ;
            }
            baseConfirmWrapper6.LIZIZ(paymentMethodInfo3);
        }
    }

    public final void LJIIL() {
        C2272a c2272a;
        C137354cfu c137354cfu;
        C137295cex c137295cex;
        C137132ccK c137132ccK;
        UserInfo userInfo;
        C137354cfu c137354cfu2;
        C137354cfu c137354cfu3;
        int i = 0;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported && LJJ() && C2272a.f25499LJ != null) {
            BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
            if (baseConfirmWrapper != null) {
                i = baseConfirmWrapper.LJII();
            }
            if (i == 3 || i == 4 || ((c2272a = this.LJJIIZI) != null && c2272a.LJIIL)) {
                LJJIIJ();
                C2272a c2272a2 = this.LJJIIZI;
                if (c2272a2 != null && c2272a2.LJIIL) {
                    LIZLLL("收银台一级页");
                } else {
                    LIZLLL("收银台一级页确认按钮");
                }
                m16049LJ("添加新卡支付");
            } else if (C2272a.f25499LJ.data.pay_params.channel_data.need_resign_card) {
                LJJIIJZLJL();
                m16049LJ("去激活");
            } else {
                String str = null;
                r5 = null;
                C137295cex c137295cex2 = null;
                r5 = null;
                C137295cex c137295cex3 = null;
                str = null;
                str = null;
                str = null;
                str = null;
                if (i == 5) {
                    C2279k c2279k = C2272a.f25499LJ;
                    if (c2279k != null && (c137354cfu3 = c2279k.data) != null) {
                        c137295cex2 = c137354cfu3.pay_params;
                    }
                    LIZ(c137295cex2, "wx");
                    LJIILL();
                    m16049LJ("确认支付");
                } else if (i == 6) {
                    C2279k c2279k2 = C2272a.f25499LJ;
                    if (c2279k2 != null && (c137354cfu2 = c2279k2.data) != null) {
                        c137295cex3 = c137354cfu2.pay_params;
                    }
                    LIZ(c137295cex3, "alipay");
                    LJIILL();
                    m16049LJ("确认支付");
                } else {
                    C137356cfw.LIZIZ.LIZ("wallet_cashier_confirm_pswd_type_sdk", new JSONObject());
                    C137356cfw.LIZIZ.LIZ("wallet_cashier_confirm_loading", new JSONObject());
                    C2279k c2279k3 = C2272a.f25499LJ;
                    if (c2279k3 != null && (c137354cfu = c2279k3.data) != null && (c137295cex = c137354cfu.pay_params) != null && (c137132ccK = c137295cex.channel_data) != null && (userInfo = c137132ccK.user_info) != null) {
                        str = userInfo.pwd_check_way;
                    }
                    if (Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, String.valueOf(str))) {
                        m16049LJ("免密支付");
                        LJJIFFI();
                    } else {
                        LJJIII();
                        LJIILL();
                        m16049LJ("确认支付");
                    }
                }
            }
            BaseConfirmWrapper baseConfirmWrapper2 = this.f25502LJ;
            if (baseConfirmWrapper2 != null) {
                baseConfirmWrapper2.LIZLLL(true);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$a
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 34).isSupported) {
            return;
        }
        LJIIIZ();
    }

    private final ArrayList<PaymentMethodInfo> LIZ(ArrayList<PaymentMethodInfo> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        if (arrayList != null) {
            for (PaymentMethodInfo paymentMethodInfo : arrayList) {
                if (Intrinsics.areEqual(paymentMethodInfo.paymentType, "bytepay")) {
                    return paymentMethodInfo.subMethodInfo;
                }
            }
            return null;
        }
        return null;
    }

    private void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{3}, this, LIZ, false, 49).isSupported) {
            return;
        }
        LIZ(3);
        BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
        if (baseConfirmWrapper != null) {
            baseConfirmWrapper.mo16047LJ();
        }
        BaseConfirmWrapper baseConfirmWrapper2 = this.f25502LJ;
        if (baseConfirmWrapper2 != null) {
            baseConfirmWrapper2.LIZJ(false);
        }
    }

    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 65).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clickButton", str);
            C137356cfw.LIZIZ.LIZ("wallet_rd_wxpay_complete_dialog_click", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$a
    /* renamed from: b_ */
    public final void mo16048b_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 30).isSupported) {
            return;
        }
        LJIILL();
        if (getContext() != null) {
            CJPayBasicUtils.displayToastInternal(getActivity(), getResources().getString(2131558456), 0);
        }
        this.LJIILJJIL = false;
        BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
        if (baseConfirmWrapper != null) {
            baseConfirmWrapper.LIZLLL(true);
        }
        C2272a.LJIIIIZZ();
    }

    private final void LIZLLL(String str) {
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethodInfo paymentMethodInfo2;
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 63).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", str);
            jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, "addcard");
            C2272a c2272a = this.LJJIIZI;
            String str3 = null;
            if (c2272a != null && (paymentMethodInfo2 = c2272a.LJII) != null) {
                C137155cch c137155cch = C137370cgA.LIZ;
                BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
                if (baseConfirmWrapper != null) {
                    str2 = baseConfirmWrapper.LIZ(paymentMethodInfo2);
                } else {
                    str2 = null;
                }
                jSONObject.put("activity_info", c137155cch.LIZ(paymentMethodInfo2, str2));
            }
            C2272a c2272a2 = this.LJJIIZI;
            if (c2272a2 != null && (paymentMethodInfo = c2272a2.LJII) != null) {
                str3 = paymentMethodInfo.title;
            }
            jSONObject.put("addcard_info", str3);
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ("wallet_cashier_add_newcard_click", jSONObject);
    }

    /* renamed from: LJ */
    private final void m16049LJ(String str) {
        PaymentMethodInfo paymentMethodInfo;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 64).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("icon_name", str);
            C2272a c2272a = this.LJJIIZI;
            String str2 = null;
            if (c2272a != null && (paymentMethodInfo = c2272a.LJII) != null) {
                C137155cch c137155cch = C137370cgA.LIZ;
                BaseConfirmWrapper baseConfirmWrapper = this.f25502LJ;
                if (baseConfirmWrapper != null) {
                    str2 = baseConfirmWrapper.LIZ(paymentMethodInfo);
                }
                jSONObject.put("activity_info", c137155cch.LIZ(paymentMethodInfo, str2));
            }
            jSONObject.put("is_combine_page", "0");
        } catch (Exception unused) {
        }
        JSONObject LIZ2 = C137356cfw.LIZIZ.LIZ(getContext(), "wallet_cashier_confirm_click", jSONObject);
        C2118a LIZ3 = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        ICustomActionListener iCustomActionListener = LIZ3.LJIIZILJ;
        if (iCustomActionListener != null) {
            ICustomActionListener.ActionType actionType = ICustomActionListener.ActionType.CASHIER_CONFIRM_CLICK;
            Map<String, String> Json2Map = CJPayBasicUtils.Json2Map(LIZ2);
            Intrinsics.checkNotNullExpressionValue(Json2Map, "");
            iCustomActionListener.onAction(actionType, Json2Map);
        }
    }

    public final void LIZ(int i) {
        BaseConfirmWrapper baseConfirmWrapper;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 44).isSupported) {
            return;
        }
        if (i != 1) {
            if (i != 2 && i == 3 && (baseConfirmWrapper = this.f25502LJ) != null) {
                baseConfirmWrapper.LIZ(true);
                return;
            }
            return;
        }
        BaseConfirmWrapper baseConfirmWrapper2 = this.f25502LJ;
        if (baseConfirmWrapper2 != null) {
            baseConfirmWrapper2.mo16045LJ(true);
        }
        BaseConfirmWrapper baseConfirmWrapper3 = this.f25502LJ;
        if (baseConfirmWrapper3 != null) {
            baseConfirmWrapper3.LIZIZ(true);
        }
        C2272a c2272a = this.LJJIIZI;
        if (c2272a != null) {
            c2272a.LJIILIIL = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016b, code lost:
        if (r0 != null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136 A[Catch: Exception -> 0x019b, TryCatch #0 {Exception -> 0x019b, blocks: (B:32:0x0079, B:35:0x0081, B:37:0x0093, B:40:0x00b5, B:42:0x00cb, B:44:0x00d5, B:48:0x0121, B:50:0x0136, B:53:0x0180, B:54:0x018e, B:61:0x013b, B:63:0x0141, B:65:0x0145, B:67:0x0149, B:69:0x014d, B:70:0x014f, B:72:0x0157, B:74:0x015d, B:76:0x0161, B:78:0x0165, B:80:0x0169, B:83:0x00e3, B:85:0x00e9, B:87:0x00ed, B:89:0x00f1, B:91:0x00f5, B:92:0x00f7, B:94:0x00ff, B:96:0x0105, B:98:0x0109, B:100:0x010d, B:102:0x0111, B:103:0x0113, B:109:0x009c, B:112:0x0171, B:115:0x017c), top: B:31:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b A[Catch: Exception -> 0x019b, TryCatch #0 {Exception -> 0x019b, blocks: (B:32:0x0079, B:35:0x0081, B:37:0x0093, B:40:0x00b5, B:42:0x00cb, B:44:0x00d5, B:48:0x0121, B:50:0x0136, B:53:0x0180, B:54:0x018e, B:61:0x013b, B:63:0x0141, B:65:0x0145, B:67:0x0149, B:69:0x014d, B:70:0x014f, B:72:0x0157, B:74:0x015d, B:76:0x0161, B:78:0x0165, B:80:0x0169, B:83:0x00e3, B:85:0x00e9, B:87:0x00ed, B:89:0x00f1, B:91:0x00f5, B:92:0x00f7, B:94:0x00ff, B:96:0x0105, B:98:0x0109, B:100:0x010d, B:102:0x0111, B:103:0x0113, B:109:0x009c, B:112:0x0171, B:115:0x017c), top: B:31:0x0079 }] */
    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.fragment.C2285b.LIZIZ(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
        if (r0 == null) goto L45;
     */
    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(android.view.View r8) {
        /*
            r7 = this;
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r1 = 0
            r3[r1] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.android.ttcjpaysdk.integrated.counter.fragment.C2285b.LIZ
            r6 = 2
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r7, r0, r1, r6)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L12
            return
        L12:
            p003X.C106862S5w.LIZ(r8)
            boolean r0 = r7.LJJIIZ()
            if (r0 == 0) goto L1c
            return
        L1c:
            com.android.ttcjpaysdk.integrated.counter.data.i r0 = com.android.ttcjpaysdk.integrated.counter.p154b.C2272a.LIZIZ
            if (r0 == 0) goto Lca
            X.ccM r0 = r0.data
            if (r0 == 0) goto Lca
            X.cds r0 = r0.cashdesk_show_conf
            if (r0 == 0) goto Lca
            int r0 = r0.show_style
        L2a:
            r7.LJIJI = r0
            X.cdk r3 = p003X.C137367cg7.LIZ
            int r5 = r7.LJIJI
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r1] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4[r2] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = p003X.C137220cdk.LIZ
            com.bytedance.hotfix.PatchProxyResult r4 = com.bytedance.hotfix.PatchProxy.proxy(r4, r3, r0, r1, r2)
            boolean r0 = r4.isSupported
            if (r0 == 0) goto L85
            java.lang.Object r0 = r4.result
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = (com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper) r0
        L48:
            r7.f25502LJ = r0
            com.android.ttcjpaysdk.integrated.counter.a.a r5 = new com.android.ttcjpaysdk.integrated.counter.a.a
            android.content.Context r4 = r7.getContext()
            int r3 = r7.LJIJI
            com.android.ttcjpaysdk.integrated.counter.data.i r0 = com.android.ttcjpaysdk.integrated.counter.p154b.C2272a.LIZIZ
            if (r0 == 0) goto L5a
            int r1 = r0.getPayItemsShowNum()
        L5a:
            r5.<init>(r4, r3, r1)
            r7.LJIIJ = r5
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r7.f25502LJ
            if (r0 == 0) goto L73
            androidx.recyclerview.widget.RecyclerView r3 = r0.LIZLLL()
            if (r3 == 0) goto L73
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r7.mContext
            r1.<init>(r0)
            r3.setLayoutManager(r1)
        L73:
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r7.f25502LJ
            if (r0 == 0) goto L82
            androidx.recyclerview.widget.RecyclerView r1 = r0.LIZLLL()
            if (r1 == 0) goto L82
            com.android.ttcjpaysdk.integrated.counter.a.a r0 = r7.LJIIJ
            r1.setAdapter(r0)
        L82:
            r7.LJIJJLI = r2
            return
        L85:
            p003X.C106862S5w.LIZ(r8)
            r0 = 0
            if (r5 == 0) goto Lc3
            if (r5 == r2) goto Lbc
            if (r5 == r6) goto Lb5
            r0 = 3
            if (r5 == r0) goto Lae
            r0 = 4
            if (r5 == r0) goto La7
            r0 = 6
            if (r5 != r0) goto La0
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyPayService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyPayService.class
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r3.LIZ(r8, r0)
        L9e:
            if (r0 != 0) goto L48
        La0:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService.class
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r3.LIZ(r8, r0)
            goto L48
        La7:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyImService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyImService.class
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r3.LIZ(r8, r0)
            goto L9e
        Lae:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedLiteService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedLiteService.class
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r3.LIZ(r8, r0)
            goto L9e
        Lb5:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedGameService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedGameService.class
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r3.LIZ(r8, r0)
            goto L9e
        Lbc:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedFullScreenService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedFullScreenService.class
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r3.LIZ(r8, r0)
            goto L9e
        Lc3:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService.class
            com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper r0 = r3.LIZ(r8, r0)
            goto L9e
        Lca:
            r0 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.fragment.C2285b.LIZ(android.view.View):void");
    }

    private final void LIZ(C137295cex c137295cex, String str) {
        int i;
        Resources resources;
        if (PatchProxy.proxy(new Object[]{c137295cex, str}, this, LIZ, false, 22).isSupported) {
            return;
        }
        String str2 = null;
        if (c137295cex != null && c137295cex.channel_data != null) {
            C137132ccK c137132ccK = c137295cex.channel_data;
            C137192cdI c137192cdI = new C137192cdI(this);
            int hashCode = str.hashCode();
            if (hashCode != -1414960566) {
                if (hashCode == 3809 && str.equals("wx")) {
                    String str3 = c137132ccK.app_id;
                    if (!TextUtils.isEmpty(str3)) {
                        ICJPayWXPaymentService iCJPayWXPaymentService = (ICJPayWXPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayWXPaymentService.class);
                        if (iCJPayWXPaymentService != null && !iCJPayWXPaymentService.isWXUnInstalled(getContext(), str3)) {
                            if (Intrinsics.areEqual("MWEB", c137295cex.trade_type) && !TextUtils.isEmpty(c137132ccK.mweb_url)) {
                                ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
                                if (iCJPayH5Service != null) {
                                    iCJPayH5Service.openH5ForWXPay(getActivity(), new JSONObject(c137295cex.data), CJPayHostInfo.Companion.LIZIZ(C2272a.LIZJ));
                                }
                                C2118a.LIZ().LIZ(0);
                            } else {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("sdk_info", new JSONObject(c137295cex.data));
                                jSONObject.put("pay_way", 1);
                                JSONObject put = new JSONObject().put(C2521l.LJIIL, jSONObject);
                                if (iCJPayWXPaymentService != null) {
                                    iCJPayWXPaymentService.executePay(getActivity(), str3, put, c137192cdI, null);
                                }
                            }
                            this.LJIIL = true;
                            CJPayPerformance.LIZ().LIZIZ("微信");
                            return;
                        }
                        Context context = CJPayHostInfo.applicationContext;
                        if (context != null && (resources = context.getResources()) != null) {
                            str2 = resources.getString(2131562053);
                        }
                        if (C2272a.LIZIZ == null) {
                            i = -1;
                        } else {
                            i = C2272a.LIZIZ.data.cashdesk_show_conf.show_style;
                        }
                        CJPayBasicUtils.displayToastInternal(context, str2, i);
                    }
                }
            } else if (str.equals("alipay")) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sdk_info", new JSONObject(c137295cex.data));
                jSONObject2.put("pay_way", 2);
                JSONObject put2 = new JSONObject().put(C2521l.LJIIL, jSONObject2);
                Intrinsics.checkNotNullExpressionValue(put2, "");
                ICJPayBasisPaymentService iCJPayBasisPaymentService = (ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class);
                if (iCJPayBasisPaymentService != null) {
                    iCJPayBasisPaymentService.executePay(getActivity(), "", put2, c137192cdI, null);
                }
                this.LJIILIIL = true;
                CJPayPerformance.LIZ().LIZIZ("支付宝");
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 4).isSupported || LJJIIZ()) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC137232cdw(this), 100L);
    }

    public static /* synthetic */ void LIZ(C2285b c2285b, String str, boolean z, String str2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2285b, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), null, 4, null}, null, LIZ, true, 53).isSupported) {
            return;
        }
        c2285b.LIZ(str, z, "");
    }
}
