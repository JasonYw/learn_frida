package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class UnCheckRadioButton extends AppCompatRadioButton {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(24229);
    }

    @Override // android.widget.RadioButton, android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        setChecked(!isChecked());
    }

    public UnCheckRadioButton(Context context) {
        super(context);
    }

    public UnCheckRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UnCheckRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
