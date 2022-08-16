package com.android.ttcjpaysdk.base.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes2.dex */
public class CJPaySharedPrefUtils {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6724);
    }

    public static void clearMap(String str) {
        Context context;
        if (PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 8).isSupported || (context = CJPayHostInfo.applicationContext) == null) {
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.remove(str);
        edit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0076 A[Catch: IOException -> 0x007a, TRY_LEAVE, TryCatch #1 {IOException -> 0x007a, blocks: (B:44:0x0071, B:37:0x0076), top: B:43:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String r7) {
        /*
            java.lang.String r6 = "NO"
            r5 = 446(0x1be, float:6.25E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r5)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r0 = 0
            r2[r0] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.base.utils.CJPaySharedPrefUtils.LIZ
            r4 = 0
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.result
            java.util.Map r0 = (java.util.Map) r0
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return r0
        L21:
            android.content.Context r0 = com.android.ttcjpaysdk.base.CJPayHostInfo.applicationContext
            if (r0 != 0) goto L29
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return r4
        L29:
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6d
            java.lang.String r1 = r0.getString(r7, r6)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6d
            boolean r0 = r6.equals(r1)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6d
            if (r0 != 0) goto L56
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6d
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6d
            r3.<init>(r0)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6d
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.Object r0 = r2.readObject()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L6a
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L6a
            r4 = r0
            goto L58
        L4e:
            r0 = move-exception
            goto L66
        L50:
            r1 = move-exception
            r2 = r4
            goto L6b
        L53:
            r0 = move-exception
            r2 = r4
            goto L66
        L56:
            r2 = r4
            r3 = r2
        L58:
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.io.IOException -> L8d
        L5d:
            if (r2 == 0) goto L91
            r2.close()     // Catch: java.io.IOException -> L8d
            goto L91
        L63:
            r0 = move-exception
            r2 = r4
            r3 = r2
        L66:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6a
            goto L82
        L6a:
            r1 = move-exception
        L6b:
            r4 = r3
            goto L6f
        L6d:
            r1 = move-exception
            r2 = r4
        L6f:
            if (r4 == 0) goto L74
            r4.close()     // Catch: java.io.IOException -> L7a
        L74:
            if (r2 == 0) goto L7e
            r2.close()     // Catch: java.io.IOException -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            r0.printStackTrace()
        L7e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            throw r1
        L82:
            if (r3 == 0) goto L87
            r3.close()     // Catch: java.io.IOException -> L8d
        L87:
            if (r2 == 0) goto L91
            r2.close()     // Catch: java.io.IOException -> L8d
            goto L91
        L8d:
            r0 = move-exception
            r0.printStackTrace()
        L91:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.utils.CJPaySharedPrefUtils.getMap(java.lang.String):java.util.Map");
    }

    public static int LIZ(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, null, LIZ, true, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Context context = CJPayHostInfo.applicationContext;
        if (context == null) {
            return i;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, i);
    }

    public static String LIZIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Context context = CJPayHostInfo.applicationContext;
        if (context == null) {
            return str2;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
    }

    public static void singlePutInt(String str, int i) {
        Context context;
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, null, LIZ, true, 4).isSupported && (context = CJPayHostInfo.applicationContext) != null) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(str, i).apply();
        }
    }

    public static void LIZ(String str, String str2) {
        Context context;
        if (PatchProxy.proxy(new Object[]{str, str2}, null, LIZ, true, 1).isSupported || (context = CJPayHostInfo.applicationContext) == null) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, str2).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
        if (0 == 0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void singlePutMap(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r7 = 445(0x1bd, float:6.24E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r7)
            r6 = 2
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r0 = 0
            r3[r0] = r8
            r2 = 1
            r3[r2] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.base.utils.CJPaySharedPrefUtils.LIZ
            r5 = 0
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r5, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1e
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r7)
            return
        L1e:
            android.content.Context r1 = com.android.ttcjpaysdk.base.CJPayHostInfo.applicationContext
            if (r1 == 0) goto L96
            if (r9 == 0) goto L96
            int r0 = r9.size()
            if (r0 <= 0) goto L96
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            android.content.SharedPreferences$Editor r4 = r0.edit()
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r3.<init>()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L81
            r2.<init>(r3)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L81
            r2.writeObject(r9)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            byte[] r0 = android.util.Base64.encode(r0, r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r4.putString(r8, r1)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r4.apply()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r2.close()     // Catch: java.io.IOException -> L75
            r3.close()     // Catch: java.io.IOException -> L75
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r7)
            return
        L5c:
            r1 = move-exception
            goto L85
        L5e:
            r0 = move-exception
            r5 = r2
            goto L67
        L61:
            r0 = move-exception
            goto L67
        L63:
            r1 = move-exception
            goto L92
        L65:
            r0 = move-exception
            r3 = r5
        L67:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L6f
            r5.close()     // Catch: java.io.IOException -> L75
        L6f:
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.io.IOException -> L75
            goto L7d
        L75:
            r0 = move-exception
            r0.printStackTrace()
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r7)
            return
        L7d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r7)
            return
        L81:
            r1 = move-exception
            r2 = r5
            if (r2 == 0) goto L88
        L85:
            r2.close()     // Catch: java.io.IOException -> L8e
        L88:
            if (r3 == 0) goto L92
            r3.close()     // Catch: java.io.IOException -> L8e
            goto L92
        L8e:
            r0 = move-exception
            r0.printStackTrace()
        L92:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r7)
            throw r1
        L96:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.utils.CJPaySharedPrefUtils.singlePutMap(java.lang.String, java.util.Map):void");
    }
}
