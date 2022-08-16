package com.bytedance.android.live.core.activity;

import android.text.TextUtils;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C435143Jk;
import p003X.C4574547f;
import p003X.C90744Lp4;
import p003X.C91219Lwj;

/* loaded from: classes12.dex */
public final class BannerFullMonitor {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23270);
    }

    /* loaded from: classes12.dex */
    public enum BannerType {
        TOP_RIGHT("top_right"),
        BOTTOM_RIGHT("bottom_right"),
        OTHER("other");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String type;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BannerType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (BannerType[]) proxy.result;
            }
            return (BannerType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(23271);
        }

        public static BannerType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (BannerType) proxy.result;
            }
            return (BannerType) Enum.valueOf(BannerType.class, str);
        }

        BannerType(String str) {
            this.type = str;
        }
    }

    public static void LIZ(int i, String str, String str2, BannerType bannerType, String str3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, bannerType, str3}, null, LIZ, true, 2).isSupported) {
            return;
        }
        LIZ("ttlive_in_room_banner_fetch_result", i, str2, null, str, bannerType, str3);
    }

    public static void LIZIZ(int i, String str, String str2, BannerType bannerType, String str3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, bannerType, str3}, null, LIZ, true, 3).isSupported) {
            return;
        }
        LIZ("ttlive_activity_banner_on_load_start", i, str, str2, null, bannerType, str3);
    }

    public static void LIZJ(int i, String str, String str2, BannerType bannerType, String str3) {
        if (PatchProxy.proxy(new Object[]{0, str, str2, bannerType, str3}, null, LIZ, true, 5).isSupported) {
            return;
        }
        LIZ("ttlive_activity_banner_on_load_finish", 0, str, str2, null, bannerType, str3);
    }

    public static void LIZLLL(int i, String str, String str2, BannerType bannerType, String str3) {
        if (PatchProxy.proxy(new Object[]{0, str, str2, bannerType, str3}, null, LIZ, true, 6).isSupported) {
            return;
        }
        LIZ("ttlive_activity_banner_on_click", 0, str, str2, null, bannerType, str3);
    }

    /* renamed from: LJ */
    public static void m15802LJ(int i, String str, String str2, BannerType bannerType, String str3) {
        if (PatchProxy.proxy(new Object[]{0, str, str2, bannerType, str3}, null, LIZ, true, 7).isSupported) {
            return;
        }
        LIZ("ttlive_activity_banner_manual_reload", 0, str, str2, null, bannerType, str3);
    }

    public static void LIZ(int i, String str, String str2, String str3, BannerType bannerType, String str4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, str3, bannerType, str4}, null, LIZ, true, 4).isSupported) {
            return;
        }
        LIZ("ttlive_activity_banner_on_load_error", i, str, str2, str3, bannerType, str4);
    }

    public static void LIZ(String str, int i, String str2, String str3, String str4, BannerType bannerType, String str5) {
        String str6;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, str3, str4, bannerType, str5}, null, LIZ, true, 1).isSupported || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (str2 != null) {
                jSONObject.put("room_id", str2);
            }
            if (str3 != null) {
                jSONObject.put(PushConstants.WEB_URL, str3);
            }
            if (str4 != null) {
                jSONObject.put("status_msg", str4);
            }
            C91219Lwj LIZ2 = new C91219Lwj(str, LiveTracingMonitor.EventModule.ACTIVITY).LIZ(i);
            LIZ2.LIZ(jSONObject);
            C91219Lwj LIZ3 = LIZ2.LIZ(bannerType.type);
            LIZ3.m23359LJ(C90744Lp4.LIZ);
            LIZ3.LIZ().LIZ();
            AbstractC8644i LIZ4 = C4574547f.LIZ().LIZ(C8668v.class);
            if (LIZ4 == null || LIZ4.LIZ() == null || !LIZ4.LIZ().containsKey("enter_from_merge")) {
                str6 = "";
            } else {
                str6 = LIZ4.LIZ().get("enter_from_merge");
            }
            if (!C435143Jk.LIZ(str6)) {
                str6 = "";
            }
            ActivityMonitor.LIZ(str, i, jSONObject, bannerType.type, str6, null, str5);
        } catch (JSONException e) {
            ALogger.m15798e("BannerFullMonitor", e);
        }
    }
}
