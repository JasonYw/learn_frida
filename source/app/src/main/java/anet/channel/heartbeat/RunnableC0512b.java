package anet.channel.heartbeat;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.b */
/* loaded from: classes2.dex */
public class RunnableC0512b implements IHeartbeat, Runnable {

    /* renamed from: a */
    public Session f20528a;

    /* renamed from: b */
    public volatile long f20529b;

    /* renamed from: c */
    public volatile boolean f20530c;

    /* renamed from: d */
    public long f20531d;

    static {
        Covode.recordClassIndex(2218);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f20529b = System.currentTimeMillis() + this.f20531d;
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Session session = this.f20528a;
        if (session == null) {
            return;
        }
        ALog.m20785i("awcn.DefaultHeartbeatImpl", "heartbeat stop", session.f20360p, "session", this.f20528a);
        this.f20530c = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f20530c) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.f20529b - 1000) {
            m20983a(this.f20529b - currentTimeMillis);
        } else if (!GlobalAppRuntimeInfo.isAppBackground()) {
            if (ALog.isPrintLog(1)) {
                ALog.m20788d("awcn.DefaultHeartbeatImpl", "heartbeat", this.f20528a.f20360p, "session", this.f20528a);
            }
            this.f20528a.ping(true);
            m20983a(this.f20531d);
        } else {
            ALog.m20786e("awcn.DefaultHeartbeatImpl", "close session in background", this.f20528a.f20360p, "session", this.f20528a);
            this.f20528a.close(false);
        }
    }

    /* renamed from: a */
    private void m20983a(long j) {
        try {
            this.f20529b = System.currentTimeMillis() + j;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.m20787e("awcn.DefaultHeartbeatImpl", "Submit heartbeat task failed.", this.f20528a.f20360p, e, new Object[0]);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f20528a = session;
            this.f20531d = session.getConnStrategy().getHeartbeat();
            if (this.f20531d <= 0) {
                this.f20531d = 45000L;
            }
            ALog.m20785i("awcn.DefaultHeartbeatImpl", "heartbeat start", session.f20360p, "session", session, "interval", Long.valueOf(this.f20531d));
            m20983a(this.f20531d);
            return;
        }
        throw new NullPointerException("session is null");
    }
}
