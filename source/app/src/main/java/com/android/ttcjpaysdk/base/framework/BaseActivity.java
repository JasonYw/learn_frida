package com.android.ttcjpaysdk.base.framework;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.p135ui.SwipeToFinishView;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.service.api.CJPayDataKeepAPI;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.AbstractC136025cKS;
import p003X.C116971W2r;
import p003X.C135342c9R;
import p003X.C135343c9S;
import p003X.C136458cRR;
import p003X.DialogC137460chc;
import p003X.FWR;
import p003X.NKZ;

/* loaded from: classes17.dex */
public abstract class BaseActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isHalfTranslucent;
    public boolean isNotTranslucent;
    public boolean isSupportMultipleTheme;
    public boolean isSwipeThemeType;
    public DialogC137460chc mCommonDialog;
    public SwipeToFinishView mSwipeToFinishView;

    static {
        Covode.recordClassIndex(6018);
    }

    public static /* synthetic */ void access$000(AppCompatActivity appCompatActivity, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{appCompatActivity, bundle}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        super.onCreate(bundle);
    }

    public void beforeSetContentView() {
    }

    public abstract int getLayout();

    public String getSources() {
        return "";
    }

    public boolean isActivityPortrait() {
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        m16067x5b403c1e(this);
    }

    public void setHalfTranslucent() {
        this.isHalfTranslucent = true;
    }

    public void setSwipeThemeType() {
        this.isSwipeThemeType = true;
    }

    public void supportMultipleTheme() {
        this.isSupportMultipleTheme = true;
    }

    public void dismissCommonDialog() {
        DialogC137460chc dialogC137460chc;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19).isSupported && (dialogC137460chc = this.mCommonDialog) != null && dialogC137460chc.isShowing()) {
            C116971W2r.LIZ(this.mCommonDialog);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        super.onDestroy();
        dismissCommonDialog();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        super.onStart();
    }

    /* renamed from: com_android_ttcjpaysdk_base_framework_BaseActivity__onStop$___twin___ */
    public void m16068xf4e61dc4() {
        SwipeToFinishView swipeToFinishView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        super.onStop();
        if (FWR.LIZ() && (swipeToFinishView = this.mSwipeToFinishView) != null && !swipeToFinishView.isSwipeToFinish() && !this.isHalfTranslucent) {
            this.isNotTranslucent = NKZ.LIZ(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        super.onResume();
        if (FWR.LIZ() && this.isNotTranslucent) {
            NKZ.LIZIZ(this);
            this.isNotTranslucent = false;
        }
    }

    public void initTranslucentStatusBar() {
        int i;
        MethodCollector.m14708i(356);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15).isSupported) {
            MethodCollector.m14707o(356);
            return;
        }
        getWindow().setSoftInputMode(3);
        int i2 = Build.VERSION.SDK_INT;
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(CastProtectorUtils.parseColor("#00000000"));
        if (Build.VERSION.SDK_INT >= 23) {
            i = 9216;
        } else {
            i = AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END;
        }
        getWindow().getDecorView().setSystemUiVisibility(i);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        MethodCollector.m14707o(356);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        CJPayDataKeepAPI.saveData(bundle, this);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void setRequestedOrientation(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        hookSetRequestedOrientation(i);
    }

    public void setStatusBar(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C135343c9S.LIZ().LIZ(this, view, this.isSupportMultipleTheme);
    }

    /* renamed from: com_android_ttcjpaysdk_base_framework_BaseActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m16067x5b403c1e(BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, null, changeQuickRedirect, true, 8).isSupported) {
            return;
        }
        baseActivity.m16068xf4e61dc4();
        int i = Build.VERSION.SDK_INT;
        try {
            baseActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    public void showCommonDialog(AbstractC136025cKS abstractC136025cKS) {
        if (PatchProxy.proxy(new Object[]{abstractC136025cKS}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        this.mCommonDialog = CJPayDialogUtils.initDialog(abstractC136025cKS);
        if (this.mCommonDialog != null && !isFinishing()) {
            C116971W2r.LIZJ(this.mCommonDialog);
        }
    }

    public void showDialogIfNotNull(CJPayDialogBuilder cJPayDialogBuilder) {
        if (PatchProxy.proxy(new Object[]{cJPayDialogBuilder}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        if (this.mCommonDialog == null) {
            this.mCommonDialog = CJPayDialogUtils.initDialog(cJPayDialogBuilder);
        }
        if (this.mCommonDialog != null && !isFinishing()) {
            C116971W2r.LIZJ(this.mCommonDialog);
        }
    }

    private void hookSetRequestedOrientation(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        if (getApplicationInfo().targetSdkVersion >= 27 && (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27)) {
            if (i != 0 && i != 1 && i != 11 && i != 12 && i != 14) {
                switch (i) {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        super.setRequestedOrientation(i);
                        return;
                }
            }
            super.setRequestedOrientation(3);
            return;
        }
        super.setRequestedOrientation(i);
    }

    public void showCommonDialog(CJPayDialogBuilder cJPayDialogBuilder) {
        if (PatchProxy.proxy(new Object[]{cJPayDialogBuilder}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        this.mCommonDialog = CJPayDialogUtils.initDialog(cJPayDialogBuilder);
        if (this.mCommonDialog != null && !isFinishing()) {
            C116971W2r.LIZJ(this.mCommonDialog);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (bundle != null) {
            CJPayDataKeepAPI.restoreData(bundle, this);
        } else {
            CJPayDataKeepAPI.autoWiredData(bundle, this);
        }
        if (isActivityPortrait()) {
            setRequestedOrientation(1);
        }
        C135343c9S LIZ = C135343c9S.LIZ();
        boolean z = this.isSupportMultipleTheme;
        boolean z2 = this.isSwipeThemeType;
        if (!PatchProxy.proxy(new Object[]{this, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, LIZ, C135343c9S.LIZ, false, 2).isSupported) {
            if (z) {
                String str = CJPayHostInfo.inheritTheme;
                if (!TextUtils.isEmpty(str)) {
                    if (!"light".equals(str)) {
                        if ("dark".equals(str)) {
                            LIZ.LIZ(this, "dark", z2);
                        } else {
                            LIZ.LIZ(this, "light", z2);
                        }
                    }
                    LIZ.LIZ(this, "light", z2);
                } else if (CJPayHostInfo.isFollowSystemTheme) {
                    if (AppCompatDelegate.getDefaultNightMode() == 2) {
                        LIZ.LIZ(this, "dark", z2);
                    } else {
                        if (AppCompatDelegate.getDefaultNightMode() != 1) {
                            LIZ.LIZ(this, "light", z2);
                        }
                        LIZ.LIZ(this, "light", z2);
                    }
                } else {
                    C135342c9R LIZJ = LIZ.LIZJ();
                    if (LIZJ != null) {
                        String str2 = LIZJ.LIZ;
                        if (!"light".equals(str2)) {
                            if ("dark".equals(str2)) {
                                LIZ.LIZ(this, "dark", z2);
                            } else if ("lark".equals(str2)) {
                                LIZ.LIZ(this, "lark", z2);
                            }
                        }
                        LIZ.LIZ(this, "light", z2);
                    } else {
                        if (LIZ.LIZIZ()) {
                            LIZ.LIZ(this, "dark", z2);
                        }
                        LIZ.LIZ(this, "light", z2);
                    }
                }
            } else {
                LIZ.LIZ(this, "light", z2);
            }
        }
        C136458cRR.LIZ(getSources());
        m16069xfff9aad3(this, bundle);
        CJPayBasicUtils.switchLanguage(this);
        beforeSetContentView();
        try {
            setContentView(getLayout());
        } catch (NullPointerException unused) {
            finish();
        }
    }

    /* renamed from: INVOKESPECIAL_com_android_ttcjpaysdk_base_framework_BaseActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onCreate */
    public static void m16069xfff9aad3(AppCompatActivity appCompatActivity, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{appCompatActivity, bundle}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        access$000(appCompatActivity, bundle);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(appCompatActivity, appCompatActivity.getResources().getConfiguration());
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }

    public String getStringRes(Context context, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (context != null) {
            return context.getString(i);
        }
        return "";
    }
}
