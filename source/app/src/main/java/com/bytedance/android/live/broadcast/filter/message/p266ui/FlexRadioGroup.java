package com.bytedance.android.live.broadcast.filter.message.p266ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.filter.message.ui.FlexRadioGroup */
/* loaded from: classes12.dex */
public class FlexRadioGroup extends RadioGroup {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ = 3;
    public int LIZJ = LK5.LIZ(32.0f);
    public int LIZLLL = LK5.LIZ(8.0f);

    /* renamed from: LJ */
    public int f25826LJ = LK5.LIZ(8.0f);

    static {
        Covode.recordClassIndex(15835);
    }

    public FlexRadioGroup(Context context) {
        super(context);
        MethodCollector.m14708i(1251);
        MethodCollector.m14707o(1251);
    }

    public FlexRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1252);
        MethodCollector.m14707o(1252);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        setMeasuredDimension(i, i2);
        if (getChildCount() == 0) {
            i4 = 0;
        } else {
            int childCount = getChildCount() / this.LIZIZ;
            if (getChildCount() % this.LIZIZ == 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            i4 = childCount + i3;
        }
        int measuredWidth = getMeasuredWidth();
        int i5 = this.LIZJ;
        int i6 = (i4 * i5) + ((i4 - 1) * this.f25826LJ);
        int i7 = this.LIZLLL;
        int i8 = this.LIZIZ;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((measuredWidth - (i7 * (i8 - 1))) / i8, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            getChildAt(i9).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        setMeasuredDimension(resolveSize(measuredWidth, i), resolveSize(i6, i2));
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = 3;
        this.LIZJ = i2;
        this.f25826LJ = i3;
        this.LIZLLL = i4;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        int i5 = this.LIZIZ;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int measuredWidth = childAt.getMeasuredWidth() + i6;
            int measuredHeight = childAt.getMeasuredHeight() + i7;
            childAt.layout(i6, i7, measuredWidth, measuredHeight);
            if (i8 >= i5 - 1) {
                i7 = measuredHeight + this.f25826LJ;
                i6 = 0;
                i8 = 0;
            } else {
                i8++;
                i6 = measuredWidth + this.LIZLLL;
            }
        }
    }
}
