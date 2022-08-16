package com.alibaba.p052a.p061b.p065d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.b.d.a */
/* loaded from: classes13.dex */
public class C0958a {

    /* renamed from: com.alibaba.a.b.d.a$a */
    /* loaded from: classes13.dex */
    public static class C0959a {

        /* renamed from: c */
        public static C0959a f21373c = new C0959a();

        /* renamed from: a */
        public boolean f21374a;

        /* renamed from: b */
        public String f21375b;

        static {
            Covode.recordClassIndex(4269);
        }

        /* renamed from: a */
        public boolean m20144a() {
            return "E0102".equalsIgnoreCase(this.f21375b);
        }

        /* renamed from: b */
        public boolean m20143b() {
            return "E0111".equalsIgnoreCase(this.f21375b) || "E0112".equalsIgnoreCase(this.f21375b);
        }
    }

    static {
        Covode.recordClassIndex(4268);
    }

    /* renamed from: a */
    public static C0959a m20145a(String str) {
        C0959a c0959a = new C0959a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("success")) {
                String string = jSONObject.getString("success");
                if (!TextUtils.isEmpty(string) && string.equals("success")) {
                    c0959a.f21374a = true;
                }
            }
            if (jSONObject.has("ret")) {
                c0959a.f21375b = jSONObject.getString("ret");
                return c0959a;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return c0959a;
    }
}
