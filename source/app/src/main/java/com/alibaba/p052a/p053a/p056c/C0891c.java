package com.alibaba.p052a.p053a.p056c;

import com.alibaba.p052a.p053a.p056c.AbstractC0890b;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.alibaba.a.a.c.c */
/* loaded from: classes10.dex */
public class C0891c<T extends AbstractC0890b> {

    /* renamed from: c */
    public static AtomicLong f21189c = new AtomicLong(0);

    /* renamed from: d */
    public static AtomicLong f21190d = new AtomicLong(0);

    /* renamed from: e */
    public Integer f21193e;

    /* renamed from: f */
    public final int f21194f = 20;

    /* renamed from: a */
    public AtomicLong f21191a = new AtomicLong(0);

    /* renamed from: b */
    public AtomicLong f21192b = new AtomicLong(0);

    /* renamed from: g */
    public ConcurrentLinkedQueue<T> f21195g = new ConcurrentLinkedQueue<>();

    /* renamed from: h */
    public Set<Integer> f21196h = new HashSet();

    static {
        Covode.recordClassIndex(4201);
    }

    /* renamed from: a */
    public T m20414a() {
        f21189c.getAndIncrement();
        this.f21191a.getAndIncrement();
        T poll = this.f21195g.poll();
        if (poll != null) {
            this.f21196h.remove(Integer.valueOf(System.identityHashCode(poll)));
            this.f21192b.getAndIncrement();
            f21190d.getAndIncrement();
        }
        return poll;
    }

    /* renamed from: a */
    public void m20413a(T t) {
        t.mo20252d();
        if (this.f21195g.size() < 20) {
            synchronized (this.f21196h) {
                int identityHashCode = System.identityHashCode(t);
                if (!this.f21196h.contains(Integer.valueOf(identityHashCode))) {
                    this.f21196h.add(Integer.valueOf(identityHashCode));
                    this.f21195g.offer(t);
                }
            }
        }
    }
}
