package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.utils.C0579c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class StrategyConfig implements Serializable {

    /* renamed from: a */
    public SerialLruCache<String, String> f20710a;

    /* renamed from: b */
    public Map<String, String> f20711b;

    /* renamed from: c */
    public transient StrategyInfoHolder f20712c;

    static {
        Covode.recordClassIndex(2302);
    }

    /* renamed from: b */
    public void m20864b() {
        if (this.f20710a == null) {
            this.f20710a = new SerialLruCache<>(256);
        }
        if (this.f20711b == null) {
            this.f20711b = new ConcurrentHashMap();
        }
    }

    /* renamed from: a */
    public StrategyConfig m20868a() {
        MethodCollector.m14708i(55);
        StrategyConfig strategyConfig = new StrategyConfig();
        synchronized (this) {
            try {
                strategyConfig.f20710a = new SerialLruCache<>(this.f20710a, 256);
                strategyConfig.f20711b = new ConcurrentHashMap(this.f20711b);
                strategyConfig.f20712c = this.f20712c;
            } catch (Throwable th) {
                MethodCollector.m14707o(55);
                throw th;
            }
        }
        MethodCollector.m14707o(55);
        return strategyConfig;
    }

    /* renamed from: a */
    public void m20867a(StrategyInfoHolder strategyInfoHolder) {
        this.f20712c = strategyInfoHolder;
    }

    /* renamed from: b */
    public String m20863b(String str) {
        String str2;
        MethodCollector.m14708i(58);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m14707o(58);
            return null;
        }
        synchronized (this) {
            try {
                str2 = this.f20711b.get(str);
            } catch (Throwable th) {
                MethodCollector.m14707o(58);
                throw th;
            }
        }
        MethodCollector.m14707o(58);
        return str2;
    }

    /* renamed from: a */
    public String m20865a(String str) {
        String str2;
        MethodCollector.m14708i(57);
        if (!TextUtils.isEmpty(str) && C0579c.m20792c(str)) {
            synchronized (this) {
                try {
                    str2 = this.f20710a.get(str);
                    if (str2 == null) {
                        this.f20710a.put(str, "No_Result");
                    }
                } finally {
                    MethodCollector.m14707o(57);
                }
            }
            if (str2 == null) {
                this.f20712c.m20856d().m20844a(str, false);
            } else if ("No_Result".equals(str2)) {
                str2 = null;
            }
            return str2;
        }
        MethodCollector.m14707o(57);
        return null;
    }

    /* renamed from: a */
    public void m20866a(C0568l.C0572d c0572d) {
        MethodCollector.m14708i(56);
        if (c0572d.f20794b == null) {
            MethodCollector.m14707o(56);
            return;
        }
        synchronized (this) {
            TreeMap treeMap = null;
            for (int i = 0; i < c0572d.f20794b.length; i++) {
                try {
                    C0568l.C0570b c0570b = c0572d.f20794b[i];
                    if (c0570b.f20788j) {
                        this.f20710a.remove(c0570b.f20779a);
                    } else if (c0570b.f20782d != null) {
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                        }
                        treeMap.put(c0570b.f20779a, c0570b.f20782d);
                    } else {
                        if (!"http".equalsIgnoreCase(c0570b.f20781c) && !"https".equalsIgnoreCase(c0570b.f20781c)) {
                            this.f20710a.put(c0570b.f20779a, "No_Result");
                        } else {
                            this.f20710a.put(c0570b.f20779a, c0570b.f20781c);
                        }
                        if (!TextUtils.isEmpty(c0570b.f20783e)) {
                            this.f20711b.put(c0570b.f20779a, c0570b.f20783e);
                        } else {
                            this.f20711b.remove(c0570b.f20779a);
                        }
                    }
                } finally {
                    MethodCollector.m14707o(56);
                }
            }
            if (treeMap != null) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str = (String) entry.getValue();
                    if (this.f20710a.containsKey(str)) {
                        this.f20710a.put(entry.getKey(), this.f20710a.get(str));
                    } else {
                        this.f20710a.put(entry.getKey(), "No_Result");
                    }
                }
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.StrategyConfig", "", null, "SchemeMap", this.f20710a.toString());
            ALog.m20788d("awcn.StrategyConfig", "", null, "UnitMap", this.f20711b.toString());
        }
    }
}
