package com.bytedance.android.live.gson;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* loaded from: classes8.dex */
public class BooleanTypeAdapter extends TypeAdapter<Boolean> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(24975);
    }

    /* renamed from: com.bytedance.android.live.gson.BooleanTypeAdapter$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C42471 {
        public static final /* synthetic */ int[] LIZ = new int[JsonToken.values().length];

        static {
            Covode.recordClassIndex(24976);
            try {
                LIZ[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[JsonToken.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Boolean, java.lang.Object] */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public /* synthetic */ Boolean mo28739read(JsonReader jsonReader) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonReader}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        JsonToken peek = jsonReader.peek();
        int i = C42471.LIZ[peek.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (jsonReader.nextInt() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                throw new JsonParseException("Expected BOOLEAN or NUMBER but was " + peek);
            }
            jsonReader.nextNull();
            return null;
        }
        return Boolean.valueOf(jsonReader.nextBoolean());
    }

    @Override // com.google.gson.TypeAdapter
    public /* synthetic */ void write(JsonWriter jsonWriter, Boolean bool) {
        Boolean bool2 = bool;
        if (!PatchProxy.proxy(new Object[]{jsonWriter, bool2}, this, LIZ, false, 1).isSupported) {
            if (bool2 == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(bool2);
            }
        }
    }
}
