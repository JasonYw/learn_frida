package com.bytedance.android.annie.protobuf;

import com.bytedance.android.annie.protobuf.C2624e;
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
import p003X.C102242QOe;

/* loaded from: classes8.dex */
public final class ExternalProtobufShrinkConfigs$$special$$inlined$shallowToMap$1 extends Lambda implements Function1<String, Pair<? extends String, ? extends C2624e.C2625b>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JsonObject $this_shallowToMap;

    static {
        Covode.recordClassIndex(10920);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalProtobufShrinkConfigs$$special$$inlined$shallowToMap$1(JsonObject jsonObject) {
        super(1);
        this.$this_shallowToMap = jsonObject;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Pair<? extends java.lang.String, ? extends com.bytedance.android.annie.protobuf.e$b>] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Pair<? extends String, ? extends C2624e.C2625b> invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Intrinsics.checkNotNullExpressionValue(str2, "");
        JsonElement jsonElement = this.$this_shallowToMap.get(str2);
        Intrinsics.checkNotNull(jsonElement);
        C102242QOe c102242QOe = C2624e.C2625b.f25623LJ;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        return new Pair<>(str2, c102242QOe.LIZ(str2, asJsonObject));
    }
}
