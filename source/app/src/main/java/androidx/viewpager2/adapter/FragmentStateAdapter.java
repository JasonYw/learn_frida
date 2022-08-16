package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p002O.C0002O;
import p003X.AbstractC92843Mhp;
import p003X.C109592TCw;
import p003X.C145714erC;
import p003X.C145715erD;
import p003X.C145716erE;

/* loaded from: classes19.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<C0447a> implements AbstractC0448b {
    public final FragmentManager mFragmentManager;
    public C145714erC mFragmentMaxLifecycleEnforcer;
    public final LongSparseArray<Fragment> mFragments;
    public boolean mHasStaleFragments;
    public boolean mIsInGracePeriod;
    public final LongSparseArray<Integer> mItemIdToViewHolder;
    public final Lifecycle mLifecycle;
    public final LongSparseArray<Fragment.SavedState> mSavedStates;

    static {
        Covode.recordClassIndex(2085);
    }

    public abstract Fragment createFragment(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(C0447a c0447a) {
        return true;
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.isStateSaved();
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            static {
                Covode.recordClassIndex(2089);
            }

            @Override // java.lang.Runnable
            public final void run() {
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.mIsInGracePeriod = false;
                fragmentStateAdapter.gcFragments();
            }
        };
        this.mLifecycle.addObserver(new LifecycleEventObserver(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            static {
                Covode.recordClassIndex(2090);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    lifecycleOwner.mo29786getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(runnable, 10000L);
    }

    public void gcFragments() {
        if (this.mHasStaleFragments && !shouldDelayFragmentTransactions()) {
            ArraySet arraySet = new ArraySet();
            for (int i = 0; i < this.mFragments.size(); i++) {
                long keyAt = this.mFragments.keyAt(i);
                if (!containsItem(keyAt)) {
                    arraySet.add(Long.valueOf(keyAt));
                    this.mItemIdToViewHolder.remove(keyAt);
                }
            }
            if (!this.mIsInGracePeriod) {
                this.mHasStaleFragments = false;
                for (int i2 = 0; i2 < this.mFragments.size(); i2++) {
                    long keyAt2 = this.mFragments.keyAt(i2);
                    if (!isFragmentViewBound(keyAt2)) {
                        arraySet.add(Long.valueOf(keyAt2));
                    }
                }
            }
            Iterator it = arraySet.iterator();
            while (it.hasNext()) {
                removeFragment(((Long) it.next()).longValue());
            }
        }
    }

    @Override // androidx.viewpager2.adapter.AbstractC0448b
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mFragments.size() + this.mSavedStates.size());
        for (int i = 0; i < this.mFragments.size(); i++) {
            long keyAt = this.mFragments.keyAt(i);
            Fragment fragment = this.mFragments.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.mFragmentManager.putFragment(bundle, createKey("f#", keyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.size(); i2++) {
            long keyAt2 = this.mSavedStates.keyAt(i2);
            if (containsItem(keyAt2)) {
                bundle.putParcelable(createKey("s#", keyAt2), this.mSavedStates.get(keyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.mo29786getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(C0447a c0447a) {
        placeFragmentInViewHolder(c0447a);
        gcFragments();
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.mo29786getLifecycle());
    }

    public boolean containsItem(long j) {
        if (j >= 0 && j < getItemCount()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(C0447a c0447a) {
        Long itemForViewHolder = itemForViewHolder(c0447a.LIZ().getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
    }

    private void ensureFragment(int i) {
        long itemId = getItemId(i);
        if (!this.mFragments.containsKey(itemId)) {
            Fragment createFragment = createFragment(i);
            createFragment.setInitialSavedState(this.mSavedStates.get(itemId));
            this.mFragments.put(itemId, createFragment);
        }
    }

    private boolean isFragmentViewBound(long j) {
        View view;
        if (this.mItemIdToViewHolder.containsKey(j)) {
            return true;
        }
        Fragment fragment = this.mFragments.get(j);
        if (fragment != null && (view = fragment.getView()) != null && view.getParent() != null) {
            return true;
        }
        return false;
    }

    private Long itemForViewHolder(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.size(); i2++) {
            if (this.mItemIdToViewHolder.valueAt(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.mItemIdToViewHolder.keyAt(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C145714erC c145714erC = this.mFragmentMaxLifecycleEnforcer;
        C145714erC.LIZ(recyclerView).unregisterOnPageChangeCallback(c145714erC.LIZ);
        c145714erC.f19437LJ.unregisterAdapterDataObserver(c145714erC.LIZIZ);
        c145714erC.f19437LJ.mLifecycle.removeObserver(c145714erC.LIZJ);
        c145714erC.LIZLLL = null;
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    private void removeFragment(long j) {
        ViewParent parent;
        Fragment fragment = this.mFragments.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.mSavedStates.remove(j);
        }
        if (!fragment.isAdded()) {
            this.mFragments.remove(j);
        } else if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
        } else {
            if (fragment.isAdded() && containsItem(j)) {
                this.mSavedStates.put(j, this.mFragmentManager.saveFragmentInstanceState(fragment));
            }
            FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
            beginTransaction.remove(fragment);
            beginTransaction.commitNow();
            this.mFragments.remove(j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        if (this.mFragmentMaxLifecycleEnforcer == null) {
            z = true;
        } else {
            z = false;
        }
        C109592TCw.LIZ(z);
        this.mFragmentMaxLifecycleEnforcer = new C145714erC(this);
        final C145714erC c145714erC = this.mFragmentMaxLifecycleEnforcer;
        c145714erC.LIZLLL = C145714erC.LIZ(recyclerView);
        c145714erC.LIZ = new C145715erD(c145714erC);
        c145714erC.LIZLLL.registerOnPageChangeCallback(c145714erC.LIZ);
        c145714erC.LIZIZ = new C145716erE(c145714erC);
        c145714erC.f19437LJ.registerAdapterDataObserver(c145714erC.LIZIZ);
        c145714erC.LIZJ = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
            static {
                Covode.recordClassIndex(2091);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C145714erC.this.LIZ(false);
            }
        };
        c145714erC.f19437LJ.mLifecycle.addObserver(c145714erC.LIZJ);
    }

    public void placeFragmentInViewHolder(final C0447a c0447a) {
        Fragment fragment = this.mFragments.get(c0447a.getItemId());
        if (fragment != null) {
            FrameLayout LIZ = c0447a.LIZ();
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (fragment.isAdded() && view == null) {
                scheduleViewAttach(fragment, LIZ);
                return;
            } else if (fragment.isAdded() && view.getParent() != null) {
                if (view.getParent() != LIZ) {
                    addViewToContainer(view, LIZ);
                    return;
                }
                return;
            } else if (fragment.isAdded()) {
                addViewToContainer(view, LIZ);
                return;
            } else if (!shouldDelayFragmentTransactions()) {
                scheduleViewAttach(fragment, LIZ);
                FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                beginTransaction.add(fragment, "f" + c0447a.getItemId());
                beginTransaction.setMaxLifecycle(fragment, Lifecycle.State.STARTED);
                beginTransaction.commitNow();
                this.mFragmentMaxLifecycleEnforcer.LIZ(false);
                return;
            } else if (this.mFragmentManager.isDestroyed()) {
                return;
            } else {
                this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    static {
                        Covode.recordClassIndex(2087);
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                            return;
                        }
                        lifecycleOwner.mo29786getLifecycle().removeObserver(this);
                        if (ViewCompat.isAttachedToWindow(c0447a.LIZ())) {
                            FragmentStateAdapter.this.placeFragmentInViewHolder(c0447a);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager2.adapter.AbstractC0448b
    public final void restoreState(Parcelable parcelable) {
        if (this.mSavedStates.isEmpty() && this.mFragments.isEmpty()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (isValidKey(str, "f#")) {
                    this.mFragments.put(parseIdFromKey(str, "f#"), this.mFragmentManager.getFragment(bundle, str));
                } else if (isValidKey(str, "s#")) {
                    long parseIdFromKey = parseIdFromKey(str, "s#");
                    Parcelable parcelable2 = bundle.getParcelable(str);
                    if (containsItem(parseIdFromKey)) {
                        this.mSavedStates.put(parseIdFromKey, parcelable2);
                    }
                } else {
                    throw new IllegalArgumentException(C0002O.m25086C("Unexpected key in savedState: ", str));
                }
            }
            if (!this.mFragments.isEmpty()) {
                this.mHasStaleFragments = true;
                this.mIsInGracePeriod = true;
                gcFragments();
                scheduleGracePeriodEnd();
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public static String createKey(String str, long j) {
        return str + j;
    }

    public static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void scheduleViewAttach(final Fragment fragment, final FrameLayout frameLayout) {
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new AbstractC92843Mhp() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            static {
                Covode.recordClassIndex(2088);
            }

            @Override // p003X.AbstractC92843Mhp
            public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment2, View view, Bundle bundle) {
                if (fragment2 == fragment) {
                    fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                    FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        }, false);
    }

    public static boolean isValidKey(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.mFragments = new LongSparseArray<>();
        this.mSavedStates = new LongSparseArray<>();
        this.mItemIdToViewHolder = new LongSparseArray<>();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }

    public void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C0447a onCreateViewHolder(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new C0447a(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(final C0447a c0447a, int i) {
        long itemId = c0447a.getItemId();
        int id = c0447a.LIZ().getId();
        Long itemForViewHolder = itemForViewHolder(id);
        if (itemForViewHolder != null && itemForViewHolder.longValue() != itemId) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.put(itemId, Integer.valueOf(id));
        ensureFragment(i);
        final FrameLayout LIZ = c0447a.LIZ();
        if (ViewCompat.isAttachedToWindow(LIZ)) {
            if (LIZ.getParent() == null) {
                LIZ.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                    static {
                        Covode.recordClassIndex(2086);
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        if (LIZ.getParent() != null) {
                            LIZ.removeOnLayoutChangeListener(this);
                            FragmentStateAdapter.this.placeFragmentInViewHolder(c0447a);
                        }
                    }
                });
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        gcFragments();
    }
}
