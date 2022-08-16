package com.alibaba.android.vlayout;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public class MismatchChildCountException extends RuntimeException {
    static {
        Covode.recordClassIndex(4344);
    }

    public MismatchChildCountException(String str) {
        super(str);
    }

    public MismatchChildCountException(String str, Throwable th) {
        super(str, th);
    }
}
