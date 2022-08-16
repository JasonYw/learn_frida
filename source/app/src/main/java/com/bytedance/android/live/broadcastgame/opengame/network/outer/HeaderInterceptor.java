package com.bytedance.android.live.broadcastgame.opengame.network.outer;

import android.os.SystemClock;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002O.C0002O;
import p003X.AbstractC80293Hkt;
import p003X.C102564QaE;

/* loaded from: classes6.dex */
public class HeaderInterceptor implements Interceptor {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public String LIZJ;

    static {
        Covode.recordClassIndex(20467);
    }

    private String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25084C("https://tmaservice.developer.toutiao.com?appid=", this.LIZIZ, "&version=", this.LIZJ);
    }

    private String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            new StringBuilder();
            return C0002O.m25080C(System.getProperty("http.agent"), " ", ((IHostContext) ServiceManager.getService(IHostContext.class)).appName(), "/", ((IHostContext) ServiceManager.getService(IHostContext.class)).getVersionCode(), " ToutiaoMicroApp/", AbstractC80293Hkt.f7099cU.LIZ(), " PluginVersion/", this.LIZJ);
        } catch (Exception unused) {
            return "android";
        }
    }

    private SsResponse LIZ(Interceptor.Chain chain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (SsResponse) proxy.result;
        }
        Request request = chain.request();
        ArrayList arrayList = new ArrayList(request.getHeaders());
        Header header = new Header("Referer", LIZ());
        Header header2 = new Header("User-Agent", LIZIZ());
        LIZ(arrayList, header);
        LIZ(arrayList, header2);
        Request.Builder newBuilder = request.newBuilder();
        newBuilder.headers(arrayList);
        return chain.proceed(newBuilder.build());
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

    public HeaderInterceptor(String str, String str2) {
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    private void LIZ(List<Header> list, Header header) {
        if (PatchProxy.proxy(new Object[]{list, header}, this, LIZ, false, 4).isSupported) {
            return;
        }
        Iterator<Header> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(header.getName())) {
                it.remove();
            }
        }
        list.add(header);
    }
}
