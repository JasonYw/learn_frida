package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayPayInfo;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2324d;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2311a;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2313g;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2314h;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2315k;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2316m;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2317n;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserInfo;
import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2374a;
import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2375b;
import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2376c;
import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2377d;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC135282c8T;
import p003X.AbstractC136371cQ2;
import p003X.AbstractC136388cQJ;
import p003X.AbstractC136413cQi;
import p003X.AbstractC136439cR8;
import p003X.AbstractC136441cRA;
import p003X.AbstractC136525cSW;
import p003X.AbstractC136938cZB;
import p003X.AbstractC136944cZH;
import p003X.AbstractC136946cZJ;
import p003X.AbstractC136947cZK;
import p003X.AbstractC136948cZL;
import p003X.AbstractC136950cZN;
import p003X.AbstractC136951cZO;
import p003X.AbstractC136952cZP;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C136350cPh;
import p003X.C136360cPr;
import p003X.C136362cPt;
import p003X.C136364cPv;
import p003X.C136373cQ4;
import p003X.C136375cQ6;
import p003X.C136378cQ9;
import p003X.C136423cQs;
import p003X.C136426cQv;
import p003X.C136427cQw;
import p003X.C136432cR1;
import p003X.C136450cRJ;
import p003X.C136546cSr;
import p003X.C136568cTD;
import p003X.C136572cTH;
import p003X.C136647cUU;
import p003X.C136720cVf;
import p003X.C136722cVh;
import p003X.C136733cVs;
import p003X.C136736cVv;
import p003X.C136741cW0;
import p003X.C136742cW1;
import p003X.C136744cW3;
import p003X.C136750cW9;
import p003X.C136751cWA;
import p003X.C136753cWC;
import p003X.C136754cWD;
import p003X.C136756cWF;
import p003X.C136757cWG;
import p003X.C136763cWM;
import p003X.C136773cWW;
import p003X.C136777cWa;
import p003X.C136778cWb;
import p003X.C136834cXV;
import p003X.C136850cXl;
import p003X.C136852cXn;
import p003X.C136867cY2;
import p003X.C136873cY8;
import p003X.C136874cY9;
import p003X.C136886cYL;
import p003X.C136936cZ9;
import p003X.C136992ca3;
import p003X.DialogC135279c8Q;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.RunnableC136928cZ1;

/* loaded from: classes17.dex */
public final class CJPayFrontETCounterActivity extends BaseActivity implements INormalBindCardCallback, AbstractC136371cQ2, AbstractC136938cZB, AbstractC136952cZP {
    public static ChangeQuickRedirect LIZ;
    public C136742cW1 LIZIZ;
    public CJPayTextLoadingView LIZJ;
    public C136450cRJ LIZLLL;

    /* renamed from: LJ */
    public boolean f25529LJ;
    public C136546cSr LJII;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIL;
    public C2324d LJIL;
    public DialogC137460chc LJJ;
    public ViewGroup LJJIFFI;
    public static final C136936cZ9 LJIJJLI = new C136936cZ9((byte) 0);
    public static final String LJIJJ = "CJPayFrontETCounterActivity";
    public String LJJI = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJJII = "";
    public boolean LJJIII = true;
    public String LJIIIIZZ = "";
    public HashMap<String, String> LJIIJJI = new HashMap<>();
    public final AbstractC2126a LJJIIJ = new C136733cVs(this);
    public final Lazy LJJIIJZLJL = LazyKt__LazyJVMKt.lazy(new CJPayFrontETCounterActivity$completeFragment$2(this));
    public final Lazy LJJIIZ = LazyKt__LazyJVMKt.lazy(CJPayFrontETCounterActivity$fingerprintGuideFragment$2.INSTANCE);
    public final Lazy LJJIIZI = LazyKt__LazyJVMKt.lazy(CJPayFrontETCounterActivity$preBioGuideFragment$2.INSTANCE);
    public final Lazy LJJIJ = LazyKt__LazyJVMKt.lazy(CJPayFrontETCounterActivity$passwordFreeGuideFragment$2.INSTANCE);
    public final Lazy LJJIJIIJI = LazyKt__LazyJVMKt.lazy(CJPayFrontETCounterActivity$amountUpgradeGuideFragment$2.INSTANCE);
    public final Lazy LJJIJIIJIL = LazyKt__LazyJVMKt.lazy(CJPayFrontETCounterActivity$defaultPayGuideFragment$2.INSTANCE);
    public final Lazy LJJIJIL = LazyKt__LazyJVMKt.lazy(CJPayFrontETCounterActivity$resetPwdGuideFragment$2.INSTANCE);
    public final Lazy LJJIJL = LazyKt__LazyJVMKt.lazy(new CJPayFrontETCounterActivity$insufficientBalanceFragment$2(this));
    public final Lazy LJJIJLIJ = LazyKt__LazyJVMKt.lazy(new CJPayFrontETCounterActivity$frontMethodFragment$2(this));
    public final Lazy LJJIL = LazyKt__LazyJVMKt.lazy(new CJPayFrontETCounterActivity$newInsufficientBalanceFragment$2(this));
    public final C136360cPr LJJIZ = new C136360cPr(this);
    public final C136362cPt LJJJ = new C136362cPt(this);
    public final C136572cTH LJJJI = new C136572cTH();
    public final AbstractC136388cQJ LJJJIL = C136850cXl.LIZIZ;
    public final C136886cYL LJJJJ = new C136886cYL();
    public final C136350cPh LJJJJI = new C136350cPh();
    public final AbstractC136441cRA LJJJJIZL = C136375cQ6.LIZIZ;
    public final AbstractC136525cSW LJJJJJ = C136378cQ9.LIZIZ;
    public final AbstractC136439cR8 LJJJJJL = C136867cY2.LIZIZ;
    public final C136432cR1 LJJJJL = new C136432cR1(this);
    public final C136722cVh LJJJJLI = new C136722cVh();
    public final AbstractC136413cQi LJJJJLL = C136873cY8.LIZIZ;
    public final AbstractC136946cZJ LJIILIIL = new C136754cWD(this);
    public final AbstractC136950cZN LJIILJJIL = new C136773cWW(this);
    public final AbstractC136947cZK LJIILL = new C136751cWA(this);
    public final AbstractC136947cZK LJIILLIIL = new C136753cWC(this);
    public final AbstractC136944cZH LJIIZILJ = new C136744cW3(this);
    public final AbstractC136948cZL LJIJ = new C136756cWF(this);
    public final AbstractC136951cZO LJIJI = new C136874cY9(this);

    public static final String LJIL() {
        return LJIJJ;
    }

    private final C2375b LJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        return (C2375b) (proxy.isSupported ? proxy.result : this.LJJIJL.mo27335getValue());
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZ(int i, int i2, boolean z) {
    }

    public final C2374a LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        return (C2374a) (proxy.isSupported ? proxy.result : this.LJJIIJZLJL.mo27335getValue());
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136809cX6
    public final int LIZLLL(String str) {
        return -1;
    }

    /* renamed from: LJ */
    public final C2314h m16035LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        return (C2314h) (proxy.isSupported ? proxy.result : this.LJJIIZ.mo27335getValue());
    }

    @Override // p003X.AbstractC136371cQ2
    public final int LJI() {
        return -1;
    }

    public final C2316m LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return (C2316m) (proxy.isSupported ? proxy.result : this.LJJIIZI.mo27335getValue());
    }

    public final C2315k LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        return (C2315k) (proxy.isSupported ? proxy.result : this.LJJIJ.mo27335getValue());
    }

    public final C2311a LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        return (C2311a) (proxy.isSupported ? proxy.result : this.LJJIJIIJI.mo27335getValue());
    }

    public final C2313g LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        return (C2313g) (proxy.isSupported ? proxy.result : this.LJJIJIIJIL.mo27335getValue());
    }

    public final C2317n LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        return (C2317n) (proxy.isSupported ? proxy.result : this.LJJIJIL.mo27335getValue());
    }

    public final C2376c LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        return (C2376c) (proxy.isSupported ? proxy.result : this.LJJIJLIJ.mo27335getValue());
    }

    public final C2377d LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        return (C2377d) (proxy.isSupported ? proxy.result : this.LJJIL.mo27335getValue());
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final int getLayout() {
        return 2131690552;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 82).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 81).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractC136371cQ2
    public final String LJFF() {
        return this.LJJI;
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : CJPayCheckoutCounterActivity.LJIIIZ != null && Intrinsics.areEqual(CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene, "Pre_Pay_PayAfterUse");
    }

    public final void LIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 28).isSupported && CJPayCheckoutCounterActivity.LJIIIZ != null && CJPayBasicUtils.isClickValid()) {
            if (this.LIZLLL == null) {
                LJJI();
            }
            if (CJPayCheckoutCounterActivity.LJIIIZ.need_resign_card) {
                LJJIII();
                return;
            }
            this.LJIIL = z;
            String str = CJPayCheckoutCounterActivity.LJIIIZ.user_info.pwd_check_way;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 48) {
                    if (hashCode != 49) {
                        if (hashCode == 51) {
                            if (str.equals(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START)) {
                                if (CJPayCheckoutCounterActivity.LJIIIZ.show_no_pwd_confirm_page == 2) {
                                    C136757cWG.f18084LJ.LIZ();
                                }
                                LJJIIJ();
                            }
                        } else if (hashCode == 53 && str.equals("5")) {
                            C136757cWG.f18084LJ.LIZ();
                            LJJIIZ();
                        }
                    } else if (str.equals("1")) {
                        ICJPayFingerprintService iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
                        if (iCJPayFingerprintService != null && iCJPayFingerprintService.isLocalEnableFingerprint(this, CJPayCheckoutCounterActivity.LJIIIZ.user_info.uid, true)) {
                            LIZJ(false);
                            C136546cSr c136546cSr = this.LJII;
                            if (c136546cSr != null) {
                                c136546cSr.f18051LJ = false;
                            }
                            LJJIIJZLJL();
                        } else {
                            LIZJ(true);
                            C136546cSr c136546cSr2 = this.LJII;
                            if (c136546cSr2 != null) {
                                c136546cSr2.f18051LJ = true;
                            }
                            LJJII();
                        }
                    }
                } else if (str.equals("0")) {
                    LJJII();
                }
            }
            try {
                C2118a.LIZ().LIZ("wallet_cashier_confirm_pswd_type_sdk", C136423cQs.LIZIZ.LIZ());
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 71).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIIJJI.put(str, str2);
    }

    @Override // p003X.AbstractC136938cZB
    public final boolean LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 72);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        return mo16033LJ(str);
    }

    public final void LIZ(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, LIZ, false, 75).isSupported) {
            return;
        }
        this.LJJII = C136647cUU.LIZIZ.LIZ(str, str2, str3);
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9, p003X.AbstractC136809cX6
    public final C2324d LIZLLL() {
        return this.LJIL;
    }

    static {
        Covode.recordClassIndex(8516);
    }

    private final void LJJIIZ() {
        C136450cRJ c136450cRJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 51).isSupported && (c136450cRJ = this.LIZLLL) != null) {
            int i = C136450cRJ.LJIIZILJ;
            int i2 = C136450cRJ.LJIJ;
            c136450cRJ.LIZ(i, i2, i2, false);
        }
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 64).isSupported) {
            return;
        }
        LJIJJLI();
    }

    public final void LJIILLIIL() {
        CJPayTextLoadingView cJPayTextLoadingView;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported && (cJPayTextLoadingView = this.LIZJ) != null) {
            cJPayTextLoadingView.show();
        }
    }

    public final void LJIIZILJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported) {
            return;
        }
        C136757cWG.f18084LJ.LIZ();
        CJPayTextLoadingView cJPayTextLoadingView = this.LIZJ;
        if (cJPayTextLoadingView != null) {
            cJPayTextLoadingView.hide();
        }
    }

    public final void LJIJJLI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 63).isSupported) {
            return;
        }
        C2118a.LIZ().LIZ(113);
        LJIIJJI();
    }

    private final boolean LJJIFFI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 36);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(getSupportFragmentManager().findFragmentById(2131170157) instanceof C2374a)) {
            return false;
        }
        return true;
    }

    private final void LJJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 47).isSupported) {
            return;
        }
        if (LJJIIZI()) {
            C136450cRJ c136450cRJ = this.LIZLLL;
            if (c136450cRJ != null) {
                int i = C136450cRJ.LJIILIIL;
                int i2 = C136450cRJ.LJIJJ;
                c136450cRJ.LIZ(i, i2, i2, false);
                return;
            }
            return;
        }
        C136450cRJ c136450cRJ2 = this.LIZLLL;
        if (c136450cRJ2 != null) {
            int i3 = C136450cRJ.LJIILIIL;
            int i4 = C136450cRJ.LJIJI;
            c136450cRJ2.LIZ(i3, i4, i4, false);
        }
    }

    private final void LJJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 49).isSupported) {
            return;
        }
        if (LJJIIZI()) {
            C136450cRJ c136450cRJ = this.LIZLLL;
            if (c136450cRJ != null) {
                int i = C136450cRJ.LJIILLIIL;
                int i2 = C136450cRJ.LJIJJ;
                c136450cRJ.LIZ(i, i2, i2, false);
                return;
            }
            return;
        }
        C136450cRJ c136450cRJ2 = this.LIZLLL;
        if (c136450cRJ2 != null) {
            int i3 = C136450cRJ.LJIILLIIL;
            int i4 = C136450cRJ.LJIJ;
            c136450cRJ2.LIZ(i3, i4, i4, false);
        }
    }

    private final void LJJIIJZLJL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 50).isSupported) {
            return;
        }
        if (LJJIIZI()) {
            C136450cRJ c136450cRJ = this.LIZLLL;
            if (c136450cRJ != null) {
                int i = C136450cRJ.LJIILL;
                int i2 = C136450cRJ.LJIJJ;
                c136450cRJ.LIZ(i, i2, i2, false);
                return;
            }
            return;
        }
        C136450cRJ c136450cRJ2 = this.LIZLLL;
        if (c136450cRJ2 != null) {
            int i3 = C136450cRJ.LJIILL;
            int i4 = C136450cRJ.LJIJI;
            c136450cRJ2.LIZ(i3, i4, i4, false);
        }
    }

    private final boolean LJJIIZI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 60);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if ((LJIJ() && !LJIILL().LIZLLL()) || LJIJI()) {
            return false;
        }
        return true;
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 61).isSupported) {
            return;
        }
        C136450cRJ c136450cRJ = this.LIZLLL;
        if (c136450cRJ != null) {
            c136450cRJ.m21733LJ();
        }
        C136742cW1 c136742cW1 = this.LIZIZ;
        if (c136742cW1 != null) {
            c136742cW1.LIZ(false);
        }
        C2118a.LIZ().LIZIZ();
        if (this.LJJIII) {
            CJPayActivityManager.INSTANCE.finishAll(this);
        } else {
            CJPayActivityManager.INSTANCE.finishAllExceptH5(this);
        }
    }

    public final boolean LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 44);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(getSupportFragmentManager().findFragmentById(2131170157) instanceof C2377d)) {
            return false;
        }
        return true;
    }

    public final boolean LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 45);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(getSupportFragmentManager().findFragmentById(2131170157) instanceof C2376c)) {
            return false;
        }
        return true;
    }

    private final void LJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        this.LIZLLL = new C136450cRJ(this, 2131170157, this.LJII);
        C136450cRJ c136450cRJ = this.LIZLLL;
        if (c136450cRJ != null) {
            c136450cRJ.LIZLLL = new C136741cW0(this);
        }
        C136450cRJ c136450cRJ2 = this.LIZLLL;
        if (c136450cRJ2 != null) {
            c136450cRJ2.LJFF = new C136720cVf(this);
        }
        C136450cRJ c136450cRJ3 = this.LIZLLL;
        if (c136450cRJ3 != null) {
            c136450cRJ3.LJI = new C136568cTD(this);
        }
        C136450cRJ c136450cRJ4 = this.LIZLLL;
        if (c136450cRJ4 != null) {
            c136450cRJ4.LJII = new C136763cWM(this);
        }
        C136450cRJ c136450cRJ5 = this.LIZLLL;
        if (c136450cRJ5 != null) {
            c136450cRJ5.LIZ(new C136427cQw());
        }
        C136450cRJ c136450cRJ6 = this.LIZLLL;
        if (c136450cRJ6 != null) {
            c136450cRJ6.LJIIIIZZ = new C136750cW9(this);
        }
        C136450cRJ c136450cRJ7 = this.LIZLLL;
        if (c136450cRJ7 != null) {
            c136450cRJ7.LJIIIZ = C136852cXn.LIZIZ;
        }
    }

    private final void LJJIII() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 48).isSupported) {
            return;
        }
        if (LJJIIZI()) {
            C136450cRJ c136450cRJ = this.LIZLLL;
            if (c136450cRJ != null) {
                int i = C136450cRJ.LJIILJJIL;
                int i2 = C136450cRJ.LJIJJ;
                c136450cRJ.LIZ(i, i2, i2, false);
            }
        } else {
            C136450cRJ c136450cRJ2 = this.LIZLLL;
            if (c136450cRJ2 != null) {
                int i3 = C136450cRJ.LJIILJJIL;
                int i4 = C136450cRJ.LJIJI;
                c136450cRJ2.LIZ(i3, i4, i4, false);
            }
        }
        C136778cWb c136778cWb = C136777cWa.LIZIZ;
        String str2 = CJPayHostInfo.aid;
        String str3 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo = CJPayCheckoutCounterActivity.LJIIJ;
        if (cJPayHostInfo != null) {
            str = cJPayHostInfo.merchantId;
        } else {
            str = null;
        }
        c136778cWb.LIZ("追光_cardSign", "wallet_rd_cardsign_interface_params_verify", str2, str3, str);
    }

    public final void LJIJJ() {
        C136742cW1 c136742cW1;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 52).isSupported) {
            return;
        }
        LIZJ().LJIILLIIL = this.LJIIJ;
        this.LJIIJ = false;
        C136450cRJ c136450cRJ = this.LIZLLL;
        if ((c136450cRJ == null || c136450cRJ.LIZLLL()) && (c136742cW1 = this.LIZIZ) != null && c136742cW1.LIZLLL() == 0) {
            if (CJPayCheckoutCounterActivity.LJIIIZ != null && Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, CJPayCheckoutCounterActivity.LJIIIZ.user_info.pwd_check_way)) {
                C136450cRJ c136450cRJ2 = this.LIZLLL;
                if (c136450cRJ2 != null && c136450cRJ2.LJIJJLI) {
                    CJPayTextLoadingView cJPayTextLoadingView = this.LIZJ;
                    if (cJPayTextLoadingView != null) {
                        cJPayTextLoadingView.setPayMessage("支付中");
                    }
                    LJIILLIIL();
                }
            } else {
                LJIILLIIL();
            }
            LIZJ().LJIILJJIL = true;
        } else {
            LIZJ().LJIILJJIL = false;
        }
        C136742cW1 c136742cW12 = this.LIZIZ;
        if (c136742cW12 != null) {
            c136742cW12.LIZ(LIZJ(), C136834cXV.LIZ(), C136834cXV.LIZJ());
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        CJPayUserInfo cJPayUserInfo;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        DialogC137460chc dialogC137460chc = this.LJJ;
        if (dialogC137460chc != null) {
            C116971W2r.LIZ(dialogC137460chc);
        }
        C136450cRJ c136450cRJ = this.LIZLLL;
        if (c136450cRJ != null) {
            c136450cRJ.m21733LJ();
        }
        EventManager.INSTANCE.unregister(this.LJJIIJ);
        C2374a.LJIIL = null;
        super.onDestroy();
        ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        if (iCJPayNormalBindCardService != null) {
            iCJPayNormalBindCardService.release();
        }
        CJPayPerformance.LIZ().LIZLLL("wallet_rd_counter_ec_enter");
        C136373cQ4 c136373cQ4 = CJPayCheckoutCounterActivity.LJIIIZ;
        if (c136373cQ4 != null && (cJPayUserInfo = c136373cQ4.user_info) != null) {
            cJPayUserInfo.real_check_type = "";
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 85).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 84).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 83).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 86).isSupported) {
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

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        C2118a LIZ2 = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (LIZ2.LIZJ != null) {
            C2118a LIZ3 = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            TTCJPayResult tTCJPayResult = LIZ3.LIZJ;
            Intrinsics.checkNotNullExpressionValue(tTCJPayResult, "");
            if (tTCJPayResult.getCode() == 106 && !PatchProxy.proxy(new Object[0], this, LIZ, false, 67).isSupported) {
                C2118a LIZ4 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                TTCJPayResult tTCJPayResult2 = LIZ4.LIZJ;
                Intrinsics.checkNotNullExpressionValue(tTCJPayResult2, "");
                String str = tTCJPayResult2.getCallBackInfo().get("service");
                C2118a LIZ5 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                TTCJPayResult tTCJPayResult3 = LIZ5.LIZJ;
                Intrinsics.checkNotNullExpressionValue(tTCJPayResult3, "");
                String str2 = tTCJPayResult3.getCallBackInfo().get(C2521l.LJIIJ);
                if (Intrinsics.areEqual("12", str) && Intrinsics.areEqual("0", str2)) {
                    C2118a.LIZ().LIZ(0);
                    LJIJJ();
                } else if (Intrinsics.areEqual("12", str) && Intrinsics.areEqual("1", str2)) {
                    C2118a.LIZ().LIZ(104);
                    LIZ(1);
                }
            }
        }
    }

    public final void LIZIZ() {
        String str;
        Object obj;
        C2324d LIZ2;
        Object obj2;
        C2324d LIZ3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported || CJPayCheckoutCounterActivity.LJIIIZ == null || (str = CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene) == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1524118967:
                if (!str.equals("Pre_Pay_Balance")) {
                    return;
                }
                if (CJPayCheckoutCounterActivity.LJIIIZ.userPayTypeInfoV2()) {
                    LIZ3 = C136736cVv.LIZIZ.LIZ(CJPayCheckoutCounterActivity.LJIIIZ.used_paytype_info);
                } else {
                    LIZ3 = C136736cVv.LIZIZ.LIZ(CJPayCheckoutCounterActivity.LJIIIZ.paytype_info, false, false);
                }
                this.LJIL = LIZ3;
                return;
            case -836325908:
                if (!str.equals("Pre_Pay_Credit")) {
                    return;
                }
                if (CJPayCheckoutCounterActivity.LJIIIZ.userPayTypeInfoV2()) {
                    C136736cVv c136736cVv = C136736cVv.LIZIZ;
                    CJPayPayInfo cJPayPayInfo = CJPayCheckoutCounterActivity.LJIIIZ.pay_info;
                    Intrinsics.checkNotNullExpressionValue(cJPayPayInfo, "");
                    this.LJIL = c136736cVv.LIZ(cJPayPayInfo, CJPayCheckoutCounterActivity.LJIIIZ.used_paytype_info);
                } else {
                    C136736cVv c136736cVv2 = C136736cVv.LIZIZ;
                    CJPayPayInfo cJPayPayInfo2 = CJPayCheckoutCounterActivity.LJIIIZ.pay_info;
                    Intrinsics.checkNotNullExpressionValue(cJPayPayInfo2, "");
                    this.LJIL = c136736cVv2.LIZ(cJPayPayInfo2);
                }
                C2324d c2324d = this.LJIL;
                if (c2324d != null) {
                    c2324d.LJIJJLI = CJPayCheckoutCounterActivity.LJIIIZ.pay_info.voucher_no_list;
                    return;
                }
                return;
            case -668293988:
                if (!str.equals("Pre_Pay_Income")) {
                    return;
                }
                this.LJIL = C136736cVv.LIZIZ.LIZIZ();
                return;
            case -234858324:
                if (!str.equals("Pre_Pay_Combine")) {
                    return;
                }
                if (CJPayCheckoutCounterActivity.LJIIIZ.userPayTypeInfoV2()) {
                    this.LJIL = C136736cVv.LIZIZ.LIZJ(CJPayCheckoutCounterActivity.LJIIIZ.used_paytype_info);
                    return;
                }
                ArrayList<CJPayCard> arrayList = CJPayCheckoutCounterActivity.LJIIIZ.paytype_info.quick_pay.cards;
                Intrinsics.checkNotNullExpressionValue(arrayList, "");
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.areEqual(((CJPayCard) obj2).bank_card_id, CJPayCheckoutCounterActivity.LJIIIZ.pay_info.bank_card_id)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                this.LJIL = C136736cVv.LIZIZ.LIZ((CJPayCard) obj2);
                return;
            case 34796480:
                if (!str.equals("Pre_Pay_PayAfterUse")) {
                    return;
                }
                this.LJIL = C136736cVv.LIZIZ.LIZ();
                return;
            case 62163359:
                if (!str.equals("Pre_Pay_BankCard")) {
                    return;
                }
                if (CJPayCheckoutCounterActivity.LJIIIZ.userPayTypeInfoV2()) {
                    LIZ2 = C136736cVv.LIZIZ.LIZIZ(CJPayCheckoutCounterActivity.LJIIIZ.used_paytype_info);
                } else {
                    ArrayList<CJPayCard> arrayList2 = CJPayCheckoutCounterActivity.LJIIIZ.paytype_info.quick_pay.cards;
                    Intrinsics.checkNotNullExpressionValue(arrayList2, "");
                    Iterator<T> it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (Intrinsics.areEqual(((CJPayCard) obj).bank_card_id, CJPayCheckoutCounterActivity.LJIIIZ.pay_info.bank_card_id)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    LIZ2 = C136736cVv.LIZIZ.LIZ(CJPayCheckoutCounterActivity.LJIIIZ.paytype_info, (CJPayCard) obj, false, false);
                }
                this.LJIL = LIZ2;
                C2324d c2324d2 = this.LJIL;
                if (c2324d2 != null) {
                    c2324d2.LJIJJLI = CJPayCheckoutCounterActivity.LJIIIZ.pay_info.voucher_no_list;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C136742cW1 c136742cW1;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported && !this.f25529LJ) {
            if (LJJIFFI() && LIZJ().getIsQueryConnecting()) {
                return;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 43);
            if (!proxy.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2375b) : ((Boolean) proxy.result).booleanValue()) {
                LJIJJLI();
            } else if (LJIJ()) {
                LJIJJLI();
            } else {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 39);
                if (!proxy2.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2315k) : ((Boolean) proxy2.result).booleanValue()) {
                    LJIIJJI();
                    return;
                }
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 40);
                if (!proxy3.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2311a) : ((Boolean) proxy3.result).booleanValue()) {
                    LJIIJJI();
                    return;
                }
                PatchProxyResult proxy4 = PatchProxy.proxy(new Object[0], this, LIZ, false, 37);
                if (!proxy4.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2314h) : ((Boolean) proxy4.result).booleanValue()) {
                    LJIIJJI();
                } else if (LJJIFFI()) {
                    LJIIJJI();
                } else {
                    PatchProxyResult proxy5 = PatchProxy.proxy(new Object[0], this, LIZ, false, 38);
                    if (!proxy5.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2316m) : ((Boolean) proxy5.result).booleanValue()) {
                        LJIIJJI();
                        return;
                    }
                    PatchProxyResult proxy6 = PatchProxy.proxy(new Object[0], this, LIZ, false, 41);
                    if (!proxy6.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2313g) : ((Boolean) proxy6.result).booleanValue()) {
                        LJIIJJI();
                        return;
                    }
                    PatchProxyResult proxy7 = PatchProxy.proxy(new Object[0], this, LIZ, false, 42);
                    if (!proxy7.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2317n) : ((Boolean) proxy7.result).booleanValue()) {
                        LJIIJJI();
                        return;
                    }
                    C136450cRJ c136450cRJ = this.LIZLLL;
                    if (c136450cRJ != null && c136450cRJ.LIZJ()) {
                        C136450cRJ c136450cRJ2 = this.LIZLLL;
                        if (c136450cRJ2 != null && !c136450cRJ2.LIZLLL()) {
                            return;
                        }
                        C136450cRJ c136450cRJ3 = this.LIZLLL;
                        if (c136450cRJ3 != null && c136450cRJ3.LIZLLL() && this.LJIIJ) {
                            if (LJIILL().LIZLLL() && (c136742cW1 = this.LIZIZ) != null) {
                                c136742cW1.LIZ(LJIILL());
                                return;
                            }
                            return;
                        }
                    }
                    C136742cW1 c136742cW12 = this.LIZIZ;
                    if (c136742cW12 != null) {
                        c136742cW12.LIZ();
                    }
                    C136742cW1 c136742cW13 = this.LIZIZ;
                    if (c136742cW13 == null || c136742cW13.LIZLLL() != 0) {
                        return;
                    }
                    C2118a.LIZ().LIZ(104);
                    LJIIJJI();
                }
            }
        }
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZIZ(String str) {
        this.LJJI = str;
    }

    private final void LIZLLL(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 65).isSupported) {
            return;
        }
        LIZ(z, this);
    }

    public final void LIZ(INormalBindCardCallback iNormalBindCardCallback) {
        if (PatchProxy.proxy(new Object[]{iNormalBindCardCallback}, this, LIZ, false, 76).isSupported) {
            return;
        }
        LIZ(true, iNormalBindCardCallback);
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public final void onBindCardResult(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 77).isSupported) {
            return;
        }
        INormalBindCardCallback.DefaultImpls.onBindCardResult(this, jSONObject);
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public final void onEntranceResult(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 70).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        runOnUiThread(new RunnableC136928cZ1(this));
    }

    private final void LIZJ(boolean z) {
        int i;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 30).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject.put("is_diff", i);
            C2118a.LIZ().LIZ("wallet_rd_client_server_fingerprint_diff", jSONObject, C136423cQs.LIZIZ.LIZ());
        } catch (Exception unused) {
        }
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 62).isSupported || !CJPayBasicUtils.isClickValid()) {
            return;
        }
        LIZLLL(z);
    }

    @Override // p003X.AbstractC136938cZB
    /* renamed from: LJ */
    public final boolean mo16033LJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 73);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        return this.LJIIJJI.containsKey(str);
    }

    @Override // p003X.AbstractC136938cZB
    public final String LJFF(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 74);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        String str2 = this.LJIIJJI.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @JvmStatic
    public static final Intent LIZ(Context context) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, LIZ, true, 80);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{context}, LJIJJLI, C136936cZ9.LIZ, false, 1);
            if (proxy2.isSupported) {
                obj = proxy2.result;
            } else {
                C106862S5w.LIZ(context);
                Intent intent = new Intent(context, CJPayFrontETCounterActivity.class);
                C136992ca3.LIZ().LIZ("cjpay_hw_foldable");
                intent.setFlags(603979776);
                return intent;
            }
        }
        return (Intent) obj;
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 69).isSupported) {
            return;
        }
        C2118a.LIZ().LIZ(104);
        LJIIJJI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0220, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0229, code lost:
        if (p003X.C136757cWG.LIZ(p003X.C136757cWG.f18084LJ, r10, null, 2, null) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022b, code lost:
        LJIILLIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022e, code lost:
        LIZIZ(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0277, code lost:
        if (getIntent() == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0279, code lost:
        r2 = getIntent().getBooleanExtra("param_is_from_insufficient_balance", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0283, code lost:
        LIZ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0247, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0249, code lost:
        r0 = com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity.LJIIIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x024b, code lost:
        if (r0 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x024d, code lost:
        r0 = r0.pay_info;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x024f, code lost:
        if (r0 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0251, code lost:
        r1 = r0.primary_pay_type;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0259, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("new_bank_card", r1) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x025c, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, "Pre_Pay_Combine") != false) goto L126;
     */
    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontETCounterActivity.onCreate(android.os.Bundle):void");
    }

    private final void LIZ(String str, AbstractC135282c8T abstractC135282c8T) {
        if (PatchProxy.proxy(new Object[]{str, abstractC135282c8T}, this, LIZ, false, 25).isSupported) {
            return;
        }
        DialogC135279c8Q dialogC135279c8Q = new DialogC135279c8Q(this, str);
        dialogC135279c8Q.LIZIZ = abstractC135282c8T;
        if (!isFinishing()) {
            C116971W2r.LIZJ(dialogC135279c8Q);
        }
    }

    private final void LIZ(boolean z, INormalBindCardCallback iNormalBindCardCallback) {
        ICJPayNormalBindCardService iCJPayNormalBindCardService;
        JSONObject json;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), iNormalBindCardCallback}, this, LIZ, false, 66).isSupported && (iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class)) != null) {
            iCJPayNormalBindCardService.setPayNewCardCallback(new C136364cPv(this));
            iCJPayNormalBindCardService.setPayTimeTrackCallback(new C136426cQv());
            ICJPayNormalBindCardService.BindCardType bindCardType = ICJPayNormalBindCardService.BindCardType.TYPE_PAY;
            NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
            if (CJPayCheckoutCounterActivity.LJIIIZ == null) {
                json = null;
            } else {
                json = CJPayCheckoutCounterActivity.LJIIIZ.process_info.toJson();
            }
            normalBindCardBean.setProcessInfo(json);
            normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.FrontPay);
            normalBindCardBean.setHostInfoJSON(CJPayHostInfo.Companion.LIZIZ(CJPayCheckoutCounterActivity.LJIIJ));
            normalBindCardBean.setSource(this.LJI);
            normalBindCardBean.setBindCardInfo(this.LJJII);
            iCJPayNormalBindCardService.startBindCardProcess(this, bindCardType, normalBindCardBean, iNormalBindCardCallback);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        r3 = r10.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        r3.LIZIZ(LJIILL(), p003X.C136834cXV.LIZ(), p003X.C136834cXV.LIZJ());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LIZ(java.lang.String r11, com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo r12, java.lang.String r13, int r14, java.lang.String r15, java.lang.String r16) {
        /*
            r10 = this;
            r0 = 6
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r4 = r11
            r3[r2] = r4
            r0 = 1
            r5 = r12
            r3[r0] = r5
            r0 = 2
            r6 = r13
            r3[r0] = r6
            r7 = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0 = 3
            r3[r0] = r1
            r0 = 4
            r8 = r15
            r3[r0] = r8
            r0 = 5
            r9 = r16
            r3[r0] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontETCounterActivity.LIZ
            r0 = 53
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r10, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L2d
            return
        L2d:
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r2 = r10.LJIILL()     // Catch: java.lang.Exception -> L57
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Exception -> L57
            r1.<init>()     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = "insufficient_show_style"
            r1.putString(r0, r4)     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = "insufficient_data"
            r1.putSerializable(r0, r5)     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = "insufficient_ext_param"
            r1.putString(r0, r6)     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = "insufficient_fragment_height"
            r1.putInt(r0, r7)     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = "insufficient_error_code"
            r1.putString(r0, r8)     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = "insufficient_error_message"
            r1.putString(r0, r9)     // Catch: java.lang.Exception -> L57
            r2.setArguments(r1)     // Catch: java.lang.Exception -> L57
        L57:
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r3 = r10.LJIILL()
            r3.LIZ(r4, r5, r6, r7, r8, r9)
            int r1 = r4.hashCode()
            r0 = -937547182(0xffffffffc81e2a52, float:-161961.28)
            if (r1 == r0) goto La1
            r0 = -645207567(0xffffffffd98ae9f1, float:-4.887596E15)
            if (r1 == r0) goto L98
            r0 = 244645484(0xe94fe6c, float:3.6729816E-30)
            if (r1 != r0) goto L8c
            java.lang.String r0 = "insufficient_style_credit_pay"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8c
        L79:
            X.cW1 r3 = r10.LIZIZ
            if (r3 == 0) goto L8c
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r2 = r10.LJIILL()
            int r1 = p003X.C136834cXV.LIZ()
            int r0 = p003X.C136834cXV.LIZJ()
            r3.LIZIZ(r2, r1, r0)
        L8c:
            X.cW1 r1 = r10.LIZIZ
            if (r1 == 0) goto L97
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r0 = r10.LJIILL()
            r1.LIZ(r0)
        L97:
            return
        L98:
            java.lang.String r0 = "insufficient_style_normal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8c
            goto L79
        La1:
            java.lang.String r0 = "insufficient_style_dialog"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8c
            X.cW1 r3 = r10.LIZIZ
            if (r3 == 0) goto L8c
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r2 = r10.LJIILL()
            int r1 = p003X.C136834cXV.LIZLLL()
            int r0 = p003X.C136834cXV.LIZLLL()
            r3.LIZIZ(r2, r1, r0)
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontETCounterActivity.LIZ(java.lang.String, com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r12.equals("CD005027") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r14.pageHeight != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        r1 = r13.msg;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        LIZ(r1, new p003X.C136920cYt(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        r3.putString("insufficient_hint_msg", r13.msg);
        r3.putInt("insufficient_fragment_height", r8);
        LJJ().setArguments(r3);
        r3 = r11.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
        r3.LIZ(LJJ(), p003X.C136834cXV.LIZ(), p003X.C136834cXV.LIZJ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
        if (r12.equals("CD005002") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.lang.String r12, com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo r13, p003X.C136530cSb r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontETCounterActivity.LIZ(java.lang.String, com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo, X.cSb, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
