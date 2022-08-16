package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.C76771GOn;
import p003X.C98708OuE;
import p003X.GFI;
import p003X.GOY;

/* loaded from: classes2.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* renamed from: i */
    public boolean f22004i = false;

    static {
        Covode.recordClassIndex(4697);
    }

    @Override // com.alipay.sdk.app.H5PayActivity
    /* renamed from: a */
    public void mo19466a() {
    }

    public void com_alipay_sdk_app_H5OpenAuthActivity__onStop$___twin___() {
        GOY.LIZLLL(this);
        super.onStop();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        GOY.LIZ(this, bundle);
        m19470x44a49a3e(this, bundle);
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
        m19467x6d6eeb8f(this);
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        GOY.m23828LJ(this);
        if (this.f22004i) {
            try {
                C1376a m18923a = C1376a.C1377a.m18923a(getIntent());
                if (m18923a != null) {
                    C1301a.m19212b(this, m18923a, "", m18923a.f22367d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    /* renamed from: com_alipay_sdk_app_H5OpenAuthActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m19468x72675128(H5OpenAuthActivity h5OpenAuthActivity) {
        h5OpenAuthActivity.com_alipay_sdk_app_H5OpenAuthActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            int i = Build.VERSION.SDK_INT;
            try {
                h5OpenAuthActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_alipay_sdk_app_H5OpenAuthActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m19467x6d6eeb8f(H5OpenAuthActivity h5OpenAuthActivity) {
        m19468x72675128(h5OpenAuthActivity);
        int i = Build.VERSION.SDK_INT;
        try {
            h5OpenAuthActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        String str;
        Uri data;
        try {
            C1376a m18923a = C1376a.C1377a.m18923a(intent);
            try {
                m19471x4777b610(this, intent);
                if (intent != null && (data = intent.getData()) != null && data.toString().startsWith("alipays://platformapi/startapp")) {
                    finish();
                }
            } catch (Throwable th) {
                if (intent != null && intent.getData() != null) {
                    str = intent.getData().toString();
                } else {
                    str = "null";
                }
                if (m18923a != null) {
                    C1301a.m19214a(m18923a, "biz", "StartActivityEx", th, str);
                }
                this.f22004i = true;
                throw th;
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    /* renamed from: INVOKESPECIAL_com_alipay_sdk_app_H5OpenAuthActivity_com_bytedance_android_ug_legacy_lancet_ContextLancet_startActivity */
    public static void m19472xcef3cb74(Activity activity, Intent intent) {
        C76771GOn.LIZ(intent, activity, "startActivity1");
        super.startActivity(intent);
    }

    /* renamed from: INVOKESPECIAL_com_alipay_sdk_app_H5OpenAuthActivity_com_bytedance_ies_security_lancet_ContextLancet_startActivitySelf */
    public static void m19471x4777b610(Activity activity, Intent intent) {
        C98708OuE.LIZ(intent, activity, "startActivitySelf1");
        m19469xb144f409(activity, intent);
    }

    /* renamed from: INVOKESPECIAL_com_alipay_sdk_app_H5OpenAuthActivity_com_ss_android_ugc_aweme_splash_hook_StartLaunchActivityLancet_startActivity */
    public static void m19469xb144f409(Activity activity, Intent intent) {
        GFI.LIZIZ(intent);
        GFI.LIZ(intent);
        m19472xcef3cb74(activity, intent);
    }

    /* renamed from: INVOKESPECIAL_com_alipay_sdk_app_H5OpenAuthActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onCreate */
    public static void m19470x44a49a3e(H5PayActivity h5PayActivity, Bundle bundle) {
        super.onCreate(bundle);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(h5PayActivity, h5PayActivity.getResources().getConfiguration());
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }
}
