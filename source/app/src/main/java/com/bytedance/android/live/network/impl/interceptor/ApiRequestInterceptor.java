package com.bytedance.android.live.network.impl.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import java.util.ArrayList;
import java.util.List;
import p002O.C0002O;
import p003X.C102564QaE;

/* loaded from: classes8.dex */
public class ApiRequestInterceptor implements Interceptor {
    public static ChangeQuickRedirect LIZ;
    public static volatile ApiRequestInterceptor LIZJ;
    public List<String> LIZIZ = new ArrayList();

    static {
        Covode.recordClassIndex(32670);
    }

    public ApiRequestInterceptor() {
        this.LIZIZ.add("https://aweme.snssdk.com/luckycat/aweme/v1/");
    }

    public static ApiRequestInterceptor LIZ() {
        MethodCollector.m14708i(2145);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 4);
        if (proxy.isSupported) {
            ApiRequestInterceptor apiRequestInterceptor = (ApiRequestInterceptor) proxy.result;
            MethodCollector.m14707o(2145);
            return apiRequestInterceptor;
        }
        if (LIZJ == null) {
            synchronized (ApiRequestInterceptor.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new ApiRequestInterceptor();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(2145);
                    throw th;
                }
            }
        }
        ApiRequestInterceptor apiRequestInterceptor2 = LIZJ;
        MethodCollector.m14707o(2145);
        return apiRequestInterceptor2;
    }

    private SsResponse LIZ(Interceptor.Chain chain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (SsResponse) proxy.result;
        }
        Request request = chain.request();
        for (String str : this.LIZIZ) {
            if (request.getUrl().startsWith(str)) {
                return chain.proceed(request);
            }
        }
        String path = request.getPath();
        if (path != null && !path.isEmpty() && !path.endsWith("/")) {
            int indexOf = request.getUrl().indexOf(path) + path.length();
            new StringBuilder();
            return chain.proceed(new Request(request.getMethod(), C0002O.m25085C(request.getUrl().substring(0, indexOf), "/", request.getUrl().substring(indexOf)), request.getHeaders(), request.getBody(), request.getPriorityLevel(), request.isResponseStreaming(), request.getMaxLength(), request.isAddCommonParam(), request.getExtraInfo()));
        }
        return chain.proceed(request);
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor
    public SsResponse intercept(Interceptor.Chain chain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (SsResponse) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, chain}, null, LIZ, true, 1);
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
}
