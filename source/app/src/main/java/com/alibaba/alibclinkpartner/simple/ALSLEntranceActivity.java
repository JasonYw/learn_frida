package com.alibaba.alibclinkpartner.simple;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import p003X.GOY;

/* loaded from: classes25.dex */
public class ALSLEntranceActivity extends Activity {
    static {
        Covode.recordClassIndex(4316);
    }

    /* renamed from: com_alibaba_alibclinkpartner_simple_ALSLEntranceActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m20017x3a7a9447(ALSLEntranceActivity aLSLEntranceActivity) {
        aLSLEntranceActivity.m20018x86beae34();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            int i = Build.VERSION.SDK_INT;
            try {
                aLSLEntranceActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_alibaba_alibclinkpartner_simple_ALSLEntranceActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m20016x928281ae(ALSLEntranceActivity aLSLEntranceActivity) {
        m20017x3a7a9447(aLSLEntranceActivity);
        int i = Build.VERSION.SDK_INT;
        try {
            aLSLEntranceActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com_alibaba_alibclinkpartner_simple_ALSLEntranceActivity__onStop$___twin___ */
    public void m20018x86beae34() {
        GOY.LIZLLL(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        GOY.LIZ(this, bundle);
        super.onCreate(bundle);
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        m20016x928281ae(this);
    }
}
