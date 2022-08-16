package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2 extends Lambda implements Function0<C38761> {
    public static final UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2 INSTANCE = new UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21909);
    }

    public UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.live.browser.UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.browser.UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C38761 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new TypeAdapter<JsonElement>() { // from class: com.bytedance.android.live.browser.UtilsKt$JS_SAFE_ELEMENT_ADAPTER$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21910);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.google.gson.JsonElement, java.lang.Object] */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public final /* synthetic */ JsonElement mo28739read(JsonReader jsonReader) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{jsonReader}, this, LIZ, false, 2);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                JsonElement mo28739read = TypeAdapters.JSON_ELEMENT.mo28739read(jsonReader);
                Intrinsics.checkNotNullExpressionValue(mo28739read, "");
                return mo28739read;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: LIZ */
            public void write(JsonWriter jsonWriter, JsonElement jsonElement) {
                if (PatchProxy.proxy(new Object[]{jsonWriter, jsonElement}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(jsonWriter);
                if (jsonElement != null && !jsonElement.isJsonNull()) {
                    if (jsonElement.isJsonPrimitive()) {
                        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                        Intrinsics.checkNotNullExpressionValue(asJsonPrimitive, "");
                        if (asJsonPrimitive.isNumber()) {
                            long asLong = jsonElement.getAsLong();
                            if (asLong >= 2147483647L || asLong <= -2147483648L) {
                                jsonWriter.value(jsonElement.getAsString());
                                return;
                            }
                        }
                    }
                    if (jsonElement.isJsonArray()) {
                        jsonWriter.beginArray();
                        JsonArray<JsonElement> asJsonArray = jsonElement.getAsJsonArray();
                        Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                        for (JsonElement jsonElement2 : asJsonArray) {
                            write(jsonWriter, jsonElement2);
                        }
                        jsonWriter.endArray();
                        return;
                    } else if (jsonElement.isJsonObject()) {
                        jsonWriter.beginObject();
                        Set<Map.Entry<String, JsonElement>> entrySet = jsonElement.getAsJsonObject().entrySet();
                        Intrinsics.checkNotNullExpressionValue(entrySet, "");
                        Iterator<T> it = entrySet.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            jsonWriter.name((String) entry.getKey());
                            write(jsonWriter, (JsonElement) entry.getValue());
                        }
                        jsonWriter.endObject();
                        return;
                    } else {
                        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
                        return;
                    }
                }
                jsonWriter.nullValue();
            }
        };
    }
}
