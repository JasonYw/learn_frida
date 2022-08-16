package cn.com.chinatelecom.account.api.p036c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cn.com.chinatelecom.account.api.c.m */
/* loaded from: classes2.dex */
public final class ThreadFactoryC0652m implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f20945a = new AtomicInteger(1);

    static {
        Covode.recordClassIndex(2703);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable);
    }
}
