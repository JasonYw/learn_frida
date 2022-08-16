package com.byted.cast.proxy.impl;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.entry.api.device.info.NetworkInterfaceEntry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* renamed from: com.byted.cast.proxy.impl.Utils */
/* loaded from: classes2.dex */
public class C2510Utils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9778);
    }

    public static List<String> getLocalIpAddr() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterfaceEntry.getNetworkInterfaces(TokenCert.with("bpea-bpea-castproxy_Utils_getLocalIpAddr_getNetworkInterfaces"));
        while (networkInterfaces.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress nextElement = inetAddresses.nextElement();
                if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                    String hostAddress = nextElement.getHostAddress();
                    hostAddress.toString();
                    arrayList.add(hostAddress);
                }
            }
        }
        return arrayList;
    }

    public static int conversionIpToInt(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (str == null) {
            return 0;
        }
        int i = 0;
        for (String str2 : str.split("\\.")) {
            i = (i << 8) ^ Integer.parseInt(str2);
        }
        return i;
    }

    public static String getConnectionIP(String str) {
        String str2 = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        List<String> localIpAddr = getLocalIpAddr();
        if (localIpAddr != null && localIpAddr.size() != 0) {
            int i = Integer.MAX_VALUE;
            int conversionIpToInt = conversionIpToInt(str);
            for (String str3 : localIpAddr) {
                int abs = Math.abs(conversionIpToInt(str3) ^ conversionIpToInt);
                if (abs < i) {
                    str2 = str3;
                    i = abs;
                }
            }
        }
        return str2;
    }
}
