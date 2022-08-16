package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C0568l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ConnProtocol implements Serializable {
    public static final long serialVersionUID = -3523201990674557001L;
    public final int isHttp;
    public final String name;
    public final String protocol;
    public final String publicKey;
    public final String rtt;
    public static Map<String, ConnProtocol> protocolMap = new HashMap();
    public static final ConnProtocol HTTP = valueOf("http", null, null);
    public static final ConnProtocol HTTPS = valueOf("https", null, null);

    public String toString() {
        return this.name;
    }

    static {
        Covode.recordClassIndex(2292);
    }

    public int hashCode() {
        int hashCode = this.protocol.hashCode() + 527;
        String str = this.rtt;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.publicKey;
        if (str2 != null) {
            return (hashCode * 31) + str2.hashCode();
        }
        return hashCode;
    }

    public static ConnProtocol valueOf(C0568l.C0569a c0569a) {
        if (c0569a == null) {
            return null;
        }
        return valueOf(c0569a.f20772b, c0569a.f20777g, c0569a.f20778h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ConnProtocol)) {
            return this.name.equals(((ConnProtocol) obj).name);
        }
        return false;
    }

    public static String buildName(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append("_");
            sb.append(str2);
        } else {
            sb.append("_0rtt");
        }
        sb.append("_");
        sb.append(str3);
        return sb.toString();
    }

    public static ConnProtocol valueOf(String str, String str2, String str3) {
        MethodCollector.m14708i(49);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m14707o(49);
            return null;
        }
        String buildName = buildName(str, str2, str3);
        synchronized (protocolMap) {
            try {
                if (protocolMap.containsKey(buildName)) {
                    ConnProtocol connProtocol = protocolMap.get(buildName);
                    MethodCollector.m14707o(49);
                    return connProtocol;
                }
                ConnProtocol connProtocol2 = new ConnProtocol(buildName, str, str2, str3);
                protocolMap.put(buildName, connProtocol2);
                MethodCollector.m14707o(49);
                return connProtocol2;
            } catch (Throwable th) {
                MethodCollector.m14707o(49);
                throw th;
            }
        }
    }

    public static ConnProtocol valueOf(String str, String str2, String str3, boolean z) {
        return valueOf(str, str2, str3);
    }

    public ConnProtocol(String str, String str2, String str3, String str4) {
        int i;
        this.name = str;
        this.protocol = str2;
        this.rtt = str3;
        this.publicKey = str4;
        if (!"http".equalsIgnoreCase(str2) && !"https".equalsIgnoreCase(str2)) {
            i = 0;
        } else {
            i = 1;
        }
        this.isHttp = i;
    }
}
