package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.C3777c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C87549Ked;
import p003X.C87688Kgs;
import p003X.C87942Kky;
import p003X.C87944Kl0;
import p003X.C88172Kog;
import p003X.C88227KpZ;
import p003X.GOY;

/* loaded from: classes5.dex */
public final class PreviewOpenFeatureChooseActivity extends AppCompatActivity {
    public static ChangeQuickRedirect LIZ;
    public C88227KpZ LIZIZ;
    public C88172Kog LIZJ;
    public C3777c LIZLLL;

    /* renamed from: LJ */
    public final /* synthetic */ C87549Ked f26105LJ = new C87549Ked();

    static {
        Covode.recordClassIndex(21375);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            this.f26105LJ.LIZ();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 5).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 4).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                    GOY.LIZLLL(this);
                    if (this.LIZLLL != null) {
                        C87688Kgs c87688Kgs = C87688Kgs.f8558LJ;
                        C3777c c3777c = this.LIZLLL;
                        Intrinsics.checkNotNull(c3777c);
                        if (!PatchProxy.proxy(new Object[]{c3777c}, c87688Kgs, C87688Kgs.LIZ, false, 2).isSupported) {
                            C106862S5w.LIZ(c3777c);
                            c87688Kgs.LIZ();
                            C87688Kgs.LIZJ.addAll(c3777c.LJIILLIIL().LIZ());
                            C87688Kgs.LIZLLL.addAll(c3777c.LJIIZILJ().LIZIZ);
                            C87688Kgs.LIZIZ.addAll(c3777c.LJIILL().LIZ());
                        }
                    }
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LiveData<Boolean> LJFF;
        LiveData<Boolean> LIZIZ;
        MethodCollector.m14708i(1494);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1494);
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
        setContentView(2131700049);
        int i = Build.VERSION.SDK_INT;
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        window.setStatusBarColor(C116971W2r.LIZ(getResources(), 2131629149));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && this.LIZLLL == null) {
            C3777c c3777c = (C3777c) ViewModelProviders.m21142of(this).get(C3777c.class);
            C87688Kgs c87688Kgs = C87688Kgs.f8558LJ;
            Intrinsics.checkNotNullExpressionValue(c3777c, "");
            c87688Kgs.LIZ(c3777c);
            this.LIZLLL = c3777c;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            C3777c c3777c2 = this.LIZLLL;
            if (c3777c2 != null && (LIZIZ = c3777c2.LIZIZ()) != null) {
                LIZIZ.observe(this, new C87942Kky(this));
            }
            C3777c c3777c3 = this.LIZLLL;
            if (c3777c3 != null && (LJFF = c3777c3.LJFF()) != null) {
                LJFF.observe(this, new C87944Kl0(this));
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            if (this.LIZJ == null) {
                this.LIZJ = C88172Kog.LJIILLIIL.LIZ(false);
            }
            if (this.LIZIZ == null) {
                this.LIZIZ = C88227KpZ.LIZJ.LIZ(false);
            }
            C88172Kog c88172Kog = this.LIZJ;
            if (c88172Kog != null) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                Intrinsics.checkNotNullExpressionValue(beginTransaction, "");
                beginTransaction.add(2131175656, c88172Kog);
                beginTransaction.commitAllowingStateLoss();
                MethodCollector.m14707o(1494);
                return;
            }
        }
        MethodCollector.m14707o(1494);
    }
}
