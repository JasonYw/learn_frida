package com.bytedance.android.live.broadcast.p280ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.ui.FixRatioFrameLayout */
/* loaded from: classes.dex */
public final class FixRatioFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(17966);
    }

    public FixRatioFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public FixRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1327);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1327);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i) * 3.0f) / 4.0f), 1073741824));
        MethodCollector.m14707o(1327);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1328);
        MethodCollector.m14707o(1328);
    }

    public /* synthetic */ FixRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
