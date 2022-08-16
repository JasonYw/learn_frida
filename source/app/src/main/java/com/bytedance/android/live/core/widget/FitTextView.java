package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes22.dex */
public class FitTextView extends LiveTextView {
    public static ChangeQuickRedirect LIZ;
    public Paint LJFF;
    public float LJI;
    public float LJII;

    static {
        Covode.recordClassIndex(24225);
    }

    public FitTextView(Context context) {
        this(context, null);
    }

    public FitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJII = 6.0f;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            this.LJFF = new TextPaint();
            this.LJFF.set(getPaint());
            this.LJI = getTextSize();
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.proxy(new Object[]{charSequence, bufferType}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.setText(charSequence, bufferType);
        LIZ(charSequence.toString(), getWidth());
    }

    private void LIZ(String str, int i) {
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 4).isSupported && i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f = this.LJI;
            this.LJFF.setTextSize(f);
            while (true) {
                if (this.LJFF.measureText(str) <= paddingLeft) {
                    break;
                }
                f -= 1.0f;
                float f2 = this.LJII;
                if (f <= f2) {
                    f = f2;
                    break;
                }
                this.LJFF.setTextSize(f);
            }
            setTextSize(0, f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 2).isSupported && i != i3) {
            LIZ(getText().toString(), i);
        }
    }
}
