package androidx.lifecycle;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C76760GOc;

/* loaded from: classes2.dex */
public class LifecycleService extends Service implements LifecycleOwner {
    public final C76760GOc LIZ = new C76760GOc(this);

    static {
        Covode.recordClassIndex(1365);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public Lifecycle mo29786getLifecycle() {
        return this.LIZ.LIZ;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.LIZ.LIZ(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C76760GOc c76760GOc = this.LIZ;
        c76760GOc.LIZ(Lifecycle.Event.ON_STOP);
        c76760GOc.LIZ(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.LIZ.LIZ(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.LIZ.LIZ(Lifecycle.Event.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        new StringBuilder();
        ALog.m8953i("KeepAliveLancet", C0002O.m25086C(getClass().getName(), "： hook Service.onStartCommand"));
        if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(getClass().getName())) {
            ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
            return 2;
        }
        return onStartCommand;
    }
}
