package cn.com.chinatelecom.account.api.p038e;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.umeng.analytics.pro.C33764r;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.UUID;
import java.util.regex.Pattern;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C86291JzR;

/* renamed from: cn.com.chinatelecom.account.api.e.d */
/* loaded from: classes2.dex */
public class C0669d {

    /* renamed from: a */
    public static final Pattern f20997a = C116971W2r.LIZJ("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    public static String f20998b = "";

    static {
        Covode.recordClassIndex(2720);
        C0669d.class.getCanonicalName();
    }

    /* renamed from: a */
    public static String m20638a() {
        String uuid = UUID.randomUUID().toString();
        try {
            uuid = UUID.nameUUIDFromBytes((uuid + System.currentTimeMillis() + Math.random()).getBytes("utf8")).toString();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return !TextUtils.isEmpty(uuid) ? uuid.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "") : uuid;
    }

    /* renamed from: a */
    public static String m20637a(Context context) {
        if (TextUtils.isEmpty(f20998b)) {
            String m20640b = C0668c.m20640b(context, "key_d_i_u", "");
            f20998b = m20640b;
            if (TextUtils.isEmpty(m20640b)) {
                f20998b = m20621e(context);
                String str = f20998b;
                if (!TextUtils.isEmpty(str) && context != null) {
                    C0668c.m20645a(context, "key_d_i_u", str);
                }
            }
        }
        return f20998b;
    }

    /* renamed from: a */
    public static String m20636a(Context context, String str) {
        try {
            Class LIZ = C116971W2r.LIZ(context.getClassLoader(), C0678m.m20564a(new byte[]{C86291JzR.LIZJ, 2, 8, 30, 3, 5, 8, 66, 3, 31, 66, 28, 30, 3, 28, 9, 30, 24, 5, 9, 31}));
            return (String) LIZ.getMethod("get", String.class).invoke(LIZ, str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m20635a(Object obj, String str) {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, new Class[0]);
        declaredMethod.setAccessible(true);
        return ((Boolean) m20626xa33360a7(declaredMethod, obj, new Object[0])).booleanValue();
    }

    /* renamed from: a */
    public static boolean m20634a(String str) {
        return str != null && f20997a.matcher(str).matches();
    }

    /* renamed from: b */
    public static String m20631b(String str) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length << 1];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static StringBuffer m20633b() {
        StringBuffer stringBuffer = new StringBuffer();
        Enumeration m20625x36694500 = m20625x36694500();
        while (m20625x36694500.hasMoreElements()) {
            NetworkInterface networkInterface = (NetworkInterface) m20625x36694500.nextElement();
            String name = networkInterface.getName();
            if (name == null || (!name.contains("wlan") && !name.equals("eth0"))) {
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && !nextElement.isLinkLocalAddress()) {
                        String hostAddress = nextElement.getHostAddress();
                        if (!TextUtils.isEmpty(hostAddress)) {
                            if (stringBuffer.length() > 0) {
                                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            }
                            stringBuffer.append(hostAddress);
                        }
                    }
                }
            }
        }
        return stringBuffer;
    }

    /* renamed from: b */
    public static boolean m20632b(Context context) {
        String host;
        int port;
        int i = Build.VERSION.SDK_INT;
        String m20564a = C0678m.m20564a(new byte[]{4, 24, 24, 28, 66, 28, 30, 3, 20, 21, 36, 3, 31, 24});
        String m20564a2 = C0678m.m20564a(new byte[]{4, 24, 24, 28, 66, 28, 30, 3, 20, 21, 60, 3, 30, 24});
        if (1 != 0) {
            host = System.getProperty(m20564a);
            String property = System.getProperty(m20564a2);
            if (property == null) {
                property = C33764r.f42396f;
            }
            port = Integer.parseInt(property);
        } else {
            host = Proxy.getHost(context);
            port = Proxy.getPort(context);
        }
        return !TextUtils.isEmpty(host) && port != -1;
    }

    /* renamed from: c */
    public static boolean m20630c() {
        String m20564a = C0678m.m20564a(new byte[]{67, 31, 21, 31, 24, 9, 1, 67, 14, 5, 2, 67, 31, 25});
        String m20564a2 = C0678m.m20564a(new byte[]{67, 31, 21, 31, 24, 9, 1, 67, 20, 14, 5, 2, 67, 31, 25});
        if (!new File(m20564a).exists() || !m20628c(m20564a)) {
            return new File(m20564a2).exists() && m20628c(m20564a2);
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m20629c(Context context) {
        return m20619f(context) || m20622e() || m20620f();
    }

    /* renamed from: c */
    public static boolean m20628c(String str) {
        boolean z;
        MethodCollector.m14708i(186);
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("ls -l ".concat(String.valueOf(str)));
            String readLine = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
            if (readLine != null && readLine.length() >= 4) {
                char charAt = readLine.charAt(3);
                if (charAt == 's' || charAt == 'x') {
                    process.destroy();
                    z = true;
                    MethodCollector.m14707o(186);
                    return z;
                }
            }
            process.destroy();
            z = false;
            MethodCollector.m14707o(186);
            return z;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            MethodCollector.m14707o(186);
            throw th;
        }
    }

    /* renamed from: cn_com_chinatelecom_account_api_e_d_android_provider_Settings$Secure_getString */
    public static String m20627x75a016bb(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZ = C116971W2r.LIZ(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(LIZ, Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "cn_com_chinatelecom_account_api_e_d_android_provider_Settings$Secure_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return LIZ;
    }

    /* renamed from: cn_com_chinatelecom_account_api_e_d_java_lang_reflect_Method_invoke */
    public static Object m20626xa33360a7(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "cn_com_chinatelecom_account_api_e_d_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "cn_com_chinatelecom_account_api_e_d_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    /* renamed from: cn_com_chinatelecom_account_api_e_d_java_net_NetworkInterface_getNetworkInterfaces */
    public static Enumeration m20625x36694500() {
        ActionInvokeEntrance.setEventUuid(100016);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(NetworkInterface.class, new Object[0], 100016, "java.util.Enumeration", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Enumeration) actionIntercept.second;
        }
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        ActionInvokeEntrance.actionInvoke(networkInterfaces, NetworkInterface.class, new Object[0], 100016, "cn_com_chinatelecom_account_api_e_d_java_net_NetworkInterface_getNetworkInterfaces()Ljava/util/Enumeration;");
        return networkInterfaces;
    }

    /* renamed from: d */
    public static boolean m20624d() {
        Enumeration m20625x36694500 = m20625x36694500();
        if (m20625x36694500 != null) {
            while (m20625x36694500.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) m20625x36694500.nextElement();
                if (networkInterface.isUp() && !networkInterface.getInterfaceAddresses().isEmpty()) {
                    String m20564a = C0678m.m20564a(new byte[]{24, 25, 2, 92});
                    String m20564a2 = C0678m.m20564a(new byte[]{28, 28, 28, 92});
                    if (m20564a.equals(networkInterface.getName()) || m20564a2.equals(networkInterface.getName())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0245, code lost:
        if (r3 == null) goto L79;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m20623d(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.p038e.C0669d.m20623d(android.content.Context):boolean");
    }

    /* renamed from: e */
    public static String m20621e(Context context) {
        String lowerCase;
        try {
            String m20627x75a016bb = m20627x75a016bb(context.getContentResolver(), "android_id");
            lowerCase = !TextUtils.isEmpty(m20627x75a016bb) ? m20627x75a016bb.toLowerCase() : UUID.randomUUID().toString();
            new StringBuilder();
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(lowerCase) ? m20631b(C0002O.m25086C(lowerCase, "default")) : "default";
    }

    /* renamed from: e */
    public static boolean m20622e() {
        BufferedReader bufferedReader;
        MethodCollector.m14708i(188);
        try {
            String m20564a = C0678m.m20564a(new byte[]{67, 28, 30, 3, 15, 67});
            String m20564a2 = C0678m.m20564a(new byte[]{67, 1, C86291JzR.LIZJ, 28, 31});
            String m20564a3 = C0678m.m20564a(new byte[]{15, 3, 1, 66, 31, C86291JzR.LIZJ, 25, 30, 5, 7, 66, 31, 25, 14, 31, 24, 30, C86291JzR.LIZJ, 24, 9});
            String m20564a4 = C0678m.m20564a(new byte[]{52, 28, 3, 31, 9, 8, 46, 30, 5, 8, 11, 9, 66, 6, C86291JzR.LIZJ, 30});
            HashSet<String> hashSet = new HashSet();
            FileReader fileReader = new FileReader(m20564a + Process.myPid() + m20564a2);
            try {
                bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (readLine.endsWith(".so") || readLine.endsWith(".jar")) {
                            hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        MethodCollector.m14707o(188);
                        throw th;
                    }
                }
                for (String str : hashSet) {
                    if (str.contains(m20564a3)) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        try {
                            fileReader.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                        MethodCollector.m14707o(188);
                        return true;
                    } else if (str.contains(m20564a4)) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        try {
                            fileReader.close();
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        MethodCollector.m14707o(188);
                        return true;
                    }
                }
                try {
                    bufferedReader.close();
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                try {
                    fileReader.close();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                MethodCollector.m14707o(188);
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: f */
    public static boolean m20620f() {
        try {
            throw new Exception("we have exception");
        } catch (Exception e) {
            String m20564a = C0678m.m20564a(new byte[]{15, 3, 1, 66, C86291JzR.LIZJ, 2, 8, 30, 3, 5, 8, 66, 5, 2, 24, 9, 30, 2, C86291JzR.LIZJ, 0, 66, 3, 31, 66, 54, 21, 11, 3, 24, 9, 37, 2, 5, 24});
            String m20564a2 = C0678m.m20564a(new byte[]{8, 9, 66, 30, 3, 14, 26, 66, C86291JzR.LIZJ, 2, 8, 30, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 52, 28, 3, 31, 9, 8, 46, 30, 5, 8, 11, 9});
            String m20564a3 = C0678m.m20564a(new byte[]{8, 9, 66, 30, 3, 14, 26, 66, C86291JzR.LIZJ, 2, 8, 30, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 52, 28, 3, 31, 9, 8, 46, 30, 5, 8, 11, 9});
            String m20564a4 = C0678m.m20564a(new byte[]{5, 2, 26, 3, 7, 9, 8});
            String m20564a5 = C0678m.m20564a(new byte[]{1, C86291JzR.LIZJ, 5, 2});
            String m20564a6 = C0678m.m20564a(new byte[]{4, C86291JzR.LIZJ, 2, 8, 0, 9, 36, 3, 3, 7, 9, 8, 33, 9, 24, 4, 3, 8});
            String m20564a7 = C0678m.m20564a(new byte[]{15, 3, 1, 66, 31, C86291JzR.LIZJ, 25, 30, 5, 7, 66, 31, 25, 14, 31, 24, 30, C86291JzR.LIZJ, 24, 9, 66, 33, 63, 72, 94});
            StackTraceElement[] stackTrace = e.getStackTrace();
            int i = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getClassName().equals(m20564a) && (i = i + 1) == 2) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals(m20564a7) && stackTraceElement.getMethodName().equals(m20564a4)) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals(m20564a2) && stackTraceElement.getMethodName().equals(m20564a5)) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals(m20564a3) && stackTraceElement.getMethodName().equals(m20564a6)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|2|3|(7:5|6|7|(2:9|(1:14)(1:12))|15|(0)|14)|19|6|7|(0)|15|(0)|14) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m20619f(android.content.Context r6) {
        /*
            r0 = 32
            byte[] r0 = new byte[r0]
            r0 = {x003a: FILL_ARRAY_DATA  , data: [8, 9, 66, 30, 3, 14, 26, 66, 13, 2, 8, 30, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 5, 2, 31, 24, 13, 0, 0, 9, 30} // fill-array
            java.lang.String r1 = cn.com.chinatelecom.account.api.p038e.C0678m.m20564a(r0)
            r0 = 20
            byte[] r0 = new byte[r0]
            r0 = {x004e: FILL_ARRAY_DATA  , data: [15, 3, 1, 66, 31, 13, 25, 30, 5, 7, 66, 31, 25, 14, 31, 24, 30, 13, 24, 9} // fill-array
            java.lang.String r5 = cn.com.chinatelecom.account.api.p038e.C0678m.m20564a(r0)
            r4 = 2
            r3 = 1
            r2 = 0
            android.content.Context r0 = r6.createPackageContext(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            if (r0 == 0) goto L25
            r1 = 1
            goto L26
        L21:
            r0 = move-exception
            r0.printStackTrace()
        L25:
            r1 = 0
        L26:
            android.content.Context r0 = r6.createPackageContext(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
            if (r0 == 0) goto L32
            r0 = 1
            goto L33
        L2e:
            r0 = move-exception
            r0.printStackTrace()
        L32:
            r0 = 0
        L33:
            if (r1 != 0) goto L38
            if (r0 != 0) goto L38
            return r2
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.p038e.C0669d.m20619f(android.content.Context):boolean");
    }
}
