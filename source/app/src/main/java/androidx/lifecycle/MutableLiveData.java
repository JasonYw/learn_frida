package androidx.lifecycle;

import com.bytedance.covode.number.Covode;

/* loaded from: classes25.dex */
public class MutableLiveData<T> extends LiveData<T> {
    static {
        Covode.recordClassIndex(1373);
    }

    public MutableLiveData() {
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T t) {
        super.postValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void setValue(T t) {
        super.setValue(t);
    }

    public MutableLiveData(T t) {
        super(t);
    }
}
