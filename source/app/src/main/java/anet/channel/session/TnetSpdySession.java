package anet.channel.session;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.DataFrameCb;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0470a;
import anet.channel.entity.C0502a;
import anet.channel.entity.C0503b;
import anet.channel.entity.ConnType;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.heartbeat.RunnableC0513c;
import anet.channel.request.C0527c;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.security.ISecurity;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SessionMonitor;
import anet.channel.statist.SessionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0579c;
import anet.channel.util.ALog;
import anet.channel.util.C0587Utils;
import anet.channel.util.C0590c;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpHelper;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.vchannel.C33968a;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;
import p002O.C0002O;

/* loaded from: classes2.dex */
public class TnetSpdySession extends Session implements SessionCb {

    /* renamed from: A */
    public long f20625A;

    /* renamed from: B */
    public int f20626B = -1;

    /* renamed from: C */
    public DataFrameCb f20627C;

    /* renamed from: D */
    public IHeartbeat f20628D;

    /* renamed from: E */
    public IAuth f20629E;

    /* renamed from: F */
    public String f20630F;

    /* renamed from: G */
    public ISecurity f20631G;

    /* renamed from: H */
    public int f20632H;

    /* renamed from: I */
    public boolean f20633I;

    /* renamed from: w */
    public SpdyAgent f20634w;

    /* renamed from: x */
    public SpdySession f20635x;

    /* renamed from: y */
    public volatile boolean f20636y;

    /* renamed from: z */
    public long f20637z;

    static {
        Covode.recordClassIndex(2248);
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
    }

    @Override // anet.channel.Session
    public void onDisconnect() {
        this.f20636y = false;
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return new RunnableC0541h(this);
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        if (this.f20358n == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m20915b() {
        IAuth iAuth = this.f20629E;
        if (iAuth != null) {
            iAuth.auth(this, new C0542i(this));
            return;
        }
        notifyStatus(4, null);
        this.f20361q.ret = 1;
        IHeartbeat iHeartbeat = this.f20628D;
        if (iHeartbeat != null) {
            iHeartbeat.start(this);
        }
    }

    @Override // anet.channel.Session
    public void close() {
        ALog.m20786e("awcn.TnetSpdySession", "force close!", this.f20360p, "session", this);
        notifyStatus(7, null);
        try {
            if (this.f20628D != null) {
                this.f20628D.stop();
                this.f20628D = null;
            }
            if (this.f20635x != null) {
                this.f20635x.closeSession();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m20912c() {
        SpdyAgent.enableDebug = false;
        this.f20634w = SpdyAgent.getInstance(this.f20345a, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        ISecurity iSecurity = this.f20631G;
        if (iSecurity != null && !iSecurity.isSecOff()) {
            this.f20634w.setAccsSslCallback(new C0543j(this));
        }
        if (!AwcnConfig.isTnetHeaderCacheEnable()) {
            try {
                this.f20634w.getClass().getDeclaredMethod("disableHeaderCache", new Class[0]).invoke(this.f20634w, new Object[0]);
                ALog.m20785i("awcn.TnetSpdySession", "tnet disableHeaderCache", null, new Object[0]);
            } catch (Exception e) {
                ALog.m20787e("awcn.TnetSpdySession", "tnet disableHeaderCache", null, e, new Object[0]);
            }
        }
    }

    @Override // anet.channel.Session
    public void connect() {
        String str;
        int xquicCongControl;
        boolean z;
        int i = 1;
        if (this.f20358n != 1 && this.f20358n != 0 && this.f20358n != 4) {
            try {
                if (this.f20634w == null) {
                    m20912c();
                }
                if (C0590c.m20775a() && C0579c.m20795a(this.f20349e)) {
                    try {
                        this.f20350f = C0590c.m20773a(this.f20349e);
                    } catch (Exception unused) {
                    }
                }
                String valueOf = String.valueOf(System.currentTimeMillis());
                ALog.m20786e("awcn.TnetSpdySession", "connect", this.f20360p, C1315c.f22208f, this.f20347c, "ip", this.f20350f, "port", Integer.valueOf(this.f20351g), "sessionId", valueOf, "SpdyProtocol,", this.f20354j, "proxyIp,", this.f20352h, "proxyPort,", Integer.valueOf(this.f20353i));
                String str2 = this.f20350f;
                int i2 = this.f20351g;
                new StringBuilder();
                SessionInfo sessionInfo = new SessionInfo(str2, i2, C0002O.m25085C(this.f20347c, "_", this.f20630F), this.f20352h, this.f20353i, valueOf, this, this.f20354j.getTnetConType());
                sessionInfo.setConnectionTimeoutMs((int) (this.f20362r * C0587Utils.getNetworkTimeFactor()));
                if (!this.f20354j.isPublicKeyAuto() && !this.f20354j.isH2S() && !this.f20354j.isHTTP3()) {
                    if (this.f20626B >= 0) {
                        sessionInfo.setPubKeySeqNum(this.f20626B);
                    } else {
                        ConnType connType = this.f20354j;
                        if (this.f20631G != null) {
                            z = this.f20631G.isSecOff();
                        } else {
                            z = true;
                        }
                        this.f20626B = connType.getTnetPublicKey(z);
                        sessionInfo.setPubKeySeqNum(this.f20626B);
                    }
                } else {
                    if (this.f20357m) {
                        str = this.f20349e;
                    } else {
                        str = this.f20348d;
                    }
                    sessionInfo.setCertHost(str);
                }
                if (this.f20354j.isHTTP3() && (xquicCongControl = AwcnConfig.getXquicCongControl()) >= 0) {
                    sessionInfo.setXquicCongControl(xquicCongControl);
                }
                this.f20635x = this.f20634w.createSession(sessionInfo);
                if (this.f20635x.getRefCount() > 1) {
                    ALog.m20786e("awcn.TnetSpdySession", "get session ref count > 1!!!", this.f20360p, new Object[0]);
                    notifyStatus(0, new C0503b(1));
                    m20915b();
                    return;
                }
                notifyStatus(1, null);
                this.f20637z = System.currentTimeMillis();
                SessionStatistic sessionStatistic = this.f20361q;
                if (TextUtils.isEmpty(this.f20352h)) {
                    i = 0;
                }
                sessionStatistic.isProxy = i;
                this.f20361q.isTunnel = "false";
                this.f20361q.isBackground = GlobalAppRuntimeInfo.isAppBackground();
                this.f20625A = 0L;
            } catch (Throwable th) {
                notifyStatus(2, null);
                ALog.m20787e("awcn.TnetSpdySession", "connect exception ", this.f20360p, th, new Object[0]);
            }
        }
    }

    public void setTnetPublicKey(int i) {
        this.f20626B = i;
    }

    /* renamed from: e */
    public static /* synthetic */ int m20907e(TnetSpdySession tnetSpdySession) {
        int i = tnetSpdySession.f20632H + 1;
        tnetSpdySession.f20632H = i;
        return i;
    }

    @Override // anet.channel.Session
    public void ping(boolean z) {
        ping(z, this.f20363s);
    }

    public void initConfig(Config config) {
        if (config != null) {
            this.f20630F = config.getAppkey();
            this.f20631G = config.getSecurity();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [byte[]] */
    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        String domain = spdySession.getDomain();
        String str = 0;
        byte[] bArr = null;
        if (TextUtils.isEmpty(domain)) {
            ALog.m20785i("awcn.TnetSpdySession", "get sslticket host is null", null, new Object[0]);
            return null;
        }
        try {
            if (this.f20631G != null) {
                str = this.f20631G.getBytes(this.f20345a, C0002O.m25086C("accs_ssl_key2_", domain));
                return str;
            }
        } catch (Throwable th) {
            ALog.m20787e("awcn.TnetSpdySession", "getSSLMeta", str, th, new Object[0]);
            bArr = str;
        }
        return bArr;
    }

    public void initSessionInfo(anet.channel.SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            this.f20627C = sessionInfo.dataFrameCb;
            this.f20629E = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.f20361q.isKL = 1L;
                this.f20364t = true;
                this.f20628D = sessionInfo.heartbeat;
                this.f20633I = sessionInfo.isAccs;
                if (this.f20628D == null) {
                    if (sessionInfo.isAccs && !AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                        this.f20628D = HeartbeatManager.getDefaultBackgroundAccsHeartbeat();
                    } else {
                        this.f20628D = HeartbeatManager.getDefaultHeartbeat();
                    }
                }
            }
        }
        if (AwcnConfig.isIdleSessionCloseEnable() && this.f20628D == null) {
            this.f20628D = new RunnableC0513c();
        }
    }

    public TnetSpdySession(Context context, C0502a c0502a) {
        super(context, c0502a);
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            return -1;
        }
        try {
            if (this.f20631G == null) {
                return -1;
            }
            if (this.f20631G.saveBytes(this.f20345a, C0002O.m25086C("accs_ssl_key2_", domain), bArr)) {
                return 0;
            }
            return -1;
        } catch (Throwable th) {
            ALog.m20787e("awcn.TnetSpdySession", "putSSLMeta", null, th, new Object[0]);
            return -1;
        }
    }

    @Override // anet.channel.Session
    public void ping(boolean z, int i) {
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.TnetSpdySession", "ping", this.f20360p, C1315c.f22208f, this.f20347c, "thread", Thread.currentThread().getName());
        }
        if (z) {
            try {
                if (this.f20635x != null) {
                    if (this.f20358n == 0 || this.f20358n == 4) {
                        handleCallbacks(64, null);
                        if (this.f20636y) {
                            return;
                        }
                        this.f20636y = true;
                        this.f20361q.ppkgCount++;
                        this.f20635x.submitPing();
                        if (ALog.isPrintLog(1)) {
                            ALog.m20788d("awcn.TnetSpdySession", this.f20347c + " submit ping ms:" + (System.currentTimeMillis() - this.f20637z) + " force:" + z, this.f20360p, new Object[0]);
                        }
                        setPingTimeout(i);
                        this.f20637z = System.currentTimeMillis();
                        if (this.f20628D != null) {
                            this.f20628D.reSchedule();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.f20361q != null) {
                    this.f20361q.closeReason = "session null";
                }
                ALog.m20786e("awcn.TnetSpdySession", this.f20347c + " session null", this.f20360p, new Object[0]);
                close();
            } catch (SpdyErrorException e) {
                if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                    ALog.m20786e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f20360p, new Object[0]);
                    notifyStatus(6, new C0503b(2));
                }
                ALog.m20787e("awcn.TnetSpdySession", "ping", this.f20360p, e, new Object[0]);
            } catch (Exception e2) {
                ALog.m20787e("awcn.TnetSpdySession", "ping", this.f20360p, e2, new Object[0]);
            }
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        this.f20361q.connectionTime = superviseConnectInfo.connectTime;
        this.f20361q.sslTime = superviseConnectInfo.handshakeTime;
        this.f20361q.sslCalTime = superviseConnectInfo.doHandshakeTime;
        this.f20361q.netType = NetworkStatusHelper.getNetworkSubType();
        this.f20625A = System.currentTimeMillis();
        notifyStatus(0, new C0503b(1));
        m20915b();
        ALog.m20786e("awcn.TnetSpdySession", "spdySessionConnectCB connect", this.f20360p, "connectTime", Integer.valueOf(superviseConnectInfo.connectTime), "sslTime", Integer.valueOf(superviseConnectInfo.handshakeTime));
        if (this.f20354j.isHTTP3()) {
            this.f20361q.scid = superviseConnectInfo.scid;
            this.f20361q.dcid = superviseConnectInfo.dcid;
            this.f20361q.congControlKind = superviseConnectInfo.congControlKind;
            ALog.m20786e("awcn.TnetSpdySession", "[HTTP3 spdySessionConnectCB]", this.f20360p, "connectInfo", spdySession.getConnectInfoOnConnected());
        }
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) {
        RequestStatistic requestStatistic;
        SpdyRequest spdyRequest;
        String host;
        C0527c c0527c = C0527c.NULL;
        if (request != null) {
            requestStatistic = request.f20578a;
        } else {
            requestStatistic = new RequestStatistic(this.f20348d, null);
        }
        requestStatistic.setConnType(this.f20354j);
        if (requestStatistic.start == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = currentTimeMillis;
            requestStatistic.start = currentTimeMillis;
        }
        requestStatistic.setIPAndPort(this.f20350f, this.f20351g);
        requestStatistic.ipRefer = this.f20355k.getIpSource();
        requestStatistic.ipType = this.f20355k.getIpType();
        requestStatistic.unit = this.f20356l;
        if (request != null) {
            if (requestCb != null) {
                try {
                    if (this.f20635x != null && (this.f20358n == 0 || this.f20358n == 4)) {
                        if (this.f20357m) {
                            request.setDnsOptimize(this.f20349e, this.f20351g);
                        }
                        request.setUrlScheme(this.f20354j.isSSL());
                        URL url = request.getUrl();
                        if (ALog.isPrintLog(2)) {
                            ALog.m20785i("awcn.TnetSpdySession", "", request.getSeq(), "request URL", url.toString());
                            ALog.m20785i("awcn.TnetSpdySession", "", request.getSeq(), "request Method", request.getMethod());
                            ALog.m20785i("awcn.TnetSpdySession", "", request.getSeq(), "request headers", request.getHeaders());
                        }
                        if (!TextUtils.isEmpty(this.f20352h) && this.f20353i > 0) {
                            spdyRequest = new SpdyRequest(url, url.getHost(), url.getPort(), this.f20352h, this.f20353i, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout(), 0);
                        } else {
                            spdyRequest = new SpdyRequest(url, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout());
                        }
                        spdyRequest.setRequestRdTimeoutMs(request.getReadTimeout());
                        Map<String, String> headers = request.getHeaders();
                        if (!headers.containsKey("Host")) {
                            spdyRequest.addHeaders(headers);
                            if (this.f20357m) {
                                host = this.f20349e;
                            } else {
                                host = request.getHost();
                            }
                            spdyRequest.addHeader(":host", host);
                        } else {
                            HashMap hashMap = new HashMap(request.getHeaders());
                            String remove = hashMap.remove("Host");
                            if (this.f20357m) {
                                remove = this.f20349e;
                            }
                            hashMap.put(":host", remove);
                            spdyRequest.addHeaders(hashMap);
                        }
                        SpdyDataProvider spdyDataProvider = new SpdyDataProvider(request.getBodyBytes());
                        request.f20578a.sendStart = System.currentTimeMillis();
                        request.f20578a.processTime = request.f20578a.sendStart - request.f20578a.start;
                        int submitRequest = this.f20635x.submitRequest(spdyRequest, spdyDataProvider, this, new C0532a(request, requestCb));
                        if (ALog.isPrintLog(1)) {
                            ALog.m20788d("awcn.TnetSpdySession", "", request.getSeq(), "streamId", Integer.valueOf(submitRequest));
                        }
                        C0527c c0527c2 = new C0527c(this.f20635x, submitRequest, request.getSeq());
                        try {
                            this.f20361q.requestCount++;
                            this.f20361q.stdRCount++;
                            this.f20637z = System.currentTimeMillis();
                            if (this.f20628D != null) {
                                this.f20628D.reSchedule();
                            }
                            return c0527c2;
                        } catch (SpdyErrorException e) {
                            e = e;
                            c0527c = c0527c2;
                            if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                                ALog.m20786e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f20360p, new Object[0]);
                                notifyStatus(6, new C0503b(2));
                            }
                            requestCb.onFinish(-300, ErrorConstant.formatMsg(-300, String.valueOf(e.SpdyErrorGetCode())), requestStatistic);
                            return c0527c;
                        } catch (Exception unused) {
                            c0527c = c0527c2;
                            requestCb.onFinish(-101, ErrorConstant.getErrMsg(-101), requestStatistic);
                            return c0527c;
                        }
                    }
                    requestCb.onFinish(-301, ErrorConstant.getErrMsg(-301), request.f20578a);
                    return c0527c;
                } catch (SpdyErrorException e2) {
                    e = e2;
                } catch (Exception unused2) {
                }
            }
        } else if (requestCb != null) {
            requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
        }
        return c0527c;
    }

    /* renamed from: anet.channel.session.TnetSpdySession$a */
    /* loaded from: classes20.dex */
    public class C0532a extends C0533a {

        /* renamed from: b */
        public Request f20639b;

        /* renamed from: c */
        public RequestCb f20640c;

        /* renamed from: d */
        public int f20641d;

        /* renamed from: e */
        public long f20642e;

        static {
            Covode.recordClassIndex(2249);
        }

        public C0532a(Request request, RequestCb requestCb) {
            this.f20639b = request;
            this.f20640c = requestCb;
        }

        /* renamed from: a */
        private void m20903a(SuperviseData superviseData, int i, String str) {
            try {
                this.f20639b.f20578a.rspEnd = System.currentTimeMillis();
                if (this.f20639b.f20578a.isDone.get()) {
                    return;
                }
                if (i > 0) {
                    this.f20639b.f20578a.ret = 1;
                }
                this.f20639b.f20578a.statusCode = i;
                this.f20639b.f20578a.msg = str;
                if (superviseData != null) {
                    this.f20639b.f20578a.rspEnd = superviseData.responseEnd;
                    this.f20639b.f20578a.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                    this.f20639b.f20578a.sendDataTime = superviseData.sendEnd - this.f20639b.f20578a.sendStart;
                    this.f20639b.f20578a.firstDataTime = superviseData.responseStart - superviseData.sendEnd;
                    this.f20639b.f20578a.recDataTime = superviseData.responseEnd - superviseData.responseStart;
                    this.f20639b.f20578a.sendDataSize = superviseData.bodySize + superviseData.compressSize;
                    this.f20639b.f20578a.recDataSize = this.f20642e + superviseData.recvUncompressSize;
                    this.f20639b.f20578a.reqHeadInflateSize = superviseData.uncompressSize;
                    this.f20639b.f20578a.reqHeadDeflateSize = superviseData.compressSize;
                    this.f20639b.f20578a.reqBodyInflateSize = superviseData.bodySize;
                    this.f20639b.f20578a.reqBodyDeflateSize = superviseData.bodySize;
                    this.f20639b.f20578a.rspHeadDeflateSize = superviseData.recvCompressSize;
                    this.f20639b.f20578a.rspHeadInflateSize = superviseData.recvUncompressSize;
                    this.f20639b.f20578a.rspBodyDeflateSize = superviseData.recvBodySize;
                    this.f20639b.f20578a.rspBodyInflateSize = this.f20642e;
                    if (this.f20639b.f20578a.contentLength == 0) {
                        this.f20639b.f20578a.contentLength = superviseData.originContentLength;
                    }
                    TnetSpdySession.this.f20361q.recvSizeCount += superviseData.recvBodySize + superviseData.recvCompressSize;
                    TnetSpdySession.this.f20361q.sendSizeCount += superviseData.bodySize + superviseData.compressSize;
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.session.C0533a, org.android.spdy.Spdycb
        public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, Object obj) {
            this.f20639b.f20578a.firstDataTime = System.currentTimeMillis() - this.f20639b.f20578a.sendStart;
            this.f20641d = HttpHelper.parseStatusCode(map);
            TnetSpdySession.this.f20632H = 0;
            ALog.m20785i("awcn.TnetSpdySession", "", this.f20639b.getSeq(), "statusCode", Integer.valueOf(this.f20641d));
            ALog.m20785i("awcn.TnetSpdySession", "", this.f20639b.getSeq(), "response headers", map);
            RequestCb requestCb = this.f20640c;
            if (requestCb != null) {
                requestCb.onResponseCode(this.f20641d, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.this.handleCallbacks(16, null);
            this.f20639b.f20578a.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Encoding");
            this.f20639b.f20578a.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.f20639b.f20578a.contentLength = HttpHelper.parseContentLength(map);
            this.f20639b.f20578a.serverRT = HttpHelper.parseServerRT(map);
            TnetSpdySession.this.handleResponseCode(this.f20639b, this.f20641d);
            TnetSpdySession.this.handleResponseHeaders(this.f20639b, map);
            if (TnetSpdySession.this.f20628D != null) {
                TnetSpdySession.this.f20628D.reSchedule();
            }
        }

        @Override // anet.channel.session.C0533a, org.android.spdy.Spdycb
        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, Object obj) {
            if (ALog.isPrintLog(1)) {
                ALog.m20788d("awcn.TnetSpdySession", "spdyDataChunkRecvCB", this.f20639b.getSeq(), "len", Integer.valueOf(spdyByteArray.getDataLength()), "fin", Boolean.valueOf(z));
            }
            this.f20642e += spdyByteArray.getDataLength();
            this.f20639b.f20578a.recDataSize += spdyByteArray.getDataLength();
            if (TnetSpdySession.this.f20628D != null) {
                TnetSpdySession.this.f20628D.reSchedule();
            }
            if (this.f20640c != null) {
                ByteArray m21049a = C0470a.C0471a.f20427a.m21049a(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                spdyByteArray.recycle();
                this.f20640c.onDataReceive(m21049a, z);
            }
            TnetSpdySession.this.handleCallbacks(32, null);
        }

        @Override // anet.channel.session.C0533a, org.android.spdy.Spdycb
        public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, Object obj, SuperviseData superviseData) {
            String str;
            if (ALog.isPrintLog(1)) {
                ALog.m20788d("awcn.TnetSpdySession", "spdyStreamCloseCallback", this.f20639b.getSeq(), "streamId", Long.valueOf(j), "errorCode", Integer.valueOf(i));
            }
            if (i != 0) {
                this.f20641d = -304;
                str = ErrorConstant.formatMsg(-304, String.valueOf(i));
                if (i != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(-300, str, this.f20639b.f20578a, null));
                }
                ALog.m20786e("awcn.TnetSpdySession", "spdyStreamCloseCallback error", this.f20639b.getSeq(), "session", TnetSpdySession.this.f20360p, "status code", Integer.valueOf(i), "URL", this.f20639b.getHttpUrl().simpleUrlString());
            } else {
                str = "SUCCESS";
            }
            this.f20639b.f20578a.tnetErrorCode = i;
            m20903a(superviseData, this.f20641d, str);
            RequestCb requestCb = this.f20640c;
            if (requestCb != null) {
                requestCb.onFinish(this.f20641d, str, this.f20639b.f20578a);
            }
            if (i == -2004) {
                if (!TnetSpdySession.this.f20636y) {
                    TnetSpdySession.this.ping(true);
                }
                if (TnetSpdySession.m20907e(TnetSpdySession.this) >= 2) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = false;
                    connEvent.isAccs = TnetSpdySession.this.f20633I;
                    StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.this.f20348d, TnetSpdySession.this.f20355k, connEvent);
                    TnetSpdySession.this.close(true);
                }
            }
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        if (ALog.isPrintLog(2)) {
            ALog.m20785i("awcn.TnetSpdySession", "ping receive", this.f20360p, "Host", this.f20347c, C33968a.f42937f, Long.valueOf(j));
        }
        if (j < 0) {
            return;
        }
        this.f20636y = false;
        this.f20632H = 0;
        IHeartbeat iHeartbeat = this.f20628D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
        handleCallbacks(128, null);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.m20787e("awcn.TnetSpdySession", "[spdySessionFailedError]session clean up failed!", null, e, new Object[0]);
            }
        }
        notifyStatus(2, new C0503b(256, i, "tnet connect fail"));
        ALog.m20786e("awcn.TnetSpdySession", null, this.f20360p, " errorId:", Integer.valueOf(i));
        this.f20361q.errorCode = i;
        this.f20361q.ret = 0;
        this.f20361q.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.f20361q);
        if (C0579c.m20793b(this.f20361q.f20666ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f20361q));
        }
        AppMonitor.getInstance().commitAlarm(this.f20361q.getAlarmObject());
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00a1: INVOKE  (r15v0 ?? I:anet.channel.session.TnetSpdySession), (r10 I:int), (r1 I:int), (r3 I:boolean), (r0 I:java.lang.String) type: DIRECT call: anet.channel.session.TnetSpdySession.a(int, int, boolean, java.lang.String):void, block:B:32:0x0094 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00c1: INVOKE  (r15v0 ?? I:anet.channel.session.TnetSpdySession), (r10 I:int), (r2 I:int), (r3 I:boolean), (r0 I:java.lang.String) type: DIRECT call: anet.channel.session.TnetSpdySession.a(int, int, boolean, java.lang.String):void, block:B:29:0x00a6 */
    @Override // anet.channel.Session
    public void sendCustomFrame(int i, byte[] bArr, int i2) {
        int m20921a;
        int m20921a2;
        int length;
        try {
            if (this.f20627C == null) {
                return;
            }
            ALog.m20786e("awcn.TnetSpdySession", "sendCustomFrame", this.f20360p, "dataId", Integer.valueOf(i), "type", Integer.valueOf(i2));
            if (this.f20358n == 4 && this.f20635x != null) {
                if (bArr != null && bArr.length > 16384) {
                    m20921a(i, -303, false, null);
                    return;
                }
                SpdySession spdySession = this.f20635x;
                if (bArr == null) {
                    length = 0;
                } else {
                    length = bArr.length;
                }
                spdySession.sendCustomControlFrame(i, i2, 0, length, bArr);
                this.f20361q.requestCount++;
                this.f20361q.cfRCount++;
                this.f20637z = System.currentTimeMillis();
                if (this.f20628D != null) {
                    this.f20628D.reSchedule();
                    return;
                }
                return;
            }
            ALog.m20786e("awcn.TnetSpdySession", "sendCustomFrame", this.f20360p, "sendCustomFrame con invalid mStatus:" + this.f20358n);
            m20921a(i, -301, true, "session invalid");
        } catch (SpdyErrorException e) {
            ALog.m20787e("awcn.TnetSpdySession", "sendCustomFrame error", this.f20360p, e, new Object[0]);
            m20921a(m20921a2, -300, true, "SpdyErrorException: " + e.toString());
        } catch (Exception e2) {
            ALog.m20787e("awcn.TnetSpdySession", "sendCustomFrame error", this.f20360p, e2, new Object[0]);
            m20921a(m20921a, -101, true, e2.toString());
        }
    }

    /* renamed from: a */
    private void m20921a(int i, int i2, boolean z, String str) {
        DataFrameCb dataFrameCb = this.f20627C;
        if (dataFrameCb != null) {
            dataFrameCb.onException(i, i2, z, str);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        ALog.m20786e("awcn.TnetSpdySession", "spdyCustomControlFrameFailCallback", this.f20360p, "dataId", Integer.valueOf(i));
        m20921a(i, i2, true, "tnet error");
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        ALog.m20786e("awcn.TnetSpdySession", "spdySessionCloseCallback", this.f20360p, " errorCode:", Integer.valueOf(i));
        IHeartbeat iHeartbeat = this.f20628D;
        if (iHeartbeat != null) {
            iHeartbeat.stop();
            this.f20628D = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.m20787e("awcn.TnetSpdySession", "session clean up failed!", null, e, new Object[0]);
            }
        }
        if (i == -3516) {
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = false;
            StrategyCenter.getInstance().notifyConnEvent(this.f20348d, this.f20355k, connEvent);
        }
        notifyStatus(6, new C0503b(2));
        if (superviseConnectInfo != null) {
            this.f20361q.requestCount = superviseConnectInfo.reused_counter;
            this.f20361q.liveTime = superviseConnectInfo.keepalive_period_second;
            try {
                if (this.f20354j.isHTTP3()) {
                    if (spdySession != null) {
                        ALog.m20786e("awcn.TnetSpdySession", "[HTTP3 spdySessionCloseCallback]", this.f20360p, "connectInfo", spdySession.getConnectInfoOnDisConnected());
                    }
                    this.f20361q.xqc0RttStatus = superviseConnectInfo.xqc0RttStatus;
                    this.f20361q.retransmissionRate = superviseConnectInfo.retransmissionRate;
                    this.f20361q.lossRate = superviseConnectInfo.lossRate;
                    this.f20361q.tlpCount = superviseConnectInfo.tlpCount;
                    this.f20361q.rtoCount = superviseConnectInfo.rtoCount;
                    this.f20361q.srtt = superviseConnectInfo.srtt;
                }
            } catch (Exception unused) {
            }
        }
        if (this.f20361q.errorCode == 0) {
            this.f20361q.errorCode = i;
        }
        this.f20361q.lastPingInterval = (int) (System.currentTimeMillis() - this.f20637z);
        AppMonitor.getInstance().commitStat(this.f20361q);
        if (C0579c.m20793b(this.f20361q.f20666ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f20361q));
        }
        AppMonitor.getInstance().commitAlarm(this.f20361q.getAlarmObject());
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        ALog.m20786e("awcn.TnetSpdySession", "[spdyCustomControlFrameRecvCallback]", this.f20360p, "len", Integer.valueOf(i4), "frameCb", this.f20627C);
        if (ALog.isPrintLog(1) && i4 < 512) {
            String str = "";
            for (byte b : bArr) {
                new StringBuilder();
                str = C0002O.m25085C(str, Integer.toHexString(b & 255), " ");
            }
            ALog.m20786e("awcn.TnetSpdySession", null, this.f20360p, "str", str);
        }
        DataFrameCb dataFrameCb = this.f20627C;
        if (dataFrameCb != null) {
            dataFrameCb.onDataReceive(this, bArr, i, i2);
        } else {
            ALog.m20786e("awcn.TnetSpdySession", "AccsFrameCb is null", this.f20360p, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-105, null, "rt"));
        }
        this.f20361q.inceptCount++;
        IHeartbeat iHeartbeat = this.f20628D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
    }
}
