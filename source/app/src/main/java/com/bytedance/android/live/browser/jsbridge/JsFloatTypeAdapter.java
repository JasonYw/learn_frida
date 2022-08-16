package com.bytedance.android.live.browser.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.Intrinsics;
import p003X.C102363QSv;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class JsFloatTypeAdapter extends TypeAdapter<Float> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(22046);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Float, java.lang.Object] */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final /* synthetic */ Float mo28739read(JsonReader jsonReader) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonReader}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(jsonReader);
        JsonToken peek = jsonReader.peek();
        if (peek != null) {
            int i = C102363QSv.LIZ[peek.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    jsonReader.nextNull();
                    return null;
                }
            } else {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
        }
        throw new JsonParseException("Expected NUMBER but was " + peek);
    }

    @Override // com.google.gson.TypeAdapter
    public final /* synthetic */ void write(JsonWriter jsonWriter, Float f) {
        Float f2 = f;
        if (!PatchProxy.proxy(new Object[]{jsonWriter, f2}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(jsonWriter);
            if (f2 == null) {
                jsonWriter.nullValue();
            } else if (Intrinsics.areEqual(f2, 0.0f)) {
                jsonWriter.value(f2);
            } else {
                jsonWriter.value(String.valueOf(f2.floatValue()));
            }
        }
    }
}
