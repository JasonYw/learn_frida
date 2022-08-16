package com.bytedance.android.live.network.gson;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.network.response.C5169a;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

/* loaded from: classes8.dex */
public class BaseListResponseTypeAdapter extends AbsJsonDeserializer<C5169a> {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(32629);
    }

    public BaseListResponseTypeAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.JsonDeserializer
    /* renamed from: deserialize */
    public /* synthetic */ Object mo25806deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C5169a c5169a = (C5169a) GsonProtectorUtils.fromJson(this.LIZ, jsonElement, type);
        if (c5169a.LIZ != 0) {
            c5169a.LIZLLL = (RequestError) GsonProtectorUtils.fromJson(this.LIZ, jsonElement.getAsJsonObject().get(C2521l.LJIIL), (Class<Object>) RequestError.class);
        }
        return c5169a;
    }
}
