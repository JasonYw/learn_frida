package com.amap.api.location;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.loc.C15968ej;
import com.loc.C15981f;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes2.dex */
public class APSService extends Service {

    /* renamed from: a */
    public C15981f f22631a;

    /* renamed from: b */
    public int f22632b;

    /* renamed from: c */
    public boolean f22633c;

    static {
        Covode.recordClassIndex(4998);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        m18623xd5f4f5b7(this, context);
    }

    public void com_amap_api_location_APSService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public int com_amap_api_location_APSService__onStartCommand$___twin___(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("g", 0);
                if (intExtra == 1) {
                    int intExtra2 = intent.getIntExtra("i", 0);
                    Notification notification = (Notification) intent.getParcelableExtra("h");
                    if (intExtra2 != 0 && notification != null) {
                        startForeground(intExtra2, notification);
                        this.f22633c = true;
                        this.f22632b++;
                        return 0;
                    }
                } else if (intExtra == 2) {
                    if (intent.getBooleanExtra("j", true) && this.f22632b > 0) {
                        this.f22632b--;
                    }
                    if (this.f22632b <= 0) {
                        stopForeground(true);
                        this.f22633c = false;
                        return 0;
                    }
                    stopForeground(false);
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f22631a.m10558a(intent);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "APSService", "onBind");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        onCreate(this);
    }

    public void onCreate(Context context) {
        try {
            if (this.f22631a == null) {
                this.f22631a = new C15981f(context);
            }
            this.f22631a.m10559a();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "APSService", "onCreate");
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f22631a.m10557b();
            if (this.f22633c) {
                stopForeground(true);
            }
        } catch (Throwable th) {
            C15968ej.m10694a(th, "APSService", "onDestroy");
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return m18622x4eb35684(this, intent, i, i2);
    }

    /* renamed from: com_amap_api_location_APSService_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_serviceAttachBaseContext */
    public static void m18623xd5f4f5b7(APSService aPSService, Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        aPSService.com_amap_api_location_APSService__attachBaseContext$___twin___(context);
    }

    /* renamed from: com_amap_api_location_APSService_com_ss_android_ugc_aweme_lancet_KeepAliveLancet_onStartCommand */
    public static int m18622x4eb35684(APSService aPSService, Intent intent, int i, int i2) {
        int com_amap_api_location_APSService__onStartCommand$___twin___ = aPSService.com_amap_api_location_APSService__onStartCommand$___twin___(intent, i, i2);
        new StringBuilder();
        ALog.m8953i("KeepAliveLancet", C0002O.m25086C(aPSService.getClass().getName(), "： hook Service.onStartCommand"));
        if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(aPSService.getClass().getName())) {
            ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
            return 2;
        }
        return com_amap_api_location_APSService__onStartCommand$___twin___;
    }
}
