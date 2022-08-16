package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.android.livesdkapi.model.C9646n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C88639KwD;

/* loaded from: classes5.dex */
public final class FetchV3Method$modifyHeadersAndGetResponseDecoder$1 extends Lambda implements Function1<C9646n, JSONObject> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88639KwD this$0;

    static {
        Covode.recordClassIndex(22589);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchV3Method$modifyHeadersAndGetResponseDecoder$1(C88639KwD c88639KwD) {
        super(1);
        this.this$0 = c88639KwD;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: LIZ */
    public final JSONObject invoke(C9646n c9646n) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c9646n}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(c9646n);
        C88639KwD c88639KwD = this.this$0;
        byte[] bArr = c9646n.LJFF;
        Intrinsics.checkNotNullExpressionValue(bArr, "");
        return c88639KwD.LIZ(new JSONObject(new String(bArr, Charsets.UTF_8)), c9646n);
    }
}
