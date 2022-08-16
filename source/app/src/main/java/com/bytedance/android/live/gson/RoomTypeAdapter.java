package com.bytedance.android.live.gson;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import p003X.KM9;

/* loaded from: classes8.dex */
public class RoomTypeAdapter implements JsonDeserializer<Room> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(24978);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.livesdkapi.depend.model.live.Room] */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: deserialize */
    public /* synthetic */ Room mo25806deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Room room = (Room) GsonProtectorUtils.fromJson(KM9.LIZIZ(), jsonElement, type);
        room.init();
        return room;
    }
}
