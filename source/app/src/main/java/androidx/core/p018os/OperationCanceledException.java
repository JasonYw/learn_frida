package androidx.core.p018os;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.os.OperationCanceledException */
/* loaded from: classes23.dex */
public class OperationCanceledException extends RuntimeException {
    static {
        Covode.recordClassIndex(1009);
    }

    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super("The operation has been canceled.");
    }
}
