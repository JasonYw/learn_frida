package com.android.ttcjpaysdk.thirdparty.front.counter.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.p167d.C2319b;
import com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.android.ttcjpaysdk.thirdparty.data.FrontPayTypeData;
import com.android.ttcjpaysdk.thirdparty.data.FrontPreTradeInfo;
import com.android.ttcjpaysdk.thirdparty.data.FrontSubPayTypeInfo;
import com.android.ttcjpaysdk.thirdparty.data.FrontSubPayTypeSumInfo;
import com.android.ttcjpaysdk.thirdparty.data.FrontVerifyPageInfo;
import com.android.ttcjpaysdk.thirdparty.data.PreTradeInfo;
import com.android.ttcjpaysdk.thirdparty.front.counter.data.FrontPaymentMethodInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.internal.C33838c;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC136421cQq;
import p003X.AbstractC136871cY6;
import p003X.AbstractC136938cZB;
import p003X.C106862S5w;
import p003X.C136417cQm;
import p003X.C136777cWa;
import p003X.C136785cWi;
import p003X.C136786cWj;
import p003X.C136787cWk;
import p003X.C136789cWm;
import p003X.C136834cXV;
import p003X.C136877cYC;
import p003X.C9H6;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.counter.fragment.c */
/* loaded from: classes17.dex */
public final class C2376c extends CJPayBaseFragment implements INormalBindCardCallback, AbstractC136421cQq {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public AbstractC136871cY6 f25533LJ;
    public C136785cWi LJFF;
    public ExtendRecyclerView LJIIJ;
    public C136789cWm LJIIJJI;
    public C136417cQm LJIIL;
    public FrontPreTradeInfo LJIILJJIL;
    public FrontPaymentMethodInfo LJIILL;
    public boolean LJIJ;
    public HashMap LJIJI;
    public ArrayList<FrontPaymentMethodInfo> LJIILIIL = new ArrayList<>();
    public int LJIILLIIL = -1;
    public int LJIIZILJ = C136834cXV.LIZIZ();
    public String LIZIZ = "";
    public String LIZJ = "";

    static {
        Covode.recordClassIndex(8668);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690604;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && (hashMap = this.LJIJI) != null) {
            hashMap.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        Serializable serializable;
        ArrayList<FrontPaymentMethodInfo> arrayList;
        PreTradeInfo preTradeInfo;
        CJPayPayTypeInfo cJPayPayTypeInfo;
        FrontSubPayTypeSumInfo frontSubPayTypeSumInfo;
        ArrayList<FrontSubPayTypeInfo> arrayList2;
        FrontPaymentMethodInfo frontPaymentMethodInfo;
        FrontPaymentMethodInfo frontPaymentMethodInfo2;
        FrontPaymentMethodInfo frontPaymentMethodInfo3;
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIL = new C136417cQm(new C2319b(), this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("param_pay_type_info");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof FrontPreTradeInfo)) {
                serializable = null;
            }
            this.LJIILJJIL = (FrontPreTradeInfo) serializable;
            this.LJIILIIL.clear();
            ArrayList<FrontPaymentMethodInfo> arrayList3 = this.LJIILIIL;
            C136785cWi c136785cWi = this.LJFF;
            if (c136785cWi == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            FrontPreTradeInfo frontPreTradeInfo = this.LJIILJJIL;
            char c = 1;
            int i = 5;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{frontPreTradeInfo}, c136785cWi, C136785cWi.LIZ, false, 5);
            if (proxy.isSupported) {
                arrayList = (ArrayList) proxy.result;
            } else {
                arrayList = new ArrayList<>();
                ArrayList arrayList4 = new ArrayList();
                if (frontPreTradeInfo != null && (preTradeInfo = frontPreTradeInfo.pre_trade_info) != null && (cJPayPayTypeInfo = preTradeInfo.paytype_info) != null && (frontSubPayTypeSumInfo = cJPayPayTypeInfo.sub_pay_type_sum_info) != null && (arrayList2 = frontSubPayTypeSumInfo.sub_pay_type_info_list) != null) {
                    for (FrontSubPayTypeInfo frontSubPayTypeInfo : arrayList2) {
                        String str2 = frontSubPayTypeInfo.sub_pay_type;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1787710669:
                                    if (str2.equals("bank_card")) {
                                        Context context = c136785cWi.mContext;
                                        if (!(context instanceof AbstractC136938cZB)) {
                                            context = null;
                                        }
                                        AbstractC136938cZB abstractC136938cZB = (AbstractC136938cZB) context;
                                        if (abstractC136938cZB != null) {
                                            String str3 = frontSubPayTypeInfo.pay_type_data.card_no;
                                            Intrinsics.checkNotNullExpressionValue(str3, "");
                                            if (!abstractC136938cZB.LIZ(str3)) {
                                                arrayList.add(C136787cWk.LIZIZ.LIZ(frontSubPayTypeInfo, false, c136785cWi.f18093LJ));
                                                break;
                                            }
                                        }
                                        FrontPaymentMethodInfo LIZ2 = C136787cWk.LIZIZ.LIZ(frontSubPayTypeInfo, false, c136785cWi.f18093LJ);
                                        Context context2 = c136785cWi.mContext;
                                        if (!(context2 instanceof AbstractC136938cZB)) {
                                            context2 = null;
                                        }
                                        AbstractC136938cZB abstractC136938cZB2 = (AbstractC136938cZB) context2;
                                        if (abstractC136938cZB2 != null) {
                                            String str4 = frontSubPayTypeInfo.pay_type_data.card_no;
                                            Intrinsics.checkNotNullExpressionValue(str4, "");
                                            str = abstractC136938cZB2.LJFF(str4);
                                        } else {
                                            str = null;
                                        }
                                        LIZ2.sub_title = str;
                                        arrayList4.add(LIZ2);
                                        break;
                                    }
                                    break;
                                case -563976606:
                                    if (str2.equals("credit_pay")) {
                                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{frontSubPayTypeInfo, (byte) 0}, C136787cWk.LIZIZ, C136787cWk.LIZ, false, 2);
                                        if (proxy2.isSupported) {
                                            frontPaymentMethodInfo3 = proxy2.result;
                                        } else {
                                            C106862S5w.LIZ(frontSubPayTypeInfo);
                                            FrontPaymentMethodInfo frontPaymentMethodInfo4 = new FrontPaymentMethodInfo();
                                            frontPaymentMethodInfo4.index = frontSubPayTypeInfo.index;
                                            frontPaymentMethodInfo4.icon_url = frontSubPayTypeInfo.icon_url;
                                            frontPaymentMethodInfo4.status = frontSubPayTypeInfo.status;
                                            frontPaymentMethodInfo4.title = frontSubPayTypeInfo.title;
                                            frontPaymentMethodInfo4.sub_title = frontSubPayTypeInfo.sub_title;
                                            frontPaymentMethodInfo4.sub_title_icon = "";
                                            frontPaymentMethodInfo4.mark = frontSubPayTypeInfo.mark;
                                            frontPaymentMethodInfo4.card_no = "creditpay";
                                            frontPaymentMethodInfo4.isChecked = false;
                                            frontPaymentMethodInfo4.paymentType = "creditpay";
                                            frontPaymentMethodInfo4.identity_verify_way = frontSubPayTypeInfo.identity_verify_way;
                                            frontPaymentMethodInfo3 = frontPaymentMethodInfo4;
                                        }
                                        arrayList.add(frontPaymentMethodInfo3);
                                        break;
                                    }
                                    break;
                                case -339185956:
                                    if (str2.equals("balance")) {
                                        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{frontSubPayTypeInfo, (byte) 0}, C136787cWk.LIZIZ, C136787cWk.LIZ, false, 1);
                                        if (proxy3.isSupported) {
                                            frontPaymentMethodInfo2 = proxy3.result;
                                        } else {
                                            C106862S5w.LIZ(frontSubPayTypeInfo);
                                            FrontPaymentMethodInfo frontPaymentMethodInfo5 = new FrontPaymentMethodInfo();
                                            frontPaymentMethodInfo5.index = frontSubPayTypeInfo.index;
                                            frontPaymentMethodInfo5.icon_url = frontSubPayTypeInfo.icon_url;
                                            frontPaymentMethodInfo5.status = frontSubPayTypeInfo.status;
                                            frontPaymentMethodInfo5.title = frontSubPayTypeInfo.title;
                                            frontPaymentMethodInfo5.sub_title = frontSubPayTypeInfo.sub_title;
                                            frontPaymentMethodInfo5.sub_title_icon = "";
                                            frontPaymentMethodInfo5.mark = frontSubPayTypeInfo.mark;
                                            frontPaymentMethodInfo5.card_no = "balance";
                                            frontPaymentMethodInfo5.isChecked = false;
                                            frontPaymentMethodInfo5.paymentType = "balance";
                                            frontPaymentMethodInfo5.mobile_mask = frontSubPayTypeInfo.pay_type_data.mobile_mask;
                                            frontPaymentMethodInfo5.voucher_info = frontSubPayTypeInfo.pay_type_data.voucher_info;
                                            frontPaymentMethodInfo5.voucher_msg_list = frontSubPayTypeInfo.pay_type_data.voucher_msg_list;
                                            frontPaymentMethodInfo5.identity_verify_way = frontSubPayTypeInfo.identity_verify_way;
                                            frontPaymentMethodInfo5.show_combine_pay = frontSubPayTypeInfo.pay_type_data.show_combine_pay;
                                            frontPaymentMethodInfo2 = frontPaymentMethodInfo5;
                                        }
                                        arrayList.add(frontPaymentMethodInfo2);
                                        break;
                                    }
                                    break;
                                case -127611052:
                                    if (str2.equals("new_bank_card")) {
                                        C136787cWk c136787cWk = C136787cWk.LIZIZ;
                                        boolean z = c136785cWi.f18093LJ;
                                        Object[] objArr = new Object[3];
                                        objArr[0] = frontSubPayTypeInfo;
                                        objArr[c] = (byte) 0;
                                        objArr[2] = Byte.valueOf(z ? (byte) 1 : (byte) 0);
                                        PatchProxyResult proxy4 = PatchProxy.proxy(objArr, c136787cWk, C136787cWk.LIZ, false, i);
                                        if (proxy4.isSupported) {
                                            frontPaymentMethodInfo = proxy4.result;
                                        } else {
                                            C106862S5w.LIZ(frontSubPayTypeInfo);
                                            FrontPaymentMethodInfo frontPaymentMethodInfo6 = new FrontPaymentMethodInfo();
                                            frontPaymentMethodInfo6.index = frontSubPayTypeInfo.index;
                                            frontPaymentMethodInfo6.icon_url = frontSubPayTypeInfo.icon_url;
                                            frontPaymentMethodInfo6.status = frontSubPayTypeInfo.status;
                                            frontPaymentMethodInfo6.title = frontSubPayTypeInfo.title;
                                            frontPaymentMethodInfo6.sub_title = frontSubPayTypeInfo.sub_title;
                                            frontPaymentMethodInfo6.mark = frontSubPayTypeInfo.mark;
                                            frontPaymentMethodInfo6.card_no = "addcard";
                                            frontPaymentMethodInfo6.isChecked = false;
                                            frontPaymentMethodInfo6.paymentType = "addcard";
                                            frontPaymentMethodInfo6.front_bank_code = frontSubPayTypeInfo.pay_type_data.bank_code;
                                            if (z) {
                                                frontPaymentMethodInfo6.voucher_info = frontSubPayTypeInfo.pay_type_data.combine_pay_info.voucher_info;
                                                frontPaymentMethodInfo6.voucher_msg_list = frontSubPayTypeInfo.pay_type_data.combine_pay_info.voucher_msg_list;
                                            } else {
                                                frontPaymentMethodInfo6.voucher_info = frontSubPayTypeInfo.pay_type_data.voucher_info;
                                                frontPaymentMethodInfo6.voucher_msg_list = frontSubPayTypeInfo.pay_type_data.voucher_msg_list;
                                            }
                                            frontPaymentMethodInfo6.identity_verify_way = frontSubPayTypeInfo.identity_verify_way;
                                            frontPaymentMethodInfo6.card_add_ext = frontSubPayTypeInfo.pay_type_data.card_add_ext;
                                            frontPaymentMethodInfo6.card_type_name = frontSubPayTypeInfo.pay_type_data.card_type;
                                            frontPaymentMethodInfo = frontPaymentMethodInfo6;
                                        }
                                        arrayList.add(frontPaymentMethodInfo);
                                        break;
                                    }
                                    break;
                            }
                            c = 1;
                            i = 5;
                        }
                    }
                }
                arrayList.addAll(arrayList4);
                if (c136785cWi.f18093LJ) {
                    c136785cWi.LIZ(arrayList);
                }
            }
            arrayList3.addAll(arrayList);
            C136789cWm c136789cWm = this.LJIIJJI;
            if (c136789cWm != null) {
                c136789cWm.LIZ(this.LJIILIIL);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public final void onBindCardResult(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 15).isSupported) {
            return;
        }
        INormalBindCardCallback.DefaultImpls.onBindCardResult(this, jSONObject);
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public final void onEntranceResult(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZIZ(false);
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported || !this.LJIJ) {
            return;
        }
        C136785cWi c136785cWi = this.LJFF;
        if (c136785cWi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c136785cWi.LIZ(z);
        if (z) {
            FrontPaymentMethodInfo frontPaymentMethodInfo = this.LJIILL;
            if (frontPaymentMethodInfo != null) {
                frontPaymentMethodInfo.isShowLoading = true;
            }
            C136789cWm c136789cWm = this.LJIIJJI;
            if (c136789cWm != null) {
                c136789cWm.notifyItemChanged(this.LJIILLIIL);
                return;
            }
            return;
        }
        FrontPaymentMethodInfo frontPaymentMethodInfo2 = this.LJIILL;
        if (frontPaymentMethodInfo2 != null) {
            frontPaymentMethodInfo2.isShowLoading = false;
        }
        C136789cWm c136789cWm2 = this.LJIIJJI;
        if (c136789cWm2 != null) {
            c136789cWm2.notifyItemChanged(this.LJIILLIIL);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJIIZILJ = arguments.getInt("param_anim");
            this.LIZIZ = arguments.getString("insufficient_error_code");
            this.LIZJ = arguments.getString("insufficient_error_message");
            this.LIZLLL = arguments.getBoolean("param_has_combine");
        }
        this.LJFF = new C136785cWi(view, this.LJIIZILJ, this.LIZLLL);
        C136785cWi c136785cWi = this.LJFF;
        if (c136785cWi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c136785cWi.LIZJ = new C136877cYC(this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            C136785cWi c136785cWi2 = this.LJFF;
            if (c136785cWi2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIIJ = c136785cWi2.LIZIZ;
            ExtendRecyclerView extendRecyclerView = this.LJIIJ;
            if (extendRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            extendRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
            ExtendRecyclerView extendRecyclerView2 = this.LJIIJ;
            if (extendRecyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            extendRecyclerView2.setItemAnimator(null);
            Context context = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.LJIIJJI = new C136789cWm(context, 0, 2);
            C136789cWm c136789cWm = this.LJIIJJI;
            if (c136789cWm != null) {
                c136789cWm.setHasStableIds(true);
            }
            ExtendRecyclerView extendRecyclerView3 = this.LJIIJ;
            if (extendRecyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            extendRecyclerView3.setAdapter(this.LJIIJJI);
            C136789cWm c136789cWm2 = this.LJIIJJI;
            if (c136789cWm2 != null) {
                c136789cWm2.LIZIZ = new C136786cWj(this);
            }
        }
    }

    @Override // p003X.AbstractC136421cQq
    public final void LIZ(FrontVerifyPageInfo frontVerifyPageInfo) {
        String str;
        AbstractC136871cY6 abstractC136871cY6;
        if (PatchProxy.proxy(new Object[]{frontVerifyPageInfo}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(frontVerifyPageInfo);
        String str2 = frontVerifyPageInfo.code;
        if (str2.hashCode() == -1850077791 && str2.equals("CD000000")) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{frontVerifyPageInfo}, this, LIZ, false, 9);
            if (proxy.isSupported) {
                str = (String) proxy.result;
            } else {
                str = frontVerifyPageInfo.verify_page_info.pay_info.business_scene;
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            switch (str.hashCode()) {
                case -1524118967:
                    if (!str.equals("Pre_Pay_Balance")) {
                        return;
                    }
                    break;
                case -234858324:
                    if (str.equals("Pre_Pay_Combine")) {
                        if (Intrinsics.areEqual("new_bank_card", frontVerifyPageInfo.verify_page_info.pay_info.primary_pay_type)) {
                            AbstractC136871cY6 abstractC136871cY62 = this.f25533LJ;
                            if (abstractC136871cY62 != null) {
                                abstractC136871cY62.LIZ(this.LJIILL, frontVerifyPageInfo);
                                return;
                            }
                            return;
                        }
                        AbstractC136871cY6 abstractC136871cY63 = this.f25533LJ;
                        if (abstractC136871cY63 != null) {
                            abstractC136871cY63.LIZ(frontVerifyPageInfo);
                        }
                        ExtendRecyclerView extendRecyclerView = this.LJIIJ;
                        if (extendRecyclerView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        C9H6.LIZ(extendRecyclerView, new FrontMethodFragment$onCreateSuccess$2(this), 300L);
                        return;
                    }
                    return;
                case 62163359:
                    if (!str.equals("Pre_Pay_BankCard")) {
                        return;
                    }
                    break;
                case 659760189:
                    if (str.equals("Pre_Pay_NewCard") && (abstractC136871cY6 = this.f25533LJ) != null) {
                        abstractC136871cY6.LIZ(this.LJIILL, frontVerifyPageInfo);
                        return;
                    }
                    return;
                default:
                    return;
            }
            AbstractC136871cY6 abstractC136871cY64 = this.f25533LJ;
            if (abstractC136871cY64 != null) {
                abstractC136871cY64.LIZ(frontVerifyPageInfo);
            }
            ExtendRecyclerView extendRecyclerView2 = this.LJIIJ;
            if (extendRecyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C9H6.LIZ(extendRecyclerView2, new FrontMethodFragment$onCreateSuccess$1(this), 300L);
            return;
        }
        ExtendRecyclerView extendRecyclerView3 = this.LJIIJ;
        if (extendRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C9H6.LIZ(extendRecyclerView3, new FrontMethodFragment$onCreateSuccess$3(this), 300L);
        if (frontVerifyPageInfo.msg.length() > 0) {
            CJPayBasicUtils.displayToast(getContext(), frontVerifyPageInfo.msg);
        }
    }

    @Override // p003X.AbstractC136421cQq
    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        ExtendRecyclerView extendRecyclerView = this.LJIIJ;
        if (extendRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C9H6.LIZ(extendRecyclerView, new FrontMethodFragment$onCreateFailed$1(this), 300L);
        CJPayBasicUtils.displayToast(getContext(), LIZ(getContext(), 2131558456));
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        ArrayList<FrontSubPayTypeInfo> arrayList;
        FrontPayTypeData frontPayTypeData;
        CJPayVoucherInfo cJPayVoucherInfo;
        ArrayList<CJPayVoucherInfo.Voucher> arrayList2;
        String str;
        String str2;
        Object obj;
        String str3;
        FrontPayTypeData frontPayTypeData2;
        FrontPayTypeData.CombinePayInfo combinePayInfo;
        PreTradeInfo preTradeInfo;
        CJPayPayTypeInfo cJPayPayTypeInfo;
        FrontSubPayTypeSumInfo frontSubPayTypeSumInfo;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJIJ = true;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            FrontPreTradeInfo frontPreTradeInfo = this.LJIILJJIL;
            if (frontPreTradeInfo != null && (preTradeInfo = frontPreTradeInfo.pre_trade_info) != null && (cJPayPayTypeInfo = preTradeInfo.paytype_info) != null && (frontSubPayTypeSumInfo = cJPayPayTypeInfo.sub_pay_type_sum_info) != null) {
                arrayList = frontSubPayTypeSumInfo.sub_pay_type_info_list;
            } else {
                arrayList = null;
            }
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            if (arrayList != null && (!arrayList.isEmpty())) {
                Iterator<FrontSubPayTypeInfo> it = arrayList.iterator();
                while (it.hasNext()) {
                    FrontSubPayTypeInfo next = it.next();
                    if (!this.LIZLLL ? !(next == null || (frontPayTypeData = next.pay_type_data) == null || (cJPayVoucherInfo = frontPayTypeData.voucher_info) == null) : !(next == null || (frontPayTypeData2 = next.pay_type_data) == null || (combinePayInfo = frontPayTypeData2.combine_pay_info) == null || (cJPayVoucherInfo = combinePayInfo.voucher_info) == null)) {
                        arrayList2 = cJPayVoucherInfo.vouchers;
                    } else {
                        arrayList2 = null;
                    }
                    String str4 = "";
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        String str5 = arrayList2.get(0).voucher_no;
                        if (str5 == null) {
                            str5 = str4;
                        }
                        jSONObject.put(C33968a.f42937f, str5);
                        CJPayVoucherInfo.Voucher voucher = arrayList2.get(0);
                        if (voucher == null || (str2 = voucher.voucher_type) == null) {
                            str2 = str4;
                        }
                        jSONObject.put("type", str2);
                        String str6 = next.pay_type_data.bank_code;
                        if (str6 == null) {
                            str6 = str4;
                        }
                        jSONObject.put("front_bank_code", str6);
                        CJPayVoucherInfo.Voucher voucher2 = arrayList2.get(0);
                        if (voucher2 != null) {
                            obj = Integer.valueOf(voucher2.reduce_amount);
                        } else {
                            obj = str4;
                        }
                        jSONObject.put("reduce", obj);
                        CJPayVoucherInfo.Voucher voucher3 = arrayList2.get(0);
                        if (voucher3 == null || (str3 = voucher3.label) == null) {
                            str3 = str4;
                        }
                        jSONObject.put("label", str3);
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C33838c.f42636f, next.title);
                    Context context = this.mContext;
                    if (context != null) {
                        String str7 = next.pay_type_data.bank_card_id;
                        Intrinsics.checkNotNullExpressionValue(str7, str4);
                        if (((AbstractC136938cZB) context).LIZ(str7)) {
                            str = "0";
                        } else {
                            str = next.status;
                        }
                        jSONObject2.put("status", str);
                        Context context2 = this.mContext;
                        if (context2 != null) {
                            String str8 = next.pay_type_data.bank_card_id;
                            Intrinsics.checkNotNullExpressionValue(str8, str4);
                            if (((AbstractC136938cZB) context2).mo16033LJ(str8)) {
                                Context context3 = this.mContext;
                                if (context3 != null) {
                                    String str9 = next.pay_type_data.bank_card_id;
                                    Intrinsics.checkNotNullExpressionValue(str9, str4);
                                    str4 = ((AbstractC136938cZB) context3).LJFF(str9);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.android.ttcjpaysdk.thirdparty.counter.activity.IFrontCounter");
                                }
                            }
                            jSONObject2.put(MiPushCommandMessage.KEY_REASON, str4);
                            jSONArray2.put(jSONObject2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.android.ttcjpaysdk.thirdparty.counter.activity.IFrontCounter");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.android.ttcjpaysdk.thirdparty.counter.activity.IFrontCounter");
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("error_code", this.LIZIZ);
            jSONObject3.put(PushMessageHelper.ERROR_MESSAGE, this.LIZJ);
            jSONObject3.put("campaign_info", jSONArray);
            jSONObject3.put("all_method_list", jSONArray2);
            C136777cWa.LIZIZ.LIZ("wallet_cashier_method_page_imp", jSONObject3);
        }
    }

    public final void LIZ(FrontPaymentMethodInfo frontPaymentMethodInfo, String str) {
        ArrayList<CJPayVoucherInfo.Voucher> arrayList;
        String str2;
        String str3;
        Integer num;
        String str4;
        if (PatchProxy.proxy(new Object[]{frontPaymentMethodInfo, str}, this, LIZ, false, 13).isSupported) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        CJPayVoucherInfo cJPayVoucherInfo = frontPaymentMethodInfo.voucher_info;
        if (cJPayVoucherInfo != null && (arrayList = cJPayVoucherInfo.vouchers) != null && arrayList.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            CJPayVoucherInfo.Voucher voucher = arrayList.get(0);
            if (voucher == null || (str2 = voucher.voucher_no) == null) {
                str2 = "";
            }
            jSONObject.put(C33968a.f42937f, str2);
            CJPayVoucherInfo.Voucher voucher2 = arrayList.get(0);
            if (voucher2 == null || (str3 = voucher2.voucher_type) == null) {
                str3 = "";
            }
            jSONObject.put("type", str3);
            String str5 = frontPaymentMethodInfo.front_bank_code;
            if (str5 == null) {
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
            if (voucher4 == null || (str4 = voucher4.label) == null) {
                str4 = "";
            }
            jSONObject.put("label", str4);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_code", this.LIZIZ);
        jSONObject2.put(PushMessageHelper.ERROR_MESSAGE, this.LIZJ);
        jSONObject2.put("activity_info", jSONArray);
        jSONObject2.put("pre_method", str);
        jSONObject2.put("addcard_info", frontPaymentMethodInfo.title);
        C136777cWa.LIZIZ.LIZ("wallet_cashier_confirm_click", jSONObject2);
    }

    public final void LIZ(String str, FrontPaymentMethodInfo frontPaymentMethodInfo, int i) {
        PreTradeInfo preTradeInfo;
        String str2;
        if (PatchProxy.proxy(new Object[]{str, frontPaymentMethodInfo, Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIILL = frontPaymentMethodInfo;
        this.LJIILLIIL = i;
        LIZIZ(true);
        C136417cQm c136417cQm = this.LJIIL;
        String str3 = "";
        if (c136417cQm == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
        }
        String str4 = frontPaymentMethodInfo.bank_card_id;
        Intrinsics.checkNotNullExpressionValue(str4, str3);
        CJPayVoucherInfo cJPayVoucherInfo = frontPaymentMethodInfo.voucher_info;
        Intrinsics.checkNotNullExpressionValue(cJPayVoucherInfo, str3);
        JSONArray voucherNoList = cJPayVoucherInfo.getVoucherNoList();
        Intrinsics.checkNotNullExpressionValue(voucherNoList, str3);
        FrontPreTradeInfo frontPreTradeInfo = this.LJIILJJIL;
        if (frontPreTradeInfo != null && (preTradeInfo = frontPreTradeInfo.pre_trade_info) != null && (str2 = preTradeInfo.ext_param) != null) {
            str3 = str2;
        }
        if (!PatchProxy.proxy(new Object[]{str, str4, voucherNoList, str3}, c136417cQm, C136417cQm.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(str, str4, voucherNoList, str3);
            c136417cQm.LIZ(str, str4, voucherNoList, str3, "");
        }
    }
}
