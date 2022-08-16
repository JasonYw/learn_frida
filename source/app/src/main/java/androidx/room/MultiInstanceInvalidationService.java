package androidx.room;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.collection.SparseArrayCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.AbstractBinderC116470Vt2;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes16.dex */
public class MultiInstanceInvalidationService extends Service {
    public int LIZ;
    public final SparseArrayCompat<String> LIZIZ = new SparseArrayCompat<>();
    public final RemoteCallbackList<AbstractC0400b> LIZJ = new RemoteCallbackList<AbstractC0400b>() { // from class: androidx.room.MultiInstanceInvalidationService.1
        static {
            Covode.recordClassIndex(1821);
        }

        @Override // android.os.RemoteCallbackList
        public final /* synthetic */ void onCallbackDied(AbstractC0400b abstractC0400b, Object obj) {
            MultiInstanceInvalidationService.this.LIZIZ.remove(((Integer) obj).intValue());
        }
    };
    public final AbstractBinderC116470Vt2 LIZLLL = new AbstractBinderC116470Vt2() { // from class: androidx.room.MultiInstanceInvalidationService.2
        static {
            Covode.recordClassIndex(1822);
        }

        @Override // p003X.AbstractC116472Vt4
        public final void LIZ(AbstractC0400b abstractC0400b, int i) {
            synchronized (MultiInstanceInvalidationService.this.LIZJ) {
                MultiInstanceInvalidationService.this.LIZJ.unregister(abstractC0400b);
                MultiInstanceInvalidationService.this.LIZIZ.remove(i);
            }
        }

        @Override // p003X.AbstractC116472Vt4
        public final int LIZ(AbstractC0400b abstractC0400b, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.LIZJ) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.LIZ + 1;
                multiInstanceInvalidationService.LIZ = i;
                if (MultiInstanceInvalidationService.this.LIZJ.register(abstractC0400b, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.LIZIZ.append(i, str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.LIZ--;
                return 0;
            }
        }

        @Override // p003X.AbstractC116472Vt4
        public final void LIZ(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.LIZJ) {
                String str = MultiInstanceInvalidationService.this.LIZIZ.get(i);
                if (str == null) {
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.LIZJ.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.LIZJ.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.LIZIZ.get(intValue);
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.LIZJ.getBroadcastItem(i2).LIZ(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                MultiInstanceInvalidationService.this.LIZJ.finishBroadcast();
            }
        }
    };

    static {
        Covode.recordClassIndex(1820);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.LIZLLL;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
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
