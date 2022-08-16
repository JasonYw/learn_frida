package com.alibaba.wireless.security.framework.utils;

import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: com.alibaba.wireless.security.framework.utils.b */
/* loaded from: classes26.dex */
public class C1128b {
    static {
        Covode.recordClassIndex(4552);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: a */
    public static String m19712a(File file) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = 0;
        bufferedReader2 = 0;
        bufferedReader2 = 0;
        bufferedReader2 = 0;
        bufferedReader2 = 0;
        if (file != null && file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            bufferedReader2 = sb.toString();
                            return bufferedReader2;
                        }
                        sb.append(readLine);
                    }
                } catch (Exception unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused2) {
                        }
                    }
                    return bufferedReader2;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != 0) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused4) {
                bufferedReader = bufferedReader2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return bufferedReader2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (0 != 0) goto L18;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m19711a(java.io.File r5, java.lang.String r6) {
        /*
            r4 = 0
            if (r5 == 0) goto L49
            if (r6 == 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getAbsolutePath()
            java.lang.String r0 = ".tmp"
            java.lang.String r0 = p002O.C0002O.m25086C(r1, r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            r2 = 0
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r0 != 0) goto L23
            r3.createNewFile()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
        L23:
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.write(r6)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            r1.flush()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            r1.close()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            boolean r4 = r3.renameTo(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            return r4
        L3b:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Exception -> L43
            throw r0
        L40:
            r2 = r1
            goto L46
        L42:
            r0 = move-exception
        L43:
            throw r0
        L44:
            if (r2 == 0) goto L49
        L46:
            r2.close()     // Catch: java.lang.Exception -> L49
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.C1128b.m19711a(java.io.File, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static boolean m19710a(String str) {
        return !str.contains("..") && !str.contains("\\") && !str.contains("%");
    }
}
