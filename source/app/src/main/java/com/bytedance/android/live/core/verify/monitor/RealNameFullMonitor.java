package com.bytedance.android.live.core.verify.monitor;

import android.app.Activity;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.core.verify.responbean.C4160a;
import com.bytedance.android.live.core.verify.responbean.CertificationQuery;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;
import p003X.C91219Lwj;

/* loaded from: classes8.dex */
public final class RealNameFullMonitor {
    public static ChangeQuickRedirect LIZ;
    public static final RealNameFullMonitor LIZIZ = new RealNameFullMonitor();

    public final void LIZ(String str, int i, String str2, JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, jSONObject}, this, LIZ, false, 1).isSupported && str != null) {
            jSONObject.put("status_code", String.valueOf(i));
            C91219Lwj LIZ2 = new C91219Lwj(str, LiveTracingMonitor.EventModule.REAL_NAME).LIZ(i);
            LIZ2.LIZ(jSONObject);
            if (str2 != null) {
                LIZ2.LIZ(str2);
            }
            LIZ2.LIZ().LIZ();
        }
    }

    static {
        Covode.recordClassIndex(24187);
    }

    /* loaded from: classes5.dex */
    public enum AlipayCategory {
        NORMAL("normal"),
        DOWNGRADE("downgrade");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String value;

        public static AlipayCategory valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (AlipayCategory) (proxy.isSupported ? proxy.result : Enum.valueOf(AlipayCategory.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AlipayCategory[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (AlipayCategory[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(24188);
        }

        AlipayCategory(String str) {
            this.value = str;
        }
    }

    /* loaded from: classes8.dex */
    public enum CertCategory {
        ZIYAN("ziyan"),
        ALIPAY("zhima"),
        ALIYUN("aliyun"),
        OTHER("other");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String value;

        public static CertCategory valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (CertCategory) (proxy.isSupported ? proxy.result : Enum.valueOf(CertCategory.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CertCategory[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (CertCategory[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(24189);
        }

        CertCategory(String str) {
            this.value = str;
        }
    }

    @JvmStatic
    public static final void LIZ(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, null, LIZ, true, 2).isSupported) {
            return;
        }
        LIZIZ.LIZ("ttlive_cert_minor_intercept", i, str, new JSONObject());
    }

    public final JSONObject LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, jSONObject2}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null) {
            jSONObject3.put("request", jSONObject);
        }
        if (jSONObject2 != null) {
            jSONObject3.put("response", jSONObject2);
        }
        return jSONObject3;
    }

    @JvmStatic
    public static final void LIZ(int i, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, jSONObject, jSONObject2}, null, LIZ, true, 9).isSupported) {
            return;
        }
        LIZIZ.LIZ("ttlive_cert_server_query", i, str, LIZIZ.LIZ(jSONObject, jSONObject2));
    }

    private final void LIZ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), jSONObject, jSONObject2}, this, LIZ, false, 16).isSupported) {
            return;
        }
        LIZ(str, i, (String) null, LIZ(jSONObject, jSONObject2));
    }

    @JvmStatic
    public static final void LIZ(int i, Activity activity, String str, C4160a c4160a, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), activity, str, c4160a, str2}, null, LIZ, true, 14).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PushConstants.INTENT_ACTIVITY_NAME, activity);
        jSONObject.put("enterFrom", str);
        JSONObject jSONObject2 = new JSONObject();
        if (c4160a != null) {
            jSONObject2.put("certType", c4160a.LJI);
            jSONObject2.put("message", c4160a.LIZIZ);
            jSONObject2.put("statusCode", c4160a.LIZ);
            jSONObject2.put(PushConstants.WEB_URL, c4160a.f26202LJ);
            jSONObject2.put("transactionId", c4160a.LIZJ);
            jSONObject2.put("merchantId", c4160a.LIZLLL);
            jSONObject2.put("msg", str2);
        }
        LIZIZ.LIZ("ttlive_cert_server_common_submit", i, jSONObject, jSONObject2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void LIZ(String str, boolean z, boolean z2, int i, String str2, int i2, C4160a c4160a) {
        Integer num;
        String str3;
        int i3 = i;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i3), str2, Integer.valueOf(i2), c4160a}, null, LIZ, true, 5).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enterFrom", str);
        jSONObject.put("alipayType", i2);
        if (c4160a != null) {
            num = Integer.valueOf(c4160a.LJI);
        } else {
            num = null;
        }
        jSONObject.put("certType", num);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("statusCode", i3);
        jSONObject2.put("msg", str2);
        if (z) {
            i3 = 0;
        }
        if (i2 != 0) {
            if (i2 == 3 && !PatchProxy.proxy(new Object[]{Integer.valueOf(i3), jSONObject, jSONObject2}, null, LIZ, true, 7).isSupported) {
                LIZIZ.LIZ("ttlive_cert_aliyun_face", i3, jSONObject, jSONObject2);
            }
        } else if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i3), Byte.valueOf((byte) z2), jSONObject, jSONObject2}, null, LIZ, true, 6).isSupported) {
            JSONObject LIZ2 = LIZIZ.LIZ(jSONObject, jSONObject2);
            RealNameFullMonitor realNameFullMonitor = LIZIZ;
            if (z2 != 0) {
                str3 = AlipayCategory.DOWNGRADE.value;
            } else {
                str3 = AlipayCategory.NORMAL.value;
            }
            realNameFullMonitor.LIZ("ttlive_cert_alipay_sdk_app", i3, str3, LIZ2);
        }
    }

    @JvmStatic
    public static final void LIZ(boolean z, int i, int i2, boolean z2, Activity activity, CertificationQuery certificationQuery, String str) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), activity, certificationQuery, str}, null, LIZ, true, 12).isSupported) {
            return;
        }
        if (i2 != 3) {
            str2 = CertCategory.OTHER.value;
        } else {
            str2 = CertCategory.ALIYUN.value;
        }
        JSONObject jSONObject = new JSONObject();
        if (activity != null) {
            str3 = activity.toString();
        } else {
            str3 = null;
        }
        jSONObject.put(PushConstants.INTENT_ACTIVITY_NAME, str3);
        jSONObject.put("isSkipRecordVerify", z2);
        JSONObject jSONObject2 = new JSONObject();
        if (certificationQuery != null) {
            jSONObject2.put("result", certificationQuery.toString());
            jSONObject2.put("msg", str);
        }
        if (z) {
            LIZ(i, str2, jSONObject, jSONObject2);
        } else if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), jSONObject, jSONObject2}, null, LIZ, true, 10).isSupported) {
            LIZIZ.LIZ("ttlive_cert_server_common_query", i, jSONObject, jSONObject2);
        }
    }
}
