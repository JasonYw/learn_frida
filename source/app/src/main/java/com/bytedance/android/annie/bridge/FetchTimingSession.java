package com.bytedance.android.annie.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C88655KwT;
import p003X.C88717KxT;

/* loaded from: classes5.dex */
public final class FetchTimingSession extends ConcurrentHashMap<String, Long> {
    public static final C88655KwT Companion = new C88655KwT((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10488);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        LIZ("native_net_start_time");
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        LIZ("native_net_end_time");
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Long>> entrySet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        return super.entrySet();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        return super.keySet();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Collection<Long> values() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (Collection) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27);
        if (proxy2.isSupported) {
            return (Collection) proxy2.result;
        }
        return super.values();
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        put(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof String)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.containsKey(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof Long)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 17);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.containsValue(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 19);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.get(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 11);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.remove(obj);
    }

    public final void LIZ(JsonObject jsonObject) {
        Unit unit;
        if (PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        LIZ("native_jsb_end_time");
        if (!PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, 10).isSupported) {
            if (jsonObject == null) {
                unit = null;
            } else {
                try {
                    jsonObject.add("perf_timing", C88717KxT.LIZIZ.LIZ(this));
                    unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    Result.m30308constructorimpl(ResultKt.createFailure(th));
                    return;
                }
            }
            Result.m30308constructorimpl(unit);
        }
    }

    public final void LIZ(JSONObject jSONObject) {
        JSONObject putOpt;
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        LIZ("native_jsb_end_time");
        if (!PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 9).isSupported) {
            if (jSONObject == null) {
                putOpt = null;
            } else {
                try {
                    putOpt = jSONObject.putOpt("perf_timing", new JSONObject(this));
                } catch (Throwable th) {
                    Result.m30308constructorimpl(ResultKt.createFailure(th));
                    return;
                }
            }
            Result.m30308constructorimpl(putOpt);
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return obj2;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 21);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof String) || !(obj2 instanceof Long)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 13);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.remove(obj, obj2);
    }
}
