package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.android.livesdkapi.model.C9646n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final /* synthetic */ class FetchV3Method$modifyHeadersAndGetResponseDecoder$3 extends FunctionReferenceImpl implements Function1<C9646n, JSONObject> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FetchV3Method$modifyHeadersAndGetResponseDecoder$1 $fromJsonResponse$1;

    static {
        Covode.recordClassIndex(22591);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchV3Method$modifyHeadersAndGetResponseDecoder$3(FetchV3Method$modifyHeadersAndGetResponseDecoder$1 fetchV3Method$modifyHeadersAndGetResponseDecoder$1) {
        super(1, null, "fromJsonResponse", "invoke(Lcom/bytedance/android/livesdkapi/model/HttpResponse;)Lorg/json/JSONObject;", 0);
        this.$fromJsonResponse$1 = fetchV3Method$modifyHeadersAndGetResponseDecoder$1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [org.json.JSONObject, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ JSONObject invoke(C9646n c9646n) {
        C9646n c9646n2 = c9646n;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c9646n2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c9646n2);
        return this.$fromJsonResponse$1.invoke(c9646n2);
    }
}
