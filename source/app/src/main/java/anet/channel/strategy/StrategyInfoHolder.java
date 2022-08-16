package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.StrategyStatObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.utils.C0577a;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p002O.C0002O;

/* loaded from: classes2.dex */
public class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    public Map<String, StrategyTable> f20713a = new LruStrategyMap();

    /* renamed from: b */
    public volatile StrategyConfig f20714b = null;

    /* renamed from: c */
    public final C0549a f20715c = new C0549a();

    /* renamed from: d */
    public final StrategyTable f20716d = new StrategyTable("Unknown");

    /* renamed from: e */
    public final Set<String> f20717e = new HashSet();

    /* renamed from: f */
    public volatile String f20718f = "";

    static {
        Covode.recordClassIndex(2303);
    }

    /* renamed from: b */
    public void m20858b() {
        NetworkStatusHelper.removeStatusChangeListener(this);
    }

    /* loaded from: classes8.dex */
    public static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        static {
            Covode.recordClassIndex(2304);
        }

        public LruStrategyMap() {
            super(3);
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyTable> entry) {
            C0577a.m20799a(new RunnableC0562f(this, entry));
            return true;
        }
    }

    /* renamed from: a */
    public static StrategyInfoHolder m20862a() {
        return new StrategyInfoHolder();
    }

    /* renamed from: e */
    private void m20855e() {
        NetworkStatusHelper.addStatusChangeListener(this);
        this.f20718f = m20861a(NetworkStatusHelper.getStatus());
    }

    public StrategyInfoHolder() {
        try {
            m20855e();
            m20853g();
            m20854f();
        } catch (Throwable unused) {
            m20854f();
        }
    }

    /* renamed from: g */
    private void m20853g() {
        ALog.m20785i("awcn.StrategyInfoHolder", "restore", null, new Object[0]);
        String str = this.f20718f;
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            if (!TextUtils.isEmpty(str)) {
                m20859a(str, true);
            }
            this.f20714b = (StrategyConfig) C0574m.m20805a("StrategyConfig", null);
            if (this.f20714b != null) {
                this.f20714b.m20864b();
                this.f20714b.m20867a(this);
            }
        }
        C0577a.m20799a(new RunnableC0553d(this, str));
    }

    /* renamed from: d */
    public StrategyTable m20856d() {
        MethodCollector.m14708i(62);
        StrategyTable strategyTable = this.f20716d;
        String str = this.f20718f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f20713a) {
                try {
                    strategyTable = this.f20713a.get(str);
                    if (strategyTable == null) {
                        strategyTable = new StrategyTable(str);
                        this.f20713a.put(str, strategyTable);
                    }
                } finally {
                    MethodCollector.m14707o(62);
                }
            }
        }
        return strategyTable;
    }

    /* renamed from: f */
    private void m20854f() {
        MethodCollector.m14708i(59);
        for (Map.Entry<String, StrategyTable> entry : this.f20713a.entrySet()) {
            entry.getValue().m20848a();
        }
        synchronized (this) {
            try {
                if (this.f20714b == null) {
                    StrategyConfig strategyConfig = new StrategyConfig();
                    strategyConfig.m20864b();
                    strategyConfig.m20867a(this);
                    this.f20714b = strategyConfig;
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(59);
                throw th;
            }
        }
        MethodCollector.m14707o(59);
    }

    /* renamed from: c */
    public void m20857c() {
        MethodCollector.m14708i(61);
        synchronized (this) {
            try {
                for (StrategyTable strategyTable : this.f20713a.values()) {
                    if (strategyTable.f20727d) {
                        StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                        strategyStatObject.writeStrategyFileId = strategyTable.f20724a;
                        C0574m.m20807a(strategyTable, strategyTable.f20724a, strategyStatObject);
                        strategyTable.f20727d = false;
                    }
                }
                C0574m.m20807a(this.f20714b.m20868a(), "StrategyConfig", null);
            } catch (Throwable th) {
                MethodCollector.m14707o(61);
                throw th;
            }
        }
        MethodCollector.m14707o(61);
    }

    /* renamed from: a */
    public void m20860a(C0568l.C0572d c0572d) {
        if (c0572d.f20799g != 0) {
            AmdcRuntimeInfo.updateAmdcLimit(c0572d.f20799g, c0572d.f20800h);
        }
        m20856d().update(c0572d);
        this.f20714b.m20866a(c0572d);
    }

    /* renamed from: a */
    private String m20861a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String md5ToHex = StringUtils.md5ToHex(NetworkStatusHelper.getWifiBSSID());
            if (TextUtils.isEmpty(md5ToHex)) {
                md5ToHex = "";
            }
            return "WIFI$".concat(String.valueOf(md5ToHex));
        } else if (!networkStatus.isMobile()) {
            return "";
        } else {
            return C0002O.m25085C(networkStatus.getType(), "$", NetworkStatusHelper.getApn());
        }
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        MethodCollector.m14708i(63);
        this.f20718f = m20861a(networkStatus);
        String str = this.f20718f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f20713a) {
                try {
                    if (!this.f20713a.containsKey(str)) {
                        C0577a.m20799a(new RunnableC0561e(this, str));
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(63);
                    throw th;
                }
            }
            MethodCollector.m14707o(63);
            return;
        }
        MethodCollector.m14707o(63);
    }

    /* renamed from: a */
    public void m20859a(String str, boolean z) {
        MethodCollector.m14708i(60);
        synchronized (this.f20717e) {
            try {
                if (!this.f20717e.contains(str)) {
                    this.f20717e.add(str);
                    StrategyStatObject strategyStatObject = null;
                    int i = 0;
                    if (z) {
                        strategyStatObject = new StrategyStatObject(0);
                        strategyStatObject.readStrategyFileId = str;
                    }
                    StrategyTable strategyTable = (StrategyTable) C0574m.m20805a(str, strategyStatObject);
                    if (strategyTable != null) {
                        strategyTable.m20848a();
                        synchronized (this.f20713a) {
                            try {
                                this.f20713a.put(strategyTable.f20724a, strategyTable);
                            } finally {
                            }
                        }
                    }
                    synchronized (this.f20717e) {
                        try {
                            this.f20717e.remove(str);
                        } finally {
                            MethodCollector.m14707o(60);
                        }
                    }
                    if (z) {
                        if (strategyTable != null) {
                            i = 1;
                        }
                        strategyStatObject.isSucceed = i;
                        AppMonitor.getInstance().commitStat(strategyStatObject);
                    }
                    return;
                }
                MethodCollector.m14707o(60);
            } finally {
                MethodCollector.m14707o(60);
            }
        }
    }
}
