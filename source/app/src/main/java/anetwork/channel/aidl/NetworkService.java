package anetwork.channel.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.AbstractBinderC108957Sv9;
import p003X.AbstractBinderC109142Sy8;
import p003X.AbstractC108958SvA;
import p003X.BinderC108959SvB;
import p003X.BinderC108960SvC;
import p003X.BinderC108961SvD;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes10.dex */
public class NetworkService extends Service {
    public AbstractBinderC109142Sy8 LIZ;
    public AbstractBinderC109142Sy8 LIZIZ;
    public AbstractBinderC108957Sv9 LIZJ = new BinderC108959SvB(this);
    public Context LIZLLL;

    static {
        Covode.recordClassIndex(2392);
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.LIZLLL = getApplicationContext();
        if (ALog.isPrintLog(2)) {
            ALog.m20785i("anet.NetworkService", C0002O.m25086C("onBind:", intent.getAction()), null, new Object[0]);
        }
        this.LIZ = new BinderC108960SvC(this.LIZLLL);
        this.LIZIZ = new BinderC108961SvD(this.LIZLLL);
        if (!AbstractC108958SvA.class.getName().equals(intent.getAction())) {
            return null;
        }
        return this.LIZJ;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        new StringBuilder();
        com.p1594ss.android.agilelogger.ALog.m8953i("KeepAliveLancet", C0002O.m25086C(getClass().getName(), "： hook Service.onStartCommand"));
        if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(getClass().getName())) {
            com.p1594ss.android.agilelogger.ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
            return 2;
        }
        return 2;
    }
}
