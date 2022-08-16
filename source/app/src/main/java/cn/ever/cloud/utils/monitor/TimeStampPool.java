package cn.ever.cloud.utils.monitor;

import android.os.SystemClock;
import cn.ever.cloud.utils.error.ClientError;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p002O.C0002O;

/* loaded from: classes23.dex */
public class TimeStampPool {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static TimeStampPool pool = getInstance();
    public long appStartTime;
    public final Map<String, TimeZone> timeZoneMap = new ConcurrentHashMap();

    /* renamed from: cn.ever.cloud.utils.monitor.TimeStampPool$1 */
    /* loaded from: classes23.dex */
    public static /* synthetic */ class C07631 {
        static {
            Covode.recordClassIndex(3509);
        }
    }

    public static long getAppStartTime() {
        return pool.appStartTime;
    }

    static {
        Covode.recordClassIndex(3508);
    }

    /* loaded from: classes23.dex */
    public static class TimeZone {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long endAt;
        public long startAt;

        static {
            Covode.recordClassIndex(3510);
        }

        public long duration() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return ((Long) proxy.result).longValue();
            }
            checkDuration();
            return this.endAt - this.startAt;
        }

        private void checkDuration() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported || this.endAt - this.startAt >= 0) {
                return;
            }
            throw ClientError.Companion.internal("invalid service duration, end time should bigger than start time!");
        }

        public TimeZone(long j) {
            this.startAt = j;
        }

        private void setEndAt(long j) {
            if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            this.endAt = j;
            checkDuration();
        }

        public TimeZone onEnd(long j) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TimeZone) proxy.result;
            }
            setEndAt(j);
            return this;
        }

        public /* synthetic */ TimeZone(long j, C07631 c07631) {
            this(j);
        }

        public TimeZone(long j, long j2) {
            this.startAt = j;
            setEndAt(j2);
        }
    }

    private long currentTimeStamp() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return SystemClock.elapsedRealtime();
    }

    public static TimeStampPool getInstance() {
        MethodCollector.m14708i(227);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            TimeStampPool timeStampPool = (TimeStampPool) proxy.result;
            MethodCollector.m14707o(227);
            return timeStampPool;
        }
        if (pool == null) {
            synchronized (TimeStampPool.class) {
                try {
                    if (pool == null) {
                        pool = new TimeStampPool();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(227);
                    throw th;
                }
            }
        }
        TimeStampPool timeStampPool2 = pool;
        MethodCollector.m14707o(227);
        return timeStampPool2;
    }

    public static void setAppStartTime(long j) {
        pool.appStartTime = j;
    }

    private String createSignature(String str, String str2) {
        String m25086C;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        if (str2 == null) {
            m25086C = "";
        } else {
            m25086C = C0002O.m25086C(".", str2);
        }
        return C0002O.m25086C(str, m25086C);
    }

    private long recordServiceStart(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        String createSignature = createSignature(str, str2);
        long currentTimeStamp = currentTimeStamp();
        this.timeZoneMap.put(createSignature, new TimeZone(currentTimeStamp, (C07631) null));
        return currentTimeStamp;
    }

    public static long serviceStart(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return pool.recordServiceStart(str, str2);
    }

    public static TimeZone onServiceEnd(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (TimeZone) proxy.result;
        }
        String createSignature = pool.createSignature(str, str2);
        TimeZone remove = pool.timeZoneMap.remove(createSignature);
        if (remove != null) {
            return remove.onEnd(pool.currentTimeStamp());
        }
        new StringBuilder();
        throw new IllegalMonitorStateException(C0002O.m25086C(createSignature, " doesn't exist in pool"));
    }

    public static TimeZone onServicePause(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (TimeZone) proxy.result;
        }
        String createSignature = pool.createSignature(str, str2);
        TimeZone timeZone = pool.timeZoneMap.get(createSignature);
        if (timeZone != null) {
            return timeZone.onEnd(pool.currentTimeStamp());
        }
        new StringBuilder();
        throw new IllegalMonitorStateException(C0002O.m25086C(createSignature, " doesn't exist in pool"));
    }
}
