package com.bytedance.android.live.network.impl.interceptor;

import android.os.SystemClock;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;
import p003X.C102564QaE;

/* loaded from: classes6.dex */
public class SendGiftSourceInterceptor implements Interceptor {
    public static ChangeQuickRedirect LIZ;
    public static String LIZIZ = "SendGiftSourceInterceptor";

    static {
        Covode.recordClassIndex(32674);
    }

    private SsResponse LIZ(Interceptor.Chain chain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (SsResponse) proxy.result;
        }
        Request request = chain.request();
        String path = request.getPath();
        if (path != null && !path.isEmpty() && !path.endsWith("/")) {
            Map<String, String> LIZ2 = LIZ(path);
            if ("UnKnow".equals(LIZ2.get("send_gift_source"))) {
                ALogger.m15800e(LIZIZ, C0002O.m25086C("send gift without source: ", path));
            } else {
                ALogger.m15800e(LIZIZ, C0002O.m25086C("send gift with source: ", LIZ2.get("send_gift_source")));
            }
        }
        return chain.proceed(request);
    }

    private Map<String, String> LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        try {
            if (str.indexOf(63) != -1) {
                String[] split = str.substring(str.indexOf(63) + 1).split("&");
                for (int i = 0; i < split.length; i++) {
                    hashMap.put(split[i].substring(0, split[i].indexOf("=")), split[i].substring(split[i].indexOf("=") + 1));
                }
            }
        } catch (Exception e) {
            ALogger.m15801d(LIZIZ, C0002O.m25086C("parse path error ", e.toString()));
        }
        return hashMap;
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
