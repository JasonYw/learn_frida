package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.p1594ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p002O.C0002O;
import p003X.C144352eV8;
import p003X.C144357eVD;
import p003X.C144360eVG;
import p003X.C144361eVH;
import p003X.C144366eVM;
import p003X.C65753Bwx;
import p003X.RunnableC144359eVF;

/* loaded from: classes19.dex */
public class LifecycleRegistry extends Lifecycle {
    public int mAddingObserverCounter;
    public final boolean mEnforceMainThread;
    public boolean mHandlingEvent;
    public final WeakReference<LifecycleOwner> mLifecycleOwner;
    public boolean mNewEventOccurred;
    public C144357eVD<LifecycleObserver, C0313a> mObserverMap;
    public ArrayList<Lifecycle.State> mParentStates;
    public Lifecycle.State mState;

    static {
        Covode.recordClassIndex(1363);
    }

    private Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        return m21148x864317eb(this, lifecycleObserver);
    }

    private void enforceMainThreadIfNeeded(String str) {
        m21147x5fbc4de6(this, str);
    }

    private void popParentState() {
        m21146x6670c167(this);
    }

    private void pushParentState(Lifecycle.State state) {
        m21145xf4ab463c(this, state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver lifecycleObserver) {
        m21149xa85169c6(this, lifecycleObserver);
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.mState;
    }

    public void androidx_lifecycle_LifecycleRegistry__popParentState$___twin___() {
        ArrayList<Lifecycle.State> arrayList = this.mParentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.mObserverMap.size();
    }

    private boolean isSynced() {
        if (this.mObserverMap.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.mObserverMap.eldest().getValue().LIZ;
        Lifecycle.State state2 = this.mObserverMap.newest().getValue().LIZ;
        if (state == state2 && this.mState == state2) {
            return true;
        }
        return false;
    }

    private void sync() {
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!isSynced()) {
            this.mNewEventOccurred = false;
            if (this.mState.compareTo(this.mObserverMap.eldest().getValue().LIZ) < 0) {
                backwardPass(lifecycleOwner);
            }
            Map.Entry<LifecycleObserver, C0313a> newest = this.mObserverMap.newest();
            if (!this.mNewEventOccurred && newest != null && this.mState.compareTo(newest.getValue().LIZ) > 0) {
                forwardPass(lifecycleOwner);
            }
        }
        this.mNewEventOccurred = false;
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
    }

    public static LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
        return new LifecycleRegistry(lifecycleOwner, false);
    }

    public void androidx_lifecycle_LifecycleRegistry__pushParentState$___twin___(Lifecycle.State state) {
        this.mParentStates.add(state);
    }

    /* renamed from: androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_popParentState */
    public static void m21146x6670c167(LifecycleRegistry lifecycleRegistry) {
        synchronized (C144360eVG.LIZIZ) {
            lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__popParentState$___twin___();
        }
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    public void markState(Lifecycle.State state) {
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
        enforceMainThreadIfNeeded("removeObserver");
        this.mObserverMap.remove(lifecycleObserver);
    }

    public void setCurrentState(Lifecycle.State state) {
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    private void moveToState(Lifecycle.State state) {
        if (this.mState == state) {
            return;
        }
        this.mState = state;
        if (!this.mHandlingEvent && this.mAddingObserverCounter == 0) {
            this.mHandlingEvent = true;
            sync();
            this.mHandlingEvent = false;
            return;
        }
        this.mNewEventOccurred = true;
    }

    /* renamed from: androidx_lifecycle_LifecycleRegistry__enforceMainThreadIfNeeded$___twin___ */
    public void m21150xc3f2bca1(String str) {
        if (this.mEnforceMainThread && !C144366eVM.LIZ().LIZLLL()) {
            throw new IllegalStateException(C0002O.m25085C("Method ", str, " must be called on the main thread"));
        }
    }

    /* renamed from: androidx_lifecycle_LifecycleRegistry__calculateTargetState$___twin___ */
    public Lifecycle.State m21151x922466c6(LifecycleObserver lifecycleObserver) {
        Lifecycle.State state;
        ArrayList<Lifecycle.State> arrayList;
        C144352eV8<LifecycleObserver, C0313a> c144352eV8;
        C144357eVD<LifecycleObserver, C0313a> c144357eVD = this.mObserverMap;
        Lifecycle.State state2 = null;
        if (c144357eVD.LIZ(lifecycleObserver) && (c144352eV8 = c144357eVD.LIZ.get(lifecycleObserver).LIZLLL) != null) {
            state = c144352eV8.getValue().LIZ;
        } else {
            state = null;
        }
        if (!this.mParentStates.isEmpty()) {
            state2 = this.mParentStates.get(arrayList.size() - 1);
        }
        return min(min(this.mState, state), state2);
    }

    private void backwardPass(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, C0313a>> descendingIterator = this.mObserverMap.descendingIterator();
        while (descendingIterator.hasNext() && !this.mNewEventOccurred) {
            Map.Entry<LifecycleObserver, C0313a> next = descendingIterator.next();
            C0313a value = next.getValue();
            while (value.LIZ.compareTo(this.mState) > 0 && !this.mNewEventOccurred && this.mObserverMap.LIZ(next.getKey())) {
                Lifecycle.Event downFrom = Lifecycle.Event.downFrom(value.LIZ);
                if (downFrom != null) {
                    pushParentState(downFrom.getTargetState());
                    value.LIZ(lifecycleOwner, downFrom);
                    popParentState();
                } else {
                    throw new IllegalStateException("no event down from " + value.LIZ);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void forwardPass(LifecycleOwner lifecycleOwner) {
        SafeIterableMap<LifecycleObserver, C0313a>.C0220d iteratorWithAdditions = this.mObserverMap.iteratorWithAdditions();
        while (iteratorWithAdditions.hasNext() && !this.mNewEventOccurred) {
            Map.Entry entry = (Map.Entry) iteratorWithAdditions.next();
            C0313a c0313a = (C0313a) entry.getValue();
            while (c0313a.LIZ.compareTo(this.mState) < 0 && !this.mNewEventOccurred && this.mObserverMap.LIZ(entry.getKey())) {
                pushParentState(c0313a.LIZ);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(c0313a.LIZ);
                if (upFrom != null) {
                    c0313a.LIZ(lifecycleOwner, upFrom);
                    popParentState();
                } else {
                    throw new IllegalStateException("no event up from " + c0313a.LIZ);
                }
            }
        }
    }

    public void androidx_lifecycle_LifecycleRegistry__addObserver$___twin___(LifecycleObserver lifecycleObserver) {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        boolean z;
        enforceMainThreadIfNeeded("addObserver");
        if (this.mState == Lifecycle.State.DESTROYED) {
            state = Lifecycle.State.DESTROYED;
        } else {
            state = Lifecycle.State.INITIALIZED;
        }
        C0313a c0313a = new C0313a(lifecycleObserver, state);
        if (this.mObserverMap.putIfAbsent(lifecycleObserver, c0313a) != null || (lifecycleOwner = this.mLifecycleOwner.get()) == null) {
            return;
        }
        if (this.mAddingObserverCounter == 0 && !this.mHandlingEvent) {
            z = false;
        } else {
            z = true;
        }
        Lifecycle.State calculateTargetState = calculateTargetState(lifecycleObserver);
        this.mAddingObserverCounter++;
        while (c0313a.LIZ.compareTo(calculateTargetState) < 0 && this.mObserverMap.LIZ(lifecycleObserver)) {
            pushParentState(c0313a.LIZ);
            Lifecycle.Event upFrom = Lifecycle.Event.upFrom(c0313a.LIZ);
            if (upFrom != null) {
                c0313a.LIZ(lifecycleOwner, upFrom);
                popParentState();
                calculateTargetState = calculateTargetState(lifecycleObserver);
            } else {
                throw new IllegalStateException("no event up from " + c0313a.LIZ);
            }
        }
        if (!z) {
            sync();
        }
        this.mAddingObserverCounter--;
    }

    /* renamed from: androidx.lifecycle.LifecycleRegistry$a */
    /* loaded from: classes26.dex */
    public static class C0313a {
        public Lifecycle.State LIZ;
        public LifecycleEventObserver LIZIZ;

        static {
            Covode.recordClassIndex(1364);
        }

        public C0313a(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
            this.LIZIZ = C65753Bwx.LIZ(lifecycleObserver);
            this.LIZ = state;
        }

        public final void LIZ(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.LIZ = LifecycleRegistry.min(this.LIZ, targetState);
            this.LIZIZ.onStateChanged(lifecycleOwner, event);
            this.LIZ = targetState;
        }
    }

    /* renamed from: androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_calculateTargetState */
    public static Lifecycle.State m21148x864317eb(LifecycleRegistry lifecycleRegistry, LifecycleObserver lifecycleObserver) {
        Lifecycle.State m21151x922466c6;
        synchronized (C144360eVG.LIZIZ) {
            m21151x922466c6 = lifecycleRegistry.m21151x922466c6(lifecycleObserver);
        }
        return m21151x922466c6;
    }

    /* renamed from: androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_pushParentState */
    public static void m21145xf4ab463c(LifecycleRegistry lifecycleRegistry, Lifecycle.State state) {
        synchronized (C144360eVG.LIZIZ) {
            lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__pushParentState$___twin___(state);
        }
    }

    public static Lifecycle.State min(Lifecycle.State state, Lifecycle.State state2) {
        if (state2 != null && state2.compareTo(state) < 0) {
            return state2;
        }
        return state;
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.mObserverMap = new C144357eVD<>();
        this.mAddingObserverCounter = 0;
        this.mHandlingEvent = false;
        this.mNewEventOccurred = false;
        this.mParentStates = new ArrayList<>();
        this.mLifecycleOwner = new WeakReference<>(lifecycleOwner);
        this.mState = Lifecycle.State.INITIALIZED;
        this.mEnforceMainThread = z;
    }

    /* renamed from: androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver */
    public static void m21149xa85169c6(LifecycleRegistry lifecycleRegistry, LifecycleObserver lifecycleObserver) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != Looper.myLooper()) {
            Handler handler = new Handler(mainLooper);
            if (!PatchProxy.proxy(new Object[]{handler, lifecycleRegistry, lifecycleObserver}, null, C144361eVH.LIZ, true, 1).isSupported) {
                handler.post(new RunnableC144359eVF(lifecycleRegistry, lifecycleObserver));
                return;
            }
            return;
        }
        lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__addObserver$___twin___(lifecycleObserver);
    }

    /* renamed from: androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_enforceMainThreadIfNeeded */
    public static void m21147x5fbc4de6(LifecycleRegistry lifecycleRegistry, String str) {
        if (Looper.getMainLooper() != Looper.myLooper() && !PatchProxy.proxy(new Object[]{str}, null, C144360eVG.LIZ, true, 1).isSupported) {
            new StringBuilder();
            CrashlyticsWrapper.log("LifecycleRegistryLancet", Log.getStackTraceString(new Exception(C0002O.m25086C(str, " used not in main thread"))));
        }
    }
}
