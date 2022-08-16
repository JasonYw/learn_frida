package cn.com.chinatelecom.account.api.p036c;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: cn.com.chinatelecom.account.api.c.l */
/* loaded from: classes2.dex */
public final class C0651l extends PThreadPoolExecutor {

    /* renamed from: a */
    public static final BlockingQueue f20943a = new LinkedBlockingQueue(256);

    /* renamed from: b */
    public static final ThreadFactory f20944b = new ThreadFactoryC0652m();

    static {
        Covode.recordClassIndex(2702);
    }

    public C0651l() {
        this(5);
    }

    public C0651l(int i) {
        this(5, 10, 1L, TimeUnit.SECONDS, f20943a, f20944b);
    }

    public C0651l(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 1L, timeUnit, blockingQueue, threadFactory);
    }
}
