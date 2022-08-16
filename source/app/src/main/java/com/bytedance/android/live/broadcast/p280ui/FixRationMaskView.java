package com.bytedance.android.live.broadcast.p280ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.ui.FixRationMaskView */
/* loaded from: classes.dex */
public final class FixRationMaskView extends View {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(17967);
    }

    public FixRationMaskView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FixRationMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1329);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1329);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((View.MeasureSpec.getSize(i) * 3.0f) / 4.0f) * 0.7d), 1073741824));
        MethodCollector.m14707o(1329);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixRationMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1330);
        MethodCollector.m14707o(1330);
    }

    public /* synthetic */ FixRationMaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
