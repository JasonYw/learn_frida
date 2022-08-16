package com.android.ttcjpaysdk.thirdparty.view;

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
import p003X.C116971W2r;

/* loaded from: classes22.dex */
public class CJPayRoundCornerImageView extends AppCompatImageView {
    public static ChangeQuickRedirect LIZIZ;
    public int LIZ;
    public Paint LIZJ;
    public Matrix LIZLLL;

    /* renamed from: LJ */
    public BitmapShader f25548LJ;

    static {
        Covode.recordClassIndex(9235);
    }

    public CJPayRoundCornerImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        int intrinsicHeight;
        Bitmap LIZ;
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 1).isSupported && getDrawable() != null && getWidth() != 0 && getHeight() != 0) {
            Drawable drawable = getDrawable();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{drawable}, this, LIZIZ, false, 2);
            if (proxy.isSupported) {
                LIZ = (Bitmap) proxy.result;
            } else if (drawable instanceof BitmapDrawable) {
                LIZ = ((BitmapDrawable) drawable).getBitmap();
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
                LIZ = C116971W2r.LIZ(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(LIZ);
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas2);
            }
            if (LIZ == null) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f25548LJ = new BitmapShader(LIZ, tileMode, tileMode);
            float f = 1.0f;
            if (LIZ.getWidth() != getWidth() || LIZ.getHeight() != getHeight()) {
                f = Math.max((getWidth() * 1.0f) / LIZ.getWidth(), (getHeight() * 1.0f) / LIZ.getHeight());
            }
            this.LIZLLL.setScale(f, f);
            this.f25548LJ.setLocalMatrix(this.LIZLLL);
            this.LIZJ.setShader(this.f25548LJ);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i = this.LIZ;
            canvas.drawRoundRect(rectF, i, i, this.LIZJ);
        }
    }

    public CJPayRoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CJPayRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LIZ = CJPayBasicUtils.dipToPX(getContext(), 4.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772091});
        if (obtainStyledAttributes != null) {
            this.LIZ = (int) obtainStyledAttributes.getDimension(0, CJPayBasicUtils.dipToPX(getContext(), 4.0f));
            obtainStyledAttributes.recycle();
        }
        this.LIZLLL = new Matrix();
        this.LIZJ = new Paint();
        this.LIZJ.setAntiAlias(true);
    }
}
