package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.android.annie.service.p218j.AbstractC2631b;
import com.bytedance.android.livesdkapi.model.C9646n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C88639KwD;

/* loaded from: classes5.dex */
public final class FetchV3Method$modifyHeadersAndGetResponseDecoder$4 extends Lambda implements Function1<C9646n, JSONObject> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $dataMessageName;
    public final /* synthetic */ AbstractC2631b $decoder;
    public final /* synthetic */ String $extraMessageName;
    public final /* synthetic */ FetchV3Method$modifyHeadersAndGetResponseDecoder$1 $fromJsonResponse$1;
    public final /* synthetic */ JSONObject $pbExtras;
    public final /* synthetic */ C88639KwD this$0;

    static {
        Covode.recordClassIndex(22592);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchV3Method$modifyHeadersAndGetResponseDecoder$4(C88639KwD c88639KwD, AbstractC2631b abstractC2631b, String str, String str2, JSONObject jSONObject, FetchV3Method$modifyHeadersAndGetResponseDecoder$1 fetchV3Method$modifyHeadersAndGetResponseDecoder$1) {
        super(1);
        this.this$0 = c88639KwD;
        this.$decoder = abstractC2631b;
        this.$dataMessageName = str;
        this.$extraMessageName = str2;
        this.$pbExtras = jSONObject;
        this.$fromJsonResponse$1 = fetchV3Method$modifyHeadersAndGetResponseDecoder$1;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [org.json.JSONObject, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ JSONObject invoke(C9646n c9646n) {
        boolean z;
        C9646n c9646n2 = c9646n;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c9646n2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c9646n2);
        if (Intrinsics.areEqual(c9646n2.f28211LJ, "application/x-protobuf")) {
            C88639KwD c88639KwD = this.this$0;
            AbstractC2631b abstractC2631b = this.$decoder;
            byte[] bArr = c9646n2.LJFF;
            Intrinsics.checkNotNullExpressionValue(bArr, "");
            String str = this.$dataMessageName;
            String str2 = this.$extraMessageName;
            String optString = this.$pbExtras.optString("data_shrink_config");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            if (optString.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                optString = null;
            }
            String optString2 = this.$pbExtras.optString("extra_shrink_config");
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            if (optString2.length() <= 0) {
                optString2 = null;
            }
            return c88639KwD.LIZ(abstractC2631b.LIZ(bArr, str, str2, optString, optString2), c9646n2);
        }
        return this.$fromJsonResponse$1.invoke(c9646n2);
    }
}
