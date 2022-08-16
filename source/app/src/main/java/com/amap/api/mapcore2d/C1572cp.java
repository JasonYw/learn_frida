package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;

/* renamed from: com.amap.api.mapcore2d.cp */
/* loaded from: classes19.dex */
public class C1572cp extends Exception {

    /* renamed from: a */
    public String f23168a;

    /* renamed from: b */
    public String f23169b;

    /* renamed from: c */
    public String f23170c;

    /* renamed from: d */
    public String f23171d;

    /* renamed from: e */
    public int f23172e;

    static {
        Covode.recordClassIndex(5120);
    }

    /* renamed from: a */
    public String m18132a() {
        return this.f23168a;
    }

    /* renamed from: b */
    public String m18129b() {
        return this.f23170c;
    }

    /* renamed from: c */
    public String m18128c() {
        return this.f23171d;
    }

    /* renamed from: d */
    public String m18127d() {
        return this.f23169b;
    }

    /* renamed from: a */
    public void m18131a(int i) {
        this.f23172e = i;
    }

    public C1572cp(String str) {
        super(str);
        this.f23168a = "未知的错误";
        this.f23169b = "";
        this.f23170c = "1900";
        this.f23171d = "UnknownError";
        this.f23172e = -1;
        this.f23168a = str;
        m18130a(str);
    }

    /* renamed from: a */
    private void m18130a(String str) {
        if ("IO 操作异常 - IOException".equals(str)) {
            this.f23172e = 21;
            this.f23170c = "1902";
            this.f23171d = "IOException";
        } else if ("socket 连接异常 - SocketException".equals(str)) {
            this.f23172e = 22;
        } else if ("socket 连接超时 - SocketTimeoutException".equals(str)) {
            this.f23172e = 23;
            this.f23170c = "1802";
            this.f23171d = "SocketTimeoutException";
        } else if ("无效的参数 - IllegalArgumentException".equals(str)) {
            this.f23172e = 24;
            this.f23170c = "1901";
            this.f23171d = "IllegalArgumentException";
        } else if ("空指针异常 - NullPointException".equals(str)) {
            this.f23172e = 25;
            this.f23170c = "1903";
            this.f23171d = "NullPointException";
        } else if ("url异常 - MalformedURLException".equals(str)) {
            this.f23172e = 26;
            this.f23170c = "1803";
            this.f23171d = "MalformedURLException";
        } else if ("未知主机 - UnKnowHostException".equals(str)) {
            this.f23172e = 27;
            this.f23170c = "1804";
            this.f23171d = "UnknownHostException";
        } else if ("服务器连接失败 - UnknownServiceException".equals(str)) {
            this.f23172e = 28;
            this.f23170c = "1805";
            this.f23171d = "CannotConnectToHostException";
        } else if ("协议解析错误 - ProtocolException".equals(str)) {
            this.f23172e = 29;
            this.f23170c = "1801";
            this.f23171d = "ProtocolException";
        } else if ("http连接失败 - ConnectionException".equals(str)) {
            this.f23172e = 30;
            this.f23170c = "1806";
            this.f23171d = "ConnectionException";
        } else if ("未知的错误".equals(str)) {
            this.f23172e = 31;
        } else if ("key鉴权失败".equals(str)) {
            this.f23172e = 32;
        } else if ("requeust is null".equals(str)) {
            this.f23172e = 1;
        } else if ("request url is empty".equals(str)) {
            this.f23172e = 2;
        } else if ("response is null".equals(str)) {
            this.f23172e = 3;
        } else if ("thread pool has exception".equals(str)) {
            this.f23172e = 4;
        } else if ("sdk name is invalid".equals(str)) {
            this.f23172e = 5;
        } else if ("sdk info is null".equals(str)) {
            this.f23172e = 6;
        } else if ("sdk packages is null".equals(str)) {
            this.f23172e = 7;
        } else if ("线程池为空".equals(str)) {
            this.f23172e = 8;
        } else if ("获取对象错误".equals(str)) {
            this.f23172e = BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS;
        } else {
            this.f23172e = -1;
        }
    }

    public C1572cp(String str, String str2) {
        this(str);
        this.f23169b = str2;
    }
}
