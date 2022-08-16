package anet.channel.util;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.bytedance.covode.number.Covode;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class HttpHelper {
    static {
        Covode.recordClassIndex(2367);
    }

    public static int parseContentLength(Map<String, List<String>> map) {
        try {
            return Integer.parseInt(getSingleHeaderFieldByKey(map, "Content-Length"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String trySolveFileExtFromURL(URL url) {
        return trySolveFileExtFromUrlPath(url.getPath());
    }

    public static long parseServerRT(Map<String, List<String>> map) {
        try {
            List<String> list = map.get("s-rt");
            if (list != null && !list.isEmpty()) {
                return Long.parseLong(list.get(0));
            }
            return 0L;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static int parseStatusCode(Map<String, List<String>> map) {
        try {
            List<String> list = map.get(":status");
            if (list != null && !list.isEmpty()) {
                return Integer.parseInt(list.get(0));
            }
        } catch (NumberFormatException unused) {
        }
        return 0;
    }

    public static Map<String, List<String>> cloneMap(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return hashMap;
    }

    public static String trySolveFileExtFromUrlPath(String str) {
        int lastIndexOf;
        int lastIndexOf2;
        if (str == null) {
            return null;
        }
        try {
            int length = str.length();
            if (length <= 1 || (lastIndexOf = str.lastIndexOf(47)) == -1 || lastIndexOf == length - 1 || (lastIndexOf2 = str.lastIndexOf(46)) == -1 || lastIndexOf2 <= lastIndexOf) {
                return null;
            }
            return str.substring(lastIndexOf2 + 1, length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean checkRedirect(Request request, int i) {
        if (request.isRedirectEnable() && i >= 300 && i < 400 && i != 304 && request.getRedirectTimes() < 10) {
            return true;
        }
        return false;
    }

    public static String getSingleHeaderFieldByKey(Map<String, List<String>> map, String str) {
        List<String> headerFieldByKey = getHeaderFieldByKey(map, str);
        if (headerFieldByKey != null && !headerFieldByKey.isEmpty()) {
            return headerFieldByKey.get(0);
        }
        return null;
    }

    public static List<String> getHeaderFieldByKey(Map<String, List<String>> map, String str) {
        if (map != null && !map.isEmpty() && !TextUtils.isEmpty(str)) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (str.equalsIgnoreCase(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public static void removeHeaderFiledByKey(Map<String, List<String>> map, String str) {
        if (str == null) {
            return;
        }
        for (String str2 : map.keySet()) {
            if (str.equalsIgnoreCase(str2)) {
                map.remove(str);
                return;
            }
        }
    }
}
