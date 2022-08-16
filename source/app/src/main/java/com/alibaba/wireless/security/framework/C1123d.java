package com.alibaba.wireless.security.framework;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.alibaba.wireless.security.framework.utils.C1127a;
import com.alibaba.wireless.security.framework.utils.C1128b;
import com.alibaba.wireless.security.framework.utils.C1129c;
import com.alibaba.wireless.security.framework.utils.C1133f;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.C1138c;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.xiaomi.mipush.sdk.Constants;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alibaba.wireless.security.framework.d */
/* loaded from: classes2.dex */
public class C1123d implements ISGPluginManager {

    /* renamed from: o */
    public static String f21765o;

    /* renamed from: c */
    public Context f21769c;

    /* renamed from: n */
    public static String[] f21764n = {"armeabi", "armeabi-v7a", "x86", "arm64-v8a", "x86_64"};

    /* renamed from: p */
    public static volatile boolean f21766p = true;

    /* renamed from: d */
    public final HashMap<String, C1122c> f21770d = new HashMap<>();

    /* renamed from: a */
    public HashMap<Class, Object> f21767a = new HashMap<>();

    /* renamed from: e */
    public IRouterComponent f21771e = null;

    /* renamed from: b */
    public C1129c f21768b = null;

    /* renamed from: f */
    public boolean f21772f = true;

    /* renamed from: g */
    public String f21773g = null;

    /* renamed from: h */
    public String f21774h = null;

    /* renamed from: i */
    public C1121b f21775i = null;

    /* renamed from: j */
    public boolean f21776j = false;

    /* renamed from: k */
    public File f21777k = null;

    /* renamed from: l */
    public File f21778l = null;

    /* renamed from: m */
    public File f21779m = null;

    /* renamed from: com.alibaba.wireless.security.framework.d$a */
    /* loaded from: classes2.dex */
    public static class C1126a {

        /* renamed from: a */
        public File f21786a;

        /* renamed from: b */
        public File f21787b;

        /* renamed from: c */
        public File f21788c;

        /* renamed from: d */
        public boolean f21789d;

        static {
            Covode.recordClassIndex(4549);
        }

        public C1126a(File file, File file2, File file3, boolean z) {
            this.f21786a = file;
            this.f21787b = file2;
            this.f21788c = file3;
            this.f21789d = z;
        }
    }

    static {
        Covode.recordClassIndex(4546);
    }

    /* renamed from: a */
    private int m19738a(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length < split2.length ? split.length : split2.length;
        for (int i = 0; i < length; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt > parseInt2) {
                return 1;
            }
            if (parseInt < parseInt2) {
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private PackageInfo m19742a(String str, C1126a c1126a, String str2) {
        PackageInfo packageInfo;
        String str3 = "";
        try {
            packageInfo = this.f21769c.getPackageManager().getPackageArchiveInfo(c1126a.f21786a.getAbsolutePath(), 133);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(th);
            m19756a(100043, 199, "getPackageArchiveInfo failed", sb.toString(), m19726c(c1126a.f21786a.getAbsolutePath()), c1126a.f21788c != null ? m19726c(c1126a.f21788c.getAbsolutePath()) : str3, str2);
            if (c1126a.f21786a.exists() && !m19734b(c1126a.f21786a)) {
                C116971W2r.LIZ(c1126a.f21786a);
            }
            packageInfo = null;
        }
        if (packageInfo == null) {
            String str4 = str + "[" + str2 + "]";
            String m19726c = m19726c(c1126a.f21786a.getAbsolutePath());
            if (c1126a.f21788c != null) {
                str3 = m19726c(c1126a.f21788c.getAbsolutePath());
            }
            m19756a(100043, 199, "packageInfo == null", str4, m19726c, str3, m19729c());
            throw new SecException(199);
        }
        return packageInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00ff A[Catch: all -> 0x057e, TRY_ENTER, TryCatch #15 {all -> 0x057e, blocks: (B:3:0x0052, B:6:0x0066, B:9:0x006e, B:11:0x0078, B:13:0x008c, B:14:0x00d2, B:19:0x0112, B:23:0x012b, B:25:0x0133, B:26:0x0145, B:28:0x0149, B:29:0x015b, B:30:0x0172, B:32:0x0173, B:34:0x0186, B:35:0x0189, B:38:0x0191, B:40:0x01d6, B:42:0x01e3, B:43:0x01f5, B:45:0x01f9, B:46:0x020b, B:47:0x0221, B:48:0x0222, B:50:0x023b, B:52:0x0248, B:53:0x025a, B:55:0x025e, B:56:0x0270, B:57:0x0286, B:58:0x0287, B:59:0x029a, B:61:0x02c4, B:63:0x02e7, B:64:0x02f9, B:66:0x02fd, B:67:0x030f, B:68:0x0325, B:69:0x0326, B:71:0x0339, B:74:0x033d, B:76:0x0345, B:79:0x0350, B:81:0x035e, B:83:0x0364, B:84:0x0366, B:86:0x036a, B:88:0x0372, B:89:0x0374, B:91:0x037c, B:92:0x037e, B:94:0x0386, B:96:0x0388, B:98:0x038c, B:100:0x03b4, B:101:0x03e4, B:103:0x03ea, B:105:0x03f0, B:115:0x03a1, B:121:0x051b, B:124:0x0420, B:126:0x0445, B:128:0x0456, B:129:0x0468, B:131:0x046c, B:132:0x047e, B:139:0x04b6, B:141:0x04ba, B:142:0x0513, B:143:0x0491, B:144:0x04cb, B:157:0x052b, B:159:0x0533, B:160:0x0545, B:162:0x0549, B:163:0x055b, B:164:0x056a, B:165:0x056b, B:166:0x00ff, B:174:0x009d, B:133:0x04a4, B:135:0x04a8, B:136:0x04ad, B:138:0x04b3), top: B:2:0x0052, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.wireless.security.framework.C1122c m19743a(java.lang.String r35, com.alibaba.wireless.security.framework.C1123d.C1126a r36, android.content.Context r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.C1123d.m19743a(java.lang.String, com.alibaba.wireless.security.framework.d$a, android.content.Context, java.lang.String):com.alibaba.wireless.security.framework.c");
    }

    /* renamed from: a */
    private File m19755a(Context context) {
        if (context == null) {
            m19756a(100038, 116, "", "", "", "", "");
            throw new SecException(116);
        }
        String str = null;
        try {
            String str2 = context.getApplicationInfo().sourceDir;
            if (str2 != null) {
                File file = new File(str2);
                if (file.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.lastModified() / 1000);
                    str = sb.toString();
                }
            }
            if (str == null) {
                throw new SecException(115);
            }
            this.f21778l = context.getDir("SGLib", 0);
            File file2 = this.f21778l;
            if (file2 == null || !file2.exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f21778l);
                m19756a(100038, 109, "", sb2.toString(), "", "", "");
                throw new SecException(109);
            }
            String absolutePath = this.f21778l.getAbsolutePath();
            File file3 = new File(absolutePath, "app_" + str);
            if (!file3.exists()) {
                file3.mkdirs();
                if (!file3.exists()) {
                    file3.mkdirs();
                }
            }
            if (f21766p && file3.exists()) {
                f21766p = false;
                File file4 = this.f21778l;
                m19747a(file4, "app_" + str);
            }
            if (file3.exists()) {
                return file3;
            }
            m19756a(100038, 114, "", "", "", "", "");
            throw new SecException(114);
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e);
            m19756a(100038, 115, "", sb3.toString(), "", "", "");
            throw new SecException(e, 115);
        }
    }

    /* renamed from: a */
    private File m19754a(Context context, C1121b c1121b) {
        if (!C1133f.m19692a(context) && c1121b != null && c1121b.m19761b() != 0 && c1121b.m19760c() != null && c1121b.m19760c().length() > 0) {
            new StringBuilder();
            File file = new File(C0002O.m25081C(this.f21777k.getAbsolutePath(), File.separator, "libs", File.separator, Integer.valueOf(c1121b.m19761b()), File.separator, c1121b.m19760c()));
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: a */
    private File m19744a(String str) {
        if (this.f21773g != null) {
            return null;
        }
        String m19691a = C1133f.m19691a(C1123d.class.getClassLoader(), C0002O.m25086C("sg", str));
        if (m19691a != null && m19691a.length() > 0) {
            return new File(m19691a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File m19741a(java.lang.String r22, java.io.File r23) {
        /*
            r21 = this;
            r12 = 0
            r5 = r21
            android.content.Context r0 = r5.f21769c     // Catch: java.lang.Exception -> Lc
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Exception -> Lc
            java.lang.String r8 = r0.sourceDir     // Catch: java.lang.Exception -> Lc
            goto Ld
        Lc:
            r8 = r12
        Ld:
            if (r8 != 0) goto L10
            return r12
        L10:
            java.lang.String r1 = "libsg"
            java.lang.String r0 = ".so"
            r4 = r22
            java.lang.String r11 = p002O.C0002O.m25085C(r1, r4, r0)
            java.lang.String r0 = "Plugin not existed in the application library path, maybe installed in x86 phone, or the armeabi-v7a existed"
            com.alibaba.wireless.security.framework.utils.C1127a.m19713b(r0)     // Catch: java.io.IOException -> L4e java.lang.Throwable -> L73
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L4e java.lang.Throwable -> L73
            r3.<init>(r8)     // Catch: java.io.IOException -> L4e java.lang.Throwable -> L73
            java.lang.String[] r10 = com.alibaba.wireless.security.framework.C1123d.f21764n     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            int r9 = r10.length     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            r7 = 0
        L28:
            if (r7 >= r9) goto L48
            r6 = r10[r7]     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            java.lang.String r2 = "lib"
            java.lang.String r1 = java.io.File.separator     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            java.lang.String r0 = java.io.File.separator     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            java.lang.String r1 = p002O.C0002O.m25083C(r2, r1, r6, r0, r11)     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            java.util.zip.ZipEntry r0 = r3.getEntry(r1)     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            if (r0 == 0) goto L45
            com.alibaba.wireless.security.framework.C1123d.f21765o = r6     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            r0 = r23
            java.io.File r12 = r5.m19739a(r4, r0, r3, r1)     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L71
            goto L48
        L45:
            int r7 = r7 + 1
            goto L28
        L48:
            r3.close()     // Catch: java.lang.Exception -> L4b
        L4b:
            return r12
        L4c:
            r1 = move-exception
            goto L50
        L4e:
            r1 = move-exception
            r3 = r12
        L50:
            java.lang.String r0 = "getPluginFile throws exception"
            com.alibaba.wireless.security.framework.utils.C1127a.m19715a(r0, r1)     // Catch: java.lang.Throwable -> L71
            r14 = 100047(0x186cf, float:1.40196E-40)
            r15 = 3
            java.lang.String r16 = r1.toString()     // Catch: java.lang.Throwable -> L71
            java.lang.String r18 = r5.m19726c(r8)     // Catch: java.lang.Throwable -> L71
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            r13 = r5
            r17 = r4
            r13.m19756a(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L70
            r3.close()     // Catch: java.lang.Exception -> L70
        L70:
            return r12
        L71:
            r0 = move-exception
            goto L75
        L73:
            r0 = move-exception
            r3 = r12
        L75:
            if (r3 == 0) goto L7a
            r3.close()     // Catch: java.lang.Exception -> L7a
        L7a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.C1123d.m19741a(java.lang.String, java.io.File):java.io.File");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File m19740a(java.lang.String r13, java.io.File r14, java.lang.String r15, java.lang.String r16) {
        /*
            r12 = this;
            r3 = 0
            if (r15 == 0) goto L44
            r1 = r16
            if (r1 == 0) goto L44
            r8 = r13
            java.lang.String r0 = "Plugin not existed in the application library path, maybe installed in x86 phone, or the armeabi-v7a existed"
            com.alibaba.wireless.security.framework.utils.C1127a.m19713b(r0)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            r2.<init>(r15)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            java.io.File r3 = r12.m19739a(r8, r14, r2, r1)     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L3d
            goto L39
        L17:
            r1 = move-exception
            goto L1e
        L19:
            r0 = move-exception
            r2 = r3
            goto L3e
        L1c:
            r1 = move-exception
            r2 = r3
        L1e:
            java.lang.String r0 = "getPluginFile throws exception"
            com.alibaba.wireless.security.framework.utils.C1127a.m19715a(r0, r1)     // Catch: java.lang.Throwable -> L3d
            r5 = 100047(0x186cf, float:1.40196E-40)
            r6 = 3
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r9 = r12.m19726c(r15)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r4 = r12
            r4.m19756a(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3c
        L39:
            r2.close()     // Catch: java.lang.Exception -> L3c
        L3c:
            return r3
        L3d:
            r0 = move-exception
        L3e:
            if (r2 == 0) goto L43
            r2.close()     // Catch: java.lang.Exception -> L43
        L43:
            throw r0
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.C1123d.m19740a(java.lang.String, java.io.File, java.lang.String, java.lang.String):java.io.File");
    }

    /* renamed from: a */
    private File m19739a(String str, File file, ZipFile zipFile, String str2) {
        ZipEntry entry;
        if (zipFile == null || str2 == null || (entry = zipFile.getEntry(str2)) == null || !C1128b.m19710a(entry.getName())) {
            return null;
        }
        C1127a.m19713b(C0002O.m25086C("Plugin existed  in ", entry.getName()));
        File file2 = new File(file, C0002O.m25083C("libsg", str, "_inner", Long.valueOf(entry.getTime()), ".zip"));
        if ((!file2.exists() || file2.length() != entry.getSize()) && !C1133f.m19688a(zipFile, entry, file2)) {
            C1127a.m19713b("Extract failed!!");
            return null;
        }
        C1127a.m19713b("Extract success");
        return file2;
    }

    /* renamed from: a */
    private Class<?> m19745a(ClassLoader classLoader, String str) {
        Class<?> cls;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            cls = C116971W2r.LIZ(str, true, classLoader);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(th);
            m19756a(100042, 199, "Class.forName failed", sb.toString(), str, classLoader.toString(), "");
            cls = null;
        }
        C1127a.m19713b("    loadClassFromClassLoader( " + str + " ) used time: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return cls;
    }

    /* renamed from: a */
    private String m19746a(Class<?> cls) {
        InterfacePluginInfo interfacePluginInfo = (InterfacePluginInfo) cls.getAnnotation(InterfacePluginInfo.class);
        if (interfacePluginInfo == null) {
            return null;
        }
        return interfacePluginInfo.pluginName();
    }

    /* renamed from: a */
    private void m19757a() {
        this.f21777k = m19755a(this.f21769c);
        if (this.f21777k != null) {
            Context context = this.f21769c;
            this.f21768b = new C1129c(context, this.f21777k + File.separator + "lock.lock");
            this.f21775i = m19735b();
            this.f21779m = m19754a(this.f21769c, this.f21775i);
        }
    }

    /* renamed from: a */
    private void m19756a(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        UserTrackMethodJniBridge.addUtRecord(sb.toString(), i2, 0, C1138c.m19672a(), 0L, str, str2, str3, str4, str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m19749a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                m19749a(new File(file, str));
            }
        }
        C116971W2r.LIZ(file);
    }

    /* renamed from: a */
    private void m19747a(final File file, final String str) {
        new Thread(new Runnable() { // from class: com.alibaba.wireless.security.framework.d.1
            static {
                Covode.recordClassIndex(4547);
            }

            @Override // java.lang.Runnable
            public void run() {
                File LIZJ;
                File[] listFiles;
                File[] listFiles2;
                try {
                    if (file != null && file.isDirectory() && (listFiles2 = file.listFiles()) != null && listFiles2.length > 0) {
                        for (File file2 : listFiles2) {
                            if (file2.isDirectory() && file2.getName().startsWith("app_") && !file2.getName().equals(str)) {
                                C1123d.this.m19749a(file2);
                            } else if (file2.getName().startsWith("libsg")) {
                                C116971W2r.LIZ(file2);
                            }
                        }
                    }
                    if (C1123d.this.f21769c == null || (LIZJ = C116971W2r.LIZJ(C1123d.this.f21769c)) == null || !LIZJ.isDirectory() || (listFiles = LIZJ.listFiles()) == null || listFiles.length <= 0) {
                        return;
                    }
                    for (File file3 : listFiles) {
                        if (file3.getName().startsWith("libsecuritysdk")) {
                            C116971W2r.LIZ(file3);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m19748a(java.io.File r28, java.io.File r29) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.C1123d.m19748a(java.io.File, java.io.File):boolean");
    }

    /* renamed from: a */
    private synchronized boolean m19737a(String str, String str2, File file, String str3, boolean z) {
        File file2;
        C1129c c1129c;
        if (C1133f.m19692a(this.f21769c)) {
            int i = Build.VERSION.SDK_INT;
            return true;
        } else if (this.f21773g != null) {
            return true;
        } else {
            if (file != null) {
                if (new File(file.getParent(), str3).exists()) {
                    return true;
                }
                str = file.getAbsolutePath();
            }
            if (!z) {
                this.f21768b.m19709a();
            }
            try {
                file2 = new File(str2, str3);
            } catch (Exception e) {
                e = e;
                file2 = null;
            }
            try {
            } catch (Exception e2) {
                e = e2;
                m19756a(100039, 107, e.toString(), m19729c(), m19726c(str), file2 != null ? m19726c(file2.getAbsolutePath()) : "", file != null ? m19726c(file.getAbsolutePath()) : "");
                C1127a.m19715a("", e);
                if (!z) {
                    c1129c = this.f21768b;
                    c1129c.m19708b();
                }
                return false;
            }
            if (file2.exists()) {
                if (!z) {
                    this.f21768b.m19708b();
                }
                return true;
            } else if (C1133f.m19689a(str, str3, file2)) {
                if (!z) {
                    this.f21768b.m19708b();
                }
                return true;
            } else if (C1133f.m19689a(this.f21769c.getApplicationInfo().sourceDir, str3, file2)) {
                if (!z) {
                    this.f21768b.m19708b();
                }
                return true;
            } else {
                if (!z) {
                    c1129c = this.f21768b;
                    c1129c.m19708b();
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m19736a(String str, String str2, boolean z) {
        if (str.trim().length() == 0) {
            return true;
        }
        String[] split = str.split(";");
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.length() != 0) {
                String[] split2 = trim.split(Constants.COLON_SEPARATOR);
                if (split2.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(z);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    m19756a(100040, 199, "nameVersionPair.length != 2", trim, str2, sb2, sb3.toString());
                    throw new SecException(199);
                }
                int indexOf = str2.indexOf(split2[0]);
                if (indexOf >= 0) {
                    int indexOf2 = str2.indexOf("(", indexOf);
                    int indexOf3 = str2.indexOf(")", indexOf);
                    if (indexOf2 < 0 || indexOf3 < 0 || indexOf2 > indexOf3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(indexOf2);
                        String sb5 = sb4.toString();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(indexOf3);
                        String sb7 = sb6.toString();
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(i);
                        m19756a(100040, 199, "indexLeftP < 0 || indexRightP < 0 || indexLeftP > indexRightP", sb5, sb7, "", sb8.toString());
                        throw new SecException(199);
                    }
                    String substring = str2.substring(indexOf2 + 1, indexOf3);
                    if (m19738a(substring, split2[1]) < 0) {
                        String str3 = "version " + substring + " of " + split2[0] + " is not meet the requirement: " + split2[1];
                        if (str2.length() != 0) {
                            str3 = str3 + ", depended by: " + str2;
                        }
                        if (!z) {
                            String str4 = split2[0];
                            String str5 = split2[1];
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(i);
                            m19756a(100040, 113, "versionCompare(parentPluginVersion, nameVersionPair[1]) < 0", substring, str4, str5, sb9.toString());
                        }
                        throw new SecException(str3, 113);
                    }
                } else {
                    C1122c c1122c = this.f21770d.get(split2[0]);
                    if (c1122c == null) {
                        try {
                            c1122c = m19723d(split2[0], str2, !z);
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (c1122c == null) {
                            if (!z) {
                                if (th instanceof SecException) {
                                    throw th;
                                }
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(th);
                                String sb11 = sb10.toString();
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append(i);
                                m19756a(100040, 199, "throwable in loadPluginInner", sb11, str, str2, sb12.toString());
                                throw new SecException(str2, 199);
                            }
                        }
                    }
                    if (m19738a(c1122c.getVersion(), split2[1]) < 0) {
                        String str6 = "version " + c1122c.getVersion() + " of " + split2[0] + " is not meet the requirement: " + split2[1];
                        if (str2.length() != 0) {
                            str6 = str6 + ", depended by: " + str2;
                        }
                        if (!z) {
                            String version = c1122c.getVersion();
                            String str7 = split2[0];
                            String str8 = split2[1];
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(i);
                            m19756a(100040, 113, "versionCompare(dependPlugin.getVersion(), nameVersionPair[1]) < 0", version, str7, str8, sb13.toString());
                        }
                        throw new SecException(str6, 113);
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private C1121b m19735b() {
        C1121b m19763a;
        File file = new File(this.f21777k, "update.config");
        File file2 = new File(this.f21777k, "init.config");
        if (this.f21776j) {
            m19763a = C1121b.m19763a(file);
            if (m19763a == null) {
                return C1121b.m19763a(file2);
            }
            try {
                this.f21768b.m19709a();
                C116971W2r.LIZ(file2);
                file.renameTo(file2);
            } finally {
            }
        } else {
            try {
                this.f21768b.m19709a();
                m19763a = C1121b.m19763a(file2);
            } finally {
            }
        }
        return m19763a;
    }

    /* renamed from: b */
    private File m19732b(String str) {
        String str2 = this.f21773g;
        if (str2 == null) {
            try {
                str2 = this.f21769c.getApplicationInfo().nativeLibraryDir;
            } catch (Exception unused) {
            }
        }
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        new StringBuilder();
        File file = new File(C0002O.m25083C(str2, File.separator, "libsg", str, ".so"));
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    /* renamed from: b */
    private ClassLoader m19730b(String str, String str2, boolean z) {
        if (!z) {
            try {
                this.f21768b.m19709a();
            } finally {
                if (!z) {
                    this.f21768b.m19708b();
                }
            }
        }
        new StringBuilder();
        String m25085C = C0002O.m25085C(this.f21769c.getApplicationInfo().nativeLibraryDir, File.pathSeparator, str2);
        if (this.f21773g != null) {
            new StringBuilder();
            m25085C = C0002O.m25085C(m25085C, File.pathSeparator, this.f21773g);
            C1127a.m19713b(C0002O.m25086C("add path to native classloader ", m25085C));
        }
        if (f21765o != null) {
            new StringBuilder();
            m25085C = C0002O.m25083C(m25085C, File.pathSeparator, this.f21769c.getApplicationInfo().sourceDir, "!/lib/", f21765o);
        }
        return !"6.0.1".equalsIgnoreCase(Build.VERSION.RELEASE) ? new PathClassLoader(str, m25085C, C1123d.class.getClassLoader()) : new DexClassLoader(str, str2, m25085C, C1123d.class.getClassLoader());
    }

    /* renamed from: b */
    private boolean m19734b(File file) {
        try {
            if (!file.getParentFile().getCanonicalPath().equals(file.getCanonicalFile().getParentFile().getCanonicalPath())) {
                return true;
            }
            return true ^ file.getName().equals(file.getCanonicalFile().getName());
        } catch (Exception e) {
            C1127a.m19715a("", e);
            m19756a(100047, 0, e.toString(), file.getAbsolutePath(), "", "", "");
            return false;
        }
    }

    /* renamed from: b */
    private boolean m19733b(File file, File file2) {
        boolean z = false;
        try {
            int i = Build.VERSION.SDK_INT;
            C116971W2r.LIZ("android.system.Os").getDeclaredMethod("symlink", String.class, String.class).invoke(null, file.getAbsolutePath(), file2.getAbsolutePath());
            z = true;
            return true;
        } catch (Exception e) {
            C1127a.m19715a("create symbolic link( " + file2.getAbsolutePath() + " -> " + file.getAbsolutePath() + " ) failed", e);
            String exc = e.toString();
            String absolutePath = file.getAbsolutePath();
            String absolutePath2 = file2.getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.SDK_INT);
            m19756a(100047, 1, exc, absolutePath, absolutePath2, sb.toString(), "");
            return z;
        }
    }

    /* renamed from: b */
    private boolean m19731b(String str, String str2) {
        for (Map.Entry<String, C1122c> entry : this.f21770d.entrySet()) {
            String key = entry.getKey();
            C1122c value = entry.getValue();
            String m19758a = value.m19758a("reversedependencies");
            if (m19758a != null) {
                String[] split = m19758a.split(";");
                for (int i = 0; i < split.length; i++) {
                    String trim = split[i].trim();
                    if (trim.length() != 0) {
                        String[] split2 = trim.split(Constants.COLON_SEPARATOR);
                        if (split2.length != 2) {
                            m19756a(100041, 199, "nameVersionPair.length != 2", str + "(" + str2 + ")", key + "(" + value.getVersion() + ")", m19726c(value.getPluginPath()), m19758a);
                            throw new SecException(199);
                        } else if (split2[0].equalsIgnoreCase(str) && m19738a(str2, split2[1]) < 0) {
                            String str3 = "plugin " + str + "(" + str2 + ") is not meet the reverse dependency of " + key + "(" + value.getVersion() + "): " + split2[0] + "(" + split2[1] + ")";
                            String obj = C1123d.class.getClassLoader().toString();
                            String m19726c = m19726c(value.getPluginPath());
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            m19756a(100041, 117, str3, obj, m19726c, m19758a, sb.toString());
                            throw new SecException(str3, 117);
                        }
                    }
                }
                continue;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
        if (r5 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0055, code lost:
        if (r5 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r3 == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[Catch: all -> 0x013e, TryCatch #0 {all -> 0x013e, blocks: (B:65:0x004b, B:24:0x0095, B:27:0x009d, B:36:0x00ad, B:38:0x00b7, B:42:0x00bd, B:44:0x00c3, B:45:0x00c9, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f4, B:54:0x00fd, B:55:0x0103, B:57:0x011c, B:59:0x012f, B:60:0x0128, B:12:0x0057, B:14:0x005d, B:16:0x0063, B:18:0x0071, B:22:0x0089, B:20:0x0090), top: B:64:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[EDGE_INSN: B:34:0x00ac->B:35:0x00ac ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[Catch: all -> 0x013e, TryCatch #0 {all -> 0x013e, blocks: (B:65:0x004b, B:24:0x0095, B:27:0x009d, B:36:0x00ad, B:38:0x00b7, B:42:0x00bd, B:44:0x00c3, B:45:0x00c9, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f4, B:54:0x00fd, B:55:0x0103, B:57:0x011c, B:59:0x012f, B:60:0x0128, B:12:0x0057, B:14:0x005d, B:16:0x0063, B:18:0x0071, B:22:0x0089, B:20:0x0090), top: B:64:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[Catch: all -> 0x013e, TryCatch #0 {all -> 0x013e, blocks: (B:65:0x004b, B:24:0x0095, B:27:0x009d, B:36:0x00ad, B:38:0x00b7, B:42:0x00bd, B:44:0x00c3, B:45:0x00c9, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f4, B:54:0x00fd, B:55:0x0103, B:57:0x011c, B:59:0x012f, B:60:0x0128, B:12:0x0057, B:14:0x005d, B:16:0x0063, B:18:0x0071, B:22:0x0089, B:20:0x0090), top: B:64:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0049  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.wireless.security.framework.C1123d.C1126a m19725c(java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.C1123d.m19725c(java.lang.String, java.lang.String, boolean):com.alibaba.wireless.security.framework.d$a");
    }

    /* renamed from: c */
    private String m19729c() {
        StringBuilder sb = new StringBuilder();
        File file = this.f21777k;
        if (file == null || !file.exists() || !file.isDirectory()) {
            sb.append("not exists!");
        } else {
            try {
                sb.append("[");
                File[] listFiles = file.listFiles();
                for (int i = 0; listFiles != null && i < listFiles.length; i++) {
                    File file2 = listFiles[i];
                    if (file2.getName().startsWith("libsg") && (file2.getName().endsWith("zip") || file2.getName().endsWith(".so"))) {
                        sb.append(file2.getName());
                        sb.append("(");
                        sb.append(m19734b(file2) + " , ");
                        sb.append(file2.length());
                        sb.append(") , ");
                    }
                }
                sb.append("]");
            } catch (Throwable unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private String m19726c(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (m19734b(file)) {
            sb.append("->");
            try {
                sb.append(file.getCanonicalPath());
            } catch (Exception unused) {
            }
        }
        sb.append(LoggerUtil.M_LEFT_TAG);
        sb.append("exists:" + file.exists() + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("size:" + file.length() + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("canRead:" + file.canRead() + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("canWrite:" + file.canWrite() + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("totalSpace:" + file.getTotalSpace() + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("freeSpace:" + file.getFreeSpace() + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(LoggerUtil.M_RIGHT_TAG);
        return sb.toString();
    }

    /* renamed from: c */
    private boolean m19728c(File file) {
        if (file != null) {
            try {
                String absolutePath = file.getAbsolutePath();
                if (absolutePath == null || absolutePath.length() <= 0) {
                    return false;
                }
                if (C1133f.m19692a(this.f21769c)) {
                    return true;
                }
                return !absolutePath.startsWith("/system/");
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m19727c(File file, File file2) {
        try {
            return file.getCanonicalPath().equals(file2.getCanonicalPath());
        } catch (Exception e) {
            C1127a.m19715a("", e);
            m19756a(100046, 0, e.toString(), file.getAbsolutePath(), file2.getAbsolutePath(), "", "");
            return false;
        }
    }

    /* renamed from: d */
    private synchronized ISGPluginInfo m19723d(String str, String str2, boolean z) {
        StringBuilder sb;
        String m19718a = C1127a.m19718a();
        long m19714b = C1127a.m19714b();
        C1122c c1122c = this.f21770d.get(str);
        if (c1122c != null) {
            return c1122c;
        }
        if (this.f21777k == null || !this.f21777k.exists()) {
            m19757a();
        }
        C1126a m19725c = m19725c(str, str2, z);
        if (m19725c == null || m19725c.f21786a == null || !m19725c.f21786a.exists()) {
            if (!z) {
                return null;
            }
            String str3 = "plugin " + str + " not existed";
            if (str2.length() != 0) {
                str3 = str3 + ", depended by " + str2;
            }
            m19756a(100044, 110, "", str, str2, "", "");
            throw new SecException(str3, 110);
        }
        C1127a.m19716a(str, m19718a, "getPluginFile", m19714b);
        long m19714b2 = C1127a.m19714b();
        C1122c m19743a = m19743a(str, m19725c, this.f21769c, str2);
        if (m19743a == null) {
            if (m19725c.f21788c != null) {
                sb = new StringBuilder("src:");
                sb.append(m19726c(m19725c.f21788c.getAbsolutePath()));
            } else {
                sb = new StringBuilder("zipfile:");
                sb.append(m19726c(m19725c.f21786a.getAbsolutePath()));
            }
            m19756a(100044, 110, "", str, str2, sb.toString(), "");
            throw new SecException(str, 111);
        }
        C1127a.m19716a(str, m19718a, "loadApk", m19714b2);
        this.f21770d.put(str, m19743a);
        final String str4 = str + "(" + m19743a.getVersion() + ")";
        final String m19758a = m19743a.m19758a("weakdependencies");
        if (str2.length() != 0) {
            str4 = str2 + "->" + str4;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || myLooper == Looper.getMainLooper()) {
            C1127a.m19717a("looper of current thread is null, try to create a new thread with a looper");
            HandlerThread handlerThread = new HandlerThread("SGBackgroud");
            handlerThread.start();
            myLooper = handlerThread.getLooper();
        }
        new Handler(myLooper).postDelayed(new Runnable() { // from class: com.alibaba.wireless.security.framework.d.2
            static {
                Covode.recordClassIndex(4548);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1123d.this.m19736a(m19758a, str4, true);
                } catch (SecException e) {
                    C1127a.m19715a("load weak dependency", e);
                }
            }
        }, 60000L);
        return m19743a;
    }

    /* renamed from: d */
    private File m19724d(File file) {
        if (file.exists() && file.isDirectory() && this.f21776j) {
            File file2 = new File(file, "main");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (file2.exists()) {
                return file2;
            }
        }
        return file;
    }

    /* renamed from: a */
    public void m19753a(Context context, String str, String str2, boolean z, Object... objArr) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f21769c = context;
        this.f21774h = str;
        this.f21776j = C1133f.m19686c(this.f21769c);
        this.f21772f = z;
        UserTrackMethodJniBridge.init(this.f21769c);
        if (str2 != null && !str2.isEmpty()) {
            this.f21773g = str2;
        }
        try {
            m19757a();
        } catch (SecException unused) {
        }
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public synchronized <T> T getInterface(Class<T> cls) {
        Object obj = this.f21767a.get(cls);
        if (obj != null) {
            return cls.cast(obj);
        }
        String str = null;
        if (this.f21775i != null && ((str = this.f21775i.m19759d()) == null || str.length() == 0)) {
            str = this.f21775i.m19762a(cls.getName());
        }
        if (str == null || str.length() == 0) {
            str = m19746a((Class<?>) cls);
        }
        if (str == null || str.length() == 0) {
            throw new SecException(150);
        }
        ISGPluginInfo pluginInfo = getPluginInfo(str);
        if (pluginInfo == null) {
            throw new SecException(110);
        }
        Object obj2 = pluginInfo.getSGPluginEntry().getInterface(cls);
        if (obj2 != null) {
            this.f21767a.put(cls, obj2);
            return cls.cast(obj2);
        }
        String name = cls.getName();
        new StringBuilder();
        m19756a(100045, 112, "", name, C0002O.m25084C(str, "(", pluginInfo.getVersion(), ")"), m19726c(pluginInfo.getPluginPath()), "");
        throw new SecException(112);
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public String getMainPluginName() {
        return "main";
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public ISGPluginInfo getPluginInfo(String str) {
        return m19723d(str, "", true);
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public IRouterComponent getRouter() {
        return this.f21771e;
    }
}
