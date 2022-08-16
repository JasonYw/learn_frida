package anet.channel.util;

import anet.channel.strategy.utils.C0579c;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes20.dex */
public class HttpUrl {
    public String host;
    public volatile boolean isSchemeLocked;
    public String path;
    public int port;
    public String scheme;
    public String simpleUrl;
    public String url;

    static {
        Covode.recordClassIndex(2368);
    }

    public void lockScheme() {
        this.isSchemeLocked = true;
    }

    public HttpUrl() {
    }

    public int getPort() {
        return this.port;
    }

    public String host() {
        return this.host;
    }

    public boolean isSchemeLocked() {
        return this.isSchemeLocked;
    }

    public String path() {
        return this.path;
    }

    public String scheme() {
        return this.scheme;
    }

    public String simpleUrlString() {
        return this.simpleUrl;
    }

    public String toString() {
        return this.url;
    }

    public String urlString() {
        return this.url;
    }

    public URL toURL() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public boolean containsNonDefaultPort() {
        if (this.port != 0) {
            if (!"http".equals(this.scheme) || this.port == 80) {
                if ("https".equals(this.scheme) && this.port != 443) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public void downgradeSchemeAndLock() {
        this.isSchemeLocked = true;
        if (!"http".equals(this.scheme)) {
            this.scheme = "http";
            String str = this.scheme;
            String str2 = this.url;
            this.url = StringUtils.concatString(str, Constants.COLON_SEPARATOR, str2.substring(str2.indexOf("//")));
        }
    }

    public HttpUrl(HttpUrl httpUrl) {
        this.scheme = httpUrl.scheme;
        this.host = httpUrl.host;
        this.path = httpUrl.path;
        this.url = httpUrl.url;
        this.simpleUrl = httpUrl.simpleUrl;
        this.isSchemeLocked = httpUrl.isSchemeLocked;
    }

    public void setScheme(String str) {
        if (!this.isSchemeLocked && !str.equalsIgnoreCase(this.scheme)) {
            this.scheme = str;
            String str2 = this.url;
            this.url = StringUtils.concatString(str, Constants.COLON_SEPARATOR, str2.substring(str2.indexOf("//")));
            this.simpleUrl = StringUtils.concatString(str, Constants.COLON_SEPARATOR, this.simpleUrl.substring(this.url.indexOf("//")));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
        if (r1.port > 65535) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00cf, code lost:
        if (r0 != 0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static anet.channel.util.HttpUrl parse(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.HttpUrl.parse(java.lang.String):anet.channel.util.HttpUrl");
    }

    public void replaceIpAndPort(String str, int i) {
        if (str != null) {
            int indexOf = this.url.indexOf("//") + 2;
            while (indexOf < this.url.length() && this.url.charAt(indexOf) != '/') {
                indexOf++;
            }
            boolean m20793b = C0579c.m20793b(str);
            StringBuilder sb = new StringBuilder(this.url.length() + str.length());
            sb.append(this.scheme);
            sb.append("://");
            if (m20793b) {
                sb.append(LoggerUtil.M_LEFT_TAG);
            }
            sb.append(str);
            if (m20793b) {
                sb.append(LoggerUtil.M_RIGHT_TAG);
            }
            if (i != 0) {
                sb.append(LoggerUtil.TWO_POINT_TAG);
                sb.append(i);
            } else if (this.port != 0) {
                sb.append(LoggerUtil.TWO_POINT_TAG);
                sb.append(this.port);
            }
            sb.append(this.url.substring(indexOf));
            this.url = sb.toString();
        }
    }
}
