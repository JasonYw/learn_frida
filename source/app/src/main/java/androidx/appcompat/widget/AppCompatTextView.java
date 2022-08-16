package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.C0245c;
import androidx.core.widget.TextViewCompat;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p003X.AbstractC138207ctm;
import p003X.AbstractC138208ctn;
import p003X.AbstractC138262cuf;
import p003X.C138250cuT;
import p003X.C138253cuW;
import p003X.C138257cua;
import p003X.C138259cuc;
import p003X.C138270cun;
import p003X.C138491cyN;

/* loaded from: classes17.dex */
public class AppCompatTextView extends TextView implements AbstractC138262cuf, AbstractC138207ctm, AbstractC138208ctn {
    public final C138253cuW mBackgroundTintHelper;
    public Future<C0245c> mPrecomputedTextFuture;
    public final C138257cua mTextClassifierHelper;
    public final C138250cuT mTextHelper;

    static {
        Covode.recordClassIndex(631);
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    @Override // p003X.AbstractC138208ctn
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.LJIIJ();
    }

    @Override // p003X.AbstractC138208ctn
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.LJIIJJI();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    public C0245c.C0246a getTextMetricsParamsCompat() {
        return TextViewCompat.getTextMetricsParams(this);
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

    private void consumeTextFutureAndSetBlocking() {
        Future<C0245c> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                TextViewCompat.setPrecomputedText(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C138257cua c138257cua;
        if (Build.VERSION.SDK_INT < 28 && (c138257cua = this.mTextClassifierHelper) != null) {
            return c138257cua.LIZ();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        TextViewCompat.setLineHeight(this, i);
    }

    public void setPrecomputedText(C0245c c0245c) {
        TextViewCompat.setPrecomputedText(this, c0245c);
    }

    public void setTextMetricsParamsCompat(C0245c.C0246a c0246a) {
        TextViewCompat.setTextMetricsParams(this, c0246a);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C138259cuc.LIZ(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
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

    public void setTextFuture(Future<C0245c> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.setFirstBaselineToTopHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.setLastBaselineToBottomHeight(this, i);
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C138257cua c138257cua;
        if (Build.VERSION.SDK_INT < 28 && (c138257cua = this.mTextClassifierHelper) != null) {
            c138257cua.LIZ = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (typeface != null && i > 0) {
            if (getContext() != null) {
                int i2 = Build.VERSION.SDK_INT;
                Typeface create = Typeface.create(typeface, i);
                if (create != null) {
                    typeface = create;
                }
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0219ai.LIZ(context), attributeSet, i);
        C138270cun.LIZ(getContext());
        this.mBackgroundTintHelper = new C138253cuW(this);
        this.mBackgroundTintHelper.LIZ(attributeSet, i);
        this.mTextHelper = new C138250cuT(this);
        this.mTextHelper.LIZ(attributeSet, i);
        this.mTextHelper.LIZIZ();
        this.mTextClassifierHelper = new C138257cua(this);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !AbstractC138207ctm.LIZLLL && this.mTextHelper.m21668LJ()) {
            this.mTextHelper.LIZLLL();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = C138491cyN.LIZIZ(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C138491cyN.LIZIZ(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C138491cyN.LIZIZ(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = C138491cyN.LIZIZ(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = C138491cyN.LIZIZ(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C138491cyN.LIZIZ(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C138491cyN.LIZIZ(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = C138491cyN.LIZIZ(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ();
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
