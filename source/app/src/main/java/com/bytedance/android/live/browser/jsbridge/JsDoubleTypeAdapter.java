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
import p003X.C102362QSu;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class JsDoubleTypeAdapter extends TypeAdapter<Double> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(22045);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Double, java.lang.Object] */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final /* synthetic */ Double mo28739read(JsonReader jsonReader) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonReader}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(jsonReader);
        JsonToken peek = jsonReader.peek();
        if (peek != null) {
            int i = C102362QSu.LIZ[peek.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    jsonReader.nextNull();
                    return null;
                }
            } else {
                return Double.valueOf(jsonReader.nextDouble());
            }
        }
        throw new JsonParseException("Expected NUMBER but was " + peek);
    }

    @Override // com.google.gson.TypeAdapter
    public final /* synthetic */ void write(JsonWriter jsonWriter, Double d) {
        Double d2 = d;
        if (!PatchProxy.proxy(new Object[]{jsonWriter, d2}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(jsonWriter);
            if (d2 == null) {
                jsonWriter.nullValue();
            } else if (Intrinsics.areEqual(d2, 0.0d)) {
                jsonWriter.value(d2.doubleValue());
            } else {
                jsonWriter.value(String.valueOf(d2.doubleValue()));
            }
        }
    }
}
