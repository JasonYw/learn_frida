package butterknife.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.List;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: butterknife.internal.Utils */
/* loaded from: classes17.dex */
public final class C0609Utils {
    public static final TypedValue VALUE = new TypedValue();

    static {
        Covode.recordClassIndex(2561);
    }

    public C0609Utils() {
        throw new AssertionError("No instances.");
    }

    public static <T> List<T> listFilteringNull(T... tArr) {
        return new ImmutableList(arrayFilteringNull(tArr));
    }

    public static <T> T[] arrayFilteringNull(T... tArr) {
        int length = tArr.length;
        int i = 0;
        for (T t : tArr) {
            if (t != null) {
                tArr[i] = t;
                i++;
            }
        }
        if (i == length) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        System.arraycopy(tArr, 0, tArr2, 0, i);
        return tArr2;
    }

    public static String getResourceEntryName(View view, int i) {
        if (view.isInEditMode()) {
            return "<unavailable while editing>";
        }
        return view.getContext().getResources().getResourceEntryName(i);
    }

    public static float getFloat(Context context, int i) {
        TypedValue typedValue = VALUE;
        context.getResources().getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException(C0002O.m25083C("Resource ID #0x", Integer.toHexString(i), " type #0x", Integer.toHexString(typedValue.type), " is not valid"));
    }

    public static View findRequiredView(View view, int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException(C0002O.m25081C("Required view '", getResourceEntryName(view, i), "' with ID ", Integer.valueOf(i), " for ", str, " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation."));
    }

    public static Drawable getTintedDrawable(Context context, int i, int i2) {
        if (context.getTheme().resolveAttribute(i2, VALUE, true)) {
            Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(context, i).mutate());
            DrawableCompat.setTint(wrap, C116971W2r.LIZ(context, VALUE.resourceId));
            return wrap;
        }
        throw new Resources.NotFoundException(C0002O.m25083C("Required tint color attribute with name ", context.getResources().getResourceEntryName(i2), " and attribute ID ", Integer.valueOf(i2), " was not found."));
    }

    public static <T> T findOptionalViewAsType(View view, int i, String str, Class<T> cls) {
        return (T) castView(view.findViewById(i), i, str, cls);
    }

    public static <T> T findRequiredViewAsType(View view, int i, String str, Class<T> cls) {
        return (T) castView(findRequiredView(view, i, str), i, str, cls);
    }

    public static <T> T castView(View view, int i, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e) {
            throw new IllegalStateException(C0002O.m25081C("View '", getResourceEntryName(view, i), "' with ID ", Integer.valueOf(i), " for ", str, " was of the wrong type. See cause for more info."), e);
        }
    }

    public static <T> T castParam(Object obj, String str, int i, String str2, int i2, Class<T> cls) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            throw new IllegalStateException("Parameter #" + (i + 1) + " of method '" + str + "' was of the wrong type for parameter #" + (i2 + 1) + " of method '" + str2 + "'. See cause for more info.", e);
        }
    }
}
