package androidx.arch.core.util;

import com.bytedance.covode.number.Covode;

/* loaded from: classes28.dex */
public interface Function<I, O> {
    static {
        Covode.recordClassIndex(769);
    }

    O apply(I i);
}
