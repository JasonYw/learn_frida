package anet.channel.strategy;

import anet.channel.util.ALog;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.InetAddress;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: anet.channel.strategy.b */
/* loaded from: classes2.dex */
public class RunnableC0550b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f20733a;

    /* renamed from: b */
    public final /* synthetic */ Object f20734b;

    /* renamed from: c */
    public final /* synthetic */ C0549a f20735c;

    static {
        Covode.recordClassIndex(2312);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        MethodCollector.m14708i(73);
        try {
            try {
                String hostAddress = InetAddress.getByName(this.f20733a).getHostAddress();
                LinkedList linkedList = new LinkedList();
                ConnProtocol connProtocol = StrategyTemplate.getInstance().getConnProtocol(this.f20733a);
                if (connProtocol != null) {
                    if (!this.f20735c.m20839a(connProtocol)) {
                        i = 80;
                    } else {
                        i = 443;
                    }
                    linkedList.add(IPConnStrategy.m20870a(hostAddress, i, connProtocol, 0, 0, 1, 45000));
                }
                linkedList.add(IPConnStrategy.m20870a(hostAddress, 80, ConnProtocol.HTTP, 0, 0, 0, 0));
                linkedList.add(IPConnStrategy.m20870a(hostAddress, 443, ConnProtocol.HTTPS, 0, 0, 0, 0));
                this.f20735c.f20731a.put(this.f20733a, linkedList);
                if (ALog.isPrintLog(1)) {
                    ALog.m20788d("awcn.LocalDnsStrategyTable", "resolve ip by local dns", null, C1315c.f22208f, this.f20733a, "ip", hostAddress, "list", linkedList);
                }
                synchronized (this.f20735c.f20732b) {
                    try {
                        this.f20735c.f20732b.remove(this.f20733a);
                    } finally {
                    }
                }
                synchronized (this.f20734b) {
                    try {
                        this.f20734b.notifyAll();
                    } finally {
                    }
                }
            } catch (Exception unused) {
                if (ALog.isPrintLog(1)) {
                    ALog.m20788d("awcn.LocalDnsStrategyTable", "resolve ip by local dns failed", null, C1315c.f22208f, this.f20733a);
                }
                this.f20735c.f20731a.put(this.f20733a, Collections.EMPTY_LIST);
                synchronized (this.f20735c.f20732b) {
                    try {
                        this.f20735c.f20732b.remove(this.f20733a);
                        synchronized (this.f20734b) {
                            try {
                                this.f20734b.notifyAll();
                            } finally {
                                MethodCollector.m14707o(73);
                            }
                        }
                    } finally {
                        MethodCollector.m14707o(73);
                    }
                }
            }
            MethodCollector.m14707o(73);
        } catch (Throwable th) {
            synchronized (this.f20735c.f20732b) {
                try {
                    this.f20735c.f20732b.remove(this.f20733a);
                    synchronized (this.f20734b) {
                        try {
                            this.f20734b.notifyAll();
                            MethodCollector.m14707o(73);
                            throw th;
                        } finally {
                            MethodCollector.m14707o(73);
                        }
                    }
                } finally {
                    MethodCollector.m14707o(73);
                }
            }
        }
    }

    public RunnableC0550b(C0549a c0549a, String str, Object obj) {
        this.f20735c = c0549a;
        this.f20733a = str;
        this.f20734b = obj;
    }
}
