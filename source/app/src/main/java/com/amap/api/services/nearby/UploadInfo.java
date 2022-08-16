package com.amap.api.services.nearby;

import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class UploadInfo {

    /* renamed from: a */
    public int f25099a = 1;

    /* renamed from: b */
    public String f25100b;

    /* renamed from: c */
    public LatLonPoint f25101c;

    static {
        Covode.recordClassIndex(5736);
    }

    public int getCoordType() {
        return this.f25099a;
    }

    public LatLonPoint getPoint() {
        return this.f25101c;
    }

    public String getUserID() {
        return this.f25100b;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f25101c = latLonPoint;
    }

    public void setUserID(String str) {
        this.f25100b = str;
    }

    public void setCoordType(int i) {
        if (i != 0 && i != 1) {
            this.f25099a = 1;
        } else {
            this.f25099a = i;
        }
    }
}
