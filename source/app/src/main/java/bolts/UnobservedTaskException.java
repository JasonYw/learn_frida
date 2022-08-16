package bolts;

import com.bytedance.covode.number.Covode;

/* loaded from: classes18.dex */
public class UnobservedTaskException extends RuntimeException {
    static {
        Covode.recordClassIndex(2505);
    }

    public UnobservedTaskException(Throwable th) {
        super(th);
    }
}
