package com.android.ttcjpaysdk.thirdparty.base;

import android.os.Build;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public abstract class CJPayBaseActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(8086);
    }

    /* renamed from: com_android_ttcjpaysdk_thirdparty_base_CJPayBaseActivity__onStop$___twin___ */
    public void m16041x30c86560() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        m16040x319f5a02(this);
    }

    /* renamed from: com_android_ttcjpaysdk_thirdparty_base_CJPayBaseActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m16040x319f5a02(CJPayBaseActivity cJPayBaseActivity) {
        if (PatchProxy.proxy(new Object[]{cJPayBaseActivity}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        cJPayBaseActivity.m16041x30c86560();
        int i = Build.VERSION.SDK_INT;
        try {
            cJPayBaseActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }
}
