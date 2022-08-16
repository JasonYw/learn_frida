package com.android.ttcjpaysdk.thirdparty.fingerprint;

import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity;
import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.AbstractC135948cJD;
import p003X.C116971W2r;
import p003X.C136058cKz;
import p003X.C136689cVA;
import p003X.C136694cVF;
import p003X.C136700cVL;
import p003X.C136704cVP;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPayInputPasswordActivity extends CJPayBaseActivity {
    public static ChangeQuickRedirect LIZ;
    public FragmentTransaction LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public CJPayFaceVerifyInfo f25524LJ;
    public ICJPayFingerprintService LJFF;
    public int LJI;
    public ViewGroup LJII;

    static {
        Covode.recordClassIndex(8420);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690564;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZIZ(this);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
        CJPayActivityManager.allowCaptureScreen(this);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        CJPayActivityManager.disallowCaptureScreen(this);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 18).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 17).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
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

    private void LIZ(C136689cVA c136689cVA) {
        if (PatchProxy.proxy(new Object[]{c136689cVA}, this, LIZ, false, 12).isSupported) {
            return;
        }
        c136689cVA.LIZ(new AbstractC135948cJD() { // from class: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayInputPasswordActivity.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8421);
            }

            @Override // p003X.AbstractC135948cJD
            public final void LIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                CJPayInputPasswordActivity cJPayInputPasswordActivity = CJPayInputPasswordActivity.this;
                cJPayInputPasswordActivity.LIZ(cJPayInputPasswordActivity.LIZJ);
            }
        });
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJI++;
        C136704cVP.LIZ(this.LJI, "wallet_bytepay_introduce_page", str);
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        this.LJII.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayInputPasswordActivity.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8423);
            }

            @Override // java.lang.Runnable
            public final void run() {
                CJPayInputPasswordActivity cJPayInputPasswordActivity;
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && (cJPayInputPasswordActivity = CJPayInputPasswordActivity.this) != null && !cJPayInputPasswordActivity.isFinishing()) {
                    CJPayInputPasswordActivity.this.onBackPressed();
                }
            }
        }, i);
    }

    public final void LIZ(String str) {
        ICJPayFingerprintService iCJPayFingerprintService;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13).isSupported && !isFinishing() && (iCJPayFingerprintService = this.LJFF) != null) {
            iCJPayFingerprintService.showFingerprintDialogInPaymentManager(this, 2131493160, true, true, C136700cVL.LIZ(6), CJPayHostInfo.uid, CJPayHostInfo.LIZIZ(CJPayFingerprintService.LIZIZ), str, new IFingerprintGuideCallback() { // from class: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayInputPasswordActivity.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(8422);
                }

                @Override // com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback
                public final void onAuthErrorEvent() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                        return;
                    }
                    C136704cVP.LIZIZ("失败", "wallet_bytepay_introduce_page");
                    CJPayInputPasswordActivity.this.LIZ(300);
                }

                @Override // com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback
                public final void onAuthFailedEvent() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                        return;
                    }
                    CJPayInputPasswordActivity.this.LIZIZ("失败");
                    C136704cVP.LIZIZ("失败", "wallet_bytepay_introduce_page");
                }

                @Override // com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback
                public final void onAuthSucceededEvent() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                        return;
                    }
                    CJPayInputPasswordActivity.this.LIZIZ("成功");
                    C136704cVP.LIZIZ("成功", "wallet_bytepay_introduce_page");
                }

                @Override // com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback
                public final void onFingerprintDialogCancelClickEvent() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C136700cVL.LIZ("");
                    C136704cVP.LIZIZ("wallet_bytepay_introduce_page");
                    CJPayInputPasswordActivity.this.LIZ(0);
                }

                @Override // com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback
                public final void onFingerprintDialogImpEvent() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    C136704cVP.LIZ("wallet_bytepay_introduce_page");
                }

                @Override // com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback
                public final void onEnableSucceededEvent() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
                        return;
                    }
                    C136700cVL.LIZIZ(CJPayInputPasswordActivity.this.getApplicationContext().getString(2131561644));
                    CJPayInputPasswordActivity.this.LIZ(300);
                }

                @Override // com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback
                public final void onHandleVerifyFingerprintErrorEvent() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
                        return;
                    }
                    C136700cVL.LIZ(CJPayInputPasswordActivity.this.getApplicationContext().getString(2131561639));
                    CJPayInputPasswordActivity.this.LIZ(300);
                }

                @Override // com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback
                public final void onEnableFailedEvent(String str2) {
                    if (PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 5).isSupported) {
                        return;
                    }
                    C136700cVL.LIZ(str2);
                    CJPayInputPasswordActivity.this.LIZ(300);
                }
            });
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
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
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            if (getIntent() != null) {
                this.LIZJ = getIntent().getStringExtra("member_biz_order_no");
                this.LIZLLL = getIntent().getStringExtra("verify_type");
                if ("livepwd".equals(this.LIZLLL)) {
                    try {
                        this.f25524LJ = (CJPayFaceVerifyInfo) getIntent().getSerializableExtra("verify_info");
                    } catch (Exception unused2) {
                    }
                }
            }
            this.LJFF = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
            ICJPayFingerprintService iCJPayFingerprintService = this.LJFF;
            if (iCJPayFingerprintService != null) {
                iCJPayFingerprintService.releaseFingerprintGuide();
            }
        }
        this.LJII = (ViewGroup) findViewById(2131170063);
        String str2 = this.LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 9);
        if (!proxy.isSupported ? !("onlypwd".equals(str2) || "livepwd".equals(str2) || "skip".equals(str2)) : !((Boolean) proxy.result).booleanValue()) {
            LIZ(new C136694cVF(), false);
        } else {
            String str3 = this.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{str3}, this, LIZ, false, 10).isSupported) {
                int hashCode = str3.hashCode();
                if (hashCode != -1313643503) {
                    if (hashCode != 3532159) {
                        if (hashCode == 184306385 && str3.equals("livepwd")) {
                            C136689cVA LIZ2 = LIZ(this.LIZJ, str3, this.f25524LJ);
                            LIZ(LIZ2, false);
                            LIZ(LIZ2);
                        }
                    } else if (str3.equals("skip")) {
                        LIZ(this.LIZJ);
                    }
                } else if (str3.equals("onlypwd")) {
                    C136689cVA LIZ3 = LIZ(this.LIZJ, str3, null);
                    LIZ(LIZ3, false);
                    LIZ(LIZ3);
                }
            }
        }
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        window.setStatusBarColor(C116971W2r.LIZ(getResources(), 2131624874));
        this.LJII.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131624874));
        String str4 = "";
        if (CJPayFingerprintService.LIZIZ != null) {
            if (CJPayFingerprintService.LIZIZ.appId != null) {
                str = CJPayFingerprintService.LIZIZ.appId;
            } else {
                str = str4;
            }
            if (CJPayFingerprintService.LIZIZ.merchantId != null) {
                str4 = CJPayFingerprintService.LIZIZ.merchantId;
            }
        } else {
            str = str4;
        }
        C136704cVP.LIZ(str, str4);
    }

    private void LIZ(Fragment fragment, boolean z) {
        if (!PatchProxy.proxy(new Object[]{fragment, (byte) 0}, this, LIZ, false, 4).isSupported && fragment != null) {
            try {
                this.LIZIZ = getSupportFragmentManager().beginTransaction();
                this.LIZIZ.add(2131170064, fragment);
                this.LIZIZ.commitAllowingStateLoss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private C136689cVA LIZ(String str, String str2, CJPayFaceVerifyInfo cJPayFaceVerifyInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, cJPayFaceVerifyInfo}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (C136689cVA) proxy.result;
        }
        Bundle bundle = new Bundle();
        C136689cVA c136689cVA = new C136689cVA();
        bundle.putString("member_biz_order_no", str);
        bundle.putString("verify_type", str2);
        if (cJPayFaceVerifyInfo != null) {
            bundle.putSerializable("verify_info", cJPayFaceVerifyInfo);
        }
        c136689cVA.setArguments(bundle);
        return c136689cVA;
    }
}
