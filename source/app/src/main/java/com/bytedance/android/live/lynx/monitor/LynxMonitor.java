package com.bytedance.android.live.lynx.monitor;

import android.view.Display;
import android.view.WindowManager;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxView;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC101336PvW;
import p003X.AbstractC90724Lok;
import p003X.C101330PvQ;
import p003X.C106862S5w;
import p003X.C90746Lp6;
import p003X.C91211Lwb;
import p003X.KT9;

/* loaded from: classes8.dex */
public final class LynxMonitor {
    public static ChangeQuickRedirect LIZ;
    public static boolean LIZIZ;
    public static final LynxMonitor LIZJ = new LynxMonitor();

    /* loaded from: classes7.dex */
    public enum VerifyTemplateType {
        EMPTY_FILE("Empty file"),
        BROKEN_FILE("Broken file"),
        VERIFY_SUCCEED("Verify succeed");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String TYPE;

        public static VerifyTemplateType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (VerifyTemplateType) (proxy.isSupported ? proxy.result : Enum.valueOf(VerifyTemplateType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static VerifyTemplateType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (VerifyTemplateType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(32239);
        }

        VerifyTemplateType(String str) {
            this.TYPE = str;
        }
    }

    static {
        Covode.recordClassIndex(32237);
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJIJ;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        Boolean LIZ2 = c90746Lp6.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZIZ = LIZ2.booleanValue();
    }

    /* loaded from: classes8.dex */
    public enum FallbackType {
        INIT_FAILED("LynxInitFailed"),
        LOAD_FAILED("OnLoadFailed"),
        MISS_GECKO("MissGecko"),
        UNKNOWN("UNKNOWN"),
        PLUGIN_NOT_INSTALLED("PLUGIN_NOT_INSTALLED");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String type;

        public static FallbackType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (FallbackType) (proxy.isSupported ? proxy.result : Enum.valueOf(FallbackType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static FallbackType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (FallbackType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(32238);
        }

        FallbackType(String str) {
            this.type = str;
        }
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", "88888");
        if (LIZIZ) {
            C101330PvQ.LIZIZ.LIZ().LIZ((LynxView) null, "inject_data_to_props", str, jSONObject, (JSONObject) null, (JSONObject) null, jSONObject2, 0);
        } else {
            C101330PvQ.LIZIZ.LIZ().LIZ((LynxView) null, "inject_data_to_props", str, jSONObject, (JSONObject) null, (JSONObject) null, jSONObject2, false);
        }
    }

    public final void LIZ(int i, long j, Map<String, Object> map) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j), map}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        LynxEnv inst = LynxEnv.inst();
        Intrinsics.checkNotNullExpressionValue(inst, "");
        map.put("lynx_version", inst.getLynxVersion());
        C91211Lwb.LIZ(KT9.LIZ("ttlive_lynx_page_load"), i, j, map);
    }

    private void LIZ(FallbackType fallbackType, String str, String str2, int i) {
        if (PatchProxy.proxy(new Object[]{fallbackType, str, str2, Integer.valueOf(i)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(fallbackType, str, str2);
        C91211Lwb.LIZ("ttlive_lynx_fallback", 1, MapsKt__MapsKt.mapOf(TuplesKt.m137to("type", fallbackType.type), TuplesKt.m137to(PushMessageHelper.ERROR_MESSAGE, str), TuplesKt.m137to("error_code", Integer.valueOf(i)), TuplesKt.m137to("path", str2)));
    }

    public final void LIZ(FallbackType fallbackType, String str, String str2, int i, String str3) {
        String str4 = str2;
        if (PatchProxy.proxy(new Object[]{fallbackType, str, str4, Integer.valueOf(i), str3}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(fallbackType, str, str4);
        LIZ(fallbackType, str, str4, i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", str4);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("err_msg", str);
        jSONObject2.put(C2521l.LJIIJ, i);
        jSONObject2.put("type", fallbackType.type);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("virtual_aid", "88888");
        if (LIZIZ) {
            AbstractC101336PvW LIZ2 = C101330PvQ.LIZIZ.LIZ();
            if (str3 != null) {
                str4 = str3;
            }
            LIZ2.LIZ((LynxView) null, "lynx_fallback", str4, jSONObject2, (JSONObject) null, jSONObject, jSONObject3, 0);
            return;
        }
        AbstractC101336PvW LIZ3 = C101330PvQ.LIZIZ.LIZ();
        if (str3 != null) {
            str4 = str3;
        }
        LIZ3.LIZ((LynxView) null, "lynx_fallback", str4, jSONObject2, (JSONObject) null, jSONObject, jSONObject3, false);
    }

    public final void LIZ(LynxView lynxView, String str, String str2, double d, boolean z) {
        if (PatchProxy.proxy(new Object[]{lynxView, str, str2, Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView, str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fps", d);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tag", str2);
        jSONObject2.put("annie", "0");
        Object systemService = lynxView.getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "");
            jSONObject2.put("refresh_rate", String.valueOf((int) defaultDisplay.getRefreshRate()));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("virtual_aid", "88888");
            if (LIZIZ) {
                if (z) {
                    C101330PvQ.LIZIZ.LIZ().LIZ(lynxView, "lynx_list_fps", str, jSONObject2, jSONObject, (JSONObject) null, jSONObject3, 2);
                    return;
                } else {
                    C101330PvQ.LIZIZ.LIZ().LIZ(lynxView, "lynx_list_fps", str, jSONObject2, jSONObject, (JSONObject) null, jSONObject3, 0);
                    return;
                }
            }
            C101330PvQ.LIZIZ.LIZ().LIZ(lynxView, "lynx_list_fps", str, jSONObject2, jSONObject, (JSONObject) null, jSONObject3, z);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public static /* synthetic */ void LIZ(LynxMonitor lynxMonitor, FallbackType fallbackType, String str, String str2, int i, String str3, int i2, Object obj) {
        String str4 = str;
        int i3 = i;
        if (PatchProxy.proxy(new Object[]{lynxMonitor, fallbackType, str4, str2, Integer.valueOf(i3), null, Integer.valueOf(i2), null}, null, LIZ, true, 13).isSupported) {
            return;
        }
        String str5 = "";
        if ((i2 & 2) != 0) {
            str4 = str5;
        }
        if ((i2 & 4) == 0) {
            str5 = str2;
        }
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        lynxMonitor.LIZ(fallbackType, str4, str5, i3, (String) null);
    }
}
