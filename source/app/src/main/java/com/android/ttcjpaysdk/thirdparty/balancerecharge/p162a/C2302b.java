package com.android.ttcjpaysdk.thirdparty.balancerecharge.p162a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.thirdparty.balance.data.CJPayBalanceTradeInfo;
import com.android.ttcjpaysdk.thirdparty.balance.data.CJPayBalanceTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.balance.p159d.C2297a;
import com.android.ttcjpaysdk.thirdparty.balance.p161f.C2299a;
import com.android.ttcjpaysdk.thirdparty.balancerecharge.p163b.C2304b;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC136297cOq;
import p003X.AbstractC136299cOs;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135272c8J;
import p003X.C135465cBQ;
import p003X.C136232cNn;
import p003X.C136246cO1;
import p003X.C136293cOm;
import p003X.C136294cOn;
import p003X.C136302cOv;
import p003X.C136303cOw;
import p003X.C136304cOx;
import p003X.C136340cPX;
import p003X.C136342cPZ;
import p003X.View$OnClickListenerC136300cOt;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balancerecharge.a.b */
/* loaded from: classes17.dex */
public final class C2302b extends AbstractC136297cOq<C2299a, C2304b> {
    public static ChangeQuickRedirect LJIIJ;
    public HashMap LJIIJJI;

    static {
        Covode.recordClassIndex(8027);
    }

    @Override // p003X.AbstractC136297cOq, p003X.AbstractC136027cKU, p003X.AbstractC136022cKP
    public final void LIZ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJ, false, 9).isSupported && (hashMap = this.LJIIJJI) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "零钱充值收银台";
    }

    @Override // p003X.AbstractC136297cOq
    public final String LJIIIZ() {
        return "recharge";
    }

    @Override // p003X.AbstractC136297cOq, p003X.AbstractC136027cKU, p003X.AbstractC136022cKP, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 10).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        C136342cPZ c136342cPZ;
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 5).isSupported) {
            return;
        }
        super.onStart();
        AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
        if (abstractC136299cOs != null && (c136342cPZ = abstractC136299cOs.LIZJ) != null) {
            c136342cPZ.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C136342cPZ c136342cPZ;
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 6).isSupported) {
            return;
        }
        super.onStop();
        AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
        if (abstractC136299cOs != null && (c136342cPZ = abstractC136299cOs.LIZJ) != null) {
            c136342cPZ.m21737LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r16v0, types: [boolean, int] */
    @Override // p003X.AbstractC136297cOq
    public final void LJIIIIZZ() {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo2;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo3;
        Long l2;
        String str5;
        String str6;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo4;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo5;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo6;
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 7).isSupported) {
            return;
        }
        C2297a c2297a = this.LJFF;
        if (c2297a != null) {
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean != null && (cJPayBalanceTradeInfo6 = cJPayBalanceTradeQueryResponseBean.trade_info) != null) {
                l2 = Long.valueOf(cJPayBalanceTradeInfo6.trade_amount);
            } else {
                l2 = null;
            }
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean2 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean2 != null && (cJPayBalanceTradeInfo5 = cJPayBalanceTradeQueryResponseBean2.trade_info) != null) {
                str5 = cJPayBalanceTradeInfo5.bank_name;
            } else {
                str5 = null;
            }
            C136293cOm c136293cOm = C136294cOn.LIZIZ;
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean3 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean3 != null && (cJPayBalanceTradeInfo4 = cJPayBalanceTradeQueryResponseBean3.trade_info) != null) {
                str6 = cJPayBalanceTradeInfo4.trade_status;
            } else {
                str6 = null;
            }
            String LIZJ = c136293cOm.LIZJ(str6);
            if (!PatchProxy.proxy(new Object[]{1, l2, str5, LIZJ}, c2297a, C2304b.LIZIZ, false, 1).isSupported) {
                C2118a LIZ = C2118a.LIZ();
                JSONObject jSONObject = new JSONObject();
                C135465cBQ.LIZ(jSONObject, "is_bankcard", 1);
                C135465cBQ.LIZ(jSONObject, "amount", l2);
                C135465cBQ.LIZ(jSONObject, "bank_name", str5);
                C135465cBQ.LIZ(jSONObject, "status", LIZJ);
                LIZ.LIZ("wallet_change_cashier_pay_finish_page_imp", c2297a.LIZ(jSONObject));
            }
        }
        C2297a c2297a2 = this.LJFF;
        if (c2297a2 != null) {
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean4 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean4 != null && (cJPayBalanceTradeInfo3 = cJPayBalanceTradeQueryResponseBean4.trade_info) != null) {
                l = Long.valueOf(cJPayBalanceTradeInfo3.trade_amount);
            } else {
                l = null;
            }
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean5 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean5 != null && (cJPayBalanceTradeInfo2 = cJPayBalanceTradeQueryResponseBean5.trade_info) != null) {
                str = cJPayBalanceTradeInfo2.bank_name;
            } else {
                str = null;
            }
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean6 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean6 != null && (cJPayBalanceTradeInfo = cJPayBalanceTradeQueryResponseBean6.trade_info) != null) {
                str2 = cJPayBalanceTradeInfo.trade_status;
            } else {
                str2 = null;
            }
            ?? areEqual = Intrinsics.areEqual(str2, "SUCCESS");
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean7 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean7 != null) {
                str3 = cJPayBalanceTradeQueryResponseBean7.code;
            } else {
                str3 = null;
            }
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean8 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean8 != null) {
                str4 = cJPayBalanceTradeQueryResponseBean8.msg;
            } else {
                str4 = null;
            }
            if (!PatchProxy.proxy(new Object[]{1, l, str, 1L, Integer.valueOf(areEqual == true ? 1 : 0), str3, str4}, c2297a2, C2304b.LIZIZ, false, 2).isSupported) {
                C2118a LIZ2 = C2118a.LIZ();
                JSONObject jSONObject2 = new JSONObject();
                C135465cBQ.LIZ(jSONObject2, "is_bankcard", 1);
                C135465cBQ.LIZ(jSONObject2, "amount", l);
                C135465cBQ.LIZ(jSONObject2, "bank_name", str);
                C135465cBQ.LIZ(jSONObject2, "loading_time", 1L);
                C135465cBQ.LIZ(jSONObject2, "result", Integer.valueOf((int) areEqual));
                C135465cBQ.LIZ(jSONObject2, "error_code", str3);
                C135465cBQ.LIZ(jSONObject2, PushMessageHelper.ERROR_MESSAGE, str4);
                LIZ2.LIZ("wallet_change_cashier_result", c2297a2.LIZ(jSONObject2));
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 3).isSupported) {
            return;
        }
        AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
        if (!(abstractC136299cOs instanceof C136302cOv)) {
            abstractC136299cOs = null;
        }
        if (abstractC136299cOs != null) {
            abstractC136299cOs.LIZIZ();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        C136302cOv c136302cOv;
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 2);
        if (proxy.isSupported) {
            c136302cOv = (C136302cOv) proxy.result;
        } else {
            View LIZ = C116971W2r.LIZ(LayoutInflater.from(view.getContext()), 2131690687, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            c136302cOv = new C136302cOv(LIZ, view, new C136232cNn(this));
        }
        ((AbstractC136297cOq) this).LIZIZ = c136302cOv;
        AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
        if (!(abstractC136299cOs instanceof C136302cOv)) {
            abstractC136299cOs = null;
        }
        if (abstractC136299cOs != null) {
            abstractC136299cOs.LIZ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p003X.AbstractC136297cOq
    public final void LIZJ(CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean) {
        String str;
        String format;
        if (!PatchProxy.proxy(new Object[]{cJPayBalanceTradeQueryResponseBean}, this, LJIIJ, false, 4).isSupported && cJPayBalanceTradeQueryResponseBean != null) {
            AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
            String str2 = null;
            if (!(abstractC136299cOs instanceof C136302cOv)) {
                abstractC136299cOs = null;
            }
            C136302cOv c136302cOv = (C136302cOv) abstractC136299cOs;
            if (c136302cOv != null && !PatchProxy.proxy(new Object[]{cJPayBalanceTradeQueryResponseBean}, c136302cOv, C136302cOv.f18010LJ, false, 3).isSupported) {
                C136303cOw c136303cOw = c136302cOv.LJI;
                if (c136303cOw != null && !PatchProxy.proxy(new Object[]{cJPayBalanceTradeQueryResponseBean}, c136303cOw, C136303cOw.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(cJPayBalanceTradeQueryResponseBean);
                    if (c136303cOw.mContext != null) {
                        c136303cOw.LIZIZ.setText(C136294cOn.LIZIZ.LIZ(cJPayBalanceTradeQueryResponseBean.trade_info.trade_amount));
                        String str3 = cJPayBalanceTradeQueryResponseBean.trade_info.trade_status;
                        switch (str3.hashCode()) {
                            case -1149187101:
                                if (str3.equals("SUCCESS")) {
                                    c136303cOw.LIZJ.setText(c136303cOw.mContext.getString(2131561908));
                                    c136303cOw.LIZJ.setVisibility(0);
                                    c136303cOw.LIZJ.setTextColor(C135272c8J.LIZIZ(c136303cOw.mContext, 2130772705));
                                    c136303cOw.LIZLLL.setImageDrawable(C135272c8J.LIZ(c136303cOw.mContext, 2130772722));
                                    break;
                                }
                                c136303cOw.LIZJ.setVisibility(8);
                                break;
                            case -595928767:
                                if (str3.equals("TIMEOUT")) {
                                    c136303cOw.LIZJ.setText(c136303cOw.mContext.getString(2131561900));
                                    c136303cOw.LIZJ.setVisibility(0);
                                    c136303cOw.LIZJ.setTextColor(C135272c8J.LIZIZ(c136303cOw.mContext, 2130772705));
                                    break;
                                }
                                c136303cOw.LIZJ.setVisibility(8);
                                break;
                            case 2150174:
                                if (str3.equals("FAIL")) {
                                    c136303cOw.LIZJ.setText(c136303cOw.mContext.getString(2131561900));
                                    c136303cOw.LIZJ.setVisibility(0);
                                    c136303cOw.LIZJ.setTextColor(C135272c8J.LIZIZ(c136303cOw.mContext, 2130772705));
                                    break;
                                }
                                c136303cOw.LIZJ.setVisibility(8);
                                break;
                            case 907287315:
                                if (str3.equals("PROCESSING")) {
                                    c136303cOw.LIZJ.setText(c136303cOw.mContext.getString(2131561906));
                                    c136303cOw.LIZJ.setVisibility(0);
                                    c136303cOw.LIZJ.setTextColor(C135272c8J.LIZIZ(c136303cOw.mContext, 2130772703));
                                    c136303cOw.LIZLLL.setImageDrawable(C135272c8J.LIZ(c136303cOw.mContext, 2130772721));
                                    break;
                                }
                                c136303cOw.LIZJ.setVisibility(8);
                                break;
                            default:
                                c136303cOw.LIZJ.setVisibility(8);
                                break;
                        }
                    }
                }
                C136304cOx c136304cOx = c136302cOv.LJFF;
                if (c136304cOx != null && !PatchProxy.proxy(new Object[]{cJPayBalanceTradeQueryResponseBean}, c136304cOx, C136304cOx.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(cJPayBalanceTradeQueryResponseBean);
                    if (c136304cOx.mContext != null) {
                        c136304cOx.LIZJ.setText(cJPayBalanceTradeQueryResponseBean.trade_info.trade_no);
                        if (!TextUtils.isEmpty(cJPayBalanceTradeQueryResponseBean.trade_info.icon_url)) {
                            c136304cOx.LJII.setTag(cJPayBalanceTradeQueryResponseBean.trade_info.icon_url);
                            c136304cOx.LJIIIIZZ.setTag(cJPayBalanceTradeQueryResponseBean.trade_info.icon_url);
                            C136293cOm c136293cOm = C136294cOn.LIZIZ;
                            CJPayCard cJPayCard = C136246cO1.f18003LJ;
                            if (cJPayCard != null) {
                                str2 = cJPayCard.icon_url;
                            }
                            c136293cOm.LIZ(str2, c136304cOx.LJII, c136304cOx.LJIIIIZZ, true);
                        } else {
                            c136304cOx.LJII.setVisibility(8);
                            c136304cOx.LJIIIIZZ.setVisibility(8);
                        }
                        if (TextUtils.isEmpty(cJPayBalanceTradeQueryResponseBean.trade_info.bank_name)) {
                            str = "";
                        } else {
                            new StringBuilder();
                            str = C0002O.m25086C("", cJPayBalanceTradeQueryResponseBean.trade_info.bank_name);
                        }
                        if (!TextUtils.isEmpty(cJPayBalanceTradeQueryResponseBean.trade_info.bank_code_mask) && cJPayBalanceTradeQueryResponseBean.trade_info.bank_code_mask.length() > 3) {
                            new StringBuilder();
                            String str4 = cJPayBalanceTradeQueryResponseBean.trade_info.bank_code_mask;
                            int length = cJPayBalanceTradeQueryResponseBean.trade_info.bank_code_mask.length() - 4;
                            if (str4 != null) {
                                String substring = str4.substring(length);
                                Intrinsics.checkNotNullExpressionValue(substring, "");
                                str = C0002O.m25084C(str, "(", substring, ")");
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            c136304cOx.LJI.setText(str);
                        } else {
                            c136304cOx.LJI.setText("");
                        }
                        if (!TextUtils.isEmpty(cJPayBalanceTradeQueryResponseBean.trade_info.remark)) {
                            c136304cOx.LIZLLL.setText(cJPayBalanceTradeQueryResponseBean.trade_info.remark);
                            c136304cOx.LIZLLL.setVisibility(0);
                            c136304cOx.LJFF.setVisibility(0);
                        } else {
                            c136304cOx.LIZLLL.setVisibility(8);
                            c136304cOx.LJFF.setVisibility(8);
                        }
                        TextView textView = c136304cOx.LIZIZ;
                        long j = cJPayBalanceTradeQueryResponseBean.trade_info.trade_time * 1000;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, c136304cOx, C136304cOx.LIZ, false, 2);
                        if (proxy.isSupported) {
                            format = (String) proxy.result;
                        } else {
                            format = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Long.valueOf(j));
                            Intrinsics.checkNotNullExpressionValue(format, "");
                        }
                        textView.setText(format);
                        c136304cOx.f18012LJ.setOnClickListener(new View$OnClickListenerC136300cOt(c136304cOx, cJPayBalanceTradeQueryResponseBean));
                    }
                }
                C136342cPZ c136342cPZ = c136302cOv.LIZJ;
                if (c136342cPZ != null) {
                    c136342cPZ.LIZ(C136340cPX.LIZIZ.LIZ(cJPayBalanceTradeQueryResponseBean.result_page_show_conf.discount_banner), "");
                }
            }
            LIZIZ(cJPayBalanceTradeQueryResponseBean);
        }
    }
}
