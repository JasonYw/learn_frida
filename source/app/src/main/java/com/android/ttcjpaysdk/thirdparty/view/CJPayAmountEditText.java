package com.android.ttcjpaysdk.thirdparty.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC135346c9V;

/* loaded from: classes17.dex */
public class CJPayAmountEditText extends CJPayPasteAwareEditText {
    public static ChangeQuickRedirect LIZ;
    public AbstractC135346c9V LIZIZ;

    static {
        Covode.recordClassIndex(9202);
    }

    public CJPayAmountEditText(Context context) {
        super(context);
    }

    public void setOnInputChangedListener(AbstractC135346c9V abstractC135346c9V) {
        this.LIZIZ = abstractC135346c9V;
    }

    public CJPayAmountEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onSelectionChanged(i, i2);
        if (i == i2) {
            try {
                if (mo25203getText() == null) {
                    setSelection(0);
                } else {
                    setSelection(mo25203getText().length());
                }
            } catch (Exception unused) {
            }
        }
    }

    public CJPayAmountEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
