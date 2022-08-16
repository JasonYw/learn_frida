package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public class ObjectInfo {
    public int bbox_bottom;
    public int bbox_left;
    public int bbox_right;
    public int bbox_top;
    public int label;

    static {
        Covode.recordClassIndex(9546);
    }

    public void logData() {
    }

    public int getBBoxBottom() {
        return this.bbox_bottom;
    }

    public int getBBoxLeft() {
        return this.bbox_left;
    }

    public int getBBoxRight() {
        return this.bbox_right;
    }

    public int getBboxTop() {
        return this.bbox_top;
    }

    public int getLabel() {
        return this.label;
    }

    public ObjectInfo() {
        this.label = -1;
        this.bbox_left = -1;
        this.bbox_top = -1;
        this.bbox_right = -1;
        this.bbox_bottom = -1;
    }

    public void setLabel(int i) {
        this.label = i;
    }

    public void setBBox(int i, int i2, int i3, int i4) {
        this.bbox_left = i;
        this.bbox_top = i2;
        this.bbox_right = i3;
        this.bbox_bottom = i4;
    }

    public ObjectInfo(int i, int i2, int i3, int i4, int i5) {
        this.label = i;
        this.bbox_left = i2;
        this.bbox_top = i3;
        this.bbox_right = i4;
        this.bbox_bottom = i5;
    }
}
