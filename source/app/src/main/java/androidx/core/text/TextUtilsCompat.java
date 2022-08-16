package androidx.core.text;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class TextUtilsCompat {
    public static final Locale ROOT = new Locale("", "");

    static {
        Covode.recordClassIndex(1032);
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static String htmlEncode(String str) {
        int i = Build.VERSION.SDK_INT;
        return TextUtils.htmlEncode(str);
    }

    public static int getLayoutDirectionFromFirstChar(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        if (directionality != 1 && directionality != 2) {
            return 0;
        }
        return 1;
    }
}
