package com.alibaba.wireless.security.framework;

import com.alibaba.wireless.security.framework.utils.C1128b;
import com.bytedance.covode.number.Covode;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.alibaba.wireless.security.framework.b */
/* loaded from: classes2.dex */
public class C1121b {

    /* renamed from: b */
    public static String f21746b = "version";

    /* renamed from: c */
    public static String f21747c = "lib_dep_version";

    /* renamed from: d */
    public static String f21748d = "lib_dep_arch";

    /* renamed from: e */
    public static String f21749e = "target_plugin";

    /* renamed from: a */
    public JSONObject f21750a;

    /* renamed from: g */
    public int f21752g;

    /* renamed from: f */
    public boolean f21751f = true;

    /* renamed from: h */
    public boolean f21753h = true;

    /* renamed from: i */
    public String f21754i = "";

    /* renamed from: j */
    public boolean f21755j = true;

    /* renamed from: k */
    public String f21756k = "";

    static {
        Covode.recordClassIndex(4544);
    }

    public C1121b(JSONObject jSONObject) {
        this.f21750a = jSONObject;
    }

    /* renamed from: a */
    public static C1121b m19763a(File file) {
        if (file != null && file.exists()) {
            try {
                String m19712a = C1128b.m19712a(file);
                if (m19712a != null && m19712a.length() > 0) {
                    JSONObject jSONObject = new JSONObject(m19712a);
                    if ("1.0".equals(jSONObject.getString(f21746b))) {
                        return new C1121b(jSONObject);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m19762a(String str) {
        try {
            return m19764a().getString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public JSONObject m19764a() {
        return this.f21750a;
    }

    /* renamed from: b */
    public int m19761b() {
        int i;
        if (this.f21751f) {
            try {
                i = Integer.parseInt(m19764a().getString(f21747c));
            } catch (Exception unused) {
                i = 0;
            }
            this.f21752g = i;
            this.f21751f = false;
        }
        return this.f21752g;
    }

    /* renamed from: c */
    public String m19760c() {
        String str;
        if (this.f21753h) {
            try {
                str = m19764a().getString(f21748d);
            } catch (Exception unused) {
                str = "";
            }
            this.f21754i = str;
            this.f21753h = false;
        }
        return this.f21754i;
    }

    /* renamed from: d */
    public String m19759d() {
        String str;
        if (this.f21755j) {
            try {
                str = m19764a().getString(f21749e);
            } catch (Exception unused) {
                str = "";
            }
            this.f21756k = str;
            this.f21755j = false;
        }
        return this.f21756k;
    }
}
