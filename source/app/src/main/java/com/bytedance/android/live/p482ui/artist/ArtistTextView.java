package com.bytedance.android.live.p482ui.artist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.AbstractC135002c3x;
import p003X.C106862S5w;
import p003X.C134999c3u;
import p003X.C135000c3v;
import p003X.C135001c3w;
import p003X.C135003c3y;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.ui.artist.ArtistTextView */
/* loaded from: classes17.dex */
public class ArtistTextView extends View {
    public static ChangeQuickRedirect LIZ;
    public AbstractC135002c3x LIZIZ;
    public boolean LIZJ;
    public final C135001c3w LIZLLL;

    /* renamed from: LJ */
    public final TextPaint f26748LJ;
    public C135003c3y LJFF;
    public CharSequence LJI;
    public int LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public int LJIIJ;
    public CharSequence LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public final RectF LJIIZILJ;
    public Function1<? super MotionEvent, Boolean> LJIJ;
    public Function1<? super MotionEvent, Boolean> LJIJI;
    public Function1<? super MotionEvent, Boolean> LJIJJ;
    public final GestureDetector.SimpleOnGestureListener LJIJJLI;
    public final GestureDetector LJIL;

    static {
        Covode.recordClassIndex(36327);
    }

    public ArtistTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ArtistTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getAlwaysUseAreaWidthForDisplay() {
        return this.LJIIL;
    }

    public final CharSequence getEllipsis() {
        return this.LJIIJJI;
    }

    public final float getExtraLineSpacing() {
        return this.LJIIIZ;
    }

    public final boolean getIncludeFontPadding() {
        return this.LJIILJJIL;
    }

    public final int getMaxLines() {
        return this.LJIIJ;
    }

    public final int getMaxWidth() {
        return this.LJIILL;
    }

    public final int getMeasureWidth() {
        return this.LJIILLIIL;
    }

    public final boolean getNeedAddFakeSpace() {
        return this.LJIILIIL;
    }

    public final Function1<MotionEvent, Boolean> getOnTextContentClick() {
        return this.LJIJ;
    }

    public final Function1<MotionEvent, Boolean> getOnTextContentDoubleClick() {
        return this.LJIJI;
    }

    public final Function1<MotionEvent, Boolean> getOnTextContentLongClick() {
        return this.LJIJJ;
    }

    public final CharSequence getText() {
        return this.LJI;
    }

    public final C135003c3y getTextArtist() {
        return this.LJFF;
    }

    public final int getTextColor() {
        return this.LJII;
    }

    public final C135001c3w getTextPaint() {
        return this.LIZLLL;
    }

    public final TextPaint getTextPaintForSpan() {
        return this.f26748LJ;
    }

    public final float getTextSize() {
        return this.LJIIIIZZ;
    }

    public final float getMaxLineWidth() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return this.LJFF.LIZ();
    }

    public final void setMaxWidth(int i) {
        this.LJIILL = i;
    }

    public final void setMeasureWidth(int i) {
        this.LJIILLIIL = i;
    }

    public final void setOnTextContentClick(Function1<? super MotionEvent, Boolean> function1) {
        this.LJIJ = function1;
    }

    public final void setOnTextContentDoubleClick(Function1<? super MotionEvent, Boolean> function1) {
        this.LJIJI = function1;
    }

    public final void setOnTextContentLongClick(Function1<? super MotionEvent, Boolean> function1) {
        this.LJIJJ = function1;
    }

    public final void setTextColor(int i) {
        this.LJII = i;
    }

    public final void setAlwaysUseAreaWidthForDisplay(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJIIL = z;
        this.LJFF.LJII = this.LJIIL;
        requestLayout();
    }

    public final void setEllipsis(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(charSequence);
        this.LJIIJJI = charSequence;
        this.LJFF.LIZ(this.LJIIJJI);
        requestLayout();
    }

    public final void setExtraLineSpacing(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJIIIZ = f;
        this.LJFF.f17866LJ = this.LJIIIZ;
        requestLayout();
    }

    public final void setIncludeFontPadding(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJIILJJIL = z;
        this.LJFF.LJIIIZ = this.LJIILJJIL;
        requestLayout();
    }

    public final void setMaxLines(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIIJ = i;
        this.LJFF.LIZ(this.LJIIJ);
        requestLayout();
    }

    public final void setNeedAddFakeSpace(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIILIIL = z;
        this.LJFF.LJIIIIZZ = this.LJIILIIL;
        requestLayout();
    }

    public final void setTextSize(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIIIZZ = f;
        this.LIZLLL.setTextSize(this.LJIIIIZZ);
        this.LJFF.LJI = this.LJIIIIZZ;
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        MethodCollector.m14708i(2322);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 10).isSupported) {
            MethodCollector.m14707o(2322);
            return;
        }
        C106862S5w.LIZ(canvas);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        this.LJFF.LIZ(canvas, this.LJIILLIIL, (getHeight() - getPaddingTop()) - getPaddingBottom());
        canvas.restore();
        MethodCollector.m14707o(2322);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        AbstractC135002c3x[] abstractC135002c3xArr;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        CharSequence charSequence = this.LJI;
        if (!(charSequence instanceof Spanned)) {
            charSequence = null;
        }
        Spanned spanned = (Spanned) charSequence;
        if ((spanned == null || (abstractC135002c3xArr = (AbstractC135002c3x[]) spanned.getSpans(0, this.LJI.length(), AbstractC135002c3x.class)) == null || abstractC135002c3xArr.length == 0) && this.LJIJ == null && this.LJIJJ == null && this.LJIJI == null) {
            return false;
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getActionMasked())) != null && valueOf.intValue() == 3) {
            AbstractC135002c3x abstractC135002c3x = this.LIZIZ;
            if (abstractC135002c3x != null) {
                abstractC135002c3x.LIZIZ = false;
            }
            invalidate();
            this.LIZIZ = null;
        }
        getContext();
        return this.LJIL.onTouchEvent(motionEvent);
    }

    public final void setText(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(charSequence);
        this.LJI = charSequence;
        this.LIZLLL.setTextSize(this.LJIIIIZZ);
        this.LIZLLL.setColor(this.LJII);
        C135003c3y c135003c3y = new C135003c3y(charSequence, this.LIZLLL, this.f26748LJ, false, 8);
        c135003c3y.LJFF = this.LJII;
        c135003c3y.LJI = this.LJIIIIZZ;
        c135003c3y.f17866LJ = this.LJIIIZ;
        c135003c3y.LIZ(this.LJIIJ);
        c135003c3y.LIZ(this.LJIIJJI);
        c135003c3y.LJII = this.LJIIL;
        c135003c3y.LJIIIZ = this.LJIILJJIL;
        c135003c3y.LJIIIIZZ = this.LJIILIIL;
        this.LJFF = c135003c3y;
        requestLayout();
    }

    public final AbstractC135002c3x LIZ(MotionEvent motionEvent) {
        int LIZIZ;
        Object[] spans;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (AbstractC135002c3x) proxy.result;
        }
        CharSequence charSequence = this.LJI;
        if (!(charSequence instanceof Spanned)) {
            charSequence = null;
        }
        Spanned spanned = (Spanned) charSequence;
        if (spanned == null) {
            return null;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C135003c3y c135003c3y = this.LJFF;
        float paddingLeft = x - getPaddingLeft();
        float paddingTop = y - getPaddingTop();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Float.valueOf(paddingLeft), Float.valueOf(paddingTop)}, c135003c3y, C135003c3y.LIZ, false, 29);
        if (proxy2.isSupported) {
            LIZIZ = ((Integer) proxy2.result).intValue();
        } else {
            LIZIZ = c135003c3y.LIZIZ(c135003c3y.LIZ(c135003c3y.LIZ(paddingTop), paddingLeft));
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{spanned, Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ), AbstractC135002c3x.class}, this, LIZ, false, 12);
        if (proxy3.isSupported) {
            spans = (Object[]) proxy3.result;
        } else {
            spans = spanned.getSpans(LIZIZ, LIZIZ, AbstractC135002c3x.class);
            if (spans != null) {
                Arrays.sort(spans, new C134999c3u(spanned));
            }
        }
        if (spans == null) {
            return null;
        }
        return (AbstractC135002c3x) ArraysKt___ArraysKt.lastOrNull(spans);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingRight;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            this.LJIILLIIL = (size - getPaddingLeft()) - getPaddingRight();
            setMeasuredDimension(size, size2);
            return;
        }
        int i3 = this.LJIILL;
        if (i3 <= 0) {
            paddingLeft = size - getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            paddingLeft = i3 - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        this.LJIILLIIL = paddingLeft - paddingRight;
        this.LJFF.LIZ(this.LJIIZILJ, this.LJIILLIIL);
        if (mode != 1073741824) {
            size = ((int) (this.LJIIZILJ.width() + 0.5f)) + getPaddingLeft() + getPaddingRight();
        }
        if (mode2 != 1073741824) {
            size2 = ((int) (this.LJIIZILJ.height() + 0.5f)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtistTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2323);
        this.LIZLLL = new C135001c3w(1);
        this.f26748LJ = new TextPaint(1);
        this.LJFF = new C135003c3y("", this.LIZLLL, this.f26748LJ, false, 8);
        this.LJI = "";
        this.LJII = -1;
        this.LJIIIIZZ = LK5.LIZJ(16.0f);
        this.LJIIIZ = LK5.LIZJ(2.0f);
        this.LJIIJ = Integer.MAX_VALUE;
        this.LJIIJJI = "";
        this.LJIIL = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(LK5.LIZJ(0.5f));
        paint.setColor(CastProtectorUtils.parseColor("#C6C7C9"));
        this.LJIIZILJ = new RectF();
        this.LJIJJLI = new C135000c3v(this);
        this.LJIL = new GestureDetector(context, this.LJIJJLI);
        MethodCollector.m14707o(2323);
    }

    public /* synthetic */ ArtistTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
