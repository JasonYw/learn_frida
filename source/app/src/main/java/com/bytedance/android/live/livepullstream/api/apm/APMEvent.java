package com.bytedance.android.live.livepullstream.api.apm;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes20.dex */
public final class APMEvent {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("level")
    public Level LIZIZ;
    @SerializedName("key")
    public String LIZJ;
    @SerializedName("message")
    public String LIZLLL;
    @SerializedName("timestamp")

    /* renamed from: LJ */
    public long f26513LJ;

    static {
        Covode.recordClassIndex(32113);
    }

    /* loaded from: classes20.dex */
    public enum Level {
        I,
        E;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Level[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Level[]) proxy.result;
            }
            return (Level[]) values().clone();
        }

        static {
            Covode.recordClassIndex(32114);
        }

        public static Level valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Level) proxy.result;
            }
            return (Level) Enum.valueOf(Level.class, str);
        }
    }

    public final JSONObject LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", this.LIZIZ);
            jSONObject.put("key", this.LIZJ);
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                jSONObject.put("message", this.LIZLLL);
            }
            jSONObject.put("timestamp", this.f26513LJ);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
