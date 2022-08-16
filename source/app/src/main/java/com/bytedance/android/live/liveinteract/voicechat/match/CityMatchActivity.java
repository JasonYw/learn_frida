package com.bytedance.android.live.liveinteract.voicechat.match;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import kotlin.jvm.internal.Intrinsics;
import p003X.C74N;
import p003X.GOY;
import p003X.H80;

/* loaded from: classes23.dex */
public final class CityMatchActivity extends AppCompatActivity {
    public static ChangeQuickRedirect LIZ;
    public static final C74N LIZIZ = new C74N((byte) 0);
    public Bundle LIZJ;

    static {
        Covode.recordClassIndex(31470);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    private final void LIZ() {
        Object obj;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        Bundle extras = intent.getExtras();
        if (extras != null && (obj = extras.get("city_match_extra")) != null) {
            this.LIZJ = (Bundle) obj;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 9).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 8).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        LIZ();
        LIZ(intent, true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
        setContentView(2131698285);
        LIZ();
        LIZ(getIntent(), false);
    }

    private final void LIZ(Intent intent, boolean z) {
        FragmentTransaction fragmentTransaction;
        if (!PatchProxy.proxy(new Object[]{intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported && intent != null) {
            H80 LIZ2 = H80.LJIIL.LIZ();
            Bundle bundle = this.LIZJ;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZ2.setArguments(bundle);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager != null) {
                fragmentTransaction = supportFragmentManager.beginTransaction();
            } else {
                fragmentTransaction = null;
            }
            if (z) {
                if (fragmentTransaction != null) {
                    fragmentTransaction.replace(2131169597, LIZ2);
                } else {
                    return;
                }
            } else if (fragmentTransaction == null) {
                return;
            } else {
                fragmentTransaction.add(2131169597, LIZ2);
            }
            fragmentTransaction.commitAllowingStateLoss();
        }
    }
}
