package anet.channel.strategy.dispatch;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.C0579c;
import anet.channel.util.ALog;
import anet.channel.util.C0590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.Map;
import java.util.Set;

/* renamed from: anet.channel.strategy.dispatch.d */
/* loaded from: classes2.dex */
public class C0559d {
    static {
        Covode.recordClassIndex(2327);
    }

    /* renamed from: a */
    public static int m20819a() {
        int m20767c = C0590c.m20767c();
        if (m20767c == 1) {
            return 4;
        }
        if (m20767c == 2) {
            return 2;
        }
        if (m20767c != 3) {
            return 4;
        }
        return 1;
    }

    /* renamed from: b */
    public static String m20816b(Map map) {
        StringBuilder sb = new StringBuilder();
        for (String str : (Set) map.remove("hosts")) {
            sb.append(str);
            sb.append(LoggerUtil.BLANK_TAG);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Map m20817a(Map<String, Object> map) {
        Object obj;
        IAmdcSign sign = AmdcRuntimeInfo.getSign();
        if (sign != null && !TextUtils.isEmpty(sign.getAppkey())) {
            NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
            if (!NetworkStatusHelper.isConnected()) {
                ALog.m20786e("amdc.DispatchParamBuilder", "no network, don't send amdc request", null, new Object[0]);
                return null;
            }
            map.put("appkey", sign.getAppkey());
            map.put("v", "5.0");
            map.put("platform", "android");
            map.put("platformVersion", Build.VERSION.RELEASE);
            if (!TextUtils.isEmpty(GlobalAppRuntimeInfo.getUserId())) {
                map.put("sid", GlobalAppRuntimeInfo.getUserId());
            }
            map.put("netType", status.toString());
            map.put("carrier", NetworkStatusHelper.getCarrier());
            map.put("mnc", NetworkStatusHelper.getSimOp());
            if (AmdcRuntimeInfo.latitude != 0.0d) {
                map.put("lat", String.valueOf(AmdcRuntimeInfo.latitude));
            }
            if (AmdcRuntimeInfo.longitude != 0.0d) {
                map.put("lng", String.valueOf(AmdcRuntimeInfo.longitude));
            }
            map.putAll(AmdcRuntimeInfo.getParams());
            map.put("channel", AmdcRuntimeInfo.appChannel);
            map.put("appName", AmdcRuntimeInfo.appName);
            map.put("appVersion", AmdcRuntimeInfo.appVersion);
            map.put("stackType", Integer.toString(m20819a()));
            map.put("domain", m20816b(map));
            if (sign.useSecurityGuard()) {
                obj = "sec";
            } else {
                obj = "noSec";
            }
            map.put("signType", obj);
            map.put("t", String.valueOf(System.currentTimeMillis()));
            String m20818a = m20818a(sign, map);
            if (TextUtils.isEmpty(m20818a)) {
                return null;
            }
            map.put("sign", m20818a);
            return map;
        }
        ALog.m20786e("amdc.DispatchParamBuilder", "amdc sign is null or appkey is empty", null, new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static String m20818a(IAmdcSign iAmdcSign, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(C0579c.m20791d(map.get("appkey")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("domain")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("appName")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("appVersion")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("bssid")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("channel")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("deviceId")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("lat")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("lng")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("machine")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("netType")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("other")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("platform")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("platformVersion")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("preIp")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("sid")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("t")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("v")));
        sb.append("&");
        sb.append(C0579c.m20791d(map.get("signType")));
        try {
            return iAmdcSign.sign(sb.toString());
        } catch (Exception e) {
            ALog.m20787e("amdc.DispatchParamBuilder", "get sign failed", null, e, new Object[0]);
            return null;
        }
    }
}
