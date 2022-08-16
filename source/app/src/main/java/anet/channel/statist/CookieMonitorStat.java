package anet.channel.statist;

import com.bytedance.covode.number.Covode;

@Monitor(module = "networkPrefer", monitorPoint = "cookieMonitor")
/* loaded from: classes13.dex */
public class CookieMonitorStat extends StatObject {
    @Dimension
    public String cookieName;
    @Dimension
    public String cookieText;
    @Dimension
    public int missType;
    @Dimension
    public String setCookie;
    @Dimension
    public String url;

    static {
        Covode.recordClassIndex(2263);
    }

    public CookieMonitorStat(String str) {
        this.url = str;
    }
}
