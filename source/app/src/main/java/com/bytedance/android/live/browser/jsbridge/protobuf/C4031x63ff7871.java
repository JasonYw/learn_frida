package com.bytedance.android.live.browser.jsbridge.protobuf;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonObject;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.ExternalProtobufMessageDefinitions$Message$$special$$inlined$also$lambda$1 */
/* loaded from: classes.dex */
public final class C4031x63ff7871 extends Lambda implements Function1<String, Pair<? extends String, ? extends JsonObject>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JsonObject $jsonObject$inlined;

    static {
        Covode.recordClassIndex(22936);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4031x63ff7871(JsonObject jsonObject) {
        super(1);
        this.$jsonObject$inlined = jsonObject;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Pair<? extends java.lang.String, ? extends com.google.gson.JsonObject>] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Pair<? extends String, ? extends JsonObject> invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new Pair<>(str2, this.$jsonObject$inlined.getAsJsonObject(str2));
    }
}
