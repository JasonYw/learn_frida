package com.android.ttcjpaysdk.thirdparty.supplementarysign.activity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.AbstractActivityC135632cE7;
import p003X.C135664cEd;
import p003X.C135780cGV;
import p003X.C136058cKz;
import p003X.C136215cNW;
import p003X.C76765GOh;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPaySSSmsVerifyActivity extends AbstractActivityC135632cE7 {
    public static ChangeQuickRedirect LIZ;
    public C135780cGV LIZIZ;
    public C135664cEd LIZJ;
    public FragmentTransaction LIZLLL;

    /* renamed from: LJ */
    public volatile boolean f25541LJ;
    public int LJII;
    public String LJIIIIZZ;

    static {
        Covode.recordClassIndex(8813);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZ(this);
    }

    @Override // p003X.AbstractActivityC135632cE7, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // p003X.AbstractActivityC135632cE7
    /* renamed from: LIZIZ */
    public CJPayBaseFragment LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (CJPayBaseFragment) proxy.result;
        }
        int i = this.LJII;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            this.LIZJ = new C135664cEd();
            return this.LIZJ;
        }
        this.LIZIZ = new C135780cGV();
        return this.LIZIZ;
    }

    @Override // p003X.AbstractActivityC135632cE7, com.android.ttcjpaysdk.thirdparty.base.CJPaySingleFragmentActivity, com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 27).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 26).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && CJPayBasicUtils.isClickValid() && !this.f25541LJ) {
            int i = this.LJII;
            if (i == 0) {
                C135780cGV c135780cGV = this.LIZIZ;
                if (!PatchProxy.proxy(new Object[]{c135780cGV}, this, LIZ, false, 20).isSupported) {
                    if (c135780cGV != null) {
                        c135780cGV.LIZIZ(true, false);
                        LIZ(this.mRootView, 1291845632, ViewCompat.MEASURED_STATE_TOO_SMALL);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.supplementarysign.activity.CJPaySSSmsVerifyActivity.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(8814);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            CJPaySSSmsVerifyActivity cJPaySSSmsVerifyActivity;
                            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && (cJPaySSSmsVerifyActivity = CJPaySSSmsVerifyActivity.this) != null && !cJPaySSSmsVerifyActivity.isFinishing()) {
                                CJPaySSSmsVerifyActivity.this.finish();
                            }
                        }
                    }, 300L);
                }
            } else if (i == 1) {
                LIZ(1, 0, true);
                C135780cGV c135780cGV2 = this.LIZIZ;
                if (c135780cGV2 != null && !PatchProxy.proxy(new Object[0], c135780cGV2, C135780cGV.LIZ, false, 28).isSupported && c135780cGV2.LIZJ != null) {
                    c135780cGV2.LIZJ.setUnderlineFocusColor(c135780cGV2.LIZJ.getLastInputPosition());
                }
            }
            EventManager.INSTANCE.notifyNow(new C136215cNW(this.LJIIIIZZ));
        }
    }

    @Override // p003X.AbstractActivityC135632cE7, com.android.ttcjpaysdk.thirdparty.base.CJPaySingleFragmentActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
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
        setHalfTranslucent();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            C76765GOh.LIZ((Activity) this);
            if (!PatchProxy.proxy(new Object[]{"#00000000"}, this, LIZ, false, 5).isSupported && this.mRootView != null) {
                this.mRootView.setBackgroundColor(CastProtectorUtils.parseColor("#00000000"));
            }
            C76765GOh.LIZ(this, this.mRootView);
        }
        LIZ(false);
        LIZ(this.mRootView, 0, 1291845632);
        this.mRootView.setFitsSystemWindows(true);
        if (getIntent() != null) {
            this.LJIIIIZZ = getIntent().getStringExtra("token");
        }
    }

    private void LIZJ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported && fragment != null) {
            this.LIZLLL = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZIZ(this.LIZLLL);
            }
            this.LIZLLL.remove(fragment);
            this.LIZLLL.commitAllowingStateLoss();
        }
    }

    private void LIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported && fragment != null) {
            this.LIZLLL = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZIZ(this.LIZLLL);
            }
            this.LIZLLL.add(2131175145, fragment);
            this.LIZLLL.commitAllowingStateLoss();
        }
    }

    private void LIZIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 12).isSupported && fragment != null) {
            this.LIZLLL = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZ(this.LIZLLL);
            }
            this.LIZLLL.show(fragment);
            this.LIZLLL.commitAllowingStateLoss();
        }
    }

    private void LIZ(View view, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 6).isSupported || view == null) {
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", i, i2);
        ofInt.setDuration(300L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C135780cGV c135780cGV;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 22).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == -1 && this.LJII == 0 && (c135780cGV = this.LIZIZ) != null && !PatchProxy.proxy(new Object[0], c135780cGV, C135780cGV.LIZ, false, 29).isSupported && c135780cGV.getActivity() != null) {
            c135780cGV.LIZLLL();
        }
    }

    public final void LIZ(int i, int i2, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, LIZ, false, 8).isSupported || this.LJII == i2) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), (byte) 1}, this, LIZ, false, 9).isSupported) {
            if (i != 0) {
                if (i == 1) {
                    LIZJ(this.LIZJ, true);
                    this.LIZJ = null;
                }
            } else {
                LIZJ(this.LIZIZ, true);
                this.LIZIZ = null;
            }
        }
        this.LJII = i2;
        if (!PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 15).isSupported) {
            int i3 = this.LJII;
            if (i3 != 0) {
                if (i3 == 1) {
                    C135664cEd c135664cEd = this.LIZJ;
                    if (c135664cEd == null) {
                        LIZ(LIZ(), true);
                        return;
                    } else {
                        LIZIZ(c135664cEd, true);
                        return;
                    }
                }
                return;
            }
            C135780cGV c135780cGV = this.LIZIZ;
            if (c135780cGV == null) {
                LIZ(LIZ(), true);
            } else {
                LIZIZ(c135780cGV, true);
            }
        }
    }
}
