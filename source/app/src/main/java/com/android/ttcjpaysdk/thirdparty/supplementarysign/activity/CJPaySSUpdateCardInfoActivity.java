package com.android.ttcjpaysdk.thirdparty.supplementarysign.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.AbstractActivityC135632cE7;
import p003X.C135792cGh;
import p003X.C136058cKz;
import p003X.C136215cNW;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPaySSUpdateCardInfoActivity extends AbstractActivityC135632cE7 {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public volatile boolean LIZJ;

    static {
        Covode.recordClassIndex(8815);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC135632cE7
    public final Fragment LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        return new C135792cGh();
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZ(this);
    }

    @Override // p003X.AbstractActivityC135632cE7, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        ICJPaySupplementarySignService iCJPaySupplementarySignService = (ICJPaySupplementarySignService) CJPayServiceManager.getInstance().getIService(ICJPaySupplementarySignService.class);
        if (iCJPaySupplementarySignService != null && iCJPaySupplementarySignService.getCallBack() != null) {
            iCJPaySupplementarySignService.release();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported || this.LJI) {
            return;
        }
        Fragment fragment = getSupportFragmentManager().getFragments().get(0);
        if ((fragment instanceof C135792cGh) && this.LIZJ) {
            this.LIZJ = false;
            if (!((C135792cGh) fragment).LIZLLL() && CJPayBasicUtils.isClickValid()) {
                finish();
                EventManager.INSTANCE.notifyNow(new C136215cNW(this.LIZIZ));
            }
        } else if (CJPayBasicUtils.isClickValid()) {
            finish();
            EventManager.INSTANCE.notifyNow(new C136215cNW(this.LIZIZ));
        }
    }

    @Override // p003X.AbstractActivityC135632cE7, com.android.ttcjpaysdk.thirdparty.base.CJPaySingleFragmentActivity, com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 14).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 13).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
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
        LIZ(true);
        if (getIntent() != null) {
            this.LIZIZ = getIntent().getStringExtra("token");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            this.LIZJ = true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
