package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayPayInfo;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.base.settings.bean.CJPayLoadingConfig;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayEncryptUtil;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2324d;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2312d;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2314h;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2315k;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2316m;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayProcessInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayResultPageShowConf;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserInfo;
import com.android.ttcjpaysdk.thirdparty.data.FrontPayTypeData;
import com.android.ttcjpaysdk.thirdparty.data.FrontSubPayTypeInfo;
import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2374a;
import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2375b;
import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2376c;
import com.android.ttcjpaysdk.thirdparty.front.counter.fragment.C2377d;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC135282c8T;
import p003X.AbstractC136371cQ2;
import p003X.AbstractC136388cQJ;
import p003X.AbstractC136413cQi;
import p003X.AbstractC136439cR8;
import p003X.AbstractC136441cRA;
import p003X.AbstractC136938cZB;
import p003X.AbstractC136946cZJ;
import p003X.AbstractC136947cZK;
import p003X.AbstractC136950cZN;
import p003X.AbstractC136951cZO;
import p003X.AbstractC136952cZP;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C136351cPi;
import p003X.C136359cPq;
import p003X.C136363cPu;
import p003X.C136365cPw;
import p003X.C136373cQ4;
import p003X.C136376cQ7;
import p003X.C136379cQA;
import p003X.C136423cQs;
import p003X.C136428cQx;
import p003X.C136433cR2;
import p003X.C136450cRJ;
import p003X.C136530cSb;
import p003X.C136546cSr;
import p003X.C136560cT5;
import p003X.C136567cTC;
import p003X.C136573cTI;
import p003X.C136646cUT;
import p003X.C136647cUU;
import p003X.C136721cVg;
import p003X.C136723cVi;
import p003X.C136728cVn;
import p003X.C136729cVo;
import p003X.C136731cVq;
import p003X.C136732cVr;
import p003X.C136736cVv;
import p003X.C136742cW1;
import p003X.C136752cWB;
import p003X.C136755cWE;
import p003X.C136757cWG;
import p003X.C136774cWX;
import p003X.C136777cWa;
import p003X.C136778cWb;
import p003X.C136834cXV;
import p003X.C136842cXd;
import p003X.C136851cXm;
import p003X.C136868cY3;
import p003X.C136875cYA;
import p003X.C136876cYB;
import p003X.C136887cYM;
import p003X.C136921cYu;
import p003X.C136937cZA;
import p003X.C136992ca3;
import p003X.DialogC135279c8Q;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.RunnableC136840cXb;
import p003X.RunnableC136848cXj;
import p003X.RunnableC136911cYk;
import p003X.RunnableC136929cZ2;

/* loaded from: classes17.dex */
public final class CJPayFrontStandardCounterActivity extends BaseActivity implements INormalBindCardCallback, AbstractC136371cQ2, AbstractC136938cZB, AbstractC136952cZP {
    public static ChangeQuickRedirect LIZ;
    public static final C136937cZA LJIJ = new C136937cZA((byte) 0);
    public C136742cW1 LIZIZ;
    public CJPayTextLoadingView LIZJ;
    public C136450cRJ LIZLLL;
    public C136546cSr LJII;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public CJPayInsufficientBalanceHintInfo LJIIL;
    public boolean LJIILIIL;
    public C2324d LJIJI;
    public DialogC137460chc LJIJJ;
    public ViewGroup LJIL;
    public String LJIJJLI = "";

    /* renamed from: LJ */
    public String f25530LJ = "";
    public String LJFF = "";
    public String LJJ = "";
    public boolean LJI = true;
    public String LJIIIIZZ = "";
    public HashMap<String, String> LJIIJJI = new HashMap<>();
    public final AbstractC2126a LJJI = new C136732cVr(this);
    public final Lazy LJJIFFI = LazyKt__LazyJVMKt.lazy(new CJPayFrontStandardCounterActivity$completeFragment$2(this));
    public final Lazy LJJII = LazyKt__LazyJVMKt.lazy(new CJPayFrontStandardCounterActivity$newCompleteFragment$2(this));
    public final Lazy LJJIII = LazyKt__LazyJVMKt.lazy(CJPayFrontStandardCounterActivity$fingerprintGuideFragment$2.INSTANCE);
    public final Lazy LJJIIJ = LazyKt__LazyJVMKt.lazy(CJPayFrontStandardCounterActivity$preBioGuideFragment$2.INSTANCE);
    public final Lazy LJJIIJZLJL = LazyKt__LazyJVMKt.lazy(CJPayFrontStandardCounterActivity$passwordFreeGuideFragment$2.INSTANCE);
    public final Lazy LJJIIZ = LazyKt__LazyJVMKt.lazy(new CJPayFrontStandardCounterActivity$insufficientBalanceFragment$2(this));
    public final Lazy LJJIIZI = LazyKt__LazyJVMKt.lazy(new CJPayFrontStandardCounterActivity$frontMethodFragment$2(this));
    public final Lazy LJJIJ = LazyKt__LazyJVMKt.lazy(new C2368x87051895(this));
    public final C136359cPq LJJIJIIJI = new C136359cPq(this);
    public final C136363cPu LJJIJIIJIL = new C136363cPu(this);
    public final C136573cTI LJJIJIL = new C136573cTI();
    public final AbstractC136388cQJ LJJIJL = C136851cXm.LIZIZ;
    public final C136887cYM LJJIJLIJ = new C136887cYM();
    public final C136351cPi LJJIL = new C136351cPi();
    public final AbstractC136441cRA LJJIZ = C136376cQ7.LIZIZ;
    public final C136379cQA LJJJ = new C136379cQA();
    public final AbstractC136439cR8 LJJJI = C136868cY3.LIZIZ;
    public final C136433cR2 LJJJIL = new C136433cR2(this);
    public final C136723cVi LJJJJ = new C136723cVi();
    public final AbstractC136413cQi LJJJJI = C136875cYA.LIZIZ;
    public final AbstractC136946cZJ LJIILJJIL = new C136755cWE(this);
    public final AbstractC136950cZN LJIILL = new C136774cWX(this);
    public final AbstractC136947cZK LJIILLIIL = new C136752cWB(this);
    public final AbstractC136951cZO LJIIZILJ = new C136876cYB(this);

    static {
        Covode.recordClassIndex(8563);
    }

    private final C2375b LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        return (C2375b) (proxy.isSupported ? proxy.result : this.LJJIIZ.mo27335getValue());
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZ(int i, int i2, boolean z) {
    }

    public final C2374a LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        return (C2374a) (proxy.isSupported ? proxy.result : this.LJJIFFI.mo27335getValue());
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136809cX6
    public final int LIZLLL(String str) {
        return -1;
    }

    /* renamed from: LJ */
    public final C2312d m16034LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        return (C2312d) (proxy.isSupported ? proxy.result : this.LJJII.mo27335getValue());
    }

    @Override // p003X.AbstractC136371cQ2
    public final int LJI() {
        return -1;
    }

    public final C2314h LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return (C2314h) (proxy.isSupported ? proxy.result : this.LJJIII.mo27335getValue());
    }

    public final C2316m LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        return (C2316m) (proxy.isSupported ? proxy.result : this.LJJIIJ.mo27335getValue());
    }

    public final C2315k LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        return (C2315k) (proxy.isSupported ? proxy.result : this.LJJIIJZLJL.mo27335getValue());
    }

    public final C2376c LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        return (C2376c) (proxy.isSupported ? proxy.result : this.LJJIIZI.mo27335getValue());
    }

    public final C2377d LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        return (C2377d) (proxy.isSupported ? proxy.result : this.LJJIJ.mo27335getValue());
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final int getLayout() {
        return 2131690552;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 83).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 82).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractC136371cQ2
    public final String LJFF() {
        return this.LJIJJLI;
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : CJPayCheckoutCounterActivity.LJIIIZ != null && Intrinsics.areEqual(CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene, "Pre_Pay_PayAfterUse");
    }

    public final void LIZ(String str, CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo, C136530cSb c136530cSb, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, cJPayInsufficientBalanceHintInfo, c136530cSb, str2, str3, str4}, this, LIZ, false, 22).isSupported) {
            return;
        }
        if (c136530cSb.pageHeight < 0) {
            LJIJI();
            return;
        }
        int i = c136530cSb.pageHeight;
        Bundle bundle = new Bundle();
        int hashCode = str.hashCode();
        if (hashCode == -1849928834) {
            if (str.equals("CD005002")) {
                if (c136530cSb.pageHeight == 0) {
                    String str5 = cJPayInsufficientBalanceHintInfo.msg;
                    Intrinsics.checkNotNullExpressionValue(str5, "");
                    LIZ(str5, new C136921cYu(this));
                    return;
                }
                bundle.putString("insufficient_hint_msg", cJPayInsufficientBalanceHintInfo.msg);
                bundle.putInt("insufficient_fragment_height", i);
                LJIJJ().setArguments(bundle);
                C136742cW1 c136742cW1 = this.LIZIZ;
                if (c136742cW1 == null) {
                    return;
                }
                c136742cW1.LIZ(LJIJJ(), C136834cXV.LIZ(), C136834cXV.LIZJ());
                return;
            }
        } else if (hashCode == -1849928828 && str.equals("CD005008")) {
            this.LJIIJ = true;
            Boolean isServerControl = cJPayInsufficientBalanceHintInfo.isServerControl();
            Intrinsics.checkNotNullExpressionValue(isServerControl, "");
            if (isServerControl.booleanValue()) {
                LIZ(C2377d.LJIJ.LIZ(cJPayInsufficientBalanceHintInfo), cJPayInsufficientBalanceHintInfo, str2, i, str3, str4);
                return;
            } else if (c136530cSb.pageHeight == 0) {
                if (this.LJIIIZ) {
                    LIZ("insufficient_style_normal", cJPayInsufficientBalanceHintInfo, str2, i, str3, str4);
                    return;
                } else {
                    LIZ("insufficient_style_dialog", cJPayInsufficientBalanceHintInfo, str2, i, str3, str4);
                    return;
                }
            } else {
                LIZ("insufficient_style_normal", cJPayInsufficientBalanceHintInfo, str2, i, str3, str4);
                this.LJIIIZ = true;
                return;
            }
        }
        C2118a.LIZ().LIZ(102);
        LJIIJJI();
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 25).isSupported) {
            return;
        }
        Boolean bool = null;
        if (z) {
            C2377d LJIILIIL = LJIILIIL();
            if (LJIILIIL != null) {
                bool = Boolean.valueOf(LJIILIIL.LIZLLL());
            }
            if (bool.booleanValue()) {
                LJIILIIL().LIZ(1);
                return;
            } else {
                LJIILIIL().LIZ(3);
                return;
            }
        }
        C2377d LJIILIIL2 = LJIILIIL();
        if (LJIILIIL2 != null) {
            bool = Boolean.valueOf(LJIILIIL2.LIZLLL());
        }
        if (bool.booleanValue()) {
            LJIILIIL().LIZ(1, false);
        } else {
            LJIILIIL().LIZ(3, false);
        }
    }

    private final void LIZ(JSONObject... jSONObjectArr) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{jSONObjectArr}, this, LIZ, false, 54).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        do {
            LIZ(jSONObjectArr[i], jSONObject);
            i++;
        } while (i < 2);
        hashMap.put("front_standard_data", jSONObject.toString());
        C2118a.LIZ().LIZ(hashMap);
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 69).isSupported) {
            return;
        }
        C2118a.LIZ().LIZ(104);
        LJIIJJI();
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
        this.LJJ = C136647cUU.LIZIZ.LIZ(str, str2, str3);
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9, p003X.AbstractC136809cX6
    public final C2324d LIZLLL() {
        return this.LJIJI;
    }

    private final void LJJ() {
        C136450cRJ c136450cRJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 44).isSupported && (c136450cRJ = this.LIZLLL) != null) {
            int i = C136450cRJ.LJIIZILJ;
            int i2 = C136450cRJ.LJIJ;
            c136450cRJ.LIZ(i, i2, i2, false);
        }
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 56).isSupported) {
            return;
        }
        LIZ(0L);
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 64).isSupported) {
            return;
        }
        LJIJI();
    }

    public final void LJIILJJIL() {
        CJPayTextLoadingView cJPayTextLoadingView;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported && (cJPayTextLoadingView = this.LIZJ) != null) {
            cJPayTextLoadingView.show();
        }
    }

    public final void LJIILL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            return;
        }
        C136757cWG.f18084LJ.LIZ();
        CJPayTextLoadingView cJPayTextLoadingView = this.LIZJ;
        if (cJPayTextLoadingView != null) {
            cJPayTextLoadingView.hide();
        }
    }

    public final void LJIJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 62).isSupported) {
            return;
        }
        C2118a.LIZ().LIZ(113);
        LJIIJJI();
    }

    private final boolean LJIJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(2131170157);
        if (C136428cQx.LIZIZ()) {
            if (findFragmentById instanceof C2312d) {
                return true;
            }
        } else if (findFragmentById instanceof C2374a) {
            return true;
        }
        return false;
    }

    private final void LJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported) {
            return;
        }
        if (LJJIII()) {
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

    private final void LJJIFFI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported) {
            return;
        }
        if (LJJIII()) {
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
            int i4 = C136450cRJ.LJIJI;
            c136450cRJ2.LIZ(i3, i4, i4, false);
        }
    }

    private final void LJJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 47).isSupported) {
            return;
        }
        if (LJJIII()) {
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

    private final boolean LJJIII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 53);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C136428cQx.LIZJ()) {
            return false;
        }
        if ((LJIILLIIL() && !LJIILIIL().LIZLLL()) || LJIIZILJ()) {
            return false;
        }
        return true;
    }

    private final void LJJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 58).isSupported) {
            return;
        }
        LIZ(LJJIIJZLJL(), LJJIIZ());
        C2118a.LIZ().LIZIZ();
    }

    public final boolean LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 39);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(getSupportFragmentManager().findFragmentById(2131170157) instanceof C2377d)) {
            return false;
        }
        return true;
    }

    public final boolean LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 40);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(getSupportFragmentManager().findFragmentById(2131170157) instanceof C2376c)) {
            return false;
        }
        return true;
    }

    private final void LJJI() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 45).isSupported) {
            return;
        }
        if (LJJIII()) {
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

    private final JSONObject LJJIIJZLJL() {
        String str;
        String str2;
        CJPayTradeInfo cJPayTradeInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 59);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
            if (proxy2.isSupported) {
                str = (String) proxy2.result;
            } else {
                if (!C136428cQx.LIZLLL()) {
                    C136373cQ4 c136373cQ4 = CJPayCheckoutCounterActivity.LJIIIZ;
                    if (c136373cQ4 == null || (cJPayTradeInfo = c136373cQ4.trade_info) == null || (str2 = cJPayTradeInfo.trade_no) == null) {
                        str2 = "";
                    }
                    String md5Encrypt = CJPayEncryptUtil.md5Encrypt(str2);
                    C136560cT5 c136560cT5 = C136560cT5.LIZJ;
                    Intrinsics.checkNotNullExpressionValue(md5Encrypt, "");
                    if (c136560cT5.LIZ(md5Encrypt)) {
                        str = "0";
                    }
                }
                str = "1";
            }
            jSONObject.put("has_sdk_show_retain", str);
            return jSONObject;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    private final JSONObject LJJIIZ() {
        FrontSubPayTypeInfo frontSubPayTypeInfo;
        FrontPayTypeData frontPayTypeData;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 60);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        String str = null;
        if (!this.LJIIJJI.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("current_card_list", LJJIIZI());
                    CJPayInsufficientBalanceHintInfo cJPayInsufficientBalanceHintInfo = this.LJIIL;
                    if (cJPayInsufficientBalanceHintInfo != null && (frontSubPayTypeInfo = cJPayInsufficientBalanceHintInfo.rec_pay_type) != null && (frontPayTypeData = frontSubPayTypeInfo.pay_type_data) != null) {
                        str = frontPayTypeData.bank_card_id;
                    }
                    jSONObject.put("recommend_card_id", str);
                } catch (Exception unused) {
                }
                return jSONObject;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    private final JSONArray LJJIIZI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 63);
        if (proxy.isSupported) {
            return (JSONArray) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<String, String> entry : this.LJIIJJI.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("card_id", entry.getKey());
                jSONObject.put("msg", entry.getValue());
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        CJPayUserInfo cJPayUserInfo;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        DialogC137460chc dialogC137460chc = this.LJIJJ;
        if (dialogC137460chc != null) {
            C116971W2r.LIZ(dialogC137460chc);
        }
        C136450cRJ c136450cRJ = this.LIZLLL;
        if (c136450cRJ != null) {
            c136450cRJ.m21733LJ();
        }
        EventManager.INSTANCE.unregister(this.LJJI);
        C2374a.LJIIL = null;
        C2312d.f25514LJ = null;
        C136428cQx.m21736LJ();
        super.onDestroy();
        ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        if (iCJPayNormalBindCardService != null) {
            iCJPayNormalBindCardService.release();
        }
        C136373cQ4 c136373cQ4 = CJPayCheckoutCounterActivity.LJIIIZ;
        if (c136373cQ4 != null && (cJPayUserInfo = c136373cQ4.user_info) != null) {
            cJPayUserInfo.real_check_type = "";
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 86).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 85).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 84).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 87).isSupported) {
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

    public final void LJIJ() {
        C136742cW1 c136742cW1;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 48).isSupported) {
            return;
        }
        if (C136428cQx.LIZIZ()) {
            m16034LJ().LJIILJJIL = this.LJIIJ;
            this.LJIIJ = false;
            C136742cW1 c136742cW12 = this.LIZIZ;
            if (c136742cW12 != null) {
                c136742cW12.LIZ(m16034LJ(), C136834cXV.LIZ(), C136834cXV.LIZJ());
                return;
            }
            return;
        }
        LIZJ().LJIILLIIL = this.LJIIJ;
        this.LJIIJ = false;
        C136450cRJ c136450cRJ = this.LIZLLL;
        if (c136450cRJ != null && c136450cRJ.LIZLLL() && (c136742cW1 = this.LIZIZ) != null && c136742cW1.LIZLLL() == 0) {
            if (CJPayCheckoutCounterActivity.LJIIIZ != null && Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, CJPayCheckoutCounterActivity.LJIIIZ.user_info.pwd_check_way)) {
                C136450cRJ c136450cRJ2 = this.LIZLLL;
                if (c136450cRJ2 != null && c136450cRJ2.LJIJJLI) {
                    CJPayTextLoadingView cJPayTextLoadingView = this.LIZJ;
                    if (cJPayTextLoadingView != null) {
                        cJPayTextLoadingView.setPayMessage("支付中");
                    }
                    LJIILJJIL();
                }
            } else {
                LJIILJJIL();
            }
            LIZJ().LJIILJJIL = true;
        } else {
            LIZJ().LJIILJJIL = false;
        }
        C136742cW1 c136742cW13 = this.LIZIZ;
        if (c136742cW13 != null) {
            c136742cW13.LIZ(LIZJ(), C136834cXV.LIZ(), C136834cXV.LIZJ());
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
                    LJIJ();
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
                this.LJIJI = LIZ3;
                return;
            case -836325908:
                if (!str.equals("Pre_Pay_Credit")) {
                    return;
                }
                if (CJPayCheckoutCounterActivity.LJIIIZ.userPayTypeInfoV2()) {
                    C136736cVv c136736cVv = C136736cVv.LIZIZ;
                    CJPayPayInfo cJPayPayInfo = CJPayCheckoutCounterActivity.LJIIIZ.pay_info;
                    Intrinsics.checkNotNullExpressionValue(cJPayPayInfo, "");
                    this.LJIJI = c136736cVv.LIZ(cJPayPayInfo, CJPayCheckoutCounterActivity.LJIIIZ.used_paytype_info);
                } else {
                    C136736cVv c136736cVv2 = C136736cVv.LIZIZ;
                    CJPayPayInfo cJPayPayInfo2 = CJPayCheckoutCounterActivity.LJIIIZ.pay_info;
                    Intrinsics.checkNotNullExpressionValue(cJPayPayInfo2, "");
                    this.LJIJI = c136736cVv2.LIZ(cJPayPayInfo2);
                }
                C2324d c2324d = this.LJIJI;
                if (c2324d != null) {
                    c2324d.LJIJJLI = CJPayCheckoutCounterActivity.LJIIIZ.pay_info.voucher_no_list;
                    return;
                }
                return;
            case -668293988:
                if (!str.equals("Pre_Pay_Income")) {
                    return;
                }
                this.LJIJI = C136736cVv.LIZIZ.LIZIZ();
                return;
            case -234858324:
                if (!str.equals("Pre_Pay_Combine")) {
                    return;
                }
                if (CJPayCheckoutCounterActivity.LJIIIZ.userPayTypeInfoV2()) {
                    this.LJIJI = C136736cVv.LIZIZ.LIZJ(CJPayCheckoutCounterActivity.LJIIIZ.used_paytype_info);
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
                this.LJIJI = C136736cVv.LIZIZ.LIZ((CJPayCard) obj2);
                return;
            case 34796480:
                if (!str.equals("Pre_Pay_PayAfterUse")) {
                    return;
                }
                this.LJIJI = C136736cVv.LIZIZ.LIZ();
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
                this.LJIJI = LIZ2;
                C2324d c2324d2 = this.LJIJI;
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
        boolean isQueryConnecting;
        boolean z;
        C136742cW1 c136742cW1;
        int i;
        CJPayResultPageShowConf cJPayResultPageShowConf;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        if (C136428cQx.LIZIZ()) {
            isQueryConnecting = m16034LJ().getIsQueryConnecting();
        } else {
            isQueryConnecting = LIZJ().getIsQueryConnecting();
        }
        if (!isQueryConnecting) {
            LJIJJLI();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 38);
            if (!proxy.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2375b) : ((Boolean) proxy.result).booleanValue()) {
                C136742cW1 c136742cW12 = this.LIZIZ;
                if (c136742cW12 != null) {
                    c136742cW12.LIZ();
                }
                LJIJI();
            } else if (LJIILLIIL()) {
                C136742cW1 c136742cW13 = this.LIZIZ;
                if (c136742cW13 != null) {
                    c136742cW13.LIZ();
                }
                LJIJI();
            } else {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 37);
                if (proxy2.isSupported) {
                    z = ((Boolean) proxy2.result).booleanValue();
                } else if (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2315k) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (C136428cQx.LIZIZ()) {
                        C136742cW1 c136742cW14 = this.LIZIZ;
                        if (c136742cW14 != null) {
                            c136742cW14.LIZ();
                            return;
                        }
                        return;
                    }
                    LIZ(200L);
                    return;
                }
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 35);
                if (!proxy3.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2314h) : ((Boolean) proxy3.result).booleanValue()) {
                    if (C136428cQx.LIZIZ()) {
                        C136742cW1 c136742cW15 = this.LIZIZ;
                        if (c136742cW15 != null) {
                            c136742cW15.LIZ();
                        }
                        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = C2312d.f25514LJ;
                        if (cJPayCounterTradeQueryResponseBean != null && (cJPayResultPageShowConf = cJPayCounterTradeQueryResponseBean.result_page_show_conf) != null) {
                            i = cJPayResultPageShowConf.remain_time;
                        } else {
                            i = -1;
                        }
                        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 42).isSupported && i > 0) {
                            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC136911cYk(this), i * 1000);
                            return;
                        }
                        return;
                    }
                    LIZ(200L);
                    return;
                }
                PatchProxyResult proxy4 = PatchProxy.proxy(new Object[0], this, LIZ, false, 36);
                if (!proxy4.isSupported ? (getSupportFragmentManager().findFragmentById(2131170157) instanceof C2316m) : ((Boolean) proxy4.result).booleanValue()) {
                    if (C136428cQx.LIZIZ()) {
                        C136742cW1 c136742cW16 = this.LIZIZ;
                        if (c136742cW16 != null) {
                            c136742cW16.LIZ();
                            return;
                        }
                        return;
                    }
                    LIZ(200L);
                } else if (LJIJJLI()) {
                    LIZ(200L);
                } else {
                    C136450cRJ c136450cRJ = this.LIZLLL;
                    if (c136450cRJ != null && c136450cRJ.LIZJ()) {
                        C136450cRJ c136450cRJ2 = this.LIZLLL;
                        if (c136450cRJ2 != null && !c136450cRJ2.LIZLLL()) {
                            return;
                        }
                        C136450cRJ c136450cRJ3 = this.LIZLLL;
                        if (c136450cRJ3 != null && c136450cRJ3.LIZLLL() && this.LJIIJ) {
                            if (LJIILIIL().LIZLLL() && (c136742cW1 = this.LIZIZ) != null) {
                                c136742cW1.LIZ(LJIILIIL());
                                return;
                            }
                            return;
                        }
                    }
                    C136742cW1 c136742cW17 = this.LIZIZ;
                    if (c136742cW17 != null) {
                        c136742cW17.LIZ();
                    }
                    C136742cW1 c136742cW18 = this.LIZIZ;
                    if (c136742cW18 != null && c136742cW18.LIZLLL() == 0) {
                        C2118a.LIZ().LIZ(104);
                        LJIIJJI();
                    }
                }
            }
        }
    }

    @Override // p003X.AbstractC136371cQ2
    public final void LIZIZ(String str) {
        this.LJIJJLI = str;
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
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 78).isSupported) {
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
        runOnUiThread(new RunnableC136929cZ2(this));
    }

    @JvmStatic
    public static final Intent LIZ(Context context) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, LIZ, true, 81);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{context}, LJIJ, C136937cZA.LIZ, false, 1);
            if (proxy2.isSupported) {
                obj = proxy2.result;
            } else {
                C106862S5w.LIZ(context);
                Intent intent = new Intent(context, CJPayFrontStandardCounterActivity.class);
                intent.setFlags(603979776);
                return intent;
            }
        }
        return (Intent) obj;
    }

    @Override // p003X.AbstractC136371cQ2, p003X.AbstractC136812cX9
    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 61).isSupported || !CJPayBasicUtils.isClickValid()) {
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

    private void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 57).isSupported) {
            return;
        }
        LJJIIJ();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new RunnableC136840cXb(this), j);
        handler.postDelayed(new RunnableC136848cXj(this), j + 300);
    }

    public final void LIZJ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 27).isSupported && CJPayCheckoutCounterActivity.LJIIIZ != null && CJPayBasicUtils.isClickValid()) {
            if (CJPayCheckoutCounterActivity.LJIIIZ.need_resign_card) {
                LJJI();
                return;
            }
            this.LJIILIIL = z;
            String str = CJPayCheckoutCounterActivity.LJIIIZ.user_info.pwd_check_way;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 48) {
                    if (hashCode != 49) {
                        if (hashCode != 51) {
                            if (hashCode == 53 && str.equals("5")) {
                                C136757cWG.f18084LJ.LIZ();
                                LJJ();
                            }
                        } else if (str.equals(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START)) {
                            LJJIFFI();
                        }
                    } else if (str.equals("1")) {
                        ICJPayFingerprintService iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
                        if (iCJPayFingerprintService != null && iCJPayFingerprintService.isLocalEnableFingerprint(this, CJPayCheckoutCounterActivity.LJIIIZ.user_info.uid, true)) {
                            LJJII();
                        } else {
                            LJIL();
                        }
                    }
                } else if (str.equals("0")) {
                    LJIL();
                }
            }
            try {
                C2118a.LIZ().LIZ("wallet_cashier_confirm_pswd_type_sdk", C136423cQs.LIZIZ.LIZ());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C136646cUT c136646cUT;
        String str;
        CJPayUserInfo cJPayUserInfo;
        CJPayPayInfo cJPayPayInfo;
        String str2;
        CJPayTradeInfo cJPayTradeInfo;
        ViewGroup viewGroup;
        MethodCollector.m14708i(523);
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(523);
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 4).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            C136992ca3 LIZ2 = C136992ca3.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            CJPayLoadingConfig LJIIJJI = LIZ2.LJIIJJI();
            if (LJIIJJI != null && LJIIJJI.is_ecommerce_douyin_loading_auto_close) {
                C136757cWG.f18084LJ.LIZ();
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
            getWindow().setSoftInputMode(3);
            int i = Build.VERSION.SDK_INT;
            getWindow().addFlags(Integer.MIN_VALUE);
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "");
            window.setStatusBarColor(CastProtectorUtils.parseColor("#00000000"));
            Window window2 = getWindow();
            Intrinsics.checkNotNullExpressionValue(window2, "");
            View decorView = window2.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "");
            decorView.setSystemUiVisibility(9216);
        }
        setHalfTranslucent();
        this.LJIL = (ViewGroup) findViewById(2131170063);
        ViewGroup viewGroup2 = this.LJIL;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(null);
        }
        if (C136428cQx.LIZJ() && (viewGroup = this.LJIL) != null) {
            viewGroup.setBackgroundColor(CastProtectorUtils.parseColor("#00000000"));
        }
        this.LIZJ = (CJPayTextLoadingView) findViewById(2131165239);
        this.LIZIZ = new C136742cW1(this, 2131170157);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && C136428cQx.LIZLLL()) {
            C136373cQ4 c136373cQ4 = CJPayCheckoutCounterActivity.LJIIIZ;
            if (c136373cQ4 == null || (cJPayTradeInfo = c136373cQ4.trade_info) == null || (str2 = cJPayTradeInfo.trade_no) == null) {
                str2 = "";
            }
            String md5Encrypt = CJPayEncryptUtil.md5Encrypt(str2);
            C136560cT5 c136560cT5 = C136560cT5.LIZJ;
            Intrinsics.checkNotNullExpressionValue(md5Encrypt, "");
            c136560cT5.LIZIZ(md5Encrypt);
        }
        LIZIZ();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
                this.LJII = new C136546cSr();
                C136546cSr c136546cSr = this.LJII;
                if (c136546cSr != null) {
                    c136546cSr.LIZ = true;
                }
                C136546cSr c136546cSr2 = this.LJII;
                if (c136546cSr2 != null) {
                    c136546cSr2.LIZIZ = true;
                }
                C136546cSr c136546cSr3 = this.LJII;
                if (c136546cSr3 != null) {
                    C136373cQ4 c136373cQ42 = CJPayCheckoutCounterActivity.LJIIIZ;
                    if (c136373cQ42 != null) {
                        cJPayPayInfo = c136373cQ42.pay_info;
                    } else {
                        cJPayPayInfo = null;
                    }
                    c136546cSr3.LJFF = cJPayPayInfo;
                }
                C136546cSr c136546cSr4 = this.LJII;
                if (c136546cSr4 != null) {
                    C136373cQ4 c136373cQ43 = CJPayCheckoutCounterActivity.LJIIIZ;
                    if (c136373cQ43 != null && (cJPayUserInfo = c136373cQ43.user_info) != null) {
                        str = cJPayUserInfo.pwd_check_way;
                    } else {
                        str = null;
                    }
                    c136546cSr4.LIZLLL = Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, str);
                }
                C136546cSr c136546cSr5 = this.LJII;
                if (c136546cSr5 != null) {
                    c136546cSr5.LJI = this.LJJIJIIJI;
                }
                C136546cSr c136546cSr6 = this.LJII;
                if (c136546cSr6 != null) {
                    c136546cSr6.LJII = this.LJJJ;
                }
                C136546cSr c136546cSr7 = this.LJII;
                if (c136546cSr7 != null) {
                    c136546cSr7.LJIIIIZZ = this.LJJIJL;
                }
                C136546cSr c136546cSr8 = this.LJII;
                if (c136546cSr8 != null) {
                    c136546cSr8.LJIIIZ = this.LJJIJLIJ;
                }
                C136546cSr c136546cSr9 = this.LJII;
                if (c136546cSr9 != null) {
                    c136546cSr9.LJIIJ = this.LJJIL;
                }
                C136546cSr c136546cSr10 = this.LJII;
                if (c136546cSr10 != null) {
                    c136546cSr10.LJIIJJI = this.LJJIZ;
                }
                C136546cSr c136546cSr11 = this.LJII;
                if (c136546cSr11 != null) {
                    c136546cSr11.LJIIL = this.LJJJI;
                }
                C136546cSr c136546cSr12 = this.LJII;
                if (c136546cSr12 != null) {
                    c136546cSr12.LJIILJJIL = this.LJJJJI;
                }
                C136546cSr c136546cSr13 = this.LJII;
                if (c136546cSr13 != null) {
                    c136546cSr13.LJIJ = this.LJJIJIIJIL;
                }
                C136546cSr c136546cSr14 = this.LJII;
                if (c136546cSr14 != null) {
                    c136546cSr14.LJIILL = this.LJJIJIL;
                }
                C136546cSr c136546cSr15 = this.LJII;
                if (c136546cSr15 != null) {
                    C136373cQ4 c136373cQ44 = CJPayCheckoutCounterActivity.LJIIIZ;
                    if (c136373cQ44 != null) {
                        c136646cUT = c136373cQ44.pre_bio_guide_info;
                    } else {
                        c136646cUT = null;
                    }
                    c136546cSr15.LJIJJ = c136646cUT;
                }
                C136546cSr c136546cSr16 = this.LJII;
                if (c136546cSr16 != null) {
                    c136546cSr16.LJIILIIL = this.LJJJIL;
                }
                C136546cSr c136546cSr17 = this.LJII;
                if (c136546cSr17 != null) {
                    c136546cSr17.LJIJJLI = this.LJJJJ;
                }
            }
            this.LIZLLL = new C136450cRJ(this, 2131170157, this.LJII);
            C136450cRJ c136450cRJ = this.LIZLLL;
            if (c136450cRJ != null) {
                c136450cRJ.LIZLLL = new C136731cVq(this);
            }
            C136450cRJ c136450cRJ2 = this.LIZLLL;
            if (c136450cRJ2 != null) {
                c136450cRJ2.LJFF = new C136721cVg(this);
            }
            C136450cRJ c136450cRJ3 = this.LIZLLL;
            if (c136450cRJ3 != null) {
                c136450cRJ3.LJI = new C136567cTC(this);
            }
            C136450cRJ c136450cRJ4 = this.LIZLLL;
            if (c136450cRJ4 != null) {
                c136450cRJ4.LJII = new C136729cVo(this);
            }
            C136450cRJ c136450cRJ5 = this.LIZLLL;
            if (c136450cRJ5 != null) {
                c136450cRJ5.LJIIIIZZ = new C136728cVn(this);
            }
            C136450cRJ c136450cRJ6 = this.LIZLLL;
            if (c136450cRJ6 != null) {
                c136450cRJ6.LJIIIZ = C136842cXd.LIZIZ;
            }
        }
        this.LJFF = getIntent().getStringExtra("param_source");
        this.LJJ = getIntent().getStringExtra("param_bind_card_info");
        this.LJI = getIntent().getBooleanExtra("param_close_webview", true);
        if (CJPayCheckoutCounterActivity.LJIIIZ != null && Intrinsics.areEqual(CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene, "Pre_Pay_NewCard")) {
            if (!C136757cWG.LIZ(C136757cWG.f18084LJ, this, null, 2, null)) {
                LJIILJJIL();
            }
            LIZIZ(false);
        } else if (LIZ() && !CJPayCheckoutCounterActivity.LJIIIZ.user_info.has_signed_cards) {
            if (!C136757cWG.LIZ(C136757cWG.f18084LJ, this, null, 2, null)) {
                LJIILJJIL();
            }
            LIZIZ(false);
        } else {
            if (getIntent() != null) {
                z = getIntent().getBooleanExtra("param_is_from_insufficient_balance", false);
            }
            LIZJ(z);
        }
        EventManager.INSTANCE.register(this.LJJI);
        MethodCollector.m14707o(523);
    }

    private final void LIZ(String str, AbstractC135282c8T abstractC135282c8T) {
        if (PatchProxy.proxy(new Object[]{str, abstractC135282c8T}, this, LIZ, false, 23).isSupported) {
            return;
        }
        DialogC135279c8Q dialogC135279c8Q = new DialogC135279c8Q(this, str);
        dialogC135279c8Q.LIZIZ = abstractC135282c8T;
        if (!isFinishing()) {
            C116971W2r.LIZJ(dialogC135279c8Q);
        }
    }

    private final void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{jSONObject, jSONObject2}, this, LIZ, false, 55).isSupported || jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private final void LIZ(boolean z, INormalBindCardCallback iNormalBindCardCallback) {
        ICJPayNormalBindCardService iCJPayNormalBindCardService;
        JSONObject jSONObject;
        CJPayProcessInfo cJPayProcessInfo;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), iNormalBindCardCallback}, this, LIZ, false, 66).isSupported && (iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class)) != null) {
            iCJPayNormalBindCardService.setPayNewCardCallback(new C136365cPw(this));
            ICJPayNormalBindCardService.BindCardType bindCardType = ICJPayNormalBindCardService.BindCardType.TYPE_PAY;
            NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
            C136373cQ4 c136373cQ4 = CJPayCheckoutCounterActivity.LJIIIZ;
            if (c136373cQ4 != null && (cJPayProcessInfo = c136373cQ4.process_info) != null) {
                jSONObject = cJPayProcessInfo.toJson();
            } else {
                jSONObject = null;
            }
            normalBindCardBean.setProcessInfo(jSONObject);
            normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.FrontPay);
            normalBindCardBean.setHostInfoJSON(CJPayHostInfo.Companion.LIZIZ(CJPayCheckoutCounterActivity.LJIIJ));
            normalBindCardBean.setSource(this.LJFF);
            normalBindCardBean.setBindCardInfo(this.LJJ);
            iCJPayNormalBindCardService.startBindCardProcess(this, bindCardType, normalBindCardBean, iNormalBindCardCallback);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
        r3 = r12.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
        r3.LIZIZ(LJIILIIL(), p003X.C136834cXV.LIZ(), p003X.C136834cXV.LIZJ());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LIZ(java.lang.String r13, com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo r14, java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18) {
        /*
            r12 = this;
            r4 = r12
            r0 = 6
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r6 = r13
            r3[r2] = r6
            r0 = 1
            r7 = r14
            r3[r0] = r7
            r0 = 2
            r8 = r15
            r3[r0] = r8
            r9 = r16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = 3
            r3[r0] = r1
            r0 = 4
            r10 = r17
            r3[r0] = r10
            r0 = 5
            r11 = r18
            r3[r0] = r11
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontStandardCounterActivity.LIZ
            r0 = 49
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r12, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L30
            return
        L30:
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r3 = r12.LJIILIIL()     // Catch: java.lang.Exception -> L61
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Exception -> L61
            r2.<init>()     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "insufficient_show_style"
            r2.putString(r0, r6)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "insufficient_data"
            r2.putSerializable(r0, r7)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "insufficient_ext_param"
            r2.putString(r0, r8)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "insufficient_fragment_height"
            r2.putInt(r0, r9)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "insufficient_error_code"
            r2.putString(r0, r10)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "insufficient_error_message"
            r2.putString(r0, r11)     // Catch: java.lang.Exception -> L61
            java.lang.String r1 = "insufficient_show_mask"
            java.lang.String r0 = "1"
            r2.putString(r1, r0)     // Catch: java.lang.Exception -> L61
            r3.setArguments(r2)     // Catch: java.lang.Exception -> L61
        L61:
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r5 = r12.LJIILIIL()
            r5.LIZ(r6, r7, r8, r9, r10, r11)
            int r1 = r6.hashCode()
            r0 = -937547182(0xffffffffc81e2a52, float:-161961.28)
            if (r1 == r0) goto Lab
            r0 = -645207567(0xffffffffd98ae9f1, float:-4.887596E15)
            if (r1 == r0) goto La2
            r0 = 244645484(0xe94fe6c, float:3.6729816E-30)
            if (r1 != r0) goto L96
            java.lang.String r0 = "insufficient_style_credit_pay"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L96
        L83:
            X.cW1 r3 = r4.LIZIZ
            if (r3 == 0) goto L96
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r2 = r12.LJIILIIL()
            int r1 = p003X.C136834cXV.LIZ()
            int r0 = p003X.C136834cXV.LIZJ()
            r3.LIZIZ(r2, r1, r0)
        L96:
            X.cW1 r1 = r4.LIZIZ
            if (r1 == 0) goto La1
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r0 = r12.LJIILIIL()
            r1.LIZ(r0)
        La1:
            return
        La2:
            java.lang.String r0 = "insufficient_style_normal"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L96
            goto L83
        Lab:
            java.lang.String r0 = "insufficient_style_dialog"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L96
            X.cW1 r3 = r4.LIZIZ
            if (r3 == 0) goto L96
            com.android.ttcjpaysdk.thirdparty.front.counter.fragment.d r2 = r12.LJIILIIL()
            int r1 = p003X.C136834cXV.LIZLLL()
            int r0 = p003X.C136834cXV.LIZLLL()
            r3.LIZIZ(r2, r1, r0)
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontStandardCounterActivity.LIZ(java.lang.String, com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo, java.lang.String, int, java.lang.String, java.lang.String):void");
    }
}
