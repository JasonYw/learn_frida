package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.p026e.C0493a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C0579c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class StrategyTable implements Serializable {

    /* renamed from: e */
    public static Comparator<StrategyCollection> f20723e = new C0576o();

    /* renamed from: a */
    public String f20724a;

    /* renamed from: b */
    public volatile String f20725b;

    /* renamed from: c */
    public Map<String, Long> f20726c;

    /* renamed from: d */
    public transient boolean f20727d;

    /* renamed from: f */
    public HostLruCache f20728f;

    /* renamed from: g */
    public volatile transient int f20729g;

    static {
        Covode.recordClassIndex(2307);
    }

    /* renamed from: b */
    private void m20842b() {
        if (!HttpDispatcher.getInstance().isInitHostsChanged(this.f20724a)) {
            return;
        }
        for (String str : HttpDispatcher.getInstance().getInitHosts()) {
            this.f20728f.put(str, new StrategyCollection(str));
        }
    }

    /* renamed from: c */
    private void m20840c() {
        MethodCollector.m14708i(70);
        try {
            if (HttpDispatcher.getInstance().isInitHostsChanged(this.f20724a)) {
                TreeSet treeSet = null;
                synchronized (this.f20728f) {
                    for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                        if (!this.f20728f.containsKey(str)) {
                            this.f20728f.put(str, new StrategyCollection(str));
                            if (treeSet == null) {
                                treeSet = new TreeSet();
                            }
                            treeSet.add(str);
                        }
                    }
                }
                if (treeSet != null) {
                    m20843a(treeSet);
                }
            }
            MethodCollector.m14707o(70);
        } catch (Exception e) {
            ALog.m20787e("awcn.StrategyTable", "checkInitHost failed", this.f20724a, e, new Object[0]);
            MethodCollector.m14707o(70);
        }
    }

    /* renamed from: a */
    public void m20848a() {
        if (this.f20728f == null) {
            this.f20728f = new HostLruCache(256);
            m20842b();
        }
        for (StrategyCollection strategyCollection : this.f20728f.values()) {
            strategyCollection.checkInit();
        }
        int i = 0;
        ALog.m20785i("awcn.StrategyTable", "strategy map", null, "size", Integer.valueOf(this.f20728f.size()));
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            i = -1;
        }
        this.f20729g = i;
        if (this.f20726c == null) {
            this.f20726c = new ConcurrentHashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        static {
            Covode.recordClassIndex(2308);
        }

        public HostLruCache(int i) {
            super(i);
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            if (!entry.getValue().f20705d) {
                return true;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                if (!((StrategyCollection) ((Map.Entry) it.next()).getValue()).f20705d) {
                    it.remove();
                    return false;
                }
            }
            return false;
        }
    }

    public StrategyTable(String str) {
        this.f20724a = str;
        m20848a();
    }

    /* renamed from: a */
    private void m20847a(String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        m20843a(treeSet);
    }

    public String getCnameByHost(String str) {
        StrategyCollection strategyCollection;
        MethodCollector.m14708i(65);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m14707o(65);
            return null;
        }
        synchronized (this.f20728f) {
            try {
                strategyCollection = (StrategyCollection) this.f20728f.get(str);
            } catch (Throwable th) {
                MethodCollector.m14707o(65);
                throw th;
            }
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            m20847a(str);
        }
        if (strategyCollection != null) {
            String str2 = strategyCollection.f20704c;
            MethodCollector.m14707o(65);
            return str2;
        }
        MethodCollector.m14707o(65);
        return null;
    }

    /* renamed from: a */
    private void m20843a(Set<String> set) {
        MethodCollector.m14708i(68);
        if (set != null && !set.isEmpty()) {
            if ((!GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0) && NetworkStatusHelper.isConnected()) {
                int amdcLimitLevel = AmdcRuntimeInfo.getAmdcLimitLevel();
                if (amdcLimitLevel == 3) {
                    MethodCollector.m14707o(68);
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (this.f20728f) {
                    try {
                        for (String str : set) {
                            StrategyCollection strategyCollection = (StrategyCollection) this.f20728f.get(str);
                            if (strategyCollection != null) {
                                strategyCollection.f20703b = 30000 + currentTimeMillis;
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m14707o(68);
                        throw th;
                    }
                }
                if (amdcLimitLevel == 0) {
                    m20841b(set);
                }
                HttpDispatcher.getInstance().sendAmdcRequest(set, this.f20729g);
                MethodCollector.m14707o(68);
                return;
            }
            ALog.m20785i("awcn.StrategyTable", "app in background or no network", this.f20724a, new Object[0]);
            MethodCollector.m14707o(68);
            return;
        }
        MethodCollector.m14707o(68);
    }

    /* renamed from: b */
    private void m20841b(Set<String> set) {
        MethodCollector.m14708i(69);
        TreeSet treeSet = new TreeSet(f20723e);
        synchronized (this.f20728f) {
            try {
                treeSet.addAll(this.f20728f.values());
            } finally {
                MethodCollector.m14707o(69);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            StrategyCollection strategyCollection = (StrategyCollection) it.next();
            if (!strategyCollection.isExpired() || set.size() >= 40) {
                break;
            }
            strategyCollection.f20703b = 30000 + currentTimeMillis;
            set.add(strategyCollection.f20702a);
        }
    }

    public List<IConnStrategy> queryByHost(String str) {
        StrategyCollection strategyCollection;
        MethodCollector.m14708i(64);
        if (!TextUtils.isEmpty(str) && C0579c.m20792c(str)) {
            m20840c();
            synchronized (this.f20728f) {
                try {
                    strategyCollection = (StrategyCollection) this.f20728f.get(str);
                    if (strategyCollection == null) {
                        strategyCollection = new StrategyCollection(str);
                        this.f20728f.put(str, strategyCollection);
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(64);
                    throw th;
                }
            }
            if (strategyCollection.f20703b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
                m20847a(str);
            }
            List<IConnStrategy> queryStrategyList = strategyCollection.queryStrategyList();
            MethodCollector.m14707o(64);
            return queryStrategyList;
        }
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        MethodCollector.m14707o(64);
        return list;
    }

    public void update(C0568l.C0572d c0572d) {
        C0568l.C0570b[] c0570bArr;
        MethodCollector.m14708i(66);
        ALog.m20785i("awcn.StrategyTable", "update strategyTable with httpDns response", this.f20724a, new Object[0]);
        try {
            this.f20725b = c0572d.f20793a;
            this.f20729g = c0572d.f20798f;
            c0570bArr = c0572d.f20794b;
        } catch (Throwable th) {
            ALog.m20787e("awcn.StrategyTable", "fail to update strategyTable", this.f20724a, th, new Object[0]);
        }
        if (c0570bArr == null) {
            MethodCollector.m14707o(66);
            return;
        }
        synchronized (this.f20728f) {
            for (C0568l.C0570b c0570b : c0570bArr) {
                if (c0570b != null && c0570b.f20779a != null) {
                    if (c0570b.f20788j) {
                        this.f20728f.remove(c0570b.f20779a);
                    } else {
                        StrategyCollection strategyCollection = (StrategyCollection) this.f20728f.get(c0570b.f20779a);
                        if (strategyCollection == null) {
                            strategyCollection = new StrategyCollection(c0570b.f20779a);
                            this.f20728f.put(c0570b.f20779a, strategyCollection);
                        }
                        strategyCollection.update(c0570b);
                    }
                }
            }
        }
        this.f20727d = true;
        if (ALog.isPrintLog(1)) {
            StringBuilder sb = new StringBuilder("uniqueId : ");
            sb.append(this.f20724a);
            sb.append("\n-------------------------domains:------------------------------------");
            ALog.m20788d("awcn.StrategyTable", sb.toString(), null, new Object[0]);
            synchronized (this.f20728f) {
                try {
                    for (Map.Entry entry : this.f20728f.entrySet()) {
                        sb.setLength(0);
                        sb.append((String) entry.getKey());
                        sb.append(" = ");
                        sb.append(((StrategyCollection) entry.getValue()).toString());
                        ALog.m20788d("awcn.StrategyTable", sb.toString(), null, new Object[0]);
                    }
                } catch (Throwable th2) {
                    MethodCollector.m14707o(66);
                    throw th2;
                }
            }
            MethodCollector.m14707o(66);
            return;
        }
        MethodCollector.m14707o(66);
    }

    /* renamed from: a */
    public boolean m20846a(String str, long j) {
        Long l = this.f20726c.get(str);
        if (l == null) {
            return false;
        }
        if (l.longValue() + j < System.currentTimeMillis()) {
            this.f20726c.remove(str);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m20844a(String str, boolean z) {
        StrategyCollection strategyCollection;
        MethodCollector.m14708i(67);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m14707o(67);
            return;
        }
        synchronized (this.f20728f) {
            try {
                strategyCollection = (StrategyCollection) this.f20728f.get(str);
                if (strategyCollection == null) {
                    strategyCollection = new StrategyCollection(str);
                    this.f20728f.put(str, strategyCollection);
                }
            } finally {
                MethodCollector.m14707o(67);
            }
        }
        if (z || strategyCollection.f20703b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            m20847a(str);
        }
    }

    /* renamed from: a */
    public void m20845a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyCollection strategyCollection;
        MethodCollector.m14708i(71);
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.StrategyTable", "[notifyConnEvent]", null, "Host", str, "IConnStrategy", iConnStrategy, "ConnEvent", connEvent);
        }
        String str2 = iConnStrategy.getProtocol().protocol;
        if ("http3".equals(str2) || "http3plain".equals(str2)) {
            C0493a.m21008a(connEvent.isSuccess);
            ALog.m20786e("awcn.StrategyTable", "enable http3", null, "uniqueId", this.f20724a, "enable", Boolean.valueOf(connEvent.isSuccess));
        }
        if (!connEvent.isSuccess && C0579c.m20793b(iConnStrategy.getIp())) {
            this.f20726c.put(str, Long.valueOf(System.currentTimeMillis()));
            ALog.m20786e("awcn.StrategyTable", "disable ipv6", null, "uniqueId", this.f20724a, C1315c.f22208f, str);
        }
        synchronized (this.f20728f) {
            try {
                strategyCollection = (StrategyCollection) this.f20728f.get(str);
            } finally {
                MethodCollector.m14707o(71);
            }
        }
        if (strategyCollection != null) {
            strategyCollection.notifyConnEvent(iConnStrategy, connEvent);
        }
    }
}
