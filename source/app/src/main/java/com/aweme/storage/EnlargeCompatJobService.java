package com.aweme.storage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import bolts.Continuation;
import bolts.Task;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import com.p1594ss.android.ugc.aweme.thread.ThreadPoolHelper;
import java.util.concurrent.Callable;
import p002O.C0002O;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C76562GGm;

/* loaded from: classes2.dex */
public class EnlargeCompatJobService extends android.app.job.JobService {
    public static ChangeQuickRedirect LIZ;
    public static volatile boolean LIZIZ;

    static {
        Covode.recordClassIndex(9384);
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
        Task.call(new Callable<String>() { // from class: com.aweme.storage.EnlargeCompatJobService.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9386);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: LIZ */
            public String call() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                C76562GGm.LIZ().LIZ(EnlargeCompatJobService.this.getApplicationContext());
                return null;
            }
        }, ThreadPoolHelper.getIOExecutor()).continueWithTask(new Continuation<String, Task<String>>() { // from class: com.aweme.storage.EnlargeCompatJobService.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9385);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [bolts.Task<java.lang.String>, java.lang.Object] */
            @Override // bolts.Continuation
            /* renamed from: then */
            public final /* synthetic */ Task<String> mo29049then(Task<String> task) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{task}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                EnlargeCompatJobService.this.jobFinished(jobParameters, false);
                EnlargeCompatJobService.LIZIZ = false;
                return null;
            }
        });
        return true;
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
