package androidx.activity;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes19.dex */
public abstract class OnBackPressedCallback {
    public CopyOnWriteArrayList<AbstractC0181a> mCancellables = new CopyOnWriteArrayList<>();
    public boolean mEnabled;

    static {
        Covode.recordClassIndex(412);
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        Iterator<AbstractC0181a> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void addCancellable(AbstractC0181a abstractC0181a) {
        this.mCancellables.add(abstractC0181a);
    }

    public void removeCancellable(AbstractC0181a abstractC0181a) {
        this.mCancellables.remove(abstractC0181a);
    }

    public OnBackPressedCallback(boolean z) {
        this.mEnabled = z;
    }
}
