package com.alibaba.sdk.android.httpdns;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.util.regex.Pattern;
import p003X.C116971W2r;

/* renamed from: com.alibaba.sdk.android.httpdns.l */
/* loaded from: classes26.dex */
public class C1078l {

    /* renamed from: a */
    public static Pattern f21618a = C116971W2r.LIZJ("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    static {
        Covode.recordClassIndex(4484);
    }

    /* renamed from: a */
    public static String m19877a(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            while (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m19876b(String str) {
        if (str != null) {
            try {
                char[] charArray = str.toCharArray();
                if (charArray.length <= 0 || charArray.length > 255) {
                    return false;
                }
                for (char c : charArray) {
                    if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '.' || c == '-'))) {
                        return false;
                    }
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m19875c(String str) {
        return str != null && str.length() >= 7 && str.length() <= 15 && !str.equals("") && f21618a.matcher(str).matches();
    }
}
