package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;

/* renamed from: com.amap.api.services.a.be */
/* loaded from: classes19.dex */
public class C1863be extends Exception {

    /* renamed from: a */
    public String f24386a;

    /* renamed from: b */
    public String f24387b;

    /* renamed from: c */
    public String f24388c;

    /* renamed from: d */
    public String f24389d;

    /* renamed from: e */
    public String f24390e;

    /* renamed from: f */
    public int f24391f;

    static {
        Covode.recordClassIndex(5474);
    }

    /* renamed from: a */
    public String m16975a() {
        return this.f24386a;
    }

    /* renamed from: b */
    public String m16972b() {
        return this.f24389d;
    }

    /* renamed from: c */
    public String m16971c() {
        return this.f24390e;
    }

    /* renamed from: d */
    public String m16970d() {
        return this.f24387b;
    }

    /* renamed from: e */
    public String m16969e() {
        return this.f24388c;
    }

    /* renamed from: a */
    public void m16974a(int i) {
        this.f24391f = i;
    }

    public C1863be(String str) {
        super(str);
        this.f24386a = "未知的错误";
        this.f24387b = "";
        this.f24388c = "";
        this.f24389d = "1900";
        this.f24390e = "UnknownError";
        this.f24391f = -1;
        this.f24386a = str;
        m16973a(str);
    }

    /* renamed from: a */
    private void m16973a(String str) {
        if ("IO 操作异常 - IOException".equals(str)) {
            this.f24391f = 21;
            this.f24389d = "1902";
            this.f24390e = "IOException";
        } else if ("socket 连接异常 - SocketException".equals(str)) {
            this.f24391f = 22;
        } else if ("socket 连接超时 - SocketTimeoutException".equals(str)) {
            this.f24391f = 23;
            this.f24389d = "1802";
            this.f24390e = "SocketTimeoutException";
        } else if ("无效的参数 - IllegalArgumentException".equals(str)) {
            this.f24391f = 24;
            this.f24389d = "1901";
            this.f24390e = "IllegalArgumentException";
        } else if ("空指针异常 - NullPointException".equals(str)) {
            this.f24391f = 25;
            this.f24389d = "1903";
            this.f24390e = "NullPointException";
        } else if ("url异常 - MalformedURLException".equals(str)) {
            this.f24391f = 26;
            this.f24389d = "1803";
            this.f24390e = "MalformedURLException";
        } else if ("未知主机 - UnKnowHostException".equals(str)) {
            this.f24391f = 27;
            this.f24389d = "1804";
            this.f24390e = "UnknownHostException";
        } else if ("服务器连接失败 - UnknownServiceException".equals(str)) {
            this.f24391f = 28;
            this.f24389d = "1805";
            this.f24390e = "CannotConnectToHostException";
        } else if ("协议解析错误 - ProtocolException".equals(str)) {
            this.f24391f = 29;
            this.f24389d = "1801";
            this.f24390e = "ProtocolException";
        } else if ("http连接失败 - ConnectionException".equals(str)) {
            this.f24391f = 30;
            this.f24389d = "1806";
            this.f24390e = "ConnectionException";
        } else if ("未知的错误".equals(str)) {
            this.f24391f = 31;
        } else if ("key鉴权失败".equals(str)) {
            this.f24391f = 32;
        } else if ("requeust is null".equals(str)) {
            this.f24391f = 1;
        } else if ("request url is empty".equals(str)) {
            this.f24391f = 2;
        } else if ("response is null".equals(str)) {
            this.f24391f = 3;
        } else if ("thread pool has exception".equals(str)) {
            this.f24391f = 4;
        } else if ("sdk name is invalid".equals(str)) {
            this.f24391f = 5;
        } else if ("sdk info is null".equals(str)) {
            this.f24391f = 6;
        } else if ("sdk packages is null".equals(str)) {
            this.f24391f = 7;
        } else if ("线程池为空".equals(str)) {
            this.f24391f = 8;
        } else if ("获取对象错误".equals(str)) {
            this.f24391f = BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS;
        } else {
            this.f24391f = -1;
        }
    }

    public C1863be(String str, String str2, String str3) {
        this(str);
        this.f24387b = str2;
        this.f24388c = str3;
    }
}
