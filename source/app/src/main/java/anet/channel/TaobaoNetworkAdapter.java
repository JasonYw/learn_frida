package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import anet.channel.Config;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.appmonitor.C0464a;
import anet.channel.entity.C0504c;
import anet.channel.entity.ENV;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.fulltrace.C0506a;
import anet.channel.p022a.C0461a;
import anet.channel.p022a.C0462b;
import anet.channel.p024c.C0473a;
import anet.channel.p025d.C0476a;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0587Utils;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import p003X.GRT;

/* loaded from: classes2.dex */
public class TaobaoNetworkAdapter implements Serializable {
    public static AtomicBoolean isInited = new AtomicBoolean();

    static {
        Covode.recordClassIndex(2148);
    }

    public static void init(Context context, HashMap<String, Object> hashMap) {
        boolean z;
        if (isInited.compareAndSet(false, true)) {
            if (hashMap != null && "com.taobao.taobao".equals(hashMap.get("process"))) {
                AwcnConfig.setAccsSessionCreateForbiddenInBg(true);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put("liveng-bfrtc.alibabausercontent.com");
                jSONArray.put("livecb-bfrtc.alibabausercontent.com");
                jSONArray.put("liveca-bfrtc.alibabausercontent.com");
                AwcnConfig.setHttpDnsNotifyWhiteList(jSONArray.toString());
            }
            if (hashMap != null && "com.taobao.taobao:channel".equals(hashMap.get("process")) && GRT.LJIIZILJ) {
                ALog.m20786e("awcn.TaobaoNetworkAdapter", "channelLocalInstanceEnable", null, new Object[0]);
                GRT.LIZJ = false;
            }
            ALog.setLog(new C0476a());
            C0473a c0473a = new C0473a();
            if (GRT.LJIJI != null) {
                GRT.LJIJI.unRegister();
            }
            c0473a.register();
            GRT.LJIJI = c0473a;
            AppMonitor.setInstance(new C0464a());
            NetworkAnalysis.setInstance(new C0462b());
            C0506a.m20986a(new C0461a());
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0515j(), ThreadPoolExecutorFactory.Priority.NORMAL);
            if (hashMap != null) {
                try {
                    if ("com.taobao.taobao".equals(hashMap.get("process")) && ((Boolean) hashMap.get("isDebuggable")).booleanValue()) {
                        C0587Utils.invokeStaticMethodThrowException("com.taobao.android.request.analysis.RequestRecorder", "init", new Class[]{Context.class}, context);
                    }
                } catch (Exception e) {
                    ALog.m20787e("awcn.TaobaoNetworkAdapter", "RequestRecorder error.", null, e, new Object[0]);
                }
                try {
                    if (hashMap.containsKey("isNextLaunch") && !PreferenceManager.getDefaultSharedPreferences(context).getBoolean("NEXT_LAUNCH_FORBID", false)) {
                        GlobalAppRuntimeInfo.addBucketInfo("isNextLaunch", "true");
                        z = true;
                    } else {
                        z = false;
                    }
                    AwcnConfig.setTbNextLaunch(z);
                } catch (Exception unused) {
                }
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            boolean z2 = defaultSharedPreferences.getBoolean("HTTP3_ENABLE", true);
            AwcnConfig.setHttp3OrangeEnable(z2);
            if (z2) {
                if (hashMap != null) {
                    if ("com.taobao.taobao".equals(hashMap.get("process"))) {
                        AwcnConfig.setHttp3Enable(true);
                        ALog.m20786e("awcn.TaobaoNetworkAdapter", "http3 enabled.", null, new Object[0]);
                    }
                } else {
                    return;
                }
            } else if (hashMap == null) {
                return;
            }
            try {
                boolean containsKey = hashMap.containsKey("ngLaunch");
                if ("com.taobao.taobao".equals((String) hashMap.get("process"))) {
                    if (defaultSharedPreferences.getBoolean("SERVICE_OPTIMIZE", true)) {
                        GRT.LJIILLIIL = true;
                        ALog.m20786e("awcn.TaobaoNetworkAdapter", "bindservice optimize enabled.", null, new Object[0]);
                    }
                    String str = (String) hashMap.get("onlineAppKey");
                    m21055a("guide-acs.m.taobao.com", str, ConnProtocol.valueOf("http2", "0rtt", "acs"), true, containsKey);
                    ConnProtocol valueOf = ConnProtocol.valueOf("http2", "0rtt", "cdn");
                    m21055a("gw.alicdn.com", str, valueOf, false, containsKey);
                    m21055a("dorangesource.alicdn.com", str, valueOf, false, containsKey);
                    m21055a("ossgw.alicdn.com", str, valueOf, false, containsKey);
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m21055a(String str, String str2, ConnProtocol connProtocol, boolean z, boolean z2) {
        StrategyTemplate.getInstance().registerConnProtocol(str, connProtocol);
        if (z) {
            if (!z2) {
                SessionInfo create = SessionInfo.create(str, z, false, null, null, null);
                Config.Builder builder = new Config.Builder();
                builder.setAppkey(str2);
                builder.setEnv(ENV.ONLINE);
                SessionCenter.getInstance(builder.build()).registerSessionInfo(create);
                return;
            }
            Config.Builder builder2 = new Config.Builder();
            builder2.setAppkey(str2);
            builder2.setEnv(ENV.ONLINE);
            SessionCenter.getInstance(builder2.build()).get(HttpUrl.parse(StringUtils.concatString("https", "://", str)), C0504c.f20505a, 0L);
        }
    }
}
