package anet.channel.detect;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0502a;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.C0534b;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0579c;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C0597j;
import anet.channel.util.HttpUrl;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;

/* renamed from: anet.channel.detect.d */
/* loaded from: classes20.dex */
public class C0481d {

    /* renamed from: a */
    public TreeMap<String, C0568l.C0571c> f20453a = new TreeMap<>();

    /* renamed from: b */
    public AtomicInteger f20454b = new AtomicInteger(1);

    static {
        Covode.recordClassIndex(2175);
    }

    /* renamed from: b */
    public void m21028b() {
        StrategyCenter.getInstance().registerListener(new C0482e(this));
        AppLifecycle.registerLifecycleListener(new C0483f(this));
    }

    /* renamed from: a */
    public void m21033a() {
        MethodCollector.m14708i(33);
        ALog.m20786e("anet.HorseRaceDetector", "network detect thread start", null, new Object[0]);
        while (true) {
            synchronized (this.f20453a) {
                try {
                    if (!AwcnConfig.isHorseRaceEnable()) {
                        this.f20453a.clear();
                        return;
                    }
                    Map.Entry<String, C0568l.C0571c> pollFirstEntry = this.f20453a.pollFirstEntry();
                    if (pollFirstEntry != null) {
                        try {
                            m21031a(pollFirstEntry.getValue());
                        } catch (Exception e) {
                            ALog.m20787e("anet.HorseRaceDetector", "start hr task failed", null, e, new Object[0]);
                        }
                    } else {
                        MethodCollector.m14707o(33);
                        return;
                    }
                } finally {
                    MethodCollector.m14707o(33);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21031a(C0568l.C0571c c0571c) {
        if (c0571c.f20792b != null && c0571c.f20792b.length != 0) {
            String str = c0571c.f20791a;
            for (int i = 0; i < c0571c.f20792b.length; i++) {
                C0568l.C0573e c0573e = c0571c.f20792b[i];
                String str2 = c0573e.f20802b.f20772b;
                if (!str2.equalsIgnoreCase("http") && !str2.equalsIgnoreCase("https")) {
                    if (!str2.equalsIgnoreCase("http2") && !str2.equalsIgnoreCase("spdy") && !str2.equalsIgnoreCase("quic")) {
                        if (str2.equalsIgnoreCase("tcp")) {
                            m21026c(str, c0573e);
                        }
                    } else {
                        m21027b(str, c0573e);
                    }
                } else {
                    m21029a(str, c0573e);
                }
            }
        }
    }

    /* renamed from: a */
    public static IConnStrategy m21032a(ConnProtocol connProtocol, C0568l.C0573e c0573e) {
        return new C0487j(c0573e, connProtocol);
    }

    /* renamed from: a */
    private void m21030a(String str, HorseRaceStat horseRaceStat) {
        if (AwcnConfig.isPing6Enable() && C0579c.m20793b(str)) {
            try {
                PingResponse pingResponse = (PingResponse) new PingTask(str, 1000, 3, 0, 0).launch().get();
                if (pingResponse == null) {
                    return;
                }
                horseRaceStat.pingSuccessCount = pingResponse.getSuccessCnt();
                horseRaceStat.pingTimeoutCount = 3 - horseRaceStat.pingSuccessCount;
                horseRaceStat.localIP = pingResponse.getLocalIPStr();
            } catch (Throwable th) {
                ALog.m20787e("anet.HorseRaceDetector", "ping6 task fail.", null, th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private void m21027b(String str, C0568l.C0573e c0573e) {
        String str2;
        int i;
        MethodCollector.m14708i(34);
        ConnProtocol valueOf = ConnProtocol.valueOf(c0573e.f20802b);
        ConnType valueOf2 = ConnType.valueOf(valueOf);
        if (valueOf2 == null) {
            MethodCollector.m14707o(34);
            return;
        }
        ALog.m20785i("anet.HorseRaceDetector", "startLongLinkTask", null, C1315c.f22208f, str, "ip", c0573e.f20801a, "port", Integer.valueOf(c0573e.f20802b.f20771a), "protocol", valueOf);
        String str3 = "HR" + this.f20454b.getAndIncrement();
        Context context = GlobalAppRuntimeInfo.getContext();
        StringBuilder sb = new StringBuilder();
        if (valueOf2.isSSL()) {
            str2 = "https://";
        } else {
            str2 = "http://";
        }
        sb.append(str2);
        sb.append(str);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new C0502a(sb.toString(), str3, m21032a(valueOf, c0573e)));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, c0573e);
        long currentTimeMillis = System.currentTimeMillis();
        tnetSpdySession.registerEventcb(257, new C0485h(this, horseRaceStat, currentTimeMillis, str3, c0573e, tnetSpdySession));
        tnetSpdySession.connect();
        synchronized (horseRaceStat) {
            try {
                try {
                    if (c0573e.f20802b.f20773c == 0) {
                        i = 10000;
                    } else {
                        i = c0573e.f20802b.f20773c;
                    }
                    horseRaceStat.wait(i);
                    if (horseRaceStat.connTime == 0) {
                        horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
                    }
                    m21030a(c0573e.f20801a, horseRaceStat);
                    AppMonitor.getInstance().commitStat(horseRaceStat);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                MethodCollector.m14707o(34);
                throw th;
            }
        }
        tnetSpdySession.close(false);
        MethodCollector.m14707o(34);
    }

    /* renamed from: c */
    private void m21026c(String str, C0568l.C0573e c0573e) {
        int i;
        String str2 = "HR" + this.f20454b.getAndIncrement();
        ALog.m20785i("anet.HorseRaceDetector", "startTcpTask", str2, "ip", c0573e.f20801a, "port", Integer.valueOf(c0573e.f20802b.f20771a));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, c0573e);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Socket socket = new Socket(c0573e.f20801a, c0573e.f20802b.f20771a);
            if (c0573e.f20802b.f20773c == 0) {
                i = 10000;
            } else {
                i = c0573e.f20802b.f20773c;
            }
            socket.setSoTimeout(i);
            ALog.m20785i("anet.HorseRaceDetector", "socket connect success", str2, new Object[0]);
            horseRaceStat.connRet = 1;
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            socket.close();
        } catch (IOException unused) {
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            horseRaceStat.connErrorCode = -404;
        }
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    /* renamed from: a */
    private void m21029a(String str, C0568l.C0573e c0573e) {
        HttpUrl parse = HttpUrl.parse(c0573e.f20802b.f20772b + "://" + str + c0573e.f20803c);
        if (parse == null) {
            return;
        }
        int i = 0;
        ALog.m20785i("anet.HorseRaceDetector", "startShortLinkTask", null, PushConstants.WEB_URL, parse);
        Request.Builder builder = new Request.Builder();
        builder.setUrl(parse);
        builder.addHeader("Connection", "close");
        builder.setConnectTimeout(c0573e.f20802b.f20773c);
        builder.setReadTimeout(c0573e.f20802b.f20774d);
        builder.setRedirectEnable(false);
        builder.setSslSocketFactory(new C0597j(str));
        builder.setSeq("HR" + this.f20454b.getAndIncrement());
        Request build = builder.build();
        build.setDnsOptimize(c0573e.f20801a, c0573e.f20802b.f20771a);
        long currentTimeMillis = System.currentTimeMillis();
        C0534b.C0535a m20901a = C0534b.m20901a(build, (RequestCb) null);
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, c0573e);
        horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
        if (m20901a.f20643a <= 0) {
            horseRaceStat.connErrorCode = m20901a.f20643a;
        } else {
            horseRaceStat.connRet = 1;
            if (m20901a.f20643a == 200) {
                i = 1;
            }
            horseRaceStat.reqRet = i;
            horseRaceStat.reqErrorCode = m20901a.f20643a;
            horseRaceStat.reqTime = horseRaceStat.connTime;
        }
        m21030a(c0573e.f20801a, horseRaceStat);
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }
}
