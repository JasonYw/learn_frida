package com.bytedance.android.live.network.gson;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C5175h;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;

/* loaded from: classes8.dex */
public class ListResponseTypeAdapter extends AbsJsonDeserializer<C5175h> {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(32633);
    }

    public ListResponseTypeAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.JsonDeserializer
    /* renamed from: deserialize */
    public /* synthetic */ Object mo25806deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        int asInt = asJsonObject.get("status_code").getAsInt();
        if (asInt == 0) {
            return GsonProtectorUtils.fromJson(this.LIZ, jsonElement, type);
        }
        C5175h c5175h = new C5175h();
        c5175h.LIZ = asInt;
        c5175h.LIZJ = (R) GsonProtectorUtils.fromJson(this.LIZ, asJsonObject.get("extra"), (Class<Object>) Extra.class);
        c5175h.LIZLLL = (RequestError) GsonProtectorUtils.fromJson(this.LIZ, asJsonObject.get(C2521l.LJIIL), (Class<Object>) RequestError.class);
        return c5175h;
    }
}
