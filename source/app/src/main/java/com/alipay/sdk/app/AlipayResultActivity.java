package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.umeng.message.proguard.C34037f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.GOY;

/* loaded from: classes2.dex */
public class AlipayResultActivity extends Activity {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, AbstractC1205a> f21999a = new ConcurrentHashMap<>();

    /* renamed from: com.alipay.sdk.app.AlipayResultActivity$a */
    /* loaded from: classes2.dex */
    public interface AbstractC1205a {
        static {
            Covode.recordClassIndex(4691);
        }

        /* renamed from: a */
        void mo18840a(int i, String str, String str2);
    }

    public void com_alipay_sdk_app_AlipayResultActivity__onStop$___twin___() {
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
        m19483x8f5a0517(this);
    }

    static {
        Covode.recordClassIndex(4690);
    }

    /* renamed from: com_alipay_sdk_app_AlipayResultActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m19484x1aec82b0(AlipayResultActivity alipayResultActivity) {
        alipayResultActivity.com_alipay_sdk_app_AlipayResultActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            int i = Build.VERSION.SDK_INT;
            try {
                alipayResultActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_alipay_sdk_app_AlipayResultActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m19483x8f5a0517(AlipayResultActivity alipayResultActivity) {
        m19484x1aec82b0(alipayResultActivity);
        int i = Build.VERSION.SDK_INT;
        try {
            alipayResultActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        GOY.LIZ(this, bundle);
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("session");
            Bundle LIZ = C116971W2r.LIZ(intent, "result");
            String stringExtra2 = intent.getStringExtra("scene");
            C1376a m18920a = C1376a.C1377a.m18920a(stringExtra);
            if (m18920a == null) {
                finish();
                return;
            }
            C1301a.m19216a(m18920a, "biz", "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
            if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                m19485a(stringExtra, LIZ);
                return;
            }
            if ((TextUtils.isEmpty(stringExtra) || LIZ == null) && intent.getData() != null) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), C34037f.f43302f));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                    stringExtra = jSONObject.getString("session");
                    C1301a.m19216a(m18920a, "biz", "BSPUriSession", stringExtra);
                    Bundle bundle2 = new Bundle();
                    try {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            bundle2.putString(next, jSONObject2.getString(next));
                        }
                        LIZ = bundle2;
                    } catch (Throwable th) {
                        th = th;
                        LIZ = bundle2;
                        C1301a.m19215a(m18920a, "biz", "BSPResEx", th);
                        C1301a.m19215a(m18920a, "biz", "ParseSchemeQueryError", th);
                        if (TextUtils.isEmpty(stringExtra)) {
                        }
                        C1301a.m19212b(this, m18920a, "", m18920a.f22367d);
                        finish();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (TextUtils.isEmpty(stringExtra) && LIZ != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(SystemClock.elapsedRealtime());
                C1301a.m19216a(m18920a, "biz", "PgReturn", sb.toString());
                C1301a.m19216a(m18920a, "biz", "PgReturnV", LIZ.getInt("endCode", -1) + "|" + LIZ.getString("memo", Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                OpenAuthTask.m19459a(stringExtra, 9000, "OK", LIZ);
                C1301a.m19212b(this, m18920a, "", m18920a.f22367d);
                finish();
                return;
            }
            C1301a.m19212b(this, m18920a, "", m18920a.f22367d);
            finish();
        } catch (Throwable unused) {
            finish();
        }
    }

    /* renamed from: a */
    private void m19485a(String str, Bundle bundle) {
        AbstractC1205a remove = f21999a.remove(str);
        if (remove == null) {
            return;
        }
        try {
            remove.mo18840a(bundle.getInt("endCode"), bundle.getString("memo"), bundle.getString("result"));
        } finally {
            finish();
        }
    }
}
