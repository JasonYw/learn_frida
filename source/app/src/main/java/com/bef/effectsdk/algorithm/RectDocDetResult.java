package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public class RectDocDetResult {
    public RectDocDetRatio rectDocDetRatio;
    public RectDocDetTargetArea rectDocDetTargetArea;
    public int resultStatus;

    static {
        Covode.recordClassIndex(9549);
    }

    public RectDocDetRatio getRectDocDetRatio() {
        return this.rectDocDetRatio;
    }

    public RectDocDetTargetArea getRectDocDetTargetArea() {
        return this.rectDocDetTargetArea;
    }

    public int getResultStatus() {
        return this.resultStatus;
    }

    public RectDocDetResult() {
        this.resultStatus = -1;
    }

    public RectDocDetResult(RectDocDetTargetArea rectDocDetTargetArea, RectDocDetRatio rectDocDetRatio) {
        this.rectDocDetTargetArea = rectDocDetTargetArea;
        this.rectDocDetRatio = rectDocDetRatio;
    }
}
