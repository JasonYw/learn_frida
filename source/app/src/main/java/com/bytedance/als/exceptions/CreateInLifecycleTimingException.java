package com.bytedance.als.exceptions;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes9.dex */
public final class CreateInLifecycleTimingException extends RuntimeException {
    static {
        Covode.recordClassIndex(10052);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateInLifecycleTimingException(String str) {
        super(str);
        C106862S5w.LIZ(str);
    }
}
