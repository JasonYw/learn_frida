package com.bytedance.android.live.gson;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* loaded from: classes8.dex */
public class ToStringSerializer implements JsonSerializer<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24979);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, type, jsonSerializationContext}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JsonElement) proxy.result;
        }
        if (obj != null) {
            return jsonSerializationContext.serialize(obj.toString());
        }
        return jsonSerializationContext.serialize(null);
    }
}
