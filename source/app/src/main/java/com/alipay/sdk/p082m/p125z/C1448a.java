package com.alipay.sdk.p082m.p125z;

import android.util.Base64;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.z.a */
/* loaded from: classes26.dex */
public final class C1448a {
    static {
        Covode.recordClassIndex(4949);
    }

    /* renamed from: a */
    public static String m18663a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static String m18662a(Map<String, String> map, String str, String str2) {
        String str3;
        return (map == null || (str3 = map.get(str)) == null) ? str2 : str3;
    }

    /* renamed from: a */
    public static boolean m18665a(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m18664a(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: b */
    public static String m18660b(String str, String str2) {
        try {
            return (String) C116971W2r.LIZ("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: b */
    public static boolean m18661b(String str) {
        return !m18665a(str);
    }

    /* renamed from: c */
    public static boolean m18659c(String str) {
        byte[] bytes;
        for (byte b : str.getBytes()) {
            if (b >= 0 && (b <= 31 || b >= Byte.MAX_VALUE)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static String m18658d(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: e */
    public static String m18657e(String str) {
        try {
            if (m18665a(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(C34037f.f43302f));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String m18656f(String str) {
        try {
            ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
            order.putInt(str.length());
            byte[] array = order.array();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(C34037f.f43302f));
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] bArr = new byte[byteArrayOutputStream.toByteArray().length + 4];
            System.arraycopy(array, 0, bArr, 0, 4);
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, 4, byteArrayOutputStream.toByteArray().length);
            return Base64.encodeToString(bArr, 8);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    public static String m18655g(String str) {
        if (m18665a(str)) {
            return "";
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("utf-8"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
            while (true) {
                int read = byteArrayInputStream.read(bArr, 0, AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END);
                if (read == -1) {
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    byteArrayInputStream.close();
                    return new String(Base64.encode(byteArray, 2));
                }
                gZIPOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
