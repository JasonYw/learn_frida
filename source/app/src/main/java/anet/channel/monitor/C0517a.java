package anet.channel.monitor;

import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.monitor.a */
/* loaded from: classes2.dex */
public class C0517a {

    /* renamed from: a */
    public static volatile C0517a f20540a;

    /* renamed from: b */
    public Map<INetworkQualityChangeListener, C0523f> f20541b = new ConcurrentHashMap();

    /* renamed from: c */
    public C0523f f20542c = new C0523f();

    static {
        Covode.recordClassIndex(2225);
    }

    /* renamed from: a */
    public static C0517a m20982a() {
        MethodCollector.m14708i(43);
        if (f20540a == null) {
            synchronized (C0517a.class) {
                try {
                    if (f20540a == null) {
                        f20540a = new C0517a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(43);
                    throw th;
                }
            }
        }
        C0517a c0517a = f20540a;
        MethodCollector.m14707o(43);
        return c0517a;
    }

    /* renamed from: a */
    public void m20980a(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        this.f20541b.remove(iNetworkQualityChangeListener);
    }

    /* renamed from: a */
    public void m20981a(double d) {
        boolean m20964a;
        NetworkSpeed networkSpeed;
        for (Map.Entry<INetworkQualityChangeListener, C0523f> entry : this.f20541b.entrySet()) {
            INetworkQualityChangeListener key = entry.getKey();
            C0523f value = entry.getValue();
            if (key != null && value != null && !value.m20963b() && value.f20574a != (m20964a = value.m20964a(d))) {
                value.f20574a = m20964a;
                if (m20964a) {
                    networkSpeed = NetworkSpeed.Slow;
                } else {
                    networkSpeed = NetworkSpeed.Fast;
                }
                key.onNetworkQualityChanged(networkSpeed);
            }
        }
    }

    /* renamed from: a */
    public void m20979a(INetworkQualityChangeListener iNetworkQualityChangeListener, C0523f c0523f) {
        if (iNetworkQualityChangeListener == null) {
            ALog.m20786e("BandWidthListenerHelp", "listener is null", null, new Object[0]);
        } else if (c0523f == null) {
            this.f20542c.f20575b = System.currentTimeMillis();
            this.f20541b.put(iNetworkQualityChangeListener, this.f20542c);
        } else {
            c0523f.f20575b = System.currentTimeMillis();
            this.f20541b.put(iNetworkQualityChangeListener, c0523f);
        }
    }
}
