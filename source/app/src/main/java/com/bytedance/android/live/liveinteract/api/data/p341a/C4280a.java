package com.bytedance.android.live.liveinteract.api.data.p341a;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.liveinteract.api.data.a.a */
/* loaded from: classes3.dex */
public class C4280a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("link_id")
    public String LIZIZ;
    @SerializedName("sing_mode")
    public int LIZJ;
    @SerializedName("song_type")
    public int LIZLLL;
    @SerializedName("camera_open")

    /* renamed from: LJ */
    public int f26253LJ;
    @SerializedName("timestamp")
    public long LJFF;
    @SerializedName("mode")
    public int LJI;

    static {
        Covode.recordClassIndex(25154);
    }

    public final boolean LIZLLL() {
        if (this.LIZJ == 1) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LIZLLL == 2) {
            return true;
        }
        return false;
    }

    public final int LIZJ() {
        if (this.LIZLLL == 0) {
            return this.LJI;
        }
        return this.LIZJ;
    }

    /* renamed from: LJ */
    public final boolean m15777LJ() {
        if (this.LIZJ == 2) {
            return true;
        }
        return false;
    }

    public final boolean LIZ() {
        if (this.LIZLLL == 0) {
            int i = this.LJI;
            if (i != 1 && i != 2) {
                return false;
            }
            return true;
        }
        int i2 = this.LIZJ;
        if (i2 != 1 && i2 != 2) {
            return false;
        }
        return true;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "VideoStateSei{linkId='" + this.LIZIZ + "', singMode=" + this.LIZJ + ", mode=" + this.LJI + ", cameraOpen=" + this.f26253LJ + ", timestamp=" + this.LJFF + '}';
    }

    public static C4280a LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (C4280a) proxy.result;
        }
        C4280a c4280a = new C4280a();
        JSONObject optJSONObject = new JSONObject(str).optJSONObject("interact_video_sei");
        c4280a.LIZIZ = optJSONObject.optString("link_id");
        c4280a.LJFF = optJSONObject.optLong("timestamp");
        c4280a.LIZJ = optJSONObject.optInt("sing_mode");
        c4280a.LJI = optJSONObject.optInt("mode");
        c4280a.LIZLLL = optJSONObject.optInt("song_type");
        if (optJSONObject.get("camera_open") instanceof Boolean) {
            c4280a.f26253LJ = optJSONObject.optBoolean("camera_open") ? 1 : 0;
            return c4280a;
        }
        c4280a.f26253LJ = optJSONObject.optInt("camera_open");
        return c4280a;
    }

    public static JSONObject LIZ(String str, int i, int i2, long j, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), Integer.valueOf(i3)}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("link_id", str);
        if (i3 == 2) {
            jSONObject.put("mode", 1);
        } else {
            jSONObject.put("mode", i);
        }
        jSONObject.put("sing_mode", i);
        jSONObject.put("camera_open", i2);
        jSONObject.put("timestamp", j);
        jSONObject.put("song_type", i3);
        return jSONObject;
    }
}
