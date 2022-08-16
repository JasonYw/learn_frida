package com.bytedance.android.live.liveinteract.p382pk.p384ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.liveinteract.pk.ui.RandomPkViewPager */
/* loaded from: classes3.dex */
public class RandomPkViewPager extends ViewPager {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(29096);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        setClipChildren(false);
        setFadingEdgeLength(0);
    }

    public RandomPkViewPager(Context context) {
        super(context);
        LIZ();
    }

    public RandomPkViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onMeasure(i, i2);
    }
}
