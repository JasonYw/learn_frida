package com.alibaba.sdk.android.utils.crashdefend;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.e */
/* loaded from: classes13.dex */
public class C1115e {
    static {
        Covode.recordClassIndex(4532);
    }

    /* renamed from: a */
    public static boolean m19781a(Context context) {
        if (context.getPackageName().equalsIgnoreCase(m19782a(context))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m19782a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
        if (r2 != null) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m19780a(android.content.Context r9, com.alibaba.sdk.android.utils.crashdefend.C1110a r10, java.util.List<com.alibaba.sdk.android.utils.crashdefend.C1113c> r11) {
        /*
            if (r9 != 0) goto L3
            return
        L3:
            monitor-enter(r11)
            r2 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r4.<init>()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            if (r10 == 0) goto L13
            java.lang.String r3 = "startSerialNumber"
            long r0 = r10.f21715a     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
        L13:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r5.<init>()     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.util.Iterator r8 = r11.iterator()     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
        L1c:
            boolean r0 = r8.hasNext()     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            if (r0 == 0) goto L6b
            java.lang.Object r7 = r8.next()     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            com.alibaba.sdk.android.utils.crashdefend.c r7 = (com.alibaba.sdk.android.utils.crashdefend.C1113c) r7     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            if (r7 == 0) goto L1c
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.<init>()     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r1 = "sdkId"
            java.lang.String r0 = r7.f21730a     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.put(r1, r0)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r1 = "sdkVersion"
            java.lang.String r0 = r7.f21733b     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.put(r1, r0)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r1 = "crashLimit"
            int r0 = r7.f21727a     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.put(r1, r0)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r1 = "crashCount"
            int r0 = r7.crashCount     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.put(r1, r0)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r1 = "waitTime"
            int r0 = r7.f21731b     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.put(r1, r0)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r3 = "registerSerialNumber"
            long r0 = r7.f21732b     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.put(r3, r0)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r3 = "startSerialNumber"
            long r0 = r7.f21728a     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.put(r3, r0)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r1 = "restoreCount"
            int r0 = r7.f21734c     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r6.put(r1, r0)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r5.put(r6)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            goto L1c
        L6b:
            java.lang.String r0 = "sdkList"
            r4.put(r0, r5)     // Catch: org.json.JSONException -> L70 java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
        L70:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            boolean r0 = m19781a(r9)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r3 = 0
            if (r0 == 0) goto L89
            java.lang.String r0 = "com_alibaba_aliyun_crash_defend_sdk_info"
            java.io.FileOutputStream r2 = r9.openFileOutput(r0, r3)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
        L81:
            byte[] r0 = r4.getBytes()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            r2.write(r0)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            goto La4
        L89:
            java.lang.String r1 = "com_alibaba_aliyun_crash_defend_sdk_info_"
            java.lang.String r0 = m19782a(r9)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.lang.String r0 = p002O.C0002O.m25086C(r1, r0)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            java.io.FileOutputStream r2 = r9.openFileOutput(r0, r3)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f java.io.IOException -> La2
            goto L81
        L98:
            r0 = move-exception
            if (r2 == 0) goto L9e
            r2.close()     // Catch: java.io.IOException -> L9e java.lang.Throwable -> La9
        L9e:
            throw r0     // Catch: java.lang.Throwable -> La9
        L9f:
            if (r2 == 0) goto La7
            goto La4
        La2:
            if (r2 == 0) goto La7
        La4:
            r2.close()     // Catch: java.io.IOException -> La7 java.lang.Throwable -> La9
        La7:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> La9
            goto Lac
        La9:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> La9
            throw r0
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.crashdefend.C1115e.m19780a(android.content.Context, com.alibaba.sdk.android.utils.crashdefend.a, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x004f, code lost:
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004c, code lost:
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0049, code lost:
        if (r3 != null) goto L16;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m19779a(android.content.Context r8, com.alibaba.sdk.android.utils.crashdefend.C1110a r9, java.util.List<com.alibaba.sdk.android.utils.crashdefend.C1113c> r10) {
        /*
            r6 = 0
            if (r8 != 0) goto L4
            return r6
        L4:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            monitor-enter(r10)
            r5 = -1
            boolean r0 = m19781a(r8)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            if (r0 == 0) goto L2b
            java.lang.String r0 = "com_alibaba_aliyun_crash_defend_sdk_info"
            java.io.FileInputStream r3 = r8.openFileInput(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
        L18:
            r0 = 512(0x200, float:7.175E-43)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
        L1c:
            int r1 = r3.read(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            if (r1 == r5) goto L51
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            r0.<init>(r2, r6, r1)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            r4.append(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            goto L1c
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            java.lang.String r0 = "com_alibaba_aliyun_crash_defend_sdk_info_"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            java.lang.String r0 = m19782a(r8)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            r1.append(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            java.io.FileInputStream r3 = r8.openFileInput(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49 java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
            goto L18
        L42:
            r0 = move-exception
            if (r3 == 0) goto L48
            r3.close()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lde
        L48:
            throw r0     // Catch: java.lang.Throwable -> Lde
        L49:
            if (r3 == 0) goto L54
            goto L51
        L4c:
            if (r3 == 0) goto L54
            goto L51
        L4f:
            if (r3 == 0) goto L54
        L51:
            r3.close()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> Lde
        L54:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> Lde
            if (r0 != 0) goto L5c
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lde
            return r6
        L5c:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r2 = "startSerialNumber"
            r0 = 1
            long r0 = r3.optLong(r2, r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r9.f21715a = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = "sdkList"
            org.json.JSONArray r8 = r3.getJSONArray(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r7 = 0
        L76:
            int r0 = r8.length()     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            if (r7 >= r0) goto Ldb
            org.json.JSONObject r9 = r8.getJSONObject(r7)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            if (r9 == 0) goto Ld8
            com.alibaba.sdk.android.utils.crashdefend.c r4 = new com.alibaba.sdk.android.utils.crashdefend.c     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.<init>()     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r1 = "sdkId"
            java.lang.String r0 = ""
            java.lang.String r0 = r9.optString(r1, r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.f21730a = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r1 = "sdkVersion"
            java.lang.String r0 = ""
            java.lang.String r0 = r9.optString(r1, r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.f21733b = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = "crashLimit"
            int r0 = r9.optInt(r0, r5)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.f21727a = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = "crashCount"
            int r0 = r9.optInt(r0, r6)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.crashCount = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = "waitTime"
            int r0 = r9.optInt(r0, r6)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.f21731b = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = "registerSerialNumber"
            r2 = 0
            long r0 = r9.optLong(r0, r2)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.f21732b = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = "startSerialNumber"
            long r0 = r9.optLong(r0, r2)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.f21728a = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = "restoreCount"
            int r0 = r9.optInt(r0, r6)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            r4.f21734c = r0     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            java.lang.String r0 = r4.f21730a     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
            if (r0 != 0) goto Ld8
            r10.add(r4)     // Catch: java.lang.Throwable -> Ldb java.lang.Throwable -> Lde
        Ld8:
            int r7 = r7 + 1
            goto L76
        Ldb:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lde
            r0 = 1
            return r0
        Lde:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lde
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.crashdefend.C1115e.m19779a(android.content.Context, com.alibaba.sdk.android.utils.crashdefend.a, java.util.List):boolean");
    }
}
