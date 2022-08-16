package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002O.C0002O;
import p003X.AbstractC138286cv4;
import p003X.AbstractC138534cz4;
import p003X.AbstractC138554czO;
import p003X.C138245cuO;
import p003X.C138246cuP;
import p003X.C138492cyO;
import p003X.C138512cyi;
import p003X.C138517cyn;
import p003X.C138528cyy;
import p003X.C138555czP;
import p003X.C138556czQ;

/* loaded from: classes17.dex */
public class AnimatedStateListDrawableCompat extends C138555czP implements AbstractC138286cv4 {
    public static final String LOGTAG = AnimatedStateListDrawableCompat.class.getSimpleName();
    public boolean mMutated;
    public C138556czQ mState;
    public AbstractC138534cz4 mTransition;
    public int mTransitionFromIndex;
    public int mTransitionToIndex;

    @Override // p003X.C138555czP, p003X.C138553czN, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    private void init() {
        onStateChange(getState());
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p003X.C138555czP, p003X.C138553czN
    public void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    static {
        Covode.recordClassIndex(508);
    }

    @Override // p003X.C138555czP, p003X.C138553czN
    /* renamed from: cloneConstantState  reason: collision with other method in class */
    public C138556czQ mo25199cloneConstantState() {
        return new C138556czQ(this.mState, this, null);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC138534cz4 abstractC138534cz4 = this.mTransition;
        if (abstractC138534cz4 != null) {
            abstractC138534cz4.LIZIZ();
            this.mTransition = null;
            selectDrawable(this.mTransitionToIndex);
            this.mTransitionToIndex = -1;
            this.mTransitionFromIndex = -1;
        }
    }

    @Override // p003X.C138555czP, p003X.C138553czN, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mMutated) {
            super.mutate();
            if (this == this) {
                this.mState.LIZ();
                this.mMutated = true;
            }
        }
        return this;
    }

    @Override // p003X.C138555czP, p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // p003X.C138553czN
    public /* bridge */ /* synthetic */ void setEnterFadeDuration(int i) {
        super.setEnterFadeDuration(i);
    }

    @Override // p003X.C138553czN
    public /* bridge */ /* synthetic */ void setExitFadeDuration(int i) {
        super.setExitFadeDuration(i);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // p003X.C138555czP, p003X.C138553czN
    public void setConstantState(AbstractC138554czO abstractC138554czO) {
        super.setConstantState(abstractC138554czO);
        if (abstractC138554czO instanceof C138556czQ) {
            this.mState = (C138556czQ) abstractC138554czO;
        }
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        C138556czQ c138556czQ = this.mState;
        int i = Build.VERSION.SDK_INT;
        c138556czQ.LJFF |= typedArray.getChangingConfigurations();
        c138556czQ.LJIIJ = typedArray.getBoolean(2, c138556czQ.LJIIJ);
        c138556czQ.LJIILIIL = typedArray.getBoolean(3, c138556czQ.LJIILIIL);
        c138556czQ.LJJIIJ = typedArray.getInt(4, c138556czQ.LJJIIJ);
        c138556czQ.LJJIIJZLJL = typedArray.getInt(5, c138556czQ.LJJIIJZLJL);
        setDither(typedArray.getBoolean(0, c138556czQ.LJJIFFI));
    }

    @Override // p003X.C138555czP, p003X.C138553czN, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int LIZ = this.mState.LIZ(iArr);
        if (LIZ != this.mCurIndex && (selectTransition(LIZ) || selectDrawable(LIZ))) {
            z = true;
        } else {
            z = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    private boolean selectTransition(int i) {
        int i2;
        boolean z;
        AbstractC138534cz4 c138246cuP;
        AbstractC138534cz4 abstractC138534cz4 = this.mTransition;
        if (abstractC138534cz4 != null) {
            if (i == this.mTransitionToIndex) {
                return true;
            }
            if (i == this.mTransitionFromIndex && abstractC138534cz4.LIZJ()) {
                abstractC138534cz4.LIZLLL();
                this.mTransitionToIndex = this.mTransitionFromIndex;
                this.mTransitionFromIndex = i;
                return true;
            }
            i2 = this.mTransitionToIndex;
            abstractC138534cz4.LIZIZ();
        } else {
            i2 = this.mCurIndex;
        }
        this.mTransition = null;
        this.mTransitionFromIndex = -1;
        this.mTransitionToIndex = -1;
        C138556czQ c138556czQ = this.mState;
        int LIZ = c138556czQ.LIZ(i2);
        int LIZ2 = c138556czQ.LIZ(i);
        boolean z2 = false;
        if (LIZ2 != 0 && LIZ != 0) {
            int longValue = (int) c138556czQ.LIZ.get(C138556czQ.LIZ(LIZ, LIZ2), -1L).longValue();
            if (longValue < 0) {
                return false;
            }
            if ((c138556czQ.LIZ.get(C138556czQ.LIZ(LIZ, LIZ2), -1L).longValue() & 8589934592L) != 0) {
                z = true;
            } else {
                z = false;
            }
            selectDrawable(longValue);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                if ((c138556czQ.LIZ.get(C138556czQ.LIZ(LIZ, LIZ2), -1L).longValue() & 4294967296L) != 0) {
                    z2 = true;
                }
                c138246cuP = new C138245cuO((AnimationDrawable) current, z2, z);
            } else if (current instanceof C138512cyi) {
                c138246cuP = new C138528cyy((C138512cyi) current);
            } else if (current instanceof Animatable) {
                c138246cuP = new C138246cuP((Animatable) current);
            }
            c138246cuP.LIZ();
            this.mTransition = c138246cuP;
            this.mTransitionFromIndex = i2;
            this.mTransitionToIndex = i;
            return true;
        }
        return false;
    }

    @Override // p003X.C138555czP
    public /* bridge */ /* synthetic */ void addState(int[] iArr, Drawable drawable) {
        super.addState(iArr, drawable);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public AnimatedStateListDrawableCompat(C138556czQ c138556czQ, Resources resources) {
        super(null);
        this.mTransitionToIndex = -1;
        this.mTransitionFromIndex = -1;
        setConstantState(new C138556czQ(c138556czQ, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.mTransition != null && (visible || z2)) {
            if (z) {
                this.mTransition.LIZ();
            } else {
                jumpToCurrentState();
                return visible;
            }
        }
        return visible;
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public void addState(int[] iArr, Drawable drawable, int i) {
        if (drawable != null) {
            this.mState.LIZ(iArr, drawable, i);
            onStateChange(getState());
            return;
        }
        throw new IllegalArgumentException("Drawable must not be null");
    }

    public static AnimatedStateListDrawableCompat create(Context context, int i, Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    return createFromXmlInner(context, resources, xml, asAttributeSet, theme);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @Override // p003X.C138553czN, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public <T extends Drawable & Animatable> void addTransition(int i, int i2, T t, boolean z) {
        if (t != null) {
            this.mState.LIZ(i, i2, t, z);
            return;
        }
        throw new IllegalArgumentException("Transition drawable must not be null");
    }

    public static AnimatedStateListDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        new StringBuilder();
        throw new XmlPullParserException(C0002O.m25085C(xmlPullParser.getPositionDescription(), ": invalid animated-selector tag ", name));
    }

    private void inflateChildElements(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            parseItem(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            parseTransition(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // p003X.C138555czP
    public void inflate(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray LIZ = C138517cyn.LIZ(resources, theme, attributeSet, new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533});
        setVisible(LIZ.getBoolean(1, true), true);
        updateStateFromTypedArray(LIZ);
        updateDensity(resources);
        LIZ.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        init();
    }

    private int parseItem(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray LIZ = C138517cyn.LIZ(resources, theme, attributeSet, new int[]{16842960, 16843161});
        int resourceId = LIZ.getResourceId(0, 0);
        int resourceId2 = LIZ.getResourceId(1, -1);
        if (resourceId2 > 0) {
            drawable = C138492cyO.LIZ().LIZ(context, resourceId2);
        } else {
            drawable = null;
        }
        LIZ.recycle();
        int[] extractStateSet = extractStateSet(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    drawable = VectorDrawableCompat.LIZ(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                if (drawable == null) {
                    new StringBuilder();
                    throw new XmlPullParserException(C0002O.m25086C(xmlPullParser.getPositionDescription(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                }
            } else {
                new StringBuilder();
                throw new XmlPullParserException(C0002O.m25086C(xmlPullParser.getPositionDescription(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
            }
        }
        return this.mState.LIZ(extractStateSet, drawable, resourceId);
    }

    private int parseTransition(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray LIZ = C138517cyn.LIZ(resources, theme, attributeSet, new int[]{16843161, 16843849, 16843850, 16843851});
        int resourceId = LIZ.getResourceId(2, -1);
        int resourceId2 = LIZ.getResourceId(1, -1);
        int resourceId3 = LIZ.getResourceId(0, -1);
        if (resourceId3 > 0) {
            drawable = C138492cyO.LIZ().LIZ(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = LIZ.getBoolean(3, false);
        LIZ.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    drawable = C138512cyi.LIZ(context, resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                if (drawable == null) {
                    new StringBuilder();
                    throw new XmlPullParserException(C0002O.m25086C(xmlPullParser.getPositionDescription(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                }
            } else {
                new StringBuilder();
                throw new XmlPullParserException(C0002O.m25086C(xmlPullParser.getPositionDescription(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
            }
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.mState.LIZ(resourceId, resourceId2, drawable, z);
        }
        new StringBuilder();
        throw new XmlPullParserException(C0002O.m25086C(xmlPullParser.getPositionDescription(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
    }
}
