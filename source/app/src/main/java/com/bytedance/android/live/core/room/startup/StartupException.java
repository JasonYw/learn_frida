package com.bytedance.android.live.core.room.startup;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes20.dex */
public final class StartupException extends RuntimeException {
    static {
        Covode.recordClassIndex(23593);
    }

    public StartupException(String str) {
        super(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartupException(String str, Throwable th) {
        super(str, th);
        C106862S5w.LIZ(th);
    }
}
