package com.bytedance.android.live.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes22.dex */
public class MaxWidthLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;

    static {
        Covode.recordClassIndex(24213);
    }

    public void setMaxWidth(int i) {
        this.LIZIZ = i;
    }

    public MaxWidthLinearLayout(Context context) {
        super(context);
        MethodCollector.m14708i(1636);
        MethodCollector.m14707o(1636);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1637);
        MethodCollector.m14707o(1637);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1639);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1639);
            return;
        }
        if (this.LIZIZ > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.LIZIZ;
            if (size > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        }
        super.onMeasure(i, i2);
        MethodCollector.m14707o(1639);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1638);
        MethodCollector.m14707o(1638);
    }
}
