package anet.channel;

import android.text.TextUtils;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.utils.C0579c;
import anet.channel.util.ALog;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.heytap.mcssdk.constant.C15151a;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AwcnConfig {

    /* renamed from: a */
    public static volatile boolean f20299a;

    /* renamed from: e */
    public static volatile boolean f20303e;

    /* renamed from: k */
    public static boolean f20309k;

    /* renamed from: l */
    public static volatile boolean f20310l;

    /* renamed from: n */
    public static volatile boolean f20312n;

    /* renamed from: p */
    public static volatile boolean f20314p;

    /* renamed from: u */
    public static volatile boolean f20319u;

    /* renamed from: w */
    public static volatile CopyOnWriteArrayList<String> f20321w;

    /* renamed from: b */
    public static volatile boolean f20300b = true;

    /* renamed from: c */
    public static volatile boolean f20301c = true;

    /* renamed from: d */
    public static volatile boolean f20302d = true;

    /* renamed from: f */
    public static volatile boolean f20304f = true;

    /* renamed from: g */
    public static volatile long f20305g = C15151a.f30810g;

    /* renamed from: h */
    public static volatile boolean f20306h = true;

    /* renamed from: i */
    public static volatile boolean f20307i = true;

    /* renamed from: j */
    public static boolean f20308j = true;

    /* renamed from: m */
    public static volatile boolean f20311m = true;

    /* renamed from: o */
    public static volatile int f20313o = 10000;

    /* renamed from: q */
    public static volatile boolean f20315q = true;

    /* renamed from: r */
    public static volatile int f20316r = -1;

    /* renamed from: s */
    public static volatile boolean f20317s = true;

    /* renamed from: t */
    public static volatile boolean f20318t = true;

    /* renamed from: v */
    public static volatile boolean f20320v = true;

    public static int getAccsReconnectionDelayPeriod() {
        return f20313o;
    }

    public static long getIpv6BlackListTtl() {
        return f20305g;
    }

    public static int getXquicCongControl() {
        return f20316r;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        return f20299a;
    }

    public static boolean isAppLifeCycleListenerEnable() {
        return f20308j;
    }

    public static boolean isAsyncLoadStrategyEnable() {
        return f20309k;
    }

    public static boolean isCookieHeaderRedundantFix() {
        return f20318t;
    }

    public static boolean isHorseRaceEnable() {
        return f20301c;
    }

    public static boolean isHttp3Enable() {
        return f20314p;
    }

    public static boolean isHttp3OrangeEnable() {
        return f20315q;
    }

    public static boolean isHttpsSniEnable() {
        return f20300b;
    }

    public static boolean isIdleSessionCloseEnable() {
        return f20304f;
    }

    public static boolean isIpStackDetectByUdpConnect() {
        return f20317s;
    }

    public static boolean isIpv6BlackListEnable() {
        return f20307i;
    }

    public static boolean isIpv6Enable() {
        return f20306h;
    }

    public static boolean isNetworkDetectEnable() {
        return f20312n;
    }

    public static boolean isPing6Enable() {
        return f20311m;
    }

    public static boolean isQuicEnable() {
        return f20303e;
    }

    public static boolean isSendConnectInfoByBroadcast() {
        return f20319u;
    }

    public static boolean isSendConnectInfoByService() {
        return f20320v;
    }

    public static boolean isTbNextLaunch() {
        return f20310l;
    }

    public static boolean isTnetHeaderCacheEnable() {
        return f20302d;
    }

    static {
        Covode.recordClassIndex(2127);
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z) {
        f20299a = z;
    }

    public static void setAppLifeCycleListenerEnable(boolean z) {
        f20308j = z;
    }

    public static void setAsyncLoadStrategyEnable(boolean z) {
        f20309k = z;
    }

    public static void setCookieHeaderRedundantFix(boolean z) {
        f20318t = z;
    }

    public static void setHorseRaceEnable(boolean z) {
        f20301c = z;
    }

    public static void setHttp3OrangeEnable(boolean z) {
        f20315q = z;
    }

    public static void setHttpsSniEnable(boolean z) {
        f20300b = z;
    }

    public static void setIdleSessionCloseEnable(boolean z) {
        f20304f = z;
    }

    public static void setIpStackDetectByUdpConnect(boolean z) {
        f20317s = z;
    }

    public static void setIpv6BlackListEnable(boolean z) {
        f20307i = z;
    }

    public static void setIpv6BlackListTtl(long j) {
        f20305g = j;
    }

    public static void setIpv6Enable(boolean z) {
        f20306h = z;
    }

    public static void setNetworkDetectEnable(boolean z) {
        f20312n = z;
    }

    public static void setPing6Enable(boolean z) {
        f20311m = z;
    }

    public static void setQuicEnable(boolean z) {
        f20303e = z;
    }

    public static void setSendConnectInfoByBroadcast(boolean z) {
        f20319u = z;
    }

    public static void setSendConnectInfoByService(boolean z) {
        f20320v = z;
    }

    public static void setTbNextLaunch(boolean z) {
        f20310l = z;
    }

    public static void setTnetHeaderCacheEnable(boolean z) {
        f20302d = z;
    }

    public static void setXquicCongControl(int i) {
        if (i < 0) {
            return;
        }
        f20316r = i;
    }

    public static void setAccsReconnectionDelayPeriod(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 10000) {
            i = 10000;
        }
        f20313o = i;
    }

    public static boolean isAllowHttpDnsNotify(String str) {
        if (f20321w != null && !TextUtils.isEmpty(str)) {
            return f20321w.contains(str);
        }
        return false;
    }

    public static void setHttp3Enable(boolean z) {
        f20314p = z;
        ALog.m20786e("awcn.AwcnConfig", "[setHttp3Enable]", null, "enable", Boolean.valueOf(z));
    }

    public static void setHttpDnsNotifyWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f20321w = copyOnWriteArrayList;
        } catch (Exception e) {
            ALog.m20787e("awcn.AwcnConfig", "[setHttpDnsNotifyWhiteList] error", null, e, new Object[0]);
        }
    }

    public static void registerPresetSessions(String str) {
        if (!GlobalAppRuntimeInfo.isTargetProcess() || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(C1315c.f22208f);
                if (C0579c.m20792c(string)) {
                    StrategyTemplate.getInstance().registerConnProtocol(string, ConnProtocol.valueOf(jSONObject.getString("protocol"), jSONObject.getString("rtt"), jSONObject.getString("publicKey")));
                    if (jSONObject.getBoolean("isKeepAlive")) {
                        SessionCenter.getInstance().registerSessionInfo(SessionInfo.create(string, true, false, null, null, null));
                    }
                } else {
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }
}
