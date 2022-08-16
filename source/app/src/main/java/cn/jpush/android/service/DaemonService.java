package cn.jpush.android.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.message.NotifyService;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes2.dex */
public class DaemonService extends Service {
    static {
        Covode.recordClassIndex(3872);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }

    private int LIZ(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        try {
            Intent intent2 = new Intent(this, NotifyService.class);
            intent2.setAction("com.ss.android.message.action.PUSH_SERVICE");
            intent2.setPackage(getPackageName());
            startService(intent2);
        } catch (Throwable unused) {
        }
        stopSelf();
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int LIZ = LIZ(intent, i, i2);
        new StringBuilder();
        ALog.m8953i("KeepAliveLancet", C0002O.m25086C(getClass().getName(), "： hook Service.onStartCommand"));
        if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(getClass().getName())) {
            ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
            return 2;
        }
        return LIZ;
    }
}
