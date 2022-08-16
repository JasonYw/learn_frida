package com.android.ttcjpaysdk.base.auth.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.auth.CJPayRealNameAuthService;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayRealNameAuthCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC137454chW;
import p003X.C135423cAk;
import p003X.C135468cBT;
import p003X.C135506cC5;
import p003X.C135507cC6;
import p003X.C136058cKz;
import p003X.C6H;
import p003X.C76765GOh;
import p003X.GOY;

/* loaded from: classes17.dex */
public final class CJPayRealNameAuthActivity extends BaseActivity {
    public static ChangeQuickRedirect LIZ;
    public static final C135506cC5 LIZIZ = new C135506cC5((byte) 0);
    public C135468cBT LIZJ;
    public ViewGroup LIZLLL;

    static {
        Covode.recordClassIndex(5927);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final int getLayout() {
        return 2131690561;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public final void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZIZ(this);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            CJPayRealNameAuthService.LIZIZ = null;
            CJPayRealNameAuthService.LIZLLL = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        View view;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && CJPayBasicUtils.isClickValid()) {
            C135468cBT c135468cBT = this.LIZJ;
            if (c135468cBT == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C135423cAk c135423cAk = c135468cBT.LIZ().LJII;
            if (c135423cAk != null && (view = c135423cAk.mRootView) != null && view.isShown()) {
                CJPayBasicUtils.upAndDownAnimation(view, false, C6H.LIZ(470.0f, this), (AbstractC137454chW) null);
                return;
            }
            TTCJPayRealNameAuthCallback LIZ2 = C135507cC6.LIZ();
            if (LIZ2 != null) {
                LIZ2.onAuthResult(TTCJPayRealNameAuthCallback.AuthResult.AUTH_CANCEL);
            }
            C135468cBT c135468cBT2 = this.LIZJ;
            if (c135468cBT2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C135468cBT.LIZ(c135468cBT2, false, false, 2, null);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.LIZLLL;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.setBackgroundColor(i);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
        C76765GOh.LIZ((Activity) this);
        View findViewById = findViewById(2131169624);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZLLL = (ViewGroup) findViewById;
        ViewGroup viewGroup = this.LIZLLL;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C76765GOh.LIZ(this, viewGroup);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            this.LIZJ = new C135468cBT();
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            C135468cBT c135468cBT = this.LIZJ;
            if (c135468cBT == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            beginTransaction.add(2131169842, c135468cBT);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
