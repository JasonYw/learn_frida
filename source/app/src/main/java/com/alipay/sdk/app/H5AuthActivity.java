package com.alipay.sdk.app;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.GOY;

/* loaded from: classes2.dex */
public class H5AuthActivity extends H5PayActivity {
    static {
        Covode.recordClassIndex(4696);
    }

    public void com_alipay_sdk_app_H5AuthActivity__onStop$___twin___() {
        GOY.LIZLLL(this);
        super.onStop();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        GOY.LIZ(this, bundle);
        m19475xb2c62868(this, bundle);
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onPause() {
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onResume() {
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onStart() {
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onStop() {
        m19473x4271bfa5(this);
    }

    @Override // com.alipay.sdk.app.H5PayActivity
    /* renamed from: a */
    public void mo19466a() {
        Object obj = AuthTask.f22000c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com_alipay_sdk_app_H5AuthActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m19474x3505873e(H5AuthActivity h5AuthActivity) {
        h5AuthActivity.com_alipay_sdk_app_H5AuthActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            int i = Build.VERSION.SDK_INT;
            try {
                h5AuthActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_alipay_sdk_app_H5AuthActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m19473x4271bfa5(H5AuthActivity h5AuthActivity) {
        m19474x3505873e(h5AuthActivity);
        int i = Build.VERSION.SDK_INT;
        try {
            h5AuthActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: INVOKESPECIAL_com_alipay_sdk_app_H5AuthActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onCreate */
    public static void m19475xb2c62868(H5PayActivity h5PayActivity, Bundle bundle) {
        super.onCreate(bundle);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(h5PayActivity, h5PayActivity.getResources().getConfiguration());
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }
}
