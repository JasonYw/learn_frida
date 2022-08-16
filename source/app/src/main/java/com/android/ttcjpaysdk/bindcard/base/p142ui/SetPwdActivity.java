package com.android.ttcjpaysdk.bindcard.base.p142ui;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayKeyboardView;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.a$d;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsSignBean;
import com.android.ttcjpaysdk.bindcard.base.p140a.C2200c;
import com.android.ttcjpaysdk.bindcard.base.p141b.C2211c;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.thirdparty.view.CJPayPwdEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.umeng.analytics.pro.C33753n;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractActivityC135987cJq;
import p003X.C106862S5w;
import p003X.C123320YgE;
import p003X.C135565cD2;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C135883cIA;
import p003X.C135998cK1;
import p003X.C136018cKL;
import p003X.C136019cKM;
import p003X.C136023cKQ;
import p003X.C136042cKj;
import p003X.C136215cNW;
import p003X.C136757cWG;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.View$OnClickListenerC136161cMe;
import p003X.View$OnClickListenerC136177cMu;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.ui.SetPwdActivity */
/* loaded from: classes17.dex */
public final class SetPwdActivity extends AbstractActivityC135987cJq<C2211c, C2200c> implements a$d {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZJ;

    /* renamed from: LJ */
    public ICJPayNormalBindCardService f25474LJ;
    public FrameLayout LJFF;
    public C136023cKQ LJI;
    public C136019cKM LJII;
    public boolean LJIIJ;
    public DialogC137460chc LJIIJJI;
    public CJPayKeyboardView LJIIL;
    public HashMap LJIILJJIL;
    public CJPaySmsSignBean LIZIZ = new CJPaySmsSignBean();
    public String LIZLLL = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public CJPayHostInfo LJIILIIL = new CJPayHostInfo();

    static {
        Covode.recordClassIndex(7091);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported && (hashMap = this.LJIILJJIL) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 28);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new HashMap();
        }
        View view = (View) this.LJIILJJIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIILJJIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690560;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135565cD2.class};
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2208b();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
        CJPayActivityManager.allowCaptureScreen(this);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        View findViewById = findViewById(2131175335);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJFF = (FrameLayout) findViewById;
        View findViewById2 = findViewById(2131165334);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJIIL = (CJPayKeyboardView) findViewById2;
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        CJPayActivityManager.disallowCaptureScreen(this);
        C2200c c2200c = this.mvpLogger;
        if (c2200c != null && !PatchProxy.proxy(new Object[0], c2200c, C2200c.LIZ, false, 2).isSupported) {
            C2200c.LIZ(c2200c, "wallet_set_password_imp", null, 2, null);
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        EventManager.INSTANCE.notify(new C135565cD2());
        if (C135734cFl.m21754LJ() != ICJPayNormalBindCardService.SourceType.Pay.getMType() && C135734cFl.m21754LJ() != ICJPayNormalBindCardService.SourceType.MyBindCardTwo.getMType() && C135734cFl.m21754LJ() != ICJPayNormalBindCardService.SourceType.MyBindCard.getMType()) {
            EventManager.INSTANCE.notify(new C135883cIA());
        }
        EventManager.INSTANCE.notifyNow(new C136215cNW(CJPayQuickBindCardUtils.LIZJ()));
        if (this.LIZJ) {
            C2118a.LIZ().LIZ(C33753n.C33755a.f42379f).LIZIZ();
        }
        finish();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        CJPayKeyboardView cJPayKeyboardView = this.LJIIL;
        if (cJPayKeyboardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayKeyboardView.setOnKeyListener(new C136018cKL(this));
        C136023cKQ c136023cKQ = this.LJI;
        if (c136023cKQ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c136023cKQ.LIZ.setOnTextInputListener(new C135998cK1(this));
        C136019cKM c136019cKM = this.LJII;
        if (c136019cKM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c136019cKM.LIZ.setOnTextInputListener(new C136042cKj(this));
        C136019cKM c136019cKM2 = this.LJII;
        if (c136019cKM2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(c136019cKM2.LIZIZ, 0L, new SetPwdActivity$initActions$4(this), 1, null);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        AbstractActivityC135987cJq.setTitleText$default(this, "", 0, 2, null);
        setTitleLeftIcon(2130840369);
        this.LJI = new C136023cKQ(findViewById(2131170057));
        this.LJII = new C136019cKM(findViewById(2131170058));
        CJPayKeyboardView cJPayKeyboardView = this.LJIIL;
        if (cJPayKeyboardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayKeyboardView.showInsurance();
        LIZ(false);
        LIZ();
        LIZIZ(false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(this);
            defaultBuilder.setTitle(getString(2131561937));
            defaultBuilder.setLeftBtnStr(getString(2131561939));
            defaultBuilder.setRightBtnStr(getString(2131561938));
            defaultBuilder.setLeftBtnListener(new View$OnClickListenerC136161cMe(this));
            defaultBuilder.setRightBtnListener(new View$OnClickListenerC136177cMu(this));
            showCommonDialog(defaultBuilder);
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 36).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 35).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 34).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
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

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJIIIIZZ = "";
        C136019cKM c136019cKM = this.LJII;
        if (c136019cKM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c136019cKM.LIZ != null) {
            C136019cKM c136019cKM2 = this.LJII;
            if (c136019cKM2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            CJPayPwdEditText cJPayPwdEditText = c136019cKM2.LIZ;
            Intrinsics.checkNotNullExpressionValue(cJPayPwdEditText, "");
            cJPayPwdEditText.setText(this.LJIIIIZZ);
            C136019cKM c136019cKM3 = this.LJII;
            if (c136019cKM3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c136019cKM3.LIZ.postInvalidate();
        }
        C136023cKQ c136023cKQ = this.LJI;
        if (c136023cKQ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c136023cKQ.LIZ != null) {
            C136023cKQ c136023cKQ2 = this.LJI;
            if (c136023cKQ2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            CJPayPwdEditText cJPayPwdEditText2 = c136023cKQ2.LIZ;
            Intrinsics.checkNotNullExpressionValue(cJPayPwdEditText2, "");
            cJPayPwdEditText2.setText(this.LJIIIIZZ);
            C136023cKQ c136023cKQ3 = this.LJI;
            if (c136023cKQ3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c136023cKQ3.LIZ.postInvalidate();
        }
        C136023cKQ c136023cKQ4 = this.LJI;
        if (c136023cKQ4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c136023cKQ4.LIZIZ != null) {
            C136023cKQ c136023cKQ5 = this.LJI;
            if (c136023cKQ5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            TextView textView = c136023cKQ5.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText("");
            C136023cKQ c136023cKQ6 = this.LJI;
            if (c136023cKQ6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            TextView textView2 = c136023cKQ6.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        LIZ(false);
    }

    public final void LIZJ() {
        Animation animation;
        MethodCollector.m14708i(456);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            MethodCollector.m14707o(456);
            return;
        }
        this.LJIIJ = false;
        FrameLayout frameLayout = this.LJFF;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C136023cKQ c136023cKQ = this.LJI;
        if (c136023cKQ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        frameLayout.removeView(c136023cKQ.mRootView);
        FrameLayout frameLayout2 = this.LJFF;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C136023cKQ c136023cKQ2 = this.LJI;
        if (c136023cKQ2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        frameLayout2.addView(c136023cKQ2.mRootView);
        Map<String, Integer> map = CJPayHostInfo.animationResourceMap;
        if (map != null) {
            if (map.containsKey("TTCJPayKeySlideRightInAnimationResource")) {
                C136023cKQ c136023cKQ3 = this.LJI;
                if (c136023cKQ3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                View view = c136023cKQ3.mRootView;
                Integer num = map.get("TTCJPayKeySlideRightInAnimationResource");
                if (num != null) {
                    animation = AnimationUtils.loadAnimation(this, num.intValue());
                } else {
                    animation = null;
                }
                view.startAnimation(animation);
            }
            MethodCollector.m14707o(456);
            return;
        }
        C136023cKQ c136023cKQ4 = this.LJI;
        if (c136023cKQ4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c136023cKQ4.mRootView.startAnimation(AnimationUtils.loadAnimation(this, 2130968823));
        MethodCollector.m14707o(456);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIILIIL = C135876cI3.f17973LJ.LJIIIIZZ();
        C2200c c2200c = this.mvpLogger;
        if (c2200c != null) {
            CJPaySmsSignBean cJPaySmsSignBean = this.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{cJPaySmsSignBean}, c2200c, C2200c.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(cJPaySmsSignBean);
                c2200c.LIZIZ = C135876cI3.f17973LJ.LJIIIIZZ();
                c2200c.LIZJ = cJPaySmsSignBean;
                CJPayHostInfo cJPayHostInfo = c2200c.LIZIZ;
                if (cJPayHostInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                String str = cJPayHostInfo.merchantId;
                if (str == null) {
                    str = "";
                }
                CJPayHostInfo cJPayHostInfo2 = c2200c.LIZIZ;
                if (cJPayHostInfo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                String str2 = cJPayHostInfo2.appId;
                if (str2 == null) {
                    str2 = "";
                }
                JSONObject LIZ2 = CJPayParamsUtils.LIZ(str, str2);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                c2200c.LIZLLL = LIZ2;
                JSONObject jSONObject = c2200c.LIZLLL;
                if (jSONObject == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!PatchProxy.proxy(new Object[]{jSONObject}, c2200c, C2200c.LIZ, false, 13).isSupported) {
                    c2200c.LIZ(jSONObject);
                    if (!TextUtils.isEmpty(C135734cFl.LIZ())) {
                        try {
                            jSONObject.put("source", C135734cFl.LIZ());
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    public static final /* synthetic */ C136023cKQ LIZ(SetPwdActivity setPwdActivity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{setPwdActivity}, null, LIZ, true, 27);
        if (proxy.isSupported) {
            return (C136023cKQ) proxy.result;
        }
        C136023cKQ c136023cKQ = setPwdActivity.LJI;
        if (c136023cKQ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c136023cKQ;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        super.onEvent(baseEvent);
        if (baseEvent instanceof C135565cD2) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public final void LIZ(CJPayPwdEditText cJPayPwdEditText) {
        if (PatchProxy.proxy(new Object[]{cJPayPwdEditText}, this, LIZ, false, 17).isSupported) {
            return;
        }
        String obj = cJPayPwdEditText.getText().toString();
        if (obj.length() > 0) {
            String substring = obj.substring(0, obj.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "");
            cJPayPwdEditText.setText(substring);
            String substring2 = obj.substring(0, obj.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "");
            this.LJIIIIZZ = substring2;
            if (obj.length() == 1) {
                LIZ();
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 30).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 32).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 31).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (z) {
            if (!C136757cWG.f18084LJ.LIZ(this, "")) {
                C136019cKM c136019cKM = this.LJII;
                if (c136019cKM == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                CJPayCustomButton cJPayCustomButton = c136019cKM.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(cJPayCustomButton, "");
                cJPayCustomButton.setText("");
                C136019cKM c136019cKM2 = this.LJII;
                if (c136019cKM2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                ProgressBar progressBar = c136019cKM2.LIZJ;
                Intrinsics.checkNotNullExpressionValue(progressBar, "");
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        C136757cWG.f18084LJ.LIZ();
        C136019cKM c136019cKM3 = this.LJII;
        if (c136019cKM3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ProgressBar progressBar2 = c136019cKM3.LIZJ;
        Intrinsics.checkNotNullExpressionValue(progressBar2, "");
        progressBar2.setVisibility(8);
        CJPaySmsSignBean cJPaySmsSignBean = this.LIZIZ;
        if (cJPaySmsSignBean != null && !cJPaySmsSignBean.isNeedCardInfo) {
            C136019cKM c136019cKM4 = this.LJII;
            if (c136019cKM4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            CJPayCustomButton cJPayCustomButton2 = c136019cKM4.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(cJPayCustomButton2, "");
            getContext();
            cJPayCustomButton2.setText(getStringRes(this, 2131561568));
            return;
        }
        C136019cKM c136019cKM5 = this.LJII;
        if (c136019cKM5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        CJPayCustomButton cJPayCustomButton3 = c136019cKM5.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(cJPayCustomButton3, "");
        getContext();
        cJPayCustomButton3.setText(getStringRes(this, 2131561917));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fd, code lost:
        if (r4.equals(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f4, code lost:
        if (r4.equals("2") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0208, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("MP020401", r20.code) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0212, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("MP040001", r20.code) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("MP010016", r20.code) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0226, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("MP020408", r20.code) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0228, code lost:
        r8 = p003X.C135916cIh.LIZIZ;
        r0 = r19.LJIILIIL;
        r5 = r20.button_info;
        r7 = new p003X.C136181cMy(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0245, code lost:
        if (com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[]{r19, r0, r5, r7}, r8, p003X.C135916cIh.LIZ, false, 2).isSupported != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0247, code lost:
        p003X.C106862S5w.LIZ(r19, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024a, code lost:
        if (r5 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024c, code lost:
        r4 = new kotlin.jvm.internal.Ref.ObjectRef();
        r4.element = null;
        r12 = new p003X.View$OnClickListenerC136103cLi(r4, r7);
        r6 = com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils.getDefaultBuilder(r19);
        r6.setLeftBtnListener(p003X.C135778cGT.LIZ(r5.left_button_action, (p003X.DialogC137460chc) r4.element, r19, r0.merchantId, r0.appId, r12));
        r6.setRightBtnListener(p003X.C135778cGT.LIZ(r5.right_button_action, (p003X.DialogC137460chc) r4.element, r19, r0.merchantId, r0.appId, r12));
        r6.setSingleBtnListener(p003X.C135778cGT.LIZ(r5.action, (p003X.DialogC137460chc) r4.element, r19, r0.merchantId, r0.appId, r12));
        r0 = r6.setAllButtonColor(p003X.C116971W2r.LIZ(getResources(), 2131624875));
        r0.setButtonInfo(r5);
        r4.element = com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils.initDialog(r0);
        r0 = (android.app.Dialog) r4.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b9, code lost:
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02bb, code lost:
        p003X.C116971W2r.LIZJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f7, code lost:
        r7 = r20.button_info.page_desc;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r6 = r20.button_info.button_desc;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x031b, code lost:
        if (com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[]{r7, r6, (byte) 1}, r19, com.android.ttcjpaysdk.bindcard.base.p142ui.SetPwdActivity.LIZ, false, 26).isSupported != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x031d, code lost:
        r4 = new p003X.C137459chb(r19, 2131493160);
        r4.LIZ(r7);
        r4.LIZLLL(r6);
        r4.LIZJ(new p003X.View$OnClickListenerC136114cLt(r19, true));
        r19.LJIIJJI = r4.LIZ();
        r0 = r19.LJIIJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x033b, code lost:
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033d, code lost:
        p003X.C116971W2r.LIZJ(r0);
     */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, X.chc] */
    @Override // com.android.ttcjpaysdk.bindcard.base.a$d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.android.ttcjpaysdk.bindcard.base.bean.C2214b r20) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.base.p142ui.SetPwdActivity.LIZ(com.android.ttcjpaysdk.bindcard.base.bean.b):void");
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C136019cKM c136019cKM = this.LJII;
        if (c136019cKM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        CJPayCustomButton cJPayCustomButton = c136019cKM.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(cJPayCustomButton, "");
        cJPayCustomButton.setEnabled(z);
        C136019cKM c136019cKM2 = this.LJII;
        if (c136019cKM2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        CJPayCustomButton cJPayCustomButton2 = c136019cKM2.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(cJPayCustomButton2, "");
        cJPayCustomButton2.setVisibility(0);
    }

    @Override // com.android.ttcjpaysdk.bindcard.base.a$d
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 11).isSupported) {
            return;
        }
        LIZIZ(false);
        LIZ();
        CJPayBasicUtils.displayToast(this, getResources().getString(2131558456));
    }
}
