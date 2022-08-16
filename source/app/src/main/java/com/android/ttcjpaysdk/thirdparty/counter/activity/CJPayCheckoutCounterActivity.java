package com.android.ttcjpaysdk.thirdparty.counter.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.BaseFragment;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.framework.event.CJPayCounterShowFragmentEvent;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.network.ICJPayRequest;
import com.android.ttcjpaysdk.base.p135ui.CJPayLoadingView;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.activity.CJPayLimitErrorActivity;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2324d;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2312d;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2314h;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayProcessInfo;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC136371cQ2;
import p003X.AbstractC136384cQF;
import p003X.AbstractC136388cQJ;
import p003X.AbstractC136395cQQ;
import p003X.AbstractC136403cQY;
import p003X.AbstractC136408cQd;
import p003X.AbstractC136413cQi;
import p003X.AbstractC136439cR8;
import p003X.AbstractC136441cRA;
import p003X.AbstractC136525cSW;
import p003X.AbstractC136809cX6;
import p003X.AbstractC136812cX9;
import p003X.AbstractC136946cZJ;
import p003X.AbstractC136951cZO;
import p003X.AbstractC136952cZP;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135539cCc;
import p003X.C135765cGG;
import p003X.C135883cIA;
import p003X.C136058cKz;
import p003X.C136321cPE;
import p003X.C136349cPg;
import p003X.C136353cPk;
import p003X.C136358cPp;
import p003X.C136361cPs;
import p003X.C136368cPz;
import p003X.C136373cQ4;
import p003X.C136374cQ5;
import p003X.C136377cQ8;
import p003X.C136423cQs;
import p003X.C136450cRJ;
import p003X.C136546cSr;
import p003X.C136737cVw;
import p003X.C136738cVx;
import p003X.C136746cW5;
import p003X.C136758cWH;
import p003X.C136777cWa;
import p003X.C136779cWc;
import p003X.C136780cWd;
import p003X.C136813cXA;
import p003X.C136837cXY;
import p003X.C136838cXZ;
import p003X.C136839cXa;
import p003X.C136849cXk;
import p003X.C136860cXv;
import p003X.C136869cY4;
import p003X.C136879cYE;
import p003X.C136880cYF;
import p003X.C136883cYI;
import p003X.C136885cYK;
import p003X.C136967cZe;
import p003X.C137459chb;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.RunnableC136740cVz;
import p003X.RunnableC136807cX4;
import p003X.RunnableC136854cXp;
import p003X.RunnableC136855cXq;
import p003X.RunnableC136922cYv;
import p003X.V33;
import p003X.View$OnClickListenerC136772cWV;
import p003X.View$OnClickListenerC136859cXu;
import p003X.View$OnClickListenerC136910cYj;

/* loaded from: classes17.dex */
public class CJPayCheckoutCounterActivity extends CJPayBaseActivity implements INormalBindCardCallback, AbstractC136371cQ2, AbstractC136952cZP, AbstractC136812cX9, AbstractC136809cX6 {
    public static ChangeQuickRedirect LIZ;
    public static C136373cQ4 LJIIIZ;
    public static CJPayHostInfo LJIIJ;
    public static String LJIJ = "0";
    public static String LJIJI = "1";
    public static String LJIJJ = "2";
    public static String LJIJJLI = "new_bank_card";
    public static String LJIL = "bank_card";
    public static String LJJ = "balance";
    public DialogC137460chc LIZIZ;
    public C2324d LIZJ;
    public C136737cVw LIZLLL;

    /* renamed from: LJ */
    public C136746cW5 f25513LJ;
    public C2312d LJFF;
    public C2314h LJI;
    public int LJII;
    public Fragment LJIIIIZZ;
    public ArrayList<String> LJIIJJI;
    public String LJIIL;
    public volatile boolean LJIILL;
    public C136450cRJ LJIILLIIL;
    public long LJIIZILJ;
    public CJPayProcessInfo LJJII;
    public RelativeLayout LJJIIZ;
    public CJPayLoadingView LJJIIZI;
    public Context LJJIJ;
    public FragmentTransaction LJJIJIIJI;
    public ICJPayRequest LJJIJIIJIL;
    public C136780cWd LJJIJIL;
    public C136779cWc LJJIJL;
    public ArrayList<Pair<String, String>> LJJIJLIJ;
    public C136546cSr LJJIZ;
    public String LJJIL = "";
    public String LJIILIIL = "";
    public String LJIILJJIL = "allPayment";
    public String LJJI = "";
    public String LJJIFFI = "";
    public String LJJIII = "";
    public AbstractC2126a LJJJ = new AbstractC2126a() { // from class: com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(8104);
        }

        @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
        public final Class<BaseEvent>[] listEvents() {
            return new Class[]{C135883cIA.class, C136967cZe.class, CJPayCounterShowFragmentEvent.class, C135765cGG.class};
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
        @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onEvent(com.android.ttcjpaysdk.base.eventbus.BaseEvent r17) {
            /*
                Method dump skipped, instructions count: 442
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity.C23091.onEvent(com.android.ttcjpaysdk.base.eventbus.BaseEvent):void");
        }
    };
    public AbstractC136395cQQ LJJJI = new C136358cPp(this);
    public AbstractC136408cQd LJJJIL = new C136361cPs(this);
    public AbstractC136388cQJ LJJJJ = new C136839cXa(this);
    public AbstractC136403cQY LJJJJI = new C136869cY4(this);
    public AbstractC136384cQF LJJJJIZL = new C136349cPg(this);
    public AbstractC136441cRA LJJJJJ = new C136374cQ5(this);
    public AbstractC136525cSW LJJJJJL = new C136377cQ8(this);
    public AbstractC136439cR8 LJJJJL = new C136860cXv(this);
    public AbstractC136413cQi LJJJJLI = new C136880cYF(this);
    public AbstractC136946cZJ LJJIIJ = new C136758cWH(this);
    public AbstractC136951cZO LJJIIJZLJL = new C136883cYI(this);

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690547;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public boolean isActivityPortrait() {
        return false;
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public void onBindCardResult(JSONObject jSONObject) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 70).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 69).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9, p003X.AbstractC136809cX6
    public final C2324d LIZLLL() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC136812cX9
    /* renamed from: LJ */
    public final String mo16036LJ() {
        return this.LJIIL;
    }

    @Override // p003X.AbstractC136371cQ2
    public final String LJFF() {
        return this.LJJIL;
    }

    @Override // p003X.AbstractC136371cQ2
    public final int LJI() {
        return this.LJII;
    }

    public final void LIZ(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 1).isSupported && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.LJJIJLIJ == null) {
                this.LJJIJLIJ = new ArrayList<>();
            }
            this.LJJIJLIJ.add(new Pair<>(str, str2));
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        if (LIZ()) {
            LJIILL();
            CJPayBasicUtils.displayToastInternal(this, str, 0);
            return;
        }
        C136737cVw c136737cVw = this.LIZLLL;
        if (c136737cVw == null || PatchProxy.proxy(new Object[]{str, (byte) 0}, c136737cVw, C136737cVw.LIZ, false, 37).isSupported || c136737cVw.getActivity() == null) {
            return;
        }
        c136737cVw.LJIIL();
        c136737cVw.LJIILIIL();
        c136737cVw.LIZLLL(false);
        c136737cVw.LJFF.setEnabled(c136737cVw.LJIIJJI());
        if (c136737cVw.LIZJ != null) {
            c136737cVw.LIZJ.setVisibility(0);
        }
        if (c136737cVw.f18079LJ != null) {
            c136737cVw.f18079LJ.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str)) {
            CJPayBasicUtils.displayToastInternal(c136737cVw.getActivity(), str, 0);
        }
        c136737cVw.setIsQueryConnecting(false);
    }

    public final void LIZ(CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo) {
        if (PatchProxy.proxy(new Object[]{cJPayInsufficientBalanceHintInfo}, this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJJIII = cJPayInsufficientBalanceHintInfo.rec_pay_type.pay_type_data.bank_card_id;
        if (!LIZ()) {
            C136885cYK.LIZ(cJPayInsufficientBalanceHintInfo);
            LIZ(this.LJII, 10, false);
            return;
        }
        LIZ(this.LJII, cJPayInsufficientBalanceHintInfo);
    }

    public final void LIZ(Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{fragment}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C136737cVw c136737cVw = this.LIZLLL;
        if (c136737cVw != null) {
            c136737cVw.LIZJ(true);
        }
        if (fragment != null) {
            ((BaseFragment) fragment).LIZIZ(true, false);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC136855cXq(this), 300L);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 29).isSupported) {
            return;
        }
        int i = this.LJII;
        if (i == 0) {
            Fragment fragment = this.LIZLLL;
            if (fragment == null) {
                LIZ(LJIIZILJ(), z);
            } else {
                LIZJ(fragment, z);
            }
        } else if (i == 1) {
            C136746cW5 c136746cW5 = this.f25513LJ;
            if (c136746cW5 == null) {
                LIZ(LJIIZILJ(), z);
                return;
            }
            c136746cW5.LIZJ = this.LJIILJJIL;
            LIZJ(c136746cW5, true);
        } else if (i == 3) {
            Fragment fragment2 = this.LJFF;
            if (fragment2 == null) {
                LIZ(LJIIZILJ(), z);
            } else {
                LIZJ(fragment2, z);
            }
        } else {
            switch (i) {
                case 9:
                    Fragment fragment3 = this.LJI;
                    if (fragment3 == null) {
                        LIZ(LJIIZILJ(), z);
                        return;
                    } else {
                        LIZJ(fragment3, z);
                        return;
                    }
                case 10:
                    Fragment fragment4 = this.LJJIJIL;
                    if (fragment4 == null) {
                        LIZ(LJIIZILJ(), z);
                        return;
                    } else {
                        LIZJ(fragment4, z);
                        return;
                    }
                case 11:
                    Fragment fragment5 = this.LJJIJL;
                    if (fragment5 == null) {
                        LIZ(LJIIZILJ(), z);
                        return;
                    } else {
                        LIZJ(fragment5, z);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public final void LIZ(int i, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 30).isSupported) {
            return;
        }
        if (i == 0) {
            LIZLLL(this.LIZLLL, z);
            this.LIZLLL = null;
        } else if (i == 1) {
            LIZLLL(this.f25513LJ, z);
            this.f25513LJ = null;
        } else if (i == 3) {
            LIZLLL(this.LJFF, z);
            this.LJFF = null;
        } else {
            switch (i) {
                case 9:
                    LIZLLL(this.LJI, z);
                    this.LJI = null;
                    return;
                case 10:
                    LIZLLL(this.LJJIJIL, z);
                    this.LJJIJIL = null;
                    return;
                case 11:
                    LIZLLL(this.LJJIJL, z);
                    this.LJJIJL = null;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // p003X.AbstractC136812cX9
    public final void LIZ(CJPayButtonInfo cJPayButtonInfo) {
        if (!PatchProxy.proxy(new Object[]{cJPayButtonInfo}, this, LIZ, false, 33).isSupported && cJPayButtonInfo != null) {
            View$OnClickListenerC136910cYj view$OnClickListenerC136910cYj = new View$OnClickListenerC136910cYj(this);
            CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(this);
            int i = cJPayButtonInfo.left_button_action;
            DialogC137460chc dialogC137460chc = this.mCommonDialog;
            String str = cJPayButtonInfo.find_pwd_url;
            C136373cQ4 c136373cQ4 = LJIIIZ;
            String str2 = "";
            String str3 = c136373cQ4 == null ? str2 : c136373cQ4.merchant_info.app_id;
            C136373cQ4 c136373cQ42 = LJIIIZ;
            defaultBuilder.setLeftBtnListener(C136353cPk.LIZIZ(i, dialogC137460chc, this, str, str3, c136373cQ42 == null ? str2 : c136373cQ42.merchant_info.merchant_id, view$OnClickListenerC136910cYj));
            int i2 = cJPayButtonInfo.right_button_action;
            DialogC137460chc dialogC137460chc2 = this.mCommonDialog;
            String str4 = cJPayButtonInfo.find_pwd_url;
            C136373cQ4 c136373cQ43 = LJIIIZ;
            String str5 = c136373cQ43 == null ? str2 : c136373cQ43.merchant_info.app_id;
            C136373cQ4 c136373cQ44 = LJIIIZ;
            defaultBuilder.setRightBtnListener(C136353cPk.LIZIZ(i2, dialogC137460chc2, this, str4, str5, c136373cQ44 == null ? str2 : c136373cQ44.merchant_info.merchant_id, view$OnClickListenerC136910cYj));
            int i3 = cJPayButtonInfo.action;
            DialogC137460chc dialogC137460chc3 = this.mCommonDialog;
            String str6 = cJPayButtonInfo.find_pwd_url;
            C136373cQ4 c136373cQ45 = LJIIIZ;
            String str7 = c136373cQ45 == null ? str2 : c136373cQ45.merchant_info.app_id;
            C136373cQ4 c136373cQ46 = LJIIIZ;
            if (c136373cQ46 != null) {
                str2 = c136373cQ46.merchant_info.merchant_id;
            }
            defaultBuilder.setSingleBtnListener(C136353cPk.LIZIZ(i3, dialogC137460chc3, this, str6, str7, str2, view$OnClickListenerC136910cYj));
            defaultBuilder.setWidth(300);
            defaultBuilder.setButtonInfo(cJPayButtonInfo);
            showCommonDialog(defaultBuilder);
        }
    }

    public final void LIZ(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), (byte) 0}, this, LIZ, false, 44).isSupported) {
            return;
        }
        V33 v33 = new V33();
        v33.f13682LJ = C136353cPk.LIZ(this, false);
        CJPayHostInfo cJPayHostInfo = LJIIJ;
        HashMap<String, String> hashMap = null;
        v33.LJFF = cJPayHostInfo != null ? cJPayHostInfo.payRequestParams : null;
        if (!TextUtils.isEmpty(str)) {
            v33.LIZJ = str;
        }
        String LIZ2 = CJPayParamsUtils.LIZ("bytepay.cashdesk.trade_create", CJPayParamsUtils.HostAPI.BDPAY);
        C136837cXY c136837cXY = new C136837cXY(this, z, z2, z3, false);
        String LIZ3 = v33.LIZ();
        C136373cQ4 c136373cQ4 = LJIIIZ;
        String str2 = c136373cQ4 == null ? null : c136373cQ4.merchant_info.app_id;
        C136373cQ4 c136373cQ42 = LJIIIZ;
        Map<String, String> LIZ4 = CJPayParamsUtils.LIZ("bytepay.cashdesk.trade_create", LIZ3, str2, c136373cQ42 == null ? null : c136373cQ42.merchant_info.merchant_id);
        CJPayHostInfo cJPayHostInfo2 = LJIIJ;
        if (cJPayHostInfo2 != null) {
            hashMap = cJPayHostInfo2.extraHeaderMap;
        }
        this.LJJIJIIJIL = CJPayNetworkManager.postForm(LIZ2, LIZ4, CJPayParamsUtils.LIZ(LIZ2, "bytepay.cashdesk.trade_create", hashMap), c136837cXY);
        this.LJIILL = true;
        this.LJIIZILJ = System.currentTimeMillis();
        String str3 = CJPayHostInfo.aid;
        String str4 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo3 = LJIIJ;
        C136777cWa.LIZ("追光_create", "wallet_rd_create_interface_params_verify", str3, str4, cJPayHostInfo3 != null ? cJPayHostInfo3.merchantId : "");
    }

    public final void LIZ(JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4) {
        if (PatchProxy.proxy(new Object[]{jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 45).isSupported) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC136740cVz(this, jSONObject, z, z3, z2, z4));
    }

    public final void LIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 57).isSupported && fragment != null) {
            try {
                if (this.LJJIJ == null) {
                    return;
                }
                this.LJJIJIIJI = getSupportFragmentManager().beginTransaction();
                if (z) {
                    C136058cKz.LIZIZ(this.LJJIJIIJI);
                }
                this.LJJIJIIJI.add(2131170064, fragment);
                this.LJJIJIIJI.commitAllowingStateLoss();
                this.LJIIIIZZ = fragment;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void LIZ(JSONObject jSONObject) {
        Fragment LJIIZILJ;
        ICJPayH5Service iCJPayH5Service;
        if (!PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 60).isSupported && this.LJJIJ != null) {
            this.LJIILL = false;
            this.LJJIIZI.LIZIZ();
            if (jSONObject.has("error_code")) {
                String string = getResources().getString(2131558456);
                C136373cQ4 c136373cQ4 = LJIIIZ;
                CJPayBasicUtils.displayToastInternal(this, string, c136373cQ4 == null ? -1 : c136373cQ4.cashdesk_show_conf.show_style);
                C2118a.LIZ().LIZ(109).LIZIZ();
                CJPayActivityManager.INSTANCE.finishAll(this);
            } else if (jSONObject.has("response")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                if (optJSONObject != null) {
                    CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.BD_COUNTER, CJPayPageLoadTrace.Section.PARSER);
                    C136373cQ4 LIZ2 = C136321cPE.LIZ(optJSONObject);
                    LJIIIZ = LIZ2;
                    if (LIZ2 == null) {
                        return;
                    }
                    String str = "";
                    if ("GW400009".equals(LJIIIZ.code)) {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 67).isSupported) {
                            return;
                        }
                        C136373cQ4 c136373cQ42 = LJIIIZ;
                        if (c136373cQ42 != null) {
                            str = c136373cQ42.getUnionPassUrl();
                        }
                        if (!TextUtils.isEmpty(str) && (iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class)) != null) {
                            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
                            h5ParamBuilder.setContext(this);
                            h5ParamBuilder.setUrl(str);
                            h5ParamBuilder.setHostInfo(CJPayHostInfo.LIZIZ(LJIIJ));
                            iCJPayH5Service.startH5(h5ParamBuilder);
                        }
                        LJIJI();
                        return;
                    } else if (LJIIIZ.code.length() >= 6 && "4009".equals(LJIIIZ.code.substring(2, 6))) {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 68).isSupported) {
                            return;
                        }
                        C135539cCc c135539cCc = CJPayLimitErrorActivity.LIZIZ;
                        CJPayHostInfo cJPayHostInfo = LJIIJ;
                        String str2 = cJPayHostInfo != null ? cJPayHostInfo.merchantId : str;
                        CJPayHostInfo cJPayHostInfo2 = LJIIJ;
                        if (cJPayHostInfo2 != null) {
                            str = cJPayHostInfo2.appId;
                        }
                        if (!PatchProxy.proxy(new Object[]{this, "支付", "light", str2, str}, c135539cCc, C135539cCc.LIZ, false, 2).isSupported) {
                            C106862S5w.LIZ("支付", "light");
                            c135539cCc.LIZ(this, "支付", "light", false, str2, str);
                        }
                        C2118a.LIZ().LIZ(104).LIZIZ();
                        LJIJI();
                        return;
                    } else if (!"CD000000".equals(LJIIIZ.code)) {
                        if ("GW400008".equals(LJIIIZ.code)) {
                            C2118a.LIZ().LIZ(108).LIZIZ();
                        } else {
                            C2118a.LIZ().LIZ(105).LIZIZ();
                        }
                        CJPayActivityManager.INSTANCE.finishAll(this);
                        return;
                    } else {
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
                        if (proxy.isSupported) {
                            LJIIZILJ = (Fragment) proxy.result;
                        } else {
                            C136373cQ4 c136373cQ43 = LJIIIZ;
                            if (c136373cQ43 != null) {
                                this.LJIIL = c136373cQ43.paytype_info.default_pay_channel;
                                this.LJII = 0;
                            }
                            LJIIZILJ = LJIIZILJ();
                        }
                        if (LJIIZILJ != null) {
                            if (C2118a.LIZ().LJIILIIL == null) {
                                C2118a.LIZ().LIZ(110).LIZIZ();
                            }
                            if (this.LJJIJ != null) {
                                CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.BD_COUNTER, CJPayPageLoadTrace.Section.RENDERING);
                                LIZ(LJIIZILJ, false);
                                return;
                            }
                            return;
                        }
                        C2118a.LIZ().LIZ(105).LIZIZ();
                        CJPayActivityManager.INSTANCE.finishAll(this);
                        return;
                    }
                }
                C2118a.LIZ().LIZ(105).LIZIZ();
                CJPayActivityManager.INSTANCE.finishAll(this);
            } else {
                C2118a.LIZ().LIZ(105).LIZIZ();
                CJPayActivityManager.INSTANCE.finishAll(this);
            }
        }
    }

    public final void LIZ(boolean z, String str) {
        int i = 2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 62).isSupported) {
            return;
        }
        Fragment fragment = this.LJIIIIZZ;
        if (fragment != null && (fragment instanceof C136737cVw)) {
            C136737cVw c136737cVw = (C136737cVw) fragment;
            if (z) {
                i = 1;
            }
            c136737cVw.LIZIZ(i);
            return;
        }
        Fragment fragment2 = this.LJIIIIZZ;
        if (fragment2 != null && (fragment2 instanceof C136746cW5)) {
            ((C136746cW5) fragment2).LIZ();
            return;
        }
        Fragment fragment3 = this.LJIIIIZZ;
        if (fragment3 != null && (fragment3 instanceof C136780cWd)) {
            ((C136780cWd) fragment3).LIZIZ(str);
            return;
        }
        Fragment fragment4 = this.LJIIIIZZ;
        if (fragment4 == null || !(fragment4 instanceof C136779cWc)) {
            return;
        }
        ((C136779cWc) fragment4).LIZ();
    }

    static {
        Covode.recordClassIndex(8103);
    }

    public boolean LIZ() {
        int i = this.LJII;
        if (10 != i && 11 != i) {
            return false;
        }
        return true;
    }

    @Override // p003X.AbstractC136812cX9
    public final void LJII() {
        C136450cRJ c136450cRJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported && (c136450cRJ = this.LJIILLIIL) != null) {
            int i = C136450cRJ.LJIILIIL;
            int i2 = C136450cRJ.LJIJI;
            c136450cRJ.LIZ(i, i2, i2, false);
        }
    }

    @Override // p003X.AbstractC136812cX9
    public final void LJIIIZ() {
        C136450cRJ c136450cRJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported && (c136450cRJ = this.LJIILLIIL) != null) {
            int i = C136450cRJ.LJIILL;
            int i2 = C136450cRJ.LJIJI;
            c136450cRJ.LIZ(i, i2, i2, false);
        }
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LJIIJJI() {
        Fragment fragment;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported && (fragment = this.LJIIIIZZ) != null) {
            LIZ(fragment);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 54).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZIZ(this);
    }

    private void LJIJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 66).isSupported) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC136854cXp(this), 500L);
    }

    @Override // p003X.AbstractC136812cX9
    public final void LJIIIIZZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        C136450cRJ c136450cRJ = this.LJIILLIIL;
        if (c136450cRJ != null) {
            int i = C136450cRJ.LJIILJJIL;
            int i2 = C136450cRJ.LJIJI;
            c136450cRJ.LIZ(i, i2, i2, false);
        }
        String str2 = CJPayHostInfo.aid;
        String str3 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo = LJIIJ;
        if (cJPayHostInfo != null) {
            str = cJPayHostInfo.merchantId;
        } else {
            str = "";
        }
        C136777cWa.LIZ("追光_cardSign", "wallet_rd_cardsign_interface_params_verify", str2, str3, str);
    }

    @Override // p003X.AbstractC136809cX6
    public final C2324d LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 37);
        if (proxy.isSupported) {
            return (C2324d) proxy.result;
        }
        C2324d c2324d = new C2324d();
        c2324d.LIZJ = "1";
        c2324d.LIZLLL = getResources().getString(2131561404);
        C136373cQ4 c136373cQ4 = LJIIIZ;
        if (c136373cQ4 != null) {
            c2324d.f25519LJ = c136373cQ4.paytype_info.quick_pay.discount_bind_card_msg;
        }
        c2324d.LJIIIIZZ = false;
        c2324d.LJIIIZ = "addnormalcard";
        return c2324d;
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        if (this.LJIIIIZZ instanceof C136780cWd) {
            if (!CJPayBasicUtils.isClickValid()) {
                return;
            }
            LIZJ("balanceAndBankCard");
            this.LJII = 11;
            LIZ(true);
        } else if (!CJPayBasicUtils.isClickValid()) {
        } else {
            LIZJ("balanceAndBankCard");
            this.LJII = 1;
            LIZ(true);
        }
    }

    @Override // p003X.AbstractC136809cX6
    public final int LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 52);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        ArrayList<String> arrayList = this.LJIIJJI;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    private void LJIJ() {
        Map<String, String> map;
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 59).isSupported) {
            return;
        }
        V33 v33 = new V33();
        v33.f13682LJ = C136353cPk.LIZ(this, false);
        CJPayHostInfo cJPayHostInfo = LJIIJ;
        HashMap<String, String> hashMap = null;
        if (cJPayHostInfo != null) {
            map = cJPayHostInfo.payRequestParams;
        } else {
            map = null;
        }
        v33.LJFF = map;
        String LIZ2 = CJPayParamsUtils.LIZ("bytepay.cashdesk.trade_create", CJPayParamsUtils.HostAPI.BDPAY);
        C136838cXZ c136838cXZ = new C136838cXZ(this);
        String LIZ3 = v33.LIZ();
        CJPayHostInfo cJPayHostInfo2 = LJIIJ;
        String str3 = "";
        if (cJPayHostInfo2 != null) {
            str = cJPayHostInfo2.appId;
        } else {
            str = str3;
        }
        CJPayHostInfo cJPayHostInfo3 = LJIIJ;
        if (cJPayHostInfo3 != null) {
            str2 = cJPayHostInfo3.merchantId;
        } else {
            str2 = str3;
        }
        Map<String, String> LIZ4 = CJPayParamsUtils.LIZ("bytepay.cashdesk.trade_create", LIZ3, str, str2);
        CJPayHostInfo cJPayHostInfo4 = LJIIJ;
        if (cJPayHostInfo4 != null) {
            hashMap = cJPayHostInfo4.extraHeaderMap;
        }
        this.LJJIJIIJIL = CJPayNetworkManager.postForm(LIZ2, LIZ4, CJPayParamsUtils.LIZ(LIZ2, "bytepay.cashdesk.trade_create", hashMap), c136838cXZ);
        this.LJIILL = true;
        this.LJIIZILJ = System.currentTimeMillis();
        String str4 = CJPayHostInfo.aid;
        String str5 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo5 = LJIIJ;
        if (cJPayHostInfo5 != null) {
            str3 = cJPayHostInfo5.merchantId;
        }
        C136777cWa.LIZ("追光_create", "wallet_rd_create_interface_params_verify", str4, str5, str3);
    }

    @Override // p003X.AbstractC136809cX6
    public final void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 49).isSupported) {
            return;
        }
        if (this.LIZIZ == null) {
            C137459chb c137459chb = new C137459chb(this, 2131493160);
            c137459chb.LIZ(getResources().getString(2131561558));
            c137459chb.LIZIZ(getResources().getString(2131558453));
            c137459chb.LIZJ(getResources().getString(2131561557));
            c137459chb.LIZ(C116971W2r.LIZ(getResources(), 2131623988));
            c137459chb.LIZ(new View$OnClickListenerC136859cXu(this));
            c137459chb.LIZIZ(new View$OnClickListenerC136772cWV(this));
            this.LIZIZ = c137459chb.LIZ();
        }
        if (!isFinishing() && !this.LIZIZ.isShowing()) {
            C116971W2r.LIZJ(this.LIZIZ);
        }
    }

    public final void LJIILL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 63).isSupported) {
            return;
        }
        Fragment fragment = this.LJIIIIZZ;
        if (fragment != null && (fragment instanceof C136737cVw)) {
            ((C136737cVw) fragment).LJIIL();
            return;
        }
        Fragment fragment2 = this.LJIIIIZZ;
        if (fragment2 != null && (fragment2 instanceof C136746cW5)) {
            ((C136746cW5) fragment2).LIZLLL();
            return;
        }
        Fragment fragment3 = this.LJIIIIZZ;
        if (fragment3 != null && (fragment3 instanceof C136780cWd)) {
            ((C136780cWd) fragment3).LJII();
            return;
        }
        Fragment fragment4 = this.LJIIIIZZ;
        if (fragment4 != null && (fragment4 instanceof C136779cWc)) {
            ((C136779cWc) fragment4).LIZLLL();
        }
    }

    @Override // p003X.AbstractC136812cX9
    public final C2324d LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 64);
        if (proxy.isSupported) {
            return (C2324d) proxy.result;
        }
        C2324d c2324d = null;
        if (LJIIIZ == null) {
            return null;
        }
        String mo16036LJ = mo16036LJ();
        if ("balance".equals(mo16036LJ)) {
            c2324d = LIZ(LJIIIZ.paytype_info, true, false);
        } else if ("quickpay".equals(mo16036LJ) && LJIIIZ.paytype_info.quick_pay.cards.size() > 0) {
            c2324d = LIZ(LJIIIZ.paytype_info, LJIIIZ.paytype_info.quick_pay.cards.get(0), true, false);
        }
        LIZ(c2324d);
        return c2324d;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        DialogC137460chc dialogC137460chc = this.LIZIZ;
        if (dialogC137460chc != null) {
            C116971W2r.LIZ(dialogC137460chc);
        }
        ICJPayRequest iCJPayRequest = this.LJJIJIIJIL;
        if (iCJPayRequest != null) {
            iCJPayRequest.cancel();
        }
        EventManager.INSTANCE.unregister(this.LJJJ);
        C136450cRJ c136450cRJ = this.LJIILLIIL;
        if (c136450cRJ != null) {
            c136450cRJ.m21733LJ();
        }
        ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        if (iCJPayNormalBindCardService != null) {
            iCJPayNormalBindCardService.release();
        }
        CJPayPerformance.LIZ().LIZLLL("wallet_rd_counter_bd_enter");
        C2312d.f25514LJ = null;
        LJIIIZ.user_info.real_check_type = "";
    }

    @Override // com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 73).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 72).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 71).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 74).isSupported) {
                    GOY.LIZLLL(this);
                    super.onStop();
                }
                if (EnterTransitionCrashOptimizer.getContext() != null) {
                    int i = Build.VERSION.SDK_INT;
                    try {
                        getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                    } catch (Throwable unused) {
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    private CJPayBaseFragment LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return (CJPayBaseFragment) proxy.result;
        }
        int i = this.LJII;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 9:
                            this.LJI = new C2314h();
                            C2314h c2314h = this.LJI;
                            c2314h.LJII = this;
                            return c2314h;
                        case 10:
                            this.LJJIJIL = new C136780cWd();
                            C136780cWd c136780cWd = this.LJJIJIL;
                            c136780cWd.LJII = this;
                            return c136780cWd;
                        case 11:
                            this.LJJIJL = new C136779cWc();
                            C136779cWc c136779cWc = this.LJJIJL;
                            c136779cWc.LJII = this;
                            return c136779cWc;
                        default:
                            return null;
                    }
                }
                this.LJFF = new C2312d();
                C2312d c2312d = this.LJFF;
                c2312d.LJII = this;
                c2312d.LJFF = C136423cQs.LIZ();
                return this.LJFF;
            }
            this.f25513LJ = new C136746cW5();
            C136746cW5 c136746cW5 = this.f25513LJ;
            c136746cW5.LIZJ = this.LJIILJJIL;
            c136746cW5.LJII = this;
            return c136746cW5;
        }
        this.LIZLLL = new C136737cVw();
        C136737cVw c136737cVw = this.LIZLLL;
        c136737cVw.LJII = this;
        return c136737cVw;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        if (LIZ()) {
            LIZ(false, "btn_loading");
            return;
        }
        C136737cVw c136737cVw = this.LIZLLL;
        if (c136737cVw != null) {
            c136737cVw.setIsQueryConnecting(true);
            this.LIZLLL.LIZIZ(1);
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        if (LIZ()) {
            LIZ(false, "half_screen_loading");
            return;
        }
        C136737cVw c136737cVw = this.LIZLLL;
        if (c136737cVw != null && !PatchProxy.proxy(new Object[0], c136737cVw, C136737cVw.LIZ, false, 36).isSupported) {
            c136737cVw.setIsQueryConnecting(true);
            c136737cVw.LIZIZ(3);
            c136737cVw.LJIIIIZZ();
            if (c136737cVw.LIZJ != null) {
                c136737cVw.LIZJ.setVisibility(8);
            }
            if (c136737cVw.f18079LJ != null) {
                c136737cVw.f18079LJ.setVisibility(8);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C136746cW5 c136746cW5;
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            if (((Boolean) proxy.result).booleanValue()) {
                return;
            }
        } else if (this.LJII == 1 && (c136746cW5 = this.f25513LJ) != null && c136746cW5.f18083LJ) {
            LJIILIIL();
            return;
        }
        C136450cRJ c136450cRJ = this.LJIILLIIL;
        if ((c136450cRJ == null || !c136450cRJ.LIZJ()) && CJPayBasicUtils.isClickValid() && !this.LJIILL) {
            if (this.LIZLLL != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (this.f25513LJ != null) {
                i++;
            }
            if (this.LJFF != null) {
                i++;
            }
            if (this.LJI != null) {
                i++;
            }
            if (this.LJJIJIL != null) {
                i++;
            }
            if (this.LJJIJL != null) {
                i++;
            }
            if (i == 1) {
                Fragment fragment = this.LJIIIIZZ;
                if (!LIZIZ(fragment)) {
                    LIZ(fragment);
                    return;
                }
                return;
            }
            int i2 = this.LJII;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 3) {
                        if (i2 != 9) {
                            if (i2 == 11) {
                                LIZ(11, true);
                                C136780cWd c136780cWd = this.LJJIJIL;
                                if (c136780cWd != null) {
                                    this.LJII = 10;
                                    this.LJIIIIZZ = c136780cWd;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        LIZ(9, 3, true);
                        return;
                    }
                } else {
                    LIZ(1, true);
                    C136737cVw c136737cVw = this.LIZLLL;
                    if (c136737cVw == null) {
                        return;
                    }
                    this.LJII = 0;
                    this.LJIIIIZZ = c136737cVw;
                    c136737cVw.m21723LJ(true);
                    return;
                }
            }
            Fragment fragment2 = this.LJIIIIZZ;
            if (LIZIZ(fragment2)) {
                return;
            }
            LIZ(fragment2);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        if (C2118a.LIZ().LIZJ != null && C2118a.LIZ().LIZJ.getCode() == 106 && !PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported) {
            String str = C2118a.LIZ().LIZJ.getCallBackInfo().get("service");
            String str2 = C2118a.LIZ().LIZJ.getCallBackInfo().get(C2521l.LJIIJ);
            if ("12".equals(str) && "0".equals(str2)) {
                this.LJIIL = "quickpay";
                C2118a.LIZ().LIZ(0);
                LIZ(-1, 3, true);
                return;
            }
            if ("12".equals(str) && "1".equals(str2)) {
                C2118a.LIZ().LIZ(104);
            } else if (!"17".equals(str)) {
                return;
            } else {
                C2118a.LIZ().LIZ(104);
                C136373cQ4 c136373cQ4 = LJIIIZ;
                if (c136373cQ4 != null && c136373cQ4.paytype_info != null && !TextUtils.isEmpty(LJIIIZ.paytype_info.default_pay_channel)) {
                    this.LJIIL = LJIIIZ.paytype_info.default_pay_channel;
                } else {
                    this.LJIIL = "quickpay";
                }
                if (LJIIIZ != null) {
                    LJIILLIIL();
                    Fragment fragment = this.LJIIIIZZ;
                    if (fragment != null && (fragment instanceof C136737cVw)) {
                        ((C136737cVw) fragment).LJII();
                    }
                }
            }
            LIZ(1);
        }
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZIZ(String str) {
        this.LJJIL = str;
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZJ(String str) {
        this.LJIILJJIL = str;
    }

    @Override // p003X.AbstractC136809cX6
    public final void LIZ(C2324d c2324d) {
        this.LIZJ = c2324d;
        if (c2324d != null) {
            this.LJIIL = c2324d.LJIIIZ;
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public void onEntranceResult(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 42).isSupported) {
            return;
        }
        runOnUiThread(new RunnableC136922cYv(this));
    }

    private boolean LIZIZ(Fragment fragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fragment}, this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (fragment != null && (((fragment instanceof C2312d) && ((BaseFragment) fragment).getIsQueryConnecting()) || ((fragment instanceof C136737cVw) && ((BaseFragment) fragment).getIsQueryConnecting()))) {
            return true;
        }
        return false;
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 46).isSupported) {
            return;
        }
        this.LJIILLIIL.LIZIZ();
        LIZ(i, 0, true);
        this.f25513LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJJIJIL = null;
        this.LJJIJL = null;
    }

    @Override // p003X.AbstractC136809cX6
    public final void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 48).isSupported) {
            return;
        }
        if (z) {
            LIZJ(this.LIZLLL, true);
            new Handler(getMainLooper()).postDelayed(new RunnableC136807cX4(this), 300L);
            return;
        }
        LIZ(1, true);
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136809cX6
    public final int LIZLLL(String str) {
        ArrayList<String> arrayList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 51);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || (arrayList = this.LJIIJJI) == null || arrayList.size() == 0 || !this.LJIIJJI.contains(str)) {
            return -1;
        }
        return this.LJIIJJI.indexOf(str);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 19).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        if (intent != null) {
            if (intent.hasExtra("param_checkout_counter_bind_card")) {
                C116971W2r.LIZ(intent, "param_checkout_counter_bind_card");
            } else if (intent.hasExtra("param_checkout_counter_union_pass")) {
                LJIJ();
            }
        }
    }

    @Override // p003X.AbstractC136809cX6
    public final C2324d LIZ(CJPayCard cJPayCard) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayCard}, this, LIZ, false, 36);
        if (proxy.isSupported) {
            return (C2324d) proxy.result;
        }
        C2324d c2324d = new C2324d();
        c2324d.LIZIZ = cJPayCard.icon_url;
        c2324d.LIZJ = cJPayCard.status;
        c2324d.LIZLLL = "";
        if (!TextUtils.isEmpty(cJPayCard.bank_name)) {
            new StringBuilder();
            c2324d.LIZLLL = C0002O.m25086C(c2324d.LIZLLL, cJPayCard.bank_name);
        }
        if (!TextUtils.isEmpty(cJPayCard.card_type_name)) {
            new StringBuilder();
            c2324d.LIZLLL = C0002O.m25086C(c2324d.LIZLLL, cJPayCard.card_type_name);
        }
        c2324d.f25519LJ = cJPayCard.msg;
        c2324d.LJIIIIZZ = false;
        c2324d.LJIIIZ = "addspecificcard";
        c2324d.LJIIZILJ = cJPayCard;
        return c2324d;
    }

    private void LIZLLL(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 31).isSupported) {
            return;
        }
        C136737cVw c136737cVw = this.LIZLLL;
        if (c136737cVw != null) {
            LIZIZ(c136737cVw, z);
        }
        C136746cW5 c136746cW5 = this.f25513LJ;
        if (c136746cW5 != null) {
            LIZIZ(c136746cW5, z);
        }
        C2312d c2312d = this.LJFF;
        if (c2312d != null) {
            LIZIZ(c2312d, z);
        }
        C2314h c2314h = this.LJI;
        if (c2314h != null) {
            LIZIZ(c2314h, z);
        }
        C136780cWd c136780cWd = this.LJJIJIL;
        if (c136780cWd != null) {
            LIZIZ(c136780cWd, z);
        }
        C136779cWc c136779cWc = this.LJJIJL;
        if (c136779cWc != null) {
            LIZIZ(c136779cWc, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LIZIZ(boolean z) {
        ICJPayNormalBindCardService iCJPayNormalBindCardService;
        JSONObject json;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 40).isSupported || !CJPayBasicUtils.isClickValid()) {
            return;
        }
        C136373cQ4 c136373cQ4 = LJIIIZ;
        if (c136373cQ4 != null && "1".equals(c136373cQ4.paytype_info.quick_pay.enable_bind_card)) {
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, this, LIZ, false, 41).isSupported && (iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class)) != null) {
                LIZ(z, "btn_loading");
                iCJPayNormalBindCardService.setPayNewCardCallback(new C136368cPz(this));
                NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
                C136373cQ4 c136373cQ42 = LJIIIZ;
                if (c136373cQ42 == null) {
                    json = null;
                } else {
                    json = c136373cQ42.process_info.toJson();
                }
                normalBindCardBean.setProcessInfo(json);
                normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.Pay);
                normalBindCardBean.setSource("");
                normalBindCardBean.setBindCardInfo("");
                normalBindCardBean.setHostInfoJSON(CJPayHostInfo.LIZIZ(LJIIJ));
                iCJPayNormalBindCardService.startBindCardProcess(this, ICJPayNormalBindCardService.BindCardType.TYPE_PAY, normalBindCardBean, this);
                return;
            }
            return;
        }
        C136373cQ4 c136373cQ43 = LJIIIZ;
        int i = -1;
        if (c136373cQ43 != null && !TextUtils.isEmpty(c136373cQ43.paytype_info.quick_pay.enable_bind_card_msg)) {
            String str = LJIIIZ.paytype_info.quick_pay.enable_bind_card_msg;
            C136373cQ4 c136373cQ44 = LJIIIZ;
            if (c136373cQ44 != null) {
                i = c136373cQ44.cashdesk_show_conf.show_style;
            }
            CJPayBasicUtils.displayToastInternal(this, str, i);
            return;
        }
        String string = getResources().getString(2131561407);
        C136373cQ4 c136373cQ45 = LJIIIZ;
        if (c136373cQ45 != null) {
            i = c136373cQ45.cashdesk_show_conf.show_style;
        }
        CJPayBasicUtils.displayToastInternal(this, string, i);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MethodCollector.m14708i(504);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(504);
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 6).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 5).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        this.LJJIJ = this;
        getWindow().setSoftInputMode(3);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 61).isSupported) {
            int i = Build.VERSION.SDK_INT;
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(CastProtectorUtils.parseColor("#00000000"));
            window.getDecorView().setSystemUiVisibility(9216);
        }
        setHalfTranslucent();
        this.LJJIIZ = (RelativeLayout) findViewById(2131170063);
        this.LJJIIZI = (CJPayLoadingView) findViewById(2131165239);
        EventManager.INSTANCE.register(this.LJJJ);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 53).isSupported) {
            CJPayHostInfo cJPayHostInfo = LJIIJ;
            if (cJPayHostInfo != null && cJPayHostInfo.isTransCheckoutCounterActivityWhenLoading) {
                LJIIJ.isTransCheckoutCounterActivityWhenLoading = false;
                this.LJJIIZ.setBackgroundColor(CastProtectorUtils.parseColor("#01000000"));
                this.LJJIIZI.LIZIZ();
            } else {
                this.LJJIIZ.setBackgroundColor(CastProtectorUtils.parseColor("#56000000"));
                CJPayHostInfo cJPayHostInfo2 = LJIIJ;
                if (cJPayHostInfo2 != null && cJPayHostInfo2.needLoading) {
                    this.LJJIIZI.LIZ();
                }
            }
            CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.BD_COUNTER, CJPayPageLoadTrace.Section.NETWORK);
            LJIJ();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
                this.LJJIZ = new C136546cSr();
                C136546cSr c136546cSr = this.LJJIZ;
                c136546cSr.LJI = this.LJJJI;
                c136546cSr.LJII = this.LJJJJJL;
                c136546cSr.LJIIIIZZ = this.LJJJJ;
                c136546cSr.LJIIIZ = this.LJJJJI;
                c136546cSr.LJIIJ = this.LJJJJIZL;
                c136546cSr.LJIIJJI = this.LJJJJJ;
                c136546cSr.LJIIL = this.LJJJJL;
                c136546cSr.LJIILJJIL = this.LJJJJLI;
                c136546cSr.LJIJ = this.LJJJIL;
            }
            this.LJIILLIIL = new C136450cRJ(this, 2131170064, this.LJJIZ);
            this.LJIILLIIL.LIZLLL = new C136738cVx(this);
            this.LJIILLIIL.LJFF = new C136813cXA(this);
            this.LJIILLIIL.LJII = new C136879cYE(this);
            this.LJIILLIIL.LJIIIZ = new C136849cXk(this);
        }
        MethodCollector.m14707o(504);
    }

    public final void LIZIZ(String str, String str2) {
        this.LJJI = str;
        this.LJJIFFI = str2;
    }

    private void LIZIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 55).isSupported && fragment != null) {
            try {
                if (this.LJJIJ != null) {
                    this.LJJIJIIJI = getSupportFragmentManager().beginTransaction();
                    if (z) {
                        C136058cKz.LIZ(this.LJJIJIIJI);
                    }
                    this.LJJIJIIJI.hide(fragment);
                    this.LJJIJIIJI.commitAllowingStateLoss();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void LIZJ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 56).isSupported && fragment != null) {
            try {
                if (this.LJJIJ != null) {
                    this.LJJIJIIJI = getSupportFragmentManager().beginTransaction();
                    if (z) {
                        C136058cKz.LIZ(this.LJJIJIIJI);
                    }
                    this.LJJIJIIJI.show(fragment);
                    this.LJJIJIIJI.commitAllowingStateLoss();
                    this.LJIIIIZZ = fragment;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void LIZLLL(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 58).isSupported && fragment != null) {
            try {
                if (this.LJJIJ != null) {
                    this.LJJIJIIJI = getSupportFragmentManager().beginTransaction();
                    if (z) {
                        C136058cKz.LIZIZ(this.LJJIJIIJI);
                    }
                    this.LJJIJIIJI.remove(fragment);
                    this.LJJIJIIJI.commitAllowingStateLoss();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void LIZ(int i, CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), cJPayInsufficientBalanceHintInfo}, this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJJIII = cJPayInsufficientBalanceHintInfo.rec_pay_type.pay_type_data.bank_card_id;
        C136885cYK.LIZ(cJPayInsufficientBalanceHintInfo);
        Fragment fragment = this.LJIIIIZZ;
        if (fragment != null && (fragment instanceof C136779cWc) && i == 11) {
            onBackPressed();
        }
        Fragment fragment2 = this.LJIIIIZZ;
        if (fragment2 != null && (fragment2 instanceof C136780cWd) && i == 10) {
            ((C136780cWd) fragment2).LIZ();
        }
    }

    @Override // p003X.AbstractC136809cX6
    public final C2324d LIZ(CJPayPayTypeInfo cJPayPayTypeInfo, boolean z, boolean z2) {
        boolean z3 = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayPayTypeInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 34);
        if (proxy.isSupported) {
            return (C2324d) proxy.result;
        }
        C2324d c2324d = new C2324d();
        c2324d.LIZIZ = cJPayPayTypeInfo.balance.icon_url;
        c2324d.LIZJ = cJPayPayTypeInfo.balance.status;
        c2324d.LIZLLL = cJPayPayTypeInfo.balance.title;
        c2324d.f25519LJ = cJPayPayTypeInfo.balance.msg;
        c2324d.LJFF = "";
        c2324d.LJI = cJPayPayTypeInfo.balance.mark;
        c2324d.LJII = "balance";
        if (!z) {
            if (z2) {
                c2324d.LJIIIIZZ = "balance".equals(mo16036LJ());
                c2324d.LJIIIZ = "balance";
                c2324d.LJIIJJI = cJPayPayTypeInfo.balance.tt_mark;
                c2324d.LJIIL = cJPayPayTypeInfo.balance.tt_title;
                c2324d.LJIILIIL = cJPayPayTypeInfo.balance.tt_sub_title;
                c2324d.LJIILL = cJPayPayTypeInfo.balance.tt_icon_url;
                return c2324d;
            } else if (!"quickpay".equals(mo16036LJ()) && !"balance".equals(mo16036LJ())) {
                z3 = false;
            }
        }
        c2324d.LJIIIIZZ = z3;
        c2324d.LJIIIZ = "balance";
        c2324d.LJIIJJI = cJPayPayTypeInfo.balance.tt_mark;
        c2324d.LJIIL = cJPayPayTypeInfo.balance.tt_title;
        c2324d.LJIILIIL = cJPayPayTypeInfo.balance.tt_sub_title;
        c2324d.LJIILL = cJPayPayTypeInfo.balance.tt_icon_url;
        return c2324d;
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZ(int i, int i2, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 28).isSupported || this.LJII == i2) {
            return;
        }
        LIZ(i, z);
        this.LJII = i2;
        LIZLLL(z);
        LIZ(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
        if (r3.LIZ() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
        if ("balance".equals(mo16036LJ()) == false) goto L30;
     */
    @Override // p003X.AbstractC136809cX6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.ttcjpaysdk.thirdparty.counter.data.C2324d LIZ(com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo r9, com.android.ttcjpaysdk.thirdparty.data.CJPayCard r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity.LIZ(com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo, com.android.ttcjpaysdk.thirdparty.data.CJPayCard, boolean, boolean):com.android.ttcjpaysdk.thirdparty.counter.data.d");
    }
}
