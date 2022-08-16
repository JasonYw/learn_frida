package cn.ever.cloud.utils.convert;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class GsonAdapter$TYPE_ADAPTER$1<T> implements JsonDeserializer<Map<?, ?>> {
    public static final GsonAdapter$TYPE_ADAPTER$1 INSTANCE = new GsonAdapter$TYPE_ADAPTER$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3449);
    }

    @Override // com.google.gson.JsonDeserializer
    /* renamed from: deserialize  reason: avoid collision after fix types in other method */
    public final Map<?, ?> mo25806deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(jsonElement);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.isJsonPrimitive()) {
                Intrinsics.checkNotNullExpressionValue(key, "");
                String asString = value.getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "");
                hashMap.put(key, asString);
            } else {
                Intrinsics.checkNotNullExpressionValue(key, "");
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }
}
