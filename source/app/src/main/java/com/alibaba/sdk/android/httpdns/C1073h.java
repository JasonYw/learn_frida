package com.alibaba.sdk.android.httpdns;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.sdk.android.httpdns.h */
/* loaded from: classes19.dex */
public class C1073h extends Exception {

    /* renamed from: b */
    public int f21612b;

    static {
        Covode.recordClassIndex(4479);
    }

    public C1073h(int i, String str) {
        super(str);
        this.f21612b = i;
    }

    public int getErrorCode() {
        return this.f21612b;
    }
}
