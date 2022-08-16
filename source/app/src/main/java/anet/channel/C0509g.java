package anet.channel;

import anet.channel.entity.C0503b;
import anet.channel.entity.EventCb;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.g */
/* loaded from: classes2.dex */
public class C0509g implements EventCb {

    /* renamed from: a */
    public final /* synthetic */ Session f20521a;

    /* renamed from: b */
    public final /* synthetic */ SessionRequest f20522b;

    static {
        Covode.recordClassIndex(2213);
    }

    public C0509g(SessionRequest sessionRequest, Session session) {
        this.f20522b = sessionRequest;
        this.f20521a = session;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i, C0503b c0503b) {
        ALog.m20788d("awcn.SessionRequest", "Receive session event", null, "eventType", Integer.valueOf(i));
        ConnEvent connEvent = new ConnEvent();
        if (i == 512) {
            connEvent.isSuccess = true;
        }
        if (this.f20522b.f20385c != null) {
            connEvent.isAccs = this.f20522b.f20385c.isAccs;
        }
        StrategyCenter.getInstance().notifyConnEvent(this.f20521a.getRealHost(), this.f20521a.getConnStrategy(), connEvent);
    }
}
