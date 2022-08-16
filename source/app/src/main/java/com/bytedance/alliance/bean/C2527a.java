package com.bytedance.alliance.bean;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.net.URISyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.alliance.bean.a */
/* loaded from: classes2.dex */
public final class C2527a {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public String LIZJ;
    public Intent LIZLLL;

    /* renamed from: LJ */
    public String f25592LJ;
    public int LJFF;
    public JSONObject LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;

    static {
        Covode.recordClassIndex(9924);
    }

    public final boolean LIZIZ() {
        if (this.LIZLLL != null) {
            return true;
        }
        return false;
    }

    public final JSONObject LIZ() {
        Intent intent;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.LIZJ) && (intent = this.LIZLLL) != null) {
            this.LIZJ = intent.toUri(0);
        }
        try {
            jSONObject.put("pkg_name", this.LIZIZ);
            jSONObject.put("uri", this.LIZJ);
            jSONObject.put("partner_name", this.f25592LJ);
            jSONObject.put("strategy", this.LJFF);
            jSONObject.put("extraJson", this.LJI);
            jSONObject.put("is_installed_sdk", this.LJII);
            jSONObject.put("type", this.LJIIJ);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.LIZIZ, ((C2527a) obj).LIZIZ);
    }

    public C2527a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZIZ = jSONObject.optString("pkg_name");
            this.LIZJ = jSONObject.optString("uri");
            if (!TextUtils.isEmpty(this.LIZJ)) {
                this.LIZLLL = Intent.parseUri(this.LIZJ, 0);
                ComponentName component = this.LIZLLL.getComponent();
                if (component != null) {
                    this.LJIIIIZZ = component.getClassName();
                }
            }
            this.f25592LJ = jSONObject.optString("partner_name");
            this.LJFF = jSONObject.optInt("strategy");
            this.LJI = jSONObject.optJSONObject("extraJson");
            this.LJII = jSONObject.optBoolean("is_installed_sdk");
            this.LJIIJ = jSONObject.optString("type");
        } catch (Throwable unused) {
        }
    }

    public C2527a(String str, String str2, String str3, int i, JSONObject jSONObject, boolean z, String str4) {
        this.LIZJ = str2;
        this.LIZIZ = str;
        try {
            this.LIZLLL = Intent.parseUri(this.LIZJ, 0);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        this.f25592LJ = str3;
        this.LJFF = i;
        this.LJI = jSONObject;
        this.LJII = z;
        this.LJIIJ = str4;
    }
}
