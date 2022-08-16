package com.android.ttcjpaysdk.thirdparty.balancerecharge.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import java.util.Map;
import p003X.AbstractActivityC135574cDB;
import p003X.C116971W2r;
import p003X.GOY;

/* loaded from: classes17.dex */
public final class CJPayRechargeTransitionActivity extends AbstractActivityC135574cDB {
    public static ChangeQuickRedirect LIZIZ;
    public HashMap LJI;

    static {
        Covode.recordClassIndex(8037);
    }

    @Override // p003X.AbstractActivityC135564cD1
    public final String LJIILIIL() {
        return "recharge";
    }

    @Override // p003X.AbstractActivityC135574cDB, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported && (hashMap = this.LJI) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135574cDB, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJI == null) {
            this.LJI = new HashMap();
        }
        View view = (View) this.LJI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC135574cDB
    public final void LIZIZ() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C2118a.LIZ().LIZ(110).LIZIZ();
        C116971W2r.LIZIZ(this, new Intent(this, CJPayRechargeActivity.class));
        Map<String, Integer> map = CJPayHostInfo.animationResourceMap;
        if (map != null) {
            if ((!map.isEmpty()) && map.containsKey("TTCJPayKeyActivityAddInAnimationResource")) {
                Integer num = map.get("TTCJPayKeyActivityAddInAnimationResource");
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                overridePendingTransition(i, 0);
            }
        } else {
            overridePendingTransition(2130968809, 0);
        }
        LIZ();
    }

    @Override // p003X.AbstractActivityC135574cDB, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZIZ, true, 11).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZIZ, true, 10).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 13).isSupported) {
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

    @Override // p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZIZ, true, 6).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZIZ, true, 5).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }
}
