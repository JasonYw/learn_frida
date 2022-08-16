package com.alibaba.p052a.p061b.p068g;

import com.alibaba.p052a.p061b.p062a.C0942a;
import com.alibaba.p052a.p061b.p065d.C0958a;
import com.alibaba.p052a.p061b.p065d.C0966e;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0977l;
import com.alibaba.p052a.p061b.p066e.C0999b;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.a.b.g.b */
/* loaded from: classes13.dex */
public abstract class AbstractRunnableC1005b implements Runnable {

    /* renamed from: a */
    public static volatile boolean f21503a;

    /* renamed from: c */
    public static int f21504c;

    /* renamed from: f */
    public static boolean f21505f;

    /* renamed from: b */
    public int f21506b = -1;

    /* renamed from: d */
    public float f21507d = 200.0f;

    /* renamed from: e */
    public int f21508e;

    static {
        Covode.recordClassIndex(4315);
    }

    /* renamed from: a */
    private int m20027a(Boolean bool, long j) {
        if (j < 0) {
            return this.f21506b;
        }
        float f = this.f21508e / ((float) j);
        if (!bool.booleanValue()) {
            this.f21506b /= 2;
            f21504c++;
        } else if (j > 45000) {
            return this.f21506b;
        } else {
            this.f21506b = (int) (((f * 45000.0f) / this.f21507d) - f21504c);
        }
        int i = this.f21506b;
        if (i <= 0) {
            this.f21506b = 1;
            f21504c = 0;
        } else if (i > 350) {
            this.f21506b = 350;
        }
        C0974i.m20098a("UploadTask", "winsize:", Integer.valueOf(this.f21506b));
        return this.f21506b;
    }

    /* renamed from: a */
    private int m20024a(List<C0999b> list) {
        if (list == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2).f21474b;
            if (str != null) {
                str.toString();
                if ("6005".equalsIgnoreCase(str)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private C0958a.C0959a m20025a(String str, Map<String, Object> map) {
        if (str != null) {
            byte[] bArr = C0966e.m20113a(2, str, map, false).f21400b;
            C0974i.m20098a("UploadTask", "url:", str);
            if (bArr != null) {
                try {
                    String str2 = new String(bArr, C34037f.f43302f);
                    C0974i.m20098a("UploadTask", "result:", str2);
                    return C0958a.m20145a(str2);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return C0958a.C0959a.f21373c;
    }

    /* renamed from: a */
    private List<String> m20028a(C0999b c0999b) {
        return C0942a.m20220b(c0999b.f21474b);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(3:2|3|4)|(3:6|7|8)|9|11|12|13|14|15|(1:(0))) */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] m20026a(java.lang.String r5) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r2 = 0
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L25
            r1.<init>(r3)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L25
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r1.write(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r1.flush()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r1.close()     // Catch: java.lang.Exception -> L32
            goto L32
        L1b:
            r0 = move-exception
            goto L27
        L1d:
            r0 = move-exception
            r2 = r1
            goto L21
        L20:
            r0 = move-exception
        L21:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L25
            goto L2d
        L25:
            r0 = move-exception
            r1 = r2
        L27:
            if (r1 == 0) goto L2c
            r1.close()     // Catch: java.lang.Exception -> L2c
        L2c:
            throw r0
        L2d:
            if (r2 == 0) goto L32
            r2.close()     // Catch: java.lang.Exception -> L32
        L32:
            byte[] r1 = r3.toByteArray()
            java.lang.String r0 = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK"
            byte[] r0 = com.alibaba.p052a.p061b.p065d.C0982n.m20074a(r1, r0)
            r3.close()     // Catch: java.lang.Exception -> L3f
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p061b.p068g.AbstractRunnableC1005b.m20026a(java.lang.String):byte[]");
    }

    /* renamed from: b */
    private Map<String, Object> m20022b(List<C0999b> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            List<String> m20028a = m20028a(list.get(i));
            if (m20028a != null) {
                for (int i2 = 0; i2 < m20028a.size(); i2++) {
                    StringBuilder sb = (StringBuilder) hashMap.get(m20028a.get(i2));
                    if (sb == null) {
                        sb = new StringBuilder();
                        hashMap.put(m20028a.get(i2), sb);
                    } else {
                        sb.append("\n");
                    }
                    sb.append(list.get(i).m20045a());
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        this.f21508e = 0;
        for (Object obj : hashMap.keySet()) {
            byte[] m20026a = m20026a(((StringBuilder) hashMap.get(obj)).toString());
            hashMap2.put(obj, m20026a);
            this.f21508e += m20026a.length;
        }
        this.f21507d = this.f21508e / list.size();
        C0974i.m20098a("UploadTask", "averagePackageSize:", Float.valueOf(this.f21507d));
        return hashMap2;
    }

    /* renamed from: c */
    public static boolean m20021c() {
        return f21503a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
        if (r12.size() == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c6, code lost:
        com.alibaba.p052a.p061b.p065d.C0976k.m20091a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00b6, code lost:
        if (r12 != null) goto L45;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m20020d() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p061b.p068g.AbstractRunnableC1005b.m20020d():void");
    }

    /* renamed from: e */
    private int m20019e() {
        if (this.f21506b == -1) {
            String m20089a = C0977l.m20089a();
            this.f21506b = "wifi".equalsIgnoreCase(m20089a) ? 20 : "4G".equalsIgnoreCase(m20089a) ? 16 : "3G".equalsIgnoreCase(m20089a) ? 12 : 8;
        }
        return this.f21506b;
    }

    /* renamed from: a */
    public abstract void mo20029a();

    /* renamed from: b */
    public abstract void mo20023b();

    @Override // java.lang.Runnable
    public void run() {
        try {
            m20020d();
            mo20029a();
        } catch (Throwable unused) {
        }
    }
}
