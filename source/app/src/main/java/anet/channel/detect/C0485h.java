package anet.channel.detect;

import anet.channel.Session;
import anet.channel.entity.C0503b;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C0568l;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p002O.C0002O;

/* renamed from: anet.channel.detect.h */
/* loaded from: classes20.dex */
public class C0485h implements EventCb {

    /* renamed from: a */
    public final /* synthetic */ HorseRaceStat f20458a;

    /* renamed from: b */
    public final /* synthetic */ long f20459b;

    /* renamed from: c */
    public final /* synthetic */ String f20460c;

    /* renamed from: d */
    public final /* synthetic */ C0568l.C0573e f20461d;

    /* renamed from: e */
    public final /* synthetic */ TnetSpdySession f20462e;

    /* renamed from: f */
    public final /* synthetic */ C0481d f20463f;

    static {
        Covode.recordClassIndex(2179);
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i, C0503b c0503b) {
        MethodCollector.m14708i(36);
        if (this.f20458a.connTime != 0) {
            MethodCollector.m14707o(36);
            return;
        }
        this.f20458a.connTime = System.currentTimeMillis() - this.f20459b;
        if (i == 1) {
            ALog.m20785i("anet.HorseRaceDetector", "tnetSpdySession connect success", this.f20460c, new Object[0]);
            this.f20458a.connRet = 1;
            HttpUrl parse = HttpUrl.parse(C0002O.m25086C(session.getHost(), this.f20461d.f20803c));
            if (parse == null) {
                MethodCollector.m14707o(36);
                return;
            }
            Request.Builder builder = new Request.Builder();
            builder.setUrl(parse);
            builder.setReadTimeout(this.f20461d.f20802b.f20774d);
            builder.setRedirectEnable(false);
            builder.setSeq(this.f20460c);
            this.f20462e.request(builder.build(), new C0486i(this));
            MethodCollector.m14707o(36);
            return;
        }
        this.f20458a.connErrorCode = c0503b.f20503b;
        synchronized (this.f20458a) {
            try {
                this.f20458a.notify();
            } catch (Throwable th) {
                MethodCollector.m14707o(36);
                throw th;
            }
        }
        MethodCollector.m14707o(36);
    }

    public C0485h(C0481d c0481d, HorseRaceStat horseRaceStat, long j, String str, C0568l.C0573e c0573e, TnetSpdySession tnetSpdySession) {
        this.f20463f = c0481d;
        this.f20458a = horseRaceStat;
        this.f20459b = j;
        this.f20460c = str;
        this.f20461d = c0573e;
        this.f20462e = tnetSpdySession;
    }
}
