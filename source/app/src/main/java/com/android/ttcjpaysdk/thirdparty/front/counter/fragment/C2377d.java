package com.android.ttcjpaysdk.thirdparty.front.counter.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.p167d.C2319b;
import com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.android.ttcjpaysdk.thirdparty.data.FrontPayTypeData;
import com.android.ttcjpaysdk.thirdparty.data.FrontPreTradeInfo;
import com.android.ttcjpaysdk.thirdparty.data.FrontSubPayTypeInfo;
import com.android.ttcjpaysdk.thirdparty.data.FrontVerifyPageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC136419cQo;
import p003X.AbstractC136421cQq;
import p003X.AbstractC136788cWl;
import p003X.AbstractC136833cXU;
import p003X.C106862S5w;
import p003X.C136417cQm;
import p003X.C136777cWa;
import p003X.C136778cWb;
import p003X.C136782cWf;
import p003X.C136783cWg;
import p003X.C136784cWh;
import p003X.C136797cWu;
import p003X.C136805cX2;
import p003X.C136834cXV;
import p003X.RunnableC136824cXL;
import p003X.RunnableC136825cXM;
import p003X.RunnableC136826cXN;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d */
/* loaded from: classes17.dex */
public final class C2377d extends CJPayBaseFragment implements INormalBindCardCallback, AbstractC136419cQo, AbstractC136421cQq {
    public static ChangeQuickRedirect LIZ;
    public static final C136805cX2 LJIJ = new C136805cX2((byte) 0);
    public CJPayInsufficientBalanceHintInfo LIZIZ;
    public FrontPreTradeInfo LJFF;
    public boolean LJIIJJI;
    public AbstractC136788cWl LJIILIIL;
    public C136417cQm LJIILJJIL;
    public AbstractC136833cXU LJIILL;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public HashMap LJIL;
    public String LJIJI = "insufficient_style_normal";
    public String LIZJ = "";
    public String LIZLLL = "";

    /* renamed from: LJ */
    public String f25534LJ = "";
    public String LJIIJ = "0";
    public boolean LJIIL = true;
    public boolean LJIILLIIL = true;
    public final Lazy LJIIZILJ = LazyKt__LazyJVMKt.lazy(new NewInsufficientBalanceFragment$keepDialogConfig$2(this));

    static {
        Covode.recordClassIndex(8672);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690626;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        AbstractC136788cWl c136784cWh;
        if (!PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 3).isSupported && view != null) {
            String str = this.LJIJI;
            int hashCode = str.hashCode();
            if (hashCode == -937547182) {
                if (str.equals("insufficient_style_dialog")) {
                    c136784cWh = new C136784cWh(view, 2131690762);
                }
                c136784cWh = new C136783cWg(view, 2131690763);
            } else if (hashCode == -645207567) {
                if (str.equals("insufficient_style_normal")) {
                    c136784cWh = new C136783cWg(view, 2131690763);
                }
                c136784cWh = new C136783cWg(view, 2131690763);
            } else {
                if (hashCode == 244645484 && str.equals("insufficient_style_credit_pay")) {
                    c136784cWh = new C136797cWu(view, 2131690761);
                }
                c136784cWh = new C136783cWg(view, 2131690763);
            }
            this.LJIILIIL = c136784cWh;
            AbstractC136788cWl abstractC136788cWl = this.LJIILIIL;
            if (abstractC136788cWl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC136788cWl.LIZ(this.LIZIZ);
            if (this.LJIJJLI) {
                AbstractC136788cWl abstractC136788cWl2 = this.LJIILIIL;
                if (abstractC136788cWl2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC136788cWl2.LIZIZ();
            }
            C136417cQm c136417cQm = this.LJIILJJIL;
            if (c136417cQm == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c136417cQm.LIZ();
            this.LJIIJ = "0";
            this.LJIIJJI = false;
            this.LJIJJ = true;
            LJIIJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        if ((r1.isSupported ? ((java.lang.Boolean) r1.result).booleanValue() : kotlin.jvm.internal.Intrinsics.areEqual(r10.verify_page_info.user_info.pwd_check_way, "5")) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // p003X.AbstractC136421cQq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.android.ttcjpaysdk.thirdparty.data.FrontVerifyPageInfo r10) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2377d.LIZ(com.android.ttcjpaysdk.thirdparty.data.FrontVerifyPageInfo):void");
    }

    @Override // p003X.AbstractC136419cQo
    public final void LIZ(FrontPreTradeInfo frontPreTradeInfo) {
        if (PatchProxy.proxy(new Object[]{frontPreTradeInfo}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJFF = frontPreTradeInfo;
        String str = null;
        String str2 = frontPreTradeInfo != null ? frontPreTradeInfo.code : null;
        if (str2 != null && str2.hashCode() == -1850077791 && str2.equals("CD000000")) {
            this.LJIIJ = "2";
            if (!this.LJIIJJI) {
                return;
            }
            LIZ(this, 2, false, 2, (Object) null);
            AbstractC136833cXU abstractC136833cXU = this.LJIILL;
            if (abstractC136833cXU == null) {
                return;
            }
            abstractC136833cXU.LIZ(frontPreTradeInfo, this.LIZLLL, this.f25534LJ, LJII());
            return;
        }
        this.LJIIJ = "1";
        if (!this.LJIIJJI) {
            return;
        }
        LIZ(this, 2, false, 2, (Object) null);
        Context context = getContext();
        if (frontPreTradeInfo != null) {
            str = frontPreTradeInfo.msg;
        }
        CJPayBasicUtils.displayToast(context, str);
    }

    @Override // p003X.AbstractC136419cQo
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LJFF = null;
        this.LJIIJ = "1";
        if (!this.LJIIJJI) {
            return;
        }
        LIZ(this, 2, false, 2, (Object) null);
        CJPayBasicUtils.displayToast(getContext(), LIZ(getContext(), 2131558456));
    }

    public final void LIZ(String str, CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo, String str2, int i, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, cJPayInsufficientBalanceHintInfo, str2, Integer.valueOf(i), str3, str4}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, cJPayInsufficientBalanceHintInfo, str2, str3, str4);
        if (!this.LJIJJ) {
            return;
        }
        if (!Intrinsics.areEqual(this.LJIJI, str)) {
            AbstractC136788cWl abstractC136788cWl = this.LJIILIIL;
            if (abstractC136788cWl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIILIIL = abstractC136788cWl.LIZ(str);
            this.LJIJI = str;
        }
        this.LIZIZ = cJPayInsufficientBalanceHintInfo;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f25534LJ = str4;
        AbstractC136788cWl abstractC136788cWl2 = this.LJIILIIL;
        if (abstractC136788cWl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC136788cWl2.LIZ(this.LIZIZ);
        LIZ(1, false);
        C136417cQm c136417cQm = this.LJIILJJIL;
        if (c136417cQm == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c136417cQm.LIZ();
        this.LJIIJ = "0";
        this.LJIIJJI = false;
        LJIIIZ();
        LJIIJ();
    }

    private final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        AbstractC136788cWl abstractC136788cWl = this.LJIILIIL;
        if (abstractC136788cWl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC136788cWl.LIZJ = new C136782cWf(this);
        AbstractC136788cWl abstractC136788cWl2 = this.LJIILIIL;
        if (abstractC136788cWl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC136788cWl2.LIZ();
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(this.LJIJI, "insufficient_style_dialog");
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    /* renamed from: LJ */
    public final int mo16030LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (Intrinsics.areEqual(this.LJIJI, "insufficient_style_normal")) {
            return C136834cXV.LIZ();
        }
        return C136834cXV.LIZLLL();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (Intrinsics.areEqual(this.LJIJI, "insufficient_style_normal")) {
            return C136834cXV.LIZJ();
        }
        return C136834cXV.LIZLLL();
    }

    public final boolean LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 30);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo = this.LIZIZ;
        if (cJPayInsufficientBalanceHintInfo == null) {
            return false;
        }
        return cJPayInsufficientBalanceHintInfo.hasCombinePay();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported && (hashMap = this.LJIL) != null) {
            hashMap.clear();
        }
    }

    private final void LJIIJ() {
        String str;
        String str2;
        FrontSubPayTypeInfo frontSubPayTypeInfo;
        FrontPayTypeData frontPayTypeData;
        FrontSubPayTypeInfo frontSubPayTypeInfo2;
        FrontSubPayTypeInfo frontSubPayTypeInfo3;
        FrontPayTypeData frontPayTypeData2;
        FrontSubPayTypeInfo frontSubPayTypeInfo4;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        C136778cWb c136778cWb = C136777cWa.LIZIZ;
        JSONObject LJIIIIZZ = LJIIIIZZ();
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo = this.LIZIZ;
        String str3 = null;
        if (cJPayInsufficientBalanceHintInfo != null && (frontSubPayTypeInfo4 = cJPayInsufficientBalanceHintInfo.rec_pay_type) != null) {
            str = frontSubPayTypeInfo4.sub_pay_type;
        } else {
            str = null;
        }
        if (Intrinsics.areEqual("bank_card", str)) {
            CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo2 = this.LIZIZ;
            if (cJPayInsufficientBalanceHintInfo2 != null && (frontSubPayTypeInfo3 = cJPayInsufficientBalanceHintInfo2.rec_pay_type) != null && (frontPayTypeData2 = frontSubPayTypeInfo3.pay_type_data) != null) {
                str3 = frontPayTypeData2.card_type;
            }
            LJIIIIZZ.put("bank_type", LIZJ(str3));
        } else {
            CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo3 = this.LIZIZ;
            if (cJPayInsufficientBalanceHintInfo3 != null && (frontSubPayTypeInfo2 = cJPayInsufficientBalanceHintInfo3.rec_pay_type) != null) {
                str2 = frontSubPayTypeInfo2.sub_pay_type;
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual("new_bank_card", str2)) {
                CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo4 = this.LIZIZ;
                if (cJPayInsufficientBalanceHintInfo4 != null && (frontSubPayTypeInfo = cJPayInsufficientBalanceHintInfo4.rec_pay_type) != null && (frontPayTypeData = frontSubPayTypeInfo.pay_type_data) != null) {
                    str3 = frontPayTypeData.card_type;
                }
                LJIIIIZZ.put("newcard_type", str3);
            }
        }
        c136778cWb.LIZ("wallet_cashier_second_pay_page_imp", LJIIIIZZ);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("insufficient_show_style");
            if (string == null) {
                string = "insufficient_style_normal";
            }
            this.LJIJI = string;
            Serializable serializable = arguments.getSerializable("insufficient_data");
            if (!(serializable instanceof CJPayInsufficientBalanceHintInfo)) {
                serializable = null;
            }
            this.LIZIZ = (CJPayInsufficientBalanceHintInfo) serializable;
            String string2 = arguments.getString("insufficient_ext_param");
            if (string2 == null) {
                string2 = "";
            }
            this.LIZJ = string2;
            arguments.getInt("insufficient_fragment_height");
            this.LIZLLL = arguments.getString("insufficient_error_code");
            this.f25534LJ = arguments.getString("insufficient_error_message");
            this.LJIJJLI = Intrinsics.areEqual("1", arguments.getString("insufficient_show_mask"));
        }
        this.LJIILJJIL = new C136417cQm(new C2319b(), this);
    }

    public final String LIZ() {
        FrontSubPayTypeInfo frontSubPayTypeInfo;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo = this.LIZIZ;
        if (cJPayInsufficientBalanceHintInfo != null && (frontSubPayTypeInfo = cJPayInsufficientBalanceHintInfo.rec_pay_type) != null && (str = frontSubPayTypeInfo.sub_pay_type) != null && (!TextUtils.isEmpty(str))) {
            switch (str.hashCode()) {
                case -1787710669:
                    if (str.equals("bank_card")) {
                        if (LJII()) {
                            return "Pre_Pay_Balance_Bankcard";
                        }
                        return "Pre_Pay_BankCard";
                    }
                    break;
                case -563976606:
                    if (str.equals("credit_pay")) {
                        return "Pre_Pay_Credit";
                    }
                    break;
                case -339185956:
                    if (str.equals("balance")) {
                        return "Pre_Pay_Balance";
                    }
                    break;
                case -127611052:
                    if (str.equals("new_bank_card")) {
                        if (LJII()) {
                            return "Pre_Pay_Balance_Newcard";
                        }
                        return "Pre_Pay_NewCard";
                    }
                    break;
            }
            return str;
        }
        return "";
    }

    public final JSONObject LJIIIIZZ() {
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo;
        FrontSubPayTypeInfo frontSubPayTypeInfo;
        FrontPayTypeData frontPayTypeData;
        CJPayVoucherInfo cJPayVoucherInfo;
        ArrayList<CJPayVoucherInfo.Voucher> arrayList;
        String str;
        String str2;
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo2;
        FrontSubPayTypeInfo frontSubPayTypeInfo2;
        FrontPayTypeData frontPayTypeData2;
        FrontSubPayTypeInfo frontSubPayTypeInfo3;
        FrontSubPayTypeInfo frontSubPayTypeInfo4;
        String str3;
        String str4;
        String str5;
        Integer num;
        String str6;
        FrontSubPayTypeInfo frontSubPayTypeInfo5;
        FrontPayTypeData frontPayTypeData3;
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo3;
        FrontSubPayTypeInfo frontSubPayTypeInfo6;
        FrontPayTypeData frontPayTypeData4;
        FrontPayTypeData.CombinePayInfo combinePayInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 33);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        String str7 = null;
        if (!LJII() ? !((cJPayInsufficientBalanceHintInfo = this.LIZIZ) == null || (frontSubPayTypeInfo = cJPayInsufficientBalanceHintInfo.rec_pay_type) == null || (frontPayTypeData = frontSubPayTypeInfo.pay_type_data) == null || (cJPayVoucherInfo = frontPayTypeData.voucher_info) == null) : !((cJPayInsufficientBalanceHintInfo3 = this.LIZIZ) == null || (frontSubPayTypeInfo6 = cJPayInsufficientBalanceHintInfo3.rec_pay_type) == null || (frontPayTypeData4 = frontSubPayTypeInfo6.pay_type_data) == null || (combinePayInfo = frontPayTypeData4.combine_pay_info) == null || (cJPayVoucherInfo = combinePayInfo.voucher_info) == null)) {
            arrayList = cJPayVoucherInfo.vouchers;
        } else {
            arrayList = null;
        }
        if (arrayList != null && arrayList.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            CJPayVoucherInfo.Voucher voucher = arrayList.get(0);
            if (voucher == null || (str3 = voucher.voucher_no) == null) {
                str3 = "";
            }
            jSONObject.put(C33968a.f42937f, str3);
            CJPayVoucherInfo.Voucher voucher2 = arrayList.get(0);
            if (voucher2 == null || (str4 = voucher2.voucher_type) == null) {
                str4 = "";
            }
            jSONObject.put("type", str4);
            CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo4 = this.LIZIZ;
            if (cJPayInsufficientBalanceHintInfo4 == null || (frontSubPayTypeInfo5 = cJPayInsufficientBalanceHintInfo4.rec_pay_type) == null || (frontPayTypeData3 = frontSubPayTypeInfo5.pay_type_data) == null || (str5 = frontPayTypeData3.bank_code) == null) {
                str5 = "";
            }
            jSONObject.put("front_bank_code", str5);
            CJPayVoucherInfo.Voucher voucher3 = arrayList.get(0);
            if (voucher3 == null) {
                num = "";
            } else {
                num = Integer.valueOf(voucher3.reduce_amount);
            }
            jSONObject.put("reduce", num);
            CJPayVoucherInfo.Voucher voucher4 = arrayList.get(0);
            if (voucher4 == null || (str6 = voucher4.label) == null) {
                str6 = "";
            }
            jSONObject.put("label", str6);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_code", this.LIZLLL);
        jSONObject2.put(PushMessageHelper.ERROR_MESSAGE, this.f25534LJ);
        jSONObject2.put("activity_info", jSONArray);
        jSONObject2.put("rec_method", LIZ());
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo5 = this.LIZIZ;
        if (cJPayInsufficientBalanceHintInfo5 != null && (frontSubPayTypeInfo4 = cJPayInsufficientBalanceHintInfo5.rec_pay_type) != null) {
            str = frontSubPayTypeInfo4.sub_pay_type;
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual("new_bank_card", str)) {
            CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo6 = this.LIZIZ;
            if (cJPayInsufficientBalanceHintInfo6 != null && (frontSubPayTypeInfo3 = cJPayInsufficientBalanceHintInfo6.rec_pay_type) != null) {
                str7 = frontSubPayTypeInfo3.sub_pay_type;
            }
            if (!Intrinsics.areEqual("credit_pay", str7) || ((cJPayInsufficientBalanceHintInfo2 = this.LIZIZ) != null && (frontSubPayTypeInfo2 = cJPayInsufficientBalanceHintInfo2.rec_pay_type) != null && (frontPayTypeData2 = frontSubPayTypeInfo2.pay_type_data) != null && frontPayTypeData2.is_credit_activate)) {
                str2 = "1";
                jSONObject2.put("is_reserve_method", str2);
                return jSONObject2;
            }
        }
        str2 = "0";
        jSONObject2.put("is_reserve_method", str2);
        return jSONObject2;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 4).isSupported) {
            return;
        }
        LJIIIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public final void onBindCardResult(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 34).isSupported) {
            return;
        }
        INormalBindCardCallback.DefaultImpls.onBindCardResult(this, jSONObject);
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public final void onEntranceResult(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(this, 1, false, 2, (Object) null);
    }

    public static final /* synthetic */ AbstractC136788cWl LIZ(C2377d c2377d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2377d}, null, LIZ, true, 36);
        if (proxy.isSupported) {
            return (AbstractC136788cWl) proxy.result;
        }
        AbstractC136788cWl abstractC136788cWl = c2377d.LJIILIIL;
        if (abstractC136788cWl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC136788cWl;
    }

    private final boolean LIZIZ(FrontVerifyPageInfo frontVerifyPageInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{frontVerifyPageInfo}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (Intrinsics.areEqual("Pre_Pay_Credit", LIZ()) && !frontVerifyPageInfo.verify_page_info.pay_info.is_credit_activate) {
            return true;
        }
        return false;
    }

    private final String LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 26);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 64920780) {
                if (hashCode == 1996005113 && str.equals("CREDIT")) {
                    return "信用卡";
                }
                return "";
            } else if (str.equals("DEBIT")) {
                return "储蓄卡";
            } else {
                return "";
            }
        }
        return "";
    }

    private final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC136826cXN(this), 500L);
                    return;
                }
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC136825cXM(this), 500L);
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC136824cXL(this), 500L);
    }

    private final void LIZJ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AbstractC136788cWl abstractC136788cWl = this.LJIILIIL;
                    if (abstractC136788cWl == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    abstractC136788cWl.LIZJ(false);
                    return;
                }
                return;
            }
            AbstractC136788cWl abstractC136788cWl2 = this.LJIILIIL;
            if (abstractC136788cWl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC136788cWl2.LIZIZ(false);
            return;
        }
        AbstractC136788cWl abstractC136788cWl3 = this.LJIILIIL;
        if (abstractC136788cWl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC136788cWl3.LIZ(false);
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C136778cWb c136778cWb = C136777cWa.LIZIZ;
        JSONObject LJIIIIZZ = LJIIIIZZ();
        LJIIIIZZ.put("button_name", str);
        c136778cWb.LIZ("wallet_cashier_second_pay_keep_pop_click", LJIIIIZZ);
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 10).isSupported || !this.LJIJJ) {
            return;
        }
        this.LJIIL = false;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AbstractC136788cWl abstractC136788cWl = this.LJIILIIL;
                    if (abstractC136788cWl == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    abstractC136788cWl.LIZJ(true);
                    return;
                }
                return;
            }
            AbstractC136788cWl abstractC136788cWl2 = this.LJIILIIL;
            if (abstractC136788cWl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC136788cWl2.LIZIZ(true);
            return;
        }
        AbstractC136788cWl abstractC136788cWl3 = this.LJIILIIL;
        if (abstractC136788cWl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC136788cWl3.LIZ(true);
    }

    @Override // p003X.AbstractC136421cQq
    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZ(this, 1, false, 2, (Object) null);
        CJPayBasicUtils.displayToast(getContext(), LIZ(getContext(), 2131558456));
    }

    public final void LIZJ(String str, String str2) {
        String str3;
        String str4;
        FrontSubPayTypeInfo frontSubPayTypeInfo;
        FrontPayTypeData frontPayTypeData;
        FrontSubPayTypeInfo frontSubPayTypeInfo2;
        FrontSubPayTypeInfo frontSubPayTypeInfo3;
        FrontPayTypeData frontPayTypeData2;
        FrontSubPayTypeInfo frontSubPayTypeInfo4;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 27).isSupported) {
            return;
        }
        C136778cWb c136778cWb = C136777cWa.LIZIZ;
        JSONObject LJIIIIZZ = LJIIIIZZ();
        LJIIIIZZ.put("button_name", str);
        if (!TextUtils.isEmpty(str2)) {
            LJIIIIZZ.put("pre_method", str2);
        }
        CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo = this.LIZIZ;
        String str5 = null;
        if (cJPayInsufficientBalanceHintInfo != null && (frontSubPayTypeInfo4 = cJPayInsufficientBalanceHintInfo.rec_pay_type) != null) {
            str3 = frontSubPayTypeInfo4.sub_pay_type;
        } else {
            str3 = null;
        }
        if (Intrinsics.areEqual("bank_card", str3)) {
            CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo2 = this.LIZIZ;
            if (cJPayInsufficientBalanceHintInfo2 != null && (frontSubPayTypeInfo3 = cJPayInsufficientBalanceHintInfo2.rec_pay_type) != null && (frontPayTypeData2 = frontSubPayTypeInfo3.pay_type_data) != null) {
                str5 = frontPayTypeData2.card_type;
            }
            LJIIIIZZ.put("bank_type", LIZJ(str5));
        } else {
            CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo3 = this.LIZIZ;
            if (cJPayInsufficientBalanceHintInfo3 != null && (frontSubPayTypeInfo2 = cJPayInsufficientBalanceHintInfo3.rec_pay_type) != null) {
                str4 = frontSubPayTypeInfo2.sub_pay_type;
            } else {
                str4 = null;
            }
            if (Intrinsics.areEqual("new_bank_card", str4)) {
                CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo4 = this.LIZIZ;
                if (cJPayInsufficientBalanceHintInfo4 != null && (frontSubPayTypeInfo = cJPayInsufficientBalanceHintInfo4.rec_pay_type) != null && (frontPayTypeData = frontSubPayTypeInfo.pay_type_data) != null) {
                    str5 = frontPayTypeData.card_type;
                }
                LJIIIIZZ.put("newcard_type", str5);
            }
        }
        c136778cWb.LIZ("wallet_cashier_second_pay_page_click", LJIIIIZZ);
    }

    public final void LIZ(int i, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported || !this.LJIJJ) {
            return;
        }
        this.LJIIL = true;
        if (z) {
            LIZIZ(i);
        } else {
            LIZJ(i);
        }
    }

    public static /* synthetic */ void LIZ(C2377d c2377d, int i, boolean z, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2377d, Integer.valueOf(i), (byte) 0, 2, null}, null, LIZ, true, 12).isSupported) {
            return;
        }
        c2377d.LIZ(i, true);
    }

    public static /* synthetic */ void LIZ(C2377d c2377d, String str, String str2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2377d, str, null, 2, null}, null, LIZ, true, 28).isSupported) {
            return;
        }
        c2377d.LIZJ(str, "");
    }
}
