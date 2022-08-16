package com.amap.api.services.help;

import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class InputtipsQuery implements Cloneable {

    /* renamed from: a */
    public String f25070a;

    /* renamed from: b */
    public String f25071b;

    /* renamed from: c */
    public boolean f25072c;

    /* renamed from: d */
    public String f25073d;

    /* renamed from: e */
    public LatLonPoint f25074e;

    static {
        Covode.recordClassIndex(5712);
    }

    public String getCity() {
        return this.f25071b;
    }

    public boolean getCityLimit() {
        return this.f25072c;
    }

    public String getKeyword() {
        return this.f25070a;
    }

    public LatLonPoint getLocation() {
        return this.f25074e;
    }

    public String getType() {
        return this.f25073d;
    }

    public void setCityLimit(boolean z) {
        this.f25072c = z;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.f25074e = latLonPoint;
    }

    public void setType(String str) {
        this.f25073d = str;
    }

    public InputtipsQuery(String str, String str2) {
        this.f25070a = str;
        this.f25071b = str2;
    }
}
