package androidx.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.Iterator;
import p003X.C145687eql;

/* loaded from: classes19.dex */
public final class OnBackPressedDispatcher {
    public final Runnable mFallbackOnBackPressed;
    public final ArrayDeque<OnBackPressedCallback> mOnBackPressedCallbacks;

    static {
        Covode.recordClassIndex(413);
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    /* loaded from: classes19.dex */
    public class LifecycleOnBackPressedCancellable implements AbstractC0181a, LifecycleEventObserver {
        public final Lifecycle LIZIZ;
        public final OnBackPressedCallback LIZJ;
        public AbstractC0181a LIZLLL;

        static {
            Covode.recordClassIndex(414);
        }

        @Override // androidx.activity.AbstractC0181a
        public final void LIZ() {
            this.LIZIZ.removeObserver(this);
            this.LIZJ.removeCancellable(this);
            AbstractC0181a abstractC0181a = this.LIZLLL;
            if (abstractC0181a != null) {
                abstractC0181a.LIZ();
                this.LIZLLL = null;
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.LIZLLL = OnBackPressedDispatcher.this.addCancellableCallback(this.LIZJ);
            } else if (event == Lifecycle.Event.ON_STOP) {
                AbstractC0181a abstractC0181a = this.LIZLLL;
                if (abstractC0181a != null) {
                    abstractC0181a.LIZ();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                LIZ();
            }
        }

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            this.LIZIZ = lifecycle;
            this.LIZJ = onBackPressedCallback;
            lifecycle.addObserver(this);
        }
    }

    public final boolean hasEnabledCallbacks() {
        Iterator<OnBackPressedCallback> descendingIterator = this.mOnBackPressedCallbacks.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public final void onBackPressed() {
        Iterator<OnBackPressedCallback> descendingIterator = this.mOnBackPressedCallbacks.descendingIterator();
        while (descendingIterator.hasNext()) {
            OnBackPressedCallback next = descendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.mFallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        addCancellableCallback(onBackPressedCallback);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.mOnBackPressedCallbacks = new ArrayDeque<>();
        this.mFallbackOnBackPressed = runnable;
    }

    public final AbstractC0181a addCancellableCallback(OnBackPressedCallback onBackPressedCallback) {
        this.mOnBackPressedCallbacks.add(onBackPressedCallback);
        C145687eql c145687eql = new C145687eql(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(c145687eql);
        return c145687eql;
    }

    public final void addCallback(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        Lifecycle mo29786getLifecycle = lifecycleOwner.mo29786getLifecycle();
        if (mo29786getLifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(mo29786getLifecycle, onBackPressedCallback));
    }
}
