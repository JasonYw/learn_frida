package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.c */
/* loaded from: classes2.dex */
public class RunnableC0513c implements IHeartbeat, Runnable {

    /* renamed from: a */
    public Session f20532a;

    /* renamed from: b */
    public volatile boolean f20533b;

    /* renamed from: c */
    public volatile long f20534c = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(2219);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f20533b = true;
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f20534c = System.currentTimeMillis() + 45000;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f20533b) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.f20534c - 1000) {
            ThreadPoolExecutorFactory.submitScheduledTask(this, this.f20534c - currentTimeMillis, TimeUnit.MILLISECONDS);
        } else {
            this.f20532a.close(false);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f20532a = session;
            this.f20534c = System.currentTimeMillis() + 45000;
            ThreadPoolExecutorFactory.submitScheduledTask(this, 45000L, TimeUnit.MILLISECONDS);
            return;
        }
        throw new NullPointerException("session is null");
    }
}
