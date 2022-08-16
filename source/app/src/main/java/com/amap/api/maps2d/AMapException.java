package com.amap.api.maps2d;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class AMapException extends Exception {

    /* renamed from: a */
    public String f24075a;

    static {
        Covode.recordClassIndex(5347);
    }

    public String getErrorMessage() {
        return this.f24075a;
    }

    public AMapException() {
        this.f24075a = "未知的错误";
    }

    public AMapException(String str) {
        this.f24075a = "未知的错误";
        this.f24075a = str;
    }
}
