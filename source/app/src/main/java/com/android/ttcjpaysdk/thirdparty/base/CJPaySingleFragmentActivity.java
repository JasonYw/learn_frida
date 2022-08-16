package com.android.ttcjpaysdk.thirdparty.base;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.C76765GOh;

/* loaded from: classes17.dex */
public class CJPaySingleFragmentActivity extends CJPayBaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public View mRootView;

    static {
        Covode.recordClassIndex(8088);
    }

    public static /* synthetic */ void access$000(CJPayBaseActivity cJPayBaseActivity, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{cJPayBaseActivity, bundle}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        super.onCreate(bundle);
    }

    /* renamed from: com_android_ttcjpaysdk_thirdparty_base_CJPaySingleFragmentActivity__onStop$___twin___ */
    public void m16038xa9f66ed9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690563;
    }

    @Override // com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        m16037xaaa0b329(this);
    }

    public Fragment getLoadedFragment() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        if (getSupportFragmentManager() == null) {
            return null;
        }
        return getSupportFragmentManager().findFragmentById(2131175145);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        m16039xd8ecd168(this, bundle);
        this.mRootView = findViewById(2131190058);
    }

    /* renamed from: com_android_ttcjpaysdk_thirdparty_base_CJPaySingleFragmentActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m16037xaaa0b329(CJPaySingleFragmentActivity cJPaySingleFragmentActivity) {
        if (PatchProxy.proxy(new Object[]{cJPaySingleFragmentActivity}, null, changeQuickRedirect, true, 7).isSupported) {
            return;
        }
        cJPaySingleFragmentActivity.m16038xa9f66ed9();
        int i = Build.VERSION.SDK_INT;
        try {
            cJPaySingleFragmentActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    public void loadFragment(Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{fragment}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(2131175145, fragment);
        beginTransaction.commitAllowingStateLoss();
    }

    public void setStatusBar(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C76765GOh.LIZ((Activity) this);
        if (this.mSwipeToFinishView != null) {
            this.mSwipeToFinishView.setBackgroundColor("#00000000");
        }
        View view = this.mRootView;
        if (view != null) {
            view.setBackgroundColor(CastProtectorUtils.parseColor(str));
        }
        C76765GOh.LIZ(this, this.mRootView);
    }

    /* renamed from: INVOKESPECIAL_com_android_ttcjpaysdk_thirdparty_base_CJPaySingleFragmentActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onCreate */
    public static void m16039xd8ecd168(CJPayBaseActivity cJPayBaseActivity, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{cJPayBaseActivity, bundle}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        access$000(cJPayBaseActivity, bundle);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(cJPayBaseActivity, cJPayBaseActivity.getResources().getConfiguration());
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }
}
