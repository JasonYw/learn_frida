package com.bytedance.android.live.network.gson;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.ExtraResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p003X.C100827PnJ;
import p003X.C100829PnL;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class ExtraResponseInstanceCreator implements JsonDeserializer<ExtraResponse<?, ?>> {
    public static ChangeQuickRedirect LIZ;
    public final Gson LIZIZ;

    static {
        Covode.recordClassIndex(32632);
    }

    public ExtraResponseInstanceCreator(Gson gson) {
        C106862S5w.LIZ(gson);
        this.LIZIZ = gson;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, com.bytedance.android.live.network.response.ExtraResponse<?, ?>] */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: deserialize */
    public final /* synthetic */ ExtraResponse<?, ?> mo25806deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(jsonElement, type, jsonDeserializationContext);
        if (type instanceof ParameterizedType) {
            if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                JsonElement jsonElement2 = asJsonObject.get("status_code");
                if (jsonElement2 != null) {
                    int asInt = jsonElement2.getAsInt();
                    if (asInt == 0) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        Object fromJson = GsonProtectorUtils.fromJson(this.LIZIZ, asJsonObject.get(C2521l.LJIIL), parameterizedType.getActualTypeArguments()[0]);
                        Intrinsics.checkNotNullExpressionValue(fromJson, "");
                        Object fromJson2 = GsonProtectorUtils.fromJson(this.LIZIZ, asJsonObject.get("extra"), parameterizedType.getActualTypeArguments()[1]);
                        Intrinsics.checkNotNullExpressionValue(fromJson2, "");
                        return new C100829PnL(fromJson, (Extra) fromJson2);
                    }
                    Object fromJson3 = GsonProtectorUtils.fromJson(this.LIZIZ, asJsonObject.get(C2521l.LJIIL), (Class<Object>) RequestError.class);
                    Intrinsics.checkNotNullExpressionValue(fromJson3, "");
                    Object fromJson4 = GsonProtectorUtils.fromJson(this.LIZIZ, asJsonObject.get("extra"), ((ParameterizedType) type).getActualTypeArguments()[1]);
                    Intrinsics.checkNotNullExpressionValue(fromJson4, "");
                    return new C100827PnJ(asInt, (RequestError) fromJson3, (Extra) fromJson4);
                }
                throw new IllegalArgumentException(("status_code not found in response: " + jsonElement).toString());
            }
            throw new IllegalStateException(("wrong type of json element for " + type + ", current: " + jsonElement).toString());
        }
        throw new IllegalStateException(("typeOfT must be ParameterizedType, current is: " + type).toString());
    }
}
