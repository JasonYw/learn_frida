package cn.com.chinatelecom.account.api.p038e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import p003X.C116971W2r;
import p003X.G4Y;

/* renamed from: cn.com.chinatelecom.account.api.e.c */
/* loaded from: classes2.dex */
public class C0668c {

    /* renamed from: a */
    public String f20993a = "";

    /* renamed from: b */
    public boolean f20994b;

    /* renamed from: c */
    public String f20995c;

    /* renamed from: d */
    public String f20996d;

    static {
        Covode.recordClassIndex(2719);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0091 -> B:21:0x0094). Please submit an issue!!! */
    /* renamed from: a */
    public static String m20649a(Context context) {
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;
        MethodCollector.m14708i(185);
        File m20639c = m20639c(context);
        StringBuilder sb = new StringBuilder();
        if (m20639c == null || !m20639c.exists()) {
            MethodCollector.m14707o(185);
            return "";
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                fileInputStream = new FileInputStream(m20639c);
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine != null) {
                                    sb.append(readLine);
                                } else {
                                    try {
                                        break;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    th.printStackTrace();
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (Exception e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    String sb2 = sb.toString();
                                    MethodCollector.m14707o(185);
                                    return sb2;
                                } catch (Throwable th2) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e4) {
                                            e4.printStackTrace();
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (Exception e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Exception e6) {
                                            e6.printStackTrace();
                                        }
                                    }
                                    MethodCollector.m14707o(185);
                                    throw th2;
                                }
                            }
                        }
                        bufferedReader2.close();
                        try {
                            inputStreamReader.close();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
            fileInputStream = null;
        }
        String sb22 = sb.toString();
        MethodCollector.m14707o(185);
        return sb22;
    }

    /* renamed from: a */
    public static void m20648a(Context context, String str) {
        File m20639c = m20639c(context);
        if (m20639c == null || !m20639c.exists()) {
            m20644a(m20643b(context), str);
        } else {
            m20644a(m20639c, str);
        }
    }

    /* renamed from: a */
    public static void m20647a(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            G4Y.LIZ(context, "ct_account_api_sdk", 0).edit().putInt(str, i).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m20645a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            G4Y.LIZ(context, "ct_account_api_sdk", 0).edit().putString(str, str2).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0062, code lost:
        if (0 == 0) goto L43;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m20644a(java.io.File r6, java.lang.String r7) {
        /*
            r5 = 184(0xb8, float:2.58E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r5)
            if (r6 == 0) goto L7a
            boolean r0 = r6.exists()
            if (r0 == 0) goto L7a
            r4 = 0
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r0 = 0
            r3.<init>(r6, r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L60
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L60
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r0 == 0) goto L21
            java.lang.String r7 = ""
        L21:
            r2.write(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r2.flush()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r2.close()     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            r0.printStackTrace()
        L2f:
            r3.close()     // Catch: java.lang.Exception -> L54
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return
        L36:
            r1 = move-exception
            goto L64
        L38:
            r0 = move-exception
            r4 = r2
            goto L41
        L3b:
            r0 = move-exception
            goto L41
        L3d:
            r1 = move-exception
            goto L76
        L3f:
            r0 = move-exception
            r3 = r4
        L41:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L4e
            r4.close()     // Catch: java.lang.Exception -> L4a
            goto L4e
        L4a:
            r0 = move-exception
            r0.printStackTrace()
        L4e:
            if (r3 == 0) goto L5c
            r3.close()     // Catch: java.lang.Exception -> L54
            goto L5c
        L54:
            r0 = move-exception
            r0.printStackTrace()
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return
        L5c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return
        L60:
            r1 = move-exception
            r2 = r4
            if (r2 == 0) goto L6c
        L64:
            r2.close()     // Catch: java.lang.Exception -> L68
            goto L6c
        L68:
            r0 = move-exception
            r0.printStackTrace()
        L6c:
            if (r3 == 0) goto L76
            r3.close()     // Catch: java.lang.Exception -> L72
            goto L76
        L72:
            r0 = move-exception
            r0.printStackTrace()
        L76:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            throw r1
        L7a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.p038e.C0668c.m20644a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m20646a(Context context, String str, long j) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return G4Y.LIZ(context, "ct_account_api_sdk", 0).edit().putLong(str, j).commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m20642b(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return G4Y.LIZ(context, "ct_account_api_sdk", 0).getInt(str, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static long m20641b(Context context, String str, long j) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return G4Y.LIZ(context, "ct_account_api_sdk", 0).getLong(str, 0L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    /* renamed from: b */
    public static File m20643b(Context context) {
        if (context != null) {
            try {
                File file = new File(C116971W2r.LIZJ(context) + "/eAccount/Log/");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, "ipa_ol.ds");
                if (file2.exists()) {
                    C116971W2r.LIZ(file2);
                }
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m20640b(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return G4Y.LIZ(context, "ct_account_api_sdk", 0).getString(str, str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str2;
    }

    /* renamed from: c */
    public static File m20639c(Context context) {
        if (context != null) {
            try {
                File file = new File(C116971W2r.LIZJ(context) + "/eAccount/Log/");
                if (!file.exists()) {
                    return null;
                }
                File file2 = new File(file, "ipa_ol.ds");
                if (file2.exists()) {
                    return file2;
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
