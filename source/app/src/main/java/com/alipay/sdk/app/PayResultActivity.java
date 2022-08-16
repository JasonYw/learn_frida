package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p101j.C1295b;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.umeng.message.proguard.C34037f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.GOY;

/* loaded from: classes2.dex */
public final class PayResultActivity extends Activity {

    /* renamed from: c */
    public static final HashMap<String, Object> f22025c = new HashMap<>();

    /* renamed from: f */
    public static final String f22026f = "orderSuffix";

    /* renamed from: g */
    public static final String f22027g = "externalPkgName";

    /* renamed from: a */
    public C1376a f22028a = null;

    /* renamed from: com.alipay.sdk.app.PayResultActivity$b */
    /* loaded from: classes2.dex */
    public static final class C1210b {

        /* renamed from: a */
        public static volatile String f22030a;

        /* renamed from: b */
        public static volatile String f22031b;

        static {
            Covode.recordClassIndex(4707);
        }
    }

    public final void com_alipay_sdk_app_PayResultActivity__onStop$___twin___() {
        GOY.LIZLLL(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onStop() {
        m19452x692e2141(this);
    }

    /* renamed from: com.alipay.sdk.app.PayResultActivity$a */
    /* loaded from: classes2.dex */
    public static class RunnableC1209a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f22029a;

        static {
            Covode.recordClassIndex(4706);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22029a.finish();
        }

        public RunnableC1209a(Activity activity) {
            this.f22029a = activity;
        }
    }

    static {
        Covode.recordClassIndex(4705);
    }

    /* renamed from: a */
    public static void m19456a(String str) {
        C1210b.f22031b = C1295b.m19241a();
        m19454a(f22025c, str);
    }

    /* renamed from: com_alipay_sdk_app_PayResultActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m19453x4f21fcda(PayResultActivity payResultActivity) {
        payResultActivity.com_alipay_sdk_app_PayResultActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            int i = Build.VERSION.SDK_INT;
            try {
                payResultActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_alipay_sdk_app_PayResultActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m19452x692e2141(PayResultActivity payResultActivity) {
        m19453x4f21fcda(payResultActivity);
        int i = Build.VERSION.SDK_INT;
        try {
            payResultActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GOY.LIZ(this, bundle);
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra(f22026f))) {
                C1210b.f22030a = intent.getStringExtra("phonecashier.pay.hash");
                String stringExtra = intent.getStringExtra(f22026f);
                String stringExtra2 = intent.getStringExtra(f22027g);
                C1376a m18923a = C1376a.C1377a.m18923a(intent);
                this.f22028a = m18923a;
                if (m18923a == null) {
                    finish();
                }
                m19457a(this, C1210b.f22030a, stringExtra, stringExtra2);
                m19458a(this, 300);
                return;
            }
            if (this.f22028a == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra("phonecashier.pay.result");
            int intExtra = intent.getIntExtra("phonecashier.pay.resultOrderHash", 0);
            if (intExtra != 0 && TextUtils.equals(C1210b.f22030a, String.valueOf(intExtra))) {
                if (!TextUtils.isEmpty(stringExtra3)) {
                    m19455a(stringExtra3, C1210b.f22030a);
                } else {
                    m19456a(C1210b.f22030a);
                }
                C1210b.f22030a = "";
                m19458a(this, 300);
                return;
            }
            C1376a c1376a = this.f22028a;
            C1301a.m19211b(c1376a, "biz", "SchemePayWrongHashEx", "Expected " + C1210b.f22030a + ", got " + intExtra);
            m19456a(C1210b.f22030a);
            m19458a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* renamed from: a */
    public static void m19455a(String str, String str2) {
        C1210b.f22031b = str;
        m19454a(f22025c, str2);
    }

    /* renamed from: a */
    public static void m19458a(Activity activity, int i) {
        new Handler().postDelayed(new RunnableC1209a(activity), i);
    }

    /* renamed from: a */
    public static boolean m19454a(HashMap<String, Object> hashMap, String str) {
        Object obj;
        if (hashMap == null || str == null || (obj = hashMap.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }

    /* renamed from: a */
    public static void m19457a(Activity activity, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            Intent intent = new Intent();
            try {
                intent.setPackage("hk.alipay.wallet");
                intent.setData(Uri.parse(C0002O.m25080C("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=", URLEncoder.encode(str, C34037f.f43302f), "&orderSuffix=", URLEncoder.encode(str2, C34037f.f43302f), "&packageName=", URLEncoder.encode(str3, C34037f.f43302f), "&externalPkgName=", URLEncoder.encode(str3, C34037f.f43302f))));
            } catch (UnsupportedEncodingException e) {
                C1385e.m18866a(e);
            }
            if (activity != null) {
                try {
                    C116971W2r.LIZIZ(activity, intent);
                } catch (Throwable unused) {
                    activity.finish();
                }
            }
        }
    }
}
