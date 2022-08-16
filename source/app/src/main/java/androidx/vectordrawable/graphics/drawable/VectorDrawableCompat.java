package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002O.C0002O;
import p003X.AbstractC138290cv8;
import p003X.AbstractC138522cys;
import p003X.C116971W2r;
import p003X.C138510cyg;
import p003X.C138514cyk;
import p003X.C138515cyl;
import p003X.C138517cyn;
import p003X.C138521cyr;
import p003X.C138523cyt;
import p003X.C138526cyw;

/* loaded from: classes17.dex */
public class VectorDrawableCompat extends AbstractC138290cv8 {
    public static final PorterDuff.Mode LIZ = PorterDuff.Mode.SRC_IN;
    public boolean LIZJ;
    public C138521cyr LIZLLL;

    /* renamed from: LJ */
    public PorterDuffColorFilter f20292LJ;
    public ColorFilter LJFF;
    public boolean LJI;
    public final float[] LJII;
    public final Matrix LJIIIIZZ;
    public final Rect LJIIIZ;

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$c */
    /* loaded from: classes17.dex */
    public static class C0431c extends AbstractC0432d {
        public final Matrix LIZ;
        public final ArrayList<AbstractC0432d> LIZIZ;
        public float LIZJ;
        public float LIZLLL;

        /* renamed from: LJ */
        public float f20293LJ;
        public float LJFF;
        public float LJI;
        public float LJII;
        public float LJIIIIZZ;
        public final Matrix LJIIIZ;
        public int LJIIJ;
        public int[] LJIIJJI;
        public String LJIIL;

        static {
            Covode.recordClassIndex(2042);
        }

        public final String getGroupName() {
            return this.LJIIL;
        }

        public final Matrix getLocalMatrix() {
            return this.LJIIIZ;
        }

        public final float getPivotX() {
            return this.LIZLLL;
        }

        public final float getPivotY() {
            return this.f20293LJ;
        }

        public final float getRotation() {
            return this.LIZJ;
        }

        public final float getScaleX() {
            return this.LJFF;
        }

        public final float getScaleY() {
            return this.LJI;
        }

        public final float getTranslateX() {
            return this.LJII;
        }

        public final float getTranslateY() {
            return this.LJIIIIZZ;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.AbstractC0432d
        public final boolean LIZIZ() {
            for (int i = 0; i < this.LIZIZ.size(); i++) {
                if (this.LIZIZ.get(i).LIZIZ()) {
                    return true;
                }
            }
            return false;
        }

        public C0431c() {
            super((byte) 0);
            this.LIZ = new Matrix();
            this.LIZIZ = new ArrayList<>();
            this.LIZJ = 0.0f;
            this.LIZLLL = 0.0f;
            this.f20293LJ = 0.0f;
            this.LJFF = 1.0f;
            this.LJI = 1.0f;
            this.LJII = 0.0f;
            this.LJIIIIZZ = 0.0f;
            this.LJIIIZ = new Matrix();
            this.LJIIL = null;
        }

        public void LIZ() {
            this.LJIIIZ.reset();
            this.LJIIIZ.postTranslate(-this.LIZLLL, -this.f20293LJ);
            this.LJIIIZ.postScale(this.LJFF, this.LJI);
            this.LJIIIZ.postRotate(this.LIZJ, 0.0f, 0.0f);
            this.LJIIIZ.postTranslate(this.LJII + this.LIZLLL, this.LJIIIIZZ + this.f20293LJ);
        }

        public final void setPivotX(float f) {
            if (f != this.LIZLLL) {
                this.LIZLLL = f;
                LIZ();
            }
        }

        public final void setPivotY(float f) {
            if (f != this.f20293LJ) {
                this.f20293LJ = f;
                LIZ();
            }
        }

        public final void setRotation(float f) {
            if (f != this.LIZJ) {
                this.LIZJ = f;
                LIZ();
            }
        }

        public final void setScaleX(float f) {
            if (f != this.LJFF) {
                this.LJFF = f;
                LIZ();
            }
        }

        public final void setScaleY(float f) {
            if (f != this.LJI) {
                this.LJI = f;
                LIZ();
            }
        }

        public final void setTranslateX(float f) {
            if (f != this.LJII) {
                this.LJII = f;
                LIZ();
            }
        }

        public final void setTranslateY(float f) {
            if (f != this.LJIIIIZZ) {
                this.LJIIIIZZ = f;
                LIZ();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.AbstractC0432d
        public final boolean LIZ(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.LIZIZ.size(); i++) {
                z |= this.LIZIZ.get(i).LIZ(iArr);
            }
            return z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0431c(C0431c c0431c, ArrayMap<String, Object> arrayMap) {
            super((byte) 0);
            AbstractC138522cys c138523cyt;
            this.LIZ = new Matrix();
            this.LIZIZ = new ArrayList<>();
            this.LIZJ = 0.0f;
            this.LIZLLL = 0.0f;
            this.f20293LJ = 0.0f;
            this.LJFF = 1.0f;
            this.LJI = 1.0f;
            this.LJII = 0.0f;
            this.LJIIIIZZ = 0.0f;
            this.LJIIIZ = new Matrix();
            this.LJIIL = null;
            this.LIZJ = c0431c.LIZJ;
            this.LIZLLL = c0431c.LIZLLL;
            this.f20293LJ = c0431c.f20293LJ;
            this.LJFF = c0431c.LJFF;
            this.LJI = c0431c.LJI;
            this.LJII = c0431c.LJII;
            this.LJIIIIZZ = c0431c.LJIIIIZZ;
            this.LJIIJJI = c0431c.LJIIJJI;
            this.LJIIL = c0431c.LJIIL;
            this.LJIIJ = c0431c.LJIIJ;
            String str = this.LJIIL;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.LJIIIZ.set(c0431c.LJIIIZ);
            ArrayList<AbstractC0432d> arrayList = c0431c.LIZIZ;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC0432d abstractC0432d = arrayList.get(i);
                if (abstractC0432d instanceof C0431c) {
                    this.LIZIZ.add(new C0431c((C0431c) abstractC0432d, arrayMap));
                } else {
                    if (abstractC0432d instanceof C138515cyl) {
                        c138523cyt = new C138515cyl((C138515cyl) abstractC0432d);
                    } else if (abstractC0432d instanceof C138523cyt) {
                        c138523cyt = new C138523cyt((C138523cyt) abstractC0432d);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.LIZIZ.add(c138523cyt);
                    if (c138523cyt.LJIILIIL != null) {
                        arrayMap.put(c138523cyt.LJIILIIL, c138523cyt);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$d */
    /* loaded from: classes17.dex */
    public static abstract class AbstractC0432d {
        static {
            Covode.recordClassIndex(2043);
        }

        public boolean LIZ(int[] iArr) {
            return false;
        }

        public boolean LIZIZ() {
            return false;
        }

        public AbstractC0432d() {
        }

        public /* synthetic */ AbstractC0432d(byte b) {
            this();
        }
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    static {
        Covode.recordClassIndex(2039);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.LIZIZ != null) {
            DrawableCompat.canApplyTheme(this.LIZIZ);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.LIZIZ != null) {
            return this.LIZIZ.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.LIZIZ != null) {
            this.LIZIZ.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.LIZIZ != null) {
            return DrawableCompat.isAutoMirrored(this.LIZIZ);
        }
        return this.LIZLLL.f18352LJ;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.LIZIZ != null) {
            return DrawableCompat.getAlpha(this.LIZIZ);
        }
        return this.LIZLLL.LIZIZ.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.LIZIZ != null) {
            return this.LIZIZ.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.LIZLLL.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.LIZIZ != null) {
            return this.LIZIZ.getIntrinsicHeight();
        }
        return (int) this.LIZLLL.LIZIZ.f18350LJ;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.LIZIZ != null) {
            return this.LIZIZ.getIntrinsicWidth();
        }
        return (int) this.LIZLLL.LIZIZ.LIZLLL;
    }

    public VectorDrawableCompat() {
        this.LIZJ = true;
        this.LJII = new float[9];
        this.LJIIIIZZ = new Matrix();
        this.LJIIIZ = new Rect();
        this.LIZLLL = new C138521cyr();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.LIZIZ != null && Build.VERSION.SDK_INT >= 24) {
            return new C138510cyg(this.LIZIZ.getConstantState());
        }
        this.LIZLLL.LIZ = getChangingConfigurations();
        return this.LIZLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.LIZIZ != null) {
            return this.LIZIZ.isStateful();
        }
        if (!super.isStateful()) {
            C138521cyr c138521cyr = this.LIZLLL;
            if (c138521cyr != null) {
                if (!c138521cyr.LIZ()) {
                    if (this.LIZLLL.LIZJ != null && this.LIZLLL.LIZJ.isStateful()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.LIZIZ != null) {
            this.LIZIZ.mutate();
            return this;
        }
        if (!this.LJI && super.mutate() == this) {
            this.LIZLLL = new C138521cyr(this.LIZLLL);
            this.LJI = true;
        }
        return this;
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        if (this.LIZIZ != null) {
            this.LIZIZ.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.LIZIZ != null) {
            DrawableCompat.setAutoMirrored(this.LIZIZ, z);
        } else {
            this.LIZLLL.f18352LJ = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.LIZIZ != null) {
            this.LIZIZ.setColorFilter(colorFilter);
            return;
        }
        this.LJFF = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.LIZIZ != null) {
            this.LIZIZ.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.LIZIZ != null) {
            this.LIZIZ.setAlpha(i);
        } else if (this.LIZLLL.LIZIZ.getRootAlpha() != i) {
            this.LIZLLL.LIZIZ.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p003X.AbstractC138286cv4
    public void setTint(int i) {
        if (this.LIZIZ != null) {
            DrawableCompat.setTint(this.LIZIZ, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, p003X.AbstractC138286cv4
    public void setTintList(ColorStateList colorStateList) {
        if (this.LIZIZ != null) {
            DrawableCompat.setTintList(this.LIZIZ, colorStateList);
            return;
        }
        C138521cyr c138521cyr = this.LIZLLL;
        if (c138521cyr.LIZJ != colorStateList) {
            c138521cyr.LIZJ = colorStateList;
            this.f20292LJ = LIZ(colorStateList, c138521cyr.LIZLLL);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p003X.AbstractC138286cv4
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.LIZIZ != null) {
            DrawableCompat.setTintMode(this.LIZIZ, mode);
            return;
        }
        C138521cyr c138521cyr = this.LIZLLL;
        if (c138521cyr.LIZLLL != mode) {
            c138521cyr.LIZLLL = mode;
            this.f20292LJ = LIZ(c138521cyr.LIZJ, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.LIZIZ != null) {
            return this.LIZIZ.setState(iArr);
        }
        boolean z = false;
        C138521cyr c138521cyr = this.LIZLLL;
        if (c138521cyr.LIZJ != null && c138521cyr.LIZLLL != null) {
            this.f20292LJ = LIZ(c138521cyr.LIZJ, c138521cyr.LIZLLL);
            invalidateSelf();
            z = true;
        }
        if (c138521cyr.LIZ()) {
            boolean LIZ2 = c138521cyr.LIZIZ.LIZJ.LIZ(iArr);
            c138521cyr.LJIIJ |= LIZ2;
            if (LIZ2) {
                invalidateSelf();
                return true;
            }
            return z;
        }
        return z;
    }

    public VectorDrawableCompat(C138521cyr c138521cyr) {
        this.LIZJ = true;
        this.LJII = new float[9];
        this.LJIIIIZZ = new Matrix();
        this.LJIIIZ = new Rect();
        this.LIZLLL = c138521cyr;
        this.f20292LJ = LIZ(c138521cyr.LIZJ, c138521cyr.LIZLLL);
    }

    public final Object LIZ(String str) {
        return this.LIZLLL.LIZIZ.LJIIJ.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        if (this.LIZIZ != null) {
            this.LIZIZ.draw(canvas);
            return;
        }
        copyBounds(this.LJIIIZ);
        if (this.LJIIIZ.width() > 0 && this.LJIIIZ.height() > 0) {
            ColorFilter colorFilter = this.LJFF;
            if (colorFilter == null) {
                colorFilter = this.f20292LJ;
            }
            canvas.getMatrix(this.LJIIIIZZ);
            this.LJIIIIZZ.getValues(this.LJII);
            boolean z = false;
            float abs = Math.abs(this.LJII[0]);
            float abs2 = Math.abs(this.LJII[4]);
            float abs3 = Math.abs(this.LJII[1]);
            float abs4 = Math.abs(this.LJII[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED, (int) (this.LJIIIZ.width() * abs));
            int min2 = Math.min((int) AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED, (int) (this.LJIIIZ.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(this.LJIIIZ.left, this.LJIIIZ.top);
                int i = Build.VERSION.SDK_INT;
                if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
                    canvas.translate(this.LJIIIZ.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.LJIIIZ.offsetTo(0, 0);
                C138521cyr c138521cyr = this.LIZLLL;
                if (c138521cyr.LJFF == null || min != c138521cyr.LJFF.getWidth() || min2 != c138521cyr.LJFF.getHeight()) {
                    c138521cyr.LJFF = C116971W2r.LIZ(min, min2, Bitmap.Config.ARGB_8888);
                    c138521cyr.LJIIJ = true;
                }
                if (!this.LIZJ) {
                    this.LIZLLL.LIZ(min, min2);
                } else {
                    C138521cyr c138521cyr2 = this.LIZLLL;
                    if (c138521cyr2.LJIIJ || c138521cyr2.LJI != c138521cyr2.LIZJ || c138521cyr2.LJII != c138521cyr2.LIZLLL || c138521cyr2.LJIIIZ != c138521cyr2.f18352LJ || c138521cyr2.LJIIIIZZ != c138521cyr2.LIZIZ.getRootAlpha()) {
                        this.LIZLLL.LIZ(min, min2);
                        C138521cyr c138521cyr3 = this.LIZLLL;
                        c138521cyr3.LJI = c138521cyr3.LIZJ;
                        c138521cyr3.LJII = c138521cyr3.LIZLLL;
                        c138521cyr3.LJIIIIZZ = c138521cyr3.LIZIZ.getRootAlpha();
                        c138521cyr3.LJIIIZ = c138521cyr3.f18352LJ;
                        c138521cyr3.LJIIJ = false;
                    }
                }
                C138521cyr c138521cyr4 = this.LIZLLL;
                Rect rect = this.LJIIIZ;
                if (c138521cyr4.LIZIZ.getRootAlpha() < 255) {
                    z = true;
                }
                if (!z && colorFilter == null) {
                    paint = null;
                } else {
                    if (c138521cyr4.LJIIJJI == null) {
                        c138521cyr4.LJIIJJI = new Paint();
                        c138521cyr4.LJIIJJI.setFilterBitmap(true);
                    }
                    c138521cyr4.LJIIJJI.setAlpha(c138521cyr4.LIZIZ.getRootAlpha());
                    c138521cyr4.LJIIJJI.setColorFilter(colorFilter);
                    paint = c138521cyr4.LJIIJJI;
                }
                canvas.drawBitmap(c138521cyr4.LJFF, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public static int LIZ(int i, float f) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.LIZIZ != null) {
            this.LIZIZ.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.LIZIZ != null) {
            return this.LIZIZ.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    private PorterDuffColorFilter LIZ(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.LIZIZ != null) {
            this.LIZIZ.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public static VectorDrawableCompat create(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.LIZIZ = ResourcesCompat.getDrawable(resources, i, theme);
            new C138510cyg(vectorDrawableCompat.LIZIZ.getConstantState());
            return vectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    return LIZ(resources, xml, asAttributeSet, theme);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @Override // p003X.AbstractC138290cv8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public static VectorDrawableCompat LIZ(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    private void LIZIZ(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C138521cyr c138521cyr = this.LIZLLL;
        C138514cyk c138514cyk = c138521cyr.LIZIZ;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c138514cyk.LIZJ);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0431c c0431c = (C0431c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C138515cyl c138515cyl = new C138515cyl();
                    TypedArray LIZ2 = C138517cyn.LIZ(resources, theme, attributeSet, C138526cyw.LIZJ);
                    c138515cyl.LIZ(LIZ2, xmlPullParser, theme);
                    LIZ2.recycle();
                    c0431c.LIZIZ.add(c138515cyl);
                    if (c138515cyl.getPathName() != null) {
                        c138514cyk.LJIIJ.put(c138515cyl.getPathName(), c138515cyl);
                    }
                    c138521cyr.LIZ = c138515cyl.LJIILJJIL | c138521cyr.LIZ;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C138523cyt c138523cyt = new C138523cyt();
                    if (C138517cyn.LIZ(xmlPullParser, "pathData")) {
                        TypedArray LIZ3 = C138517cyn.LIZ(resources, theme, attributeSet, C138526cyw.LIZLLL);
                        c138523cyt.LIZ(LIZ3);
                        LIZ3.recycle();
                    }
                    c0431c.LIZIZ.add(c138523cyt);
                    if (c138523cyt.getPathName() != null) {
                        c138514cyk.LJIIJ.put(c138523cyt.getPathName(), c138523cyt);
                    }
                    c138521cyr.LIZ = c138523cyt.LJIILJJIL | c138521cyr.LIZ;
                } else if ("group".equals(name)) {
                    C0431c c0431c2 = new C0431c();
                    TypedArray LIZ4 = C138517cyn.LIZ(resources, theme, attributeSet, C138526cyw.LIZIZ);
                    c0431c2.LJIIJJI = null;
                    c0431c2.LIZJ = C138517cyn.LIZ(LIZ4, xmlPullParser, "rotation", 5, c0431c2.LIZJ);
                    c0431c2.LIZLLL = LIZ4.getFloat(1, c0431c2.LIZLLL);
                    c0431c2.f20293LJ = LIZ4.getFloat(2, c0431c2.f20293LJ);
                    c0431c2.LJFF = C138517cyn.LIZ(LIZ4, xmlPullParser, "scaleX", 3, c0431c2.LJFF);
                    c0431c2.LJI = C138517cyn.LIZ(LIZ4, xmlPullParser, "scaleY", 4, c0431c2.LJI);
                    c0431c2.LJII = C138517cyn.LIZ(LIZ4, xmlPullParser, "translateX", 6, c0431c2.LJII);
                    c0431c2.LJIIIIZZ = C138517cyn.LIZ(LIZ4, xmlPullParser, "translateY", 7, c0431c2.LJIIIIZZ);
                    String string = LIZ4.getString(0);
                    if (string != null) {
                        c0431c2.LJIIL = string;
                    }
                    c0431c2.LIZ();
                    LIZ4.recycle();
                    c0431c.LIZIZ.add(c0431c2);
                    arrayDeque.push(c0431c2);
                    if (c0431c2.getGroupName() != null) {
                        c138514cyk.LJIIJ.put(c0431c2.getGroupName(), c0431c2);
                    }
                    c138521cyr.LIZ = c0431c2.LJIIJ | c138521cyr.LIZ;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.LIZIZ != null) {
            DrawableCompat.inflate(this.LIZIZ, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C138521cyr c138521cyr = this.LIZLLL;
        c138521cyr.LIZIZ = new C138514cyk();
        TypedArray LIZ2 = C138517cyn.LIZ(resources, theme, attributeSet, C138526cyw.LIZ);
        C138521cyr c138521cyr2 = this.LIZLLL;
        C138514cyk c138514cyk = c138521cyr2.LIZIZ;
        int LIZ3 = C138517cyn.LIZ(LIZ2, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (LIZ3 != 3) {
            if (LIZ3 != 5) {
                if (LIZ3 != 9) {
                    switch (LIZ3) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case MotionEventCompat.AXIS_HAT_X /* 15 */:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
        } else {
            mode = PorterDuff.Mode.SRC_OVER;
        }
        c138521cyr2.LIZLLL = mode;
        ColorStateList colorStateList = LIZ2.getColorStateList(1);
        if (colorStateList != null) {
            c138521cyr2.LIZJ = colorStateList;
        }
        c138521cyr2.f18352LJ = C138517cyn.LIZ(LIZ2, xmlPullParser, "autoMirrored", 5, c138521cyr2.f18352LJ);
        c138514cyk.LJFF = C138517cyn.LIZ(LIZ2, xmlPullParser, "viewportWidth", 7, c138514cyk.LJFF);
        c138514cyk.LJI = C138517cyn.LIZ(LIZ2, xmlPullParser, "viewportHeight", 8, c138514cyk.LJI);
        if (c138514cyk.LJFF > 0.0f) {
            if (c138514cyk.LJI > 0.0f) {
                c138514cyk.LIZLLL = LIZ2.getDimension(3, c138514cyk.LIZLLL);
                c138514cyk.f18350LJ = LIZ2.getDimension(2, c138514cyk.f18350LJ);
                if (c138514cyk.LIZLLL > 0.0f) {
                    if (c138514cyk.f18350LJ > 0.0f) {
                        c138514cyk.setAlpha(C138517cyn.LIZ(LIZ2, xmlPullParser, "alpha", 4, c138514cyk.getAlpha()));
                        String string = LIZ2.getString(0);
                        if (string != null) {
                            c138514cyk.LJIIIIZZ = string;
                            c138514cyk.LJIIJ.put(string, c138514cyk);
                        }
                        LIZ2.recycle();
                        c138521cyr.LIZ = getChangingConfigurations();
                        c138521cyr.LJIIJ = true;
                        LIZIZ(resources, xmlPullParser, attributeSet, theme);
                        this.f20292LJ = LIZ(c138521cyr.LIZJ, c138521cyr.LIZLLL);
                        return;
                    }
                    new StringBuilder();
                    throw new XmlPullParserException(C0002O.m25086C(LIZ2.getPositionDescription(), "<vector> tag requires height > 0"));
                }
                new StringBuilder();
                throw new XmlPullParserException(C0002O.m25086C(LIZ2.getPositionDescription(), "<vector> tag requires width > 0"));
            }
            new StringBuilder();
            throw new XmlPullParserException(C0002O.m25086C(LIZ2.getPositionDescription(), "<vector> tag requires viewportHeight > 0"));
        }
        new StringBuilder();
        throw new XmlPullParserException(C0002O.m25086C(LIZ2.getPositionDescription(), "<vector> tag requires viewportWidth > 0"));
    }
}
