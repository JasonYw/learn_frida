package com.android.ttcjpaysdk.thirdparty.agreement.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayCardProtocolBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.agreement.CJPayAgreementService;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.ArrayList;
import p003X.AbstractActivityC135630cE5;
import p003X.C135100c5X;
import p003X.C135635cEA;
import p003X.C135637cEC;
import p003X.C136058cKz;
import p003X.C137403cgh;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPayAgreementActivity extends AbstractActivityC135630cE5 {
    public static ChangeQuickRedirect LIZ;
    public FragmentTransaction LIZJ;
    public C135637cEC LIZLLL;

    /* renamed from: LJ */
    public C137403cgh f25512LJ;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public String LJIILJJIL;
    public String LJIILL;
    public int LIZIZ = 1;
    public volatile boolean LJIIIIZZ = true;
    public volatile boolean LJIIIZ = true;
    public volatile boolean LJIIJ = true;
    public volatile boolean LJIIJJI = true;
    public ArrayList<CJPayCardProtocolBean> LJIIL = new ArrayList<>();
    public int LJIILIIL = 0;

    static {
        Covode.recordClassIndex(7936);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    private int LIZJ() {
        int i;
        if (this.LIZLLL != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f25512LJ != null) {
            return i + 1;
        }
        return i;
    }

    @Override // p003X.AbstractActivityC135630cE5
    public final Fragment LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        return LIZ(this.LJIIIIZZ);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        setResult(-1);
        finish();
    }

    @Override // p003X.AbstractActivityC135630cE5, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        CJPayAgreementService.LIZIZ = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && CJPayBasicUtils.isClickValid()) {
            int i = this.LIZIZ;
            if (i == 0) {
                LIZ(this.LIZLLL);
            } else if (i == 1) {
                if (LIZJ() == 1) {
                    LIZ(this.f25512LJ);
                } else {
                    LIZ(1, 0, true, false);
                }
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        ArrayList<CJPayCardProtocolBean> arrayList;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onPostResume();
        if (this.LIZLLL != null && (arrayList = this.LJIIL) != null && arrayList.size() > 0) {
            C135637cEC c135637cEC = this.LIZLLL;
            ArrayList<CJPayCardProtocolBean> arrayList2 = this.LJIIL;
            if (!PatchProxy.proxy(new Object[]{arrayList2}, c135637cEC, C135637cEC.LIZ, false, 6).isSupported && arrayList2 != null && arrayList2.size() > 0) {
                c135637cEC.LIZJ.clear();
                c135637cEC.LIZJ.addAll(arrayList2);
                C135635cEA c135635cEA = c135637cEC.LIZIZ;
                ArrayList<CJPayCardProtocolBean> arrayList3 = c135637cEC.LIZJ;
                if (!PatchProxy.proxy(new Object[]{arrayList3}, c135635cEA, C135635cEA.LIZ, false, 1).isSupported && arrayList3 != null && arrayList3.size() != 0) {
                    c135635cEA.LIZIZ.clear();
                    c135635cEA.LIZIZ.addAll(arrayList3);
                    c135635cEA.notifyDataSetChanged();
                }
            }
        }
        if (this.LJIIIZ) {
            this.mRootView.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.agreement.activity.CJPayAgreementActivity.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(7937);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && CJPayBasicUtils.isClickValid()) {
                        if (CJPayAgreementActivity.this.LIZIZ == 0) {
                            CJPayAgreementActivity cJPayAgreementActivity = CJPayAgreementActivity.this;
                            cJPayAgreementActivity.LIZ(cJPayAgreementActivity.LIZLLL);
                        } else if (CJPayAgreementActivity.this.LIZIZ == 1) {
                            CJPayAgreementActivity cJPayAgreementActivity2 = CJPayAgreementActivity.this;
                            cJPayAgreementActivity2.LIZ(cJPayAgreementActivity2.f25512LJ);
                        }
                    }
                }
            });
        }
    }

    @Override // p003X.AbstractActivityC135630cE5, com.android.ttcjpaysdk.thirdparty.base.CJPaySingleFragmentActivity, com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 28).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 27).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
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

    public final void LIZ(CJPayBaseFragment cJPayBaseFragment) {
        if (PatchProxy.proxy(new Object[]{cJPayBaseFragment}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (cJPayBaseFragment != null) {
            cJPayBaseFragment.LIZIZ(true, false);
            if (this.LJIIJJI) {
                C135100c5X.LIZIZ(this.mRootView, 1291845632, ViewCompat.MEASURED_STATE_TOO_SMALL);
            } else {
                C135100c5X.LIZIZ(this.mRootView, ViewCompat.MEASURED_STATE_TOO_SMALL, ViewCompat.MEASURED_STATE_TOO_SMALL);
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.agreement.activity.CJPayAgreementActivity.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7938);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !CJPayAgreementActivity.this.isFinishing()) {
                    CJPayAgreementActivity.this.finish();
                }
            }
        }, 300L);
    }

    private Fragment LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        Bundle bundle = new Bundle();
        int i = this.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            this.f25512LJ = new C137403cgh();
            this.f25512LJ.LIZ(this.LJIILL, this.LJIILJJIL);
            bundle.putBoolean("param_show_next_btn", this.LJII);
            bundle.putBoolean("params_show_with_animation", z);
            bundle.putInt("param_height", this.LJIILIIL);
            if (LIZJ() > 1) {
                bundle.putBoolean("param_is_back_close", false);
            } else {
                bundle.putBoolean("param_is_back_close", this.LJIIJ);
            }
            this.f25512LJ.setArguments(bundle);
            return this.f25512LJ;
        }
        this.LIZLLL = new C135637cEC();
        bundle.putBoolean("param_show_next_btn", this.LJI);
        bundle.putBoolean("params_show_with_animation", z);
        bundle.putInt("param_height", this.LJIILIIL);
        bundle.putBoolean("param_is_back_close", this.LJIIJ);
        this.LIZLLL.setArguments(bundle);
        return this.LIZLLL;
    }

    @Override // p003X.AbstractActivityC135630cE5, com.android.ttcjpaysdk.thirdparty.base.CJPaySingleFragmentActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        setHalfTranslucent();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            if (getIntent() != null) {
                this.LIZIZ = getIntent().getIntExtra("CJPayKeyAgreementTypeParams", 1);
                this.LJI = getIntent().getBooleanExtra("CJPayKeyShowNextBtnParams", false);
                this.LJII = getIntent().getBooleanExtra("CJPayKeyShowNextBtnInDetailPageParams", false);
                this.LJIIIIZZ = getIntent().getBooleanExtra("CJPayKeyShowWithAnimationParams", true);
                this.LJIIIZ = getIntent().getBooleanExtra("CJPayKeyAgreementIsOutsideEnableParams", true);
                this.LJIIJ = getIntent().getBooleanExtra("CJPayKeyAgreementIsBackCloseParams", true);
                this.LJIIJJI = getIntent().getBooleanExtra("CJPayKeyAgreementIsShowBgMaskParams", true);
                this.LJIIL = (ArrayList) getIntent().getSerializableExtra("CJPayKeyAgreementDataParams");
                this.LJIILIIL = getIntent().getIntExtra("CJPayKeyAgreementHeight", 0);
            }
            ArrayList<CJPayCardProtocolBean> arrayList = this.LJIIL;
            if (arrayList != null && arrayList.size() != 0 && this.LIZIZ == 1) {
                this.LJIILJJIL = this.LJIIL.get(0).name;
                this.LJIILL = this.LJIIL.get(0).template_url;
            }
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
        if (this.LJIIJJI) {
            C135100c5X.LIZIZ(this.mRootView, ViewCompat.MEASURED_STATE_TOO_SMALL, 1291845632);
        } else {
            C135100c5X.LIZIZ(this.mRootView, ViewCompat.MEASURED_STATE_TOO_SMALL, ViewCompat.MEASURED_STATE_TOO_SMALL);
        }
        this.mRootView.setFitsSystemWindows(true);
        this.mSwipeToFinishView.setEnableSwipe(false);
    }

    private void LIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported && fragment != null) {
            this.LIZJ = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZIZ(this.LIZJ);
            }
            this.LIZJ.add(2131175145, fragment);
            this.LIZJ.commitAllowingStateLoss();
        }
    }

    private void LIZIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported && fragment != null) {
            this.LIZJ = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZ(this.LIZJ);
            }
            this.LIZJ.show(fragment);
            this.LIZJ.commitAllowingStateLoss();
        }
    }

    private void LIZJ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported && fragment != null) {
            this.LIZJ = getSupportFragmentManager().beginTransaction();
            if (z) {
                C136058cKz.LIZIZ(this.LIZJ);
            }
            this.LIZJ.remove(fragment);
            this.LIZJ.commitAllowingStateLoss();
        }
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJIILJJIL = str2;
        this.LJIILL = str;
        LIZ(-1, 1, true, false);
    }

    private void LIZ(int i, int i2, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), (byte) 1, (byte) 0}, this, LIZ, false, 6).isSupported || this.LIZIZ == i2) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), (byte) 1}, this, LIZ, false, 7).isSupported) {
            if (i != 0) {
                if (i == 1) {
                    LIZJ(this.f25512LJ, true);
                    this.f25512LJ = null;
                }
            } else {
                LIZJ(this.LIZLLL, true);
                this.LIZLLL = null;
            }
        }
        this.LIZIZ = i2;
        if (!PatchProxy.proxy(new Object[]{(byte) 1, (byte) 0}, this, LIZ, false, 10).isSupported) {
            int i3 = this.LIZIZ;
            if (i3 != 0) {
                if (i3 == 1) {
                    C137403cgh c137403cgh = this.f25512LJ;
                    if (c137403cgh == null) {
                        LIZ(LIZ(false), true);
                        return;
                    } else {
                        LIZIZ(c137403cgh, true);
                        return;
                    }
                }
                return;
            }
            C135637cEC c135637cEC = this.LIZLLL;
            if (c135637cEC == null) {
                LIZ(LIZ(this.LJIIIIZZ), true);
            } else {
                LIZIZ(c135637cEC, true);
            }
        }
    }
}
