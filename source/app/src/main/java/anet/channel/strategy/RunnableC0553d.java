package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

/* renamed from: anet.channel.strategy.d */
/* loaded from: classes2.dex */
public class RunnableC0553d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f20739a;

    /* renamed from: b */
    public final /* synthetic */ StrategyInfoHolder f20740b;

    static {
        Covode.recordClassIndex(2315);
    }

    @Override // java.lang.Runnable
    public void run() {
        MethodCollector.m14708i(74);
        try {
            ALog.m20785i("awcn.StrategyInfoHolder", "start loading strategy files", null, new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                ALog.m20785i("awcn.StrategyInfoHolder", "load strategy async", null, new Object[0]);
                if (!TextUtils.isEmpty(this.f20739a)) {
                    this.f20740b.m20859a(this.f20739a, true);
                }
                StrategyConfig strategyConfig = (StrategyConfig) C0574m.m20805a("StrategyConfig", null);
                if (strategyConfig != null) {
                    strategyConfig.m20864b();
                    strategyConfig.m20867a(this.f20740b);
                    synchronized (this.f20740b) {
                        this.f20740b.f20714b = strategyConfig;
                    }
                }
            }
            File[] m20804b = C0574m.m20804b();
            if (m20804b == null) {
                MethodCollector.m14707o(74);
                return;
            }
            int i = 0;
            for (int i2 = 0; i2 < m20804b.length && i < 2; i2++) {
                File file = m20804b[i2];
                if (!file.isDirectory()) {
                    String name = file.getName();
                    if (!name.equals(this.f20739a) && !name.startsWith("StrategyConfig")) {
                        this.f20740b.m20859a(name, false);
                        i++;
                    }
                }
            }
            ALog.m20785i("awcn.StrategyInfoHolder", "end loading strategy files", null, "total cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            MethodCollector.m14707o(74);
        } catch (Exception unused) {
            MethodCollector.m14707o(74);
        }
    }

    public RunnableC0553d(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f20740b = strategyInfoHolder;
        this.f20739a = str;
    }
}
