package com.bytedance.als.exceptions;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes9.dex */
public final class CreateBeforeContainerCreatedTimingException extends RuntimeException {
    static {
        Covode.recordClassIndex(10051);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBeforeContainerCreatedTimingException(String str) {
        super(str);
        C106862S5w.LIZ(str);
    }
}
