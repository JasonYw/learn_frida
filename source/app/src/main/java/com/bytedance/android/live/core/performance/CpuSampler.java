package com.bytedance.android.live.core.performance;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import p003X.AbstractC4569445g;

/* loaded from: classes5.dex */
public class CpuSampler extends BaseSampler<Double> implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;

    static {
        Covode.recordClassIndex(23527);
    }

    @Override // com.bytedance.android.live.core.performance.BaseSampler, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r5 = this;
            java.lang.String r2 = "cpu_rate"
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.core.performance.CpuSampler.LJFF
            r0 = 1
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r5, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L11
            return
        L11:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = p003X.LOI.f8882LJ     // Catch: java.lang.Exception -> L4e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L4e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L54
            X.M2h r0 = p003X.C95452Nio.m23163LJ()     // Catch: java.lang.Exception -> L4e
            com.bytedance.android.livehostapi.platform.IHostPerformanceMonitor r0 = r0.LJJIJ()     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L54
            java.util.Map r1 = r0.getCpuRate()     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L54
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Exception -> L4e
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Exception -> L4e
            double r3 = r0.doubleValue()     // Catch: java.lang.Exception -> L4e
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6c
            goto L54
        L4e:
            r1 = move-exception
            java.lang.String r0 = "CpuSampler"
            com.bytedance.android.live.core.log.ALogger.m15798e(r0, r1)
        L54:
            boolean r0 = p003X.C74743FdZ.LJFF()
            if (r0 == 0) goto L80
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = p003X.LOI.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            double r3 = p003X.C74743FdZ.LIZLLL()
        L6c:
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r5.LIZ(r0)
            android.os.Handler r0 = r5.LIZJ
            if (r0 == 0) goto L7f
            android.os.Handler r2 = r5.LIZJ
            int r0 = r5.LIZIZ
            long r0 = (long) r0
            r2.postDelayed(r5, r0)
        L7f:
            return
        L80:
            double r3 = p003X.C74743FdZ.LIZ()
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.performance.CpuSampler.run():void");
    }

    public CpuSampler(int i, int i2) {
        super(i, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR);
    }
}
