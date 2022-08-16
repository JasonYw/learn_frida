package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.TextViewCompat;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138262cuf;
import p003X.C138250cuT;
import p003X.C138253cuW;
import p003X.C138257cua;
import p003X.C138259cuc;
import p003X.C138270cun;

/* loaded from: classes17.dex */
public class AppCompatEditText extends EditText implements AbstractC138262cuf {
    public final C138253cuW mBackgroundTintHelper;
    public final C138257cua mTextClassifierHelper;
    public final C138250cuT mTextHelper;

    static {
        Covode.recordClassIndex(614);
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

    @Override // android.widget.EditText, android.widget.TextView
    /* renamed from: getText */
    public Editable mo25203getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C138257cua c138257cua;
        if (Build.VERSION.SDK_INT < 28 && (c138257cua = this.mTextClassifierHelper) != null) {
            return c138257cua.LIZ();
        }
        return super.getTextClassifier();
    }

    public AppCompatEditText(Context context) {
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
    public void setTextClassifier(TextClassifier textClassifier) {
        C138257cua c138257cua;
        if (Build.VERSION.SDK_INT < 28 && (c138257cua = this.mTextClassifierHelper) != null) {
            c138257cua.LIZ = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130773056);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C138250cuT c138250cuT = this.mTextHelper;
        if (c138250cuT != null) {
            c138250cuT.LIZ(context, i);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0219ai.LIZ(context), attributeSet, i);
        C138270cun.LIZ(getContext());
        this.mBackgroundTintHelper = new C138253cuW(this);
        this.mBackgroundTintHelper.LIZ(attributeSet, i);
        this.mTextHelper = new C138250cuT(this);
        this.mTextHelper.LIZ(attributeSet, i);
        this.mTextHelper.LIZIZ();
        this.mTextClassifierHelper = new C138257cua(this);
    }
}
