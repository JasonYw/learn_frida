package com.bytedance.android.live.network.impl.interceptor;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.C9067k;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import java.util.Collections;
import java.util.List;
import p003X.AbstractC102409QUp;
import p003X.C102410QUq;
import p003X.C102411QUr;
import p003X.C102412QUs;
import p003X.C102564QaE;
import p003X.C91210Lwa;

/* loaded from: classes8.dex */
public final class TracingMonitorInterceptor implements Interceptor {
    public static ChangeQuickRedirect LIZ;
    public AbstractC102409QUp LIZIZ;

    static {
        Covode.recordClassIndex(32675);
    }

    private SsResponse LIZ(Interceptor.Chain chain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (SsResponse) proxy.result;
        }
        Request request = chain.request();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            SsResponse proceed = chain.proceed(request);
            this.LIZIZ.LIZ(request, proceed, System.currentTimeMillis() - currentTimeMillis);
            return proceed;
        } catch (Exception e) {
            this.LIZIZ.LIZ(request, e, System.currentTimeMillis() - currentTimeMillis);
            throw e;
        }
    }

    public TracingMonitorInterceptor(C9067k c9067k) {
        List<String> list;
        if (!PatchProxy.proxy(new Object[]{c9067k}, this, LIZ, false, 1).isSupported) {
            if (C91210Lwa.LIZIZ.getValue().booleanValue()) {
                this.LIZIZ = new C102410QUq();
            } else if (c9067k.LIZLLL == 1) {
                this.LIZIZ = new C102412QUs(c9067k.LIZJ);
            } else if (c9067k.LIZLLL == 2) {
                long j = c9067k.LIZJ;
                long j2 = c9067k.f27973LJ;
                long j3 = c9067k.LJFF;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c9067k, C9067k.LIZ, false, 1);
                if (proxy.isSupported) {
                    list = (List) proxy.result;
                } else if (c9067k.LJI == null) {
                    list = Collections.emptyList();
                } else {
                    list = c9067k.LJI;
                }
                this.LIZIZ = new C102411QUr(j, j2, j3, list);
            } else {
                this.LIZIZ = new C102410QUq();
            }
        }
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor
    public final SsResponse intercept(Interceptor.Chain chain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (SsResponse) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, chain}, null, LIZ, true, 2);
        if (proxy2.isSupported) {
            return (SsResponse) proxy2.result;
        }
        if (chain.metrics() instanceof C102564QaE) {
            C102564QaE c102564QaE = (C102564QaE) chain.metrics();
            if (c102564QaE.f11152LJ > 0) {
                c102564QaE.requestInterceptDuration.put(c102564QaE.LJI, Long.valueOf(SystemClock.uptimeMillis() - c102564QaE.f11152LJ));
            }
            c102564QaE.LIZ(getClass().getSimpleName());
            c102564QaE.f11152LJ = SystemClock.uptimeMillis();
            SsResponse LIZ2 = LIZ(chain);
            if (c102564QaE.LJFF > 0) {
                c102564QaE.responseInterceptDuration.put(getClass().getSimpleName(), Long.valueOf(SystemClock.uptimeMillis() - c102564QaE.LJFF));
            }
            c102564QaE.LJFF = SystemClock.uptimeMillis();
            return LIZ2;
        }
        return LIZ(chain);
    }

    public /* synthetic */ TracingMonitorInterceptor(C9067k c9067k, byte b) {
        this(c9067k);
    }
}
