package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* loaded from: classes12.dex */
public class PKListItemShadowView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public float LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public float f26298LJ;
    public float LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ = true;
    public boolean LJIIJJI;

    static {
        Covode.recordClassIndex(26493);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return 0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return 0;
    }

    public void setInvalidateShadowOnSizeChanged(boolean z) {
        this.LJIIJ = z;
    }

    public PKListItemShadowView(Context context) {
        super(context);
        LIZ(context, (AttributeSet) null);
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{-1}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = -1;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            this.LJIIJJI = true;
            requestLayout();
            invalidate();
        }
    }

    public PKListItemShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ(context, attributeSet);
    }

    private void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), LIZ(i, i2, this.LIZLLL, this.LIZJ, this.f26298LJ, this.LJFF, this.LIZIZ, 0));
        int i3 = Build.VERSION.SDK_INT;
        setBackground(bitmapDrawable);
    }

    private void LIZIZ(Context context, AttributeSet attributeSet) {
        TypedArray LIZ2;
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 7).isSupported || (LIZ2 = LIZ(context, attributeSet, new int[]{2130772481, 2130772806, 2130773030, 2130773031, 2130773576, 2130774155, 2130774361, 2130774364, 2130774817})) == null) {
            return;
        }
        try {
            this.LJI = LIZ2.getBoolean(4, true);
            this.LJII = LIZ2.getBoolean(5, true);
            this.LJIIIZ = LIZ2.getBoolean(0, true);
            this.LJIIIIZZ = LIZ2.getBoolean(8, true);
            this.LIZLLL = LIZ2.getDimension(1, 0.0f);
            this.LIZJ = LIZ2.getDimension(7, 0.0f);
            this.f26298LJ = LIZ2.getDimension(2, 0.0f);
            this.LJFF = LIZ2.getDimension(3, 0.0f);
            this.LIZIZ = LIZ2.getColor(6, C116971W2r.LIZ(getResources(), 2131629090));
        } finally {
            LIZ2.recycle();
        }
    }

    private void LIZ(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZIZ(context, attributeSet);
        int abs = (int) (this.LIZJ + Math.abs(this.f26298LJ));
        int abs2 = (int) (this.LIZJ + Math.abs(this.LJFF));
        if (this.LJI) {
            i = abs;
        } else {
            i = 0;
        }
        if (this.LJIIIIZZ) {
            i2 = abs2;
        } else {
            i2 = 0;
        }
        if (!this.LJII) {
            abs = 0;
        }
        if (!this.LJIIIZ) {
            abs2 = 0;
        }
        setPadding(i, i2, abs, abs2);
    }

    public PKListItemShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZ(context, attributeSet);
    }

    private TypedArray LIZ(Context context, AttributeSet attributeSet, int[] iArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, attributeSet, iArr}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (TypedArray) proxy.result;
        }
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (getBackground() == null || this.LJIIJ || this.LJIIJJI) {
                this.LJIIJJI = false;
                LIZ(i, i2);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.LJIIJJI) {
            this.LJIIJJI = false;
            LIZ(i3 - i, i4 - i2);
        }
    }

    private Bitmap LIZ(int i, int i2, float f, float f2, float f3, float f4, int i3, int i4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i3), 0}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (Bitmap) proxy.result;
        }
        Bitmap LIZ2 = C116971W2r.LIZ(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(LIZ2);
        RectF rectF = new RectF(f2, f2, i - f2, i2 - f2);
        if (f4 > 0.0f) {
            rectF.top += f4;
            rectF.bottom -= f4;
        } else if (f4 < 0.0f) {
            rectF.top += Math.abs(f4);
            rectF.bottom -= Math.abs(f4);
        }
        if (f3 > 0.0f) {
            rectF.left += f3;
            rectF.right -= f3;
        } else if (f3 < 0.0f) {
            rectF.left += Math.abs(f3);
            rectF.right -= Math.abs(f3);
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        if (!isInEditMode()) {
            paint.setShadowLayer(f2, f3, f4, i3);
        }
        canvas.drawRoundRect(rectF, f, f, paint);
        return LIZ2;
    }
}
