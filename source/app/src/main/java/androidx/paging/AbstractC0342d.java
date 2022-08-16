package androidx.paging;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.paging.d */
/* loaded from: classes8.dex */
public abstract class AbstractC0342d<Key, Value> {
    public AtomicBoolean LIZ = new AtomicBoolean(false);
    public CopyOnWriteArrayList<AbstractC0343b> LIZIZ = new CopyOnWriteArrayList<>();

    /* renamed from: androidx.paging.d$b */
    /* loaded from: classes25.dex */
    public interface AbstractC0343b {
        static {
            Covode.recordClassIndex(1544);
        }

        /* renamed from: H_ */
        void mo21130H_();
    }

    static {
        Covode.recordClassIndex(1542);
    }

    public abstract boolean LIZ();

    public boolean LIZLLL() {
        return this.LIZ.get();
    }

    public void LIZJ() {
        if (this.LIZ.compareAndSet(false, true)) {
            Iterator<AbstractC0343b> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().mo21130H_();
            }
        }
    }

    public void LIZ(AbstractC0343b abstractC0343b) {
        this.LIZIZ.add(abstractC0343b);
    }

    public void LIZIZ(AbstractC0343b abstractC0343b) {
        this.LIZIZ.remove(abstractC0343b);
    }
}
