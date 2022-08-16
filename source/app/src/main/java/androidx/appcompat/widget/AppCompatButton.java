package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.TextViewCompat;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138207ctm;
import p003X.AbstractC138208ctn;
import p003X.AbstractC138262cuf;
import p003X.C138250cuT;
import p003X.C138253cuW;
import p003X.C138270cun;

/* loaded from: classes17.dex */
public class AppCompatButton extends Button implements AbstractC138262cuf, AbstractC138207ctm, AbstractC138208ctn {
    public final C138253cuW mBackgroundTintHelper;
    public final C138250cuT mTextHelper;

    static {
        Covode.recordClassIndex(610);
    }

    @Override // p003X.AbstractC138208ctn
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.LJIIJ();
    }

    @Override // p003X.AbstractC138208ctn
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.LJIIJJI();
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

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, p003X.AbstractC138207ctm
    public int getAutoSizeMaxTextSize() {
        if (AbstractC138207ctm.LIZLLL) {
            return super.getAutoSizeMaxTextSize();
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            return c138250cuT.LJIIIIZZ();
        }
        return -1;
    }

    @Override // android.widget.TextView, p003X.AbstractC138207ctm
    public int getAutoSizeMinTextSize() {
        if (AbstractC138207ctm.LIZLLL) {
            return super.getAutoSizeMinTextSize();
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            return c138250cuT.LJII();
        }
        return -1;
    }

    @Override // android.widget.TextView, p003X.AbstractC138207ctm
    public int getAutoSizeStepGranularity() {
        if (AbstractC138207ctm.LIZLLL) {
            return super.getAutoSizeStepGranularity();
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            return c138250cuT.LJI();
        }
        return -1;
    }

    @Override // android.widget.TextView, p003X.AbstractC138207ctm
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC138207ctm.LIZLLL) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            return c138250cuT.LJIIIZ();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, p003X.AbstractC138207ctm
    public int getAutoSizeTextType() {
        if (AbstractC138207ctm.LIZLLL) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT == null) {
            return 0;
        }
        return c138250cuT.LJFF();
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ(z);
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, p003X.AbstractC138207ctm
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC138207ctm.LIZLLL) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ(i);
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

    @Override // p003X.AbstractC138208ctn
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.LIZ(colorStateList);
        this.mTextHelper.LIZIZ();
    }

    @Override // p003X.AbstractC138208ctn
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.LIZ(mode);
        this.mTextHelper.LIZIZ();
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130772527);
    }

    @Override // android.widget.TextView, p003X.AbstractC138207ctm
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC138207ctm.LIZLLL) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (AbstractC138207ctm.LIZLLL) {
            super.setTextSize(i, f);
            return;
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0219ai.LIZ(context), attributeSet, i);
        C138270cun.LIZ(getContext());
        this.mBackgroundTintHelper = new C138253cuW(this);
        this.mBackgroundTintHelper.LIZ(attributeSet, i);
        this.mTextHelper = new C138250cuT(this);
        this.mTextHelper.LIZ(attributeSet, i);
        this.mTextHelper.LIZIZ();
    }

    @Override // android.widget.TextView, p003X.AbstractC138207ctm
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC138207ctm.LIZLLL) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !AbstractC138207ctm.LIZLLL && this.mTextHelper.m21668LJ()) {
            this.mTextHelper.LIZLLL();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZJ();
        }
    }
}
