package com.aweme.storage;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bolts.Continuation;
import bolts.Task;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import com.p1594ss.android.ugc.aweme.thread.ThreadPoolHelper;
import java.util.Map;
import java.util.concurrent.Callable;
import p002O.C0002O;
import p003X.C114640VBa;
import p003X.C114641VBb;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.VBW;

/* loaded from: classes9.dex */
public class CompatJobService extends android.app.job.JobService {
    public static ChangeQuickRedirect LIZ;
    public static volatile boolean LIZIZ;

    static {
        Covode.recordClassIndex(9380);
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jobParameters}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Task.call(new Callable<String>() { // from class: com.aweme.storage.CompatJobService.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9383);
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.String] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ String call() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                VBW.LIZJ(CompatJobService.this);
                CompatJobService compatJobService = CompatJobService.this;
                if (!PatchProxy.proxy(new Object[]{compatJobService}, null, VBW.LIZ, true, 10).isSupported) {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], null, C114641VBb.LIZ, true, 1);
                    if (!proxy3.isSupported ? SettingsManager.getInstance().getBooleanValue("schedule_keva_storage_scan_job", false) : ((Boolean) proxy3.result).booleanValue()) {
                        Map<String, Object> LIZ2 = VBW.LIZ();
                        VBW.LIZ(LIZ2);
                        PatchProxyResult proxy4 = PatchProxy.proxy(new Object[0], null, C114640VBa.LIZ, true, 1);
                        if (!proxy4.isSupported ? SettingsManager.getInstance().getBooleanValue("keva_storage_monitor_file_upload", false) : ((Boolean) proxy4.result).booleanValue()) {
                            VBW.LIZ(compatJobService, LIZ2);
                        }
                    }
                }
                return null;
            }
        }, ThreadPoolHelper.getIOExecutor()).onSuccess(new Continuation<String, String>() { // from class: com.aweme.storage.CompatJobService.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9382);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
            @Override // bolts.Continuation
            /* renamed from: then */
            public final /* synthetic */ String mo29049then(Task<String> task) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{task}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                VBW.LIZLLL(CompatJobService.this);
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR).continueWithTask(new Continuation<String, Task<String>>() { // from class: com.aweme.storage.CompatJobService.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9381);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [bolts.Task<java.lang.String>, java.lang.Object] */
            @Override // bolts.Continuation
            /* renamed from: then */
            public final /* synthetic */ Task<String> mo29049then(Task<String> task) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{task}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                CompatJobService.this.jobFinished(jobParameters, false);
                CompatJobService.LIZIZ = false;
                return null;
            }
        });
        return true;
    }

    public static void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, LIZ, true, 4).isSupported || LIZIZ) {
            return;
        }
        LIZIZ = true;
        JobInfo.Builder builder = new JobInfo.Builder(1193041, new ComponentName(context, CompatJobService.class));
        builder.setMinimumLatency(0L);
        builder.setOverrideDeadline(JsBridgeDelegate.GET_URL_OUT_TIME);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 7).isSupported && !PatchProxy.proxy(new Object[]{this, context}, null, LIZ, true, 6).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
                C140181dPd.LIZLLL();
            }
            if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 8).isSupported) {
                super.attachBaseContext(context);
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2);
        if (!proxy.isSupported) {
            proxy = PatchProxy.proxy(new Object[]{this, intent, Integer.valueOf(i), Integer.valueOf(i2)}, null, LIZ, true, 1);
            if (!proxy.isSupported) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 3);
                if (proxy2.isSupported) {
                    i3 = ((Integer) proxy2.result).intValue();
                } else {
                    ServiceLifecycle.onStartCommand(this, intent, i, i2);
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
        return ((Integer) proxy.result).intValue();
    }
}
