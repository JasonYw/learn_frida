package com.android.ttcjpaysdk.thirdparty.counter.p166c;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.a$a;
import com.android.ttcjpaysdk.thirdparty.counter.a$c;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2322a;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2326f;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.counter.p167d.C2318a;
import com.android.ttcjpaysdk.thirdparty.counter.p168e.C2327d;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeQueryResponseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC136761cWK;
import p003X.AbstractC136945cZI;
import p003X.AbstractC136946cZJ;
import p003X.AbstractC136947cZK;
import p003X.AbstractC136948cZL;
import p003X.AbstractC136951cZO;
import p003X.C135453cBE;
import p003X.C135454cBF;
import p003X.C136235cNq;
import p003X.C136414cQj;
import p003X.C136415cQk;
import p003X.C136762cWL;
import p003X.C136845cXg;
import p003X.C136870cY5;
import p003X.C136889cYO;
import p003X.C136890cYP;
import p003X.C136891cYQ;
import p003X.C64859BiX;
import p003X.RunnableC129192aXq;
import p003X.RunnableC129193aXr;
import p003X.RunnableC129194aXs;
import p003X.RunnableC136857cXs;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.c.d */
/* loaded from: classes17.dex */
public final class C2312d extends CJPayBaseFragment implements a$a, a$c {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public static CJPayCounterTradeQueryResponseBean f25514LJ;
    public AbstractC136946cZJ LIZIZ;
    public AbstractC136947cZK LIZJ;
    public AbstractC136948cZL LIZLLL;
    public JSONObject LJFF;
    public AbstractC136761cWK LJIIJ;
    public C2327d LJIIJJI;
    public AbstractC136951cZO LJIIL;
    public AbstractC136945cZI LJIILIIL;
    public boolean LJIILJJIL;
    public volatile boolean LJIILL;
    public HashMap<String, String> LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public String LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI = true;
    public C135454cBF LJIL;
    public C135453cBE LJJ;
    public boolean LJJI;

    static {
        Covode.recordClassIndex(8156);
    }

    private void LJIILLIIL() {
        this.LJIJJLI = true;
    }

    private void LJIIZILJ() {
        this.LJIJJLI = false;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690598;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "支付收银台";
    }

    public final void LJII() {
        this.LJIJJ = true;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final boolean getIsQueryConnecting() {
        return this.LJIILL;
    }

    @Override // com.android.ttcjpaysdk.thirdparty.counter.a$a
    public final void LIZ(C2326f c2326f) {
        if (PatchProxy.proxy(new Object[]{c2326f}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJIIJ.mo21718LJ();
        if (c2326f == null) {
            return;
        }
        if ("CD000000".equals(c2326f.code)) {
            if (c2326f.onekeypay_open_status) {
                CJPayBasicUtils.displayToast(getActivity(), getActivity().getString(2131561635), PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR);
                this.LJIIJ.LIZLLL();
                new Handler().postDelayed(new RunnableC129193aXr(this), 500L);
                LIZ(1, c2326f.code, c2326f.msg);
                return;
            }
            CJPayBasicUtils.displayToast(getActivity(), c2326f.onekeypay_open_msg, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR);
            new Handler().postDelayed(new RunnableC129194aXs(this), 500L);
            LIZ(0, c2326f.code, c2326f.onekeypay_open_msg);
            return;
        }
        LJIIIZ();
        LIZ(0, c2326f.code, "");
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        AbstractC136761cWK c136889cYO;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 4).isSupported) {
            return;
        }
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = f25514LJ;
        this.LJIIZILJ = cJPayCounterTradeQueryResponseBean == null ? 0 : cJPayCounterTradeQueryResponseBean.result_page_show_conf.show_style;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJIJ = arguments.getInt("cash_desk_show_style");
            this.LJIJI = arguments.getString("trade_no");
            this.LJJI = arguments.getBoolean("is_from_outer_pay", false);
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 33);
        if (proxy.isSupported) {
            c136889cYO = (AbstractC136761cWK) proxy.result;
        } else if (LJIILIIL()) {
            c136889cYO = new C136845cXg(view, 2131690722);
        } else {
            int i = this.LJIIZILJ;
            if (i == 1) {
                c136889cYO = new C136891cYQ(view, 2131690723);
            } else {
                int i2 = this.LJIJ;
                if (i2 == 5 || i2 == 6) {
                    c136889cYO = new C136889cYO(view, 2131690724, this.LJIIZILJ);
                } else {
                    c136889cYO = new C136890cYP(view, 2131690724, i);
                }
            }
        }
        this.LJIIJ = c136889cYO;
        this.LJIIJ.LIZIZ = this.LJJI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 6).isSupported) {
            return;
        }
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = f25514LJ;
        if (PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 13).isSupported) {
            return;
        }
        try {
            String str = "";
            if (!PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 11).isSupported && getActivity() != null) {
                if (f25514LJ != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("trade_info", f25514LJ.trade_info.toJsonString());
                    hashMap.put("pay_info", !TextUtils.isEmpty(LJIIJ()) ? LJIIJ() : str);
                    hashMap.put("sign", C136414cQj.LIZ);
                    hashMap.put("sign_type", "MD5");
                    C2118a.LIZ().LIZ(hashMap);
                }
                if (f25514LJ != null && f25514LJ.trade_info != null && !TextUtils.isEmpty(f25514LJ.trade_info.trade_status)) {
                    String str2 = f25514LJ.trade_info.trade_status;
                    switch (str2.hashCode()) {
                        case -1149187101:
                            if (str2.equals("SUCCESS")) {
                                C2118a.LIZ().LIZ(0);
                                break;
                            }
                            C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                            break;
                        case -595928767:
                            if (str2.equals("TIMEOUT")) {
                                C2118a.LIZ().LIZ(103);
                                break;
                            }
                            C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                            break;
                        case 2150174:
                            if (str2.equals("FAIL")) {
                                C2118a.LIZ().LIZ(102);
                                break;
                            }
                            C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                            break;
                        case 907287315:
                            if (str2.equals("PROCESSING")) {
                                C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                                break;
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
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
                    this.LJIIJ.LIZ(5, false, false, f25514LJ);
                    if (LJIILIIL()) {
                        C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                        if (getActivity() != null) {
                            getActivity().onBackPressed();
                        }
                    }
                }
                LIZ(cJPayCounterTradeQueryResponseBean, "网络异常", "0");
            } else if (!"CD000000".equals(cJPayCounterTradeQueryResponseBean.code)) {
                String str3 = cJPayCounterTradeQueryResponseBean.code;
                if (PatchProxy.proxy(new Object[]{str3}, this, LIZ, false, 15).isSupported) {
                    return;
                }
                if ("GW400008".equals(str3)) {
                    C2118a.LIZ().LIZ(108).LIZIZ();
                    if (getActivity() == null) {
                        return;
                    }
                    CJPayActivityManager.INSTANCE.finishAll(getActivity());
                } else if ("CD005002".equals(str3)) {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported || getActivity() == null) {
                        return;
                    }
                    this.LJIIJ.LIZ(4, false, false, f25514LJ);
                } else {
                    LIZ(f25514LJ, "支付处理中", "0");
                    this.LJIIJ.LIZ(2, false, true, f25514LJ);
                    if (!LJIILIIL()) {
                        return;
                    }
                    C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
                    if (getActivity() == null) {
                        return;
                    }
                    getActivity().onBackPressed();
                }
            } else {
                if (cJPayCounterTradeQueryResponseBean.trade_info != null && !TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.trade_info.trade_status)) {
                    String str4 = cJPayCounterTradeQueryResponseBean.trade_info.trade_status;
                    switch (str4.hashCode()) {
                        case -1149187101:
                            if (str4.equals("SUCCESS")) {
                                if (!PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 18).isSupported) {
                                    if (LJIILIIL()) {
                                        C2118a.LIZ().LIZ(0);
                                        if (getActivity() != null) {
                                            getActivity().onBackPressed();
                                        }
                                    } else {
                                        if (LIZ(cJPayCounterTradeQueryResponseBean)) {
                                            LJIIL();
                                        } else if (this.LJIIJ == null || !this.LJIIJ.LIZ(LJIJI())) {
                                            if (LJIJJ()) {
                                                if (this.LIZLLL != null) {
                                                    this.LIZLLL.LIZ(cJPayCounterTradeQueryResponseBean);
                                                }
                                                LIZ(800L);
                                            } else {
                                                LIZ();
                                            }
                                        } else if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
                                            if (this.LIZJ != null) {
                                                this.LIZJ.LIZ(f25514LJ);
                                            }
                                            LIZ(800L);
                                        }
                                        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported && f25514LJ != null && !LIZ(f25514LJ) && !this.LJIIJ.LIZ(LJIJI()) && !LJIJJ() && !f25514LJ.onekeypay_guide_info.need_guide) {
                                            int i = f25514LJ.result_page_show_conf.remain_time;
                                            if (i > 0) {
                                                if (getActivity() != null) {
                                                    this.LJIIJ.mRootView.postDelayed(new RunnableC129192aXq(getActivity()), i * 1000);
                                                }
                                            } else if (i == 0 && getActivity() != null) {
                                                getActivity().onBackPressed();
                                            }
                                        }
                                    }
                                }
                                LIZ(cJPayCounterTradeQueryResponseBean, "支付成功", "1");
                                break;
                            }
                            LJIIJJI();
                            break;
                        case -595928767:
                            if (str4.equals("TIMEOUT")) {
                                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
                                    this.LJIIJ.LIZ(3, true, true, f25514LJ);
                                    if (LJIILIIL()) {
                                        C2118a.LIZ().LIZ(103);
                                        if (getActivity() != null) {
                                            getActivity().onBackPressed();
                                        }
                                    }
                                }
                                LIZ(cJPayCounterTradeQueryResponseBean, "支付超时", "0");
                                break;
                            }
                            LJIIJJI();
                            break;
                        case 2150174:
                            if (str4.equals("FAIL")) {
                                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
                                    this.LJIIJ.LIZ(4, false, false, f25514LJ);
                                    if (LJIILIIL()) {
                                        C2118a.LIZ().LIZ(102);
                                        if (getActivity() != null) {
                                            getActivity().onBackPressed();
                                        }
                                    }
                                }
                                LIZ(cJPayCounterTradeQueryResponseBean, "支付失败", "0");
                                break;
                            }
                            LJIIJJI();
                            break;
                        case 907287315:
                            if (str4.equals("PROCESSING")) {
                                LJIIJJI();
                                break;
                            }
                            LJIIJJI();
                            break;
                        default:
                            LJIIJJI();
                            break;
                    }
                } else {
                    LJIIJJI();
                }
                if (getActivity() != null) {
                    FragmentActivity activity = getActivity();
                    if (!TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.nopwd_open_msg)) {
                        str = cJPayCounterTradeQueryResponseBean.nopwd_open_msg;
                    }
                    CJPayBasicUtils.displayToast(activity, str);
                }
                if (TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.nopwd_open_msg)) {
                    return;
                }
                JSONObject LJIILJJIL = LJIILJJIL();
                try {
                    LJIILJJIL.put("pswd_guide_type", CJPayCheckoutCounterActivity.LJIIIZ.nopwd_guide_info.getPswdGuideType());
                    LJIILJJIL.put("pswd_quota", CJPayCheckoutCounterActivity.LJIIIZ.nopwd_guide_info.getPswdQuota());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C136415cQk.LIZ(LJIILJJIL, "支付验证页", cJPayCounterTradeQueryResponseBean.nopwd_open_status ? 1 : 0, cJPayCounterTradeQueryResponseBean.code, cJPayCounterTradeQueryResponseBean.msg, C136415cQk.LIZ(cJPayCounterTradeQueryResponseBean), cJPayCounterTradeQueryResponseBean.result_guide_info.pic_url);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void LIZ(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 28).isSupported) {
            return;
        }
        this.LJIILLIIL = new HashMap<>(map);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.counter.a$c
    public final void LIZ(C2322a c2322a) {
        if (PatchProxy.proxy(new Object[]{c2322a}, this, LIZ, false, 37).isSupported) {
            return;
        }
        LJIILLIIL();
        if (c2322a == null) {
            return;
        }
        if ("SUCCESS".equals(c2322a.ret_status)) {
            if (!"PP000000".equals(c2322a.code)) {
                return;
            }
            LJII();
            this.LJIIJ.LIZ(c2322a);
            JSONObject LJIILJJIL = LJIILJJIL();
            String LIZ2 = C136415cQk.LIZ(f25514LJ);
            if (PatchProxy.proxy(new Object[]{LJIILJJIL, c2322a, LIZ2}, null, C136415cQk.LIZ, true, 1).isSupported || c2322a.pay_success_page_info == null) {
                return;
            }
            try {
                LJIILJJIL.put("coupon_id", c2322a.pay_success_page_info.coupon_id);
                LJIILJJIL.put("coupon_type", "voucher".equals(c2322a.pay_success_page_info.coupon_type) ? 1 : 0);
                LJIILJJIL.put("coupon_label", c2322a.pay_success_page_info.desc);
                if (!TextUtils.isEmpty(LIZ2)) {
                    LJIILJJIL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, LIZ2);
                }
            } catch (Exception unused) {
            }
            C2118a.LIZ().LIZ("wallet_cashier_pay_finish_coupon_imp", LJIILJJIL);
            return;
        }
        LJII();
    }

    public static boolean LJIILIIL() {
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = f25514LJ;
        if (cJPayCounterTradeQueryResponseBean != null && cJPayCounterTradeQueryResponseBean.result_page_show_conf.remain_time == 0) {
            return true;
        }
        return false;
    }

    private JSONObject LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 32);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = this.LJFF;
        if (jSONObject != null) {
            return jSONObject;
        }
        return new JSONObject();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZIZ(false, true);
    }

    public C2124b LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 39);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2318a();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onResume();
    }

    private void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        CJPayBasicUtils.displayToast(getActivity(), getActivity().getResources().getString(2131561782));
    }

    private void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        LIZ(f25514LJ, "支付处理中", "0");
        this.LJIIJ.LIZ(2, false, true, f25514LJ);
        if (LJIILIIL()) {
            C2118a.LIZ().LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        }
    }

    private void LJIILL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
            return;
        }
        C136235cNq.LIZ().LIZ("buy_again_timer", 10000L, 500L, new C136870cY5(this));
        LJIILLIIL();
        LIZLLL();
    }

    private C135454cBF LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 40);
        if (proxy.isSupported) {
            return (C135454cBF) proxy.result;
        }
        if (this.LJIL == null) {
            this.LJIL = new C135454cBF();
            this.LJIL.attachView(LJIIIIZZ(), this);
        }
        return this.LJIL;
    }

    private boolean LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 44);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = f25514LJ;
        if (cJPayCounterTradeQueryResponseBean == null) {
            return false;
        }
        if (!cJPayCounterTradeQueryResponseBean.nopwd_guide_info.need_guide && !"nopwd_guide".equals(f25514LJ.result_guide_info.guide_type)) {
            return false;
        }
        return true;
    }

    private boolean LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 45);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = f25514LJ;
        if (cJPayCounterTradeQueryResponseBean == null || !"reset_pwd".equals(cJPayCounterTradeQueryResponseBean.result_guide_info.guide_type)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        C135454cBF c135454cBF = this.LJIL;
        if (c135454cBF != null) {
            c135454cBF.detachView();
            this.LJIL = null;
        }
        C135453cBE c135453cBE = this.LJJ;
        if (c135453cBE != null) {
            c135453cBE.detachView();
            this.LJJ = null;
        }
        C2327d c2327d = this.LJIIJJI;
        if (c2327d != null) {
            c2327d.detachView();
            this.LJIIJJI = null;
        }
        C136235cNq.LIZ().LIZ("buy_again_timer");
        super.onDestroyView();
    }

    private String LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = f25514LJ;
        if (cJPayCounterTradeQueryResponseBean != null && cJPayCounterTradeQueryResponseBean.pay_info != null && f25514LJ.pay_info.size() != 0) {
            for (int i = 0; i < f25514LJ.pay_info.size(); i++) {
                if ("paytype".equals(f25514LJ.pay_info.get(i).type_mark)) {
                    return f25514LJ.pay_info.get(i).toJsonString();
                }
            }
        }
        return null;
    }

    private void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT < 23) {
                jSONObject.put("is_show", 0);
                jSONObject.put("type", "系统版本低");
            } else if (this.LIZIZ != null) {
                this.LIZIZ.LIZ(f25514LJ);
                jSONObject.put("is_show", 1);
                jSONObject.put("type", "可显示引导");
            } else {
                jSONObject.put("is_show", 0);
                jSONObject.put("type", "mFingerprintAction回调为空");
            }
            C2118a.LIZ().LIZ("wallet_rd_fingerprint_guide_status", jSONObject);
        } catch (Exception unused) {
            C2118a.LIZ().LIZ("wallet_rd_fingerprint_guide_exception", jSONObject);
        }
        LIZ(800L);
    }

    public final void LIZLLL() {
        ICJPayIntegratedCounterService iCJPayIntegratedCounterService;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 35).isSupported || this.LJIJJ || !this.LJIJJLI || f25514LJ == null || (iCJPayIntegratedCounterService = (ICJPayIntegratedCounterService) CJPayServiceManager.getInstance().getIService(ICJPayIntegratedCounterService.class)) == null) {
            return;
        }
        String integratedCounterMerchantId = iCJPayIntegratedCounterService.getIntegratedCounterMerchantId();
        String promotionSource = iCJPayIntegratedCounterService.getPromotionSource();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("uid", f25514LJ.user_info.uid);
        hashMap.put(C64859BiX.LIZIZ, CJPayHostInfo.aid);
        hashMap.put("put_no", "PN21212109");
        hashMap.put("did", CJPayHostInfo.did);
        hashMap.put("device_system", "android");
        hashMap.put("merchant_id", integratedCounterMerchantId);
        hashMap.put("out_order_no", this.LJIJI);
        if (!promotionSource.isEmpty()) {
            hashMap.put("scene", promotionSource);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", CJPayHostInfo.did);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        hashMap.put("exts", jSONObject.toString());
        LJIIZILJ();
        LJIJ().LIZ(hashMap);
    }

    public final void LIZ() {
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported || (cJPayCounterTradeQueryResponseBean = f25514LJ) == null) {
            return;
        }
        this.LJIIJ.LIZ(1, false, false, cJPayCounterTradeQueryResponseBean);
        if (f25514LJ.onekeypay_guide_info.need_guide) {
            this.LJIIJ.LIZ(f25514LJ.onekeypay_guide_info);
        } else if (this.LJIIJ.LIZIZ() && !this.LJIIJ.LJFF() && !TextUtils.isEmpty(this.LJIJI) && !this.LJJI) {
            LJIILL();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void setIsQueryConnecting(boolean z) {
        this.LJIILL = z;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 26).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        LIZIZ(false, true);
    }

    private void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{800L}, this, LIZ, false, 21).isSupported) {
            return;
        }
        this.LJIIJ.mRootView.postDelayed(new RunnableC136857cXs(this), 800L);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJIIJ.LIZ();
        this.LJIIJ.LIZ = new C136762cWL(this);
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 31).isSupported) {
            return;
        }
        JSONObject LJIILJJIL = LJIILJJIL();
        try {
            LJIILJJIL.put("icon_name", str);
            String LIZ2 = C136415cQk.LIZ(f25514LJ);
            if (!TextUtils.isEmpty(LIZ2)) {
                LJIILJJIL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, LIZ2);
            }
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_cashier_pay_finish_page_icon_click", LJIILJJIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
        if (r9 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0060, code lost:
        if (android.text.TextUtils.isEmpty(r9.result_guide_info.bio_type) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean LIZ(com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean r9) {
        /*
            r8 = this;
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r4 = 0
            r2[r4] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.thirdparty.counter.p166c.C2312d.LIZ
            r0 = 17
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1b:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r8.LJIILLIIL
            if (r0 == 0) goto L47
            java.lang.String r1 = "pwd"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L47
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r8.LJIILLIIL
            java.lang.Object r7 = r0.get(r1)
            java.lang.String r7 = (java.lang.String) r7
        L2f:
            com.android.ttcjpaysdk.base.service.CJPayServiceManager r1 = com.android.ttcjpaysdk.base.service.CJPayServiceManager.getInstance()
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayFingerprintService> r0 = com.android.ttcjpaysdk.base.service.ICJPayFingerprintService.class
            com.android.ttcjpaysdk.base.service.ICJPayService r6 = r1.getIService(r0)
            com.android.ttcjpaysdk.base.service.ICJPayFingerprintService r6 = (com.android.ttcjpaysdk.base.service.ICJPayFingerprintService) r6
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r1 = "type"
            java.lang.String r3 = "is_show"
            if (r9 == 0) goto L62
            goto L4a
        L47:
            java.lang.String r7 = ""
            goto L2f
        L4a:
            X.cXF r0 = r9.bio_open_guide     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L62
            X.cXF r0 = r9.bio_open_guide     // Catch: java.lang.Exception -> L96
            boolean r0 = r0.show_guide     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L62
            com.android.ttcjpaysdk.base.ui.data.CJPayResultGuideInfo r0 = r9.result_guide_info     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L62
            com.android.ttcjpaysdk.base.ui.data.CJPayResultGuideInfo r0 = r9.result_guide_info     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = r0.bio_type     // Catch: java.lang.Exception -> L96
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L6a
        L62:
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = "没有引导数据/引导为关"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L96
        L6a:
            if (r6 == 0) goto L76
            android.content.Context r0 = r8.getContext()     // Catch: java.lang.Exception -> L96
            boolean r0 = r6.isSupportFingerprint(r0)     // Catch: java.lang.Exception -> L96
            if (r0 != 0) goto L7e
        L76:
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = "手机不支持指纹"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L96
        L7e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L8c
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = "密码为空"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L96
        L8c:
            com.android.ttcjpaysdk.base.a r1 = com.android.ttcjpaysdk.base.C2118a.LIZ()     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = "wallet_rd_fingerprint_guide_status"
            r1.LIZ(r0, r2)     // Catch: java.lang.Exception -> L96
            goto La4
        L96:
            com.android.ttcjpaysdk.base.a r2 = com.android.ttcjpaysdk.base.C2118a.LIZ()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "wallet_rd_fingerprint_guide_exception"
            r2.LIZ(r0, r1)
        La4:
            if (r9 == 0) goto Ld9
            X.cXF r0 = r9.bio_open_guide
            if (r0 == 0) goto Ld9
            X.cXF r0 = r9.bio_open_guide
            boolean r0 = r0.show_guide
            if (r0 == 0) goto Ld9
            r3 = 1
        Lb1:
            com.android.ttcjpaysdk.base.ui.data.CJPayResultGuideInfo r0 = r9.result_guide_info
            if (r0 == 0) goto Ldd
            com.android.ttcjpaysdk.base.ui.data.CJPayResultGuideInfo r0 = r9.result_guide_info
            java.lang.String r1 = r0.guide_type
            java.lang.String r0 = "bio_guide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ldd
            r2 = 1
        Lc2:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto Ldf
            if (r6 == 0) goto Ldf
            android.content.Context r0 = r8.getContext()
            boolean r0 = r6.isSupportFingerprint(r0)
            if (r0 == 0) goto Ldf
            if (r2 != 0) goto Ld8
            if (r3 == 0) goto Ldf
        Ld8:
            return r5
        Ld9:
            r3 = 0
            if (r9 == 0) goto Ldd
            goto Lb1
        Ldd:
            r2 = 0
            goto Lc2
        Ldf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.counter.p166c.C2312d.LIZ(com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean):boolean");
    }

    @Override // com.android.ttcjpaysdk.thirdparty.counter.a$a
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIJ.mo21718LJ();
        LJIIIZ();
    }

    @Override // com.android.ttcjpaysdk.thirdparty.counter.a$c
    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 38).isSupported) {
            return;
        }
        LJIILLIIL();
    }

    private void LIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 43).isSupported) {
            return;
        }
        JSONObject LJIILJJIL = LJIILJJIL();
        try {
            LJIILJJIL.put("source", "支付完成后");
            LJIILJJIL.put("result", i);
            LJIILJJIL.put("error_code", str);
            LJIILJJIL.put(PushMessageHelper.ERROR_MESSAGE, str2);
            String LIZ2 = C136415cQk.LIZ(f25514LJ);
            if (!TextUtils.isEmpty(LIZ2)) {
                LJIILJJIL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, LIZ2);
            }
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_fastpay_setting_result", LJIILJJIL);
    }

    private void LIZ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean, String str, String str2) {
        String str3;
        String str4;
        int i;
        String str5;
        int i2;
        String str6;
        String str7 = "";
        if (PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean, str, str2}, this, LIZ, false, 29).isSupported) {
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
                    if ("discount_voucher".equals(next.voucher_type)) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    jSONObject.put("type", i2);
                    jSONObject.put("reduce", next.used_amount);
                    jSONObject.put("label", next.label);
                    if (TextUtils.isEmpty(next.credit_pay_installment)) {
                        str6 = next.front_bank_code;
                    } else {
                        str6 = next.credit_pay_installment;
                    }
                    jSONObject.put("front_bank_code", str6);
                    jSONArray.put(jSONObject);
                }
                LJIILJJIL.put("activity_info", jSONArray);
                if (cJPayCounterTradeQueryResponseBean.trade_info.is_pay_new_card) {
                    i = 1;
                } else {
                    i = 0;
                }
                LJIILJJIL.put("is_newcard", i);
                LJIILJJIL.put("bank_name", cJPayCounterTradeQueryResponseBean.trade_info.bank_name);
                if ("DEBIT".equals(cJPayCounterTradeQueryResponseBean.trade_info.card_type)) {
                    str5 = "储蓄卡";
                } else {
                    str5 = "信用卡";
                }
                LJIILJJIL.put("bank_type", str5);
                Iterator<CJPayTradeInfo.C2338a> it2 = cJPayCounterTradeQueryResponseBean.trade_info.combine_pay_fund_list.iterator();
                while (it2.hasNext()) {
                    CJPayTradeInfo.C2338a next2 = it2.next();
                    if ("balance".equals(next2.fund_type)) {
                        LJIILJJIL.put("balance_amount", next2.fund_amount);
                    } else if ("bankcard".equals(next2.fund_type)) {
                        LJIILJJIL.put("card_amount", next2.fund_amount);
                    } else if ("income".equals(next2.fund_type)) {
                        LJIILJJIL.put("income_amount", next2.fund_amount);
                    }
                }
            }
            if (this.LJIIL != null) {
                str4 = this.LJIIL.LIZ();
            } else {
                str4 = str7;
            }
            LJIILJJIL.put("risk_type", str4);
            str3 = C136415cQk.LIZ(cJPayCounterTradeQueryResponseBean);
            try {
                if (!TextUtils.isEmpty(str3)) {
                    LJIILJJIL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str3);
                }
                if (cJPayCounterTradeQueryResponseBean != null && !TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.user_check_way)) {
                    LJIILJJIL.put("check_type", cJPayCounterTradeQueryResponseBean.user_check_way);
                }
                if (this.LJIILJJIL) {
                    LJIILJJIL.put("tea_source", "second_pay");
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str3 = str7;
        }
        C2118a.LIZ().LIZ("wallet_cashier_result", LJIILJJIL);
        if (!LJIILIIL()) {
            if (!TextUtils.isEmpty(cJPayCounterTradeQueryResponseBean.onekeypay_guide_info.more.promotion_info.description) && cJPayCounterTradeQueryResponseBean.onekeypay_guide_info.guide_bar.size() == 2) {
                str7 = cJPayCounterTradeQueryResponseBean.onekeypay_guide_info.guide_bar.get(1).msg;
            }
            LIZ(str, str3, cJPayCounterTradeQueryResponseBean.onekeypay_guide_info.need_guide, str7);
        }
    }

    private void LIZ(String str, String str2, boolean z, String str3) {
        int i;
        int i2;
        if (PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3}, this, LIZ, false, 30).isSupported) {
            return;
        }
        JSONObject LJIILJJIL = LJIILJJIL();
        try {
            LJIILJJIL.put("result", str);
            if (f25514LJ != null && this.LJIIJ.LIZ(LJIJI())) {
                i = 1;
            } else {
                i = 0;
            }
            LJIILJJIL.put("is_pswd_guide", i);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            LJIILJJIL.put("is_fast_guide", i2);
            LJIILJJIL.put("activity_label", str3);
            if (!TextUtils.isEmpty(str2)) {
                LJIILJJIL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str2);
            }
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_cashier_pay_finish_page_imp", LJIILJJIL);
    }
}
