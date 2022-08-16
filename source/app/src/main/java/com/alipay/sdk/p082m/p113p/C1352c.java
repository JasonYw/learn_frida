package com.alipay.sdk.p082m.p113p;

import com.alipay.sdk.p082m.p105l.C1313a;
import com.alipay.sdk.p082m.p109n.C1334b;
import com.alipay.sdk.p082m.p109n.C1336d;
import com.alipay.sdk.p082m.p109n.C1337e;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayInputStream;
import java.util.Locale;

/* renamed from: com.alipay.sdk.m.p.c */
/* loaded from: classes2.dex */
public final class C1352c {

    /* renamed from: a */
    public boolean f22310a;

    /* renamed from: b */
    public String f22311b = C1399n.m18817a(24);

    static {
        Covode.recordClassIndex(4852);
    }

    /* renamed from: a */
    public static int m19015a(String str) {
        return Integer.parseInt(str);
    }

    public C1352c(boolean z) {
        this.f22310a = z;
    }

    /* renamed from: a */
    public static String m19018a(int i) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m19012a(byte[]... r7) {
        /*
            r1 = 0
            if (r7 == 0) goto L5e
            int r0 = r7.length
            if (r0 == 0) goto L5e
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L45
            r6.<init>()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L45
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            int r4 = r7.length     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            r3 = 0
        L12:
            if (r3 >= r4) goto L28
            r2 = r7[r3]     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            int r0 = r2.length     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            java.lang.String r0 = m19018a(r0)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            r5.write(r0)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            r5.write(r2)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            int r3 = r3 + 1
            goto L12
        L28:
            r5.flush()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            byte[] r1 = r6.toByteArray()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L42
            r6.close()     // Catch: java.lang.Exception -> L5a
            goto L5a
        L33:
            r0 = move-exception
            goto L3e
        L35:
            r0 = move-exception
            r5 = r1
            goto L43
        L38:
            r0 = move-exception
            r5 = r1
            goto L3e
        L3b:
            r0 = move-exception
            r6 = r1
            r5 = r6
        L3e:
            com.alipay.sdk.p082m.p121u.C1385e.m18866a(r0)     // Catch: java.lang.Throwable -> L42
            goto L52
        L42:
            r0 = move-exception
        L43:
            r1 = r6
            goto L47
        L45:
            r0 = move-exception
            r5 = r1
        L47:
            if (r1 == 0) goto L4c
            r1.close()     // Catch: java.lang.Exception -> L4c
        L4c:
            if (r5 == 0) goto L51
            r5.close()     // Catch: java.lang.Exception -> L51
        L51:
            throw r0
        L52:
            if (r6 == 0) goto L57
            r6.close()     // Catch: java.lang.Exception -> L57
        L57:
            if (r5 != 0) goto L5a
        L59:
            return r1
        L5a:
            r5.close()     // Catch: java.lang.Exception -> L59
            return r1
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p113p.C1352c.m19012a(byte[][]):byte[]");
    }

    /* renamed from: a */
    public static byte[] m19014a(String str, String str2) {
        return C1336d.m19075a(str, str2);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0064: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:48:?, block:B:41:0x0064 */
    /* renamed from: a */
    public final C1351b m19016a(C1353d c1353d, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        String str3;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(c1353d.m19010a());
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream.read(bArr);
                    byte[] bArr2 = new byte[m19015a(new String(bArr))];
                    byteArrayInputStream.read(bArr2);
                    str2 = new String(bArr2);
                } catch (Exception e) {
                    e = e;
                    str2 = null;
                }
                try {
                    byte[] bArr3 = new byte[5];
                    byteArrayInputStream.read(bArr3);
                    int m19015a = m19015a(new String(bArr3));
                    if (m19015a > 0) {
                        byte[] bArr4 = new byte[m19015a];
                        byteArrayInputStream.read(bArr4);
                        if (this.f22310a) {
                            bArr4 = m19013a(this.f22311b, bArr4, str);
                        }
                        if (c1353d.m19009b()) {
                            bArr4 = C1334b.m19077b(bArr4);
                        }
                        str3 = new String(bArr4);
                    } else {
                        str3 = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    C1385e.m18866a(e);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    str3 = null;
                    if (str2 == null && str3 == null) {
                        return null;
                    }
                    return new C1351b(str2, str3);
                }
                try {
                    byteArrayInputStream.close();
                } catch (Exception unused2) {
                    if (str2 == null) {
                        return null;
                    }
                    return new C1351b(str2, str3);
                }
            } finally {
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayInputStream = null;
            str2 = null;
        } catch (Throwable th) {
            throw th;
        }
        return new C1351b(str2, str3);
    }

    /* renamed from: b */
    public static byte[] m19011b(String str, byte[] bArr, String str2) {
        return C1337e.m19070b(str, bArr, str2);
    }

    /* renamed from: a */
    public static byte[] m19013a(String str, byte[] bArr, String str2) {
        return C1337e.m19072a(str, bArr, str2);
    }

    /* renamed from: a */
    public final C1353d m19017a(C1351b c1351b, boolean z, String str) {
        byte[] m19012a;
        if (c1351b == null) {
            return null;
        }
        byte[] bytes = c1351b.m19020b().getBytes();
        byte[] bytes2 = c1351b.m19021a().getBytes();
        if (z) {
            try {
                bytes2 = C1334b.m19078a(bytes2);
            } catch (Exception unused) {
                z = false;
            }
        }
        if (this.f22310a) {
            m19012a = m19012a(bytes, m19014a(this.f22311b, C1313a.f22202e), m19011b(this.f22311b, bytes2, str));
        } else {
            m19012a = m19012a(bytes, bytes2);
        }
        return new C1353d(z, m19012a);
    }
}
