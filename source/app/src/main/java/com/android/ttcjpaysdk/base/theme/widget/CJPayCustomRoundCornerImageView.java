package com.android.ttcjpaysdk.base.theme.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
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
import p003X.C135343c9S;
import p003X.C499305oK;

/* loaded from: classes28.dex */
public class CJPayCustomRoundCornerImageView extends AppCompatImageView {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ = CastProtectorUtils.parseColor("#FE2C55");
    public int LIZJ = CJPayBasicUtils.dipToPX(getContext(), 4.0f);
    public Paint LIZLLL;

    /* renamed from: LJ */
    public Matrix f25452LJ;
    public BitmapShader LJFF;

    static {
        Covode.recordClassIndex(6586);
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

    public CJPayCustomRoundCornerImageView(Context context) {
        super(context);
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
            this.f25452LJ.setScale(f, f);
            this.LJFF.setLocalMatrix(this.f25452LJ);
            this.LIZLLL.setShader(this.LJFF);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i = this.LIZJ;
            canvas.drawRoundRect(rectF, i, i, this.LIZLLL);
        }
    }

    public CJPayCustomRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ(context, attributeSet);
    }

    private void LIZ(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772061});
            if (obtainStyledAttributes != null) {
                this.LIZJ = (int) obtainStyledAttributes.getDimension(0, CJPayBasicUtils.dipToPX(getContext(), 4.0f));
                obtainStyledAttributes.recycle();
            }
            this.f25452LJ = new Matrix();
            this.LIZLLL = new Paint();
            this.LIZLLL.setAntiAlias(true);
        }
        try {
            this.LIZIZ = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZIZ.LIZ);
        } catch (Exception unused) {
        }
        setImageDrawable(new ColorDrawable(this.LIZIZ));
    }

    public CJPayCustomRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZ(context, attributeSet);
    }
}
