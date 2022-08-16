package androidx.core.app;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.AbstractC143719eKv;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes2.dex */
public abstract class SafeJobIntentService extends JobIntentService {
    static {
        Covode.recordClassIndex(917);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.core.app.JobIntentService
    /* renamed from: LIZJ */
    public AbstractC143719eKv LIZIZ() {
        try {
            return super.LIZIZ();
        } catch (SecurityException unused) {
            return null;
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
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
