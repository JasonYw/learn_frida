package com.android.ttcjpaysdk.thirdparty.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p003X.AbstractC135275c8M;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C6H;
import p003X.C9H6;
import p003X.RunnableC135274c8L;

/* loaded from: classes17.dex */
public final class CJPayNewVerificationCodeEditText extends AppCompatEditText {
    public static ChangeQuickRedirect LIZ;
    public RunnableC135274c8L LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public Drawable f25545LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public Drawable LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public AbstractC135275c8M LJIIJJI;

    static {
        Covode.recordClassIndex(9219);
    }

    public CJPayNewVerificationCodeEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public CJPayNewVerificationCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void LIZJ() {
        RunnableC135274c8L runnableC135274c8L;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && (runnableC135274c8L = this.LIZIZ) != null) {
            runnableC135274c8L.LIZ();
        }
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        RunnableC135274c8L runnableC135274c8L = this.LIZIZ;
        if (runnableC135274c8L != null) {
            runnableC135274c8L.LIZIZ();
        }
        m16025LJ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        LIZLLL();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        LIZJ();
    }

    /* renamed from: LJ */
    private final void m16025LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        if (LIZ()) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new RunnableC135274c8L(this);
            }
            removeCallbacks(this.LIZIZ);
            C9H6.LIZ(this, new CJPayNewVerificationCodeEditText$makeCurBlink$1(this), 500L);
            return;
        }
        RunnableC135274c8L runnableC135274c8L = this.LIZIZ;
        if (runnableC135274c8L != null) {
            removeCallbacks(runnableC135274c8L);
        }
    }

    public final boolean LIZ() {
        int selectionStart;
        int selectionEnd;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJIIIZ || !isFocused() || (selectionStart = getSelectionStart()) < 0 || (selectionEnd = getSelectionEnd()) < 0 || selectionStart != selectionEnd) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Editable mo25203getText = mo25203getText();
        if (mo25203getText == null || mo25203getText.toString().length() < this.LIZJ) {
            return false;
        }
        return true;
    }

    public final void setOnInputTextListener(AbstractC135275c8M abstractC135275c8M) {
        this.LJIIJJI = abstractC135275c8M;
    }

    private final void setMaxLength(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported && i >= 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            RunnableC135274c8L runnableC135274c8L = this.LIZIZ;
            if (runnableC135274c8L != null) {
                runnableC135274c8L.LIZIZ();
            }
            m16025LJ();
            return;
        }
        RunnableC135274c8L runnableC135274c8L2 = this.LIZIZ;
        if (runnableC135274c8L2 != null) {
            runnableC135274c8L2.LIZ();
        }
    }

    private final void LIZ(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 10).isSupported) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, 0.0f);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int LIZ2 = C116971W2r.LIZ(context.getResources(), 2131623985);
        Editable editableText = getEditableText();
        Intrinsics.checkNotNullExpressionValue(editableText, "");
        int length = editableText.length();
        for (int i = 0; i < length; i++) {
            float measureText = getPaint().measureText(String.valueOf(getEditableText().charAt(i)));
            Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
            getPaint().getFontMetrics(fontMetrics);
            TextPaint paint = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "");
            paint.setColor(LIZ2);
            int i2 = this.LJFF;
            canvas.drawText(String.valueOf(getEditableText().charAt(i)), (((this.LIZLLL + i2) * i) + (i2 / 2.0f)) - (measureText / 2.0f), (this.LJI / 2.0f) - ((fontMetrics.top + fontMetrics.bottom) / 2.0f), getPaint());
        }
        canvas.restoreToCount(save);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(canvas);
        super.onDraw(canvas);
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 9).isSupported && (drawable = this.f25545LJ) != null) {
            int coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(0, getEditableText().length());
            int save = canvas.save();
            int i = this.LIZJ;
            int i2 = 0;
            while (i2 < i) {
                drawable.setBounds(new Rect(0, 0, this.LJFF, this.LJI));
                drawable.setState(coerceAtLeast == i2 ? new int[]{16842913} : new int[]{16842910});
                drawable.draw(canvas);
                canvas.translate(this.LJFF + this.LIZLLL, 0.0f);
                i2++;
            }
            canvas.restoreToCount(save);
        }
        LIZ(canvas);
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 11).isSupported && this.LJIIIZ) {
            this.LJIIJ = true ^ this.LJIIJ;
            if (this.LJIIJ) {
                if (this.LJIIIIZZ == null && this.LJII != 0) {
                    this.LJIIIIZZ = getContext().getDrawable(this.LJII);
                }
                Drawable drawable2 = this.LJIIIIZZ;
                if (drawable2 != null) {
                    int coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(0, getEditableText().length());
                    int save2 = canvas.save();
                    int lineForOffset = getLayout().getLineForOffset(getSelectionStart());
                    int lineTop = getLayout().getLineTop(lineForOffset);
                    int lineBottom = getLayout().getLineBottom(lineForOffset);
                    Rect rect = new Rect();
                    drawable2.getPadding(rect);
                    drawable2.setBounds(new Rect(0, lineTop - rect.top, drawable2.getIntrinsicWidth(), lineBottom + rect.bottom));
                    int i3 = this.LJFF;
                    canvas.translate((((this.LIZLLL + i3) * coerceAtLeast2) + (i3 / 2.0f)) - (drawable2.getIntrinsicWidth() / 2.0f), (this.LJI - drawable2.getBounds().height()) / 2.0f);
                    drawable2.draw(canvas);
                    canvas.restoreToCount(save2);
                }
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i3 = this.LJFF;
            int i4 = this.LIZJ;
            size = (i3 * i4) + ((i4 - 1) * this.LIZLLL);
        } else {
            int i5 = this.LIZLLL;
            int i6 = this.LIZJ;
            this.LJFF = (size - (i5 * (i6 - 1))) / i6;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = this.LJI;
        } else {
            this.LJI = size2;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), rect}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onFocusChanged(z, i, rect);
        if (z) {
            m16025LJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayNewVerificationCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZJ = 6;
        this.LIZLLL = C6H.LIZ(16.0f, context);
        this.LJFF = C6H.LIZ(50.0f, context);
        this.LJI = C6H.LIZ(50.0f, context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772082, 2130772083, 2130772084, 2130772085, 2130772086, 2130772087, 2130772088});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 3) {
                this.LIZJ = obtainStyledAttributes.getInteger(index, this.LIZJ);
            } else if (index == 2) {
                this.f25545LJ = obtainStyledAttributes.getDrawable(index);
            } else if (index == 5) {
                this.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(index, this.LIZLLL);
            } else if (index == 6) {
                this.LJFF = obtainStyledAttributes.getDimensionPixelSize(index, this.LJFF);
            } else if (index == 4) {
                this.LJI = obtainStyledAttributes.getDimensionPixelSize(index, this.LJI);
            } else if (index == 1) {
                this.LJIIIZ = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == 0) {
                this.LJII = obtainStyledAttributes.getResourceId(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
        if (this.LJIIIZ && this.LJIIIIZZ == null && this.LJII == 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C116971W2r.LIZ(context.getResources(), 2131624890));
            gradientDrawable.setSize(C6H.LIZ(1.0f, context), 0);
            this.LJIIIIZZ = gradientDrawable;
        }
        setMaxLength(this.LIZJ);
        setBackgroundColor(0);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onTextChanged(charSequence, i, i2, i3);
        if (charSequence != null) {
            if (charSequence.length() >= this.LIZJ) {
                LIZJ();
                CJPayInputKeyboardHelper.hideSystemKeyboard(getContext());
                AbstractC135275c8M abstractC135275c8M = this.LJIIJJI;
                if (abstractC135275c8M != null) {
                    abstractC135275c8M.LIZ(charSequence);
                }
            } else if (charSequence.length() + 1 != this.LIZJ || i2 != 1) {
            } else {
                LIZLLL();
            }
        }
    }

    public /* synthetic */ CJPayNewVerificationCodeEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
