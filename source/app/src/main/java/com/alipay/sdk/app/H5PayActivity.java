package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import com.alipay.sdk.p082m.p101j.C1295b;
import com.alipay.sdk.p082m.p101j.C1297d;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.alipay.sdk.p082m.p123x.AbstractC1424c;
import com.alipay.sdk.p082m.p123x.C1425d;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import p003X.GOY;

/* loaded from: classes2.dex */
public class H5PayActivity extends Activity {

    /* renamed from: a */
    public AbstractC1424c f22005a;

    /* renamed from: b */
    public String f22006b;

    /* renamed from: c */
    public String f22007c;

    /* renamed from: d */
    public String f22008d;

    /* renamed from: e */
    public String f22009e;

    /* renamed from: f */
    public boolean f22010f;

    /* renamed from: g */
    public String f22011g;

    /* renamed from: h */
    public WeakReference<C1376a> f22012h;

    static {
        Covode.recordClassIndex(4698);
    }

    public void com_alipay_sdk_app_H5PayActivity__onStop$___twin___() {
        GOY.LIZLLL(this);
        super.onStop();
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
        m19464xbff3d7f7(this);
    }

    @Override // android.app.Activity
    public void finish() {
        mo19466a();
        super.finish();
    }

    /* renamed from: a */
    public void mo19466a() {
        Object obj = PayTask.f22032h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        GOY.m23828LJ(this);
        super.onDestroy();
        AbstractC1424c abstractC1424c = this.f22005a;
        if (abstractC1424c != null) {
            abstractC1424c.mo18715c();
        }
    }

    /* renamed from: b */
    private void m19465b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th) {
            C1385e.m18866a(th);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC1424c abstractC1424c = this.f22005a;
        if (abstractC1424c == null) {
            finish();
        } else if (abstractC1424c.m18728a()) {
            abstractC1424c.mo18719b();
        } else {
            if (!abstractC1424c.mo18719b()) {
                super.onBackPressed();
            }
            C1295b.m19239a(C1295b.m19241a());
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: com_alipay_sdk_app_H5PayActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m19464xbff3d7f7(H5PayActivity h5PayActivity) {
        h5PayActivity.com_alipay_sdk_app_H5PayActivity__onStop$___twin___();
        int i = Build.VERSION.SDK_INT;
        try {
            h5PayActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            try {
                C1301a.m19215a((C1376a) C1399n.m18793a(this.f22012h), "biz", "H5PayDataAnalysisError", th);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        GOY.LIZ(this, bundle);
        m19465b();
        super.onCreate(bundle);
        try {
            C1376a m18923a = C1376a.C1377a.m18923a(getIntent());
            if (m18923a == null) {
                finish();
                return;
            }
            this.f22012h = new WeakReference<>(m18923a);
            if (!C1328a.m19107z().m19111v()) {
                setRequestedOrientation(1);
            } else {
                setRequestedOrientation(3);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString(PushConstants.WEB_URL, null);
                this.f22006b = string;
                if (!C1399n.m18768f(string)) {
                    finish();
                    return;
                }
                this.f22008d = extras.getString("cookie", null);
                this.f22007c = extras.getString(PushConstants.MZ_PUSH_MESSAGE_METHOD, null);
                this.f22009e = extras.getString("title", null);
                this.f22011g = extras.getString("version", "v1");
                this.f22010f = extras.getBoolean("backisexit", false);
                try {
                    C1425d c1425d = new C1425d(this, m18923a, this.f22011g);
                    setContentView(c1425d);
                    c1425d.m18721a(this.f22009e, this.f22007c, this.f22010f);
                    c1425d.m18726a(this.f22006b, this.f22008d);
                    c1425d.mo18723a(this.f22006b);
                    this.f22005a = c1425d;
                } catch (Throwable th) {
                    C1301a.m19215a(m18923a, "biz", "GetInstalledAppEx", th);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            C1297d.m19228a((C1376a) C1399n.m18793a(this.f22012h), i, i2, intent);
        }
    }
}
