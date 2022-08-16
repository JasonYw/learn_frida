package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.core.text.C0245c;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import p003X.AbstractC138207ctm;
import p003X.AbstractC138208ctn;
import p003X.ActionMode$CallbackC138215ctu;
import p003X.C109592TCw;
import p003X.C138206ctl;

/* loaded from: classes17.dex */
public final class TextViewCompat {
    public static Field sMaxModeField;
    public static boolean sMaxModeFieldFetched;
    public static Field sMaximumField;
    public static boolean sMaximumFieldFetched;
    public static Field sMinModeField;
    public static boolean sMinModeFieldFetched;
    public static Field sMinimumField;
    public static boolean sMinimumFieldFetched;

    static {
        Covode.recordClassIndex(1172);
    }

    public static Drawable[] getCompoundDrawablesRelative(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return textView.getCompoundDrawablesRelative();
    }

    public static int getFirstBaselineToTopHeight(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int getMaxLines(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return textView.getMaxLines();
    }

    public static int getMinLines(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return textView.getMinLines();
    }

    public static Field retrieveField(String str) {
        try {
            Field declaredField = TextView.class.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                return declaredField;
            }
        } catch (NoSuchFieldException unused2) {
            return null;
        }
    }

    public static int getAutoSizeMaxTextSize(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMaxTextSize();
        }
        if (textView instanceof AbstractC138207ctm) {
            return ((AbstractC138207ctm) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    public static int getAutoSizeMinTextSize(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMinTextSize();
        }
        if (textView instanceof AbstractC138207ctm) {
            return ((AbstractC138207ctm) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static int getAutoSizeStepGranularity(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeStepGranularity();
        }
        if (textView instanceof AbstractC138207ctm) {
            return ((AbstractC138207ctm) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    public static int[] getAutoSizeTextAvailableSizes(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextAvailableSizes();
        }
        if (textView instanceof AbstractC138207ctm) {
            return ((AbstractC138207ctm) textView).getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }

    public static int getAutoSizeTextType(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextType();
        }
        if (textView instanceof AbstractC138207ctm) {
            return ((AbstractC138207ctm) textView).getAutoSizeTextType();
        }
        return 0;
    }

    public static ColorStateList getCompoundDrawableTintList(TextView textView) {
        C109592TCw.LIZ(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return textView.getCompoundDrawableTintList();
        }
        if (textView instanceof AbstractC138208ctn) {
            return ((AbstractC138208ctn) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    public static PorterDuff.Mode getCompoundDrawableTintMode(TextView textView) {
        C109592TCw.LIZ(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return textView.getCompoundDrawableTintMode();
        }
        if (textView instanceof AbstractC138208ctn) {
            return ((AbstractC138208ctn) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    public static int getTextDirection(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 1;
        }
        return 7;
    }

    public static TextDirectionHeuristic getTextDirectionHeuristic(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (textView.getLayoutDirection() == 1) {
            z = true;
        }
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public static C0245c.C0246a getTextMetricsParams(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0245c.C0246a(textView.getTextMetricsParams());
        }
        C138206ctl c138206ctl = new C138206ctl(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            c138206ctl.LIZJ = textView.getBreakStrategy();
            c138206ctl.LIZLLL = textView.getHyphenationFrequency();
        }
        int i = Build.VERSION.SDK_INT;
        c138206ctl.LIZIZ = getTextDirectionHeuristic(textView);
        return new C0245c.C0246a(c138206ctl.LIZ, c138206ctl.LIZIZ, c138206ctl.LIZJ, c138206ctl.LIZLLL);
    }

    public static int retrieveIntFromField(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            return -1;
        }
    }

    public static void setCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
    }

    public static void setAutoSizeTextTypeWithDefaults(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        } else if (textView instanceof AbstractC138207ctm) {
            ((AbstractC138207ctm) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void setCompoundDrawableTintList(TextView textView, ColorStateList colorStateList) {
        C109592TCw.LIZ(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof AbstractC138208ctn) {
            ((AbstractC138208ctn) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void setCompoundDrawableTintMode(TextView textView, PorterDuff.Mode mode) {
        C109592TCw.LIZ(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof AbstractC138208ctn) {
            ((AbstractC138208ctn) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void setLineHeight(TextView textView, int i) {
        C109592TCw.LIZ(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void setTextAppearance(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 27 && !(callback instanceof ActionMode$CallbackC138215ctu)) {
            return new ActionMode$CallbackC138215ctu(callback, textView);
        }
        return callback;
    }

    public static void setFirstBaselineToTopHeight(TextView textView, int i) {
        int i2;
        C109592TCw.LIZ(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(TextView textView, int i) {
        int i2;
        C109592TCw.LIZ(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void setPrecomputedText(TextView textView, C0245c c0245c) {
        Spannable spannable;
        if (Build.VERSION.SDK_INT >= 29) {
            if (c0245c.LIZ instanceof PrecomputedText) {
                spannable = c0245c.LIZ;
            } else {
                spannable = null;
            }
            textView.setText(spannable);
        } else if (getTextMetricsParams(textView).LIZ(c0245c.LIZIZ)) {
            textView.setText(c0245c);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void setTextMetricsParams(TextView textView, C0245c.C0246a c0246a) {
        int i = Build.VERSION.SDK_INT;
        textView.setTextDirection(getTextDirection(c0246a.LIZIZ));
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = c0246a.LIZ.getTextScaleX();
            textView.getPaint().set(c0246a.LIZ);
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(c0246a.LIZ);
        textView.setBreakStrategy(c0246a.LIZJ);
        textView.setHyphenationFrequency(c0246a.LIZLLL);
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (textView instanceof AbstractC138207ctm) {
            ((AbstractC138207ctm) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    public static void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (textView instanceof AbstractC138207ctm) {
            ((AbstractC138207ctm) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }
}
