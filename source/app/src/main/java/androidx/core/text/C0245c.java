package androidx.core.text;

import android.os.Build;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.p018os.TraceCompat;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p003X.C109592TCw;
import p003X.C116971W2r;
import p003X.C138205ctk;
import p003X.N8G;

/* renamed from: androidx.core.text.c */
/* loaded from: classes17.dex */
public final class C0245c implements Spannable {
    public static final Object LIZJ = new Object();
    public static Executor LIZLLL = null;
    public final Spannable LIZ;
    public final C0246a LIZIZ;

    /* renamed from: LJ */
    public final PrecomputedText f20250LJ;

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LIZ.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LIZ.toString();
    }

    static {
        Covode.recordClassIndex(1037);
    }

    /* renamed from: androidx.core.text.c$a */
    /* loaded from: classes15.dex */
    public static final class C0246a {
        public final TextPaint LIZ;
        public final TextDirectionHeuristic LIZIZ;
        public final int LIZJ;
        public final int LIZLLL;

        /* renamed from: LJ */
        public final PrecomputedText.Params f20251LJ;

        static {
            Covode.recordClassIndex(1038);
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return N8G.LIZ(Float.valueOf(this.LIZ.getTextSize()), Float.valueOf(this.LIZ.getTextScaleX()), Float.valueOf(this.LIZ.getTextSkewX()), Float.valueOf(this.LIZ.getLetterSpacing()), Integer.valueOf(this.LIZ.getFlags()), this.LIZ.getTextLocales(), this.LIZ.getTypeface(), Boolean.valueOf(this.LIZ.isElegantTextHeight()), this.LIZIZ, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL));
            }
            int i = Build.VERSION.SDK_INT;
            return N8G.LIZ(Float.valueOf(this.LIZ.getTextSize()), Float.valueOf(this.LIZ.getTextScaleX()), Float.valueOf(this.LIZ.getTextSkewX()), Float.valueOf(this.LIZ.getLetterSpacing()), Integer.valueOf(this.LIZ.getFlags()), this.LIZ.getTextLocale(), this.LIZ.getTypeface(), Boolean.valueOf(this.LIZ.isElegantTextHeight()), this.LIZIZ, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.LIZ.getTextSize());
            sb.append(", textScaleX=" + this.LIZ.getTextScaleX());
            sb.append(", textSkewX=" + this.LIZ.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.LIZ.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.LIZ.isElegantTextHeight());
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.LIZ.getTextLocales());
            } else {
                int i2 = Build.VERSION.SDK_INT;
                sb.append(", textLocale=" + this.LIZ.getTextLocale());
            }
            sb.append(", typeface=" + this.LIZ.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.LIZ.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.LIZIZ);
            sb.append(", breakStrategy=" + this.LIZJ);
            sb.append(", hyphenationFrequency=" + this.LIZLLL);
            sb.append("}");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0246a)) {
                return false;
            }
            C0246a c0246a = (C0246a) obj;
            if (!LIZ(c0246a)) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (this.LIZIZ == c0246a.LIZIZ) {
                return true;
            }
            return false;
        }

        public C0246a(PrecomputedText.Params params) {
            this.LIZ = params.getTextPaint();
            this.LIZIZ = params.getTextDirection();
            this.LIZJ = params.getBreakStrategy();
            this.LIZLLL = params.getHyphenationFrequency();
            this.f20251LJ = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public final boolean LIZ(C0246a c0246a) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.LIZJ != c0246a.LIZJ || this.LIZLLL != c0246a.LIZLLL)) || this.LIZ.getTextSize() != c0246a.LIZ.getTextSize() || this.LIZ.getTextScaleX() != c0246a.LIZ.getTextScaleX() || this.LIZ.getTextSkewX() != c0246a.LIZ.getTextSkewX()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (this.LIZ.getLetterSpacing() != c0246a.LIZ.getLetterSpacing() || !TextUtils.equals(this.LIZ.getFontFeatureSettings(), c0246a.LIZ.getFontFeatureSettings()) || this.LIZ.getFlags() != c0246a.LIZ.getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.LIZ.getTextLocales().equals(c0246a.LIZ.getTextLocales())) {
                    return false;
                }
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (!this.LIZ.getTextLocale().equals(c0246a.LIZ.getTextLocale())) {
                    return false;
                }
            }
            if (this.LIZ.getTypeface() == null) {
                if (c0246a.LIZ.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.LIZ.getTypeface().equals(c0246a.LIZ.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public C0246a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f20251LJ = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f20251LJ = null;
            }
            this.LIZ = textPaint;
            this.LIZIZ = textDirectionHeuristic;
            this.LIZJ = i;
            this.LIZLLL = i2;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LIZ.charAt(i);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.LIZ.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.LIZ.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.LIZ.getSpanStart(obj);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f20250LJ.removeSpan(obj);
                return;
            } else {
                this.LIZ.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.LIZ.subSequence(i, i2);
    }

    public C0245c(PrecomputedText precomputedText, C0246a c0246a) {
        this.LIZ = precomputedText;
        this.LIZIZ = c0246a;
        this.f20250LJ = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static C0245c LIZ(CharSequence charSequence, C0246a c0246a) {
        C109592TCw.LIZ(charSequence);
        C109592TCw.LIZ(c0246a);
        try {
            TraceCompat.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && c0246a.f20251LJ != null) {
                return new C0245c(PrecomputedText.create(charSequence, c0246a.f20251LJ), c0246a);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                if (indexOf < 0) {
                    i = length;
                } else {
                    i = indexOf + 1;
                }
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), c0246a.LIZ, Integer.MAX_VALUE).setBreakStrategy(c0246a.LIZJ).setHyphenationFrequency(c0246a.LIZLLL).setTextDirection(c0246a.LIZIZ).build();
            } else {
                int i3 = Build.VERSION.SDK_INT;
                new StaticLayout(charSequence, c0246a.LIZ, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new C0245c(charSequence, c0246a, iArr);
        } finally {
            TraceCompat.endSection();
        }
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.LIZ.nextSpanTransition(i, i2, cls);
    }

    public C0245c(CharSequence charSequence, C0246a c0246a, int[] iArr) {
        this.LIZ = new SpannableString(charSequence);
        this.LIZIZ = c0246a;
        this.f20250LJ = null;
    }

    public static Future<C0245c> LIZ(CharSequence charSequence, C0246a c0246a, Executor executor) {
        C138205ctk c138205ctk = new C138205ctk(c0246a, charSequence);
        if (executor == null) {
            synchronized (LIZJ) {
                if (LIZLLL == null) {
                    LIZLLL = C116971W2r.LIZIZ(1);
                }
                executor = LIZLLL;
            }
        }
        executor.execute(c138205ctk);
        return c138205ctk;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f20250LJ.getSpans(i, i2, cls);
        }
        return (T[]) this.LIZ.getSpans(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f20250LJ.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.LIZ.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }
}
