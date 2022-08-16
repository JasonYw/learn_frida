package anet.channel.util;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class StringUtils {
    public static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String stringNull2Empty(String str) {
        return str == null ? "" : str;
    }

    static {
        Covode.recordClassIndex(2370);
    }

    public static String bytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        return bytesToHexString(bArr, DIGITS_LOWER);
    }

    public static boolean isNotBlank(String str) {
        if (!isBlank(str)) {
            return true;
        }
        return false;
    }

    public static boolean isBlank(String str) {
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

    public static String md5ToHex(String str) {
        if (str == null) {
            return null;
        }
        try {
            return bytesToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String buildKey(String str, String str2) {
        return concatString(str, "://", str2);
    }

    public static boolean isStringEqual(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                return false;
            }
            return true;
        } else if (!str.equals(str2)) {
            return false;
        } else {
            return true;
        }
    }

    public static String concatString(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String simplifyString(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        return concatString(str.substring(0, i), "......");
    }

    public static String bytesToHexString(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return new String(cArr2);
    }

    public static String concatString(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + str3.length());
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }
}
