package com.benchmark.mediacodec;

import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public class TEMediaCodecException extends Exception {
    static {
        Covode.recordClassIndex(9683);
    }

    public TEMediaCodecException(Exception exc) {
        super(exc.getCause());
    }
}
