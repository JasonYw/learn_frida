package com.alibaba.wireless.security.open.litevm;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class LiteVMInstance {

    /* renamed from: a */
    public Object f21848a;

    /* renamed from: b */
    public String f21849b;

    /* renamed from: c */
    public String f21850c;

    static {
        Covode.recordClassIndex(4580);
    }

    public LiteVMInstance(Object obj, String str, String str2) {
        this.f21849b = "";
        this.f21850c = "";
        this.f21849b = str;
        this.f21850c = str2;
        this.f21848a = obj;
    }

    public String getAuthCode() {
        return this.f21849b;
    }

    public String getBizId() {
        return this.f21850c;
    }

    public Object getImpl() {
        return this.f21848a;
    }
}
