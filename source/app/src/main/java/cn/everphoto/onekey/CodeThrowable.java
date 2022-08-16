package cn.everphoto.onekey;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class CodeThrowable extends RuntimeException {
    public final int code;
    public final Throwable throwable;

    static {
        Covode.recordClassIndex(3632);
    }

    public CodeThrowable(int i, Throwable th) {
        C106862S5w.LIZ(th);
        this.code = i;
        this.throwable = th;
    }
}
