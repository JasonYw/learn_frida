package com.bytedance.android.live.browser.jsbridge.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* loaded from: classes8.dex */
public final class ResultCodeEnumSerializer implements JsonSerializer<AbstractC3909ci> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(22109);
    }

    @Override // com.google.gson.JsonSerializer
    public final /* synthetic */ JsonElement serialize(AbstractC3909ci abstractC3909ci, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer num;
        AbstractC3909ci abstractC3909ci2 = abstractC3909ci;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3909ci2, type, jsonSerializationContext}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JsonElement) proxy.result;
        }
        if (abstractC3909ci2 != null) {
            num = Integer.valueOf(abstractC3909ci2.LIZ());
        } else {
            num = null;
        }
        return new JsonPrimitive((Number) num);
    }
}
