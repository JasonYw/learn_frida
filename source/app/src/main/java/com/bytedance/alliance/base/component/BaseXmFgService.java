package com.bytedance.alliance.base.component;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import p002O.C0002O;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.G1U;
import p003X.GKU;
import p003X.GKZ;

/* loaded from: classes2.dex */
public class BaseXmFgService extends BaseService {
    public static ChangeQuickRedirect LIZJ;
    public static String LIZ = "";
    public static String LIZLLL = "";

    @Override // com.bytedance.alliance.base.component.BaseService
    public final void LIZ() {
    }

    static {
        Covode.recordClassIndex(9915);
    }

    private void LIZIZ() {
        NotificationManager notificationManager;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported || Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) getSystemService("notification")) == null) {
            return;
        }
        try {
            if (notificationManager.getNotificationChannel(LIZ) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(LIZ, LIZLLL, 2);
                notificationChannel.setShowBadge(false);
                notificationChannel.enableVibration(false);
                notificationChannel.enableLights(false);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        } catch (Throwable th) {
            G1U.LIZ("BDAlliance", "BaseXmFgService create channel error", th);
        }
    }

    @Override // com.bytedance.alliance.base.component.BaseService, android.app.Service
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            return;
        }
        GKZ.LIZ().LIZ(this);
        super.onCreate();
        if (TextUtils.isEmpty(LIZ)) {
            LIZ = getResources().getString(2131579900);
        }
        if (TextUtils.isEmpty(LIZLLL)) {
            LIZLLL = getResources().getString(2131579901);
        }
        LIZIZ();
    }

    @Override // com.bytedance.alliance.base.component.BaseService
    public final void LIZ(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, LIZJ, false, 2).isSupported) {
            return;
        }
        G1U.LIZ("BDAlliance", "BaseXmFgService doXmStartServiceHook");
        super.LIZ(intent);
        if (GKU.LIZJ() && Build.VERSION.SDK_INT >= 26 && intent != null && intent.getBooleanExtra("xm_start_service_hook", false)) {
            try {
                LIZIZ();
                if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 4).isSupported) {
                    Notification build = new Notification.Builder(getApplicationContext(), LIZ).setSmallIcon(getApplicationInfo().icon).build();
                    G1U.LIZ("BDAlliance", "BaseXmFgService startForeground");
                    startForeground(1, build);
                    G1U.LIZ("BDAlliance", "BaseXmFgService stopForeground");
                    stopForeground(true);
                }
            } catch (Throwable th) {
                G1U.LIZ("BDAlliance", "BaseXmFgService doXmStartServiceHook error", th);
            }
        }
    }

    @Override // com.bytedance.alliance.base.component.BaseService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZJ, false, 6).isSupported && !PatchProxy.proxy(new Object[]{this, context}, null, LIZJ, true, 5).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
                C140181dPd.LIZLLL();
            }
            if (!PatchProxy.proxy(new Object[]{context}, this, LIZJ, false, 7).isSupported) {
                super.attachBaseContext(context);
            }
        }
    }

    @Override // com.bytedance.alliance.base.component.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 9);
        if (!proxy.isSupported) {
            proxy = PatchProxy.proxy(new Object[]{this, intent, Integer.valueOf(i), Integer.valueOf(i2)}, null, LIZJ, true, 8);
            if (!proxy.isSupported) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 10);
                if (proxy2.isSupported) {
                    onStartCommand = ((Integer) proxy2.result).intValue();
                } else {
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
        return ((Integer) proxy.result).intValue();
    }
}
