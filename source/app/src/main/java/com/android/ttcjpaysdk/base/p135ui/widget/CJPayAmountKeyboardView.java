package com.android.ttcjpaysdk.base.p135ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.settings.bean.InsuranceConfiguration;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC135265c8C;
import p003X.AbstractC135266c8D;
import p003X.AbstractC136233cNo;
import p003X.C135272c8J;
import p003X.C135343c9S;
import p003X.C136992ca3;

/* renamed from: com.android.ttcjpaysdk.base.ui.widget.CJPayAmountKeyboardView */
/* loaded from: classes17.dex */
public class CJPayAmountKeyboardView extends KeyboardView implements KeyboardView.OnKeyboardActionListener {
    public static ChangeQuickRedirect LIZ;
    public Bitmap LIZIZ;
    public Paint LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public float f25458LJ = 0.5f;
    public InsuranceConfiguration LJFF;
    public int LJI;
    public AbstractC135265c8C LJII;
    public AbstractC135266c8D LJIIIIZZ;

    static {
        Covode.recordClassIndex(6681);
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

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJFF = C136992ca3.LIZ().LJII();
        if (!this.LJFF.show || TextUtils.isEmpty(this.LJFF.keyboard_icon)) {
            return;
        }
        setKeyboard(new Keyboard(getContext(), 2132148229));
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJFF = C136992ca3.LIZ().LJII();
        String str = null;
        if (!this.LJFF.show) {
            return;
        }
        int i = this.LJI;
        if (i == 0) {
            if (!TextUtils.isEmpty(this.LJFF.light_amount_keyboard_icon)) {
                str = this.LJFF.light_amount_keyboard_icon;
            }
        } else if (i == 1) {
            if (!TextUtils.isEmpty(this.LJFF.dark_amount_keyboard_icon)) {
                str = this.LJFF.dark_amount_keyboard_icon;
            }
        } else if (!TextUtils.isEmpty(this.LJFF.light_amount_keyboard_icon)) {
            str = this.LJFF.light_amount_keyboard_icon;
        }
        C2153b.LJI.LIZ().LIZ(str, new AbstractC136233cNo() { // from class: com.android.ttcjpaysdk.base.ui.widget.CJPayAmountKeyboardView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(6682);
            }

            @Override // p003X.AbstractC136233cNo
            public final void LIZIZ(Bitmap bitmap) {
            }

            @Override // p003X.AbstractC136233cNo
            public final void LIZ(Bitmap bitmap) {
                if (!PatchProxy.proxy(new Object[]{bitmap}, this, LIZ, false, 1).isSupported && bitmap != null && !bitmap.isRecycled()) {
                    CJPayAmountKeyboardView cJPayAmountKeyboardView = CJPayAmountKeyboardView.this;
                    cJPayAmountKeyboardView.LIZIZ = bitmap;
                    cJPayAmountKeyboardView.invalidate();
                }
            }
        });
    }

    private void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        this.LIZJ = new Paint(1);
        this.LIZJ.setTextAlign(Paint.Align.CENTER);
    }

    public void setOnDoneListener(AbstractC135266c8D abstractC135266c8D) {
        this.LJIIIIZZ = abstractC135266c8D;
    }

    public void setOnKeyListener(AbstractC135265c8C abstractC135265c8C) {
        this.LJII = abstractC135265c8C;
    }

    public void setEnableDone(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZLLL = z;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033e A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0353  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // android.inputmethodservice.KeyboardView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p135ui.widget.CJPayAmountKeyboardView.onDraw(android.graphics.Canvas):void");
    }

    public CJPayAmountKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(425);
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            if (C135343c9S.LIZ().LIZ(context)) {
                this.LJI = 0;
            } else {
                this.LJI = 1;
            }
        }
        LIZ(context, attributeSet);
        MethodCollector.m14707o(425);
    }

    private int LIZ(float f, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f), Integer.valueOf(i)}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return (Math.min((int) MotionEventCompat.ACTION_MASK, Math.max(0, (int) (f * 255.0f))) << 24) + (i & ViewCompat.MEASURED_SIZE_MASK);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onKey(int i, int[] iArr) {
        AbstractC135265c8C abstractC135265c8C;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), iArr}, this, LIZ, false, 13).isSupported || (abstractC135265c8C = this.LJII) == null || i == -600) {
            return;
        }
        if (i == -5) {
            abstractC135265c8C.LIZ();
        } else if (i == -4) {
            AbstractC135266c8D abstractC135266c8D = this.LJIIIIZZ;
            if (abstractC135266c8D != null && this.LIZLLL) {
                abstractC135266c8D.LIZ();
            }
        } else {
            abstractC135265c8C.LIZ(String.valueOf((char) i));
        }
    }

    private void LIZ(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 2).isSupported) {
            return;
        }
        setKeyboard(new Keyboard(context, 2132148228));
        setEnabled(true);
        setFocusable(true);
        setPreviewEnabled(false);
        setOnKeyboardActionListener(this);
        LIZIZ();
    }

    private void LIZ(Keyboard.Key key, Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{key, canvas}, this, LIZ, false, 9).isSupported && getContext() != null) {
            StateListDrawable LIZ2 = LIZ(CJPayBasicUtils.dipToPX(getContext(), 5.0f), C135272c8J.LIZIZ(getContext(), 2130772648), C135272c8J.LIZIZ(getContext(), 2130772649), 2);
            int[] currentDrawableState = key.getCurrentDrawableState();
            if (key.codes[0] != 0) {
                LIZ2.setState(currentDrawableState);
            }
            LIZ2.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
            LIZ2.draw(canvas);
        }
    }

    public CJPayAmountKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(426);
        LIZ(context, attributeSet);
        MethodCollector.m14707o(426);
    }

    private GradientDrawable LIZ(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), 5}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (GradientDrawable) proxy.result;
        }
        float dipToPX = CJPayBasicUtils.dipToPX(getContext(), 5.0f);
        float[] fArr = {dipToPX, dipToPX, dipToPX, dipToPX, dipToPX, dipToPX, dipToPX, dipToPX};
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2});
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    public static StateListDrawable LIZ(int i, int i2, int i3, int i4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 2}, null, LIZ, true, 17);
        if (proxy.isSupported) {
            return (StateListDrawable) proxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (i != 0) {
            float f = i;
            float[] fArr = {f, f, f, f, f, f, f, f};
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setColor(i2);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadii(fArr);
            gradientDrawable2.setColor(i3);
            stateListDrawable.addState(new int[]{16842919, 16842909}, gradientDrawable2);
            stateListDrawable.addState(new int[]{16842919, -16842908}, gradientDrawable2);
            stateListDrawable.addState(new int[]{16842913}, gradientDrawable2);
            stateListDrawable.addState(new int[]{16842908}, gradientDrawable2);
            stateListDrawable.addState(new int[0], gradientDrawable);
            return stateListDrawable;
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(i2);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(i3);
        stateListDrawable.addState(new int[]{16842919, 16842909}, gradientDrawable4);
        stateListDrawable.addState(new int[]{16842919, -16842908}, gradientDrawable4);
        stateListDrawable.addState(new int[]{16842913}, gradientDrawable4);
        stateListDrawable.addState(new int[]{16842908}, gradientDrawable4);
        stateListDrawable.addState(new int[0], gradientDrawable3);
        return stateListDrawable;
    }

    private StateListDrawable LIZ(String str, int i, int i2, int i3, int i4, int i5) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 2}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (StateListDrawable) proxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (!TextUtils.isEmpty(str)) {
            GradientDrawable LIZ2 = LIZ(i, i2, 5);
            GradientDrawable LIZ3 = LIZ(i3, i4, 5);
            stateListDrawable.addState(new int[]{16842919, 16842909}, LIZ3);
            stateListDrawable.addState(new int[]{16842919, -16842908}, LIZ3);
            stateListDrawable.addState(new int[]{16842913}, LIZ3);
            stateListDrawable.addState(new int[]{16842908}, LIZ3);
            stateListDrawable.addState(new int[0], LIZ2);
            return stateListDrawable;
        }
        GradientDrawable LIZ4 = LIZ(i, i2, 5);
        GradientDrawable LIZ5 = LIZ(i3, i4, 5);
        stateListDrawable.addState(new int[]{16842919, 16842909}, LIZ5);
        stateListDrawable.addState(new int[]{16842919, -16842908}, LIZ5);
        stateListDrawable.addState(new int[]{16842913}, LIZ5);
        stateListDrawable.addState(new int[]{16842908}, LIZ5);
        stateListDrawable.addState(new int[0], LIZ4);
        return stateListDrawable;
    }
}
