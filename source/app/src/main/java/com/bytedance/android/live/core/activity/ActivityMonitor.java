package com.bytedance.android.live.core.activity;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;
import p003X.AbstractC4578648u;
import p003X.C106862S5w;
import p003X.C90744Lp4;
import p003X.C91219Lwj;
import p003X.C91222Lwm;

/* loaded from: classes12.dex */
public final class ActivityMonitor {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23268);
    }

    /* loaded from: classes5.dex */
    public enum ActivityStatusCode {
        SUCCESS(1),
        UNKNOWN_CODE(-1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int code;

        public static ActivityStatusCode valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ActivityStatusCode) (proxy.isSupported ? proxy.result : Enum.valueOf(ActivityStatusCode.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ActivityStatusCode[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ActivityStatusCode[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(23269);
        }

        ActivityStatusCode(int i) {
            this.code = i;
        }
    }

    @JvmStatic
    public static final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2 = null;
        if (PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2, jSONObject3}, null, LIZ, true, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (C90744Lp4.LIZ) {
            AbstractC4578648u LIZJ = C91222Lwm.LIZJ();
            if (LIZJ != null) {
                LIZJ.LIZ(str, LiveTracingMonitor.EventModule.ACTIVITY.name(), LiveTracingMonitor.EventType.BUSSINESS_API_CALL.name(), jSONObject, jSONObject2, jSONObject3);
            } else {
                LiveTracingMonitor.LIZ(str, LiveTracingMonitor.EventModule.ACTIVITY, LiveTracingMonitor.EventType.BUSSINESS_API_CALL, jSONObject, jSONObject2, jSONObject3);
            }
        } else {
            LiveTracingMonitor.LIZ(str, LiveTracingMonitor.EventModule.ACTIVITY, LiveTracingMonitor.EventType.BUSSINESS_API_CALL, jSONObject, jSONObject2, jSONObject3);
        }
        String str3 = "ActivityMonitor_" + str;
        StringBuilder sb = new StringBuilder("Activity->");
        sb.append(jSONObject);
        sb.append(":  serviceName= ");
        sb.append(str);
        sb.append(',');
        sb.append("extraLog= ");
        if (jSONObject3 != null) {
            str2 = jSONObject3.toString();
        }
        sb.append(str2);
        ALogger.m15797i(str3, sb.toString());
    }

    @JvmStatic
    public static void LIZ(String str, int i, JSONObject jSONObject, String str2, JSONObject jSONObject2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), jSONObject, str2, jSONObject2, str3}, null, LIZ, true, 1).isSupported) {
            return;
        }
        LIZ(str, i, jSONObject, str2, "", jSONObject2, str3);
    }

    @JvmStatic
    public static final void LIZ(String str, int i, JSONObject jSONObject, String str2, String str3, JSONObject jSONObject2, String str4) {
        String str5 = null;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), jSONObject, str2, str3, jSONObject2, str4}, null, LIZ, true, 3).isSupported) {
            return;
        }
        C91219Lwj LIZ2 = new C91219Lwj(str, LiveTracingMonitor.EventModule.ACTIVITY).LIZ(i);
        LIZ2.LIZ(jSONObject);
        C91219Lwj LIZIZ = LIZ2.LIZJ(jSONObject2).LIZ(str2).LIZIZ(str3);
        LIZIZ.m23359LJ(C90744Lp4.LIZ);
        LIZIZ.LIZ().LIZ();
        String str6 = "ActivityMonitor_" + str2;
        StringBuilder sb = new StringBuilder("Activity->");
        sb.append(str2);
        sb.append(":  serviceName= ");
        sb.append(str);
        sb.append(", statusCode= ");
        sb.append(i);
        sb.append(", extraLog= ");
        if (jSONObject != null) {
            str5 = jSONObject.toString();
        }
        sb.append(str5);
        sb.append(", categoryPrimary= ");
        sb.append(str2);
        sb.append(", alogJson = ");
        sb.append(str4);
        ALogger.m15797i(str6, sb.toString());
    }

    public static /* synthetic */ void LIZ(String str, int i, JSONObject jSONObject, String str2, JSONObject jSONObject2, String str3, int i2, Object obj) {
        String str4 = str3;
        JSONObject jSONObject3 = null;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), jSONObject, str2, jSONObject2, str4, Integer.valueOf(i2), null}, null, LIZ, true, 2).isSupported) {
            return;
        }
        if ((i2 & 16) == 0) {
            jSONObject3 = jSONObject2;
        }
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        LIZ(str, i, jSONObject, str2, jSONObject3, str4);
    }

    public static /* synthetic */ void LIZ(String str, int i, JSONObject jSONObject, String str2, String str3, JSONObject jSONObject2, String str4, int i2, Object obj) {
        String str5 = str3;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), jSONObject, str2, str5, null, str4, Integer.valueOf(i2), null}, null, LIZ, true, 4).isSupported) {
            return;
        }
        String str6 = "";
        if ((i2 & 16) != 0) {
            str5 = str6;
        }
        if ((i2 & 64) == 0) {
            str6 = str4;
        }
        LIZ(str, i, jSONObject, str2, str5, null, str6);
    }
}
