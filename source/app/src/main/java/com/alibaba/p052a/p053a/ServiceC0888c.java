package com.alibaba.p052a.p053a;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* renamed from: com.alibaba.a.a.c */
/* loaded from: classes2.dex */
public class ServiceC0888c extends Service {

    /* renamed from: a */
    public AbstractC0894d f21186a;

    static {
        Covode.recordClassIndex(4198);
    }

    /* renamed from: com_alibaba_a_a_c_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_serviceAttachBaseContext */
    public static void m20420x44ce7481(ServiceC0888c serviceC0888c, Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        serviceC0888c.com_alibaba_a_a_c__attachBaseContext$___twin___(context);
    }

    /* renamed from: com_alibaba_a_a_c_com_ss_android_ugc_aweme_lancet_KeepAliveLancet_onStartCommand */
    public static int m20419x7c0ce9ce(ServiceC0888c serviceC0888c, Intent intent, int i, int i2) {
        int com_alibaba_a_a_c__onStartCommand$___twin___ = serviceC0888c.com_alibaba_a_a_c__onStartCommand$___twin___(intent, i, i2);
        new StringBuilder();
        ALog.m8953i("KeepAliveLancet", C0002O.m25086C(serviceC0888c.getClass().getName(), "： hook Service.onStartCommand"));
        if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(serviceC0888c.getClass().getName())) {
            ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
            return 2;
        }
        return com_alibaba_a_a_c__onStartCommand$___twin___;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        m20420x44ce7481(this, context);
    }

    public void com_alibaba_a_a_c__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public int com_alibaba_a_a_c__onStartCommand$___twin___(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.f21186a == null) {
            this.f21186a = new BinderC0908e(getApplication());
        }
        return (IBinder) this.f21186a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        AbstractC0894d abstractC0894d = this.f21186a;
        if (abstractC0894d != null) {
            try {
                abstractC0894d.mo20360b();
            } catch (RemoteException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        AbstractC0894d abstractC0894d = this.f21186a;
        if (abstractC0894d != null) {
            try {
                abstractC0894d.mo20360b();
            } catch (RemoteException unused) {
            }
        }
        super.onLowMemory();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return m20419x7c0ce9ce(this, intent, i, i2);
    }
}
