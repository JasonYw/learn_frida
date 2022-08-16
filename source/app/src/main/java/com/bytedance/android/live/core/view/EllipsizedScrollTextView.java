package com.bytedance.android.live.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.util.Pair;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class EllipsizedScrollTextView extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public Scroller LIZJ;

    /* renamed from: LJ */
    public int f26204LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public int LJIIIIZZ;

    static {
        Covode.recordClassIndex(24210);
    }

    @Override // android.widget.TextView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        setEllipsize(null);
        setTranslationX(0.0f);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        setEllipsize(null);
        Scroller scroller = this.LIZJ;
        if (scroller != null) {
            scroller.abortAnimation();
            this.LIZJ = null;
        }
        this.LJII = null;
        this.f26204LJ = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        Scroller scroller;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.computeScroll();
        Scroller scroller2 = this.LIZJ;
        if (scroller2 != null && scroller2.isFinished() && !this.LIZIZ && !PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (scroller = this.LIZJ) != null && !this.LIZIZ) {
            this.LIZIZ = true;
            this.f26204LJ = scroller.getCurrX();
            this.LIZJ.abortAnimation();
        }
    }

    private Pair<String, Integer> getEllipsizedText() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        TextPaint paint = getPaint();
        int width = getWidth();
        if (width >= LIZ(paint, getText().toString())) {
            return new Pair<>("", 0);
        }
        for (int i = 1; i < getText().length(); i++) {
            int LIZ2 = LIZ(paint, getText().subSequence(0, i).toString() + this.LJI);
            if (LIZ2 == width) {
                return new Pair<>(((Object) getText().subSequence(0, i)) + this.LJI, 0);
            } else if (LIZ2 > width) {
                StringBuilder sb = new StringBuilder();
                int i2 = i - 1;
                sb.append((Object) getText().subSequence(0, i2));
                sb.append(this.LJI);
                String sb2 = sb.toString();
                return new Pair<>(sb2, Integer.valueOf(width - LIZ(paint, getText().subSequence(0, i2).toString() + this.LJI)));
            }
        }
        return new Pair<>(getText().toString(), 0);
    }

    public final void LIZ() {
        int LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        Pair<String, Integer> ellipsizedText = getEllipsizedText();
        this.LJII = ellipsizedText.first;
        this.LJIIIIZZ = ellipsizedText.second.intValue();
        this.LIZIZ = true;
        ALogger.m15797i("EllipsizedScrollTextView", "getEllipsizedText; startScroll; mEllipsizedText=" + this.LJII + ", mEllipsizedTextGap=" + this.LJIIIIZZ);
        if (!TextUtils.isEmpty(this.LJII) && !PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && this.LIZIZ) {
            ALogger.m15797i("EllipsizedScrollTextView", "resumeScroll");
            setText(((Object) getText()) + this.LJFF + this.LJII);
            setHorizontallyScrolling(true);
            this.LIZJ = new Scroller(getContext(), new LinearInterpolator());
            setScroller(this.LIZJ);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            if (proxy.isSupported) {
                LIZ2 = ((Integer) proxy.result).intValue();
            } else {
                LIZ2 = LIZ(getPaint(), getText().toString());
            }
            int LIZ3 = LIZ2 - (LIZ(getPaint(), this.LJII) + this.f26204LJ);
            this.LIZJ.startScroll(this.f26204LJ, 0, LIZ3, 0, (int) ((LIZ3 / LIZ(getPaint(), "正")) * 307.69232f));
            invalidate();
            this.LIZIZ = false;
        }
    }

    public EllipsizedScrollTextView(Context context) {
        this(context, null);
        setSingleLine();
        setEllipsize(null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onDraw(canvas);
    }

    public EllipsizedScrollTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
        setSingleLine();
        setEllipsize(null);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.proxy(new Object[]{charSequence, bufferType}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.setText(charSequence, bufferType);
    }

    private int LIZ(TextPaint textPaint, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{textPaint, str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    public EllipsizedScrollTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LIZIZ = true;
        this.LJFF = "      ";
        this.LJI = "...  ";
        setSingleLine();
        setEllipsize(null);
    }
}
