package com.bytedance.android.live.broadcast.monitor;

import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.livesdk.log.alog.TTLiveALogTag;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C440943cO;
import p003X.C4CT;
import p003X.C88360Kri;
import p003X.C91211Lwb;

/* loaded from: classes5.dex */
public final class BroadcastCreateRoomApiMonitor extends C440943cO {
    public static ChangeQuickRedirect LIZ;
    public static long LIZJ;

    static {
        Covode.recordClassIndex(17005);
    }

    /* loaded from: classes5.dex */
    public enum Domain {
        API("api"),
        LIVE_SDK("livesdk"),
        AGORA("agora");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Domain[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Domain[]) proxy.result;
            }
            return (Domain[]) values().clone();
        }

        static {
            Covode.recordClassIndex(17006);
        }

        public static Domain valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Domain) proxy.result;
            }
            return (Domain) Enum.valueOf(Domain.class, str);
        }

        Domain(String str) {
            this.value = str;
        }
    }

    public static void LIZ() {
        if (PatchProxy.proxy(new Object[0], null, LIZ, true, 1).isSupported) {
            return;
        }
        LIZJ = System.currentTimeMillis();
    }

    public static long LIZIZ() {
        long j;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (LIZJ > 0) {
            j = System.currentTimeMillis() - LIZJ;
        } else {
            j = 0;
        }
        LIZJ = 0L;
        return j;
    }

    public static void LIZ(Exception exc, boolean z) {
        if (PatchProxy.proxy(new Object[]{exc, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, LIZ, true, 3).isSupported) {
            return;
        }
        LIZIZ();
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            LIZ(Domain.API.value, apiServerException.mErrorCode, apiServerException.mErrorMsg, z);
            return;
        }
        LIZ(Domain.API.value, -1, exc.toString(), z);
    }

    public static void LIZ(int i, String str, boolean z) {
        String str2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, LIZ, true, 7).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "error_code", i);
        C440943cO.LIZ(jSONObject, "error_msg", str);
        if (z) {
            str2 = "audio";
        } else {
            str2 = "video";
        }
        C440943cO.LIZ(jSONObject, "media_type", str2);
        C91211Lwb.LIZIZ("ttlive_create_room_all", 1, jSONObject);
        C91211Lwb.LIZ("ttlive_create_room_error", 1, jSONObject);
        C88360Kri.LIZ().LIZ(TTLiveALogTag.Room.info, "ttlive_create_room", 1, jSONObject);
    }

    public static void LIZ(String str, int i, String str2, boolean z) {
        String str3;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, LIZ, true, 6).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorDomain", str);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorDesc", str2);
            if (z) {
                str3 = "audio";
            } else {
                str3 = "video";
            }
            jSONObject.put("mediaType", str3);
            C4CT c4ct = new C4CT();
            c4ct.LIZ(jSONObject);
            c4ct.LIZ("hotsoon_live_start_live_failure_rate", 1);
            LIZ(i, str2, z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
