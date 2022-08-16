package bolts;

import com.bytedance.covode.number.Covode;

/* loaded from: classes23.dex */
public interface Continuation<TTaskResult, TContinuationResult> {
    static {
        Covode.recordClassIndex(2484);
    }

    /* renamed from: then */
    TContinuationResult mo29049then(Task<TTaskResult> task);
}
