package com.bytedance.android.live.broadcast.p280ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.ui.CustomSlideViewPager */
/* loaded from: classes3.dex */
public final class CustomSlideViewPager extends ViewPager {
    public boolean LIZ = true;

    static {
        Covode.recordClassIndex(17965);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.LIZ;
    }

    public final void setCanSlide(boolean z) {
        this.LIZ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSlideViewPager(Context context) {
        super(context);
        C106862S5w.LIZ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSlideViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
    }
}
