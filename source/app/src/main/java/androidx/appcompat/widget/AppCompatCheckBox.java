package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138262cuf;
import p003X.AbstractC138263cug;
import p003X.C138250cuT;
import p003X.C138253cuW;
import p003X.C138255cuY;
import p003X.C138270cun;
import p003X.C138491cyN;

/* loaded from: classes17.dex */
public class AppCompatCheckBox extends CheckBox implements AbstractC138262cuf, AbstractC138263cug {
    public final C138253cuW mBackgroundTintHelper;
    public final C138255cuY mCompoundButtonHelper;
    public final C138250cuT mTextHelper;

    static {
        Covode.recordClassIndex(611);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C138255cuY c138255cuY = this.mCompoundButtonHelper;
        if (c138255cuY != null) {
            return c138255cuY.LIZ(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
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

    public ColorStateList getSupportButtonTintList() {
        C138255cuY c138255cuY = this.mCompoundButtonHelper;
        if (c138255cuY != null) {
            return c138255cuY.LIZ;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C138255cuY c138255cuY = this.mCompoundButtonHelper;
        if (c138255cuY != null) {
            return c138255cuY.LIZIZ;
        }
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C138253cuW c138253cuW = this.mBackgroundTintHelper;
        if (c138253cuW != null) {
            c138253cuW.LIZLLL();
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZIZ();
        }
    }

    public AppCompatCheckBox(Context context) {
        this(context, null);
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

    @Override // p003X.AbstractC138263cug
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C138255cuY c138255cuY = this.mCompoundButtonHelper;
        if (c138255cuY != null) {
            c138255cuY.LIZ(colorStateList);
        }
    }

    @Override // p003X.AbstractC138263cug
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C138255cuY c138255cuY = this.mCompoundButtonHelper;
        if (c138255cuY != null) {
            c138255cuY.LIZ(mode);
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C138491cyN.LIZIZ(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C138255cuY c138255cuY = this.mCompoundButtonHelper;
        if (c138255cuY != null) {
            c138255cuY.LIZ();
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130772562);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0219ai.LIZ(context), attributeSet, i);
        C138270cun.LIZ(getContext());
        this.mCompoundButtonHelper = new C138255cuY(this);
        this.mCompoundButtonHelper.LIZ(attributeSet, i);
        this.mBackgroundTintHelper = new C138253cuW(this);
        this.mBackgroundTintHelper.LIZ(attributeSet, i);
        this.mTextHelper = new C138250cuT(this);
        this.mTextHelper.LIZ(attributeSet, i);
    }
}