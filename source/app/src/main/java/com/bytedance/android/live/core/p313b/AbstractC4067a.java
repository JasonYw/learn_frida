package com.bytedance.android.live.core.p313b;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import p002O.C0002O;
import p003X.AbstractC88357Krf;

/* renamed from: com.bytedance.android.live.core.b.a */
/* loaded from: classes5.dex */
public abstract class AbstractC4067a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC4067a mNextTask;
    public volatile int mStatus;

    static {
        Covode.recordClassIndex(23329);
    }

    public Callable asyncCallable() {
        return null;
    }

    public abstract void run();

    public synchronized boolean isFinished() {
        MethodCollector.m14708i(1568);
        if (this.mStatus == 2) {
            MethodCollector.m14707o(1568);
            return true;
        }
        MethodCollector.m14707o(1568);
        return false;
    }

    public synchronized boolean isIDLE() {
        MethodCollector.m14708i(1567);
        if (this.mStatus == 0) {
            MethodCollector.m14707o(1567);
            return true;
        }
        MethodCollector.m14707o(1567);
        return false;
    }

    public synchronized boolean isRunning() {
        MethodCollector.m14708i(1569);
        if (this.mStatus == 1) {
            MethodCollector.m14707o(1569);
            return true;
        }
        MethodCollector.m14707o(1569);
        return false;
    }

    public List<Integer> preTasks() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return Arrays.asList(0);
    }

    public void start() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported && this.mStatus != 2 && this.mStatus != 1) {
            this.mStatus = 1;
            try {
                run();
                this.mStatus = 2;
            } catch (Exception e) {
                this.mStatus = 3;
                throw e;
            }
        }
    }

    public final List<Integer> getPreTasks() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (preTasks() != null) {
            arrayList.add(0);
            for (Integer num : preTasks()) {
                if (!arrayList.contains(num)) {
                    arrayList.add(num);
                }
            }
        }
        return arrayList;
    }

    public int getTaskId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            return ((AbstractC88357Krf) getClass().getAnnotation(AbstractC88357Krf.class)).LIZ();
        } catch (Exception e) {
            new StringBuilder();
            ALogger.m15800e("ttlive_sdk_launch_error", C0002O.m25086C(getClass().getCanonicalName(), " task getTaskID exception"));
            ALogger.stacktrace(6, "ttlive_sdk_launch_error", e.getStackTrace());
            throw e;
        }
    }
}
