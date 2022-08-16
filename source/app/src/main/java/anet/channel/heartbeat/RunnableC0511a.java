package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.a */
/* loaded from: classes2.dex */
public class RunnableC0511a implements IHeartbeat, Runnable {

    /* renamed from: a */
    public Session f20526a;

    /* renamed from: b */
    public volatile boolean f20527b;

    static {
        Covode.recordClassIndex(2217);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f20527b = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f20527b) {
            return;
        }
        this.f20526a.ping(true);
        ThreadPoolExecutorFactory.submitScheduledTask(this, 45000L, TimeUnit.MILLISECONDS);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f20526a = session;
            run();
            return;
        }
        throw new NullPointerException("session is null");
    }
}
