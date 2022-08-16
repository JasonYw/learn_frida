package com.android.ttcjpaysdk.bindcard.base.p142ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.IUnionPayBindCardService;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.a$a;
import com.android.ttcjpaysdk.bindcard.base.adpter.BankCardListAdapter;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayOneKeyCopyWritingInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayTwoAuthVerifyBean;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.base.p140a.C2198a;
import com.android.ttcjpaysdk.bindcard.base.p141b.C2209a;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC136006cK9;
import p003X.AbstractC136179cMw;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C122918YZk;
import p003X.C135388cAB;
import p003X.C135694cF7;
import p003X.C135734cFl;
import p003X.C135737cFo;
import p003X.C135754cG5;
import p003X.C135876cI3;
import p003X.C135880cI7;
import p003X.C135984cJn;
import p003X.C135996cJz;
import p003X.C136000cK3;
import p003X.C136001cK4;
import p003X.C136012cKF;
import p003X.C136013cKG;
import p003X.C136036cKd;
import p003X.C136064cL5;
import p003X.C136074cLF;
import p003X.C136092cLX;
import p003X.C136097cLc;
import p003X.C136117cLw;
import p003X.C136118cLx;
import p003X.C136136cMF;
import p003X.C136156cMZ;
import p003X.C136171cMo;
import p003X.DialogC135318c93;
import p003X.DialogC137460chc;
import p003X.View$OnClickListenerC135981cJk;
import p003X.View$OnClickListenerC136133cMC;
import p003X.View$OnClickListenerC136168cMl;
import p003X.ViewTreeObserver$OnGlobalLayoutListenerC136128cM7;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.ui.BankCardListFragment */
/* loaded from: classes17.dex */
public final class BankCardListFragment extends AbstractC136006cK9<C2209a, C2198a> implements a$a {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25472LJ;
    public static int LJJIJIIJI = 6;
    public ArrayList<QuickBindCardAdapterBean> LJFF;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public BankCardListAdapter LJIILLIIL;
    public CJPayOneKeyCopyWritingInfo LJIJJ;
    public DialogC137460chc LJIJJLI;
    public ArrayList<String> LJIL;
    public DialogC135318c93 LJJ;
    public TextView LJJI;
    public LinearLayout LJJIFFI;
    public RelativeLayout LJJII;
    public TextView LJJIII;
    public LinearLayout LJJIIJ;
    public ImageView LJJIIJZLJL;
    public ImageView LJJIIZ;
    public ImageView LJJIIZI;
    public LinearLayout LJJIJ;
    public ArrayList<QuickBindCardAdapterBean> LJJIJIIJIL;
    public AbstractC136179cMw LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public int LJJIZ;
    public int LJJJI;
    public ImageView LJJJJ;
    public TextView LJJJJIZL;
    public CJPayHostInfo LJJJJJ;
    public ValueAnimator LJJJJJL;
    public ValueAnimator LJJJJL;
    public int LJJJJLI;
    public String LJIILL = "";
    public int LJIIZILJ = 4;
    public String LJIJ = "";
    public String LJIJI = "";
    public String LJJJIL = "";
    public String LJJJJI = "";
    public CardListAnimationStatus LJJJ = CardListAnimationStatus.Init;

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690708;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "绑卡";
    }

    public final void LIZ(QuickBindCardAdapterBean quickBindCardAdapterBean) {
        if (PatchProxy.proxy(new Object[]{quickBindCardAdapterBean}, this, f25472LJ, false, 8).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz_order_type", "verify_identity_info");
        hashMap.put("source", TextUtils.isEmpty(C135734cFl.LIZ()) ? "payment_manage" : C135734cFl.LIZ());
        if (!LJIIIZ() && CJPayQuickBindCardUtils.LIZ()) {
            hashMap.put("scene", "MY_BANKCARD");
        }
        if (!TextUtils.isEmpty(LIZJ(quickBindCardAdapterBean.bankName))) {
            hashMap.put("exts", LIZJ(quickBindCardAdapterBean.bankName));
        }
        hashMap.put("ab_version", C136036cKd.LIZIZ.LIZIZ());
        C2209a c2209a = (C2209a) this.LIZLLL;
        if (PatchProxy.proxy(new Object[]{hashMap, quickBindCardAdapterBean}, c2209a, C2209a.LIZ, false, 1).isSupported) {
            return;
        }
        ((C2208b) c2209a.mModel).LIZIZ(hashMap, new C136117cLw(c2209a, quickBindCardAdapterBean));
    }

    static {
        Covode.recordClassIndex(7068);
    }

    @Override // p003X.AbstractC136022cKP
    public final Class<? extends BaseEvent>[] LIZLLL() {
        return new Class[]{C135754cG5.class, C135694cF7.class};
    }

    public final boolean LJIIJ() {
        if (this.LJJJ == CardListAnimationStatus.Collapsed) {
            return true;
        }
        return false;
    }

    /* renamed from: com.android.ttcjpaysdk.bindcard.base.ui.BankCardListFragment$CardListAnimationStatus */
    /* loaded from: classes17.dex */
    public enum CardListAnimationStatus {
        Init(0, "初始的展开状态"),
        Collapseing(1, "正在收起"),
        Collapsed(2, "收起完成"),
        Expanding(3, "正在展开");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String desc;
        public int status;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CardListAnimationStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (CardListAnimationStatus[]) proxy.result;
            }
            return (CardListAnimationStatus[]) values().clone();
        }

        static {
            Covode.recordClassIndex(7087);
        }

        public static CardListAnimationStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (CardListAnimationStatus) proxy.result;
            }
            return (CardListAnimationStatus) Enum.valueOf(CardListAnimationStatus.class, str);
        }

        CardListAnimationStatus(int i, String str) {
            this.status = i;
            this.desc = str;
        }
    }

    @Override // p003X.AbstractC136022cKP
    public final C2124b LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f25472LJ, false, 1);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2208b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, f25472LJ, false, 26).isSupported) {
            return;
        }
        super.onDestroy();
        CJPayPerformance.LIZ().LIZLLL("wallet_rd_fast_bindcard_enter");
    }

    private boolean LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f25472LJ, false, 29);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJIIZILJ == 5 || this.LJFF.size() <= LJJIJIIJI) {
            return false;
        }
        return true;
    }

    private int LJIILJJIL() {
        ArrayList<QuickBindCardAdapterBean> arrayList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f25472LJ, false, 30);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIILIIL()) {
            arrayList = this.LJJIJIIJIL;
        } else {
            arrayList = this.LJFF;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).isUnionPay()) {
                return i;
            }
        }
        return -1;
    }

    public final boolean LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f25472LJ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C135734cFl.m21754LJ() != ICJPayNormalBindCardService.SourceType.MyBindCardTwo.getMType()) {
            return false;
        }
        return true;
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, f25472LJ, false, 5).isSupported) {
            return;
        }
        LJIIL();
        AbstractC136179cMw abstractC136179cMw = this.LJJIJIL;
        if (abstractC136179cMw != null) {
            abstractC136179cMw.LJIILLIIL();
        }
        this.LJJIII.setText(2131561865);
        this.LJJIIJZLJL.setVisibility(8);
        this.LJJIIZ.setVisibility(0);
        for (int i = LJJIJIIJI; i < this.LJFF.size(); i++) {
            this.LJJIJIIJIL.add(this.LJFF.get(i));
        }
        this.LJIILLIIL.notifyDataSetChanged();
        this.LJJIIJ.setOnClickListener(new C136156cMZ(this));
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, f25472LJ, false, 3).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJFF = (ArrayList) arguments.getSerializable("quick_bind_card_data_list");
            this.LJIIJ = arguments.getBoolean("has_real_name");
            this.LJIIJJI = arguments.getBoolean("is_need_card_info");
            this.LJIIL = arguments.getBoolean("is_has_pwd");
            arguments.getBoolean("one_key_bind_card_show_buttom_desc");
            this.LJIIZILJ = arguments.getInt("one_key_bind_card_from_type");
            LJJIJIIJI = arguments.getInt("one_key_bind_card_show_num", 6);
            this.LJIJ = arguments.getString("one_key_bind_card_mobile_mask");
            this.LJIJI = arguments.getString("one_key_bind_card_smchid");
            this.LJJJIL = arguments.getString("one_key_bind_card_title");
            this.LJJJJI = arguments.getString("one_key_bind_card_subtitle");
            this.LJIILIIL = arguments.getBoolean("one_key_bind_card_need_auth_guide");
            this.LJIJJ = (CJPayOneKeyCopyWritingInfo) arguments.getSerializable("card_bin_title");
            this.LJIILJJIL = LIZ("param_is_independent_bind_card", Boolean.FALSE).booleanValue();
            this.LJIILL = arguments.getString("param_bind_card_info");
            this.LJIL = arguments.getStringArrayList("param_card_bin_vouchers");
            this.LJJIJL = arguments.getString("card_bin_display_desc");
            this.LJJIJLIJ = arguments.getString("card_bin_display_icon_url");
            this.LJJIL = arguments.getString("param_card_add_sign_order_no");
        }
        this.LJJJJJ = C135876cI3.f17973LJ.LJIIIIZZ();
        C2198a c2198a = ((AbstractC136006cK9) this).LIZIZ;
        ArrayList<QuickBindCardAdapterBean> arrayList = this.LJFF;
        if (!PatchProxy.proxy(new Object[]{arrayList}, c2198a, C2198a.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(arrayList);
            c2198a.LIZIZ = C135876cI3.f17973LJ.LJIIIIZZ();
            c2198a.LIZJ = arrayList;
            CJPayHostInfo cJPayHostInfo = c2198a.LIZIZ;
            if (cJPayHostInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            String str = cJPayHostInfo.merchantId;
            if (str == null) {
                str = "";
            }
            c2198a.LIZLLL = str;
            CJPayHostInfo cJPayHostInfo2 = c2198a.LIZIZ;
            if (cJPayHostInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            String str2 = cJPayHostInfo2.appId;
            if (str2 == null) {
                str2 = "";
            }
            c2198a.f25467LJ = str2;
        }
    }

    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, f25472LJ, false, 20).isSupported) {
            return;
        }
        int i = C136097cLc.LIZ[this.LJJJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LJJJJJL.setCurrentPlayTime(200 - this.LJJJJL.getCurrentPlayTime());
                this.LJJJJL.cancel();
                this.LJJJJJL.start();
                return;
            }
            return;
        }
        this.LJJJJLI = this.LJJII.getHeight();
        if (this.LJJJJLI == 0) {
            return;
        }
        this.LJJJI = ((RelativeLayout.LayoutParams) this.LJJIJ.getLayoutParams()).topMargin;
        this.LJJJJJL = ValueAnimator.ofInt(this.LJJJJLI, CJPayBasicUtils.sp2px(getContext(), 40.0f));
        this.LJJJJJL.setDuration(200L);
        this.LJJJJJL.addUpdateListener(new C136012cKF(this));
        this.LJJJJJL.addListener(new C136136cMF(this));
        this.LJJJJJL.start();
    }

    public final void LJIIL() {
        if (!PatchProxy.proxy(new Object[0], this, f25472LJ, false, 21).isSupported && this.LJJJ != CardListAnimationStatus.Expanding && this.LJJJ != CardListAnimationStatus.Init) {
            if (this.LJJJJL == null) {
                this.LJJJJL = ValueAnimator.ofInt(CJPayBasicUtils.sp2px(getContext(), 40.0f), this.LJJJJLI);
                this.LJJJJL.setDuration(200L);
                this.LJJJJL.addUpdateListener(new C136013cKG(this));
                this.LJJJJL.addListener(new C136074cLF(this));
            }
            int i = C136097cLc.LIZ[this.LJJJ.ordinal()];
            if (i != 3) {
                if (i == 4) {
                    this.LJJJJL.start();
                    return;
                }
                return;
            }
            this.LJJJJL.setCurrentPlayTime(200 - this.LJJJJJL.getCurrentPlayTime());
            this.LJJJJJL.cancel();
            this.LJJJJL.start();
        }
    }

    private String LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, f25472LJ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.LJIILL)) {
                jSONObject.put("bind_card_info", new JSONObject(this.LJIILL));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("bank_name", str);
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public final void LIZIZ(QuickBindCardAdapterBean quickBindCardAdapterBean) {
        String LIZ;
        if (PatchProxy.proxy(new Object[]{quickBindCardAdapterBean}, this, f25472LJ, false, 9).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz_order_type", "card_sign");
        if (TextUtils.isEmpty(C135734cFl.LIZ())) {
            LIZ = "payment_manage";
        } else {
            LIZ = C135734cFl.LIZ();
        }
        hashMap.put("source", LIZ);
        if (!TextUtils.isEmpty(LIZJ(quickBindCardAdapterBean.bankName))) {
            hashMap.put("exts", LIZJ(quickBindCardAdapterBean.bankName));
        }
        hashMap.put("ab_version", C136036cKd.LIZIZ.LIZIZ());
        if (this.LIZLLL != 0) {
            C2209a c2209a = (C2209a) this.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{hashMap, quickBindCardAdapterBean}, c2209a, C2209a.LIZ, false, 2).isSupported) {
                ((C2208b) c2209a.mModel).LIZIZ(hashMap, new C136118cLx(c2209a, quickBindCardAdapterBean));
            }
        }
    }

    @Override // p003X.AbstractC136022cKP
    public final void onEvent(BaseEvent baseEvent) {
        ArrayList<QuickBindCardAdapterBean> arrayList;
        int LJIILJJIL;
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, f25472LJ, false, 27).isSupported) {
            return;
        }
        if (baseEvent instanceof C135754cG5) {
            C135754cG5 c135754cG5 = (C135754cG5) baseEvent;
            if (!PatchProxy.proxy(new Object[]{c135754cG5}, this, f25472LJ, false, 28).isSupported && c135754cG5.source == 1005 && (LJIILJJIL = LJIILJJIL()) != -1) {
                this.LJIILLIIL.LIZ(LJIILJJIL);
                ((IUnionPayBindCardService) CJPayServiceManager.getInstance().getIService(IUnionPayBindCardService.class)).handleUnionPayFaceCheck(getActivity(), CJPayJsonParser.toJsonObject(c135754cG5), new C136171cMo(this));
            }
        }
        if ((baseEvent instanceof C135694cF7) && !((C135694cF7) baseEvent).LIZ && !PatchProxy.proxy(new Object[0], this, f25472LJ, false, 31).isSupported) {
            if (LJIILIIL()) {
                arrayList = this.LJJIJIIJIL;
            } else {
                arrayList = this.LJFF;
            }
            int LJIILJJIL2 = LJIILJJIL();
            if (LJIILJJIL2 != -1) {
                int size = this.LJFF.size() - 1;
                if (size == 0) {
                    this.LJIIIZ.setVisibility(8);
                    return;
                }
                if (LJIILIIL()) {
                    int i = LJJIJIIJI;
                    if (size == i) {
                        arrayList.remove(LJIILJJIL2);
                        arrayList.add(this.LJFF.get(size));
                        this.LJJIII.setText(2131561865);
                        this.LJJIIJZLJL.setVisibility(8);
                    } else if (size > i) {
                        arrayList.remove(LJIILJJIL2);
                        if (this.LJJIIJZLJL.getVisibility() == 0) {
                            TextView textView = this.LJJIII;
                            textView.setText(requireContext().getString(2131561866) + size + requireContext().getString(2131561867));
                        }
                    }
                } else {
                    arrayList.remove(LJIILJJIL2);
                }
                this.LJIILLIIL.notifyDataSetChanged();
            }
        }
    }

    public final void LIZIZ(String str) {
        ICJPayH5Service iCJPayH5Service;
        if (!PatchProxy.proxy(new Object[]{str}, this, f25472LJ, false, 23).isSupported && (iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class)) != null) {
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(getActivity());
            new StringBuilder();
            h5ParamBuilder.setUrl(C0002O.m25086C(str, "&service=122&source=sdk"));
            h5ParamBuilder.setStatusBarColor("#ffffff");
            h5ParamBuilder.setHostInfo(CJPayHostInfo.LIZIZ(this.LJJJJJ));
            iCJPayH5Service.startH5(h5ParamBuilder);
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.base.a$a
    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, f25472LJ, false, 17).isSupported) {
            return;
        }
        this.LJIILLIIL.LIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.base.a$a
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, f25472LJ, false, 15).isSupported) {
            return;
        }
        this.LJIILLIIL.LIZ();
        CJPayBasicUtils.displayToast(getActivity(), getActivity().getResources().getString(2131558456));
    }

    @Override // com.android.ttcjpaysdk.bindcard.base.a$a
    public final void LIZJ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, f25472LJ, false, 19).isSupported) {
            return;
        }
        this.LJIILLIIL.LIZ();
        CJPayBasicUtils.displayToast(getActivity(), getActivity().getResources().getString(2131558456));
    }

    public final void LIZ(CJPayCardAddBean cJPayCardAddBean, QuickBindCardAdapterBean quickBindCardAdapterBean) {
        if (PatchProxy.proxy(new Object[]{cJPayCardAddBean, quickBindCardAdapterBean}, this, f25472LJ, false, 22).isSupported) {
            return;
        }
        VerifyPwdFragment verifyPwdFragment = (VerifyPwdFragment) C135996cJz.LIZ().LIZ("/basebind/VerifyPwdFragment").LIZ("isQuickBind", true).LIZ("title", cJPayCardAddBean.verify_pwd_copywriting_info.title).LIZ("subTitle", cJPayCardAddBean.verify_pwd_copywriting_info.sub_title).LIZ("voucher_info_str", C136000cK3.LIZIZ.LIZ(quickBindCardAdapterBean.voucher_info_map, quickBindCardAdapterBean.cardType).toString()).LIZ("smchId", cJPayCardAddBean.url_params.smch_id).LIZ("orderNo", cJPayCardAddBean.url_params.sign_order_no).LIZ(getActivity());
        verifyPwdFragment.setVerifyPwdListener(new C136064cL5(this, quickBindCardAdapterBean, verifyPwdFragment));
        FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        beginTransaction.add(verifyPwdFragment, "verifyPwdFragment");
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // com.android.ttcjpaysdk.bindcard.base.a$a
    public final void LIZIZ(CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean, QuickBindCardAdapterBean quickBindCardAdapterBean) {
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{cJPayNameAndIdentifyCodeBillBean, quickBindCardAdapterBean}, this, f25472LJ, false, 18).isSupported && cJPayNameAndIdentifyCodeBillBean != null && getActivity() != null && this.LIZLLL != 0) {
            quickBindCardAdapterBean.mobileMask = this.LJIJ;
            quickBindCardAdapterBean.smchId = this.LJIJI;
            quickBindCardAdapterBean.isNeedShowAuth = LJIIIZ();
            quickBindCardAdapterBean.needAuthGuide = this.LJIILIIL;
            quickBindCardAdapterBean.card_copywriting_info = this.LJIJJ;
            if (cJPayNameAndIdentifyCodeBillBean.isResponseOK()) {
                C135876cI3.LIZ(cJPayNameAndIdentifyCodeBillBean.toCardAddBean());
                if (cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.is_authed && cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.is_conflict) {
                    LIZIZ(cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.conflict_action_url);
                    this.LJIILLIIL.LIZ();
                    return;
                } else if (this.LJIIJ) {
                    this.LJIILLIIL.LIZ();
                    if (getActivity() != null && LJIIIZ() && this.LJIIL && !TextUtils.equals(cJPayNameAndIdentifyCodeBillBean.sign_card_map.skip_pwd, "1")) {
                        CJPayCardAddBean cJPayCardAddBean = new CJPayCardAddBean();
                        cJPayCardAddBean.verify_pwd_copywriting_info.title = C135388cAB.LIZ.LIZJ(getActivity().getString(2131562023));
                        cJPayCardAddBean.verify_pwd_copywriting_info.sub_title = getActivity().getString(2131561524);
                        cJPayCardAddBean.verify_pwd_copywriting_info.display_desc = "";
                        LIZ(cJPayCardAddBean, quickBindCardAdapterBean);
                    } else if (getActivity() != null) {
                        C135880cI7.LIZ((Activity) getActivity(), false, this.LJIILJJIL, cJPayNameAndIdentifyCodeBillBean, quickBindCardAdapterBean, this.LJIILL);
                    }
                    if (LJIIIZ()) {
                        C2198a c2198a = ((AbstractC136006cK9) this).LIZIZ;
                        if (this.LJIIJ && this.LJIIL && !TextUtils.equals(cJPayNameAndIdentifyCodeBillBean.sign_card_map.skip_pwd, "1")) {
                            i = 1;
                        }
                        c2198a.LIZ(i);
                        return;
                    }
                    return;
                } else {
                    LIZ(quickBindCardAdapterBean);
                    return;
                }
            }
            this.LJIILLIIL.LIZ();
            CJPayBasicUtils.displayToast(CJPayHostInfo.applicationContext, cJPayNameAndIdentifyCodeBillBean.msg);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, f25472LJ, false, 4).isSupported) {
            return;
        }
        this.LJJII = (RelativeLayout) view.findViewById(2131187005);
        this.LJJII.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.base.ui.BankCardListFragment.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7069);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (!PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported && BankCardListFragment.this.LJJIJIL != null) {
                    BankCardListFragment.this.LJJIJIL.LJIILLIIL();
                }
            }
        });
        this.LJJIII = (TextView) view.findViewById(2131187007);
        this.LJJIIJZLJL = (ImageView) view.findViewById(2131187006);
        this.LJJIIZ = (ImageView) view.findViewById(2131186993);
        this.LJJIJ = (LinearLayout) view.findViewById(2131170009);
        this.LJJIJ.setOnClickListener(new View$OnClickListenerC136168cMl(this));
        this.LJJIIZI = (ImageView) view.findViewById(2131170008);
        this.LJJIIJ = (LinearLayout) view.findViewById(2131170004);
        this.LJJIFFI = (LinearLayout) view.findViewById(2131170006);
        this.LJJII.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC136128cM7(this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131187009);
        this.LJJI = (TextView) view.findViewById(2131170007);
        if (!TextUtils.isEmpty(this.LJJJIL)) {
            this.LJJI.setText(this.LJJJIL);
        }
        this.LJJJJIZL = (TextView) view.findViewById(2131170005);
        if (!TextUtils.isEmpty(this.LJJJJI)) {
            this.LJJJJIZL.setText(this.LJJJJI);
            LinearLayout linearLayout = this.LJJIJ;
            if (linearLayout != null) {
                ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = CJPayBasicUtils.dipToPX(getContext(), 13.0f);
            }
        } else {
            LinearLayout linearLayout2 = this.LJJIFFI;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        this.LJJJJ = (ImageView) view.findViewById(2131169913);
        ArrayList<String> arrayList = this.LJIL;
        if (arrayList != null && arrayList.size() != 0 && !TextUtils.isEmpty(this.LJIL.get(0))) {
            this.LJJJJ.setVisibility(0);
            this.LJJJJ.setOnClickListener(new View$OnClickListenerC135981cJk(this));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(1);
        if (LJIILIIL()) {
            this.LJJIJIIJIL = new ArrayList<>();
            for (int i = 0; i < LJJIJIIJI && i < this.LJFF.size(); i++) {
                this.LJJIJIIJIL.add(this.LJFF.get(i));
            }
            this.LJIILLIIL = new BankCardListAdapter(getActivity(), this.LJJIJIIJIL);
            TextView textView = this.LJJIII;
            textView.setText(requireContext().getString(2131561866) + this.LJFF.size() + requireContext().getString(2131561867));
            if (!PatchProxy.proxy(new Object[0], this, f25472LJ, false, 6).isSupported) {
                getContext();
            }
            this.LJJIIJZLJL.setVisibility(0);
            this.LJJIIJ.setOnClickListener(new C136001cK4(this));
            ((AbstractC136006cK9) this).LIZIZ.LIZ(this.LJJIJIIJIL);
        } else {
            this.LJIILLIIL = new BankCardListAdapter(getActivity(), this.LJFF);
        }
        this.LJIILLIIL.LIZIZ = new C135984cJn(this);
        recyclerView.setAdapter(this.LJIILLIIL);
        recyclerView.setItemAnimator(new C122918YZk());
    }

    @Override // com.android.ttcjpaysdk.bindcard.base.a$a
    public final void LIZ(CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean, QuickBindCardAdapterBean quickBindCardAdapterBean) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{cJPayNameAndIdentifyCodeBillBean, quickBindCardAdapterBean}, this, f25472LJ, false, 14).isSupported) {
            return;
        }
        if (!CJPayQuickBindCardUtils.LIZ()) {
            this.LJIILLIIL.LIZ();
        }
        if (cJPayNameAndIdentifyCodeBillBean != null && getActivity() != null && this.LIZLLL != 0) {
            quickBindCardAdapterBean.mobileMask = this.LJIJ;
            quickBindCardAdapterBean.smchId = this.LJIJI;
            quickBindCardAdapterBean.isNeedShowAuth = LJIIIZ();
            quickBindCardAdapterBean.needAuthGuide = this.LJIILIIL;
            quickBindCardAdapterBean.card_copywriting_info = this.LJIJJ;
            if (cJPayNameAndIdentifyCodeBillBean.isResponseOK()) {
                if (cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.is_authed && cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.is_conflict) {
                    LIZIZ(cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.conflict_action_url);
                    return;
                } else if (CJPayQuickBindCardUtils.LIZ()) {
                    if (cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.is_authed) {
                        C2209a c2209a = (C2209a) this.LIZLLL;
                        if (!PatchProxy.proxy(new Object[]{cJPayNameAndIdentifyCodeBillBean, quickBindCardAdapterBean}, c2209a, C2209a.LIZ, false, 3).isSupported) {
                            ((C2208b) c2209a.mModel).LIZ(cJPayNameAndIdentifyCodeBillBean.member_biz_order_no, cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.busi_auth_info.id_name_mask, cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.busi_auth_info.id_type, cJPayNameAndIdentifyCodeBillBean.busi_authorize_info.busi_auth_info.id_code_mask, new C136092cLX(c2209a, quickBindCardAdapterBean, cJPayNameAndIdentifyCodeBillBean));
                            return;
                        }
                        return;
                    }
                    this.LJIILLIIL.LIZ();
                    CJPayBasicUtils.displayToast(this.mContext, LIZ(this.mContext, 2131561782));
                    return;
                } else {
                    if (this.LJIIJ) {
                        if (getActivity() != null && LJIIIZ() && this.LJIIL && !TextUtils.equals(cJPayNameAndIdentifyCodeBillBean.sign_card_map.skip_pwd, "1")) {
                            CJPayCardAddBean cJPayCardAddBean = new CJPayCardAddBean();
                            cJPayCardAddBean.verify_pwd_copywriting_info.title = C135388cAB.LIZ.LIZJ(getActivity().getString(2131562023));
                            cJPayCardAddBean.verify_pwd_copywriting_info.sub_title = getActivity().getString(2131561524);
                            cJPayCardAddBean.verify_pwd_copywriting_info.display_desc = "";
                            LIZ(cJPayCardAddBean, quickBindCardAdapterBean);
                        } else if (getActivity() != null) {
                            C135880cI7.LIZ((Activity) getActivity(), false, this.LJIILJJIL, (CJPayNameAndIdentifyCodeBillBean) null, quickBindCardAdapterBean, this.LJIILL);
                        }
                    } else if (this.LJIILIIL) {
                        CJPayQuickBindCardUtils.LIZLLL = CJPayJsonParser.toJsonObject(cJPayNameAndIdentifyCodeBillBean);
                        C135996cJz.LIZ().LIZ("/normalbind/CJPayRealNameGuideActivity").LIZ("param_is_independent_bind_card", this.LJIILJJIL).LIZ("param_bank_bean", quickBindCardAdapterBean).LIZ("param_bind_card_info", this.LJIILL).LIZ(AnimationType.SlideLeftAndRigth).LIZ(getActivity());
                    } else {
                        C135880cI7.LIZ((Activity) getActivity(), true, this.LJIILJJIL, cJPayNameAndIdentifyCodeBillBean, quickBindCardAdapterBean, this.LJIILL);
                    }
                    if (LJIIIZ()) {
                        C2198a c2198a = ((AbstractC136006cK9) this).LIZIZ;
                        if (this.LJIIJ && this.LJIIL && !TextUtils.equals(cJPayNameAndIdentifyCodeBillBean.sign_card_map.skip_pwd, "1")) {
                            i = 1;
                        }
                        c2198a.LIZ(i);
                        return;
                    }
                    return;
                }
            }
            this.LJIILLIIL.LIZ();
            CJPayBasicUtils.displayToast(CJPayHostInfo.applicationContext, cJPayNameAndIdentifyCodeBillBean.msg);
        }
    }

    @Override // p003X.AbstractC136006cK9, p003X.AbstractC136022cKP, com.android.ttcjpaysdk.base.framework.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, f25472LJ, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    @Override // com.android.ttcjpaysdk.bindcard.base.a$a
    public final void LIZ(CJPayTwoAuthVerifyBean cJPayTwoAuthVerifyBean, QuickBindCardAdapterBean quickBindCardAdapterBean, CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean) {
        String str;
        if (PatchProxy.proxy(new Object[]{cJPayTwoAuthVerifyBean, quickBindCardAdapterBean, cJPayNameAndIdentifyCodeBillBean}, this, f25472LJ, false, 16).isSupported) {
            return;
        }
        this.LJIILLIIL.LIZ();
        if (cJPayTwoAuthVerifyBean != null && getActivity() != null && this.LIZLLL != 0) {
            if (cJPayTwoAuthVerifyBean.isResponseOK()) {
                C135880cI7.LIZ((Activity) getActivity(), false, this.LJIILJJIL, cJPayNameAndIdentifyCodeBillBean, quickBindCardAdapterBean, this.LJIILL);
            } else if ("MP010033".equals(cJPayTwoAuthVerifyBean.code) && "1".equals(cJPayTwoAuthVerifyBean.button_info.button_status)) {
                C135737cFo.LIZ().LIZ(cJPayTwoAuthVerifyBean.button_info).LIZ(cJPayTwoAuthVerifyBean.code, cJPayTwoAuthVerifyBean.msg).LIZ(this.LJJJJJ).LIZ(getActivity()).LIZ().LIZIZ();
                C2198a c2198a = ((AbstractC136006cK9) this).LIZIZ;
                if (!PatchProxy.proxy(new Object[0], c2198a, C2198a.LIZ, false, 8).isSupported) {
                    try {
                        JSONObject LIZ = CJPayParamsUtils.LIZ(c2198a.LIZLLL, c2198a.f25467LJ);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("needidentify", 1);
                        jSONObject.put("haspass", 0);
                        jSONObject.put("is_onestep", 1);
                        jSONObject.put("show_onestep", 0);
                        if (!TextUtils.isEmpty(C135734cFl.LIZ())) {
                            jSONObject.put("source", C135734cFl.LIZ());
                        }
                        C135734cFl.LIZ("wallet_businesstopay_auth_fail_imp", LIZ, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            } else if (!TextUtils.isEmpty(cJPayTwoAuthVerifyBean.button_info.page_desc)) {
                C135737cFo.LIZ().LIZ(cJPayTwoAuthVerifyBean.button_info).LIZ(cJPayTwoAuthVerifyBean.code, cJPayTwoAuthVerifyBean.msg).LIZ(this.LJJJJJ).LIZ(getActivity()).LIZ().LIZIZ();
            } else {
                String string = getActivity().getResources().getString(2131561934);
                if (!PatchProxy.proxy(new Object[]{string}, this, f25472LJ, false, 25).isSupported && !PatchProxy.proxy(new Object[]{string, ""}, this, f25472LJ, false, 24).isSupported && string != null && getActivity() != null) {
                    CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(getActivity());
                    defaultBuilder.setTitle(string);
                    if (!TextUtils.isEmpty("")) {
                        str = "";
                    } else {
                        str = getActivity().getResources().getString(2131561707);
                    }
                    defaultBuilder.setSingleBtnStr(str);
                    defaultBuilder.setSingleBtnListener(new View$OnClickListenerC136133cMC(this));
                    this.LJIJJLI = defaultBuilder.build();
                    C116971W2r.LIZJ(this.LJIJJLI);
                }
            }
            C2198a c2198a2 = ((AbstractC136006cK9) this).LIZIZ;
            ?? isResponseOK = cJPayTwoAuthVerifyBean.isResponseOK();
            String str2 = cJPayTwoAuthVerifyBean.code;
            String str3 = cJPayTwoAuthVerifyBean.msg;
            if (!PatchProxy.proxy(new Object[]{quickBindCardAdapterBean, Integer.valueOf(isResponseOK == true ? 1 : 0), str2, str3}, c2198a2, C2198a.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ(quickBindCardAdapterBean, str2, str3);
                try {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("result", Integer.valueOf((int) isResponseOK));
                    hashMap.put("error_code", str2);
                    hashMap.put("error_msg", str3);
                    hashMap.put("is_onestep", 1);
                    hashMap.put("needidentify", 1);
                    hashMap.put("haspass", 0);
                    hashMap.put("show_onestep", "bytepay.member_product.verify_identity_info");
                    hashMap.put(PushConstants.WEB_URL, 1);
                    C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
                    HashMap<String, CJPayVoucherInfo> hashMap2 = quickBindCardAdapterBean.voucher_info_map;
                    Intrinsics.checkNotNullExpressionValue(hashMap2, "");
                    String str4 = quickBindCardAdapterBean.cardType;
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    hashMap.put("activity_info", c136000cK3.LIZ(hashMap2, str4));
                    c2198a2.LIZ("wallet_businesstopay_auth_result", hashMap);
                } catch (Exception unused2) {
                }
            }
        }
    }
}
