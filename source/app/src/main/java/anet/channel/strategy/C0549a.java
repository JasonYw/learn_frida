package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.C0577a;
import anet.channel.strategy.utils.C0579c;
import anet.channel.util.ALog;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.a */
/* loaded from: classes2.dex */
public class C0549a {

    /* renamed from: a */
    public final ConcurrentHashMap<String, List<IPConnStrategy>> f20731a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final HashMap<String, Object> f20732b = new HashMap<>();

    static {
        Covode.recordClassIndex(2311);
    }

    /* renamed from: a */
    public boolean m20839a(ConnProtocol connProtocol) {
        if (!connProtocol.protocol.equalsIgnoreCase("https") && !connProtocol.protocol.equalsIgnoreCase("h2s") && TextUtils.isEmpty(connProtocol.publicKey)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public List m20838a(String str) {
        Object obj;
        MethodCollector.m14708i(72);
        if (!TextUtils.isEmpty(str) && C0579c.m20792c(str) && !DispatchConstants.getAmdcServerDomain().equalsIgnoreCase(str)) {
            if (ALog.isPrintLog(1)) {
                ALog.m20788d("awcn.LocalDnsStrategyTable", "try resolve ip with local dns", null, C1315c.f22208f, str);
            }
            List list = Collections.EMPTY_LIST;
            if (!this.f20731a.containsKey(str)) {
                synchronized (this.f20732b) {
                    try {
                        if (!this.f20732b.containsKey(str)) {
                            obj = new Object();
                            this.f20732b.put(str, obj);
                            m20835a(str, obj);
                        } else {
                            obj = this.f20732b.get(str);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m14707o(72);
                        throw th;
                    }
                }
                if (obj != null) {
                    try {
                        synchronized (obj) {
                            obj.wait(500L);
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
            List<IPConnStrategy> list2 = this.f20731a.get(str);
            if (list2 != null && list2 != Collections.EMPTY_LIST) {
                list = new ArrayList(list2);
            }
            ALog.m20785i("awcn.LocalDnsStrategyTable", "get local strategy", null, "strategyList", list2);
            MethodCollector.m14707o(72);
            return list;
        }
        List list3 = Collections.EMPTY_LIST;
        MethodCollector.m14707o(72);
        return list3;
    }

    /* renamed from: a */
    private void m20835a(String str, Object obj) {
        C0577a.m20799a(new RunnableC0550b(this, str, obj));
    }

    /* renamed from: a */
    public void m20837a(String str, ConnProtocol connProtocol) {
        int i;
        List<IPConnStrategy> list = this.f20731a.get(str);
        if (list != null && !list.isEmpty()) {
            for (IPConnStrategy iPConnStrategy : list) {
                if (iPConnStrategy.getProtocol().equals(connProtocol)) {
                    return;
                }
            }
            String ip = list.get(0).getIp();
            if (!m20839a(connProtocol)) {
                i = 80;
            } else {
                i = 443;
            }
            list.add(IPConnStrategy.m20870a(ip, i, connProtocol, 0, 0, 1, 45000));
            ALog.m20785i("awcn.LocalDnsStrategyTable", "setProtocolForHost", null, "strategyList", list);
        }
    }

    /* renamed from: a */
    public void m20836a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        List<IPConnStrategy> list;
        if (!connEvent.isSuccess && !TextUtils.isEmpty(str) && !connEvent.isAccs && (list = this.f20731a.get(str)) != null && list != Collections.EMPTY_LIST) {
            Iterator<IPConnStrategy> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == iConnStrategy) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                this.f20731a.put(str, Collections.EMPTY_LIST);
            }
        }
    }
}
