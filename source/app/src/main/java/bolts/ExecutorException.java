package bolts;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public class ExecutorException extends RuntimeException {
    static {
        Covode.recordClassIndex(2485);
    }

    public ExecutorException(Exception exc) {
        super("An exception was thrown by an Executor", exc);
    }
}
