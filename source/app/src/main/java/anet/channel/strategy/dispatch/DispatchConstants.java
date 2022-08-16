package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.utils.C0579c;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class DispatchConstants {
    public static final String VERSION = "v";
    public static String[] initHostArray = new String[0];
    public static String[] AMDC_SERVER_DOMAIN = {"amdc.m.taobao.com", "amdc.wapa.taobao.com", "amdc.taobao.net"};
    public static String[][] AMDC_SERVER_FIX_IP = {new String[]{C0579c.m20796a(203119206064L), C0579c.m20796a(203119211219L)}, new String[]{C0579c.m20796a(106011052006L)}, null};

    public static String getAmdcServerDomain() {
        return AMDC_SERVER_DOMAIN[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static String[] getAmdcServerFixIp() {
        return AMDC_SERVER_FIX_IP[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    static {
        Covode.recordClassIndex(2317);
    }

    public static boolean isAmdcServerDomain(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(getAmdcServerDomain());
    }

    public static void setAmdcServerFixIp(String[][] strArr) {
        if (strArr != null && strArr.length >= 2) {
            AMDC_SERVER_FIX_IP = strArr;
            return;
        }
        throw new IllegalArgumentException("ips is null or length < 2");
    }

    public static void setAmdcServerDomain(String[] strArr) {
        if (strArr != null && strArr.length >= 2) {
            for (int i = 0; i < strArr.length; i++) {
                if (TextUtils.isEmpty(strArr[i])) {
                    throw new IllegalArgumentException("domains[" + i + "] is null or empty");
                }
            }
            AMDC_SERVER_DOMAIN = strArr;
            return;
        }
        throw new IllegalArgumentException("domains is null or length < 2");
    }
}
