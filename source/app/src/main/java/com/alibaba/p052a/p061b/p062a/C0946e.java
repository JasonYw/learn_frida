package com.alibaba.p052a.p061b.p062a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.b.a.e */
/* loaded from: classes13.dex */
public class C0946e {
    static {
        Covode.recordClassIndex(4256);
    }

    /* renamed from: a */
    public static int m20204a() {
        JSONObject jSONObject;
        String m20213f = C0942a.m20213f();
        if (!TextUtils.isEmpty(m20213f)) {
            try {
                JSONObject jSONObject2 = new JSONObject(m20213f);
                if (jSONObject2.has("SYSTEM") && (jSONObject = jSONObject2.getJSONObject("SYSTEM")) != null && jSONObject.has("cdb")) {
                    return jSONObject.getInt("cdb");
                }
                return 0;
            } catch (Throwable unused) {
                return 0;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:27:0x00c3, B:29:0x00c9, B:31:0x00d3), top: B:26:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m20203a(java.lang.String r12) {
        /*
            java.lang.String r3 = "cdb"
            java.lang.String r7 = "discard"
            java.lang.String r2 = "fg_interval"
            java.lang.String r10 = "bg_interval"
            java.lang.String r11 = "SYSTEM"
            java.lang.String r6 = "SystemConfig"
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto Le7
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le1
            r4.<init>(r12)     // Catch: java.lang.Throwable -> Le1
            boolean r0 = r4.has(r11)     // Catch: java.lang.Throwable -> Le1
            if (r0 == 0) goto Le0
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Le1
            java.lang.String r0 = "server system config "
            r9 = 0
            r1[r9] = r0     // Catch: java.lang.Throwable -> Le1
            r5 = 1
            r1[r5] = r12     // Catch: java.lang.Throwable -> Le1
            com.alibaba.p052a.p061b.p065d.C0974i.m20098a(r6, r1)     // Catch: java.lang.Throwable -> Le1
            org.json.JSONObject r4 = r4.optJSONObject(r11)     // Catch: java.lang.Throwable -> Le1
            if (r4 == 0) goto Le0
            boolean r0 = r4.has(r10)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L4a
            int r0 = r4.getInt(r10)     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4a
            com.alibaba.p052a.p061b.p062a.C0942a.m20218c(r0)     // Catch: java.lang.Throwable -> L4a
        L4a:
            boolean r0 = r4.has(r2)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L63
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r1.<init>()     // Catch: java.lang.Throwable -> L63
            int r0 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L63
            r1.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L63
            com.alibaba.p052a.p061b.p062a.C0942a.m20216d(r0)     // Catch: java.lang.Throwable -> L63
        L63:
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Le1
            java.lang.String r0 = "UTDC.bSendToNewLogStore:"
            r1[r9] = r0     // Catch: java.lang.Throwable -> Le1
            boolean r0 = com.alibaba.p052a.p061b.C0941a.f21280h     // Catch: java.lang.Throwable -> Le1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Le1
            r1[r5] = r0     // Catch: java.lang.Throwable -> Le1
            com.alibaba.p052a.p061b.p065d.C0974i.m20098a(r6, r1)     // Catch: java.lang.Throwable -> Le1
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Le1
            java.lang.String r0 = "Config.BACKGROUND_PERIOD:"
            r2[r9] = r0     // Catch: java.lang.Throwable -> Le1
            long r0 = com.alibaba.p052a.p061b.p062a.C0942a.m20215e()     // Catch: java.lang.Throwable -> Le1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Le1
            r2[r5] = r0     // Catch: java.lang.Throwable -> Le1
            com.alibaba.p052a.p061b.p065d.C0974i.m20098a(r6, r2)     // Catch: java.lang.Throwable -> Le1
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Le1
            java.lang.String r0 = "Config.FOREGROUND_PERIOD:"
            r2[r9] = r0     // Catch: java.lang.Throwable -> Le1
            long r0 = com.alibaba.p052a.p061b.p062a.C0942a.m20217d()     // Catch: java.lang.Throwable -> Le1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Le1
            r2[r5] = r0     // Catch: java.lang.Throwable -> Le1
            com.alibaba.p052a.p061b.p065d.C0974i.m20098a(r6, r2)     // Catch: java.lang.Throwable -> Le1
            boolean r0 = r4.has(r7)     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto Lb3
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> Lc3
            if (r0 != r5) goto Lb0
            com.alibaba.p052a.p061b.p062a.C0942a.f21288c = r5     // Catch: java.lang.Throwable -> Lc3
            com.alibaba.a.b.g.a r0 = com.alibaba.p052a.p061b.p068g.C1003a.m20036a()     // Catch: java.lang.Throwable -> Lc3
            r0.m20031d()     // Catch: java.lang.Throwable -> Lc3
            goto Lc3
        Lb0:
            if (r0 != 0) goto Lc3
            goto Lba
        Lb3:
            boolean r0 = com.alibaba.p052a.p061b.p062a.C0942a.f21288c     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto Lc3
            com.alibaba.p052a.p061b.p062a.C0942a.f21288c = r9     // Catch: java.lang.Throwable -> Lc3
            goto Lbc
        Lba:
            com.alibaba.p052a.p061b.p062a.C0942a.f21288c = r9     // Catch: java.lang.Throwable -> Lc3
        Lbc:
            com.alibaba.a.b.g.a r0 = com.alibaba.p052a.p061b.p068g.C1003a.m20036a()     // Catch: java.lang.Throwable -> Lc3
            r0.m20034b()     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            boolean r0 = r4.has(r3)     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto Le7
            int r1 = r4.getInt(r3)     // Catch: java.lang.Throwable -> Le0
            int r0 = m20204a()     // Catch: java.lang.Throwable -> Le0
            if (r1 <= r0) goto Le7
            com.alibaba.a.b.d.s r1 = com.alibaba.p052a.p061b.p065d.C0989s.m20062a()     // Catch: java.lang.Throwable -> Le0
            com.alibaba.a.b.a.e$1 r0 = new com.alibaba.a.b.a.e$1     // Catch: java.lang.Throwable -> Le0
            r0.<init>()     // Catch: java.lang.Throwable -> Le0
            r1.m20058a(r0)     // Catch: java.lang.Throwable -> Le0
            return
        Le0:
            return
        Le1:
            r1 = move-exception
            java.lang.String r0 = "updateconfig"
            com.alibaba.p052a.p061b.p065d.C0974i.m20099a(r6, r0, r1)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p061b.p062a.C0946e.m20203a(java.lang.String):void");
    }
}
