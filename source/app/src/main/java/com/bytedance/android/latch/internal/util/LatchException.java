package com.bytedance.android.latch.internal.util;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;
import p003X.C137662cks;

/* loaded from: classes17.dex */
public final class LatchException extends RuntimeException {
    public static final C137662cks Companion = new C137662cks((byte) 0);
    public final int code;
    public final String message;

    static {
        Covode.recordClassIndex(13751);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatchException(int i, String str, Throwable th) {
        super(str, th);
        C106862S5w.LIZ(str);
        this.code = i;
        this.message = str;
    }

    public /* synthetic */ LatchException(int i, String str, Throwable th, int i2) {
        this(i, str, null);
    }
}
