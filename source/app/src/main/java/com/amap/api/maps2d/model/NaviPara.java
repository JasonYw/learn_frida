package com.amap.api.maps2d.model;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class NaviPara {
    public static final int DRIVING_AVOID_CONGESTION = 4;
    public static final int DRIVING_DEFAULT = 0;
    public static final int DRIVING_NO_HIGHWAY = 3;
    public static final int DRIVING_NO_HIGHWAY_AVOID_CONGESTION = 6;
    public static final int DRIVING_NO_HIGHWAY_AVOID_SHORT_MONEY = 5;
    public static final int DRIVING_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 8;
    public static final int DRIVING_SAVE_MONEY = 1;
    public static final int DRIVING_SAVE_MONEY_AVOID_CONGESTION = 7;
    public static final int DRIVING_SHORT_DISTANCE = 2;

    /* renamed from: a */
    public int f24165a;

    /* renamed from: b */
    public LatLng f24166b;

    static {
        Covode.recordClassIndex(5381);
    }

    public int getNaviStyle() {
        return this.f24165a;
    }

    public LatLng getTargetPoint() {
        return this.f24166b;
    }

    public void setTargetPoint(LatLng latLng) {
        this.f24166b = latLng;
    }

    public void setNaviStyle(int i) {
        if (i >= 0 && i < 9) {
            this.f24165a = i;
        }
    }
}
