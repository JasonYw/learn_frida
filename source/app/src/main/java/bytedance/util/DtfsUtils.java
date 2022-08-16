package bytedance.util;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public class DtfsUtils {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(2575);
    }

    public static void LIZ(int i) {
        boolean z = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, LIZ, true, 2).isSupported;
    }

    public static boolean LIZ() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    public static boolean LIZIZ() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean isAndroidQOrLater() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static void LIZ(InputStream inputStream) {
        if (PatchProxy.proxy(new Object[]{inputStream}, null, LIZ, true, 4).isSupported || inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    public static void LIZ(OutputStream outputStream) {
        if (PatchProxy.proxy(new Object[]{outputStream}, null, LIZ, true, 5).isSupported || outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    public static Bundle LIZ(String str, String[] strArr, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, strArr, Integer.valueOf(i), Integer.valueOf(i2)}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (Bundle) proxy.result;
        }
        Bundle bundle = new Bundle();
        if (isAndroidQOrLater()) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", "_id DESC");
            if (isAndroidQOrLater() && i > 0) {
                bundle.putString("android:query-arg-sql-limit", i + " offset " + i2);
            }
        }
        return bundle;
    }
}
