package com.android.ttcjpaysdk.thirdparty.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.umeng.analytics.pro.C33753n;
import com.xiaomi.mipush.sdk.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C135539cCc;
import p003X.C136058cKz;
import p003X.GOY;
import p003X.View$OnClickListenerC135540cCd;
import p003X.View$OnClickListenerC135541cCe;

/* loaded from: classes17.dex */
public final class CJPayLimitErrorActivity extends CJPayBaseActivity {
    public static ChangeQuickRedirect LIZ;
    public static final C135539cCc LIZIZ = new C135539cCc((byte) 0);
    public LinearLayout LIZJ;
    public ImageView LIZLLL;

    /* renamed from: LJ */
    public TextView f25511LJ;
    public TextView LJFF;
    public TextView LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Boolean LJIIJ = Boolean.FALSE;
    public String LJIIJJI;
    public String LJIIL;

    static {
        Covode.recordClassIndex(7928);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final int getLayout() {
        return 2131690556;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    private final JSONObject LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(this.LJIIJJI, this.LJIIL);
        try {
            String str = this.LJII;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZ2.put("type", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return LIZ2;
    }

    @Override // android.app.Activity
    public final void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.finish();
        if (Intrinsics.areEqual(this.LJIIJ, Boolean.TRUE)) {
            C2118a.LIZ().LIZ(C33753n.C33755a.f42379f).LIZIZ();
        }
        CJPayHostInfo.inheritTheme = this.LJIIIZ;
        C136058cKz.LIZ(this);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 23).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 22).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
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

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13).isSupported) {
            return;
        }
        JSONObject LIZ2 = LIZ();
        try {
            LIZ2.put("button_name", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C2118a.LIZ().LIZ("wallet_pv_limit_page_click", LIZ2);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        MethodCollector.m14708i(495);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(495);
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            supportMultipleTheme();
            int i = Build.VERSION.SDK_INT;
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(CastProtectorUtils.parseColor("#00000000"));
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "");
            decorView.setSystemUiVisibility(AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            Intent intent = getIntent();
            if (intent == null || (str = intent.getStringExtra("key_type")) == null) {
                str = "";
            }
            this.LJII = str;
            Intent intent2 = getIntent();
            if (intent2 == null || (str2 = intent2.getStringExtra("key_theme")) == null) {
                str2 = "";
            }
            this.LJIIIIZZ = str2;
            this.LJIIJ = LIZ("param_is_independent_bind_card", false);
            Intent intent3 = getIntent();
            if (intent3 == null || (str3 = intent3.getStringExtra("merchant_id")) == null) {
                str3 = "";
            }
            this.LJIIJJI = str3;
            Intent intent4 = getIntent();
            if (intent4 == null || (str4 = intent4.getStringExtra(Constants.APP_ID)) == null) {
                str4 = "";
            }
            this.LJIIL = str4;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            this.LJIIIZ = CJPayHostInfo.inheritTheme;
            String str5 = this.LJIIIIZZ;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!TextUtils.isEmpty(str5)) {
                String str6 = this.LJIIIIZZ;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                CJPayHostInfo.inheritTheme = str6;
            }
        }
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
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            View findViewById = findViewById(2131169893);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZJ = (LinearLayout) findViewById;
            View findViewById2 = findViewById(2131165337);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.LIZLLL = (ImageView) findViewById2;
            LinearLayout linearLayout = this.LIZJ;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            setStatusBar(linearLayout);
            View findViewById3 = findViewById(2131169895);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            this.f25511LJ = (TextView) findViewById3;
            View findViewById4 = findViewById(2131169894);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "");
            this.LJFF = (TextView) findViewById4;
            View findViewById5 = findViewById(2131169892);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "");
            this.LJI = (TextView) findViewById5;
            if (Intrinsics.areEqual(CJPayHostInfo.aid, "1112")) {
                TextView textView = this.f25511LJ;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                textView.setTextColor(C116971W2r.LIZ(getResources(), 2131624825));
                TextView textView2 = this.LJFF;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                textView2.setTextColor(C116971W2r.LIZ(getResources(), 2131624823));
                TextView textView3 = this.LJI;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                textView3.setBackgroundResource(2130840232);
                TextView textView4 = this.LJI;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                textView4.setTextColor(C116971W2r.LIZ(getResources(), 2131623992));
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            ImageView imageView = this.LIZLLL;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            imageView.setOnClickListener(new View$OnClickListenerC135541cCe(this));
            TextView textView5 = this.LJI;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView5.setOnClickListener(new View$OnClickListenerC135540cCd(this));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            C2118a.LIZ().LIZ("wallet_pv_limit_page_imp", LIZ());
        }
        MethodCollector.m14707o(495);
    }

    private final Boolean LIZ(String str, boolean z) {
        Uri data;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, (byte) 0}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        if (getIntent() == null) {
            return Boolean.FALSE;
        }
        if (getIntent().hasExtra(str)) {
            return Boolean.valueOf(getIntent().getBooleanExtra(str, false));
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        if (intent.getData() != null) {
            try {
                Intent intent2 = getIntent();
                if (intent2 != null && (data = intent2.getData()) != null) {
                    return Boolean.valueOf(data.getBooleanQueryParameter(str, false));
                }
                return null;
            } catch (Exception unused) {
            }
        }
        return Boolean.FALSE;
    }
}
