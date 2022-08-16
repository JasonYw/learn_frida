package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.alipay.android.phone.mrpc.core.m */
/* loaded from: classes2.dex */
public final class C1166m extends FutureTask<C1174u> {

    /* renamed from: a */
    public final /* synthetic */ CallableC1170q f21902a;

    /* renamed from: b */
    public final /* synthetic */ C1165l f21903b;

    static {
        Covode.recordClassIndex(4637);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166m(C1165l c1165l, Callable callable, CallableC1170q callableC1170q) {
        super(callable);
        this.f21903b = c1165l;
        this.f21902a = callableC1170q;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        C1168o m19616a = this.f21902a.m19616a();
        if (m19616a.m19599f() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (!isCancelled() && !m19616a.m19597h()) {
                return;
            }
            m19616a.m19598g();
            if (isCancelled() && isDone()) {
                return;
            }
            cancel(false);
        } catch (InterruptedException e) {
            new StringBuilder().append(e);
        } catch (CancellationException unused) {
            m19616a.m19598g();
        } catch (ExecutionException e2) {
            if (e2.getCause() == null || !(e2.getCause() instanceof HttpException)) {
                new StringBuilder().append(e2);
                return;
            }
            HttpException httpException = (HttpException) e2.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}
