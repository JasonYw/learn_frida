package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.AbstractC138277cuv;
import p003X.C109592TCw;
import p003X.C116971W2r;

/* loaded from: classes17.dex */
public final class ResourcesCompat {
    static {
        Covode.recordClassIndex(956);
    }

    public static Typeface getFont(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false);
    }

    public static float getFloat(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException(C0002O.m25083C("Resource ID #0x", Integer.toHexString(i), " type #0x", Integer.toHexString(typedValue.type), " is not valid"));
    }

    public static int getColor(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return C116971W2r.LIZ(resources, i);
    }

    public static ColorStateList getColorStateList(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        return resources.getColorStateList(i);
    }

    public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        return resources.getDrawable(i, theme);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2, Resources.Theme theme) {
        int i3 = Build.VERSION.SDK_INT;
        return resources.getDrawableForDensity(i, i2, theme);
    }

    public static void getFont(Context context, int i, AbstractC138277cuv abstractC138277cuv, Handler handler) {
        C109592TCw.LIZ(abstractC138277cuv);
        if (context.isRestricted()) {
            abstractC138277cuv.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new TypedValue(), 0, abstractC138277cuv, handler, false);
        }
    }

    public static Typeface getFont(Context context, int i, TypedValue typedValue, int i2, AbstractC138277cuv abstractC138277cuv) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, abstractC138277cuv, null, true);
    }

    public static Typeface loadFont(Context context, int i, TypedValue typedValue, int i2, AbstractC138277cuv abstractC138277cuv, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i, i2, abstractC138277cuv, handler, z);
        if (loadFont == null && abstractC138277cuv == null) {
            throw new Resources.NotFoundException(C0002O.m25085C("Font resource ID #0x", Integer.toHexString(i), " could not be retrieved."));
        }
        return loadFont;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
        if (r15 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface loadFont(android.content.Context r10, android.content.res.Resources r11, android.util.TypedValue r12, int r13, int r14, p003X.AbstractC138277cuv r15, android.os.Handler r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, X.cuv, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
