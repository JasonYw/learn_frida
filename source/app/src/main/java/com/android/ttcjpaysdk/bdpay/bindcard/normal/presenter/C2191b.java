package com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.utils.CJPayEncryptUtil;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p138b.C2189a;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBankInfoBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardParamsBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135543cCg;
import p003X.C135876cI3;
import p003X.C136035cKc;
import p003X.C136093cLY;
import p003X.C136094cLZ;
import p003X.C136106cLl;
import p003X.C9H6;
import p003X.DialogC137460chc;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter.b */
/* loaded from: classes17.dex */
public final class C2191b extends C135543cCg<C2189a, e$a> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6773);
    }

    public final void LIZ() {
        C2208b c2208b;
        String str;
        CJPayBindCardParamsBean cJPayBindCardParamsBean;
        CJPayBindCardParamsBean cJPayBindCardParamsBean2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && (c2208b = (C2208b) this.mModel) != null) {
            String LIZ2 = C136035cKc.LIZIZ().LIZ(true);
            CJPayCardAddBean LIZ3 = C135876cI3.LIZ();
            String str2 = null;
            if (LIZ3 != null && (cJPayBindCardParamsBean2 = LIZ3.url_params) != null) {
                str = cJPayBindCardParamsBean2.sign_order_no;
            } else {
                str = null;
            }
            CJPayCardAddBean LIZ4 = C135876cI3.LIZ();
            if (LIZ4 != null && (cJPayBindCardParamsBean = LIZ4.url_params) != null) {
                str2 = cJPayBindCardParamsBean.smch_id;
            }
            C136106cLl c136106cLl = new C136106cLl(this);
            if (!PatchProxy.proxy(new Object[]{LIZ2, str, str2, c136106cLl}, c2208b, C2189a.LIZIZ, false, 2).isSupported) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("experiment", LIZ2);
                    jSONObject.put("exts", jSONObject2);
                    jSONObject.put("sign_order_no", str);
                    jSONObject.put("smch_id", str2);
                } catch (JSONException unused) {
                }
                c2208b.LIZ(jSONObject, "bytepay.member_product.get_bank_list", (String) null, (String) null, true, (String) null, (ICJPayCallback) c136106cLl);
            }
        }
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Context context = getContext();
        if (context == null) {
            return "";
        }
        CJPayCardAddBean LIZ2 = C135876cI3.LIZ();
        if (LIZ2 != null) {
            CJPayBindCardParamsBean cJPayBindCardParamsBean = LIZ2.url_params;
            Intrinsics.checkNotNullExpressionValue(cJPayBindCardParamsBean, "");
            if (cJPayBindCardParamsBean.isAuth() && !TextUtils.isEmpty(LIZ2.url_params.id_name_mask)) {
                String str = LIZ2.url_params.id_name_mask;
                Intrinsics.checkNotNullExpressionValue(str, "");
                String format = String.format("%s %s %s%s", Arrays.copyOf(new Object[]{context.getString(2131561425), str, context.getString(2131561511), context.getString(2131561422)}, 4));
                Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }
        }
        String string = context.getString(2131561510);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String format2 = String.format("%s%s%s%s", Arrays.copyOf(new Object[]{context.getString(2131561425), string, context.getString(2131561511), context.getString(2131561422)}, 4));
        Intrinsics.checkNotNullExpressionValue(format2, "");
        return format2;
    }

    public final void LIZ(CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{cJPayRealNameBean}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(cJPayRealNameBean);
        C2208b c2208b = (C2208b) this.mModel;
        if (c2208b != null) {
            c2208b.LIZ(cJPayRealNameBean, new C136093cLY(this, cJPayRealNameBean));
        }
    }

    public final void LIZ(boolean z) {
        Context context;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported && (context = getContext()) != null) {
            C9H6.LIZ(context, new CardBinPresenter$showFaceCompareLoading$1(this, z), 100L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(String str, boolean z, boolean z2) {
        Object obj;
        CJPayBindCardParamsBean cJPayBindCardParamsBean;
        CJPayBindCardParamsBean cJPayBindCardParamsBean2;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C2208b c2208b = (C2208b) this.mModel;
        if (c2208b != null) {
            CJPayCardAddBean LIZ2 = C135876cI3.LIZ();
            Object obj2 = null;
            if (LIZ2 != null && (cJPayBindCardParamsBean2 = LIZ2.url_params) != null) {
                obj = cJPayBindCardParamsBean2.sign_order_no;
            } else {
                obj = null;
            }
            CJPayCardAddBean LIZ3 = C135876cI3.LIZ();
            if (LIZ3 != null && (cJPayBindCardParamsBean = LIZ3.url_params) != null) {
                obj2 = cJPayBindCardParamsBean.smch_id;
            }
            String LIZ4 = C136035cKc.LJIIIIZZ().LIZ(true);
            ICJPayCallback c136094cLZ = new C136094cLZ(this, str, z2);
            if (!PatchProxy.proxy(new Object[]{obj, obj2, str, Byte.valueOf((byte) z), LIZ4, c136094cLZ}, c2208b, C2189a.LIZIZ, false, 3).isSupported) {
                C106862S5w.LIZ(LIZ4);
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cjpay_card_bin_test", LIZ4);
                    CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
                    jSONObject.put("sign_order_no", obj);
                    jSONObject.put("smch_id", obj2);
                    jSONObject.put("card_no", CJPayEncryptUtil.getEncryptDataSM(str));
                    jSONObject.put("is_fuzzy_match", z);
                    cJPaySecureRequestParams.version = 3;
                    cJPaySecureRequestParams.type1 = 2;
                    cJPaySecureRequestParams.type2 = 1;
                    cJPaySecureRequestParams.check = 0;
                    cJPaySecureRequestParams.fields.add("card_no");
                    jSONObject.put("secure_request_params", cJPaySecureRequestParams.toJson());
                    jSONObject.put("exts", jSONObject2);
                } catch (JSONException unused) {
                }
                c2208b.LIZ(jSONObject, "bytepay.member_product.get_card_bin", (String) null, (String) null, true, (String) null, c136094cLZ);
            }
        }
    }

    public final void LIZ(ArrayList<CJPayBankInfoBean> arrayList, ArrayList<QuickBindCardAdapterBean> arrayList2, boolean z, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (!PatchProxy.proxy(new Object[]{arrayList, arrayList2, (byte) 0, str}, this, LIZ, false, 12).isSupported && arrayList != null && arrayList.size() > 0) {
            if (CJPayHostInfo.applicationContext == null) {
                str2 = "";
            } else {
                Context context = CJPayHostInfo.applicationContext;
                Intrinsics.checkNotNull(context);
                str2 = context.getResources().getString(2131561873);
            }
            Intrinsics.checkNotNullExpressionValue(str2, "");
            if (CJPayHostInfo.applicationContext == null) {
                str3 = "";
            } else {
                Context context2 = CJPayHostInfo.applicationContext;
                Intrinsics.checkNotNull(context2);
                str3 = context2.getResources().getString(2131561872);
            }
            Intrinsics.checkNotNullExpressionValue(str3, "");
            if (CJPayHostInfo.applicationContext == null) {
                str4 = "";
            } else {
                Context context3 = CJPayHostInfo.applicationContext;
                Intrinsics.checkNotNull(context3);
                str4 = context3.getResources().getString(2131561909);
            }
            Intrinsics.checkNotNullExpressionValue(str4, "");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (C135876cI3.f17973LJ.LJIIIIZZ().isUnionPayBindEnable != 1) {
                    CJPayBankInfoBean cJPayBankInfoBean = arrayList.get(i);
                    Intrinsics.checkNotNullExpressionValue(cJPayBankInfoBean, "");
                    if (cJPayBankInfoBean.isUnionPay()) {
                    }
                }
                QuickBindCardAdapterBean quickBindCardAdapterBean = new QuickBindCardAdapterBean();
                CJPayBankInfoBean cJPayBankInfoBean2 = arrayList.get(i);
                quickBindCardAdapterBean.bankName = cJPayBankInfoBean2.bank_name;
                quickBindCardAdapterBean.bankIconUrl = cJPayBankInfoBean2.icon_url;
                quickBindCardAdapterBean.iconBackground = cJPayBankInfoBean2.icon_background;
                quickBindCardAdapterBean.cardType = cJPayBankInfoBean2.card_type;
                quickBindCardAdapterBean.bankCode = cJPayBankInfoBean2.bank_code;
                quickBindCardAdapterBean.debitVoucher = cJPayBankInfoBean2.getDebitVoucher();
                quickBindCardAdapterBean.creditVoucher = cJPayBankInfoBean2.getCreditVoucher();
                quickBindCardAdapterBean.unionPayVoucher = cJPayBankInfoBean2.getUnionPayVoucher();
                quickBindCardAdapterBean.fuseVoucher = cJPayBankInfoBean2.getFuseVoucher();
                quickBindCardAdapterBean.cardBinVoucher = cJPayBankInfoBean2.getCardBinVoucher();
                quickBindCardAdapterBean.voucher_info_map = cJPayBankInfoBean2.getVoucherInfoMap();
                quickBindCardAdapterBean.bank_rank = cJPayBankInfoBean2.bank_rank;
                quickBindCardAdapterBean.rank_type = cJPayBankInfoBean2.rank_type;
                quickBindCardAdapterBean.is_support_one_key = cJPayBankInfoBean2.is_support_one_key;
                quickBindCardAdapterBean.use_order_info_test = str;
                if (Intrinsics.areEqual("DEBIT", cJPayBankInfoBean2.card_type)) {
                    str5 = str2;
                } else if (!Intrinsics.areEqual("CREDIT", cJPayBankInfoBean2.card_type)) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                quickBindCardAdapterBean.descLable = str5;
                arrayList2.add(quickBindCardAdapterBean);
            }
        }
    }

    public final void LIZ(String str, String str2, String str3, String str4, String str5, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        DialogC137460chc LJIILIIL;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, onClickListener, onClickListener2, onClickListener3}, this, LIZ, false, 10).isSupported) {
            return;
        }
        e$a e_a = (e$a) this.mView;
        if (e_a != null) {
            e_a.LIZIZ(false);
        }
        e$a e_a2 = (e$a) this.mView;
        if (e_a2 != null) {
            Context context = getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder((Activity) context);
            defaultBuilder.setTitle(str);
            defaultBuilder.setSubTitle(str2);
            defaultBuilder.setLeftBtnStr(str3);
            defaultBuilder.setRightBtnStr(str4);
            defaultBuilder.setSingleBtnStr(str5);
            defaultBuilder.setLeftBtnListener(onClickListener);
            defaultBuilder.setRightBtnListener(onClickListener2);
            defaultBuilder.setSingleBtnListener(onClickListener3);
            DialogC137460chc build = defaultBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build, "");
            e_a2.LIZ(build);
        }
        e$a e_a3 = (e$a) this.mView;
        if (e_a3 != null && (LJIILIIL = e_a3.LJIILIIL()) != null) {
            C116971W2r.LIZJ(LJIILIIL);
        }
    }
}
