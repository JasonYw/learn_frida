package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.android.phone.mrpc.core.p075a.C1145d;
import com.alipay.android.phone.mrpc.core.p075a.C1146e;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alipay.android.phone.mrpc.core.z */
/* loaded from: classes2.dex */
public final class C1179z {

    /* renamed from: a */
    public static final ThreadLocal<Object> f21944a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<Map<String, Object>> f21945b = new ThreadLocal<>();

    /* renamed from: c */
    public byte f21946c = 0;

    /* renamed from: d */
    public AtomicInteger f21947d = new AtomicInteger();

    /* renamed from: e */
    public C1177x f21948e;

    static {
        Covode.recordClassIndex(4650);
    }

    public C1179z(C1177x c1177x) {
        this.f21948e = c1177x;
    }

    /* renamed from: a */
    public final Object m19590a(Method method, Object[] objArr) {
        if (!(Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())) {
            OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
            boolean z = method.getAnnotation(ResetCookie.class) != null;
            Type genericReturnType = method.getGenericReturnType();
            method.getAnnotations();
            f21944a.set(null);
            f21945b.set(null);
            if (operationType == null) {
                throw new IllegalStateException("OperationType must be set.");
            }
            String value = operationType.value();
            int incrementAndGet = this.f21947d.incrementAndGet();
            try {
                if (this.f21946c == 0) {
                    C1146e c1146e = new C1146e(incrementAndGet, value, objArr);
                    if (f21945b.get() != null) {
                        c1146e.mo19666a(f21945b.get());
                    }
                    byte[] mo19667a = c1146e.mo19667a();
                    f21945b.set(null);
                    Object mo19668a = new C1145d(genericReturnType, (byte[]) new C1162j(this.f21948e.m19592a(), method, incrementAndGet, value, mo19667a, z).mo19594a()).mo19668a();
                    if (genericReturnType != Void.TYPE) {
                        f21944a.set(mo19668a);
                    }
                }
                return f21944a.get();
            } catch (RpcException e) {
                e.setOperationType(value);
                throw e;
            }
        }
        throw new IllegalThreadStateException("can't in main thread call rpc .");
    }
}
