package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.session.f */
/* loaded from: classes20.dex */
public class RunnableC0539f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Request f20652a;

    /* renamed from: b */
    public final /* synthetic */ RequestCb f20653b;

    /* renamed from: c */
    public final /* synthetic */ RequestStatistic f20654c;

    /* renamed from: d */
    public final /* synthetic */ C0537d f20655d;

    static {
        Covode.recordClassIndex(2256);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20652a.f20578a.sendBeforeTime = System.currentTimeMillis() - this.f20652a.f20578a.reqStart;
        C0534b.m20901a(this.f20652a, new C0540g(this));
    }

    public RunnableC0539f(C0537d c0537d, Request request, RequestCb requestCb, RequestStatistic requestStatistic) {
        this.f20655d = c0537d;
        this.f20652a = request;
        this.f20653b = requestCb;
        this.f20654c = requestStatistic;
    }
}
