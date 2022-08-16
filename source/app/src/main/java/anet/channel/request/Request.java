package anet.channel.request;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C0579c;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.umeng.message.proguard.C34037f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p002O.C0002O;
import p003X.C146498f3s;

/* loaded from: classes20.dex */
public class Request {

    /* renamed from: a */
    public final RequestStatistic f20578a;

    /* renamed from: b */
    public HttpUrl f20579b;

    /* renamed from: c */
    public HttpUrl f20580c;

    /* renamed from: d */
    public HttpUrl f20581d;

    /* renamed from: e */
    public URL f20582e;

    /* renamed from: f */
    public String f20583f;

    /* renamed from: g */
    public Map<String, String> f20584g;

    /* renamed from: h */
    public Map<String, String> f20585h;

    /* renamed from: i */
    public String f20586i;

    /* renamed from: j */
    public BodyEntry f20587j;

    /* renamed from: k */
    public boolean f20588k;

    /* renamed from: l */
    public String f20589l;

    /* renamed from: m */
    public String f20590m;

    /* renamed from: n */
    public int f20591n;

    /* renamed from: o */
    public int f20592o;

    /* renamed from: p */
    public int f20593p;

    /* renamed from: q */
    public HostnameVerifier f20594q;

    /* renamed from: r */
    public SSLSocketFactory f20595r;

    /* renamed from: s */
    public boolean f20596s;

    /* renamed from: anet.channel.request.Request$1 */
    /* loaded from: classes20.dex */
    public /* synthetic */ class C05241 {
        static {
            Covode.recordClassIndex(2236);
        }
    }

    static {
        Covode.recordClassIndex(2235);
    }

    public String getBizId() {
        return this.f20589l;
    }

    public int getConnectTimeout() {
        return this.f20592o;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f20594q;
    }

    public HttpUrl getHttpUrl() {
        return this.f20580c;
    }

    public String getMethod() {
        return this.f20583f;
    }

    public int getReadTimeout() {
        return this.f20593p;
    }

    public int getRedirectTimes() {
        return this.f20591n;
    }

    public String getSeq() {
        return this.f20590m;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f20595r;
    }

    public boolean isAllowRequestInBg() {
        return this.f20596s;
    }

    public boolean isRedirectEnable() {
        return this.f20588k;
    }

    public boolean containsBody() {
        if (this.f20587j != null) {
            return true;
        }
        return false;
    }

    public String getContentEncoding() {
        String str = this.f20586i;
        if (str != null) {
            return str;
        }
        return C34037f.f43302f;
    }

    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.f20584g);
    }

    public String getHost() {
        return this.f20580c.host();
    }

    public String getUrlString() {
        return this.f20580c.urlString();
    }

    /* renamed from: a */
    private Map<String, String> m20962a() {
        if (AwcnConfig.isCookieHeaderRedundantFix()) {
            return new HashMap(this.f20584g);
        }
        return this.f20584g;
    }

    public byte[] getBodyBytes() {
        MethodCollector.m14708i(46);
        if (this.f20587j != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
            try {
                postBody(byteArrayOutputStream);
            } catch (IOException unused) {
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            MethodCollector.m14707o(46);
            return byteArray;
        }
        MethodCollector.m14707o(46);
        return null;
    }

    public URL getUrl() {
        if (this.f20582e == null) {
            HttpUrl httpUrl = this.f20581d;
            if (httpUrl == null) {
                httpUrl = this.f20580c;
            }
            this.f20582e = httpUrl.toURL();
        }
        return this.f20582e;
    }

    /* loaded from: classes20.dex */
    public static class Builder {

        /* renamed from: a */
        public HttpUrl f20597a;

        /* renamed from: b */
        public HttpUrl f20598b;

        /* renamed from: e */
        public Map<String, String> f20601e;

        /* renamed from: f */
        public String f20602f;

        /* renamed from: g */
        public BodyEntry f20603g;

        /* renamed from: j */
        public HostnameVerifier f20606j;

        /* renamed from: k */
        public SSLSocketFactory f20607k;

        /* renamed from: l */
        public String f20608l;

        /* renamed from: m */
        public String f20609m;

        /* renamed from: q */
        public boolean f20613q;

        /* renamed from: c */
        public String f20599c = "GET";

        /* renamed from: d */
        public Map<String, String> f20600d = new HashMap();

        /* renamed from: h */
        public boolean f20604h = true;

        /* renamed from: i */
        public int f20605i = 0;

        /* renamed from: n */
        public int f20610n = 10000;

        /* renamed from: o */
        public int f20611o = 10000;

        /* renamed from: p */
        public RequestStatistic f20612p = null;

        static {
            Covode.recordClassIndex(2237);
        }

        public Request build() {
            if (this.f20603g == null && this.f20601e == null && Method.m20926a(this.f20599c)) {
                ALog.m20786e("awcn.Request", C0002O.m25085C("method ", this.f20599c, " must have a request body"), null, new Object[0]);
            }
            if (this.f20603g != null && !Method.m20925b(this.f20599c)) {
                ALog.m20786e("awcn.Request", C0002O.m25085C("method ", this.f20599c, " should not have a request body"), null, new Object[0]);
                this.f20603g = null;
            }
            BodyEntry bodyEntry = this.f20603g;
            if (bodyEntry != null && bodyEntry.getContentType() != null) {
                addHeader("Content-Type", this.f20603g.getContentType());
            }
            return new Request(this, null);
        }

        public Builder setAllowRequestInBg(boolean z) {
            this.f20613q = z;
            return this;
        }

        public Builder setBizId(String str) {
            this.f20608l = str;
            return this;
        }

        public Builder setBody(BodyEntry bodyEntry) {
            this.f20603g = bodyEntry;
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.f20606j = hostnameVerifier;
            return this;
        }

        public Builder setRedirectEnable(boolean z) {
            this.f20604h = z;
            return this;
        }

        public Builder setRedirectTimes(int i) {
            this.f20605i = i;
            return this;
        }

        public Builder setRequestStatistic(RequestStatistic requestStatistic) {
            this.f20612p = requestStatistic;
            return this;
        }

        public Builder setSeq(String str) {
            this.f20609m = str;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f20607k = sSLSocketFactory;
            return this;
        }

        public Builder setCharset(String str) {
            this.f20602f = str;
            this.f20598b = null;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            if (i > 0) {
                this.f20610n = i;
            }
            return this;
        }

        public Builder setParams(Map<String, String> map) {
            this.f20601e = map;
            this.f20598b = null;
            return this;
        }

        public Builder setReadTimeout(int i) {
            if (i > 0) {
                this.f20611o = i;
            }
            return this;
        }

        public Builder setUrl(HttpUrl httpUrl) {
            this.f20597a = httpUrl;
            this.f20598b = null;
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.f20600d.clear();
            if (map != null) {
                this.f20600d.putAll(map);
            }
            return this;
        }

        public Builder setUrl(String str) {
            this.f20597a = HttpUrl.parse(str);
            this.f20598b = null;
            if (this.f20597a != null) {
                return this;
            }
            throw new IllegalArgumentException(C0002O.m25086C("toURL is invalid! toURL = ", str));
        }

        public Builder setMethod(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (!"GET".equalsIgnoreCase(str)) {
                    if ("POST".equalsIgnoreCase(str)) {
                        this.f20599c = "POST";
                        return this;
                    } else if (C146498f3s.LJFF.equalsIgnoreCase(str)) {
                        this.f20599c = C146498f3s.LJFF;
                        return this;
                    } else if ("HEAD".equalsIgnoreCase(str)) {
                        this.f20599c = "HEAD";
                        return this;
                    } else if (C146498f3s.LIZLLL.equalsIgnoreCase(str)) {
                        this.f20599c = C146498f3s.LIZLLL;
                        return this;
                    } else if (C146498f3s.f19555LJ.equalsIgnoreCase(str)) {
                        this.f20599c = C146498f3s.f19555LJ;
                        return this;
                    }
                }
                this.f20599c = "GET";
                return this;
            }
            throw new IllegalArgumentException("method is null or empty");
        }

        public Builder addHeader(String str, String str2) {
            this.f20600d.put(str, str2);
            return this;
        }

        public Builder addParam(String str, String str2) {
            if (this.f20601e == null) {
                this.f20601e = new HashMap();
            }
            this.f20601e.put(str, str2);
            this.f20598b = null;
            return this;
        }
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f20599c = this.f20583f;
        builder.f20600d = m20962a();
        builder.f20601e = this.f20585h;
        builder.f20603g = this.f20587j;
        builder.f20602f = this.f20586i;
        builder.f20604h = this.f20588k;
        builder.f20605i = this.f20591n;
        builder.f20606j = this.f20594q;
        builder.f20607k = this.f20595r;
        builder.f20597a = this.f20579b;
        builder.f20598b = this.f20580c;
        builder.f20608l = this.f20589l;
        builder.f20609m = this.f20590m;
        builder.f20610n = this.f20592o;
        builder.f20611o = this.f20593p;
        builder.f20612p = this.f20578a;
        builder.f20613q = this.f20596s;
        return builder;
    }

    /* renamed from: b */
    private void m20961b() {
        String m20794a = C0579c.m20794a(this.f20585h, getContentEncoding());
        if (!TextUtils.isEmpty(m20794a)) {
            if (Method.m20926a(this.f20583f) && this.f20587j == null) {
                try {
                    this.f20587j = new ByteArrayEntry(m20794a.getBytes(getContentEncoding()));
                    Map<String, String> map = this.f20584g;
                    map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + getContentEncoding());
                } catch (UnsupportedEncodingException unused) {
                }
            } else {
                String urlString = this.f20579b.urlString();
                StringBuilder sb = new StringBuilder(urlString);
                if (sb.indexOf("?") == -1) {
                    sb.append('?');
                } else if (urlString.charAt(urlString.length() - 1) != '&') {
                    sb.append('&');
                }
                sb.append(m20794a);
                HttpUrl parse = HttpUrl.parse(sb.toString());
                if (parse != null) {
                    this.f20580c = parse;
                }
            }
        }
        if (this.f20580c == null) {
            this.f20580c = this.f20579b;
        }
    }

    public int postBody(OutputStream outputStream) {
        BodyEntry bodyEntry = this.f20587j;
        if (bodyEntry != null) {
            return bodyEntry.writeTo(outputStream);
        }
        return 0;
    }

    /* loaded from: classes20.dex */
    public static final class Method {
        static {
            Covode.recordClassIndex(2238);
        }

        /* renamed from: a */
        public static boolean m20926a(String str) {
            if (!str.equals("POST") && !str.equals(C146498f3s.LIZLLL)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m20925b(String str) {
            if (!m20926a(str) && !str.equals(C146498f3s.f19555LJ) && !str.equals(C146498f3s.LJFF)) {
                return false;
            }
            return true;
        }
    }

    public void setUrlScheme(boolean z) {
        String str;
        if (this.f20581d == null) {
            this.f20581d = new HttpUrl(this.f20580c);
        }
        HttpUrl httpUrl = this.f20581d;
        if (z) {
            str = "https";
        } else {
            str = "http";
        }
        httpUrl.setScheme(str);
        this.f20582e = null;
    }

    public Request(Builder builder) {
        RequestStatistic requestStatistic;
        this.f20583f = "GET";
        this.f20588k = true;
        this.f20592o = 10000;
        this.f20593p = 10000;
        this.f20583f = builder.f20599c;
        this.f20584g = builder.f20600d;
        this.f20585h = builder.f20601e;
        this.f20587j = builder.f20603g;
        this.f20586i = builder.f20602f;
        this.f20588k = builder.f20604h;
        this.f20591n = builder.f20605i;
        this.f20594q = builder.f20606j;
        this.f20595r = builder.f20607k;
        this.f20589l = builder.f20608l;
        this.f20590m = builder.f20609m;
        this.f20592o = builder.f20610n;
        this.f20593p = builder.f20611o;
        this.f20579b = builder.f20597a;
        this.f20580c = builder.f20598b;
        if (this.f20580c == null) {
            m20961b();
        }
        if (builder.f20612p != null) {
            requestStatistic = builder.f20612p;
        } else {
            requestStatistic = new RequestStatistic(getHost(), this.f20589l);
        }
        this.f20578a = requestStatistic;
        this.f20596s = builder.f20613q;
    }

    public /* synthetic */ Request(Builder builder, C05241 c05241) {
        this(builder);
    }

    public void setDnsOptimize(String str, int i) {
        if (str != null) {
            if (this.f20581d == null) {
                this.f20581d = new HttpUrl(this.f20580c);
            }
            this.f20581d.replaceIpAndPort(str, i);
        } else {
            this.f20581d = null;
        }
        this.f20582e = null;
        this.f20578a.setIPAndPort(str, i);
    }
}
