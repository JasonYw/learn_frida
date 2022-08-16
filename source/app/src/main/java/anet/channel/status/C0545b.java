package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.MotionEventCompat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* renamed from: anet.channel.status.b */
/* loaded from: classes2.dex */
public class C0545b {

    /* renamed from: a */
    public static volatile Context f20673a;

    /* renamed from: b */
    public static volatile boolean f20674b;

    /* renamed from: j */
    public static volatile Pair<String, Integer> f20682j;

    /* renamed from: k */
    public static volatile boolean f20683k;

    /* renamed from: n */
    public static volatile boolean f20686n;

    /* renamed from: o */
    public static volatile boolean f20687o;

    /* renamed from: p */
    public static ConnectivityManager f20688p;

    /* renamed from: q */
    public static TelephonyManager f20689q;

    /* renamed from: r */
    public static WifiManager f20690r;

    /* renamed from: s */
    public static SubscriptionManager f20691s;

    /* renamed from: t */
    public static Method f20692t;

    /* renamed from: m */
    public static String[] f20685m = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};

    /* renamed from: c */
    public static volatile NetworkStatusHelper.NetworkStatus f20675c = NetworkStatusHelper.NetworkStatus.NONE;

    /* renamed from: d */
    public static volatile String f20676d = LoggerUtil.UNKNOWN;

    /* renamed from: e */
    public static volatile String f20677e = "";

    /* renamed from: f */
    public static volatile String f20678f = "";

    /* renamed from: g */
    public static volatile String f20679g = "";

    /* renamed from: h */
    public static volatile String f20680h = LoggerUtil.UNKNOWN;

    /* renamed from: i */
    public static volatile String f20681i = "";

    /* renamed from: l */
    public static volatile List<InetAddress> f20684l = Collections.EMPTY_LIST;

    /* renamed from: u */
    public static BroadcastReceiver f20693u = new BroadcastReceiver() { // from class: anet.channel.status.NetworkStatusMonitor$2
        static {
            Covode.recordClassIndex(2285);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            m20891x3607719f(this, context, intent);
        }

        public final void anet_channel_status_NetworkStatusMonitor$2__onReceive$___twin___(Context context, Intent intent) {
            if (ALog.isPrintLog(1)) {
                ALog.m20788d("awcn.NetworkStatusMonitor", C0002O.m25086C("receiver:", intent.getAction()), null, new Object[0]);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0547d(this));
        }

        /* renamed from: anet_channel_status_NetworkStatusMonitor$2_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_onBroadcastReceiverReceive */
        public static void m20891x3607719f(NetworkStatusMonitor$2 networkStatusMonitor$2, Context context, Intent intent) {
            if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                C140181dPd.m21607LJ();
            }
            networkStatusMonitor$2.anet_channel_status_NetworkStatusMonitor$2__onReceive$___twin___(context, intent);
        }
    };

    /* renamed from: anet_channel_status_b_android_net_wifi_WifiManager_getConnectionInfo */
    public static WifiInfo m20886xd08fee2e(WifiManager wifiManager) {
        ActionInvokeEntrance.setEventUuid(102301);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102301, "android.net.wifi.WifiInfo", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (WifiInfo) actionIntercept.second;
        }
        WifiInfo LIZ = C116971W2r.LIZ(wifiManager);
        ActionInvokeEntrance.actionInvoke(LIZ, wifiManager, new Object[0], 102301, "anet_channel_status_b_android_net_wifi_WifiManager_getConnectionInfo(Landroid/net/wifi/WifiManager;)Landroid/net/wifi/WifiInfo;");
        return LIZ;
    }

    /* renamed from: d */
    public static void m20882d() {
        NetworkStatusHelper.NetworkStatus networkStatus = f20675c;
        String str = f20677e;
        String str2 = f20678f;
        try {
            try {
                NetworkInfo m20881e = m20881e();
                if (m20881e == null || !m20881e.isConnected()) {
                    m20888a(NetworkStatusHelper.NetworkStatus.NO, "no network");
                } else {
                    if (m20881e.getType() == 0) {
                        String subtypeName = m20881e.getSubtypeName();
                        String str3 = "";
                        if (!TextUtils.isEmpty(subtypeName)) {
                            str3 = subtypeName.replace(" ", str3);
                        }
                        m20888a(m20889a(m20881e.getSubtype(), str3), str3);
                        f20677e = m20887a(m20881e.getExtraInfo());
                        m20878h();
                    } else if (m20881e.getType() == 1) {
                        m20888a(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                        f20680h = "wifi";
                        f20681i = "wifi";
                        f20682j = m20876j();
                    } else {
                        m20888a(NetworkStatusHelper.NetworkStatus.NONE, LoggerUtil.UNKNOWN);
                    }
                    f20683k = m20881e.isRoaming();
                    C0590c.m20765e();
                }
            } catch (Exception unused) {
                m20888a(NetworkStatusHelper.NetworkStatus.NONE, LoggerUtil.UNKNOWN);
            }
            if (f20675c == networkStatus && f20677e.equalsIgnoreCase(str) && f20678f.equalsIgnoreCase(str2)) {
                return;
            }
            if (ALog.isPrintLog(2)) {
                NetworkStatusHelper.printNetworkDetail();
            }
            NetworkStatusHelper.notifyStatusChanged(f20675c);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: b */
    public static void m20885b() {
        if (f20673a != null) {
            C116971W2r.LIZ(f20673a, f20693u);
        }
    }

    /* renamed from: e */
    public static NetworkInfo m20881e() {
        if (f20688p == null) {
            f20688p = (ConnectivityManager) f20673a.getSystemService("connectivity");
        }
        return C116971W2r.LIZ(f20688p);
    }

    /* renamed from: g */
    public static int m20879g() {
        if (f20688p != null && Build.VERSION.SDK_INT >= 24) {
            return f20688p.getRestrictBackgroundStatus();
        }
        return -1;
    }

    static {
        Covode.recordClassIndex(2287);
    }

    /* renamed from: a */
    public static void m20890a() {
        if (!f20686n && f20673a != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                C116971W2r.LIZ(f20673a, f20693u, intentFilter);
            } catch (Exception unused) {
                ALog.m20786e("awcn.NetworkStatusMonitor", "registerReceiver failed", null, new Object[0]);
            }
            m20882d();
            f20686n = true;
        }
    }

    /* renamed from: c */
    public static void m20883c() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24 && !f20687o) {
            NetworkInfo m20881e = m20881e();
            if (m20881e != null && m20881e.isConnected()) {
                z = true;
            } else {
                z = false;
            }
            f20674b = z;
            f20688p.registerDefaultNetworkCallback(new C0546c());
            f20687o = true;
        }
    }

    /* renamed from: f */
    public static String m20880f() {
        try {
            Method method = C116971W2r.LIZ("android.os.SystemProperties").getMethod("get", String.class);
            String[] strArr = f20685m;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) method.invoke(null, strArr[i]);
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.net.wifi.WifiInfo, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.net.wifi.WifiInfo] */
    /* renamed from: i */
    public static WifiInfo m20877i() {
        ?? r4 = 0;
        try {
            if (f20690r == null) {
                f20690r = (WifiManager) f20673a.getSystemService("wifi");
            }
            r4 = m20886xd08fee2e(f20690r);
            return r4;
        } catch (Throwable th) {
            ALog.m20787e("awcn.NetworkStatusMonitor", "getWifiInfo", r4, th, new Object[0]);
            return r4;
        }
    }

    /* renamed from: j */
    public static Pair<String, Integer> m20876j() {
        try {
            String property = System.getProperty("http.proxyHost");
            if (!TextUtils.isEmpty(property)) {
                return Pair.create(property, Integer.valueOf(Integer.parseInt(System.getProperty("http.proxyPort"))));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static void m20878h() {
        try {
            if (!m20884b("android.permission.READ_PHONE_STATE")) {
                return;
            }
            if (f20689q == null) {
                f20689q = (TelephonyManager) f20673a.getSystemService("phone");
            }
            f20681i = f20689q.getSimOperator();
            if (Build.VERSION.SDK_INT >= 22) {
                if (f20691s == null) {
                    SubscriptionManager from = SubscriptionManager.from(f20673a);
                    f20691s = from;
                    f20692t = from.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
                }
                if (f20692t != null) {
                    f20680h = ((SubscriptionInfo) f20692t.invoke(f20691s, new Object[0])).getCarrierName().toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static boolean m20884b(String str) {
        if (Build.VERSION.SDK_INT < 23 || f20673a.checkSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m20887a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains("cmwap")) {
                return "cmwap";
            }
            if (lowerCase.contains("uniwap")) {
                return "uniwap";
            }
            if (lowerCase.contains("3gwap")) {
                return "3gwap";
            }
            if (lowerCase.contains("ctwap")) {
                return "ctwap";
            }
            if (lowerCase.contains("cmnet")) {
                return "cmnet";
            }
            if (lowerCase.contains("uninet")) {
                return "uninet";
            }
            if (lowerCase.contains("3gnet")) {
                return "3gnet";
            }
            if (lowerCase.contains("ctnet")) {
                return "ctnet";
            }
        }
        return LoggerUtil.UNKNOWN;
    }

    /* renamed from: a */
    public static void m20888a(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        f20675c = networkStatus;
        f20676d = str;
        f20677e = "";
        f20678f = "";
        f20679g = "";
        f20682j = null;
        f20680h = "";
        f20681i = "";
    }

    /* renamed from: a */
    public static NetworkStatusHelper.NetworkStatus m20889a(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkStatusHelper.NetworkStatus.G2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case MotionEventCompat.AXIS_HAT_X /* 15 */:
            case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                return NetworkStatusHelper.NetworkStatus.G3;
            case 13:
            case 18:
            case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                return NetworkStatusHelper.NetworkStatus.G4;
            case 20:
                return NetworkStatusHelper.NetworkStatus.G5;
            default:
                if (!str.equalsIgnoreCase("TD-SCDMA") && !str.equalsIgnoreCase("WCDMA") && !str.equalsIgnoreCase("CDMA2000")) {
                    return NetworkStatusHelper.NetworkStatus.NONE;
                }
                return NetworkStatusHelper.NetworkStatus.G3;
        }
    }
}
