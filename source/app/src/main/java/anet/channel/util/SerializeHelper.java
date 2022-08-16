package anet.channel.util;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.Serializable;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class SerializeHelper {
    public static File cacheDir;

    static {
        Covode.recordClassIndex(2369);
    }

    public static File getCacheFiles(String str) {
        Context context;
        if (cacheDir == null && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            cacheDir = C116971W2r.LIZIZ(context);
        }
        return new File(cacheDir, str);
    }

    public static synchronized <T> T restore(File file) {
        T t;
        synchronized (SerializeHelper.class) {
            MethodCollector.m14708i(97);
            t = (T) restore(file, null);
            MethodCollector.m14707o(97);
        }
        return t;
    }

    public static synchronized void persist(Serializable serializable, File file) {
        synchronized (SerializeHelper.class) {
            MethodCollector.m14708i(95);
            persist(serializable, file, null);
            MethodCollector.m14707o(95);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
        if (r4 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized <T> T restore(java.io.File r17, anet.channel.statist.StrategyStatObject r18) {
        /*
            java.lang.Class<anet.channel.util.SerializeHelper> r16 = anet.channel.util.SerializeHelper.class
            monitor-enter(r16)
            r15 = 98
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r15)     // Catch: java.lang.Throwable -> Lc7
            r12 = r17
            r6 = r18
            if (r6 == 0) goto L14
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> Lc7
            r6.readStrategyFilePath = r0     // Catch: java.lang.Throwable -> Lc7
        L14:
            r7 = 0
            r14 = 3
            r5 = 0
            boolean r0 = r12.exists()     // Catch: java.lang.Throwable -> L9a
            r1 = 2
            r13 = 1
            if (r0 != 0) goto L3d
            boolean r0 = anet.channel.util.ALog.isPrintLog(r14)     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L38
            java.lang.String r3 = "awcn.SerializeHelper"
            java.lang.String r2 = "file not exist."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "file"
            r1[r7] = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r12.getName()     // Catch: java.lang.Throwable -> L9a
            r1[r13] = r0     // Catch: java.lang.Throwable -> L9a
            anet.channel.util.ALog.m20783w(r3, r2, r5, r1)     // Catch: java.lang.Throwable -> L9a
        L38:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r15)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r16)
            return r5
        L3d:
            if (r6 == 0) goto L41
            r6.isFileExists = r13     // Catch: java.lang.Throwable -> L9a
        L41:
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L9a
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L97
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L97
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L97
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r11 = r2.readObject()     // Catch: java.lang.Throwable -> L97
            r2.close()     // Catch: java.lang.Throwable -> L95
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L95
            long r2 = r2 - r8
            if (r6 == 0) goto L66
            r6.isReadObjectSucceed = r13     // Catch: java.lang.Throwable -> L95
            r6.readCostTime = r2     // Catch: java.lang.Throwable -> L95
        L66:
            java.lang.String r10 = "awcn.SerializeHelper"
            java.lang.String r9 = "restore end."
            r0 = 6
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "file"
            r8[r7] = r0     // Catch: java.lang.Throwable -> L95
            java.io.File r0 = r12.getAbsoluteFile()     // Catch: java.lang.Throwable -> L95
            r8[r13] = r0     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "size"
            r8[r1] = r0     // Catch: java.lang.Throwable -> L95
            long r0 = r12.length()     // Catch: java.lang.Throwable -> L95
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L95
            r8[r14] = r0     // Catch: java.lang.Throwable -> L95
            r1 = 4
            java.lang.String r0 = "cost"
            r8[r1] = r0     // Catch: java.lang.Throwable -> L95
            r1 = 5
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L95
            r8[r1] = r0     // Catch: java.lang.Throwable -> L95
            anet.channel.util.ALog.m20785i(r10, r9, r5, r8)     // Catch: java.lang.Throwable -> L95
            goto Lb5
        L95:
            r3 = move-exception
            goto L9d
        L97:
            r3 = move-exception
            r11 = r5
            goto L9d
        L9a:
            r3 = move-exception
            r4 = r5
            r11 = r4
        L9d:
            boolean r0 = anet.channel.util.ALog.isPrintLog(r14)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lac
            java.lang.String r2 = "awcn.SerializeHelper"
            java.lang.String r1 = "restore file fail."
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lbd
            anet.channel.util.ALog.m20784w(r2, r1, r5, r3, r0)     // Catch: java.lang.Throwable -> Lbd
        Lac:
            if (r6 == 0) goto Lb3
            java.lang.String r0 = "SerializeHelper.restore()"
            r6.appendErrorTrace(r0, r3)     // Catch: java.lang.Throwable -> Lbd
        Lb3:
            if (r4 == 0) goto Lb8
        Lb5:
            r4.close()     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc7
        Lb8:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r15)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r16)
            return r11
        Lbd:
            r0 = move-exception
            if (r4 == 0) goto Lc3
            r4.close()     // Catch: java.io.IOException -> Lc3 java.lang.Throwable -> Lc7
        Lc3:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r15)     // Catch: java.lang.Throwable -> Lc7
            throw r0     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.restore(java.io.File, anet.channel.statist.StrategyStatObject):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
        if (r13 == false) goto L47;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0107: IF  (r11 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:70:0x010c, block:B:75:0x0107 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[Catch: all -> 0x011e, TryCatch #7 {, blocks: (B:5:0x0005, B:10:0x0012, B:20:0x004c, B:22:0x007c, B:24:0x0083, B:27:0x0094, B:30:0x009a, B:32:0x00a0, B:36:0x00e0, B:39:0x00e5, B:42:0x0101, B:46:0x00d0, B:48:0x00f0, B:49:0x00f3, B:53:0x00f8, B:64:0x0078, B:77:0x0109, B:70:0x010c, B:71:0x010f, B:80:0x0110), top: B:4:0x0005, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[Catch: all -> 0x011e, TryCatch #7 {, blocks: (B:5:0x0005, B:10:0x0012, B:20:0x004c, B:22:0x007c, B:24:0x0083, B:27:0x0094, B:30:0x009a, B:32:0x00a0, B:36:0x00e0, B:39:0x00e5, B:42:0x0101, B:46:0x00d0, B:48:0x00f0, B:49:0x00f3, B:53:0x00f8, B:64:0x0078, B:77:0x0109, B:70:0x010c, B:71:0x010f, B:80:0x0110), top: B:4:0x0005, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void persist(java.io.Serializable r17, java.io.File r18, anet.channel.statist.StrategyStatObject r19) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.persist(java.io.Serializable, java.io.File, anet.channel.statist.StrategyStatObject):void");
    }
}
