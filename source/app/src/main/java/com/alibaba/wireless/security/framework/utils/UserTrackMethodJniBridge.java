package com.alibaba.wireless.security.framework.utils;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.umeng.message.proguard.C34037f;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public class UserTrackMethodJniBridge {

    /* renamed from: a */
    public static Context f21790a;

    /* renamed from: b */
    public static String f21791b;

    /* renamed from: c */
    public static int f21792c;

    /* renamed from: d */
    public static int f21793d;

    /* renamed from: e */
    public static int f21794e;

    /* renamed from: f */
    public static int f21795f;

    /* renamed from: g */
    public static Class f21796g;

    /* renamed from: h */
    public static Class f21797h;

    /* renamed from: i */
    public static Class f21798i;

    /* renamed from: j */
    public static Constructor f21799j;

    /* renamed from: k */
    public static Method f21800k;

    /* renamed from: l */
    public static Method f21801l;

    /* renamed from: m */
    public static Method f21802m;

    /* renamed from: n */
    public static Method f21803n;

    /* renamed from: o */
    public static final char[] f21804o = "0123456789abcdef".toCharArray();

    static {
        Covode.recordClassIndex(4550);
    }

    /* renamed from: a */
    public static synchronized String m19722a() {
        String substring;
        synchronized (UserTrackMethodJniBridge.class) {
            if (f21791b == null || f21791b.length() == 0) {
                f21791b = m19720b();
            }
            substring = f21791b.substring(0, f21791b.length() / 8);
        }
        return substring;
    }

    /* renamed from: a */
    public static String m19721a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            return URLEncoder.encode(str, C34037f.f43302f);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int addUtRecord(String str, int i, int i2, String str2, long j, String str3, String str4, String str5, String str6, String str7) {
        Map map;
        Object m19719x47a32b7c;
        Object m19719x47a32b7c2;
        if (utAvaiable() != 0 && str != null && str.length() != 0) {
            if (str2 == null) {
                str2 = "";
            }
            try {
                String valueOf = String.valueOf(i % 100);
                HashMap hashMap = new HashMap();
                hashMap.put("plugin", String.valueOf(i2));
                hashMap.put("pid", String.valueOf(Process.myPid()));
                hashMap.put("tid", String.valueOf(Thread.currentThread().getId()));
                hashMap.put("time", String.valueOf(j));
                if (f21793d == 0) {
                    f21792c = C1133f.m19686c(f21790a) ? 1 : 0;
                    f21793d = 1;
                }
                hashMap.put("ui", String.valueOf(f21792c));
                hashMap.put("sid", m19722a());
                hashMap.put("uuid", m19720b());
                hashMap.put("msg", m19721a(str3));
                hashMap.put("rsv1", m19721a(str4));
                hashMap.put("rsv2", m19721a(str5));
                hashMap.put("rsv3", m19721a(str6));
                hashMap.put("rsv4", m19721a(str7));
                Object newInstance = f21799j.newInstance("Page_SecurityGuardSDK", 19999, str, str2, valueOf, hashMap);
                if (newInstance != null && (map = (Map) m19719x47a32b7c(f21800k, newInstance, new Object[0])) != null && map.size() != 0 && (m19719x47a32b7c = m19719x47a32b7c(f21801l, f21797h, new Object[0])) != null && (m19719x47a32b7c2 = m19719x47a32b7c(f21802m, m19719x47a32b7c, new Object[0])) != null) {
                    m19719x47a32b7c(f21803n, m19719x47a32b7c2, new Object[]{map});
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static String m19720b() {
        try {
            String uuid = UUID.randomUUID().toString();
            String valueOf = String.valueOf(System.nanoTime());
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            new StringBuilder();
            return bytesToHex(messageDigest.digest(C0002O.m25086C(uuid, valueOf).getBytes(C34037f.f43302f)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f21804o;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: com_alibaba_wireless_security_framework_utils_UserTrackMethodJniBridge_java_lang_reflect_Method_invoke */
    public static Object m19719x47a32b7c(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alibaba_wireless_security_framework_utils_UserTrackMethodJniBridge_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alibaba_wireless_security_framework_utils_UserTrackMethodJniBridge_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    public static String getStackTrace(int i, int i2) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length <= 0 || i <= 0 || i2 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        for (int i4 = 0; i4 < stackTrace.length && i3 < i2 && sb.length() < i; i4++) {
            if (i4 > 1) {
                i3++;
                StackTraceElement stackTraceElement = stackTrace[i4];
                sb.append(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
                if (i4 < stackTrace.length - 1) {
                    sb.append("#");
                }
            }
        }
        return sb.toString();
    }

    public static void init(Context context) {
        if (context != null) {
            f21790a = context;
        }
    }

    public static int utAvaiable() {
        if (f21795f == 0) {
            synchronized (UserTrackMethodJniBridge.class) {
                if (f21795f == 0) {
                    try {
                        f21796g = C116971W2r.LIZ("com.ut.mini.internal.UTOriginalCustomHitBuilder");
                        f21797h = C116971W2r.LIZ("com.ut.mini.UTAnalytics");
                        f21798i = C116971W2r.LIZ("com.ut.mini.UTTracker");
                        f21799j = f21796g.getConstructor(String.class, Integer.TYPE, String.class, String.class, String.class, Map.class);
                        f21800k = f21796g.getMethod("build", new Class[0]);
                        f21801l = f21797h.getMethod("getInstance", new Class[0]);
                        f21802m = f21797h.getMethod("getDefaultTracker", new Class[0]);
                        f21803n = f21798i.getMethod("send", Map.class);
                        f21794e = 1;
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    }
                    f21795f = 1;
                }
            }
        }
        return f21794e;
    }
}
