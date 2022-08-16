package com.android.ttcjpaysdk.bindcard.base.p142ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.framework.BaseFragment;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.AbstractActivityC135714cFR;
import p003X.C135100c5X;
import p003X.C135951cJG;
import p003X.C135952cJH;
import p003X.C135953cJI;
import p003X.C136058cKz;
import p003X.GOY;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.ui.CJPaySmsCodeCheckActivity */
/* loaded from: classes17.dex */
public class CJPaySmsCodeCheckActivity extends AbstractActivityC135714cFR {
    public static ChangeQuickRedirect LIZ;
    public C135951cJG LIZIZ;
    public C135952cJH LIZJ;
    public FragmentTransaction LIZLLL;

    /* renamed from: LJ */
    public volatile boolean f25473LJ;
    public CJPayRealNameBean LJFF;
    public String LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public String LJIIIZ = "";
    public int LJIIJ;
    public FrameLayout LJIIJJI;

    static {
        Covode.recordClassIndex(7089);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public int getLayoutId() {
        return 2131690563;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public C2124b getModel() {
        return null;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initActions() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initData() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initViews() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void next() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    private BaseFragment LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (BaseFragment) proxy.result;
        }
        int i = this.LJIIJ;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            this.LIZJ = new C135952cJH();
            return this.LIZJ;
        }
        this.LIZIZ = new C135951cJG();
        return this.LIZIZ;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        findViewById(2131190058);
        this.LJIIJJI = (FrameLayout) findViewById(2131175145);
        this.LJIIJJI.getLayoutParams().height = CJPayBasicUtils.getScreenHeight((Activity) this);
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 21).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 20).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
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
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && CJPayBasicUtils.isClickValid() && !this.f25473LJ) {
            int i = this.LJIIJ;
            if (i == 0) {
                C135951cJG c135951cJG = this.LIZIZ;
                if (!PatchProxy.proxy(new Object[]{c135951cJG}, this, LIZ, false, 14).isSupported) {
                    if (c135951cJG != null) {
                        c135951cJG.LIZIZ(true, false);
                        C135100c5X.LIZIZ(getLayoutRootView(), 1291845632, ViewCompat.MEASURED_STATE_TOO_SMALL);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.bindcard.base.ui.CJPaySmsCodeCheckActivity.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(7090);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported || CJPaySmsCodeCheckActivity.this.isFinishing()) {
                                return;
                            }
                            CJPaySmsCodeCheckActivity.this.finish();
                        }
                    }, 300L);
                }
            } else if (i == 1) {
                LIZ(1, 0, true);
                C135951cJG c135951cJG2 = this.LIZIZ;
                if (c135951cJG2 != null && !PatchProxy.proxy(new Object[0], c135951cJG2, C135951cJG.f17978LJ, false, 26).isSupported && c135951cJG2.LJIILL != null && c135951cJG2.getActivity() != null) {
                    C135953cJI c135953cJI = c135951cJG2.LJIILL;
                    FragmentActivity activity = c135951cJG2.getActivity();
                    if (!PatchProxy.proxy(new Object[]{activity}, c135953cJI, C135953cJI.LIZ, false, 10).isSupported) {
                        if (C135953cJI.LJFF.LIZ()) {
                            c135953cJI.LIZ(activity);
                        } else {
                            c135953cJI.LIZJ.setUnderlineFocusColor(c135953cJI.LIZJ.getLastInputPosition());
                        }
                    }
                }
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        setHalfTranslucent();
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
        setStatusBarColor("#01000000");
        C135100c5X.LIZIZ(getLayoutRootView(), ViewCompat.MEASURED_STATE_TOO_SMALL, 1291845632);
        LIZ(true);
    }

    private void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        int i = this.LJIIJ;
        if (i != 0) {
            if (i == 1) {
                C135952cJH c135952cJH = this.LIZJ;
                if (c135952cJH == null) {
                    LIZ(LIZ(), z);
                    return;
                } else {
                    LIZIZ(c135952cJH, z);
                    return;
                }
            }
            return;
        }
        C135951cJG c135951cJG = this.LIZIZ;
        if (c135951cJG == null) {
            LIZ(LIZ(), z);
        } else {
            LIZIZ(c135951cJG, z);
        }
    }

    private void LIZIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported && fragment != null) {
            this.LIZLLL = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZ(this.LIZLLL);
            }
            this.LIZLLL.show(fragment);
            this.LIZLLL.commitAllowingStateLoss();
        }
    }

    private void LIZJ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported && fragment != null) {
            this.LIZLLL = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZIZ(this.LIZLLL);
            }
            this.LIZLLL.remove(fragment);
            this.LIZLLL.commitAllowingStateLoss();
        }
    }

    private void LIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported && fragment != null) {
            this.LIZLLL = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZIZ(this.LIZLLL);
            }
            this.LIZLLL.add(2131175145, fragment);
            this.LIZLLL.commitAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C135951cJG c135951cJG;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 15).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == -1 && this.LJIIJ == 0 && (c135951cJG = this.LIZIZ) != null && !PatchProxy.proxy(new Object[0], c135951cJG, C135951cJG.f17978LJ, false, 27).isSupported && c135951cJG.getActivity() != null && c135951cJG.LJIILL != null && c135951cJG.LJIILL.LIZ()) {
            c135951cJG.LJIIIZ();
        }
    }

    public final void LIZ(int i, int i2, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, LIZ, false, 4).isSupported || this.LJIIJ == i2) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), (byte) 1}, this, LIZ, false, 5).isSupported) {
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
        this.LJIIJ = i2;
        LIZ(true);
    }
}
