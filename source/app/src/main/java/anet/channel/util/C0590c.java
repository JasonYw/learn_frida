package anet.channel.util;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.android.netutil.UdpConnectType;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import p002O.C0002O;

/* renamed from: anet.channel.util.c */
/* loaded from: classes2.dex */
public class C0590c {

    /* renamed from: b */
    public static volatile String f20830b;

    /* renamed from: c */
    public static C0593f f20831c;

    /* renamed from: a */
    public static final byte[][] f20829a = {new byte[]{-64, 0, 0, -86}, new byte[]{-64, 0, 0, -85}};

    /* renamed from: d */
    public static ConcurrentHashMap<String, C0593f> f20832d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static ConcurrentHashMap<String, Integer> f20833e = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static boolean m20775a() {
        return false;
    }

    /* renamed from: anet_channel_util_c_java_net_NetworkInterface_getNetworkInterfaces */
    public static Enumeration m20770x6a7730c1() {
        ActionInvokeEntrance.setEventUuid(100016);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(NetworkInterface.class, new Object[0], 100016, "java.util.Enumeration", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Enumeration) actionIntercept.second;
        }
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        ActionInvokeEntrance.actionInvoke(networkInterfaces, NetworkInterface.class, new Object[0], 100016, "anet_channel_util_c_java_net_NetworkInterface_getNetworkInterfaces()Ljava/util/Enumeration;");
        return networkInterfaces;
    }

    /* renamed from: d */
    public static C0593f m20766d() {
        C0593f c0593f = f20832d.get(f20830b);
        if (c0593f == null) {
            return f20831c;
        }
        return c0593f;
    }

    /* renamed from: b */
    public static boolean m20769b() {
        Integer num = f20833e.get(f20830b);
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m20767c() {
        Integer num = f20833e.get(f20830b);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: i */
    public static int m20761i() {
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        boolean testUdpConnectIpv4 = UdpConnectType.testUdpConnectIpv4();
        if (UdpConnectType.testUdpConnectIpv6()) {
            return (testUdpConnectIpv4 ? 1 : 0) | 2;
        }
        return testUdpConnectIpv4 ? 1 : 0;
    }

    /* renamed from: j */
    public static int m20760j() {
        Object obj;
        int i;
        try {
            try {
                if (AwcnConfig.isIpStackDetectByUdpConnect()) {
                    obj = "udp_connect";
                    i = m20761i();
                } else {
                    obj = "interfaces";
                    i = m20762h();
                }
            } catch (Throwable th) {
                th = th;
                ALog.m20787e("awcn.Inet64Util", "[detectIpStack]error.", null, th, new Object[0]);
                i = 0;
                ALog.m20786e("awcn.Inet64Util", "startIpStackDetect", null, "ip stack", Integer.valueOf(i), "detectType", obj);
                return i;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
        ALog.m20786e("awcn.Inet64Util", "startIpStackDetect", null, "ip stack", Integer.valueOf(i), "detectType", obj);
        return i;
    }

    static {
        Covode.recordClassIndex(2374);
        try {
            f20831c = new C0593f((Inet6Address) InetAddress.getAllByName("64:ff9b::")[0], 96);
            f20830b = m20768b(NetworkStatusHelper.getStatus());
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static void m20765e() {
        f20830b = m20768b(NetworkStatusHelper.getStatus());
        if (f20833e.putIfAbsent(f20830b, 0) != null) {
            return;
        }
        int m20760j = m20760j();
        f20833e.put(f20830b, Integer.valueOf(m20760j));
        NetTypeStat netTypeStat = new NetTypeStat();
        netTypeStat.ipStackType = m20760j;
        String str = f20830b;
        if (m20760j != 2 && m20760j != 3) {
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                AppMonitor.getInstance().commitStat(netTypeStat);
                return;
            }
            return;
        }
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0591d(str, netTypeStat), 1500L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: k */
    public static C0593f m20759k() {
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getByName("ipv4only.arpa");
        } catch (Exception unused) {
            inetAddress = null;
        }
        if (inetAddress instanceof Inet6Address) {
            ALog.m20785i("awcn.Inet64Util", C0002O.m25086C("Resolved AAAA: ", inetAddress.toString()), null, new Object[0]);
            byte[] address = inetAddress.getAddress();
            if (address.length != 16) {
                return null;
            }
            for (int i = 12; i >= 0; i--) {
                byte b = address[i];
                byte[][] bArr = f20829a;
                if ((b & bArr[0][0]) != 0 && address[i + 1] == 0 && address[i + 2] == 0) {
                    int i2 = i + 3;
                    if (address[i2] == bArr[0][3] || address[i2] == bArr[1][3]) {
                        address[i + 3] = 0;
                        address[i + 2] = 0;
                        address[i + 1] = 0;
                        address[i] = 0;
                        return new C0593f(Inet6Address.getByAddress("ipv4only.arpa", address, 0), i * 8);
                    }
                }
            }
        } else if (inetAddress instanceof Inet4Address) {
            ALog.m20785i("awcn.Inet64Util", C0002O.m25086C("Resolved A: ", inetAddress.toString()), null, new Object[0]);
        }
        return null;
    }

    /* renamed from: h */
    public static int m20762h() {
        String str;
        TreeMap treeMap = new TreeMap();
        Iterator it = Collections.list(m20770x6a7730c1()).iterator();
        while (it.hasNext()) {
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                ALog.m20785i("awcn.Inet64Util", C0002O.m25086C("find NetworkInterface:", displayName), null, new Object[0]);
                int i = 0;
                for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                    InetAddress address = interfaceAddress.getAddress();
                    if (address instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) address;
                        if (!m20771a(inet6Address)) {
                            ALog.m20786e("awcn.Inet64Util", C0002O.m25086C("Found IPv6 address:", inet6Address.toString()), null, new Object[0]);
                            i |= 2;
                        }
                    } else if (address instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address;
                        if (!m20771a((InetAddress) inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
                            ALog.m20786e("awcn.Inet64Util", C0002O.m25086C("Found IPv4 address:", inet4Address.toString()), null, new Object[0]);
                            i |= 1;
                        }
                    }
                }
                if (i != 0) {
                    treeMap.put(displayName.toLowerCase(), Integer.valueOf(i));
                }
            }
        }
        if (treeMap.isEmpty()) {
            return 0;
        }
        if (treeMap.size() == 1) {
            return ((Integer) treeMap.firstEntry().getValue()).intValue();
        }
        if (NetworkStatusHelper.getStatus().isWifi()) {
            str = "wlan";
        } else if (!NetworkStatusHelper.getStatus().isMobile()) {
            return 0;
        } else {
            str = "rmnet";
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            if (((String) entry.getKey()).startsWith(str)) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (intValue == 2 && treeMap.containsKey("v4-wlan0")) {
                    return intValue | ((Integer) treeMap.remove("v4-wlan0")).intValue();
                }
                return intValue;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static String m20773a(String str) {
        return m20772a((Inet4Address) Inet4Address.getByName(str));
    }

    /* renamed from: a */
    public static boolean m20771a(InetAddress inetAddress) {
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress() && !inetAddress.isAnyLocalAddress()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m20768b(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
            if (TextUtils.isEmpty(wifiBSSID)) {
                wifiBSSID = "";
            }
            return "WIFI$".concat(String.valueOf(wifiBSSID));
        } else if (networkStatus.isMobile()) {
            return C0002O.m25085C(networkStatus.getType(), "$", NetworkStatusHelper.getApn());
        } else {
            return "UnknownNetwork";
        }
    }

    /* renamed from: a */
    public static String m20772a(Inet4Address inet4Address) {
        if (inet4Address != null) {
            C0593f m20766d = m20766d();
            if (m20766d != null) {
                byte[] address = inet4Address.getAddress();
                byte[] address2 = m20766d.f20838b.getAddress();
                int i = m20766d.f20837a / 8;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + i;
                    if (i4 > 15 || i3 >= 4) {
                        break;
                    }
                    if (i4 != 8) {
                        address2[i4] = (byte) (address[i3] | address2[i4]);
                        i3++;
                    }
                    i2++;
                }
                return InetAddress.getByAddress(address2).getHostAddress();
            }
            throw new Exception("cannot get nat64 prefix");
        }
        throw new InvalidParameterException("address in null");
    }
}
