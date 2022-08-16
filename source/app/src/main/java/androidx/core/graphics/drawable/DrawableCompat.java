package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import p003X.AbstractC138243cuM;
import p003X.AbstractC138286cv4;
import p003X.C138287cv5;

/* loaded from: classes17.dex */
public final class DrawableCompat {
    public static Method sGetLayoutDirectionMethod;
    public static boolean sGetLayoutDirectionMethodFetched;
    public static Method sSetLayoutDirectionMethod;
    public static boolean sSetLayoutDirectionMethodFetched;

    static {
        Covode.recordClassIndex(983);
    }

    public static void jumpToCurrentState(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static boolean canApplyTheme(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.canApplyTheme();
    }

    public static int getAlpha(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getAlpha();
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getColorFilter();
    }

    public static boolean isAutoMirrored(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(Drawable drawable) {
        if (drawable instanceof AbstractC138243cuM) {
            return (T) ((AbstractC138243cuM) drawable).LIZ();
        }
        return drawable;
    }

    public static Drawable wrap(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        int i = Build.VERSION.SDK_INT;
        if (!(drawable instanceof AbstractC138286cv4)) {
            return new C138287cv5(drawable);
        }
        return drawable;
    }

    public static int getLayoutDirection(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        int i = Build.VERSION.SDK_INT;
        if (!sGetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                sGetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetLayoutDirectionMethodFetched = true;
        }
        Method method = sGetLayoutDirectionMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                sGetLayoutDirectionMethod = null;
            }
        }
        return 0;
    }

    public static void clearColorFilter(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT < 23) {
            int i = Build.VERSION.SDK_INT;
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                clearColorFilter(((InsetDrawable) drawable).getDrawable());
                return;
            } else if (drawable instanceof AbstractC138243cuM) {
                clearColorFilter(((AbstractC138243cuM) drawable).LIZ());
                return;
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        clearColorFilter(child);
                    }
                }
                return;
            } else {
                return;
            }
        }
        drawable.clearColorFilter();
    }

    public static void applyTheme(Drawable drawable, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        drawable.applyTheme(theme);
    }

    public static void setAutoMirrored(Drawable drawable, boolean z) {
        int i = Build.VERSION.SDK_INT;
        drawable.setAutoMirrored(z);
    }

    public static void setTint(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        drawable.setTint(i);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintList(colorStateList);
    }

    public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintMode(mode);
    }

    public static boolean setLayoutDirection(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!sSetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                sSetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sSetLayoutDirectionMethodFetched = true;
        }
        Method method = sSetLayoutDirectionMethod;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                sSetLayoutDirectionMethod = null;
            }
        }
        return false;
    }

    public static void setHotspot(Drawable drawable, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        drawable.setHotspot(f, f2);
    }

    public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        drawable.setHotspotBounds(i, i2, i3, i4);
    }
}
