package com.bytedance.android.live.core.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public final class NetworkStat {
    public static ChangeQuickRedirect LIZ;
    public static final NetworkStat LIZLLL = new NetworkStat(Status.RUNNING, null);

    /* renamed from: LJ */
    public static final NetworkStat f26173LJ = new NetworkStat(Status.SUCCESS, null);
    public Status LIZIZ;
    public Throwable LIZJ;

    public final boolean LIZ() {
        if (this.LIZIZ == Status.RUNNING) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LIZIZ == Status.FAILED) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LIZIZ == Status.SUCCESS) {
            return true;
        }
        return false;
    }

    /* loaded from: classes8.dex */
    public enum Status {
        RUNNING(0),
        SUCCESS(1),
        FAILED(-1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int mStatus;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Status[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Status[]) proxy.result;
            }
            return (Status[]) values().clone();
        }

        static {
            Covode.recordClassIndex(23523);
        }

        public static Status valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Status) proxy.result;
            }
            return (Status) Enum.valueOf(Status.class, str);
        }

        Status(int i) {
            this.mStatus = i;
        }
    }

    static {
        Covode.recordClassIndex(23522);
    }

    public static NetworkStat LIZ(Throwable th) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{th}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (NetworkStat) proxy.result;
        }
        return new NetworkStat(Status.FAILED, th);
    }

    public NetworkStat(Status status, Throwable th) {
        this.LIZIZ = status;
        this.LIZJ = th;
    }
}
