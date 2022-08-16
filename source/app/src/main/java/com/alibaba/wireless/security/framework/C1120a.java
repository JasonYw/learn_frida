package com.alibaba.wireless.security.framework;

import android.content.pm.PackageInfo;
import com.alibaba.wireless.security.framework.utils.C1128b;
import com.bytedance.covode.number.Covode;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.alibaba.wireless.security.framework.a */
/* loaded from: classes2.dex */
public class C1120a {

    /* renamed from: a */
    public PackageInfo f21743a;

    /* renamed from: b */
    public JSONObject f21744b;

    /* renamed from: c */
    public String f21745c;

    static {
        Covode.recordClassIndex(4543);
    }

    public C1120a(String str) {
        this.f21745c = str;
    }

    /* renamed from: a */
    public String m19766a(String str) {
        try {
            return m19765b().getString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public boolean m19768a() {
        try {
            return new File(this.f21745c).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[ORIG_RETURN, RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m19767a(android.content.pm.PackageInfo r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r1 = "thirdpartyso"
            java.lang.String r2 = "reversedependencies"
            java.lang.String r5 = "weakdependencies"
            java.lang.String r6 = "dependencies"
            java.lang.String r7 = "pluginclass"
            java.lang.String r8 = "pluginname"
            java.lang.String r9 = "hasso"
            r3 = 0
            if (r12 == 0) goto L94
            if (r13 == 0) goto L94
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r10 = "version"
            java.lang.String r0 = r12.versionName     // Catch: java.lang.Exception -> L93
            r4.put(r10, r0)     // Catch: java.lang.Exception -> L93
            android.content.pm.ApplicationInfo r0 = r12.applicationInfo     // Catch: java.lang.Exception -> L93
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L93
            boolean r0 = r0.getBoolean(r9, r3)     // Catch: java.lang.Exception -> L93
            r4.put(r9, r0)     // Catch: java.lang.Exception -> L93
            android.content.pm.ApplicationInfo r0 = r12.applicationInfo     // Catch: java.lang.Exception -> L93
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = r0.getString(r8)     // Catch: java.lang.Exception -> L93
            r4.put(r8, r0)     // Catch: java.lang.Exception -> L93
            android.content.pm.ApplicationInfo r0 = r12.applicationInfo     // Catch: java.lang.Exception -> L93
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = r0.getString(r7)     // Catch: java.lang.Exception -> L93
            r4.put(r7, r0)     // Catch: java.lang.Exception -> L93
            android.content.pm.ApplicationInfo r0 = r12.applicationInfo     // Catch: java.lang.Exception -> L93
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = r0.getString(r6)     // Catch: java.lang.Exception -> L93
            r4.put(r6, r0)     // Catch: java.lang.Exception -> L93
            android.content.pm.ApplicationInfo r0 = r12.applicationInfo     // Catch: java.lang.Exception -> L93
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = r0.getString(r5)     // Catch: java.lang.Exception -> L93
            r4.put(r5, r0)     // Catch: java.lang.Exception -> L93
            android.content.pm.ApplicationInfo r0 = r12.applicationInfo     // Catch: java.lang.Exception -> L93
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Exception -> L93
            r4.put(r2, r0)     // Catch: java.lang.Exception -> L93
            android.content.pm.ApplicationInfo r0 = r12.applicationInfo     // Catch: java.lang.Exception -> L93
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L93
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.Exception -> L93
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L93
            r2 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = r11.f21745c     // Catch: java.lang.Exception -> L7e
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7e
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L7f
            if (r0 != 0) goto L88
            r1.createNewFile()     // Catch: java.lang.Exception -> L7f
            goto L88
        L7e:
            r1 = r2
        L7f:
            boolean r0 = r1.exists()
            if (r0 != 0) goto L88
            r1.createNewFile()     // Catch: java.lang.Exception -> L88
        L88:
            java.lang.String r0 = r4.toString()
            boolean r0 = com.alibaba.wireless.security.framework.utils.C1128b.m19711a(r1, r0)
            if (r0 != 0) goto L93
            return r3
        L93:
            r3 = 1
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.C1120a.m19767a(android.content.pm.PackageInfo, java.lang.String):boolean");
    }

    /* renamed from: b */
    public JSONObject m19765b() {
        JSONObject jSONObject = this.f21744b;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = null;
        try {
            String m19712a = C1128b.m19712a(new File(this.f21745c));
            if (m19712a != null && m19712a.length() > 0) {
                jSONObject2 = new JSONObject(m19712a);
            }
        } catch (Exception unused) {
        }
        this.f21744b = jSONObject2;
        return jSONObject2;
    }
}
