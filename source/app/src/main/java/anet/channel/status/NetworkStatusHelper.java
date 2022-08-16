package anet.channel.status;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0594g;
import anet.channel.util.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.CopyOnWriteArraySet;
import p002O.C0002O;

/* loaded from: classes2.dex */
public class NetworkStatusHelper {
    public static CopyOnWriteArraySet<INetworkStatusChangeListener> listeners = new CopyOnWriteArraySet<>();

    /* loaded from: classes2.dex */
    public interface INetworkStatusChangeListener {
        static {
            Covode.recordClassIndex(2283);
        }

        void onNetworkStatusChanged(NetworkStatus networkStatus);
    }

    public static String getApn() {
        return C0545b.f20677e;
    }

    public static String getCarrier() {
        return C0545b.f20680h;
    }

    public static String getNetworkSubType() {
        return C0545b.f20676d;
    }

    public static String getSimOp() {
        return C0545b.f20681i;
    }

    public static NetworkStatus getStatus() {
        return C0545b.f20675c;
    }

    public static String getWifiBSSID() {
        return C0545b.f20679g;
    }

    public static String getWifiSSID() {
        return C0545b.f20678f;
    }

    public static boolean isRoaming() {
        return C0545b.f20683k;
    }

    /* loaded from: classes2.dex */
    public enum NetworkStatus {
        NONE,
        NO,
        G2,
        G3,
        G4,
        WIFI,
        G5;

        public final boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public final boolean isMobile() {
            if (this != G2 && this != G3 && this != G4 && this != G5) {
                return false;
            }
            return true;
        }

        public final String getType() {
            if (this == G2) {
                return "2G";
            }
            if (this == G3) {
                return "3G";
            }
            if (this == G4) {
                return "4G";
            }
            if (this == G5) {
                return "5G";
            }
            return toString();
        }

        static {
            Covode.recordClassIndex(2284);
        }
    }

    public static int getRestrictBackgroundStatus() {
        return C0545b.m20879g();
    }

    static {
        Covode.recordClassIndex(2282);
    }

    public static Pair<String, Integer> getWifiProxy() {
        if (C0545b.f20675c != NetworkStatus.WIFI) {
            return null;
        }
        return C0545b.f20682j;
    }

    public static String getDnsServerAddress() {
        if (!C0545b.f20684l.isEmpty()) {
            return C0545b.f20684l.get(0).getHostAddress();
        }
        return C0545b.m20880f();
    }

    public static String getProxyType() {
        NetworkStatus networkStatus = C0545b.f20675c;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return "proxy";
        }
        if (networkStatus.isMobile() && C0545b.f20677e.contains("wap")) {
            return "wap";
        }
        if (networkStatus.isMobile() && C0594g.m20758a() != null) {
            return "auth";
        }
        return "";
    }

    public static boolean isConnected() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (C0545b.f20674b) {
                return true;
            }
        } else if (C0545b.f20675c != NetworkStatus.NO) {
            return true;
        }
        try {
            NetworkInfo m20881e = C0545b.m20881e();
            if (m20881e != null) {
                if (m20881e.isConnected()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isProxy() {
        NetworkStatus networkStatus = C0545b.f20675c;
        String str = C0545b.f20677e;
        if (networkStatus != NetworkStatus.WIFI || getWifiProxy() == null) {
            if (networkStatus.isMobile()) {
                if (str.contains("wap") || C0594g.m20758a() != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void printNetworkDetail() {
        try {
            NetworkStatus status = getStatus();
            StringBuilder sb = new StringBuilder(128);
            sb.append("\nNetwork detail*******************************\n");
            sb.append("Status: ");
            sb.append(status.getType());
            sb.append('\n');
            sb.append("Subtype: ");
            sb.append(getNetworkSubType());
            sb.append('\n');
            if (status != NetworkStatus.NO) {
                if (status.isMobile()) {
                    sb.append("Apn: ");
                    sb.append(getApn());
                    sb.append('\n');
                    sb.append("Carrier: ");
                    sb.append(getCarrier());
                    sb.append('\n');
                } else {
                    sb.append("BSSID: ");
                    sb.append(getWifiBSSID());
                    sb.append('\n');
                    sb.append("SSID: ");
                    sb.append(getWifiSSID());
                    sb.append('\n');
                }
            }
            if (isProxy()) {
                sb.append("Proxy: ");
                sb.append(getProxyType());
                sb.append('\n');
                Pair<String, Integer> wifiProxy = getWifiProxy();
                if (wifiProxy != null) {
                    sb.append("ProxyHost: ");
                    sb.append((String) wifiProxy.first);
                    sb.append('\n');
                    sb.append("ProxyPort: ");
                    sb.append(wifiProxy.second);
                    sb.append('\n');
                }
            }
            sb.append("*********************************************");
            ALog.m20785i("awcn.NetworkStatusHelper", sb.toString(), null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void stopListener(Context context) {
        C0545b.m20885b();
    }

    public static void addStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.add(iNetworkStatusChangeListener);
    }

    public static void removeStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.remove(iNetworkStatusChangeListener);
    }

    public static void notifyStatusChanged(NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0544a(networkStatus));
    }

    public static String getUniqueId(NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String md5ToHex = StringUtils.md5ToHex(getWifiBSSID());
            if (TextUtils.isEmpty(md5ToHex)) {
                md5ToHex = "";
            }
            return "WIFI$".concat(String.valueOf(md5ToHex));
        } else if (!networkStatus.isMobile()) {
            return "";
        } else {
            return C0002O.m25085C(networkStatus.getType(), "$", getApn());
        }
    }

    public static synchronized void startListener(Context context) {
        synchronized (NetworkStatusHelper.class) {
            MethodCollector.m14708i(48);
            if (context != null) {
                C0545b.f20673a = context;
                C0545b.m20890a();
                C0545b.m20883c();
                MethodCollector.m14707o(48);
            } else {
                NullPointerException nullPointerException = new NullPointerException("context is null");
                MethodCollector.m14707o(48);
                throw nullPointerException;
            }
        }
    }
}
