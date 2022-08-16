package com.android.ttcjpaysdk.thirdparty.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes22.dex */
public class CJPayMaskLayout extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public Drawable LIZIZ;
    public Paint LIZJ;

    static {
        Covode.recordClassIndex(9207);
    }

    public CJPayMaskLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        MethodCollector.m14708i(555);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(555);
        } else if (this.LIZIZ != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.saveLayer(0.0f, 0.0f, measuredWidth, measuredHeight, null);
            } else {
                canvas.saveLayer(0.0f, 0.0f, measuredWidth, measuredHeight, null, 31);
            }
            this.LIZIZ.setBounds(getPaddingLeft(), getPaddingTop(), measuredWidth - getPaddingRight(), measuredHeight - getPaddingBottom());
            this.LIZIZ.draw(canvas);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.saveLayer(0.0f, 0.0f, measuredWidth, measuredHeight, this.LIZJ);
            } else {
                canvas.saveLayer(0.0f, 0.0f, measuredWidth, measuredHeight, this.LIZJ, 31);
            }
            super.draw(canvas);
            canvas.restore();
            canvas.restore();
            MethodCollector.m14707o(555);
        } else {
            super.draw(canvas);
            MethodCollector.m14707o(555);
        }
    }

    public CJPayMaskLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(554);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772081});
        this.LIZIZ = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.LIZJ = new Paint(1);
        this.LIZJ.setFilterBitmap(true);
        this.LIZJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        setWillNotDraw(false);
        MethodCollector.m14707o(554);
    }
}
