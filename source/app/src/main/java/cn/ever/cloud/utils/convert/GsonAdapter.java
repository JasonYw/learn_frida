package cn.ever.cloud.utils.convert;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes23.dex */
public final class GsonAdapter {
    public static final Gson GSON_DISABLE_HTML_ESCAPING;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final GsonAdapter INSTANCE = new GsonAdapter();
    public static final Object TYPE_ADAPTER = GsonAdapter$TYPE_ADAPTER$1.INSTANCE;
    public static final Gson GSON = new GsonBuilder().create();

    static {
        Covode.recordClassIndex(3448);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.disableHtmlEscaping();
        GSON_DISABLE_HTML_ESCAPING = gsonBuilder.create();
    }

    public final Type canonicalize(Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Type) proxy.result;
        }
        Type canonicalize = C$Gson$Types.canonicalize(type);
        Intrinsics.checkNotNullExpressionValue(canonicalize, "");
        return canonicalize;
    }

    public final <T> T fromJson(String str, Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, cls}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        return (T) GsonProtectorUtils.fromJson(GSON, str, (Class<Object>) cls);
    }

    public final <T> T fromJson(String str, Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, type}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        return (T) GsonProtectorUtils.fromJson(GSON, str, type);
    }

    public final <T> String toJson(Object obj, Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, type}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String json = GsonProtectorUtils.toJson(GSON, obj, type);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final String toJson(Object obj, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (z) {
            String json = GsonProtectorUtils.toJson(GSON, obj);
            Intrinsics.checkNotNullExpressionValue(json, "");
            return json;
        }
        String json2 = GsonProtectorUtils.toJson(GSON_DISABLE_HTML_ESCAPING, obj);
        Intrinsics.checkNotNullExpressionValue(json2, "");
        return json2;
    }

    public static /* synthetic */ String toJson$default(GsonAdapter gsonAdapter, Object obj, boolean z, int i, Object obj2) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{gsonAdapter, obj, Byte.valueOf(b), Integer.valueOf(i), obj2}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return gsonAdapter.toJson(obj, z);
    }
}
