package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138262cuf;
import p003X.AbstractC138268cul;
import p003X.C138253cuW;
import p003X.C138266cuj;
import p003X.C138270cun;

/* loaded from: classes17.dex */
public class AppCompatImageView extends ImageView implements AbstractC138262cuf, AbstractC138268cul {
    public final C138253cuW mBackgroundTintHelper;
    public final C138266cuj mImageHelper;

    static {
        Covode.recordClassIndex(616);
    }

    @Override // p003X.AbstractC138262cuf
    public ColorStateList getSupportBackgroundTintList() {
        C138253cuW c138253cuW = this.mBackgroundTintHelper;
        if (c138253cuW != null) {
            return c138253cuW.LIZIZ();
        }
        return null;
    }

    @Override // p003X.AbstractC138262cuf
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C138253cuW c138253cuW = this.mBackgroundTintHelper;
        if (c138253cuW != null) {
            return c138253cuW.LIZJ();
        }
        return null;
    }

    @Override // p003X.AbstractC138268cul
    public ColorStateList getSupportImageTintList() {
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            return c138266cuj.LIZIZ();
        }
        return null;
    }

    @Override // p003X.AbstractC138268cul
    public PorterDuff.Mode getSupportImageTintMode() {
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            return c138266cuj.LIZJ();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C138253cuW c138253cuW = this.mBackgroundTintHelper;
        if (c138253cuW != null) {
            c138253cuW.LIZLLL();
        }
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            c138266cuj.LIZLLL();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.mImageHelper.LIZ() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            c138266cuj.LIZ(i);
        }
    }

    @Override // p003X.AbstractC138262cuf
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C138253cuW c138253cuW = this.mBackgroundTintHelper;
        if (c138253cuW != null) {
            c138253cuW.LIZ(colorStateList);
        }
    }

    @Override // p003X.AbstractC138262cuf
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C138253cuW c138253cuW = this.mBackgroundTintHelper;
        if (c138253cuW != null) {
            c138253cuW.LIZ(mode);
        }
    }

    @Override // p003X.AbstractC138268cul
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            c138266cuj.LIZ(colorStateList);
        }
    }

    @Override // p003X.AbstractC138268cul
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            c138266cuj.LIZ(mode);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C138253cuW c138253cuW = this.mBackgroundTintHelper;
        if (c138253cuW != null) {
            c138253cuW.LIZ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C138253cuW c138253cuW = this.mBackgroundTintHelper;
        if (c138253cuW != null) {
            c138253cuW.LIZ(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            c138266cuj.LIZLLL();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            c138266cuj.LIZLLL();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C138266cuj c138266cuj = this.mImageHelper;
        if (c138266cuj != null) {
            c138266cuj.LIZLLL();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0219ai.LIZ(context), attributeSet, i);
        C138270cun.LIZ(getContext());
        this.mBackgroundTintHelper = new C138253cuW(this);
        this.mBackgroundTintHelper.LIZ(attributeSet, i);
        this.mImageHelper = new C138266cuj(this);
        this.mImageHelper.LIZ(attributeSet, i);
    }
}
