package com.android.ttcjpaysdk.integrated.counter.activity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.C2176e;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayCombineService;
import com.android.ttcjpaysdk.base.service.ICJPayCounterService;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedQrCodeService;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyService;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.integrated.counter.b$b;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.data.C2279k;
import com.android.ttcjpaysdk.integrated.counter.data.C2280y;
import com.android.ttcjpaysdk.integrated.counter.data.UserInfo;
import com.android.ttcjpaysdk.integrated.counter.fragment.C2284a;
import com.android.ttcjpaysdk.integrated.counter.fragment.C2285b;
import com.android.ttcjpaysdk.integrated.counter.fragment.C2286c;
import com.android.ttcjpaysdk.integrated.counter.outerpay.CJOuterPayManager;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.android.ttcjpaysdk.integrated.counter.p155c.C2273a;
import com.android.ttcjpaysdk.integrated.counter.p156d.C2274a;
import com.android.ttcjpaysdk.integrated.counter.p158e.C2283c;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult;
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
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractActivityC136021cKO;
import p003X.AbstractC137051cb1;
import p003X.AbstractC137355cfv;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135694cF7;
import p003X.C135754cG5;
import p003X.C135765cGG;
import p003X.C135883cIA;
import p003X.C136058cKz;
import p003X.C136221cNc;
import p003X.C136429cQy;
import p003X.C136742cW1;
import p003X.C136834cXV;
import p003X.C136939cZC;
import p003X.C136966cZd;
import p003X.C136967cZe;
import p003X.C137062cbC;
import p003X.C137063cbD;
import p003X.C137110cby;
import p003X.C137111cbz;
import p003X.C137116cc4;
import p003X.C137117cc5;
import p003X.C137121cc9;
import p003X.C137122ccA;
import p003X.C137123ccB;
import p003X.C137126ccE;
import p003X.C137128ccG;
import p003X.C137129ccH;
import p003X.C137132ccK;
import p003X.C137134ccM;
import p003X.C137135ccN;
import p003X.C137138ccQ;
import p003X.C137141ccT;
import p003X.C137142ccU;
import p003X.C137145ccX;
import p003X.C137146ccY;
import p003X.C137147ccZ;
import p003X.C137228cds;
import p003X.C137239ce3;
import p003X.C137285cen;
import p003X.C137295cex;
import p003X.C137316cfI;
import p003X.C137322cfO;
import p003X.C137346cfm;
import p003X.C137354cfu;
import p003X.C137356cfw;
import p003X.C137366cg6;
import p003X.C9H6;
import p003X.CountDownTimerC137100cbo;
import p003X.DialogC135276c8N;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.RunnableC137284cem;
import p003X.RunnableC137297cez;
import p003X.RunnableC137363cg3;
import p003X.View$OnClickListenerC137338cfe;
import p003X.View$OnClickListenerC137339cff;

/* loaded from: classes17.dex */
public final class CJPayCounterActivity extends AbstractActivityC136021cKO<C2283c> implements INormalBindCardCallback, b$b {
    public static ChangeQuickRedirect LIZ;
    public C136742cW1 LIZIZ;
    public C2272a LIZJ;
    public ICJPayVerifyService LIZLLL;

    /* renamed from: LJ */
    public ICJPayCounterService f25498LJ;
    public ICJPayIntegratedQrCodeService LJFF;
    public ICJPayCombineService LJI;
    public HashMap<String, String> LJII;
    public boolean LJIIIIZZ;
    public JSONObject LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public C2176e LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIJ;
    public C2273a LJJII;
    public CJPayTextLoadingView LJJIII;
    public View LJJIIJ;
    public boolean LJJIIZ;
    public DialogC137460chc LJJIIZI;
    public CJOuterPayManager.OuterType LJJIJ;
    public String LJJIJIIJI;
    public AbstractC137051cb1 LJJIJIIJIL;
    public HashMap LJJJJJL;
    public static final C137117cc5 LJJIFFI = new C137117cc5((byte) 0);
    public static final String LJJI = "CJPayCounterActivity";
    public C137142ccU LJJIIJZLJL = C137346cfm.LIZ();
    public String LJIIL = "";
    public String LJIILLIIL = "";
    public String LJIIZILJ = "";
    public final Lazy LJJIJIL = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$confirmFragment$2(this));
    public final Lazy LJJIJL = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$methodFragment$2(this));
    public final Lazy LJJIJLIJ = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$completeFragment$2(this));
    public final C137129ccH LJJIL = new C137129ccH(this);
    public final Lazy LJJIZ = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$combinePayFragment$2(this));
    public AbstractC137355cfv LJIJI = new C137316cfI(this);
    public final Lazy LJJJ = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$quickPayCompleteFragment$2(this));
    public final Lazy LJIJJ = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$fingerprintGuideFragment$2(this));
    public final Lazy LJIJJLI = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$passwordFreeGuideFragment$2(this));
    public final Lazy LJIL = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$amountUpgradeGuideFragment$2(this));
    public final Lazy LJJ = LazyKt__LazyJVMKt.lazy(new CJPayCounterActivity$resetPwdGuideFragment$2(this));
    public final C137285cen LJJJI = new C137285cen(this);
    public final C137122ccA LJJJIL = new C137122ccA(this);
    public final C137135ccN LJJJJ = new C137135ccN(this);
    public final C137145ccX LJJJJI = new C137145ccX(this);
    public final C137138ccQ LJJJJIZL = new C137138ccQ(this);
    public final C137123ccB LJJJJJ = new C137123ccB(this);

    private final C2284a LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        return (C2284a) (proxy.isSupported ? proxy.result : this.LJJIJLIJ.mo27335getValue());
    }

    private final Fragment LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        return (Fragment) (proxy.isSupported ? proxy.result : this.LJJJ.mo27335getValue());
    }

    public final C2285b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        return (C2285b) (proxy.isSupported ? proxy.result : this.LJJIJIL.mo27335getValue());
    }

    public final C2286c LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        return (C2286c) (proxy.isSupported ? proxy.result : this.LJJIJL.mo27335getValue());
    }

    public final Fragment LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        return (Fragment) (proxy.isSupported ? proxy.result : this.LJJIZ.mo27335getValue());
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 96).isSupported && (hashMap = this.LJJJJJL) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 95);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJJJJJL == null) {
            this.LJJJJJL = new HashMap();
        }
        View view = (View) this.LJJJJJL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJJJJJL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void adjustViews() {
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690555;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final boolean isActivityPortrait() {
        return false;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 98).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 97).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIILLIIL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(boolean z) {
        String LIZJ;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported && CJPayBasicUtils.isClickValid() && C2272a.f25499LJ != null && !PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, this, LIZ, false, 18).isSupported && C2272a.f25499LJ != null) {
            ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
            if (iCJPayNormalBindCardService != null) {
                iCJPayNormalBindCardService.setPayNewCardCallback(new C137128ccG(this, z));
                ICJPayNormalBindCardService.BindCardType bindCardType = ICJPayNormalBindCardService.BindCardType.TYPE_PAY;
                NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
                normalBindCardBean.setProcessInfo(CJPayJsonParser.toJsonObject(C2272a.f25499LJ.data.pay_params.channel_data.process_info));
                normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.Pay);
                normalBindCardBean.setHostInfoJSON(CJPayHostInfo.Companion.LIZIZ(C137356cfw.LIZIZ.LIZIZ()));
                String str = "";
                normalBindCardBean.setSource(str);
                C2272a c2272a = this.LIZJ;
                if (c2272a != null && (LIZJ = c2272a.LIZJ()) != null) {
                    str = LIZJ;
                }
                normalBindCardBean.setBindCardInfo(str);
                iCJPayNormalBindCardService.startBindCardProcess(this, bindCardType, normalBindCardBean, this);
            }
            C2272a c2272a2 = this.LIZJ;
            if (c2272a2 == null) {
                return;
            }
            c2272a2.LJIIZILJ = null;
        }
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$b
    public final void LIZ(C2278i c2278i, boolean z) {
        AbstractC137051cb1 abstractC137051cb1;
        C2278i c2278i2;
        C137134ccM c137134ccM;
        C137228cds c137228cds;
        ICJPayCombineService.CombineType combineType;
        String payType;
        AbstractC137051cb1 abstractC137051cb12;
        C2118a LIZ2;
        if (PatchProxy.proxy(new Object[]{c2278i, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 75).isSupported) {
            return;
        }
        disablePageClickEvent(false);
        ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
        if (iCJPayVerifyService != null && iCJPayVerifyService.isRelease()) {
            LJIIZILJ();
        }
        String str = "";
        if (c2278i != null) {
            if (!c2278i.isResponseOk()) {
                LIZIZ(c2278i.code, c2278i.error.msg);
                if (Intrinsics.areEqual("CA3100", c2278i.code)) {
                    C2118a.LIZ().LIZ(108);
                } else if (Intrinsics.areEqual("CA3001", c2278i.code)) {
                    C2118a.LIZ().LIZ(MapsKt__MapsKt.hashMapOf(new Pair("toast_msg", c2278i.error.msg)));
                    C2118a.LIZ().LIZ(105);
                } else {
                    C2118a.LIZ().LIZ(105);
                }
                if (this.LJIIIIZZ) {
                    AbstractC137051cb1 abstractC137051cb13 = this.LJJIJIIJIL;
                    if (abstractC137051cb13 == null) {
                        return;
                    }
                    String str2 = c2278i.code;
                    Intrinsics.checkNotNullExpressionValue(str2, str);
                    String str3 = c2278i.error.msg;
                    Intrinsics.checkNotNullExpressionValue(str3, str);
                    abstractC137051cb13.LIZ(false, str2, str3);
                    return;
                } else if (Intrinsics.areEqual(this.LJJIJIIJI, "from_h5")) {
                    CJPayActivityManager.INSTANCE.finishAllWithOutH5page(this);
                    return;
                } else {
                    CJPayActivityManager.INSTANCE.finishAll(this);
                    return;
                }
            } else if (c2278i.isResponseOk()) {
                C2118a LIZ3 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, str);
                if (LIZ3.LJIILIIL == null && (LIZ2 = C2118a.LIZ().LIZ(110)) != null) {
                    LIZ2.LIZIZ();
                }
                C2118a LIZ4 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ4, str);
                LIZ4.LJIJJ = c2278i.data.fe_metrics.optString("trace_id");
                C2272a.LIZ((C137147ccZ) null);
                C2272a.LIZIZ = c2278i;
                CJPayTextLoadingView cJPayTextLoadingView = this.LJJIII;
                if (cJPayTextLoadingView != null) {
                    cJPayTextLoadingView.hide();
                }
                if (this.LJIIIIZZ && (abstractC137051cb12 = this.LJJIJIIJIL) != null) {
                    abstractC137051cb12.LIZ(true, str, str);
                }
                JSONObject jSONObject = this.LJIIIZ;
                if (jSONObject != null) {
                    LJIILJJIL();
                    C2285b LIZ5 = LIZ();
                    ICJPayCombineService iCJPayCombineService = this.LJI;
                    if (iCJPayCombineService != null && (combineType = iCJPayCombineService.getCombineType()) != null && (payType = combineType.getPayType()) != null) {
                        str = payType;
                    }
                    LIZ5.LIZ(jSONObject, true, str, jSONObject.optString(C2521l.LJIIJ), jSONObject.optString("biz_fail_reason"));
                    return;
                } else if (this.LJIILIIL) {
                    LIZ().LJIIJJI();
                    LJIILJJIL();
                    LIZ(this.LJIILJJIL);
                    this.LJIILIIL = false;
                    return;
                } else {
                    C2272a c2272a = this.LIZJ;
                    if (c2272a == null || !c2272a.LJIILLIIL) {
                        LJIILIIL();
                    } else if (z) {
                        LJIILLIIL();
                    } else {
                        LJIILIIL();
                        LIZ().LJIIJJI();
                    }
                    C2273a c2273a = this.LJJII;
                    if (c2273a != null && !PatchProxy.proxy(new Object[0], c2273a, C2273a.LIZ, false, 1).isSupported && (c2278i2 = C2272a.LIZIZ) != null && (c137134ccM = c2278i2.data) != null && (c137228cds = c137134ccM.cashdesk_show_conf) != null) {
                        long j = c137228cds.left_time_s;
                        if (j > 0 && c2273a.LIZIZ == null) {
                            c2273a.LIZIZ = new CountDownTimerC137100cbo(j * 1000, 1000L, c2273a);
                            CountDownTimerC137100cbo countDownTimerC137100cbo = c2273a.LIZIZ;
                            if (countDownTimerC137100cbo == null) {
                                return;
                            }
                            countDownTimerC137100cbo.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                C2118a.LIZ().LIZ(105);
                if (Intrinsics.areEqual(this.LJJIJIIJI, "from_h5")) {
                    CJPayActivityManager.INSTANCE.finishAllWithOutH5page(this);
                    return;
                } else {
                    CJPayActivityManager.INSTANCE.finishAll(this);
                    return;
                }
            }
        }
        LIZIZ("105", "result == null");
        C2118a.LIZ().LIZ(105);
        if (this.LJIIIIZZ && (abstractC137051cb1 = this.LJJIJIIJIL) != null) {
            abstractC137051cb1.LIZ(false, str, "logId：");
        }
        if (Intrinsics.areEqual(this.LJJIJIIJI, "from_h5")) {
            CJPayActivityManager.INSTANCE.finishAllWithOutH5page(this);
        } else {
            CJPayActivityManager.INSTANCE.finishAll(this);
        }
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$b
    public final void LIZ(String str, boolean z) {
        AbstractC137051cb1 abstractC137051cb1;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 76).isSupported) {
            return;
        }
        disablePageClickEvent(false);
        CJPayTextLoadingView cJPayTextLoadingView = this.LJJIII;
        if (cJPayTextLoadingView != null) {
            cJPayTextLoadingView.hide();
        }
        CJPayBasicUtils.displayToastInternal(this, getResources().getString(2131558456), 0);
        LIZIZ("109", str);
        C2118a.LIZ().LIZ(109);
        if (this.LJIIIIZZ && (abstractC137051cb1 = this.LJJIJIIJIL) != null) {
            abstractC137051cb1.LIZ(false, "", C0002O.m25086C("errMsg：", str));
        }
        if (Intrinsics.areEqual(this.LJJIJIIJI, "from_h5")) {
            CJPayActivityManager.INSTANCE.finishAllWithOutH5page(this);
        } else {
            CJPayActivityManager.INSTANCE.finishAll(this);
        }
    }

    public final boolean LIZ(String str, View.OnClickListener onClickListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, onClickListener}, this, LIZ, false, 87);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        if (!this.LJIIIIZZ || this.LJJIIZ || C2272a.LIZIZ == null || C2272a.LIZIZ.data.cashdesk_show_conf.popup_info.isEmpty()) {
            return false;
        }
        this.LJJIIZ = true;
        CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(this);
        defaultBuilder.setTitle(C2272a.LIZIZ.data.cashdesk_show_conf.popup_info.title);
        defaultBuilder.setSubTitle(C2272a.LIZIZ.data.cashdesk_show_conf.popup_info.content);
        defaultBuilder.setLeftBtnStr(getString(2131561920));
        defaultBuilder.setRightBtnStr(getString(2131561608));
        defaultBuilder.setSingleBtnStr("");
        defaultBuilder.setLeftBtnListener(new View$OnClickListenerC137338cfe(this, str));
        defaultBuilder.setRightBtnListener(new View$OnClickListenerC137339cff(this, str, onClickListener));
        defaultBuilder.setSingleBtnListener(null);
        defaultBuilder.setWidth(270);
        defaultBuilder.setHeight(107);
        defaultBuilder.setLeftBtnColor(C116971W2r.LIZ(getResources(), 2131624875));
        defaultBuilder.setLeftBtnBold(false);
        defaultBuilder.setRightBtnColor(C116971W2r.LIZ(getResources(), 2131624875));
        defaultBuilder.setRightBtnBold(false);
        defaultBuilder.setSingleBtnColor(C116971W2r.LIZ(getResources(), 2131624875));
        defaultBuilder.setSingleBtnBold(false);
        defaultBuilder.setThemeResId(2131493160);
        this.LJJIIZI = CJPayDialogUtils.initDialog(defaultBuilder);
        DialogC137460chc dialogC137460chc = this.LJJIIZI;
        if (dialogC137460chc != null) {
            C116971W2r.LIZJ(dialogC137460chc);
            if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 89).isSupported) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("activity_info", str);
                } catch (Exception unused) {
                }
                C137356cfw.LIZIZ.LIZ("wallet_cashier_riskcontrol_pop_imp", jSONObject);
            }
        }
        return true;
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 88).isSupported) {
            return;
        }
        DialogC137460chc dialogC137460chc = this.LJJIIZI;
        if (dialogC137460chc != null) {
            C116971W2r.LIZ(dialogC137460chc);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_name", str2);
            jSONObject.put("activity_info", str);
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ("wallet_cashier_riskcontrol_pop_click", jSONObject);
    }

    static {
        Covode.recordClassIndex(7507);
    }

    @Override // p003X.AbstractActivityC136021cKO, android.app.Activity
    public final void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 47).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZIZ(this);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2274a();
    }

    private final boolean LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 44);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Intrinsics.areEqual(getSupportFragmentManager().findFragmentById(2131170064), LIZIZ())) {
            return false;
        }
        return true;
    }

    private final boolean LJIJJLI() {
        Fragment fragment;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 45);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(2131170064);
        ICJPayIntegratedQrCodeService iCJPayIntegratedQrCodeService = this.LJFF;
        if (iCJPayIntegratedQrCodeService != null) {
            fragment = iCJPayIntegratedQrCodeService.getFragment();
        } else {
            fragment = null;
        }
        if (!Intrinsics.areEqual(findFragmentById, fragment)) {
            return false;
        }
        return true;
    }

    private final void LJIL() {
        ICJPayVerifyService iCJPayVerifyService;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 58).isSupported) {
            return;
        }
        String str = null;
        if (LJFF()) {
            ICJPayCombineService iCJPayCombineService = this.LJI;
            if (iCJPayCombineService != null) {
                str = iCJPayCombineService.getCurrentMethod();
            }
            if (!TextUtils.isEmpty(str) && (iCJPayVerifyService = this.LIZLLL) != null) {
                iCJPayVerifyService.setPayMethod(str);
                return;
            }
            return;
        }
        ICJPayVerifyService iCJPayVerifyService2 = this.LIZLLL;
        if (iCJPayVerifyService2 != null) {
            iCJPayVerifyService2.setPayMethod(null);
        }
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 38);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(2131170064);
        if (!Intrinsics.areEqual(findFragmentById, LJIJ()) && !Intrinsics.areEqual(findFragmentById, LJIJI())) {
            return false;
        }
        return true;
    }

    /* renamed from: LJ */
    public final boolean m16052LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 43);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Intrinsics.areEqual(getSupportFragmentManager().findFragmentById(2131170064), LIZ())) {
            return false;
        }
        return true;
    }

    public final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 46);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Intrinsics.areEqual(getSupportFragmentManager().findFragmentById(2131170064), LIZJ())) {
            return false;
        }
        return true;
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 54).isSupported) {
            return;
        }
        LJIL();
        if (C137126ccE.LIZLLL()) {
            ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
            if (iCJPayVerifyService != null) {
                int i = C137322cfO.LIZ;
                int i2 = C137322cfO.LJI;
                iCJPayVerifyService.start(i, i2, i2, true);
                return;
            }
            return;
        }
        ICJPayVerifyService iCJPayVerifyService2 = this.LIZLLL;
        if (iCJPayVerifyService2 != null) {
            int i3 = C137322cfO.LIZ;
            int i4 = C137322cfO.LJFF;
            iCJPayVerifyService2.start(i3, i4, i4, false);
        }
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 56).isSupported) {
            return;
        }
        LJIL();
        if (C137126ccE.LIZLLL()) {
            ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
            if (iCJPayVerifyService != null) {
                int i = C137322cfO.LIZJ;
                int i2 = C137322cfO.LJI;
                iCJPayVerifyService.start(i, i2, i2, true);
                return;
            }
            return;
        }
        ICJPayVerifyService iCJPayVerifyService2 = this.LIZLLL;
        if (iCJPayVerifyService2 != null) {
            int i3 = C137322cfO.LIZJ;
            int i4 = C137322cfO.LJFF;
            iCJPayVerifyService2.start(i3, i4, i4, false);
        }
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 57).isSupported) {
            return;
        }
        LJIL();
        if (C137126ccE.LIZLLL()) {
            ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
            if (iCJPayVerifyService != null) {
                int i = C137322cfO.LIZLLL;
                int i2 = C137322cfO.LJI;
                iCJPayVerifyService.start(i, i2, i2, false);
                return;
            }
            return;
        }
        ICJPayVerifyService iCJPayVerifyService2 = this.LIZLLL;
        if (iCJPayVerifyService2 != null) {
            int i3 = C137322cfO.LIZLLL;
            int i4 = C137322cfO.f18157LJ;
            iCJPayVerifyService2.start(i3, i4, i4, false);
        }
    }

    public final void LJIILJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 66).isSupported) {
            return;
        }
        ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
        if (iCJPayVerifyService != null) {
            iCJPayVerifyService.stop();
        }
        C136742cW1 c136742cW1 = this.LIZIZ;
        if (c136742cW1 != null) {
            c136742cW1.LIZ(LIZ(), C136834cXV.LIZJ(), C136834cXV.LIZJ());
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135765cGG.class, C136967cZe.class, C135883cIA.class, C136939cZC.class, C137111cbz.class, C137110cby.class, C136429cQy.class, C135754cG5.class, C135694cF7.class};
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        Integer num;
        C137142ccU c137142ccU;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 49).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        if (cJPayHostInfo != null && (num = cJPayHostInfo.mScreenOrientationType) != null && num.intValue() == 2 && (c137142ccU = this.LJJIIJZLJL) != null) {
            c137142ccU.LIZ(this);
        }
    }

    public final void LJII() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 55).isSupported) {
            return;
        }
        LJIL();
        if (C137126ccE.LIZLLL()) {
            ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
            if (iCJPayVerifyService != null) {
                int i = C137322cfO.LIZIZ;
                int i2 = C137322cfO.LJI;
                iCJPayVerifyService.start(i, i2, i2, true);
            }
        } else {
            ICJPayVerifyService iCJPayVerifyService2 = this.LIZLLL;
            if (iCJPayVerifyService2 != null) {
                int i3 = C137322cfO.LIZIZ;
                int i4 = C137322cfO.LJFF;
                iCJPayVerifyService2.start(i3, i4, i4, false);
            }
        }
        C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
        String str2 = CJPayHostInfo.aid;
        String str3 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        if (cJPayHostInfo != null) {
            str = cJPayHostInfo.merchantId;
        } else {
            str = null;
        }
        c137121cc9.LIZ("聚合_cardSign", "wallet_rd_cardsign_interface_params_verify", str2, str3, str);
    }

    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 62).isSupported) {
            return;
        }
        boolean z = PatchProxy.proxy(new Object[0], LIZ(), C2285b.LIZ, false, 55).isSupported;
        if (C137126ccE.LIZLLL()) {
            C136742cW1 c136742cW1 = this.LIZIZ;
            if (c136742cW1 != null) {
                c136742cW1.LIZ(LIZIZ(), C136834cXV.LIZJ(), C136834cXV.LIZJ());
                return;
            }
            return;
        }
        C136742cW1 c136742cW12 = this.LIZIZ;
        if (c136742cW12 != null) {
            c136742cW12.LIZ(LIZIZ(), C136834cXV.LIZIZ(), C136834cXV.LIZIZ());
        }
    }

    public final void LJIIL() {
        C136742cW1 c136742cW1;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 64).isSupported) {
            return;
        }
        if (C137366cg6.LIZ.m21712LJ() && (c136742cW1 = this.LIZIZ) != null) {
            C2285b LIZ2 = LIZ();
            if (!PatchProxy.proxy(new Object[]{LIZ2}, c136742cW1, C136742cW1.LIZ, false, 9).isSupported && LIZ2 != null) {
                try {
                    if (c136742cW1.LIZLLL != null) {
                        c136742cW1.LIZIZ = c136742cW1.LIZLLL.getSupportFragmentManager().beginTransaction();
                        FragmentTransaction fragmentTransaction = c136742cW1.LIZIZ;
                        if (fragmentTransaction != null) {
                            fragmentTransaction.hide(LIZ2);
                        }
                        FragmentTransaction fragmentTransaction2 = c136742cW1.LIZIZ;
                        if (fragmentTransaction2 != null) {
                            fragmentTransaction2.commitAllowingStateLoss();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        C136742cW1 c136742cW12 = this.LIZIZ;
        if (c136742cW12 != null) {
            c136742cW12.LIZ(LJIJ(), C136834cXV.LIZ(), C136834cXV.LIZJ());
        }
    }

    public final void LJIILL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 67).isSupported) {
            return;
        }
        ICJPayCounterService iCJPayCounterService = this.f25498LJ;
        if (iCJPayCounterService != null) {
            Intrinsics.checkNotNull(iCJPayCounterService);
            if (iCJPayCounterService.getCompleteRemainTime() == 0) {
                C136742cW1 c136742cW1 = this.LIZIZ;
                if (c136742cW1 != null) {
                    c136742cW1.LIZ(false);
                }
                C136742cW1 c136742cW12 = this.LIZIZ;
                if (c136742cW12 != null) {
                    c136742cW12.LIZ(LJIJI(), C136834cXV.LIZ(), C136834cXV.LIZ());
                    return;
                }
                return;
            }
        }
        ICJPayCounterService iCJPayCounterService2 = this.f25498LJ;
        if (iCJPayCounterService2 != null) {
            Intrinsics.checkNotNull(iCJPayCounterService2);
            if (iCJPayCounterService2.getCompleteShowStyle() == 1) {
                C136742cW1 c136742cW13 = this.LIZIZ;
                if (c136742cW13 != null) {
                    c136742cW13.LIZ(LJIJI(), C136834cXV.LIZIZ(), C136834cXV.LIZJ());
                    return;
                }
                return;
            }
        }
        C136742cW1 c136742cW14 = this.LIZIZ;
        if (c136742cW14 != null) {
            c136742cW14.LIZ(LJIJI(), C136834cXV.LIZ(), C136834cXV.LIZJ());
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 52).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 51).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 50).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 53).isSupported) {
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

    public final void LJIIJ() {
        ICJPayIntegratedQrCodeService iCJPayIntegratedQrCodeService;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 61).isSupported) {
            return;
        }
        if (this.LJIIIIZZ) {
            C2118a LIZ2 = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            int i = 2;
            if (LIZ2.LIZJ != null) {
                C2118a LIZ3 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                TTCJPayResult tTCJPayResult = LIZ3.LIZJ;
                Intrinsics.checkNotNullExpressionValue(tTCJPayResult, "");
                int code = tTCJPayResult.getCode();
                if (code != 0) {
                    if (code == 104) {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
            }
            AbstractC137051cb1 abstractC137051cb1 = this.LJJIJIIJIL;
            if (abstractC137051cb1 != null) {
                abstractC137051cb1.LIZ(i, "");
            }
            C2272a.LJIJJLI = "";
        }
        ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
        if (iCJPayVerifyService != null) {
            iCJPayVerifyService.release();
        }
        if (LJIJJ()) {
            LIZIZ().LIZ(C136834cXV.LIZJ());
        } else if (LJIJJLI() && (iCJPayIntegratedQrCodeService = this.LJFF) != null) {
            iCJPayIntegratedQrCodeService.setOutAnim(C136834cXV.LIZJ());
        }
        C136742cW1 c136742cW1 = this.LIZIZ;
        if (c136742cW1 != null) {
            c136742cW1.LIZ(true);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC137297cez(this), 300L);
    }

    public final void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 65).isSupported) {
            return;
        }
        CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.INTEGRATED_COUNTER, CJPayPageLoadTrace.Section.RENDERING);
        if (!C137126ccE.LIZIZ() && !C137126ccE.LIZ()) {
            if (C137126ccE.LIZJ()) {
                C136742cW1 c136742cW1 = this.LIZIZ;
                if (c136742cW1 != null) {
                    c136742cW1.LIZ(LIZ(), C136834cXV.LIZLLL(), C136834cXV.LIZLLL());
                    return;
                }
                return;
            }
            C136742cW1 c136742cW12 = this.LIZIZ;
            if (c136742cW12 != null) {
                c136742cW12.LIZ(LIZ(), C136834cXV.LIZJ(), C136834cXV.LIZJ());
            }
        } else if (C137356cfw.LIZIZ.LIZ((Configuration) null, this)) {
            C136742cW1 c136742cW13 = this.LIZIZ;
            if (c136742cW13 != null) {
                c136742cW13.LIZ(LIZ(), C136834cXV.LIZIZ(), C136834cXV.LIZIZ());
            }
        } else {
            C136742cW1 c136742cW14 = this.LIZIZ;
            if (c136742cW14 != null) {
                c136742cW14.LIZ(LIZ(), C136834cXV.LIZJ(), C136834cXV.LIZJ());
            }
        }
    }

    public final void LJIIZILJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 78).isSupported) {
            return;
        }
        this.LJII = new HashMap<>();
        C2272a.LJIIIZ = new ArrayList<>();
        C2272a.LJIIJ = new ArrayList<>();
        this.f25498LJ = (ICJPayCounterService) CJPayServiceManager.getInstance().getIService(ICJPayCounterService.class);
        this.LJFF = (ICJPayIntegratedQrCodeService) CJPayServiceManager.getInstance().getIService(ICJPayIntegratedQrCodeService.class);
        ICJPayIntegratedQrCodeService iCJPayIntegratedQrCodeService = this.LJFF;
        if (iCJPayIntegratedQrCodeService != null) {
            iCJPayIntegratedQrCodeService.setCallBack(this.LJJJI);
        }
        this.LIZLLL = (ICJPayVerifyService) CJPayServiceManager.getInstance().getIService(ICJPayVerifyService.class);
        ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
        if (iCJPayVerifyService != null) {
            iCJPayVerifyService.initVerifyComponents(this, 2131170064, this.LJJJJJ, this.LJJJIL, this.LJJJJ, this.LJJJJIZL, this.LJJJJI);
        }
        this.LJI = (ICJPayCombineService) CJPayServiceManager.getInstance().getIService(ICJPayCombineService.class);
        ICJPayCombineService iCJPayCombineService = this.LJI;
        if (iCJPayCombineService != null) {
            iCJPayCombineService.setCallBack(this.LJJIL);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final void beforeSetContentView() {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        super.beforeSetContentView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
            CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
            Integer num5 = null;
            if (cJPayHostInfo != null) {
                num5 = cJPayHostInfo.mScreenOrientationType;
            }
            if (num5 != null && num5.intValue() == 0) {
                setRequestedOrientation(1);
                return;
            }
            CJPayHostInfo cJPayHostInfo2 = C2272a.LIZJ;
            if (cJPayHostInfo2 != null && (num4 = cJPayHostInfo2.mScreenOrientationType) != null && num4.intValue() == 1) {
                setRequestedOrientation(0);
                return;
            }
            CJPayHostInfo cJPayHostInfo3 = C2272a.LIZJ;
            if (cJPayHostInfo3 != null && (num3 = cJPayHostInfo3.mScreenOrientationType) != null && num3.intValue() == -1) {
                setRequestedOrientation(8);
                return;
            }
            CJPayHostInfo cJPayHostInfo4 = C2272a.LIZJ;
            if (cJPayHostInfo4 != null && (num2 = cJPayHostInfo4.mScreenOrientationType) != null && num2.intValue() == 3) {
                setRequestedOrientation(3);
                return;
            }
            C137142ccU c137142ccU = this.LJJIIJZLJL;
            CJPayHostInfo cJPayHostInfo5 = C2272a.LIZJ;
            if (cJPayHostInfo5 != null && (num = cJPayHostInfo5.mScreenOrientationType) != null) {
                i = num.intValue();
            }
            c137142ccU.LIZLLL = i;
            this.LJJIIJZLJL.f18132LJ = new C137239ce3(this);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        C137354cfu c137354cfu;
        C137295cex c137295cex;
        C137132ccK c137132ccK;
        UserInfo userInfo;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 48).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        C2272a.LJIIJ();
        C2272a.LIZ(-1);
        C2273a c2273a = this.LJJII;
        if (c2273a != null && !PatchProxy.proxy(new Object[0], c2273a, C2273a.LIZ, false, 3).isSupported) {
            CountDownTimerC137100cbo countDownTimerC137100cbo = c2273a.LIZIZ;
            if (countDownTimerC137100cbo != null) {
                countDownTimerC137100cbo.cancel();
            }
            DialogC137460chc dialogC137460chc = c2273a.LIZJ;
            if (dialogC137460chc != null) {
                C9H6.LIZ(dialogC137460chc);
            }
            c2273a.LIZIZ = null;
        }
        ICJPayVerifyService iCJPayVerifyService = this.LIZLLL;
        if (iCJPayVerifyService != null) {
            iCJPayVerifyService.release();
        }
        ICJPayCounterService iCJPayCounterService = this.f25498LJ;
        if (iCJPayCounterService != null) {
            iCJPayCounterService.release();
        }
        ICJPayIntegratedQrCodeService iCJPayIntegratedQrCodeService = this.LJFF;
        if (iCJPayIntegratedQrCodeService != null) {
            iCJPayIntegratedQrCodeService.release();
        }
        ICJPayCombineService iCJPayCombineService = this.LJI;
        if (iCJPayCombineService != null) {
            iCJPayCombineService.release();
        }
        List<Activity> list = C2272a.LIZLLL;
        if (list != null) {
            list.remove(this);
        }
        C2118a LIZ2 = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZ2.LJIJJLI = "";
        super.onDestroy();
        ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        if (iCJPayNormalBindCardService != null) {
            iCJPayNormalBindCardService.release();
        }
        C2279k c2279k = C2272a.f25499LJ;
        if (c2279k != null && (c137354cfu = c2279k.data) != null && (c137295cex = c137354cfu.pay_params) != null && (c137132ccK = c137295cex.channel_data) != null && (userInfo = c137132ccK.user_info) != null) {
            userInfo.real_check_type = "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r1 == com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePayErrorType.OldCardInsufficentError) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r1 == com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePayErrorType.OldCardInsufficentError) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r1 == com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePayErrorType.OldCardOtherError) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
        r0 = r5.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        r1 = r0.getErrorType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        if (r1 == com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePayErrorType.NewCardOtherError) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        r0 = r5.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
        r1 = r0.getErrorType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
        if (r1 != com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePayErrorType.OldCardOtherError) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f8, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
        r0 = r5.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e7, code lost:
        r3 = r0.getPaySource();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ed, code lost:
        if (r3 != com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePaySource.FromMethodFragment) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ef, code lost:
        LIZIZ().LIZIZ(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fa, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
        if (r1 != com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePaySource.FromConfirmFragment) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LJIILLIIL() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.activity.CJPayCounterActivity.LJIILLIIL():void");
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        CJPayTextLoadingView cJPayTextLoadingView;
        String str2;
        C2283c c2283c;
        View view;
        String str3;
        MethodCollector.m14708i(472);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported) {
            MethodCollector.m14707o(472);
            return;
        }
        this.LIZJ = new C2272a();
        this.LIZIZ = new C136742cW1(this, 2131170064);
        this.LJJII = new C2273a(this);
        C2273a c2273a = this.LJJII;
        if (c2273a != null) {
            c2273a.LIZLLL = new C137146ccY(this);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 59).isSupported) {
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
            if (Build.VERSION.SDK_INT >= 28) {
                Window window3 = getWindow();
                Intrinsics.checkNotNullExpressionValue(window3, "");
                WindowManager.LayoutParams attributes = window3.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                Window window4 = getWindow();
                Intrinsics.checkNotNullExpressionValue(window4, "");
                window4.setAttributes(attributes);
            }
        }
        setHalfTranslucent();
        this.LJJIII = (CJPayTextLoadingView) findViewById(2131165239);
        this.LJJIIJ = findViewById(2131170063);
        String str4 = null;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
            if (this.LJIIIIZZ) {
                View view2 = this.LJJIIJ;
                if (view2 != null) {
                    view = view2.findViewById(2131169943);
                } else {
                    view = null;
                }
                CJOuterPayManager.OuterType outerType = this.LJJIJ;
                if (outerType != null) {
                    int i2 = C137116cc4.LIZ[outerType.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            this.LJJIJIIJIL = new C137062cbC(view, this);
                        }
                    } else {
                        this.LJJIJIIJIL = new C137063cbD(view, this);
                    }
                }
                final AbstractC137051cb1 abstractC137051cb1 = this.LJJIJIIJIL;
                if (abstractC137051cb1 != null && !PatchProxy.proxy(new Object[0], abstractC137051cb1, AbstractC137051cb1.LIZ, false, 3).isSupported) {
                    abstractC137051cb1.LIZ();
                    View view3 = abstractC137051cb1.LJIIJJI;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    if (!PatchProxy.proxy(new Object[0], abstractC137051cb1, AbstractC137051cb1.LIZ, false, 15).isSupported && abstractC137051cb1.LJIIJJI != null) {
                        final ArrayList arrayList = new ArrayList();
                        View findViewById = abstractC137051cb1.LJIIJJI.findViewById(2131173122);
                        Intrinsics.checkNotNullExpressionValue(findViewById, "");
                        arrayList.add(findViewById);
                        View findViewById2 = abstractC137051cb1.LJIIJJI.findViewById(2131173123);
                        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                        arrayList.add(findViewById2);
                        View findViewById3 = abstractC137051cb1.LJIIJJI.findViewById(2131173124);
                        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
                        arrayList.add(findViewById3);
                        if (abstractC137051cb1.LJIIL != null) {
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 3);
                            ofInt.setDuration(750L);
                            ofInt.setRepeatCount(-1);
                            ofInt.setInterpolator(new LinearInterpolator());
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.2Z0
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(7834);
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    for (ImageView imageView : arrayList) {
                                        int i3 = Build.VERSION.SDK_INT;
                                        imageView.setBackground(AbstractC137051cb1.this.LJIIL.getResources().getDrawable(2130840281));
                                        Intrinsics.checkNotNullExpressionValue(valueAnimator, "");
                                        Object animatedValue = valueAnimator.getAnimatedValue();
                                        if (animatedValue != null) {
                                            int intValue = ((Integer) animatedValue).intValue();
                                            if (intValue >= 0 && 2 >= intValue) {
                                                List list = arrayList;
                                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                if (animatedValue2 != null) {
                                                    ((ImageView) list.get(((Integer) animatedValue2).intValue())).setBackground(AbstractC137051cb1.this.LJIIL.getResources().getDrawable(2130840282));
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                        }
                                    }
                                }
                            });
                            abstractC137051cb1.LJI = ofInt;
                            ValueAnimator valueAnimator = abstractC137051cb1.LJI;
                            if (valueAnimator != null) {
                                valueAnimator.start();
                            }
                        }
                    }
                }
                AbstractC137051cb1 abstractC137051cb12 = this.LJJIJIIJIL;
                if (abstractC137051cb12 != null) {
                    str3 = abstractC137051cb12.LIZIZ();
                } else {
                    str3 = null;
                }
                C2272a.LJIJJ = str3;
                C2118a LIZ2 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                LIZ2.LJIJJLI = C2272a.LJIJJ;
            } else {
                C2118a LIZ3 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                LIZ3.LJIJJLI = "";
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 60).isSupported) {
            CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
            if ((cJPayHostInfo == null || !cJPayHostInfo.isTransCheckoutCounterActivityWhenLoading) && !this.LJIIIIZZ) {
                View view4 = this.LJJIIJ;
                if (view4 != null) {
                    view4.setBackgroundColor(CastProtectorUtils.parseColor("#56000000"));
                }
                CJPayHostInfo cJPayHostInfo2 = C2272a.LIZJ;
                if (cJPayHostInfo2 != null && cJPayHostInfo2.needLoading && (cJPayTextLoadingView = this.LJJIII) != null) {
                    cJPayTextLoadingView.show();
                }
            } else {
                CJPayHostInfo cJPayHostInfo3 = C2272a.LIZJ;
                if (cJPayHostInfo3 != null) {
                    cJPayHostInfo3.isTransCheckoutCounterActivityWhenLoading = false;
                }
                View view5 = this.LJJIIJ;
                if (view5 != null) {
                    view5.setBackgroundColor(CastProtectorUtils.parseColor("#01000000"));
                }
                CJPayTextLoadingView cJPayTextLoadingView2 = this.LJJIII;
                if (cJPayTextLoadingView2 != null) {
                    cJPayTextLoadingView2.hide();
                }
            }
            if (this.LJIIIIZZ) {
                AbstractC137051cb1 abstractC137051cb13 = this.LJJIJIIJIL;
                if (abstractC137051cb13 != null) {
                    str2 = abstractC137051cb13.LJIIJ;
                } else {
                    str2 = null;
                }
                if (!PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 29).isSupported && (c2283c = (C2283c) this.mBasePresenter) != null && !PatchProxy.proxy(new Object[]{str2}, c2283c, C2283c.LIZ, false, 3).isSupported) {
                    M m = c2283c.mModel;
                    if (m != 0) {
                        C137141ccT c137141ccT = new C137141ccT(c2283c);
                        C136966cZd c136966cZd = new C136966cZd();
                        if (!PatchProxy.proxy(new Object[]{str2, c137141ccT, c136966cZd}, m, C2274a.LIZIZ, false, 6).isSupported) {
                            C106862S5w.LIZ(c137141ccT);
                            C2118a LIZ4 = C2118a.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                            LIZ4.LJIJJ = "";
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("host_app_name", C2272a.LJIJJLI);
                            JSONObject jSONObject2 = new JSONObject();
                            if (str2 == null) {
                                str2 = "";
                            }
                            jSONObject2.put("token", str2);
                            jSONObject2.put("params", jSONObject);
                            String LIZ5 = C137356cfw.LIZIZ.LIZ(true, "/gateway-cashier2/tp/cashier/trade_create_by_token");
                            m.LIZ(CJPayNetworkManager.postForm(LIZ5, C137121cc9.LIZ(C137356cfw.LIZIZ, "tp.cashier.trade_create_by_token", jSONObject2.toString(), null, null, 8, null), C137356cfw.LIZIZ.LIZ(LIZ5, "tp.cashier.trade_create_by_token"), c137141ccT, c136966cZd));
                        }
                    }
                    c2283c.LIZJ = System.currentTimeMillis();
                }
            } else {
                LIZ(this, "", false, false, 4, null);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            CJPayHostInfo cJPayHostInfo4 = C2272a.LIZJ;
            if (cJPayHostInfo4 != null && (map2 = cJPayHostInfo4.payRequestParams) != null) {
                str = map2.get("merchant_id");
            } else {
                str = null;
            }
            CJPayHostInfo cJPayHostInfo5 = C2272a.LIZJ;
            if (cJPayHostInfo5 != null && (map = cJPayHostInfo5.payRequestParams) != null) {
                str4 = map.get(Constants.APP_ID);
            }
            C2118a.LIZ().LIZ("wallet_rd_cashier_activity_send_trade_create", CJPayParamsUtils.LIZ(str, str4));
        }
        C136221cNc.LIZIZ.LIZ(this, new RunnableC137363cg3(this));
        MethodCollector.m14707o(472);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d6, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == true) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d8, code lost:
        r5 = p003X.C136561cT6.LIZIZ;
        r4 = r6.getContext();
        r1 = com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[0], r6, com.android.ttcjpaysdk.integrated.counter.fragment.C2285b.LIZ, false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e8, code lost:
        if (r1.isSupported == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ea, code lost:
        r0 = r1.result;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ec, code lost:
        r0 = r5.LIZ(r4, (com.android.ttcjpaysdk.base.p135ui.Utils.p136a.C2174c) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f4, code lost:
        r0 = r6.LJIILLIIL.mo27335getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0311, code lost:
        if (kotlin.collections.CollectionsKt___CollectionsKt.contains(r1, r7) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c4, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01dc, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f4, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x020c, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x027d, code lost:
        if (r0.isResetPwdGuideFragment(r1) == true) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0290, code lost:
        if (r0.isAmountUpgradeGuideFragment(r1) == true) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02a4, code lost:
        if (r0.isPasswordFreeGuideFragment(r1) == true) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x020e, code lost:
        r0 = r10.f25498LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0210, code lost:
        if (r0 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0212, code lost:
        r5 = r0.getCompleteRemainTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0216, code lost:
        if (r5 <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x022a, code lost:
        if (com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[]{java.lang.Integer.valueOf(r5)}, r10, com.android.ttcjpaysdk.integrated.counter.activity.CJPayCounterActivity.LIZ, false, 37).isSupported != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x022c, code lost:
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new p003X.RunnableC137347cfn(r10), r5 * 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02b8, code lost:
        if (r0.isFingerprintGuideFragment(r1) == true) goto L163;
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackPressed() {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.activity.CJPayCounterActivity.onBackPressed():void");
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public final void onBindCardResult(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 94).isSupported) {
            return;
        }
        INormalBindCardCallback.DefaultImpls.onBindCardResult(this, jSONObject);
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public final void onEntranceResult(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 77).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        runOnUiThread(new RunnableC137284cem(this));
    }

    private final void LIZIZ(boolean z) {
        int i = 1;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 82).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!z) {
                i = 0;
            }
            jSONObject.put("is_discount", i);
            C137356cfw.LIZIZ.LIZ("wallet_cashier_method_keep_pop_show", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        if (PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
            String str2 = null;
            if (cJPayHostInfo != null && (map2 = cJPayHostInfo.payRequestParams) != null) {
                str = map2.get("merchant_id");
            } else {
                str = null;
            }
            CJPayHostInfo cJPayHostInfo2 = C2272a.LIZJ;
            if (cJPayHostInfo2 != null && (map = cJPayHostInfo2.payRequestParams) != null) {
                str2 = map.get(Constants.APP_ID);
            }
            C2118a.LIZ().LIZ("wallet_rd_cashier_activity_on_new_intent", CJPayParamsUtils.LIZ(str, str2));
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        String str2;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 4).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        System.currentTimeMillis();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 85).isSupported) {
            if (C2272a.LIZLLL != null) {
                for (Activity activity : C2272a.LIZLLL) {
                    if (activity != null && !activity.isFinishing()) {
                        activity.finish();
                        if (((CJPayCounterActivity) activity).LJIIIIZZ) {
                            AbstractC137051cb1 abstractC137051cb1 = this.LJJIJIIJIL;
                            if (abstractC137051cb1 != null) {
                                abstractC137051cb1.LIZ(1, "");
                            }
                        } else {
                            C2118a.LIZ().LIZIZ();
                        }
                    }
                }
                C2272a.LIZLLL.clear();
            }
            C2272a.LIZLLL.add(this);
        }
        String str3 = null;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && getIntent() != null) {
            this.LJIIIIZZ = getIntent().getBooleanExtra("param_checkout_counter_enter_from_dy_outer", false);
            C2272a.LJIJ = this.LJIIIIZZ;
            Serializable serializableExtra = getIntent().getSerializableExtra("param_dy_outer_type");
            if (!(serializableExtra instanceof CJOuterPayManager.OuterType)) {
                serializableExtra = null;
            }
            this.LJJIJ = (CJOuterPayManager.OuterType) serializableExtra;
            C2272a.LJIJI = this.LJJIJ;
            if (!getIntent().hasExtra("param_dy_outer_app_id")) {
                str2 = "";
            } else {
                str2 = getIntent().getStringExtra("param_dy_outer_app_id");
            }
            C2272a.LJIJJ = str2;
            if (getIntent().hasExtra("param_dy_outer_timestamp")) {
                Intrinsics.checkNotNullExpressionValue(getIntent().getStringExtra("param_dy_outer_timestamp"), "");
            }
            this.LJJIJIIJI = getIntent().getStringExtra("invoke_from");
        }
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
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
            if (cJPayHostInfo != null && (map2 = cJPayHostInfo.payRequestParams) != null) {
                str = map2.get("merchant_id");
            } else {
                str = null;
            }
            CJPayHostInfo cJPayHostInfo2 = C2272a.LIZJ;
            if (cJPayHostInfo2 != null && (map = cJPayHostInfo2.payRequestParams) != null) {
                str3 = map.get(Constants.APP_ID);
            }
            C2118a.LIZ().LIZ("wallet_rd_cashier_activity_on_create", CJPayParamsUtils.LIZ(str, str3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x015d, code lost:
        if (r0 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015f, code lost:
        r0 = getResources().getString(2131561715);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016d, code lost:
        r9.LJIIL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0179, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombineType.BalanceAndBankCard.getType(), r4) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x017b, code lost:
        r9.LJIIJ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x017d, code lost:
        r9.LJIIIZ = r3;
        r1 = r9.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0181, code lost:
        if (r1 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0183, code lost:
        r1.LIZ(LIZJ(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x018a, code lost:
        LIZ(r9, "", true, false, 4, null);
        LIZ().LJIJI();
        LIZ().LJIILL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a2, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ad, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombineType.IncomeAndBankCard.getType(), r4) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01af, code lost:
        r9.LJIIJJI = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0155, code lost:
        if (r3 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("combinepay", r6) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("CD005002", r1) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r3 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        r1 = r3.optString("bank_card_id", "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
        p003X.C137372cgC.LIZ.LIZLLL(r1);
        p003X.C137372cgC.LIZ.LIZJ(r1);
        r1 = r9.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
        r1.setErrorType(com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePayErrorType.NewCardInsufficentError);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
        r0 = r9.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
        r4 = r0.getPaySource();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
        if (r4 != com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePaySource.FromConfirmFragment) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
        r1 = r9.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        r1.LIZ(LIZJ(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
        r3 = r9.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r3 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
        r3.LIZ(LIZIZ(), p003X.C136834cXV.LIZ(), p003X.C136834cXV.LIZIZ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
        r3 = r9.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (r3 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
        r3.LIZ(LIZJ(), p003X.C136834cXV.LIZ(), p003X.C136834cXV.LIZIZ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
        r0 = r9.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r0.refreshCombinePayHeader();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
        r0 = r9.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
        r0.refreshCardList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
        LIZ("", true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0091, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02d6, code lost:
        r1 = r9.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02d8, code lost:
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02da, code lost:
        r1.setErrorType(com.android.ttcjpaysdk.base.service.ICJPayCombineService.CombinePayErrorType.NewCardOtherError);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02df, code lost:
        LIZ("", true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02e2, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02e3, code lost:
        LIZ(r9, "", true, false, 4, null);
        LIZ().LJIJI();
        LIZ().LJIILL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02fb, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006c, code lost:
        if (r3 != null) goto L23;
     */
    @Override // p003X.AbstractActivityC136021cKO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onEvent(com.android.ttcjpaysdk.base.eventbus.BaseEvent r10) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.activity.CJPayCounterActivity.onEvent(com.android.ttcjpaysdk.base.eventbus.BaseEvent):void");
    }

    public final void LIZ(C2176e c2176e) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{c2176e}, this, LIZ, false, 86).isSupported) {
            return;
        }
        C116971W2r.LIZJ(new DialogC135276c8N(this, 0, 2).LIZ(c2176e));
        C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        if (c2176e != null) {
            if (TextUtils.isEmpty(c2176e.error_code)) {
                str = "0";
            } else {
                str = c2176e.error_code;
            }
            jSONObject.put("error_code", str);
            if (TextUtils.isEmpty(c2176e.error_code)) {
                str2 = "正常";
            } else {
                str2 = c2176e.error_message;
            }
            jSONObject.put(PushMessageHelper.ERROR_MESSAGE, str2);
        }
        c137121cc9.LIZ("wallet_cashier_incomeinfo_pop_imp", jSONObject);
    }

    private final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 93).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", str);
            C137356cfw.LIZIZ.LIZ("wallet_cashier_imp_failed", jSONObject.put("error_msg", str2));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZ, false, 91);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 4) {
            this.LJIJ = true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void LIZIZ(String str, boolean z) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 83).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_name", str);
            if (z) {
                i = 1;
            }
            jSONObject.put("is_discount", i);
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ("wallet_cashier_method_keep_pop_click", jSONObject);
    }

    private final void LIZ(String str, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 30).isSupported) {
            return;
        }
        C2272a c2272a = this.LIZJ;
        if (c2272a != null) {
            c2272a.LJIILLIIL = z;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("service", str);
        }
        CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.INTEGRATED_COUNTER, CJPayPageLoadTrace.Section.NETWORK);
        if (z) {
            disablePageClickEvent(true);
        } else {
            disablePageClickEvent(false);
        }
        C2283c c2283c = (C2283c) this.mBasePresenter;
        if (c2283c != null) {
            c2283c.LIZ(hashMap, z2);
        }
    }

    public final void LIZ(ICJPayCombineService.CombinePaySource combinePaySource, ICJPayCombineService.CombinePayErrorType combinePayErrorType, ICJPayCombineService.CombineType combineType) {
        if (PatchProxy.proxy(new Object[]{combinePaySource, combinePayErrorType, combineType}, this, LIZ, false, 63).isSupported) {
            return;
        }
        C106862S5w.LIZ(combinePaySource, combinePayErrorType, combineType);
        ICJPayCombineService iCJPayCombineService = this.LJI;
        if (iCJPayCombineService != null) {
            iCJPayCombineService.setPaySource(combinePaySource);
        }
        ICJPayCombineService iCJPayCombineService2 = this.LJI;
        if (iCJPayCombineService2 != null) {
            iCJPayCombineService2.setErrorType(combinePayErrorType);
        }
        ICJPayCombineService iCJPayCombineService3 = this.LJI;
        if (iCJPayCombineService3 != null) {
            iCJPayCombineService3.setCombineType(combineType);
        }
        C2272a.LIZ(combineType.getType());
        C136742cW1 c136742cW1 = this.LIZIZ;
        if (c136742cW1 != null) {
            c136742cW1.LIZ(LIZJ(), C136834cXV.LIZIZ(), C136834cXV.LIZIZ());
        }
    }

    public static /* synthetic */ void LIZ(CJPayCounterActivity cJPayCounterActivity, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{cJPayCounterActivity, (byte) 0, 1, null}, null, LIZ, true, 17).isSupported) {
            return;
        }
        cJPayCounterActivity.LIZ(false);
    }

    private final void LIZ(String str, String str2, String str3, String str4) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, LIZ, false, 92).isSupported) {
            return;
        }
        C2272a.LJIIJJI = str;
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            if (hashCode != 1445) {
                if (hashCode == 1446 && str.equals("-3")) {
                    LJIIJJI();
                    if (str4.length() <= 0 || str4 == null) {
                        str4 = getString(2131561578);
                        Intrinsics.checkNotNullExpressionValue(str4, "");
                    }
                    this.LJIIZILJ = str4;
                    ArrayList<C2280y> arrayList = C2272a.LIZ().paytype_info.sub_pay_type_sum_info.sub_pay_type_info_list;
                    Intrinsics.checkNotNullExpressionValue(arrayList, "");
                    Iterator<T> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            if (Intrinsics.areEqual(((C2280y) obj4).sub_pay_type, "credit_pay")) {
                                break;
                            }
                        } else {
                            obj4 = null;
                            break;
                        }
                    }
                    C2280y c2280y = (C2280y) obj4;
                    if (c2280y != null) {
                        c2280y.status = "0";
                        return;
                    }
                    return;
                }
            } else if (str.equals("-2")) {
                C2272a.LJIIJJI = "";
                return;
            }
        } else if (str.equals("0")) {
            try {
                i = Integer.parseInt(str2);
            } catch (Exception unused) {
                i = -1;
            }
            if (i < C2272a.f25499LJ.data.pay_params.channel_data.pay_info.real_trade_amount_raw) {
                C2272a.LJIIJJI = "-4";
                String string = getString(2131561580);
                Intrinsics.checkNotNullExpressionValue(string, "");
                this.LJIIZILJ = string;
                LJIIJJI();
                ArrayList<C2280y> arrayList2 = C2272a.LIZ().paytype_info.sub_pay_type_sum_info.sub_pay_type_info_list;
                Intrinsics.checkNotNullExpressionValue(arrayList2, "");
                Iterator<T> it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (Intrinsics.areEqual(((C2280y) obj2).sub_pay_type, "credit_pay")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                C2280y c2280y2 = (C2280y) obj2;
                if (c2280y2 != null) {
                    c2280y2.status = "0";
                    return;
                }
                return;
            }
            if (str3.length() <= 0 || str3 == null) {
                str3 = getString(2131561576);
                Intrinsics.checkNotNullExpressionValue(str3, "");
            }
            CJPayBasicUtils.displayToast(this, str3);
            ArrayList<C2280y> arrayList3 = C2272a.LIZ().paytype_info.sub_pay_type_sum_info.sub_pay_type_info_list;
            Intrinsics.checkNotNullExpressionValue(arrayList3, "");
            Iterator<T> it3 = arrayList3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (Intrinsics.areEqual(((C2280y) obj).sub_pay_type, "credit_pay")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C2280y c2280y3 = (C2280y) obj;
            if (c2280y3 != null) {
                c2280y3.status = "1";
            }
            LIZ().LJIIL();
            return;
        }
        LJIIJJI();
        if (str4.length() <= 0 || str4 == null) {
            str4 = getString(2131561574);
            Intrinsics.checkNotNullExpressionValue(str4, "");
        }
        this.LJIIZILJ = str4;
        ArrayList<C2280y> arrayList4 = C2272a.LIZ().paytype_info.sub_pay_type_sum_info.sub_pay_type_info_list;
        Intrinsics.checkNotNullExpressionValue(arrayList4, "");
        Iterator<T> it4 = arrayList4.iterator();
        while (true) {
            if (it4.hasNext()) {
                obj3 = it4.next();
                if (Intrinsics.areEqual(((C2280y) obj3).sub_pay_type, "credit_pay")) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        C2280y c2280y4 = (C2280y) obj3;
        if (c2280y4 != null) {
            c2280y4.status = "0";
        }
    }

    public static /* synthetic */ void LIZ(CJPayCounterActivity cJPayCounterActivity, String str, boolean z, boolean z2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{cJPayCounterActivity, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, 4, null}, null, LIZ, true, 31).isSupported) {
            return;
        }
        cJPayCounterActivity.LIZ(str, z, false);
    }
}
