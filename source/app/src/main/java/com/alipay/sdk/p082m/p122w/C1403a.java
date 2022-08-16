package com.alipay.sdk.p082m.p122w;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.w.a */
/* loaded from: classes2.dex */
public class C1403a {

    /* renamed from: f */
    public static final int f22438f = 5;

    /* renamed from: g */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f22439g;

    /* renamed from: h */
    public static ExecutorService f22440h = C116971W2r.LIZIZ(16);

    /* renamed from: com.alipay.sdk.m.w.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC1404a<T, R> {
        static {
            Covode.recordClassIndex(4905);
        }

        /* renamed from: a */
        R mo25270a(T t);
    }

    static {
        Covode.recordClassIndex(4904);
    }

    /* renamed from: a */
    public static synchronized void m18757a() {
        synchronized (C1403a.class) {
            f22439g = null;
        }
    }

    /* renamed from: a */
    public static Context m18753a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized void m18755a(int i, Object obj) {
        synchronized (C1403a.class) {
            if (f22439g == null) {
                f22439g = new ConcurrentHashMap<>();
            }
            f22439g.put(Integer.valueOf(i), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
        }
    }

    /* renamed from: a */
    public static Pair<Boolean, ?> m18754a(int i, TimeUnit timeUnit, long j) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f22439g;
        if (concurrentHashMap == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Pair<Long, ?> pair = concurrentHashMap.get(Integer.valueOf(i));
        if (pair == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Long l = (Long) pair.first;
        Object obj = pair.second;
        if (l != null && SystemClock.elapsedRealtime() - l.longValue() <= TimeUnit.MILLISECONDS.convert(j, timeUnit)) {
            return new Pair<>(Boolean.TRUE, obj);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00bd: INVOKE  (r5 I:com.alipay.sdk.m.s.a), (r4 I:java.lang.String), (r0 I:java.lang.String), (r6 I:java.lang.Throwable) type: STATIC call: com.alipay.sdk.m.k.a.a(com.alipay.sdk.m.s.a, java.lang.String, java.lang.String, java.lang.Throwable):void, block:B:22:0x009e */
    /* renamed from: a */
    public static <T> T m18756a(int i, long j, TimeUnit timeUnit, AbstractC1404a<Object, Boolean> abstractC1404a, Callable<T> callable, boolean z, long j2, TimeUnit timeUnit2, C1376a c1376a, boolean z2) {
        C1376a m19215a;
        T call;
        try {
            Pair<Boolean, ?> m18754a = m18754a(i, timeUnit, j);
            if (((Boolean) m18754a.first).booleanValue() && abstractC1404a.mo25270a(m18754a.second).booleanValue()) {
                C1385e.m18862d("getC", i + " got " + m18754a.second);
                return (T) m18754a.second;
            }
            if (z2 && C1399n.m18764h()) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                C1301a.m19211b(c1376a, "biz", "ch_get_main", sb.toString());
                C1385e.m18862d("getC", i + " skip");
                call = null;
            } else {
                if (z) {
                    call = f22440h.submit(callable).get(j2, timeUnit2);
                } else {
                    call = callable.call();
                }
                m18755a(i, call);
            }
            C1385e.m18862d("getC", i + " new " + call);
            return call;
        } catch (Throwable th) {
            C1385e.m18867a("CDT", "ch_get_e|" + i, th);
            C1301a.m19215a(m19215a, "biz", "ch_get_e|" + i, th);
            C1385e.m18862d("getC", i + " err");
            return null;
        }
    }
}
