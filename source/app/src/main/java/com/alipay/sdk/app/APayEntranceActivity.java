package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p101j.C1295b;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;
import p003X.GOY;

/* loaded from: classes2.dex */
public class APayEntranceActivity extends Activity {

    /* renamed from: f */
    public static final String f21993f = "ap_session";

    /* renamed from: g */
    public static final String f21994g = "ap_local_info";

    /* renamed from: h */
    public static final ConcurrentHashMap<String, AbstractC1204a> f21995h = new ConcurrentHashMap<>();

    /* renamed from: a */
    public String f21996a;

    /* renamed from: b */
    public String f21997b;

    /* renamed from: c */
    public C1376a f21998c;

    /* renamed from: com.alipay.sdk.app.APayEntranceActivity$a */
    /* loaded from: classes2.dex */
    public interface AbstractC1204a {
        static {
            Covode.recordClassIndex(4689);
        }

        /* renamed from: a */
        void mo18839a(String str);
    }

    public void com_alipay_sdk_app_APayEntranceActivity__onStop$___twin___() {
        GOY.LIZLLL(this);
        super.onStop();
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
        m19486xa42a3c6d(this);
    }

    static {
        Covode.recordClassIndex(4688);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f21997b;
        C1376a c1376a = this.f21998c;
        C1301a.m19216a(c1376a, "biz", "BSAFinish", str + "|" + TextUtils.isEmpty(this.f21996a));
        if (TextUtils.isEmpty(this.f21996a)) {
            this.f21996a = C1295b.m19241a();
        }
        if (str != null) {
            AbstractC1204a remove = f21995h.remove(str);
            if (remove != null) {
                remove.mo18839a(this.f21996a);
            } else {
                C1376a c1376a2 = this.f21998c;
                C1301a.m19211b(c1376a2, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            C1301a.m19215a(this.f21998c, "wr", "APStartFinish", th);
        }
    }

    /* renamed from: com_alipay_sdk_app_APayEntranceActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m19487x1fbddc06(APayEntranceActivity aPayEntranceActivity) {
        aPayEntranceActivity.com_alipay_sdk_app_APayEntranceActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            int i = Build.VERSION.SDK_INT;
            try {
                aPayEntranceActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_alipay_sdk_app_APayEntranceActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m19486xa42a3c6d(APayEntranceActivity aPayEntranceActivity) {
        m19487x1fbddc06(aPayEntranceActivity);
        int i = Build.VERSION.SDK_INT;
        try {
            aPayEntranceActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        GOY.LIZ(this, bundle);
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString("ap_order_info");
            String string2 = extras.getString("ap_target_packagename");
            this.f21997b = extras.getString(f21993f);
            String string3 = extras.getString(f21994g, "{}");
            if (!TextUtils.isEmpty(this.f21997b)) {
                C1376a m18920a = C1376a.C1377a.m18920a(this.f21997b);
                this.f21998c = m18920a;
                C1301a.m19216a(m18920a, "biz", "BSAEntryCreate", this.f21997b + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                C1301a.m19215a(this.f21998c, "wr", "APStartEx", th);
                finish();
            }
            if (this.f21998c != null) {
                Context applicationContext = getApplicationContext();
                C1376a c1376a = this.f21998c;
                C1301a.m19218a(applicationContext, c1376a, string, c1376a.f22367d);
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1376a c1376a = this.f21998c;
        C1301a.m19216a(c1376a, "biz", "BSAOnAR", this.f21997b + "|" + i + Constants.ACCEPT_TIME_SEPARATOR_SP + i2);
        if (i == 1000) {
            if (intent != null) {
                try {
                    this.f21996a = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }
}
