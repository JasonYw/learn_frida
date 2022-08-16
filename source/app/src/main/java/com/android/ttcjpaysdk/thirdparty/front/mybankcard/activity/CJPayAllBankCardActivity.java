package com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.p135ui.SwipeToFinishView;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C135343c9S;
import p003X.C135581cDI;
import p003X.C135590cDR;
import p003X.C135591cDS;
import p003X.C135592cDT;
import p003X.C135593cDU;
import p003X.C135596cDX;
import p003X.C135610cDl;
import p003X.C135612cDn;
import p003X.C135876cI3;
import p003X.C135983cJm;
import p003X.C136058cKz;
import p003X.GOY;
import p003X.View$OnClickListenerC135589cDQ;
import p003X.View$OnClickListenerC135594cDV;

/* loaded from: classes17.dex */
public final class CJPayAllBankCardActivity extends CJPayBaseActivity implements AbstractC2126a {
    public static ChangeQuickRedirect LIZ;
    public CJPayTextLoadingView LIZIZ;
    public TextView LIZJ;
    public ArrayList<CJPayCard> LIZLLL = new ArrayList<>();

    /* renamed from: LJ */
    public String f25535LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public boolean LJII;
    public RelativeLayout LJIIIIZZ;
    public ImageView LJIIIZ;
    public TextView LJIIJ;
    public ExtendRecyclerView LJIIJJI;
    public LinearLayout LJIIL;
    public LinearLayout LJIILIIL;
    public TextView LJIILJJIL;
    public View LJIILL;
    public C135581cDI LJIILLIIL;
    public LinearLayout LJIIZILJ;

    static {
        Covode.recordClassIndex(8694);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final int getLayout() {
        return 2131690546;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public final Class<? extends BaseEvent>[] listEvents() {
        return new Class[]{C135612cDn.class, C135610cDl.class};
    }

    @Override // android.app.Activity
    public final void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZ(this);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        EventManager.INSTANCE.unregister(this);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 25).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 24).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
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
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported || !CJPayBasicUtils.isClickValid()) {
            return;
        }
        if (!CJPayBasicUtils.isNetworkAvailable(this)) {
            CJPayBasicUtils.displayToast(this, getStringRes(CJPayHostInfo.applicationContext, 2131558456));
            return;
        }
        CJPayTextLoadingView cJPayTextLoadingView = this.LIZIZ;
        if (cJPayTextLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayTextLoadingView.show();
        LIZ(true);
        ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        if (iCJPayNormalBindCardService == null) {
            return;
        }
        ICJPayNormalBindCardService.BindCardType bindCardType = ICJPayNormalBindCardService.BindCardType.TYPE_MY_BANK_CARD;
        NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
        normalBindCardBean.setNeedAuthGuide(Boolean.valueOf(this.LJII));
        normalBindCardBean.setSource("wallet_bcard_manage");
        normalBindCardBean.setBizOrderType("card_sign");
        normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.MyBindCard);
        normalBindCardBean.setHostInfoJSON(C135876cI3.f17973LJ.LJIIIZ());
        normalBindCardBean.setBindSourceType(4);
        normalBindCardBean.setCardBinAutoFocus(Boolean.FALSE);
        normalBindCardBean.setFront(true);
        iCJPayNormalBindCardService.startBindCardProcess(this, bindCardType, normalBindCardBean, new C135590cDR(this));
    }

    public static final /* synthetic */ CJPayTextLoadingView LIZ(CJPayAllBankCardActivity cJPayAllBankCardActivity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayAllBankCardActivity}, null, LIZ, true, 18);
        if (proxy.isSupported) {
            return (CJPayTextLoadingView) proxy.result;
        }
        CJPayTextLoadingView cJPayTextLoadingView = cJPayAllBankCardActivity.LIZIZ;
        if (cJPayTextLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return cJPayTextLoadingView;
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public final void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        if ((baseEvent instanceof C135610cDl) || (baseEvent instanceof C135612cDn)) {
            finish();
            C136058cKz.LIZIZ(this);
        }
    }

    public final void LIZ(boolean z) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        View view = this.LJIILL;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        this.mSwipeToFinishView.setEnableSwipe(!z ? 1 : 0);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        MethodCollector.m14708i(532);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(532);
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            int i = Build.VERSION.SDK_INT;
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(CastProtectorUtils.parseColor("#00000000"));
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "");
            decorView.setSystemUiVisibility(AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END);
            supportMultipleTheme();
        }
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
        EventManager.INSTANCE.register(this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            this.mSwipeToFinishView = new SwipeToFinishView(this);
            this.mSwipeToFinishView.setBackgroundColor("#00000000");
            View findViewById = findViewById(2131169916);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZIZ = (CJPayTextLoadingView) findViewById;
            View findViewById2 = findViewById(2131196914);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.LJIILL = findViewById2;
            View view = this.LJIILL;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view.setVisibility(8);
            View view2 = this.LJIILL;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view2.setOnClickListener(View$OnClickListenerC135594cDV.LIZ);
            View findViewById3 = findViewById(2131169645);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            this.LJIIZILJ = (LinearLayout) findViewById3;
            View findViewById4 = findViewById(2131169870);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "");
            this.LIZJ = (TextView) findViewById4;
            TextView textView = this.LIZJ;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView.setText(2131561492);
            LinearLayout linearLayout = this.LJIIZILJ;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            linearLayout.setOnClickListener(new View$OnClickListenerC135589cDQ(this));
            if (C135983cJm.LIZIZ.LIZ()) {
                LinearLayout linearLayout2 = this.LJIIZILJ;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                linearLayout2.setVisibility(0);
                C135596cDX c135596cDX = C135596cDX.LIZLLL;
                TextView textView2 = this.LIZJ;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c135596cDX.LIZ("wallet_bcard_manager_all_page", textView2.getText().toString(), false);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                View findViewById5 = findViewById(2131188333);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "");
                this.LJIIIIZZ = (RelativeLayout) findViewById5;
                C135343c9S LIZ2 = C135343c9S.LIZ();
                RelativeLayout relativeLayout = this.LJIIIIZZ;
                if (relativeLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LIZ2.LIZ((Activity) this, (View) relativeLayout, true);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                View findViewById6 = findViewById(2131165337);
                Intrinsics.checkNotNullExpressionValue(findViewById6, "");
                this.LJIIIZ = (ImageView) findViewById6;
                ImageView imageView = this.LJIIIZ;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                imageView.setOnClickListener(new C135592cDT(this));
                View findViewById7 = findViewById(2131170118);
                Intrinsics.checkNotNullExpressionValue(findViewById7, "");
                this.LJIIJ = (TextView) findViewById7;
                TextView textView3 = this.LJIIJ;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                textView3.setText(getStringRes(CJPayHostInfo.applicationContext, 2131561467));
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
                View inflate = getLayoutInflater().inflate(2131690717, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "");
                View findViewById8 = inflate.findViewById(2131169693);
                Intrinsics.checkNotNullExpressionValue(findViewById8, "");
                this.LJIIL = (LinearLayout) findViewById8;
                View findViewById9 = inflate.findViewById(2131169726);
                Intrinsics.checkNotNullExpressionValue(findViewById9, "");
                this.LJIILJJIL = (TextView) findViewById9;
                if (true ^ StringsKt__StringsJVMKt.isBlank(this.f25535LJ)) {
                    TextView textView4 = this.LJIILJJIL;
                    if (textView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    textView4.setVisibility(0);
                    TextView textView5 = this.LJIILJJIL;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    textView5.setText(this.f25535LJ);
                }
                View findViewById10 = inflate.findViewById(2131169692);
                Intrinsics.checkNotNullExpressionValue(findViewById10, "");
                this.LJIILIIL = (LinearLayout) findViewById10;
                C135983cJm c135983cJm = C135983cJm.LIZIZ;
                LinearLayout linearLayout3 = this.LJIILIIL;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c135983cJm.LIZ((Activity) this, (View) linearLayout3);
                LinearLayout linearLayout4 = this.LJIILIIL;
                if (linearLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                linearLayout4.setOnClickListener(new C135593cDU(this));
                View findViewById11 = findViewById(2131169702);
                Intrinsics.checkNotNullExpressionValue(findViewById11, "");
                this.LJIIJJI = (ExtendRecyclerView) findViewById11;
                ExtendRecyclerView extendRecyclerView = this.LJIIJJI;
                if (extendRecyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                extendRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                ExtendRecyclerView extendRecyclerView2 = this.LJIIJJI;
                if (extendRecyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LinearLayout linearLayout5 = this.LJIIL;
                if (linearLayout5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                extendRecyclerView2.LIZJ(linearLayout5);
                ExtendRecyclerView extendRecyclerView3 = this.LJIIJJI;
                if (extendRecyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                extendRecyclerView3.setNestedScrollingEnabled(false);
                this.LJIILLIIL = new C135581cDI(this);
                C135581cDI c135581cDI = this.LJIILLIIL;
                if (c135581cDI == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c135581cDI.LIZIZ = "all_cards";
                C135581cDI c135581cDI2 = this.LJIILLIIL;
                if (c135581cDI2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c135581cDI2.f17935LJ = new C135591cDS(this);
                ExtendRecyclerView extendRecyclerView4 = this.LJIIJJI;
                if (extendRecyclerView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                C135581cDI c135581cDI3 = this.LJIILLIIL;
                if (c135581cDI3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                extendRecyclerView4.setAdapter(c135581cDI3);
                C135581cDI c135581cDI4 = this.LJIILLIIL;
                if (c135581cDI4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c135581cDI4.LIZ(this.LIZLLL);
            }
        }
        MethodCollector.m14707o(532);
    }
}
