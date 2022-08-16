package com.alibaba.wireless.security.framework.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Method;
import p002O.C0002O;

/* renamed from: com.alibaba.wireless.security.framework.utils.f */
/* loaded from: classes26.dex */
public class C1133f {

    /* renamed from: c */
    public static boolean f21818c;

    /* renamed from: e */
    public static boolean f21820e;

    /* renamed from: g */
    public static boolean f21822g;

    /* renamed from: a */
    public static String[] f21816a = {"armeabi", "armeabi-v7a", "x86", "arm64-v8a", "x86_64"};

    /* renamed from: b */
    public static boolean f21817b = true;

    /* renamed from: d */
    public static boolean f21819d = true;

    /* renamed from: f */
    public static boolean f21821f = true;

    static {
        Covode.recordClassIndex(4557);
    }

    /* renamed from: a */
    public static String m19691a(ClassLoader classLoader, String str) {
        if (classLoader == null || str == null || "".equals(str)) {
            return null;
        }
        String m19690a = m19690a(classLoader, str, true);
        return m19690a == null ? m19690a(classLoader, str, false) : m19690a;
    }

    /* renamed from: a */
    public static String m19690a(ClassLoader classLoader, String str, boolean z) {
        if (classLoader != null) {
            try {
                Method method = z ? classLoader.getClass().getMethod("findLibrary", String.class) : classLoader.getClass().getDeclaredMethod("findLibrary", String.class);
                if (method != null) {
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    Object invoke = method.invoke(classLoader, str);
                    if (invoke != null && (invoke instanceof String)) {
                        return (String) invoke;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m19693a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public static boolean m19692a(Context context) {
        boolean z;
        PackageInfo packageInfo;
        if (f21817b) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                z = true;
            } catch (Throwable unused) {
            }
            if (packageInfo != null && (packageInfo.applicationInfo.flags & 1) != 0) {
                if ((packageInfo.applicationInfo.flags & 128) == 0) {
                    f21818c = z;
                    f21817b = false;
                }
            }
            z = false;
            f21818c = z;
            f21817b = false;
        }
        return f21818c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x004b, code lost:
        if (r6 == null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[Catch: IOException -> 0x0048, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0048, blocks: (B:29:0x0033, B:24:0x0045), top: B:2:0x0002 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m19689a(java.lang.String r10, java.lang.String r11, java.io.File r12) {
        /*
            r8 = 0
            r2 = 0
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L49
            r6.<init>(r10)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L49
            java.lang.String[] r9 = com.alibaba.wireless.security.framework.utils.C1133f.f21816a     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            int r7 = r9.length     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            r10 = 0
        Lb:
            if (r8 >= r7) goto L33
            r3 = r9[r8]     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L37
            java.lang.String r2 = "lib"
            java.lang.String r1 = java.io.File.separator     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L37
            java.lang.String r0 = java.io.File.separator     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L37
            java.lang.String r0 = p002O.C0002O.m25083C(r2, r1, r3, r0, r11)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L37
            java.util.zip.ZipEntry r5 = r6.getEntry(r0)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L37
            if (r5 == 0) goto L2d
            long r3 = r5.getSize()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L37
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
            boolean r10 = m19688a(r6, r5, r12)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L37
        L2d:
            int r8 = r8 + 1
            goto Lb
        L30:
            r1 = move-exception
            r2 = r6
            goto L3e
        L33:
            r6.close()     // Catch: java.io.IOException -> L48
            return r10
        L37:
            r0 = move-exception
            goto L4d
        L39:
            r1 = move-exception
            goto L3d
        L3b:
            r1 = move-exception
            r2 = r6
        L3d:
            r10 = 0
        L3e:
            java.lang.String r0 = ""
            com.alibaba.wireless.security.framework.utils.C1127a.m19715a(r0, r1)     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.io.IOException -> L48
        L48:
            return r10
        L49:
            r0 = move-exception
            r6 = r2
            if (r6 == 0) goto L50
        L4d:
            r6.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.C1133f.m19689a(java.lang.String, java.lang.String, java.io.File):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x008c, code lost:
        if (r3 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[Catch: Exception -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x00aa, blocks: (B:9:0x002a, B:11:0x0030, B:12:0x0033, B:24:0x0054, B:26:0x005a, B:44:0x0067, B:46:0x006d, B:48:0x0079, B:54:0x009b), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m19688a(java.util.zip.ZipFile r8, java.util.zip.ZipEntry r9, java.io.File r10) {
        /*
            r5 = 0
            if (r8 == 0) goto Lcc
            if (r9 == 0) goto Lcc
            if (r10 == 0) goto Lcc
            r0 = 1
            r7 = 0
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            java.lang.String r0 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            r1.append(r0)     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            java.lang.String r0 = ".tmp."
            r1.append(r0)     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            r1.append(r0)     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            r6.<init>(r0)     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La7
            boolean r0 = r6.exists()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            if (r0 == 0) goto L33
            p003X.C116971W2r.LIZ(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
        L33:
            java.io.InputStream r4 = r8.getInputStream(r9)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L92
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L92
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L93
        L40:
            int r1 = r4.read(r2)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L93
            r0 = -1
            if (r1 == r0) goto L4b
            r3.write(r2, r5, r1)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L93
            goto L40
        L4b:
            r4.close()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L93
            r3.flush()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L94
            r3.close()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L94
            boolean r0 = r10.exists()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            if (r0 == 0) goto L67
            long r3 = r10.length()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            long r1 = r9.getSize()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L67
            goto La9
        L67:
            boolean r0 = r6.exists()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            if (r0 == 0) goto Laa
            long r3 = r6.length()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            long r1 = r9.getSize()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Laa
            p003X.C116971W2r.LIZ(r10)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            boolean r5 = r6.renameTo(r10)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> Laa
            goto Laa
        L81:
            r0 = move-exception
            goto L8e
        L83:
            r0 = move-exception
            goto L87
        L85:
            r0 = move-exception
            r3 = r7
        L87:
            if (r4 == 0) goto L8c
            r4.close()     // Catch: java.lang.Exception -> L8c
        L8c:
            if (r3 == 0) goto La3
        L8e:
            r3.close()     // Catch: java.lang.Exception -> La3
            goto La3
        L92:
            r3 = r7
        L93:
            r7 = r4
        L94:
            if (r7 == 0) goto L99
            r7.close()     // Catch: java.lang.Exception -> L99
        L99:
            if (r3 == 0) goto Laa
            r3.close()     // Catch: java.lang.Exception -> Laa
            goto Laa
        L9f:
            r0 = move-exception
            goto La3
        La1:
            r0 = move-exception
            r6 = r7
        La3:
            p003X.C116971W2r.LIZ(r6)
            throw r0
        La7:
            r6 = r7
            goto Laa
        La9:
            r5 = 1
        Laa:
            p003X.C116971W2r.LIZ(r6)
            if (r5 != 0) goto Lcc
            boolean r0 = r10.exists()
            if (r0 == 0) goto Lcc
            long r3 = r10.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lcc
            long r3 = r10.length()
            long r1 = r9.getSize()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lcc
            r5 = 1
        Lcc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.C1133f.m19688a(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):boolean");
    }

    /* renamed from: b */
    public static boolean m19687b(Context context) {
        boolean z;
        PackageInfo packageInfo;
        if (f21819d) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable unused) {
            }
            if (packageInfo != null) {
                if ((packageInfo.applicationInfo.flags & 128) != 0) {
                    z = true;
                    f21820e = z;
                    f21819d = false;
                }
            }
            z = false;
            f21820e = z;
            f21819d = false;
        }
        return f21820e;
    }

    /* renamed from: c */
    public static boolean m19686c(Context context) {
        if (f21821f) {
            try {
                String m19685d = m19685d(context);
                String packageName = context.getPackageName();
                if ("com.ali.money.shield".equals(packageName)) {
                    new StringBuilder();
                    packageName = C0002O.m25086C(packageName, ":fore");
                }
                f21822g = m19685d.equals(packageName);
                f21821f = false;
            } catch (Exception unused) {
            }
        }
        return f21822g;
    }

    /* renamed from: d */
    public static String m19685d(Context context) {
        try {
            int myPid = Process.myPid();
            if (context == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName != null ? runningAppProcessInfo.processName : "";
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
