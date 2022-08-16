package com.android.ttcjpaysdk.thirdparty.front.counter.fragment;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeQueryResponseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC136944cZH;
import p003X.AbstractC136946cZJ;
import p003X.AbstractC136947cZK;
import p003X.AbstractC136948cZL;
import p003X.AbstractC136950cZN;
import p003X.AbstractC136951cZO;
import p003X.C116971W2r;
import p003X.C135268c8F;
import p003X.C135388cAB;
import p003X.C136218cNZ;
import p003X.C136414cQj;
import p003X.C136415cQk;
import p003X.C136823cXK;
import p003X.C136940cZD;
import p003X.DialogC136760cWJ;
import p003X.RunnableC136835cXW;
import p003X.TFG;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.counter.fragment.a */
/* loaded from: classes17.dex */
public final class C2374a extends CJPayBaseFragment {
    public static ChangeQuickRedirect LIZ;
    public static CJPayCounterTradeQueryResponseBean LJIIL;
    public AbstractC136946cZJ LIZIZ;
    public AbstractC136947cZK LIZJ;
    public AbstractC136950cZN LIZLLL;

    /* renamed from: LJ */
    public AbstractC136947cZK f25531LJ;
    public AbstractC136951cZO LJFF;
    public AbstractC136944cZH LJIIJ;
    public AbstractC136948cZL LJIIJJI;
    public JSONObject LJIILIIL;
    public boolean LJIILJJIL;
    public String LJIILL;
    public boolean LJIILLIIL;
    public volatile boolean LJIIZILJ;
    public HashMap<String, String> LJIJ;
    public FrameLayout LJIJI;
    public TextView LJIJJ;
    public DialogC136760cWJ LJIJJLI;
    public long LJIL;
    public boolean LJJ = true;

    static {
        Covode.recordClassIndex(8658);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690599;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "支付收银台";
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final boolean getIsQueryConnecting() {
        return this.LJIIZILJ;
    }

    private void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        if (LJIIIZ()) {
            LJIILIIL();
        } else {
            LIZ();
        }
    }

    private void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 35).isSupported) {
            return;
        }
        LIZ("wallet_cashier_paying_pop_imp", LJIILJJIL());
    }

    private JSONObject LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 39);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = this.LJIILIIL;
        if (jSONObject != null) {
            return jSONObject;
        }
        return new JSONObject();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        LIZIZ(false, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroyView();
    }

    private void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        this.LJIJI.getRootView().postDelayed(new RunnableC136835cXW(this), 800L);
    }

    private String LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", this.LJIILL);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private String LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = LJIIL;
        if (cJPayCounterTradeQueryResponseBean != null && cJPayCounterTradeQueryResponseBean.pay_info != null && LJIIL.pay_info.size() != 0) {
            for (int i = 0; i < LJIIL.pay_info.size(); i++) {
                if ("paytype".equals(LJIIL.pay_info.get(i).type_mark)) {
                    return LJIIL.pay_info.get(i).toJsonString();
                }
            }
        }
        return null;
    }

    private boolean LJIIJ() {
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        HashMap<String, String> hashMap = this.LJIJ;
        if (hashMap != null && hashMap.containsKey("open_pre_bio_guide")) {
            z = "true".equals(this.LJIJ.get("open_pre_bio_guide"));
        } else {
            z = false;
        }
        ICJPayFingerprintService iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
        if (Build.VERSION.SDK_INT < 23 || CJPayCheckoutCounterActivity.LJIIIZ == null || CJPayCheckoutCounterActivity.LJIIIZ.pre_bio_guide_info == null || TextUtils.isEmpty(CJPayCheckoutCounterActivity.LJIIIZ.pre_bio_guide_info.title) || iCJPayFingerprintService == null || !iCJPayFingerprintService.isSupportFingerprint(getContext()) || !z) {
            return false;
        }
        return true;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onResume();
        if (this.LJJ) {
            this.LJJ = false;
            long currentTimeMillis = System.currentTimeMillis() - this.LJIL;
            if (!PatchProxy.proxy(new Object[]{new Long(currentTimeMillis)}, this, LIZ, false, 38).isSupported) {
                JSONObject LIZ2 = CJPayParamsUtils.LIZ("", "");
                try {
                    LIZ2.put("time", currentTimeMillis);
                    LIZ2.put("page", "电商结果页");
                } catch (Exception unused) {
                }
                C2118a.LIZ().LIZ("wallet_rd_pay_result_render_time", LIZ2);
            }
        }
    }

    private boolean LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = LJIIL;
        if (cJPayCounterTradeQueryResponseBean == null || cJPayCounterTradeQueryResponseBean.processing_guide_popup == null || TextUtils.isEmpty(LJIIL.processing_guide_popup.title) || TextUtils.isEmpty(LJIIL.processing_guide_popup.desc) || TextUtils.isEmpty(LJIIL.processing_guide_popup.btn_text) || getActivity() == null || getActivity().isFinishing()) {
            return false;
        }
        this.LJIJJLI = new DialogC136760cWJ(getActivity()).LIZ(LJIIL.processing_guide_popup.title).LIZIZ(LJIIL.processing_guide_popup.desc).LIZJ(LJIIL.processing_guide_popup.btn_text).LIZ(new C136823cXK(this));
        C116971W2r.LIZJ(this.LJIJJLI);
        return true;
    }

    public final void LIZLLL() {
        DialogC136760cWJ dialogC136760cWJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && getActivity() != null && !getActivity().isFinishing() && (dialogC136760cWJ = this.LJIJJLI) != null && dialogC136760cWJ.isShowing()) {
            C116971W2r.LIZ(this.LJIJJLI);
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        LIZ(LJIIL, "支付处理中", "0");
        C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void setIsQueryConnecting(boolean z) {
        this.LJIIZILJ = z;
    }

    public final void LIZ(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 32).isSupported) {
            return;
        }
        this.LJIJ = new HashMap<>(map);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 31).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJIL = System.currentTimeMillis();
        this.LJJ = true;
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onHiddenChanged(z);
    }

    private boolean LIZJ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (cJPayCounterTradeQueryResponseBean != null && ((cJPayCounterTradeQueryResponseBean.nopwd_guide_info.need_guide && !"upgrade".equals(cJPayCounterTradeQueryResponseBean.nopwd_guide_info.guide_type)) || "nopwd_guide".equals(cJPayCounterTradeQueryResponseBean.result_guide_info.guide_type))) {
            return true;
        }
        return false;
    }

    private void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 34).isSupported) {
            return;
        }
        JSONObject LJIILJJIL = LJIILJJIL();
        try {
            LJIILJJIL.put("result", str);
            String LIZ2 = C136415cQk.LIZ(LJIIL);
            if (!TextUtils.isEmpty(LIZ2)) {
                LJIILJJIL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, LIZ2);
            }
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_cashier_pay_finish_page_imp", LJIILJJIL);
    }

    /* renamed from: LJ */
    private boolean m16032LJ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (cJPayCounterTradeQueryResponseBean != null && ("default_byte_pay_guide".equals(cJPayCounterTradeQueryResponseBean.result_guide_info.guide_type) || "default_credit_pay_guide".equals(cJPayCounterTradeQueryResponseBean.result_guide_info.guide_type))) {
            return true;
        }
        return false;
    }

    private boolean LJFF(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 27);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (cJPayCounterTradeQueryResponseBean != null && !TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.fe_guide_info.url)) {
            return true;
        }
        return false;
    }

    private boolean LJI(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 28);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (cJPayCounterTradeQueryResponseBean != null && "reset_pwd".equals(cJPayCounterTradeQueryResponseBean.result_guide_info.guide_type)) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 37).isSupported) {
            return;
        }
        JSONObject LJIILJJIL = LJIILJJIL();
        try {
            LJIILJJIL.put("button_name", str);
        } catch (Exception unused) {
        }
        LIZ("wallet_cashier_paying_pop_click", LJIILJJIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r8 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean LIZ(com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean r8) {
        /*
            r7 = this;
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r4 = 0
            r2[r4] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2374a.LIZ
            r0 = 18
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1b:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.LJIJ
            if (r0 == 0) goto L2c
            java.lang.String r1 = "pwd"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L2c
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.LJIJ
            r0.get(r1)
        L2c:
            if (r8 == 0) goto L6f
            X.cXF r0 = r8.bio_open_guide
            if (r0 == 0) goto L6f
            X.cXF r0 = r8.bio_open_guide
            boolean r0 = r0.show_guide
            if (r0 == 0) goto L6f
            r6 = 1
        L39:
            com.android.ttcjpaysdk.base.ui.data.CJPayResultGuideInfo r0 = r8.result_guide_info
            if (r0 == 0) goto L73
            com.android.ttcjpaysdk.base.ui.data.CJPayResultGuideInfo r0 = r8.result_guide_info
            java.lang.String r1 = r0.guide_type
            java.lang.String r0 = "bio_guide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L73
            r3 = 1
        L4a:
            com.android.ttcjpaysdk.base.service.CJPayServiceManager r1 = com.android.ttcjpaysdk.base.service.CJPayServiceManager.getInstance()
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayFingerprintService> r0 = com.android.ttcjpaysdk.base.service.ICJPayFingerprintService.class
            com.android.ttcjpaysdk.base.service.ICJPayService r2 = r1.getIService(r0)
            com.android.ttcjpaysdk.base.service.ICJPayFingerprintService r2 = (com.android.ttcjpaysdk.base.service.ICJPayFingerprintService) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L75
            if (r8 == 0) goto L75
            if (r2 == 0) goto L75
            android.content.Context r0 = r7.getContext()
            boolean r0 = r2.isSupportFingerprint(r0)
            if (r0 == 0) goto L75
            if (r3 != 0) goto L6e
            if (r6 == 0) goto L75
        L6e:
            return r5
        L6f:
            r6 = 0
            if (r8 == 0) goto L73
            goto L39
        L73:
            r3 = 0
            goto L4a
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2374a.LIZ(com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean):boolean");
    }

    private void LIZJ(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 22).isSupported && C2118a.LIZ().LJIILJJIL != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter("ext_pay_after_use", LJIIL());
                jSONObject.put("schema", buildUpon.toString());
                C2118a.LIZ().LJIILJJIL.pay(getActivity(), jSONObject.toString(), 98, "", "", "", "from_native", CJPayHostInfo.LIZ(CJPayCheckoutCounterActivity.LJIIJ), new C136940cZD(this));
            } catch (Exception unused) {
            }
        }
    }

    private boolean LIZLLL(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (cJPayCounterTradeQueryResponseBean != null && cJPayCounterTradeQueryResponseBean.nopwd_guide_info.need_guide && "upgrade".equals(cJPayCounterTradeQueryResponseBean.nopwd_guide_info.guide_type)) {
            return true;
        }
        return false;
    }

    private void LIZIZ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
        AbstractC136946cZJ abstractC136946cZJ;
        String str;
        if (PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 20).isSupported) {
            return;
        }
        if (LJIIJ()) {
            if (Build.VERSION.SDK_INT >= 23 && this.LIZLLL != null) {
                HashMap<String, String> hashMap = this.LJIJ;
                if (hashMap != null && hashMap.containsKey("result_height")) {
                    str = this.LJIJ.get("result_height");
                } else {
                    str = "";
                }
                try {
                    this.LIZLLL.LIZ(Integer.parseInt(str));
                } catch (Exception unused) {
                }
            }
            LJIIJJI();
        } else if (LIZ(cJPayCounterTradeQueryResponseBean)) {
            if (Build.VERSION.SDK_INT >= 23 && (abstractC136946cZJ = this.LIZIZ) != null) {
                abstractC136946cZJ.LIZ(cJPayCounterTradeQueryResponseBean);
            }
            LJIIJJI();
        } else if (LIZJ(cJPayCounterTradeQueryResponseBean)) {
            AbstractC136947cZK abstractC136947cZK = this.LIZJ;
            if (abstractC136947cZK != null) {
                abstractC136947cZK.LIZ(cJPayCounterTradeQueryResponseBean);
            }
            LJIIJJI();
        } else if (LIZLLL(cJPayCounterTradeQueryResponseBean)) {
            AbstractC136947cZK abstractC136947cZK2 = this.f25531LJ;
            if (abstractC136947cZK2 != null) {
                abstractC136947cZK2.LIZ(cJPayCounterTradeQueryResponseBean);
            }
            LJIIJJI();
        } else if (m16032LJ(cJPayCounterTradeQueryResponseBean)) {
            AbstractC136944cZH abstractC136944cZH = this.LJIIJ;
            if (abstractC136944cZH != null) {
                abstractC136944cZH.LIZ(cJPayCounterTradeQueryResponseBean);
            }
            LJIIJJI();
        } else if (LJFF(cJPayCounterTradeQueryResponseBean)) {
            LIZJ(cJPayCounterTradeQueryResponseBean.fe_guide_info.url);
            LJIIJJI();
        } else if (LJI(cJPayCounterTradeQueryResponseBean)) {
            AbstractC136948cZL abstractC136948cZL = this.LJIIJJI;
            if (abstractC136948cZL != null) {
                abstractC136948cZL.LIZ(cJPayCounterTradeQueryResponseBean);
            }
            LJIIJJI();
        } else {
            C2118a.LIZ().LIZ(0);
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        int i;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIJI = (FrameLayout) view.findViewById(2131169897);
        new C136218cNZ(this.LJIJI);
        this.LJIJI.setVisibility(0);
        this.LJIJJ = (TextView) view.findViewById(2131169910);
        this.LJIJJ.setText(C135388cAB.LIZ.LIZIZ(getContext().getResources().getString(2131561842)));
        if (CJPayCheckoutCounterActivity.LJIIIZ != null && ((i = CJPayCheckoutCounterActivity.LJIIIZ.result_page_show_conf.show_style) == 5 || i == 4)) {
            C135268c8F.LIZ(this.LJIJJ);
        }
        view.findViewById(2131165337).setVisibility(8);
        if (this.LJIILJJIL) {
            view.findViewById(2131169954).setVisibility(8);
        } else {
            view.findViewById(2131169954).setVisibility(0);
        }
    }

    private void LIZ(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 36).isSupported) {
            return;
        }
        if (C2118a.LIZ().LJIJI != null) {
            C2118a.LIZ().LIZ(str, jSONObject, C2118a.LIZ().LJIJI);
        } else {
            C2118a.LIZ().LIZ(str, jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        int i;
        String str;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 4).isSupported) {
            return;
        }
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = LJIIL;
        if (!PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 11).isSupported) {
            try {
                String str2 = "";
                if (!PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 9).isSupported && getActivity() != null) {
                    if (LJIIL != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("trade_info", LJIIL.trade_info.toJsonString());
                        if (!TextUtils.isEmpty(LJII())) {
                            str = LJII();
                        } else {
                            str = str2;
                        }
                        hashMap.put("pay_info", str);
                        hashMap.put("sign", C136414cQj.LIZ);
                        hashMap.put("sign_type", "MD5");
                        C2118a.LIZ().LIZ(hashMap);
                    }
                    if (LJIIL != null && LJIIL.trade_info != null && !TextUtils.isEmpty(LJIIL.trade_info.trade_status)) {
                        String str3 = LJIIL.trade_info.trade_status;
                        switch (str3.hashCode()) {
                            case -1149187101:
                                if (str3.equals("SUCCESS")) {
                                    C2118a.LIZ().LIZ(0);
                                    break;
                                }
                                C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                                break;
                            case -595928767:
                                if (str3.equals("TIMEOUT")) {
                                    C2118a.LIZ().LIZ(103);
                                    break;
                                }
                                C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                                break;
                            case 2150174:
                                if (str3.equals("FAIL")) {
                                    C2118a.LIZ().LIZ(102);
                                    break;
                                }
                                C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                                break;
                            case 907287315:
                                if (str3.equals("PROCESSING")) {
                                }
                                C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                                break;
                            default:
                                C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                                break;
                        }
                    } else {
                        C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                    }
                }
                if (cJPayCounterTradeQueryResponseBean == null) {
                    LIZ(cJPayCounterTradeQueryResponseBean, "网络异常", "0");
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
                        C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                        if (getActivity() != null) {
                            getActivity().onBackPressed();
                        }
                    }
                } else if (!"CD000000".equals(cJPayCounterTradeQueryResponseBean.code)) {
                    String str4 = cJPayCounterTradeQueryResponseBean.code;
                    if (!PatchProxy.proxy(new Object[]{str4}, this, LIZ, false, 13).isSupported) {
                        if ("GW400008".equals(str4)) {
                            C2118a.LIZ().LIZ(108).LIZIZ();
                            CJPayActivityManager.INSTANCE.finishAll(CJPayHostInfo.applicationContext);
                        } else if ("CD005002".equals(str4)) {
                            C2118a.LIZ().LIZ(113).LIZIZ();
                            CJPayActivityManager.INSTANCE.finishAll(CJPayHostInfo.applicationContext);
                        } else {
                            LIZ(LJIIL, "支付处理中", "0");
                            C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                            if (getActivity() != null) {
                                getActivity().onBackPressed();
                            }
                        }
                    }
                } else {
                    if (cJPayCounterTradeQueryResponseBean.trade_info != null && !TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.trade_info.trade_status)) {
                        String str5 = cJPayCounterTradeQueryResponseBean.trade_info.trade_status;
                        switch (str5.hashCode()) {
                            case -1149187101:
                                if (str5.equals("SUCCESS")) {
                                    LIZ(cJPayCounterTradeQueryResponseBean, "支付成功", "1");
                                    LIZIZ(cJPayCounterTradeQueryResponseBean);
                                    break;
                                }
                                LJIIIIZZ();
                                break;
                            case -595928767:
                                if (str5.equals("TIMEOUT")) {
                                    LIZ(cJPayCounterTradeQueryResponseBean, "支付超时", "0");
                                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
                                        C2118a.LIZ().LIZ(103);
                                        if (getActivity() != null) {
                                            getActivity().onBackPressed();
                                            break;
                                        }
                                    }
                                }
                                LJIIIIZZ();
                                break;
                            case 2150174:
                                if (str5.equals("FAIL")) {
                                    LIZ(cJPayCounterTradeQueryResponseBean, "支付失败", "0");
                                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
                                        C2118a.LIZ().LIZ(102);
                                        if (getActivity() != null) {
                                            getActivity().onBackPressed();
                                            break;
                                        }
                                    }
                                }
                                LJIIIIZZ();
                                break;
                            case 907287315:
                                if (str5.equals("PROCESSING")) {
                                }
                                LJIIIIZZ();
                                break;
                            default:
                                LJIIIIZZ();
                                break;
                        }
                    } else {
                        LJIIIIZZ();
                    }
                    if (getActivity() != null) {
                        FragmentActivity activity = getActivity();
                        if (!TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.nopwd_open_msg)) {
                            str2 = cJPayCounterTradeQueryResponseBean.nopwd_open_msg;
                        }
                        CJPayBasicUtils.displayToast(activity, str2, TFG.LIZIZ);
                    }
                    if (!TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.nopwd_open_msg)) {
                        JSONObject LJIILJJIL = LJIILJJIL();
                        try {
                            LJIILJJIL.put("pswd_guide_type", CJPayCheckoutCounterActivity.LJIIIZ.nopwd_guide_info.getPswdGuideType());
                            LJIILJJIL.put("pswd_quota", CJPayCheckoutCounterActivity.LJIIIZ.nopwd_guide_info.getPswdQuota());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (cJPayCounterTradeQueryResponseBean.nopwd_open_status) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        C136415cQk.LIZ(LJIILJJIL, "支付验证页", i, cJPayCounterTradeQueryResponseBean.code, cJPayCounterTradeQueryResponseBean.msg, C136415cQk.LIZ(cJPayCounterTradeQueryResponseBean), cJPayCounterTradeQueryResponseBean.result_guide_info.pic_url);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void LIZ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean, String str, String str2) {
        int i;
        String str3;
        if (PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean, str, str2}, this, LIZ, false, 33).isSupported) {
            return;
        }
        JSONObject LJIILJJIL = LJIILJJIL();
        try {
            LJIILJJIL.put("result", str2);
            LJIILJJIL.put("status", str);
            if ("1".equals(str2) && cJPayCounterTradeQueryResponseBean != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<CJPayTradeQueryResponseBean.Voucher> it = cJPayCounterTradeQueryResponseBean.voucher_details.iterator();
                while (it.hasNext()) {
                    CJPayTradeQueryResponseBean.Voucher next = it.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C33968a.f42937f, next.voucher_no);
                    if (next.voucher_type.equals("discount_voucher")) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    jSONObject.put("type", i);
                    jSONObject.put("reduce", next.used_amount);
                    jSONObject.put("label", next.label);
                    if (TextUtils.isEmpty(next.credit_pay_installment)) {
                        str3 = next.front_bank_code;
                    } else {
                        str3 = next.credit_pay_installment;
                    }
                    jSONObject.put("front_bank_code", str3);
                    jSONArray.put(jSONObject);
                }
                LJIILJJIL.put("activity_info", jSONArray);
            }
            String str4 = "";
            if (this.LJFF != null) {
                str4 = this.LJFF.LIZ();
            }
            LJIILJJIL.put("risk_type", str4);
            String LIZ2 = C136415cQk.LIZ(cJPayCounterTradeQueryResponseBean);
            if (!TextUtils.isEmpty(LIZ2)) {
                LJIILJJIL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, LIZ2);
            }
            if (cJPayCounterTradeQueryResponseBean != null && !TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.user_check_way)) {
                LJIILJJIL.put("check_type", cJPayCounterTradeQueryResponseBean.user_check_way);
            }
            if (this.LJIILLIIL) {
                LJIILJJIL.put("tea_source", "second_pay");
            }
        } catch (Exception unused) {
        }
        if (C2118a.LIZ().LJIJI != null) {
            C2118a.LIZ().LIZ("wallet_cashier_result", LJIILJJIL, C2118a.LIZ().LJIJI);
        } else {
            C2118a.LIZ().LIZ("wallet_cashier_result", LJIILJJIL);
        }
        LIZLLL(str);
    }
}
