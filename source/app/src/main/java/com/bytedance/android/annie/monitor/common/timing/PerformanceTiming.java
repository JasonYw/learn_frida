package com.bytedance.android.annie.monitor.common.timing;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.annie.log.LogLevel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC90724Lok;
import p003X.C90746Lp6;
import p003X.C90903Lrd;
import p003X.C99775PRh;
import p003X.C99776PRi;
import p003X.C99777PRj;
import p003X.C99780PRm;

/* loaded from: classes7.dex */
public final class PerformanceTiming extends HashMap<String, Long> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Long activityOnCreateTs;
    public Long containerInitStartTs;
    public Integer errorCode;
    public String errorMsg;
    public String errorReason;
    public Bundle initBundle;
    public Long openTs;
    public String pageUrl;
    public WeakReference<View> viewRef;
    public static final C99780PRm Companion = new C99780PRm((byte) 0);
    public static boolean isFirstOpen = true;
    public String engineType = LoggerUtil.UNKNOWN;
    public String templateResType = LoggerUtil.UNKNOWN;
    public String pageType = LoggerUtil.UNKNOWN;
    public String enterFrom = LoggerUtil.UNKNOWN;

    static {
        Covode.recordClassIndex(10856);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        if (this.openTs == null) {
            this.openTs = LIZ("open_time");
        }
        if (this.activityOnCreateTs == null) {
            this.activityOnCreateTs = LIZ("container_activity_on_create");
        }
        if (this.containerInitStartTs == null) {
            this.containerInitStartTs = LIZ("container_init_start_time");
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Long>> entrySet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        return super.entrySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<Long> values() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30);
        if (proxy.isSupported) {
            return (Collection) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29);
        if (proxy2.isSupported) {
            return (Collection) proxy2.result;
        }
        return super.values();
    }

    public final JSONObject LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        Long l = this.openTs;
        if (l == null) {
            l = (Long) get("open_time");
        }
        Long l2 = this.containerInitStartTs;
        if (l2 == null) {
            l2 = (Long) get("container_init_start");
        }
        LIZ(jSONObject, "timing_open_cost", l, l2);
        Long l3 = (Long) get("prepare_init_data_start");
        LIZ(jSONObject, "timing_activity_init_cost", l2, l3);
        Long l4 = this.activityOnCreateTs;
        if (l4 != null) {
            long longValue = l4.longValue();
            LIZ(jSONObject, "timing_activity_start_cost", l2, Long.valueOf(longValue));
            LIZ(jSONObject, "timing_activity_on_create_cost", Long.valueOf(longValue), l3);
        }
        Long l5 = (Long) get("container_init_end");
        LIZ(jSONObject, "timing_fragment_init_cost", l3, (Long) get("prepare_init_data_end"));
        LIZ(jSONObject, "timing_container_init_cost", l2, l5);
        LIZ(jSONObject, "timing_lynx_env_init_cost", (Long) get("prepare_component_lynx_env_start"), (Long) get("prepare_component_lynx_env_end"));
        Long l6 = (Long) get("prepare_component_jsb_start");
        Long l7 = (Long) get("prepare_component_jsb_end");
        LIZ(jSONObject, "timing_jsb_init_cost", l6, l7);
        Long l8 = (Long) get("prepare_component_start");
        Long l9 = (Long) get("prepare_component_end");
        LIZ(jSONObject, "timing_component_init_cost", l8, l9);
        LIZ(jSONObject, "timing_component_before_jsb_cost", l8, l6);
        LIZ(jSONObject, "timing_component_after_jsb_cost", l7, l9);
        LIZ(jSONObject, "timing_template_load_cost", (Long) get("prepare_template_start"), (Long) get("prepare_template_end"));
        LIZ(jSONObject, "timing_global_props_cost", (Long) get("prepare_component_global_props_start"), (Long) get("prepare_component_global_props_end"));
        LIZ(jSONObject, "timing_init_props_cost", (Long) get("prepare_component_initial_props_start"), (Long) get("prepare_component_initial_props_end"));
        LIZ(jSONObject, "timing_render_data_cost", (Long) get("prepare_render_data_start"), (Long) get("prepare_render_data_end"));
        Long l10 = (Long) get("prepare_engine_load_end");
        LIZ(jSONObject, "timing_engine_load_cost", (Long) get("prepare_engine_load_start"), l10);
        LIZ(jSONObject, "timing_engine_js_load_cost", l10, (Long) get("prepare_engine_js_load_end"));
        Long l11 = (Long) get("prepare_card_load_start");
        LIZ(jSONObject, "timing_card_create_cost", l5, l11);
        LIZ(jSONObject, "timing_card_load_cost", l11, l10);
        LIZ(jSONObject, "timing_container_route_cost", l, l5);
        LIZ(jSONObject, "timing_container_card_cost", l5, l10);
        LIZ(jSONObject, "timing_container_total_cost", l, l10);
        LogLevel logLevel = LogLevel.INFO;
        C99777PRj c99777PRj = new C99777PRj("PerformanceTiming", logLevel, null, "timing metrics: " + jSONObject, 4);
        C99775PRh.LIZIZ.LIZ(new C99776PRi(c99777PRj, c99777PRj, null, c99777PRj.LIZIZ, 0L, 20));
        return jSONObject;
    }

    public final JSONObject LIZIZ() {
        boolean z;
        boolean z2;
        String str;
        Boolean bool;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", this.enterFrom);
        jSONObject.put("engine_type", this.engineType);
        jSONObject.put("template_res_type", this.templateResType);
        jSONObject.put("container_type", this.pageType);
        jSONObject.put("first_open", String.valueOf(isFirstOpen));
        if (this.openTs != null) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("open_ts_valid", String.valueOf(z));
        if (this.containerInitStartTs != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        jSONObject.put("container_init_ts_valid", String.valueOf(z2));
        String str2 = this.errorMsg;
        if (str2 != null) {
            jSONObject.put("error_msg", str2);
        }
        Integer num = this.errorCode;
        if (num != null) {
            jSONObject.put("error_code", String.valueOf(num.intValue()));
        }
        String str3 = this.errorReason;
        if (str3 != null) {
            jSONObject.put("error_reason", str3);
        }
        C90746Lp6<List<String>> c90746Lp6 = AbstractC90724Lok.LJJIL;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        List<String> LIZ = c90746Lp6.LIZ();
        if (LIZ != null) {
            for (String str4 : LIZ) {
                try {
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str4}, this, changeQuickRedirect, false, 6);
                    if (proxy2.isSupported) {
                        str = (String) proxy2.result;
                    } else if (C90903Lrd.LIZ("annie_setting_from_server_key", str4) && (bool = (Boolean) C90903Lrd.LIZ("annie_setting_from_server_key", str4, Boolean.class, Boolean.FALSE)) != null) {
                        str = String.valueOf(bool.booleanValue());
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        jSONObject.put(str4, str);
                    }
                    Result.m30308constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.m30308constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
        isFirstOpen = false;
        LogLevel logLevel = LogLevel.INFO;
        C99777PRj c99777PRj = new C99777PRj("PerformanceTiming", logLevel, null, "timing category: " + jSONObject, 4);
        C99775PRh.LIZIZ.LIZ(new C99776PRi(c99777PRj, c99777PRj, null, c99777PRj.LIZIZ, 0L, 20));
        return jSONObject;
    }

    private final Long LIZ(String str) {
        Long valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        Bundle bundle = this.initBundle;
        if (bundle == null || (valueOf = Long.valueOf(bundle.getLong(str))) == null || valueOf.longValue() <= 0) {
            return null;
        }
        return valueOf;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof String)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 17);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof Long)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 19);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.containsValue(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 21);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.remove(obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return obj2;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 23);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof String) || !(obj2 instanceof Long)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 15);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.remove(obj, obj2);
    }

    private final void LIZ(JSONObject jSONObject, String str, Long l, Long l2) {
        long j;
        if (PatchProxy.proxy(new Object[]{jSONObject, str, l, l2}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        if (l != null && l2 != null) {
            if (l2.longValue() - l.longValue() < 0) {
                j = -2;
            } else {
                j = l2.longValue() - l.longValue();
            }
        } else {
            j = -1;
        }
        jSONObject.put(str, j);
    }
}
