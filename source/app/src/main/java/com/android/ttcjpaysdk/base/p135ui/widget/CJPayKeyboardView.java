package com.android.ttcjpaysdk.base.p135ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.settings.bean.InsuranceConfiguration;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC135262c89;
import p003X.AbstractC135263c8A;
import p003X.AbstractC136233cNo;
import p003X.C116971W2r;
import p003X.C136992ca3;

/* renamed from: com.android.ttcjpaysdk.base.ui.widget.CJPayKeyboardView */
/* loaded from: classes17.dex */
public class CJPayKeyboardView extends KeyboardView implements KeyboardView.OnKeyboardActionListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public InsuranceConfiguration insuranceConfiguration;
    public Bitmap insuranceIcon;
    public Rect keyIconRect;
    public AbstractC135262c89 listener;
    public AbstractC135263c8A onDoneListener;
    public boolean showX;
    public Paint textPaint;

    static {
        Covode.recordClassIndex(6685);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onPress(int i) {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onRelease(int i) {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onText(CharSequence charSequence) {
    }

    @Override // android.inputmethodservice.KeyboardView, android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeDown() {
    }

    @Override // android.inputmethodservice.KeyboardView, android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeLeft() {
    }

    @Override // android.inputmethodservice.KeyboardView, android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeRight() {
    }

    @Override // android.inputmethodservice.KeyboardView, android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeUp() {
    }

    public void hideX() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        this.showX = false;
        invalidate();
    }

    public void showX() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        this.showX = true;
        invalidate();
    }

    private void initTextPaint() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        this.textPaint = new Paint(1);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setTextSize(CJPayBasicUtils.dipToPX(getContext(), 24.0f));
        this.textPaint.setColor(C116971W2r.LIZ(getContext(), 2131623985));
    }

    private void setInsuranceImage() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.insuranceConfiguration = C136992ca3.LIZ().LJII();
        if (this.insuranceConfiguration.show && !TextUtils.isEmpty(this.insuranceConfiguration.keyboard_icon)) {
            C2153b.LJI.LIZ().LIZ(this.insuranceConfiguration.keyboard_icon, new AbstractC136233cNo() { // from class: com.android.ttcjpaysdk.base.ui.widget.CJPayKeyboardView.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6686);
                }

                @Override // p003X.AbstractC136233cNo
                public final void LIZIZ(Bitmap bitmap) {
                }

                @Override // p003X.AbstractC136233cNo
                public final void LIZ(Bitmap bitmap) {
                    if (!PatchProxy.proxy(new Object[]{bitmap}, this, LIZ, false, 1).isSupported && bitmap != null && !bitmap.isRecycled()) {
                        CJPayKeyboardView cJPayKeyboardView = CJPayKeyboardView.this;
                        cJPayKeyboardView.insuranceIcon = bitmap;
                        cJPayKeyboardView.invalidate();
                    }
                }
            });
        }
    }

    public void showDone() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        setKeyboard(new Keyboard(getContext(), 2132148232));
        setInsuranceImage();
    }

    public void showInsurance() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.insuranceConfiguration = C136992ca3.LIZ().LJII();
        if (this.insuranceConfiguration.show && !TextUtils.isEmpty(this.insuranceConfiguration.keyboard_icon)) {
            setKeyboard(new Keyboard(getContext(), 2132148233));
            setInsuranceImage();
        }
    }

    public void setOnDoneListener(AbstractC135263c8A abstractC135263c8A) {
        this.onDoneListener = abstractC135263c8A;
    }

    public void setOnKeyListener(AbstractC135262c89 abstractC135262c89) {
        this.listener = abstractC135262c89;
    }

    public void onKeyForShoots(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        onKey(i, new int[]{0});
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onDraw(Canvas canvas) {
        MethodCollector.m14708i(430);
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 7).isSupported) {
            MethodCollector.m14707o(430);
            return;
        }
        super.onDraw(canvas);
        for (Keyboard.Key key : getKeyboard().getKeys()) {
            if (key.codes[0] == -10) {
                drawKeyBackground(key, canvas);
                if (this.showX) {
                    drawKeyLabel(key, canvas, CJPayBasicUtils.dipToPX(getContext(), 22.0f), 0);
                }
            }
            if (key.codes[0] == -4) {
                drawKeyBackground(key, canvas);
                drawKeyLabel(key, canvas, CJPayBasicUtils.dipToPX(getContext(), 16.0f), key.width / 3);
            }
            if (key.codes[0] == -300) {
                drawKeyBackground(key, canvas);
            }
            if (key.codes[0] == -5) {
                drawKeyBackground(key, canvas);
                drawKeyIcon(key, canvas, getResources().getDrawable(2130840389));
            }
            if (key.codes[0] == -500) {
                drawKeyBackground(key, canvas);
                if (this.insuranceConfiguration.show) {
                    drawInsuranceView(canvas, this.insuranceIcon);
                }
            }
        }
        MethodCollector.m14707o(430);
    }

    public CJPayKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(428);
        init(context, attributeSet);
        MethodCollector.m14707o(428);
    }

    private void drawKeyBackground(Keyboard.Key key, Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{key, canvas}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        Drawable drawable = getResources().getDrawable(2130840254);
        drawable.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        drawable.draw(canvas);
    }

    private void drawInsuranceView(Canvas canvas, Bitmap bitmap) {
        if (!PatchProxy.proxy(new Object[]{canvas, bitmap}, this, changeQuickRedirect, false, 9).isSupported && getContext() != null && bitmap != null) {
            int dipToPX = CJPayBasicUtils.dipToPX(getContext(), 182.0f);
            int dipToPX2 = CJPayBasicUtils.dipToPX(getContext(), 12.0f);
            int screenWidth = (CJPayBasicUtils.getScreenWidth(getContext()) - dipToPX) / 2;
            int dipToPX3 = CJPayBasicUtils.dipToPX(getContext(), 15.0f);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), bitmap);
            bitmapDrawable.setBounds(screenWidth, dipToPX3, dipToPX + screenWidth, dipToPX2 + dipToPX3);
            bitmapDrawable.draw(canvas);
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        setKeyboard(new Keyboard(context, 2132148231));
        setEnabled(true);
        setFocusable(true);
        setPreviewEnabled(false);
        setOnKeyboardActionListener(this);
        initTextPaint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772093});
        this.showX = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onKey(int i, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), iArr}, this, changeQuickRedirect, false, 12).isSupported || i == -500) {
            return;
        }
        if (i == -10) {
            if (this.showX) {
                this.listener.LIZ("X");
                return;
            }
            return;
        }
        AbstractC135262c89 abstractC135262c89 = this.listener;
        if (abstractC135262c89 != null) {
            if (i == -5) {
                abstractC135262c89.LIZ();
            } else if (i == -4) {
                AbstractC135263c8A abstractC135263c8A = this.onDoneListener;
                if (abstractC135263c8A != null) {
                    abstractC135263c8A.LIZ();
                }
            } else if (i != -300) {
                abstractC135262c89.LIZ(String.valueOf((char) i));
            }
        }
    }

    public CJPayKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(429);
        init(context, attributeSet);
        MethodCollector.m14707o(429);
    }

    private void drawKeyIcon(Keyboard.Key key, Canvas canvas, Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{key, canvas, drawable}, this, changeQuickRedirect, false, 10).isSupported || drawable == null) {
            return;
        }
        Rect rect = this.keyIconRect;
        if (rect == null || rect.isEmpty()) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > key.width) {
                int i = key.width;
                intrinsicHeight = (int) (((i * 1.0f) / intrinsicWidth) * intrinsicHeight);
                intrinsicWidth = i;
            } else if (intrinsicHeight > key.height) {
                int i2 = key.height;
                intrinsicWidth = (int) (((i2 * 1.0f) / intrinsicHeight) * intrinsicWidth);
                intrinsicHeight = i2;
            }
            int i3 = (key.x + (key.width / 2)) - (intrinsicWidth / 2);
            int i4 = (key.y + (key.height / 2)) - (intrinsicHeight / 2);
            this.keyIconRect = new Rect(i3, i4, intrinsicWidth + i3, intrinsicHeight + i4);
        }
        Rect rect2 = this.keyIconRect;
        if (rect2 != null && !rect2.isEmpty()) {
            drawable.setBounds(this.keyIconRect);
            drawable.draw(canvas);
        }
    }

    private void drawKeyLabel(Keyboard.Key key, Canvas canvas, int i, int i2) {
        if (!PatchProxy.proxy(new Object[]{key, canvas, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 11).isSupported && key.label != null) {
            this.textPaint.setTextSize(i);
            Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
            canvas.drawText(key.label.toString(), key.x + (key.width / 2) + i2, (float) (((key.y + (key.height / 2.0d)) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.bottom), this.textPaint);
        }
    }
}
