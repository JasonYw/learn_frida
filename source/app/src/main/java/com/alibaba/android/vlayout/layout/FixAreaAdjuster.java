package com.alibaba.android.vlayout.layout;

import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class FixAreaAdjuster {
    public static final FixAreaAdjuster mDefaultAdjuster = new FixAreaAdjuster(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    static {
        Covode.recordClassIndex(4381);
    }

    public FixAreaAdjuster(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }
}
