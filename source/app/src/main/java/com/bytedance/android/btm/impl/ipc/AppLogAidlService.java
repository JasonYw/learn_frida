package com.bytedance.android.btm.impl.ipc;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.BinderC142320dyM;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes2.dex */
public final class AppLogAidlService extends Service {
    public static ChangeQuickRedirect LIZ;
    public IBinder LIZIZ;

    static {
        Covode.recordClassIndex(11406);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (IBinder) proxy.result;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new BinderC142320dyM();
        }
        return this.LIZIZ;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 6).isSupported && !PatchProxy.proxy(new Object[]{this, context}, null, LIZ, true, 5).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
                C140181dPd.LIZLLL();
            }
            if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 7).isSupported) {
                super.attachBaseContext(context);
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand;
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, intent, Integer.valueOf(i), Integer.valueOf(i2)}, null, LIZ, true, 2);
            if (proxy2.isSupported) {
                obj = proxy2.result;
            } else {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 4);
                if (proxy3.isSupported) {
                    onStartCommand = ((Integer) proxy3.result).intValue();
                } else {
                    ServiceLifecycle.onStartCommand(this, intent, i, i2);
                    onStartCommand = super.onStartCommand(intent, i, i2);
                }
                new StringBuilder();
                ALog.m8953i("KeepAliveLancet", C0002O.m25086C(getClass().getName(), "： hook Service.onStartCommand"));
                if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(getClass().getName())) {
                    ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
                    return 2;
                }
                return onStartCommand;
            }
        }
        return ((Integer) obj).intValue();
    }
}
