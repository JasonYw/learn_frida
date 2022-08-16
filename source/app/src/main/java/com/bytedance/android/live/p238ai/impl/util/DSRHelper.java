package com.bytedance.android.live.p238ai.impl.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.ai.impl.util.DSRHelper */
/* loaded from: classes8.dex */
public final class DSRHelper {
    public static ChangeQuickRedirect LIZ;
    public static LimitedQueue<JSONObject> LIZIZ = new LimitedQueue<>(4);

    static {
        Covode.recordClassIndex(13926);
    }

    public static synchronized JSONArray LIZ() {
        synchronized (DSRHelper.class) {
            MethodCollector.m14708i(1186);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
            if (proxy.isSupported) {
                JSONArray jSONArray = (JSONArray) proxy.result;
                MethodCollector.m14707o(1186);
                return jSONArray;
            }
            LimitedQueue<JSONObject> limitedQueue = LIZIZ;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], limitedQueue, LimitedQueue.changeQuickRedirect, false, 2);
            if (proxy2.isSupported) {
                JSONArray jSONArray2 = (JSONArray) proxy2.result;
                MethodCollector.m14707o(1186);
                return jSONArray2;
            }
            JSONArray jSONArray3 = new JSONArray();
            for (int i = 0; i < limitedQueue.size(); i++) {
                jSONArray3.put(limitedQueue.get(i));
            }
            MethodCollector.m14707o(1186);
            return jSONArray3;
        }
    }

    /* renamed from: com.bytedance.android.live.ai.impl.util.DSRHelper$LimitedQueue */
    /* loaded from: classes8.dex */
    public static class LimitedQueue<E> extends LinkedList<E> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int limit = 4;

        static {
            Covode.recordClassIndex(13927);
        }

        public LimitedQueue(int i) {
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{e}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            super.add(e);
            while (size() > this.limit) {
                super.remove();
            }
            return true;
        }
    }

    public static synchronized void LIZ(Map<String, String> map) {
        synchronized (DSRHelper.class) {
            MethodCollector.m14708i(1187);
            if (PatchProxy.proxy(new Object[]{map}, null, LIZ, true, 2).isSupported) {
                MethodCollector.m14707o(1187);
            } else if (map == null) {
                MethodCollector.m14707o(1187);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cpu_rate", map.get("cpu_rate"));
                    jSONObject.put("cpu_speed", map.get("cpu_speed"));
                    jSONObject.put("gpu_usage", map.get("gpu_usage"));
                    jSONObject.put("fps", map.get("fps"));
                    jSONObject.put("battery_state_android", map.get("battery_state_android"));
                    jSONObject.put("battery_health", map.get("battery_health"));
                    jSONObject.put("battery_scale", map.get("battery_scale"));
                    jSONObject.put("temperature_android", map.get("temperature_android"));
                    jSONObject.put("mem_java_free", map.get("mem_java_free"));
                    jSONObject.put("mem_java_lave", map.get("mem_java_lave"));
                    jSONObject.put("mem_java_total", map.get("mem_java_total"));
                    jSONObject.put("mem_java_used", map.get("mem_java_used"));
                    jSONObject.put("mem_vmsize", map.get("mem_vmsize"));
                    LIZIZ.add(jSONObject);
                    MethodCollector.m14707o(1187);
                } catch (Exception unused) {
                    MethodCollector.m14707o(1187);
                }
            }
        }
    }
}
