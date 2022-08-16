package com.bytedance.android.live.browser.jsbridge.prefetch;

import com.bytedance.android.live.browser.jsbridge.prefetch.PrefetchNetworkExecutorImpl;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class PrefetchNetworkExecutorImpl$MultiFormatResponse$decoded$2 extends Lambda implements Function0<JSONObject> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PrefetchNetworkExecutorImpl.MultiFormatResponse this$0;

    static {
        Covode.recordClassIndex(22906);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchNetworkExecutorImpl$MultiFormatResponse$decoded$2(PrefetchNetworkExecutorImpl.MultiFormatResponse multiFormatResponse) {
        super(0);
        this.this$0 = multiFormatResponse;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [org.json.JSONObject, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ JSONObject mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("raw", this.this$0.LIZIZ);
        jSONObject.put("cached", this.this$0.getCached());
        jSONObject.put("status_code", this.this$0.getStatusCode());
        return jSONObject;
    }
}
