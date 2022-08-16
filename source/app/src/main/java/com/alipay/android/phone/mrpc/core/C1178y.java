package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.alipay.android.phone.mrpc.core.y */
/* loaded from: classes2.dex */
public final class C1178y implements InvocationHandler {

    /* renamed from: a */
    public AbstractC1159g f21941a;

    /* renamed from: b */
    public Class<?> f21942b;

    /* renamed from: c */
    public C1179z f21943c;

    static {
        Covode.recordClassIndex(4649);
    }

    public C1178y(AbstractC1159g abstractC1159g, Class<?> cls, C1179z c1179z) {
        this.f21941a = abstractC1159g;
        this.f21942b = cls;
        this.f21943c = c1179z;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f21943c.m19590a(method, objArr);
    }
}
