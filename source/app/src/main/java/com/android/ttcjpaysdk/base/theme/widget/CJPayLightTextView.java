package com.android.ttcjpaysdk.base.theme.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C135343c9S;

/* loaded from: classes17.dex */
public class CJPayLightTextView extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ = CastProtectorUtils.parseColor("#FE2C55");

    static {
        Covode.recordClassIndex(6589);
    }

    public CJPayLightTextView(Context context) {
        super(context);
        LIZ(context);
    }

    private void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            return;
        }
        try {
            this.LIZIZ = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZLLL.LIZ);
        } catch (Exception unused) {
        }
        setTextColor(this.LIZIZ);
    }

    public CJPayLightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ(context);
    }

    public CJPayLightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZ(context);
    }
}
