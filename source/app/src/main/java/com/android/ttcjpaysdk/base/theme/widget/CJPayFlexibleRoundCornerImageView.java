package com.android.ttcjpaysdk.base.theme.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C116971W2r;
import p003X.C499305oK;

/* loaded from: classes22.dex */
public class CJPayFlexibleRoundCornerImageView extends AppCompatImageView {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ = CJPayBasicUtils.dipToPX(getContext(), 4.0f);
    public int LIZJ = 0;
    public Paint LIZLLL;

    /* renamed from: LJ */
    public Matrix f25454LJ;
    public BitmapShader LJFF;

    static {
        Covode.recordClassIndex(6588);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 4).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                super.onDetachedFromWindow();
            }
            C499305oK.LIZ(this);
        }
    }

    public CJPayFlexibleRoundCornerImageView(Context context) {
        super(context);
        CastProtectorUtils.parseColor("#FE2C55");
        LIZ(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        int intrinsicHeight;
        Bitmap LIZ2;
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 2).isSupported && getDrawable() != null && getWidth() != 0 && getHeight() != 0) {
            Drawable drawable = getDrawable();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{drawable}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                LIZ2 = (Bitmap) proxy.result;
            } else if (drawable instanceof BitmapDrawable) {
                LIZ2 = ((BitmapDrawable) drawable).getBitmap();
            } else {
                if (drawable.getIntrinsicWidth() <= 0) {
                    intrinsicWidth = getWidth();
                } else {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                if (drawable.getIntrinsicHeight() <= 0) {
                    intrinsicHeight = getHeight();
                } else {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                }
                LIZ2 = C116971W2r.LIZ(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(LIZ2);
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas2);
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.LJFF = new BitmapShader(LIZ2, tileMode, tileMode);
            float f = 1.0f;
            if (LIZ2.getWidth() != getWidth() || LIZ2.getHeight() != getHeight()) {
                f = Math.max((getWidth() * 1.0f) / LIZ2.getWidth(), (getHeight() * 1.0f) / LIZ2.getHeight());
            }
            this.f25454LJ.setScale(f, f);
            this.LJFF.setLocalMatrix(this.f25454LJ);
            this.LIZLLL.setShader(this.LJFF);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i = this.LIZIZ;
            canvas.drawRoundRect(rectF, i, i, this.LIZLLL);
            int i2 = this.LIZJ ^ 15;
            if ((i2 & 1) != 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth() / 2.0f, getHeight() / 2.0f, this.LIZLLL);
            }
            if ((i2 & 2) != 0) {
                canvas.drawRect(getWidth() / 2.0f, 0.0f, getWidth(), getHeight() / 2.0f, this.LIZLLL);
            }
            if ((i2 & 4) != 0) {
                canvas.drawRect(0.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight(), this.LIZLLL);
            }
            if ((i2 & 8) != 0) {
                canvas.drawRect(getWidth() / 2.0f, getHeight() / 2.0f, getWidth(), getHeight(), this.LIZLLL);
            }
        }
    }

    public CJPayFlexibleRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CastProtectorUtils.parseColor("#FE2C55");
        LIZ(context, attributeSet);
    }

    private void LIZ(Context context, AttributeSet attributeSet) {
        if (!PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 1).isSupported && attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772062, 2130772063});
            if (obtainStyledAttributes != null) {
                this.LIZIZ = (int) obtainStyledAttributes.getDimension(1, CJPayBasicUtils.dipToPX(getContext(), 4.0f));
                this.LIZJ = obtainStyledAttributes.getInteger(0, CJPayBasicUtils.dipToPX(getContext(), 15.0f));
                obtainStyledAttributes.recycle();
            }
            this.f25454LJ = new Matrix();
            this.LIZLLL = new Paint();
            this.LIZLLL.setAntiAlias(true);
        }
    }

    public CJPayFlexibleRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CastProtectorUtils.parseColor("#FE2C55");
        LIZ(context, attributeSet);
    }
}
