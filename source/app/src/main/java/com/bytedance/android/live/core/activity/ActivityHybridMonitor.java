package com.bytedance.android.live.core.activity;

import android.os.Build;
import android.webkit.WebResourceError;
import com.bytedance.android.live.core.activity.ActivityMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ActivityHybridMonitor {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23266);
    }

    /* loaded from: classes8.dex */
    public enum ContainerType {
        WEB("web"),
        LYNX("lynx"),
        OTHER("other");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String type;

        public static ContainerType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ContainerType) (proxy.isSupported ? proxy.result : Enum.valueOf(ContainerType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ContainerType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ContainerType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(23267);
        }

        ContainerType(String str) {
            this.type = str;
        }
    }

    @JvmStatic
    public static final void LIZ(String str, String str2, String str3, ContainerType containerType) {
        String str4 = null;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, containerType}, null, LIZ, true, 3).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PushConstants.WEB_URL, str);
        jSONObject.put("room_id", str2);
        jSONObject.put("msg", str3);
        int i = ActivityMonitor.ActivityStatusCode.SUCCESS.code;
        if (containerType != null) {
            str4 = containerType.type;
        }
        ActivityMonitor.LIZ("ttlive_hybrid_on_load_finish", i, jSONObject, str4, null, null, 48, null);
    }

    @JvmStatic
    public static final void LIZ(String str, String str2, String str3, long j, ContainerType containerType) {
        String str4 = null;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, new Long(j), containerType}, null, LIZ, true, 4).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PushConstants.WEB_URL, str);
        jSONObject.put("room_id", str2);
        jSONObject.put("msg", str3);
        JSONObject jSONObject2 = new JSONObject();
        if (j > 0) {
            jSONObject2.put("time", j);
        }
        int i = ActivityMonitor.ActivityStatusCode.SUCCESS.code;
        if (containerType != null) {
            str4 = containerType.type;
        }
        ActivityMonitor.LIZ("ttlive_activity_hybrid_load_time", i, jSONObject, str4, jSONObject2, null, 32, null);
    }

    @JvmStatic
    public static final void LIZ(String str, String str2, String str3, ContainerType containerType, WebResourceError webResourceError) {
        Integer num;
        CharSequence charSequence;
        String str4 = null;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, containerType, webResourceError}, null, LIZ, true, 2).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PushConstants.WEB_URL, str);
        jSONObject.put("room_id", str2);
        jSONObject.put("msg", str3);
        if (Build.VERSION.SDK_INT >= 23) {
            if (webResourceError != null) {
                num = Integer.valueOf(webResourceError.getErrorCode());
            } else {
                num = null;
            }
            jSONObject.put("errorCode", num);
            if (webResourceError != null) {
                charSequence = webResourceError.getDescription();
            } else {
                charSequence = null;
            }
            jSONObject.put("des", charSequence);
        }
        int i = ActivityMonitor.ActivityStatusCode.SUCCESS.code;
        if (containerType != null) {
            str4 = containerType.type;
        }
        ActivityMonitor.LIZ("ttlive_hybrid_on_load_error", i, jSONObject, str4, null, null, 48, null);
    }
}
