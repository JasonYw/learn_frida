package com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.mvp.nothing.PresentorNothing;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.theme.widget.CJPaySquareCheckBox;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a.C2188d;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.umeng.analytics.pro.C33753n;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractActivityC135714cFR;
import p003X.C106862S5w;
import p003X.C135565cD2;
import p003X.C135726cFd;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C135882cI9;
import p003X.C135883cIA;
import p003X.C135996cJz;
import p003X.C136011cKE;
import p003X.C136058cKz;
import p003X.C9H6;
import p003X.GOY;
import p003X.View$OnClickListenerC135881cI8;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.activity.CJPayRealNameGuideActivity */
/* loaded from: classes17.dex */
public final class CJPayRealNameGuideActivity extends AbstractActivityC135714cFR<PresentorNothing, C2188d> implements View.OnClickListener {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public QuickBindCardAdapterBean LIZJ;

    /* renamed from: LJ */
    public CJPaySquareCheckBox f25466LJ;
    public LinearLayout LJFF;
    public TextView LJII;
    public CJPayCustomButton LJIIIIZZ;
    public TextView LJIIIZ;
    public HashMap LJIIJ;
    public String LIZLLL = "";
    public boolean LJI = true;

    static {
        Covode.recordClassIndex(6881);
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && (hashMap = this.LJIIJ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = new HashMap();
        }
        View view = (View) this.LJIIJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690639;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        return null;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        CJPayCustomButton cJPayCustomButton = this.LJIIIIZZ;
        if (cJPayCustomButton != null) {
            cJPayCustomButton.setOnClickListener(this);
        }
        TextView textView = this.LJIIIZ;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC135881cI8(this));
        }
        CJPaySquareCheckBox cJPaySquareCheckBox = this.f25466LJ;
        if (cJPaySquareCheckBox != null) {
            cJPaySquareCheckBox.setOnCheckedChangeListener(new C135882cI9(this));
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        C135726cFd.LIZLLL.LIZ("实名认证");
        CJPayPageLoadTrace.LIZ().LIZIZ(CJPayPageLoadTrace.Page.NEW_CARD_PAY, CJPayPageLoadTrace.Section.END, "实名认证");
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        C2188d c2188d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (c2188d = this.mvpLogger) != null && !PatchProxy.proxy(new Object[0], c2188d, C2188d.LIZ, false, 3).isSupported) {
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
            c2188d.LIZ(LIZLLL);
            try {
                LIZLLL.put("type", 2);
                LIZLLL.put("twoelements_verify_status", 0);
                C135734cFl.LIZ("wallet_identified_guide_page_type_choose", LIZ2, LIZLLL);
            } catch (JSONException unused) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            if (C135734cFl.m21754LJ() == ICJPayNormalBindCardService.SourceType.WithDrawMain.getMType()) {
                EventManager.INSTANCE.notify(new C135883cIA());
            }
            EventManager.INSTANCE.notify(new C135565cD2());
            if (this.LIZIZ) {
                C2118a.LIZ().LIZ(C33753n.C33755a.f42379f).LIZIZ();
            }
            finish();
            C136058cKz.LIZ(this);
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 16).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 15).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
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

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LJII = (TextView) findViewById(2131170118);
        TextView textView = this.LJII;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.LJII;
        if (textView2 != null) {
            getContext();
            textView2.setText(getStringRes(this, 2131561470));
        }
        this.f25466LJ = (CJPaySquareCheckBox) findViewById(2131178525);
        this.LJFF = (LinearLayout) findViewById(2131181493);
        this.LJIIIIZZ = (CJPayCustomButton) findViewById(2131165244);
        this.LJIIIZ = (TextView) findViewById(2131193460);
        C2188d c2188d = this.mvpLogger;
        if (c2188d != null && !PatchProxy.proxy(new Object[0], c2188d, C2188d.LIZ, false, 4).isSupported) {
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
            c2188d.LIZ(LIZLLL);
            try {
                LIZLLL.put("twoelements_verify_status", 0);
                C135734cFl.LIZ("wallet_identified_guide_page_imp", LIZ2, LIZLLL);
            } catch (JSONException unused) {
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 2).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        this.mSwipeToFinishView.setEnableSwipe(false);
        C2188d c2188d = this.mvpLogger;
        if (c2188d != null) {
            c2188d.LIZIZ = this.LIZJ;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CJPaySquareCheckBox cJPaySquareCheckBox;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        if (CJPayBasicUtils.isClickValid()) {
            C2188d c2188d = this.mvpLogger;
            if (c2188d != null && !PatchProxy.proxy(new Object[0], c2188d, C2188d.LIZ, false, 1).isSupported) {
                JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
                JSONObject LIZLLL = C135734cFl.LIZLLL();
                Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
                c2188d.LIZ(LIZLLL);
                try {
                    LIZLLL.put("type", 2);
                    LIZLLL.put("twoelements_verify_status", 0);
                    C135734cFl.LIZ("wallet_identified_guide_page_next_click", LIZ2, LIZLLL);
                } catch (JSONException unused) {
                }
            }
            if (view.getId() == 2131165244 && (cJPaySquareCheckBox = this.f25466LJ) != null && cJPaySquareCheckBox.LIZIZ) {
                QuickBindCardAdapterBean quickBindCardAdapterBean = this.LIZJ;
                if (quickBindCardAdapterBean != null && quickBindCardAdapterBean.needAuthGuide) {
                    CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) CJPayJsonParser.fromJson(CJPayQuickBindCardUtils.LIZIZ(), CJPayNameAndIdentifyCodeBillBean.class);
                    if (cJPayNameAndIdentifyCodeBillBean != null) {
                        C136011cKE LIZ3 = C135996cJz.LIZ().LIZ("/quickbind/TwoElementAuthActivity").LIZ("quick_bind_data", this.LIZJ);
                        QuickBindCardAdapterBean quickBindCardAdapterBean2 = this.LIZJ;
                        if (quickBindCardAdapterBean2 != null) {
                            z = quickBindCardAdapterBean2.isNeedShowAuth;
                        }
                        LIZ3.LIZ("isShowRealNameAuth", z).LIZ("two_element_order_data", cJPayNameAndIdentifyCodeBillBean).LIZ(AnimationType.SlideLeftAndRigth).LIZ(this);
                        return;
                    }
                    return;
                }
                C135996cJz.LIZ().LIZ("/normalbind/CJPayCardBinActivity").LIZ("param_bind_card_info", this.LIZLLL).LIZ("param_is_independent_bind_card", this.LIZIZ).LIZ(AnimationType.SlideLeftAndRigth).LIZ(this);
            } else if (this.LJI) {
                this.LJI = false;
                LinearLayout linearLayout = this.LJFF;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.LJFF;
                if (linearLayout2 != null) {
                    C9H6.LIZ(linearLayout2, new CJPayRealNameGuideActivity$onClick$2(this), 4000L);
                }
            }
        }
    }
}
