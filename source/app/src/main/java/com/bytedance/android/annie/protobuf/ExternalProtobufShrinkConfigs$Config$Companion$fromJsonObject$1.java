package com.bytedance.android.annie.protobuf;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class ExternalProtobufShrinkConfigs$Config$Companion$fromJsonObject$1 extends Lambda implements Function1<JsonElement, String> {
    public static final ExternalProtobufShrinkConfigs$Config$Companion$fromJsonObject$1 INSTANCE = new ExternalProtobufShrinkConfigs$Config$Companion$fromJsonObject$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10923);
    }

    public ExternalProtobufShrinkConfigs$Config$Companion$fromJsonObject$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonElement2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Intrinsics.checkNotNullExpressionValue(jsonElement2, "");
        return jsonElement2.getAsString();
    }
}
