package com.bytedance.android.live.gson;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import p003X.KM9;

/* loaded from: classes8.dex */
public class FeedItemTypeAdapter implements JsonDeserializer<FeedItem>, JsonSerializer<FeedItem> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(24977);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: LIZ */
    public FeedItem mo25806deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (FeedItem) proxy.result;
        }
        try {
            FeedItem feedItem = (FeedItem) KM9.LIZIZ().fromJson(jsonElement, (Class<Object>) FeedItem.class);
            feedItem.init();
            return feedItem;
        } catch (Exception e) {
            e.printStackTrace();
            throw new JsonParseException("error type");
        }
    }

    @Override // com.google.gson.JsonSerializer
    public /* synthetic */ JsonElement serialize(FeedItem feedItem, Type type, JsonSerializationContext jsonSerializationContext) {
        FeedItem feedItem2 = feedItem;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{feedItem2, type, jsonSerializationContext}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (JsonElement) proxy.result;
        }
        JsonObject asJsonObject = GsonProtectorUtils.toJsonTree(KM9.LIZIZ(), feedItem2).getAsJsonObject();
        asJsonObject.add(C2521l.LJIIL, GsonProtectorUtils.toJsonTree(KM9.LIZIZ(), feedItem2.getRoom(), Room.class));
        return asJsonObject;
    }
}
