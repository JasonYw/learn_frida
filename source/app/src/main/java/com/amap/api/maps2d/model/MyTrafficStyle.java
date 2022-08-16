package com.amap.api.maps2d.model;

import com.bytedance.covode.number.Covode;

/* loaded from: classes21.dex */
public class MyTrafficStyle {

    /* renamed from: a */
    public int f24161a = -16735735;

    /* renamed from: b */
    public int f24162b = -35576;

    /* renamed from: c */
    public int f24163c = -1441006;

    /* renamed from: d */
    public int f24164d = -7208950;

    static {
        Covode.recordClassIndex(5380);
    }

    public int getSmoothColor() {
        return this.f24161a;
    }

    public void setSmoothColor(int i) {
        this.f24161a = i;
    }

    public int getSlowColor() {
        return this.f24162b;
    }

    public void setSlowColor(int i) {
        this.f24162b = i;
    }

    public int getCongestedColor() {
        return this.f24163c;
    }

    public void setCongestedColor(int i) {
        this.f24163c = i;
    }

    public int getSeriousCongestedColor() {
        return this.f24164d;
    }

    public void setSeriousCongestedColor(int i) {
        this.f24164d = i;
    }
}
