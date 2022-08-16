package com.alibaba.sdk.android.httpdns;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.alibaba.sdk.android.httpdns.o */
/* loaded from: classes18.dex */
public class C1088o {

    /* renamed from: d */
    public String[] f21648d;
    public boolean enabled;

    static {
        Covode.recordClassIndex(4495);
    }

    public C1088o(String str) {
        boolean z = true;
        this.enabled = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1074i.m19882d(C0002O.m25086C("StartIp Schedule center response:", jSONObject.toString()));
            if (jSONObject.has("service_status")) {
                this.enabled = jSONObject.getString("service_status").equals("disable") ? false : z;
            }
            if (!jSONObject.has("service_ip")) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("service_ip");
            this.f21648d = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f21648d[i] = (String) jSONArray.get(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public String[] m19850b() {
        return this.f21648d;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
