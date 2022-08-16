package com.bytedance.android.annie.bridge.method.abs;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class ResultCodeEnumSerializer implements JsonSerializer<AbstractC2591o> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(10555);
    }

    @Override // com.google.gson.JsonSerializer
    public final /* synthetic */ JsonElement serialize(AbstractC2591o abstractC2591o, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer num;
        AbstractC2591o abstractC2591o2 = abstractC2591o;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC2591o2, type, jsonSerializationContext}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JsonElement) proxy.result;
        }
        if (abstractC2591o2 != null) {
            num = Integer.valueOf(abstractC2591o2.LIZ());
        } else {
            num = null;
        }
        return new JsonPrimitive((Number) num);
    }
}
