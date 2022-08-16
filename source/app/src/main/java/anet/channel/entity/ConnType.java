package anet.channel.entity;

import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.ConnProtocol;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ConnType {
    public static ConnType HTTP = new ConnType("http");
    public static ConnType HTTPS = new ConnType("https");
    public static Map<ConnProtocol, ConnType> connTypeMap = new HashMap();
    public String name;
    public String publicKey;
    public int spdyProtocol;

    public int getTnetConType() {
        return this.spdyProtocol;
    }

    public String toString() {
        return this.name;
    }

    private int getPriority() {
        int i = this.spdyProtocol;
        if ((i & 8) != 0) {
            return 0;
        }
        if ((i & 2) == 0) {
            return 2;
        }
        return 1;
    }

    public TypeLevel getTypeLevel() {
        if (isHttpType()) {
            return TypeLevel.HTTP;
        }
        return TypeLevel.SPDY;
    }

    public boolean isH2S() {
        if (this.spdyProtocol == 40) {
            return true;
        }
        return false;
    }

    public boolean isPublicKeyAuto() {
        return "auto".equals(this.publicKey);
    }

    public boolean isQuic() {
        if ((this.spdyProtocol & 4) != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(2196);
    }

    public int getType() {
        if (!equals(HTTP) && !equals(HTTPS)) {
            return C0504c.f20505a;
        }
        return C0504c.f20506b;
    }

    public boolean isHTTP3() {
        int i = this.spdyProtocol;
        if (i != 256 && i != 8448 && i != 33024) {
            return false;
        }
        return true;
    }

    public boolean isHttpType() {
        if (!equals(HTTP) && !equals(HTTPS)) {
            return false;
        }
        return true;
    }

    /* loaded from: classes2.dex */
    public enum TypeLevel {
        SPDY,
        HTTP;

        static {
            Covode.recordClassIndex(2197);
        }
    }

    public boolean isSSL() {
        int i = this.spdyProtocol;
        if ((i & 128) == 0 && (i & 32) == 0 && i != 12 && i != 256 && i != 8448 && !equals(HTTPS)) {
            return false;
        }
        return true;
    }

    public ConnType(String str) {
        this.name = "";
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ConnType)) {
            if (this == obj) {
                return true;
            }
            return this.name.equals(((ConnType) obj).name);
        }
        return false;
    }

    public int getTnetPublicKey(boolean z) {
        if ("cdn".equals(this.publicKey)) {
            return 1;
        }
        if (GlobalAppRuntimeInfo.getEnv() == ENV.TEST) {
            return 0;
        }
        if ("open".equals(this.publicKey)) {
            if (z) {
                return 11;
            }
            return 10;
        } else if ("acs".equals(this.publicKey)) {
            if (z) {
                return 4;
            }
            return 3;
        } else {
            return -1;
        }
    }

    public static ConnType valueOf(ConnProtocol connProtocol) {
        MethodCollector.m14708i(42);
        if (connProtocol == null) {
            MethodCollector.m14707o(42);
            return null;
        } else if ("http".equalsIgnoreCase(connProtocol.protocol)) {
            ConnType connType = HTTP;
            MethodCollector.m14707o(42);
            return connType;
        } else if ("https".equalsIgnoreCase(connProtocol.protocol)) {
            ConnType connType2 = HTTPS;
            MethodCollector.m14707o(42);
            return connType2;
        } else {
            synchronized (connTypeMap) {
                try {
                    if (connTypeMap.containsKey(connProtocol)) {
                        ConnType connType3 = connTypeMap.get(connProtocol);
                        MethodCollector.m14707o(42);
                        return connType3;
                    }
                    ConnType connType4 = new ConnType(connProtocol.toString());
                    connType4.publicKey = connProtocol.publicKey;
                    if ("http2".equalsIgnoreCase(connProtocol.protocol)) {
                        connType4.spdyProtocol |= 8;
                    } else if ("spdy".equalsIgnoreCase(connProtocol.protocol)) {
                        connType4.spdyProtocol |= 2;
                    } else if ("h2s".equals(connProtocol.protocol)) {
                        connType4.spdyProtocol = 40;
                    } else if ("quic".equalsIgnoreCase(connProtocol.protocol)) {
                        connType4.spdyProtocol = 12;
                    } else if ("quicplain".equalsIgnoreCase(connProtocol.protocol)) {
                        connType4.spdyProtocol = 32780;
                    } else if ("http3".equalsIgnoreCase(connProtocol.protocol)) {
                        connType4.spdyProtocol = 256;
                    } else if ("http3_1rtt".equalsIgnoreCase(connProtocol.protocol)) {
                        connType4.spdyProtocol = 8448;
                    } else if ("http3plain".equalsIgnoreCase(connProtocol.protocol)) {
                        connType4.spdyProtocol = 33024;
                    }
                    if (connType4.spdyProtocol == 0) {
                        return null;
                    }
                    if (!TextUtils.isEmpty(connProtocol.publicKey)) {
                        connType4.spdyProtocol |= 128;
                        if ("1rtt".equalsIgnoreCase(connProtocol.rtt)) {
                            connType4.spdyProtocol |= 8192;
                        } else if ("0rtt".equalsIgnoreCase(connProtocol.rtt)) {
                            connType4.spdyProtocol |= AccessibilityEventCompat.TYPE_VIEW_SCROLLED;
                        } else {
                            MethodCollector.m14707o(42);
                            return null;
                        }
                    }
                    connTypeMap.put(connProtocol, connType4);
                    MethodCollector.m14707o(42);
                    return connType4;
                } finally {
                    MethodCollector.m14707o(42);
                }
            }
        }
    }

    public static int compare(ConnType connType, ConnType connType2) {
        return connType.getPriority() - connType2.getPriority();
    }
}
