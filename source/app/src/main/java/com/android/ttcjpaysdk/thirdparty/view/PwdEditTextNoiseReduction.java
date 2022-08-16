package com.android.ttcjpaysdk.thirdparty.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C135251c7y;

/* loaded from: classes17.dex */
public class PwdEditTextNoiseReduction extends C135251c7y {
    public static ChangeQuickRedirect LIZIZ;
    public int LIZJ;

    /* renamed from: LJ */
    public int f25551LJ;
    public int LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public int LJIILL;
    public float LJIILLIIL;
    public int LJIIZILJ;
    public float LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public Paint LJIJJLI;
    public Paint LJIL;
    public Paint LJJ;
    public float LJJI;

    static {
        Covode.recordClassIndex(9245);
    }

    public PwdEditTextNoiseReduction(Context context) {
        this(context, null);
    }

    private float LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 8);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    private void LIZ(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        float f = 0.0f;
        for (int i = 0; i < this.f25551LJ; i++) {
            if (i > 0) {
                f = f + this.LJJI + this.LJIILLIIL;
            }
            if (i == this.f25551LJ) {
                if (this.LJII || this.f25551LJ < this.LJFF) {
                    canvas.drawCircle((this.LJJI / 2.0f) + f, this.LJIJJ / 2, this.LJIJ, this.LJJ);
                    this.LJII = !this.LJI;
                }
            } else {
                canvas.drawCircle((this.LJJI / 2.0f) + f, this.LJIJJ / 2, this.LJIJ, this.LJJ);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 6).isSupported) {
            RectF rectF = new RectF();
            float f = 0.0f;
            for (int i = 0; i < this.LIZJ; i++) {
                if (i > 0) {
                    f = f + this.LJJI + this.LJIILLIIL;
                }
                rectF.left = f;
                rectF.right = this.LJJI + f;
                rectF.top = 0.0f;
                rectF.bottom = this.LJIJJ;
                float f2 = this.LJIILIIL;
                canvas.drawRoundRect(rectF, f2, f2, this.LJIL);
            }
        }
        LIZ(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 66) {
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public PwdEditTextNoiseReduction(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJIIIIZZ = LIZ(6);
        this.LJIIIZ = LIZ(1);
        this.LJIIJ = CastProtectorUtils.parseColor("#cecece");
        this.LJIIJJI = CastProtectorUtils.parseColor("#2c2f36");
        this.LJIIL = LIZ(6);
        this.LJIILLIIL = LIZ(8);
        this.LJI = false;
        this.LJII = true;
        if (!PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZIZ, false, 1).isSupported) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772066, 2130772067, 2130772080, 2130772089, 2130772090, 2130772094, 2130772095, 2130772096});
            obtainStyledAttributes.getInt(4, 0);
            this.LIZJ = obtainStyledAttributes.getInt(3, 6);
            this.LJIILL = obtainStyledAttributes.getColor(5, this.LJIIJ);
            this.LJIILJJIL = obtainStyledAttributes.getDimension(7, this.LJIIIZ);
            this.LJIILIIL = obtainStyledAttributes.getDimension(6, this.LJIIIIZZ);
            this.LJIIZILJ = obtainStyledAttributes.getColor(0, this.LJIIJJI);
            this.LJIJ = obtainStyledAttributes.getDimension(1, this.LJIIL);
            this.LJI = obtainStyledAttributes.getBoolean(2, false);
            this.LJII = !this.LJI;
            obtainStyledAttributes.recycle();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            this.LJIL = new Paint(1);
            this.LJIL.setColor(this.LJIILL);
            this.LJIL.setStrokeWidth(this.LJIILJJIL);
            this.LJIL.setStyle(Paint.Style.FILL);
            this.LJJ = new Paint(1);
            this.LJJ.setStyle(Paint.Style.FILL);
            this.LJJ.setColor(this.LJIIZILJ);
            this.LJIJJLI = new Paint(1);
            this.LJIJJLI.setStyle(Paint.Style.FILL);
            this.LJIJJLI.setColor(this.LJIIZILJ);
            this.LJIJJLI.setTypeface(Typeface.DEFAULT_BOLD);
            this.LJIJJLI.setTextSize(CJPayBasicUtils.dipToPX(getContext(), 32.0f));
            setCursorVisible(false);
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.LIZJ)});
            setBackgroundColor(-1);
            setMaxLines(1);
            setFocusable(false);
            addTextChangedListener(new TextWatcher() { // from class: com.android.ttcjpaysdk.thirdparty.view.PwdEditTextNoiseReduction.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(9246);
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    PwdEditTextNoiseReduction.this.LJFF = charSequence.toString().length();
                    PwdEditTextNoiseReduction pwdEditTextNoiseReduction = PwdEditTextNoiseReduction.this;
                    pwdEditTextNoiseReduction.LJII = !pwdEditTextNoiseReduction.LJI;
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    PwdEditTextNoiseReduction.this.f25551LJ = charSequence.toString().length();
                    if (PwdEditTextNoiseReduction.this.f25551LJ == PwdEditTextNoiseReduction.this.LIZJ && PwdEditTextNoiseReduction.this.LIZ != null) {
                        PwdEditTextNoiseReduction.this.LIZ.onComplete(charSequence.toString());
                    }
                    if (PwdEditTextNoiseReduction.this.f25551LJ > PwdEditTextNoiseReduction.this.LJFF) {
                        PwdEditTextNoiseReduction.this.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.view.PwdEditTextNoiseReduction.1.1
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(9247);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported || PwdEditTextNoiseReduction.this.getContext() == null) {
                                    return;
                                }
                                if ((PwdEditTextNoiseReduction.this.getContext() instanceof Activity) && ((Activity) PwdEditTextNoiseReduction.this.getContext()).isFinishing()) {
                                    return;
                                }
                                PwdEditTextNoiseReduction.this.LJII = true;
                                PwdEditTextNoiseReduction.this.postInvalidate();
                            }
                        }, 100L);
                    }
                }
            });
        }
    }

    public PwdEditTextNoiseReduction(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJIIIIZZ = LIZ(6);
        this.LJIIIZ = LIZ(1);
        this.LJIIJ = CastProtectorUtils.parseColor("#cecece");
        this.LJIIJJI = CastProtectorUtils.parseColor("#2c2f36");
        this.LJIIL = LIZ(6);
        this.LJIILLIIL = LIZ(8);
        this.LJI = false;
        this.LJII = true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.LJIJI = i;
        this.LJIJJ = i2;
        int i5 = this.LIZJ;
        if (i5 > 1) {
            this.LJJI = ((this.LJIJI - this.LJIILJJIL) - (this.LJIILLIIL * (i5 - 1))) / i5;
        }
    }
}
