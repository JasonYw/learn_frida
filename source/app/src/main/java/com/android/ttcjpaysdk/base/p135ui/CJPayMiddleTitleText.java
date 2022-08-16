package com.android.ttcjpaysdk.base.p135ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C135268c8F;

/* renamed from: com.android.ttcjpaysdk.base.ui.CJPayMiddleTitleText */
/* loaded from: classes17.dex */
public final class CJPayMiddleTitleText extends TextView {
    static {
        Covode.recordClassIndex(6602);
    }

    public CJPayMiddleTitleText(Context context) {
        this(context, null, 0, 6, null);
    }

    public CJPayMiddleTitleText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayMiddleTitleText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(411);
        C135268c8F.LIZ(this);
        MethodCollector.m14707o(411);
    }

    public /* synthetic */ CJPayMiddleTitleText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
