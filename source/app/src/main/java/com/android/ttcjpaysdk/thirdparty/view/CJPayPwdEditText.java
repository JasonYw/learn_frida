package com.android.ttcjpaysdk.thirdparty.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
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
public class CJPayPwdEditText extends C135251c7y {
    public static ChangeQuickRedirect LIZIZ;
    public static String LIZJ = "#FE2C55";

    /* renamed from: LJ */
    public int f25547LJ;
    public int LJFF;
    public int LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final float LJIILIIL;
    public int LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public float LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public Paint LJIL;
    public Paint LJJ;
    public Paint LJJI;
    public Paint LJJIFFI;
    public float LJJII;
    public float LJJIII;
    public volatile boolean LJJIIJ;
    public String LJJIIJZLJL;

    static {
        Covode.recordClassIndex(9232);
    }

    public Activity getActivityFromView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3);
        if (proxy.isSupported) {
            return (Activity) proxy.result;
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public CJPayPwdEditText(Context context) {
        this(context, null);
    }

    private float LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 10);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    private void LIZIZ(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 7).isSupported || this.f25547LJ == 1) {
            return;
        }
        for (int i = 1; i < this.f25547LJ; i++) {
            float f = this.LJJIII;
            float f2 = this.LJJII;
            float f3 = i;
            canvas.drawLine((f2 * f3) + f, f, f + (f2 * f3), this.LJIJJLI - f, this.LJIL);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 8).isSupported) {
            if (this.LJIILJJIL == 0) {
                float f = this.LJJIII;
                canvas.drawRect(f, f, this.LJIJJ - f, this.LJIJJLI - f, this.LJIL);
            } else {
                float f2 = this.LJJIII;
                RectF rectF = new RectF(f2, f2, this.LJIJJ - f2, this.LJIJJLI - f2);
                float f3 = this.LJIILL;
                canvas.drawRoundRect(rectF, f3, f3, this.LJIL);
            }
        }
        LIZIZ(canvas);
        LIZ(canvas);
    }

    private void LIZ(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.LJFF;
            if (i > i2) {
                break;
            }
            if (i == i2) {
                if (!this.LJIIIIZZ && this.LJFF >= this.LJI) {
                    int i3 = i - 1;
                    String charSequence = getText().subSequence(i3, i).toString();
                    float f = this.LJJIII;
                    float f2 = this.LJJII;
                    canvas.drawText(charSequence, f + (f2 / 3.0f) + (f2 * i3), (this.LJIJJLI / 2) + CJPayBasicUtils.dipToPX(getContext(), 12.0f), this.LJJI);
                } else {
                    float f3 = this.LJJIII;
                    float f4 = this.LJJII;
                    canvas.drawCircle(f3 + (f4 / 2.0f) + (f4 * (i - 1)), this.LJIJJLI / 2, this.LJIJI, this.LJJ);
                    this.LJIIIIZZ = !this.LJII;
                }
            } else {
                float f5 = this.LJJIII;
                float f6 = this.LJJII;
                canvas.drawCircle(f5 + (f6 / 2.0f) + (f6 * (i - 1)), this.LJIJJLI / 2, this.LJIJI, this.LJJ);
            }
            i++;
        }
        if (this.LJJIIJ && this.LJFF < this.f25547LJ) {
            canvas.drawRoundRect(new RectF(((this.LJJIII + (this.LJJII / 2.0f)) - CJPayBasicUtils.dipToPX(getContext(), 1.0f)) + (this.LJJII * this.LJFF), (this.LJIJJLI / 2) - CJPayBasicUtils.dipToPX(getContext(), 10.0f), this.LJJIII + (this.LJJII / 2.0f) + CJPayBasicUtils.dipToPX(getContext(), 1.0f) + (this.LJJII * this.LJFF), (this.LJIJJLI / 2) + CJPayBasicUtils.dipToPX(getContext(), 10.0f)), CJPayBasicUtils.dipToPX(getContext(), 1.0f), CJPayBasicUtils.dipToPX(getContext(), 1.0f), this.LJJIFFI);
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 66) {
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public CJPayPwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJIIIZ = LIZ(6);
        this.LJIIJ = LIZ(1);
        this.LJIIJJI = CastProtectorUtils.parseColor("#cecece");
        this.LJIIL = CastProtectorUtils.parseColor("#2c2f36");
        this.LJIILIIL = LIZ(6);
        this.LJII = false;
        this.LJIIIIZZ = true;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = LIZJ;
        if (!PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZIZ, false, 1).isSupported) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772066, 2130772067, 2130772080, 2130772089, 2130772090, 2130772094, 2130772095, 2130772096});
            this.LJIILJJIL = obtainStyledAttributes.getInt(4, 0);
            this.f25547LJ = obtainStyledAttributes.getInt(3, 6);
            this.LJIIZILJ = obtainStyledAttributes.getColor(5, this.LJIIJJI);
            this.LJIILLIIL = obtainStyledAttributes.getDimension(7, this.LJIIJ);
            this.LJIILL = obtainStyledAttributes.getDimension(6, this.LJIIIZ);
            this.LJIJ = obtainStyledAttributes.getColor(0, this.LJIIL);
            this.LJIJI = obtainStyledAttributes.getDimension(1, this.LJIILIIL);
            this.LJII = obtainStyledAttributes.getBoolean(2, false);
            this.LJIIIIZZ = !this.LJII;
            obtainStyledAttributes.recycle();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            this.LJIL = new Paint(1);
            this.LJIL.setColor(this.LJIIZILJ);
            this.LJIL.setStrokeWidth(this.LJIILLIIL);
            this.LJIL.setStyle(Paint.Style.STROKE);
            this.LJJ = new Paint(1);
            this.LJJ.setStyle(Paint.Style.FILL);
            this.LJJ.setColor(this.LJIJ);
            this.LJJI = new Paint(1);
            this.LJJI.setStyle(Paint.Style.STROKE);
            this.LJJI.setColor(this.LJIJ);
            this.LJJI.setTypeface(Typeface.DEFAULT_BOLD);
            this.LJJI.setTextSize(CJPayBasicUtils.dipToPX(getContext(), 32.0f));
            this.LJJIFFI = new Paint(1);
            try {
                this.LJJIFFI.setColor(Color.parseColor(this.LJJIIJZLJL));
            } catch (Exception unused) {
                this.LJJIFFI.setColor(CastProtectorUtils.parseColor("#FE2C55"));
            }
            this.LJJI.setStyle(Paint.Style.FILL);
            this.LJJIII = this.LJIILLIIL / 2.0f;
            setCursorVisible(false);
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f25547LJ)});
            setBackgroundColor(-1);
            setMaxLines(1);
            setFocusable(false);
            addTextChangedListener(new TextWatcher() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayPwdEditText.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(9233);
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    boolean z = PatchProxy.proxy(new Object[]{editable}, this, LIZ, false, 3).isSupported;
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    CJPayPwdEditText.this.LJI = charSequence.toString().length();
                    CJPayPwdEditText cJPayPwdEditText = CJPayPwdEditText.this;
                    cJPayPwdEditText.LJIIIIZZ = !cJPayPwdEditText.LJII;
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    CJPayPwdEditText.this.LJFF = charSequence.toString().length();
                    if (CJPayPwdEditText.this.LJFF == CJPayPwdEditText.this.f25547LJ && CJPayPwdEditText.this.LIZ != null) {
                        CJPayPwdEditText.this.LIZ.onComplete(charSequence.toString());
                    }
                    if (CJPayPwdEditText.this.LJFF > CJPayPwdEditText.this.LJI) {
                        CJPayPwdEditText.this.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayPwdEditText.1.1
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(9234);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported || CJPayPwdEditText.this.getContext() == null) {
                                    return;
                                }
                                if ((CJPayPwdEditText.this.getContext() instanceof Activity) && ((Activity) CJPayPwdEditText.this.getContext()).isFinishing()) {
                                    return;
                                }
                                CJPayPwdEditText.this.LJIIIIZZ = true;
                                CJPayPwdEditText.this.postInvalidate();
                            }
                        }, 100L);
                    }
                }
            });
        }
    }

    public CJPayPwdEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJIIIZ = LIZ(6);
        this.LJIIJ = LIZ(1);
        this.LJIIJJI = CastProtectorUtils.parseColor("#cecece");
        this.LJIIL = CastProtectorUtils.parseColor("#2c2f36");
        this.LJIILIIL = LIZ(6);
        this.LJII = false;
        this.LJIIIIZZ = true;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = LIZJ;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.LJIJJ = i;
        this.LJIJJLI = i2;
        this.LJJII = (this.LJIJJ - this.LJIILLIIL) / this.f25547LJ;
    }
}
