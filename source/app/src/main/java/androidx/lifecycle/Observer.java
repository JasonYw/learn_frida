package androidx.lifecycle;

import com.bytedance.covode.number.Covode;

/* loaded from: classes.dex */
public interface Observer<T> {
    static {
        Covode.recordClassIndex(1374);
    }

    void onChanged(T t);
}
