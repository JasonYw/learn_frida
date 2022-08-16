package com.android.ttcjpaysdk.base.p135ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.android.ttcjpaysdk.base.settings.bean.InsuranceConfiguration;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.View$OnClickListenerC136724cVj;

/* renamed from: com.android.ttcjpaysdk.base.ui.widget.TalkbackKeyboardNoiseReductionView */
/* loaded from: classes17.dex */
public final class TalkbackKeyboardNoiseReductionView extends View$OnClickListenerC136724cVj {
    static {
        Covode.recordClassIndex(6695);
    }

    public TalkbackKeyboardNoiseReductionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TalkbackKeyboardNoiseReductionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // p003X.View$OnClickListenerC136724cVj
    public final int getLayoutId() {
        return 2131690754;
    }

    @Override // p003X.View$OnClickListenerC136724cVj
    public final String LIZ(InsuranceConfiguration insuranceConfiguration) {
        if (insuranceConfiguration != null) {
            return insuranceConfiguration.keyboard_denoise_icon;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TalkbackKeyboardNoiseReductionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ TalkbackKeyboardNoiseReductionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
