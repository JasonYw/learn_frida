package com.android.ttcjpaysdk.superpay;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayParamsCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.fastpay.data.ShareData;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C136962cZZ;
import p003X.C136988cZz;
import p003X.C136990ca1;
import p003X.C76765GOh;
import p003X.GOY;

/* loaded from: classes17.dex */
public final class SuperPayVerifyActivity extends BaseActivity {
    public static ChangeQuickRedirect LIZ;
    public static final C136990ca1 LIZJ = new C136990ca1((byte) 0);
    public boolean LIZIZ;
    public ICJPayVerifyFastPayService LIZLLL;

    /* renamed from: LJ */
    public final ICJPayVerifyFastPayParamsCallBack f25510LJ;
    public final C136988cZz LJFF;

    static {
        Covode.recordClassIndex(7922);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final int getLayout() {
        return 2131690565;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public SuperPayVerifyActivity() {
        String str;
        C136962cZZ c136962cZZ = C136962cZZ.LIZIZ;
        CJPayHostInfo LIZ2 = ShareData.LIZ();
        String str2 = null;
        if (LIZ2 != null) {
            str = LIZ2.merchantId;
        } else {
            str = null;
        }
        CJPayHostInfo LIZ3 = ShareData.LIZ();
        this.f25510LJ = c136962cZZ.LIZ(CJPayParamsUtils.LIZ(str, LIZ3 != null ? LIZ3.appId : str2));
        this.LJFF = new C136988cZz(this);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        ShareData.LJFF();
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService = this.LIZLLL;
        if (iCJPayVerifyFastPayService != null) {
            iCJPayVerifyFastPayService.release();
        }
        if (this.LIZIZ) {
            ShareData.ISuperPayCallBack LIZJ2 = ShareData.LIZJ();
            if (LIZJ2 != null) {
                LIZJ2.LIZ();
            }
        } else {
            ShareData.ISuperPayCallBack LIZJ3 = ShareData.LIZJ();
            if (LIZJ3 != null) {
                LIZJ3.LIZIZ();
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Boolean bool;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService = this.LIZLLL;
        if (iCJPayVerifyFastPayService != null) {
            bool = Boolean.valueOf(iCJPayVerifyFastPayService.whenBackPressedExit());
        } else {
            bool = null;
        }
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService2 = this.LIZLLL;
        if (iCJPayVerifyFastPayService2 != null && iCJPayVerifyFastPayService2.onBackPressed()) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                LIZ();
                return;
            }
            return;
        }
        LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 13).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 12).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
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

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String optString;
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService;
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
        View findViewById = findViewById(2131170063);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        C76765GOh.LIZ((Activity) this);
        C76765GOh.LIZ(this, findViewById);
        this.LIZLLL = (ICJPayVerifyFastPayService) CJPayServiceManager.getInstance().getIService(ICJPayVerifyFastPayService.class);
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService2 = this.LIZLLL;
        if (iCJPayVerifyFastPayService2 != null) {
            iCJPayVerifyFastPayService2.initVerifyComponents(this, 2131170064, this.f25510LJ, this.LJFF);
        }
        try {
            JSONObject m16053LJ = ShareData.LJFF.m16053LJ();
            if (m16053LJ != null && (optString = m16053LJ.optString(C2521l.LJIIJ)) != null && optString.length() > 0 && (iCJPayVerifyFastPayService = this.LIZLLL) != null) {
                iCJPayVerifyFastPayService.start(optString, 2, 2, false);
            }
        } catch (Exception unused2) {
        }
    }
}
