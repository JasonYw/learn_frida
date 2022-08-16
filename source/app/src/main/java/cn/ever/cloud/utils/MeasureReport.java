package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class MeasureReport {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long durationMs;

    static {
        Covode.recordClassIndex(3435);
    }

    public static /* synthetic */ MeasureReport copy$default(MeasureReport measureReport, long j, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{measureReport, new Long(j), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (MeasureReport) proxy.result;
        }
        if ((i & 1) != 0) {
            j = measureReport.durationMs;
        }
        return measureReport.copy(j);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.durationMs)};
    }

    public final long component1() {
        return this.durationMs;
    }

    public final MeasureReport copy(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (MeasureReport) proxy.result : new MeasureReport(j);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof MeasureReport) {
            return C106862S5w.LIZ(((MeasureReport) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("MeasureReport:%s", getObjects());
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public MeasureReport(long j) {
        this.durationMs = j;
    }
}
