package anet.channel.strategy.utils;

import android.text.TextUtils;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: anet.channel.strategy.utils.c */
/* loaded from: classes2.dex */
public class C0579c {
    static {
        Covode.recordClassIndex(2348);
    }

    /* renamed from: d */
    public static String m20791d(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m20796a(long j) {
        StringBuilder sb = new StringBuilder(16);
        long j2 = 1000000000;
        do {
            sb.append(j / j2);
            sb.append('.');
            j %= j2;
            j2 /= 1000;
        } while (j2 > 0);
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m20793b(String str) {
        int i;
        boolean z;
        int i2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 2) {
            return false;
        }
        if (charArray[0] == ':') {
            if (charArray[1] != ':') {
                return false;
            }
            i = 1;
            z = false;
            i2 = 1;
        } else {
            i = 0;
            z = false;
            i2 = 0;
        }
        int i3 = 0;
        boolean z2 = true;
        while (i < charArray.length) {
            char c = charArray[i];
            int digit = Character.digit(c, 16);
            if (digit != -1) {
                i3 = (i3 << 4) + digit;
                if (i3 > 65535) {
                    return false;
                }
                z2 = false;
            } else if (c != ':' || (i2 = i2 + 1) > 7) {
                return false;
            } else {
                if (z2) {
                    if (z) {
                        return false;
                    }
                    z = true;
                } else {
                    i3 = 0;
                    z2 = true;
                }
            }
            i++;
        }
        if (!z && i2 < 7) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m20792c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray.length > 255) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] < 'A' || charArray[i] > 'Z') && ((charArray[i] < 'a' || charArray[i] > 'z') && charArray[i] != '*')) {
                if ((charArray[i] < '0' || charArray[i] > '9') && charArray[i] != '.' && charArray[i] != '-') {
                    return false;
                }
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m20795a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 7 || charArray.length > 15) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                i2 = ((i2 * 10) + c) - 48;
                if (i2 > 255) {
                    return false;
                }
            } else if (c != '.' || (i = i + 1) > 3) {
                return false;
            } else {
                i2 = 0;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m20794a(Map<String, String> map, String str) {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder(64);
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        sb.append(URLEncoder.encode(entry.getKey(), str));
                        sb.append("=");
                        sb.append(URLEncoder.encode(m20791d(entry.getValue()), str).replace("+", "%20"));
                        sb.append("&");
                    }
                }
                sb.deleteCharAt(sb.length() - 1);
            } catch (UnsupportedEncodingException e) {
                ALog.m20787e("Request", "format params failed", null, e, new Object[0]);
            }
            return sb.toString();
        }
        return "";
    }
}
