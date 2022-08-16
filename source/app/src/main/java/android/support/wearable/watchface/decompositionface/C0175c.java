package android.support.wearable.watchface.decompositionface;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.wearable.watchface.decompositionface.c */
/* loaded from: classes17.dex */
public final class C0175c extends Drawable {
    public Drawable LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final Rect LIZLLL = new Rect();

    static {
        Covode.recordClassIndex(398);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.LIZ;
        if (drawable == null) {
            return 0;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.LIZ;
        if (drawable != null && this.LIZIZ != 0) {
            return drawable.getIntrinsicHeight() / this.LIZIZ;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LIZ == null) {
            return;
        }
        this.LIZLLL.set(getBounds().left, getBounds().top - (this.LIZJ * getBounds().height()), getBounds().right, getBounds().bottom + (((this.LIZIZ - this.LIZJ) - 1) * getBounds().height()));
        this.LIZ.setBounds(this.LIZLLL);
        canvas.save();
        canvas.clipRect(getBounds());
        this.LIZ.draw(canvas);
        canvas.restore();
    }
}
