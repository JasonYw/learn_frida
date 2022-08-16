package com.bytedance.alliance.base.component;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.bytedance.alliance.bean.PassData;
import com.bytedance.alliance.bean.WakeUpLog;
import com.bytedance.alliance.bean.WakeupComponentType;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C76558GGi;
import p003X.C76658GKe;
import p003X.G1U;
import p003X.GKZ;

/* loaded from: classes2.dex */
public class BaseService extends Service implements WeakHandler.IHandler {
    public static ChangeQuickRedirect LIZIZ;
    public WeakHandler LIZ;
    public Messenger LIZJ;
    public long LIZLLL = -1;

    /* renamed from: LJ */
    public long f25589LJ = -1;
    public long LJFF = -1;

    static {
        Covode.recordClassIndex(9912);
    }

    public void LIZ(Intent intent) {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
            return;
        }
        stopSelf();
    }

    private Messenger LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6);
        if (proxy.isSupported) {
            return (Messenger) proxy.result;
        }
        if (this.LIZJ == null) {
            this.LIZ = new WeakHandler(this);
            this.LIZJ = new Messenger(this.LIZ);
        }
        return this.LIZJ;
    }

    @Override // android.app.Service
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported) {
            return;
        }
        G1U.LIZ("BDAlliance", "BaseService.onCreate");
        GKZ.LIZ().LIZ(getApplicationContext());
        this.LIZLLL = System.currentTimeMillis();
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZIZ, false, 10).isSupported && !PatchProxy.proxy(new Object[]{this, context}, null, LIZIZ, true, 9).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
                C140181dPd.LIZLLL();
            }
            if (!PatchProxy.proxy(new Object[]{context}, this, LIZIZ, false, 11).isSupported) {
                super.attachBaseContext(context);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        final Bundle extras;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent}, this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return (IBinder) proxy.result;
        }
        G1U.LIZIZ("BDAlliance", "BaseService onBind");
        GKZ.LIZ().LIZ(getApplicationContext());
        this.f25589LJ = System.currentTimeMillis();
        final boolean andSet = C76658GKe.LIZIZ.getAndSet(false);
        if (intent != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("md5");
            if (string != null && string.equals(DigestUtils.md5Hex("com.bytedance.push.alliance"))) {
                C76558GGi.LIZ().LIZ(new Runnable() { // from class: com.bytedance.alliance.base.component.BaseService.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(9913);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        BaseService.this.LIZ(extras, "bind_service", andSet);
                        BaseService.this.LIZ();
                    }
                });
                return LIZIZ().getBinder();
            }
            G1U.LIZIZ("BDAlliance", "BaseService onBind md5 check not pass");
            LIZ();
            return LIZIZ().getBinder();
        }
        G1U.LIZIZ("BDAlliance", "BaseService onBind bundle is null");
        LIZ();
        return LIZIZ().getBinder();
    }

    public final void LIZ(Bundle bundle, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{bundle, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 7).isSupported) {
            return;
        }
        if (bundle == null) {
            G1U.LIZIZ("BDAlliance", "BaseService initPushAndRedBadge bundle null");
            return;
        }
        PassData passData = new PassData();
        passData.LIZIZ = bundle.getString("wakeup_device_id");
        passData.LIZJ = bundle.getString("wakeup_aid");
        passData.LIZLLL = bundle.getString("session_id");
        passData.f25590LJ = bundle.getString("alliance_sdk_version_code");
        passData.LJFF = bundle.getString("alliance_sdk_version_name");
        passData.LJI = bundle.getString("use_compose_data");
        passData.LJII = bundle.getString("compose_data_sign");
        passData.LJIIIIZZ = bundle.getString("compose_data");
        passData.LJIIIZ = bundle.getString("source_app_package");
        passData.LJIIJ = bundle.getString("source_app_name");
        passData.LJIIJJI = TextUtils.equals(bundle.getString("need_improve_process_adj"), "1");
        boolean z2 = !TextUtils.equals(bundle.getString("isolation"), "1");
        WakeUpLog wakeUpLog = new WakeUpLog();
        wakeUpLog.LIZJ = bundle.getString("source_app_package");
        wakeUpLog.LIZLLL = bundle.getString("source_app_name");
        wakeUpLog.LIZIZ = str;
        wakeUpLog.f25591LJ = bundle.getString("session_id");
        wakeUpLog.LJFF = getClass().getName();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("extra_on_create_timestamp", this.LIZLLL);
            jSONObject.put("on_start_command_timestamp", this.LJFF);
            jSONObject.put("on_bind_timestamp", this.f25589LJ);
            jSONObject.put("initiative_alliance_sdk_version_name", passData.LJFF);
            jSONObject.put("initiative_alliance_sdk_version_code", passData.f25590LJ);
        } catch (Throwable unused) {
        }
        GKZ.LIZ().mo23834LJ().LIZ(this, passData, wakeUpLog, z, jSONObject, z2, WakeupComponentType.SERVICE);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        final Bundle extras;
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 3);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, intent, Integer.valueOf(i), Integer.valueOf(i2)}, null, LIZIZ, true, 2);
            if (proxy2.isSupported) {
                obj = proxy2.result;
            } else {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 4);
                if (proxy3.isSupported) {
                    i3 = ((Integer) proxy3.result).intValue();
                } else {
                    G1U.LIZ("BDAlliance", "BaseService.onStartCommand");
                    GKZ.LIZ().LIZ(getApplicationContext());
                    this.LJFF = System.currentTimeMillis();
                    final boolean andSet = C76658GKe.LIZIZ.getAndSet(false);
                    LIZ(intent);
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        String string = extras.getString("md5");
                        if (string != null && string.equals(DigestUtils.md5Hex("com.bytedance.push.alliance"))) {
                            C76558GGi.LIZ().LIZ(new Runnable() { // from class: com.bytedance.alliance.base.component.BaseService.2
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(9914);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    BaseService.this.LIZ(extras, "start_service", andSet);
                                    BaseService.this.LIZ();
                                }
                            });
                        } else {
                            G1U.LIZIZ("BDAlliance", "BaseService onStartCommand md5 check not pass");
                            LIZ();
                        }
                    } else {
                        G1U.LIZIZ("BDAlliance", "BaseService onStartCommand bundle is null");
                        LIZ();
                    }
                    i3 = 2;
                }
                new StringBuilder();
                ALog.m8953i("KeepAliveLancet", C0002O.m25086C(getClass().getName(), "： hook Service.onStartCommand"));
                if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(getClass().getName())) {
                    ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
                    return 2;
                }
                return i3;
            }
        }
        return ((Integer) obj).intValue();
    }
}
