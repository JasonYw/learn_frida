package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.entity.C0503b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.f */
/* loaded from: classes20.dex */
public class C0505f implements EventCb {

    /* renamed from: a */
    public final /* synthetic */ SessionRequest.IConnCb f20508a;

    /* renamed from: b */
    public final /* synthetic */ long f20509b;

    /* renamed from: c */
    public final /* synthetic */ SessionRequest f20510c;

    static {
        Covode.recordClassIndex(2204);
    }

    public C0505f(SessionRequest sessionRequest, SessionRequest.IConnCb iConnCb, long j) {
        this.f20510c = sessionRequest;
        this.f20508a = iConnCb;
        this.f20509b = j;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i, C0503b c0503b) {
        int i2;
        String str;
        if (session == null) {
            return;
        }
        if (c0503b == null) {
            i2 = 0;
            str = "";
        } else {
            i2 = c0503b.f20503b;
            str = c0503b.f20504c;
        }
        if (i != 2) {
            if (i != 256) {
                if (i == 512) {
                    ALog.m20788d("awcn.SessionRequest", null, session.f20360p, "Session", session, "EventType", Integer.valueOf(i), "Event", c0503b);
                    this.f20510c.m21068a(session, 0, (String) null);
                    this.f20508a.onSuccess(session, this.f20509b);
                    return;
                }
                return;
            }
            ALog.m20788d("awcn.SessionRequest", null, session.f20360p, "Session", session, "EventType", Integer.valueOf(i), "Event", c0503b);
            this.f20508a.onFailed(session, this.f20509b, i, i2);
            return;
        }
        ALog.m20788d("awcn.SessionRequest", null, session.f20360p, "Session", session, "EventType", Integer.valueOf(i), "Event", c0503b);
        this.f20510c.m21068a(session, i2, str);
        if (this.f20510c.f20384b.m21014c(this.f20510c, session)) {
            this.f20508a.onDisConnect(session, this.f20509b, i);
        } else {
            this.f20508a.onFailed(session, this.f20509b, i, i2);
        }
    }
}
