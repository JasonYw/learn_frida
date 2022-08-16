package com.android.ttcjpaysdk.thirdparty.supplementarysign.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.ArrayList;
import p003X.AbstractActivityC135632cE7;
import p003X.C135100c5X;
import p003X.C135652cER;
import p003X.C136058cKz;
import p003X.C137405cgj;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPaySSAgreementActivity extends AbstractActivityC135632cE7 {
    public static ChangeQuickRedirect LIZ;
    public FragmentTransaction LIZJ;
    public C135652cER LIZLLL;

    /* renamed from: LJ */
    public C137405cgj f25540LJ;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public String LJIIL;
    public String LJIILIIL;
    public int LIZIZ = 3;
    public volatile boolean LJIIIZ = true;
    public volatile boolean LJIIJ = true;
    public ArrayList<CJPayUserAgreement> LJIIJJI = new ArrayList<>();

    static {
        Covode.recordClassIndex(8810);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    private int LIZIZ() {
        int i;
        if (this.LIZLLL != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f25540LJ != null) {
            return i + 1;
        }
        return i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && CJPayBasicUtils.isClickValid()) {
            int i = this.LIZIZ;
            if (i == 2) {
                LIZ(this.LIZLLL);
            } else if (i == 3) {
                if (LIZIZ() == 1) {
                    LIZ(this.f25540LJ);
                } else {
                    LIZ(3, 2, true, false);
                }
            }
        }
    }

    @Override // p003X.AbstractActivityC135632cE7, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        ICJPaySupplementarySignService iCJPaySupplementarySignService = (ICJPaySupplementarySignService) CJPayServiceManager.getInstance().getIService(ICJPaySupplementarySignService.class);
        if (iCJPaySupplementarySignService != null && iCJPaySupplementarySignService.getCallBack() != null) {
            iCJPaySupplementarySignService.release();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onPostResume();
        if (this.LJIIJ) {
            this.mRootView.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.supplementarysign.activity.CJPaySSAgreementActivity.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(8811);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && CJPayBasicUtils.isClickValid()) {
                        if (CJPaySSAgreementActivity.this.LIZIZ == 2) {
                            CJPaySSAgreementActivity cJPaySSAgreementActivity = CJPaySSAgreementActivity.this;
                            cJPaySSAgreementActivity.LIZ(cJPaySSAgreementActivity.LIZLLL);
                        } else if (CJPaySSAgreementActivity.this.LIZIZ == 3) {
                            CJPaySSAgreementActivity cJPaySSAgreementActivity2 = CJPaySSAgreementActivity.this;
                            cJPaySSAgreementActivity2.LIZ(cJPaySSAgreementActivity2.f25540LJ);
                        }
                    }
                }
            });
        }
    }

    @Override // p003X.AbstractActivityC135632cE7, com.android.ttcjpaysdk.thirdparty.base.CJPaySingleFragmentActivity, com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 26).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 25).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
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

    @Override // p003X.AbstractActivityC135632cE7
    public final Fragment LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            if (getIntent() != null) {
                this.LIZIZ = getIntent().getIntExtra("key_ss_fragment_show_type_param", 3);
                this.LJII = getIntent().getBooleanExtra("ss_param_is_show_next_btn", false);
                this.LJIIIIZZ = getIntent().getBooleanExtra("ss_param_is_show_next_btn_for_agreement_detail", false);
                this.LJIIIZ = getIntent().getBooleanExtra("ss_param_is_show_with_animation", true);
                this.LJIIJ = getIntent().getBooleanExtra("ss_param_is_click_outside_enable", true);
                this.LJIIJJI = (ArrayList) getIntent().getSerializableExtra("ss_param_agreement_data");
            }
            ArrayList<CJPayUserAgreement> arrayList = this.LJIIJJI;
            if (arrayList != null && arrayList.size() != 0 && this.LIZIZ == 3) {
                this.LJIIL = this.LJIIJJI.get(0).title;
                this.LJIILIIL = this.LJIIJJI.get(0).content_url;
            }
        }
        return LIZIZ(this.LJIIIZ);
    }

    private Fragment LIZIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        Bundle bundle = new Bundle();
        int i = this.LIZIZ;
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            this.f25540LJ = new C137405cgj();
            this.f25540LJ.LIZ(this.LJIILIIL, this.LJIIL);
            bundle.putBoolean("ss_param_is_show_next_btn", this.LJIIIIZZ);
            bundle.putBoolean("ss_param_is_show_with_animation", z);
            if (LIZIZ() == 1) {
                bundle.putBoolean("ss_param_is_back_close", true);
            }
            this.f25540LJ.setArguments(bundle);
            return this.f25540LJ;
        }
        this.LIZLLL = new C135652cER();
        this.LIZLLL.LIZ(this.LJIIJJI);
        bundle.putBoolean("ss_param_is_show_next_btn", this.LJII);
        bundle.putBoolean("ss_param_is_show_with_animation", z);
        this.LIZLLL.setArguments(bundle);
        return this.LIZLLL;
    }

    public final void LIZ(CJPayBaseFragment cJPayBaseFragment) {
        if (PatchProxy.proxy(new Object[]{cJPayBaseFragment}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (cJPayBaseFragment != null) {
            cJPayBaseFragment.LIZIZ(true, false);
            C135100c5X.LIZIZ(this.mRootView, 1291845632, ViewCompat.MEASURED_STATE_TOO_SMALL);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.supplementarysign.activity.CJPaySSAgreementActivity.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8812);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !CJPaySSAgreementActivity.this.isFinishing()) {
                    CJPaySSAgreementActivity.this.finish();
                }
            }
        }, 300L);
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
        LIZ(false);
        C135100c5X.LIZIZ(this.mRootView, 0, 1291845632);
        this.mRootView.setFitsSystemWindows(true);
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJIIL = str2;
        this.LJIILIIL = str;
        LIZ(-1, 3, true, false);
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

    private void LIZ(int i, int i2, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), (byte) 1, (byte) 0}, this, LIZ, false, 6).isSupported || this.LIZIZ == i2) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), (byte) 1}, this, LIZ, false, 7).isSupported) {
            if (i != 2) {
                if (i == 3) {
                    LIZJ(this.f25540LJ, true);
                    this.f25540LJ = null;
                }
            } else {
                LIZJ(this.LIZLLL, true);
                this.LIZLLL = null;
            }
        }
        this.LIZIZ = i2;
        if (!PatchProxy.proxy(new Object[]{(byte) 1, (byte) 0}, this, LIZ, false, 10).isSupported) {
            int i3 = this.LIZIZ;
            if (i3 != 2) {
                if (i3 == 3) {
                    C137405cgj c137405cgj = this.f25540LJ;
                    if (c137405cgj == null) {
                        LIZ(LIZIZ(false), true);
                        return;
                    } else {
                        LIZIZ(c137405cgj, true);
                        return;
                    }
                }
                return;
            }
            C135652cER c135652cER = this.LIZLLL;
            if (c135652cER == null) {
                LIZ(LIZIZ(this.LJIIIZ), true);
            } else {
                LIZIZ(c135652cER, true);
            }
        }
    }
}
