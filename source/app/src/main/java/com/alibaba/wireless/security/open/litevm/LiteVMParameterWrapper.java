package com.alibaba.wireless.security.open.litevm;

import com.alibaba.wireless.security.open.litevm.LiteVMParamType;
import com.bytedance.covode.number.Covode;

/* loaded from: classes25.dex */
public class LiteVMParameterWrapper {

    /* renamed from: a */
    public LiteVMParamType.PARAM_TYPE f21851a;

    /* renamed from: b */
    public Object f21852b;

    static {
        Covode.recordClassIndex(4583);
    }

    public LiteVMParameterWrapper(LiteVMParamType.PARAM_TYPE param_type, Object obj) {
        this.f21851a = param_type;
        this.f21852b = obj;
    }

    public int getType() {
        return this.f21851a.getValue();
    }

    public Object getValue() {
        return this.f21852b;
    }
}
