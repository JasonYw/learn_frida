package com.bytedance.android.live.browser.jsbridge.protobuf;

import com.bytedance.android.live.browser.jsbridge.protobuf.C4041d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C102250QOm;

/* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.ExternalProtobufShrinkConfigs$Config$Companion$$special$$inlined$shallowToMap$1 */
/* loaded from: classes8.dex */
public final class C4032xd542630 extends Lambda implements Function1<String, Pair<? extends String, ? extends C4041d.C4042b>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JsonObject $this_shallowToMap;

    static {
        Covode.recordClassIndex(22939);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4032xd542630(JsonObject jsonObject) {
        super(1);
        this.$this_shallowToMap = jsonObject;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Pair<? extends java.lang.String, ? extends com.bytedance.android.live.browser.jsbridge.protobuf.d$b>] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Pair<? extends String, ? extends C4041d.C4042b> invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Intrinsics.checkNotNullExpressionValue(str2, "");
        JsonElement jsonElement = this.$this_shallowToMap.get(str2);
        Intrinsics.checkNotNull(jsonElement);
        C102250QOm c102250QOm = C4041d.C4042b.f26165LJ;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        return new Pair<>(str2, c102250QOm.LIZ("__child_config", asJsonObject));
    }
}