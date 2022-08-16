package anet.channel.strategy;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class StrategyTemplate {
    public Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(2309);
    }

    public static StrategyTemplate getInstance() {
        return C0548a.f20730a;
    }

    /* renamed from: anet.channel.strategy.StrategyTemplate$a */
    /* loaded from: classes3.dex */
    public static class C0548a {

        /* renamed from: a */
        public static StrategyTemplate f20730a = new StrategyTemplate();

        static {
            Covode.recordClassIndex(2310);
        }
    }

    public ConnProtocol getConnProtocol(String str) {
        return this.templateMap.get(str);
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        if (connProtocol != null) {
            this.templateMap.put(str, connProtocol);
            try {
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                if (strategyCenter instanceof C0563g) {
                    ((C0563g) strategyCenter).f20760b.f20715c.m20837a(str, connProtocol);
                }
            } catch (Exception unused) {
            }
        }
    }
}
