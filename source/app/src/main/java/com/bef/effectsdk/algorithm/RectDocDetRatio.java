package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public class RectDocDetRatio {
    public int heightVal;
    public float ratio;
    public int widthVal;

    static {
        Covode.recordClassIndex(9548);
    }

    public int getHeightVal() {
        return this.heightVal;
    }

    public float getRatio() {
        return this.ratio;
    }

    public int getWidthVal() {
        return this.widthVal;
    }

    public RectDocDetRatio(float f, int i, int i2) {
        this.ratio = f;
        this.widthVal = i;
        this.heightVal = i2;
    }
}
