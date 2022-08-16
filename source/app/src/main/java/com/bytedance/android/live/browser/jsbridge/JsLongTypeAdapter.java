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
import p003X.C102365QSx;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class JsLongTypeAdapter extends TypeAdapter<Long> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(22048);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Long, java.lang.Object] */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final /* synthetic */ Long mo28739read(JsonReader jsonReader) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonReader}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(jsonReader);
        JsonToken peek = jsonReader.peek();
        if (peek != null) {
            int i = C102365QSx.LIZ[peek.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    jsonReader.nextNull();
                    return null;
                }
            } else {
                return Long.valueOf(jsonReader.nextLong());
            }
        }
        throw new JsonParseException("Expected NUMBER but was " + peek);
    }

    @Override // com.google.gson.TypeAdapter
    public final /* synthetic */ void write(JsonWriter jsonWriter, Long l) {
        Long l2 = l;
        if (!PatchProxy.proxy(new Object[]{jsonWriter, l2}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(jsonWriter);
            if (l2 == null) {
                jsonWriter.nullValue();
            } else if (l2.longValue() == 0) {
                jsonWriter.value(l2.longValue());
            } else {
                jsonWriter.value(String.valueOf(l2.longValue()));
            }
        }
    }
}
