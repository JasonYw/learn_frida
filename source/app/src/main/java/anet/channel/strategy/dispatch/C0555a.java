package anet.channel.strategy.dispatch;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.C0577a;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: anet.channel.strategy.dispatch.a */
/* loaded from: classes2.dex */
public class C0555a {

    /* renamed from: b */
    public static Random f20748b = new Random();

    /* renamed from: a */
    public Map<String, Object> f20749a;

    static {
        Covode.recordClassIndex(2323);
    }

    /* renamed from: anet.channel.strategy.dispatch.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC0556a implements Runnable {

        /* renamed from: b */
        public Map<String, Object> f20751b;

        static {
            Covode.recordClassIndex(2324);
        }

        @Override // java.lang.Runnable
        public void run() {
            MethodCollector.m14708i(79);
            try {
                Map<String, Object> map = this.f20751b;
                if (map == null) {
                    synchronized (C0555a.class) {
                        map = C0555a.this.f20749a;
                        C0555a.this.f20749a = null;
                    }
                }
                if (!NetworkStatusHelper.isConnected()) {
                    MethodCollector.m14707o(79);
                } else if (GlobalAppRuntimeInfo.getEnv() != map.get("Env")) {
                    ALog.m20783w("awcn.AmdcThreadPoolExecutor", "task's env changed", null, new Object[0]);
                    MethodCollector.m14707o(79);
                } else {
                    C0557b.m20820a(C0559d.m20817a(map));
                    MethodCollector.m14707o(79);
                }
            } catch (Exception e) {
                ALog.m20787e("awcn.AmdcThreadPoolExecutor", "exec amdc task failed.", null, e, new Object[0]);
                MethodCollector.m14707o(79);
            }
        }

        public RunnableC0556a() {
        }

        public RunnableC0556a(Map<String, Object> map) {
            this.f20751b = map;
        }
    }

    /* renamed from: a */
    public void m20827a(Map<String, Object> map) {
        MethodCollector.m14708i(80);
        try {
            map.put("Env", GlobalAppRuntimeInfo.getEnv());
            synchronized (this) {
                if (this.f20749a == null) {
                    this.f20749a = map;
                    int nextInt = f20748b.nextInt(PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR) + Constants.ASSEMBLE_PUSH_RETRY_INTERVAL;
                    ALog.m20785i("awcn.AmdcThreadPoolExecutor", "merge amdc request", null, "delay", Integer.valueOf(nextInt));
                    C0577a.m20798a(new RunnableC0556a(), nextInt);
                } else {
                    Set set = (Set) this.f20749a.get("hosts");
                    Set set2 = (Set) map.get("hosts");
                    if (map.get("Env") != this.f20749a.get("Env")) {
                        this.f20749a = map;
                    } else if (set.size() + set2.size() <= 40) {
                        set2.addAll(set);
                        this.f20749a = map;
                    } else {
                        C0577a.m20799a(new RunnableC0556a(map));
                    }
                }
            }
        } catch (Exception unused) {
        }
        MethodCollector.m14707o(80);
    }
}
