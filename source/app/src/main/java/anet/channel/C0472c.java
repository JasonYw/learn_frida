package anet.channel;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.c */
/* loaded from: classes2.dex */
public class C0472c {

    /* renamed from: a */
    public Map<String, Integer> f20428a = new HashMap();

    /* renamed from: b */
    public Map<String, SessionInfo> f20429b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(2164);
    }

    /* renamed from: a */
    public Collection<SessionInfo> m21048a() {
        return this.f20429b.values();
    }

    /* renamed from: a */
    public SessionInfo m21046a(String str) {
        return this.f20429b.remove(str);
    }

    /* renamed from: b */
    public SessionInfo m21044b(String str) {
        return this.f20429b.get(str);
    }

    /* renamed from: a */
    public void m21047a(SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            if (!TextUtils.isEmpty(sessionInfo.host)) {
                this.f20429b.put(sessionInfo.host, sessionInfo);
                return;
            }
            throw new IllegalArgumentException("host cannot be null or empty");
        }
        throw new NullPointerException("info is null");
    }

    /* renamed from: c */
    public int m21043c(String str) {
        Integer num;
        int intValue;
        MethodCollector.m14708i(32);
        synchronized (this.f20428a) {
            try {
                num = this.f20428a.get(str);
            } finally {
                MethodCollector.m14707o(32);
            }
        }
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        return intValue;
    }

    /* renamed from: a */
    public void m21045a(String str, int i) {
        MethodCollector.m14708i(31);
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f20428a) {
                try {
                    this.f20428a.put(str, Integer.valueOf(i));
                } catch (Throwable th) {
                    MethodCollector.m14707o(31);
                    throw th;
                }
            }
            MethodCollector.m14707o(31);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("host cannot be null or empty");
        MethodCollector.m14707o(31);
        throw illegalArgumentException;
    }
}
