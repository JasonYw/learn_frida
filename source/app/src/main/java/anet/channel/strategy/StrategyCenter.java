package anet.channel.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes2.dex */
public class StrategyCenter {
    public static volatile IStrategyInstance instance;

    static {
        Covode.recordClassIndex(PushConstants.DOWN_LOAD_LARGE_ICON_ERROR);
    }

    public static IStrategyInstance getInstance() {
        MethodCollector.m14708i(50);
        if (instance == null) {
            synchronized (StrategyCenter.class) {
                try {
                    if (instance == null) {
                        instance = new C0563g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(50);
                    throw th;
                }
            }
        }
        IStrategyInstance iStrategyInstance = instance;
        MethodCollector.m14707o(50);
        return iStrategyInstance;
    }

    public static void setInstance(IStrategyInstance iStrategyInstance) {
        instance = iStrategyInstance;
    }
}
