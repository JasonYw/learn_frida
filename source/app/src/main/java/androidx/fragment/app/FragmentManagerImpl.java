package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import androidx.activity.AbstractC0182b;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.collection.ArraySet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC0326p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.p1594ss.android.ugc.aweme.app.event.EventJsonBuilder;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p002O.C0002O;
import p003X.AbstractC145684eqi;
import p003X.AbstractC145688eqm;
import p003X.AbstractC92843Mhp;
import p003X.AnonymousClass298;
import p003X.C103348Qms;
import p003X.C103460Qog;
import p003X.C115757VhX;
import p003X.C139228dAG;
import p003X.C145623epj;
import p003X.C145624epk;
import p003X.C65357BqZ;
import p003X.Q1C;
import p003X.RunnableC139217dA5;
import p003X.W2R;
import p003X.W2W;

/* loaded from: classes19.dex */
public final class FragmentManagerImpl extends FragmentManager implements LayoutInflater.Factory2 {
    public static boolean DEBUG;
    public static final Interpolator DECELERATE_CUBIC;
    public static final Interpolator DECELERATE_QUINT;
    public ArrayList<Integer> mAvailBackStackIndices;
    public ArrayList<C0289a> mBackStack;
    public ArrayList<FragmentManager.AbstractC0273c> mBackStackChangeListeners;
    public ArrayList<C0289a> mBackStackIndices;
    public AbstractC0290b mContainer;
    public ArrayList<Fragment> mCreatedMenus;
    public boolean mDestroyed;
    public boolean mExecutingActions;
    public boolean mHavePendingDeferredStart;
    public AbstractC145684eqi mHost;
    public boolean mNeedMenuInvalidate;
    public int mNextFragmentIndex;
    public C0292g mNonConfig;
    public OnBackPressedDispatcher mOnBackPressedDispatcher;
    public Fragment mParent;
    public ArrayList<AbstractC0282e> mPendingActions;
    public ArrayList<C0283g> mPostponedTransactions;
    public Fragment mPrimaryNav;
    public boolean mStateSaved;
    public boolean mStopped;
    public ArrayList<Fragment> mTmpAddedFragments;
    public ArrayList<Boolean> mTmpIsPop;
    public ArrayList<C0289a> mTmpRecords;
    public final ArrayList<Fragment> mAdded = new ArrayList<>();
    public final HashMap<String, Fragment> mActive = new HashMap<>();
    public final OnBackPressedCallback mOnBackPressedCallback = new OnBackPressedCallback(false) { // from class: androidx.fragment.app.FragmentManagerImpl.1
        static {
            Covode.recordClassIndex(1268);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            FragmentManagerImpl.this.handleOnBackPressed();
        }

        {
            super(false);
        }
    };
    public final CopyOnWriteArrayList<C0281c> mLifecycleCallbacks = new CopyOnWriteArrayList<>();
    public int mCurState = 0;
    public Bundle mStateBundle = null;
    public SparseArray<Parcelable> mStateArray = null;
    public Runnable mExecCommit = new Runnable() { // from class: androidx.fragment.app.FragmentManagerImpl.2
        static {
            Covode.recordClassIndex(1269);
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManagerImpl.this.execPendingActions();
        }
    };

    /* renamed from: androidx.fragment.app.FragmentManagerImpl$e */
    /* loaded from: classes19.dex */
    public interface AbstractC0282e {
        static {
            Covode.recordClassIndex(1279);
        }

        boolean LIZ(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private void ensureExecReady(boolean z) {
        m21153xbd915a4d(this, z);
    }

    public static int reverseTransit(int i) {
        if (i != 4097) {
            if (i == 4099) {
                return 4099;
            }
            return i != 8194 ? 0 : 4097;
        }
        return 8194;
    }

    public static int transitToStyleIndex(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        } else if (i == 4099) {
            return z ? 5 : 6;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? 3 : 4;
        }
    }

    public final boolean execPendingActions() {
        return m21155xc743403e(this);
    }

    public final LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this;
    }

    @Override // androidx.fragment.app.FragmentManager
    public final boolean popBackStackImmediate() {
        return m21154x5340ffba(this);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    @Override // androidx.fragment.app.FragmentManager
    public final boolean isDestroyed() {
        return this.mDestroyed;
    }

    /* renamed from: androidx.fragment.app.FragmentManagerImpl$g */
    /* loaded from: classes19.dex */
    public static class C0283g implements AbstractC145688eqm {
        public final boolean LIZ;
        public final C0289a LIZIZ;
        public int LIZJ;

        static {
            Covode.recordClassIndex(1281);
        }

        @Override // p003X.AbstractC145688eqm
        public final void LIZIZ() {
            this.LIZJ++;
        }

        public final void LIZLLL() {
            this.LIZIZ.LIZ.completeExecute(this.LIZIZ, this.LIZ, false, false);
        }

        @Override // p003X.AbstractC145688eqm
        public final void LIZ() {
            this.LIZJ--;
            if (this.LIZJ != 0) {
                return;
            }
            this.LIZIZ.LIZ.scheduleCommit();
        }

        public final void LIZJ() {
            boolean z;
            if (this.LIZJ > 0) {
                z = true;
            } else {
                z = false;
            }
            FragmentManagerImpl fragmentManagerImpl = this.LIZIZ.LIZ;
            int size = fragmentManagerImpl.mAdded.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = fragmentManagerImpl.mAdded.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.LIZIZ.LIZ.completeExecute(this.LIZIZ, this.LIZ, !z, true);
        }

        public C0283g(C0289a c0289a, boolean z) {
            this.LIZ = z;
            this.LIZIZ = c0289a;
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public final FragmentTransaction beginTransaction() {
        return new C0289a(this);
    }

    public final void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    public final void dispatchPause() {
        dispatchStateChange(3);
    }

    public final void dispatchStop() {
        this.mStopped = true;
        dispatchStateChange(2);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions();
        forcePostponedTransactions();
        return execPendingActions;
    }

    public final int getActiveFragmentCount() {
        return this.mActive.size();
    }

    private void burpActive() {
        this.mActive.values().removeAll(Collections.singleton(null));
    }

    private void checkStateLoss() {
        if (!isStateSaved()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    /* renamed from: androidx_fragment_app_FragmentManagerImpl__popBackStackImmediate$___twin___ */
    public final boolean m21156x468c781() {
        checkStateLoss();
        return popBackStackImmediate(null, -1, 0);
    }

    public final void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(2);
    }

    public final void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(1);
    }

    public final void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public final void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(4);
    }

    public final void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(3);
    }

    public final void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    public final List<Fragment> getActiveFragments() {
        return new ArrayList(this.mActive.values());
    }

    @Override // androidx.fragment.app.FragmentManager
    public final int getBackStackEntryCount() {
        ArrayList<C0289a> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.fragment.app.FragmentManager
    public final boolean isStateSaved() {
        if (!this.mStateSaved && !this.mStopped) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void popBackStack() {
        enqueueAction(new C145624epk(this, null, -1, 0), false);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(1267);
        DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
        DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
    }

    private void forcePostponedTransactions() {
        if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                this.mPostponedTransactions.remove(0).LIZJ();
            }
        }
    }

    public final void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions();
        dispatchStateChange(0);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
    }

    public final void dispatchLowMemory() {
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public final C115757VhX getFragmentFactory() {
        FragmentManagerImpl fragmentManagerImpl = this;
        while (true) {
            if (super.getFragmentFactory() == FragmentManager.DEFAULT_FACTORY) {
                Fragment fragment = fragmentManagerImpl.mParent;
                if (fragment != null) {
                    fragmentManagerImpl = fragment.mFragmentManager;
                } else {
                    fragmentManagerImpl.setFragmentFactory(new C115757VhX() { // from class: androidx.fragment.app.FragmentManagerImpl.6
                        static {
                            Covode.recordClassIndex(1274);
                        }

                        @Override // p003X.C115757VhX
                        public final Fragment LIZJ(ClassLoader classLoader, String str) {
                            return Fragment.instantiate(FragmentManagerImpl.this.mHost.LIZJ, str, null);
                        }
                    });
                    break;
                }
            } else {
                break;
            }
        }
        return super.getFragmentFactory();
    }

    @Override // androidx.fragment.app.FragmentManager
    public final List<Fragment> getFragments() {
        List<Fragment> list;
        if (this.mAdded.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.mAdded) {
            list = (List) this.mAdded.clone();
        }
        return list;
    }

    public final void handleOnBackPressed() {
        execPendingActions();
        if (this.mOnBackPressedCallback.isEnabled()) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.onBackPressed();
        }
    }

    public final void noteStateNotSaved() {
        this.mStateSaved = false;
        this.mStopped = false;
        int size = this.mAdded.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
                this.mBackStackChangeListeners.get(i).LIZ();
            }
        }
    }

    public final C0291f retainNonConfig() {
        if (this.mHost instanceof AbstractC0326p) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.LIZ();
    }

    public final void startPendingDeferredFragments() {
        for (Fragment fragment : this.mActive.values()) {
            if (fragment != null) {
                performPendingDeferredStart(fragment);
            }
        }
    }

    static {
        if (ReDexClinitStringAb.abTest >= 4) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(1267);
        DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
        DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
    }

    private void updateOnBackPressedCallbackEnabled() {
        ArrayList<AbstractC0282e> arrayList = this.mPendingActions;
        boolean z = true;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.mOnBackPressedCallback.setEnabled(true);
            return;
        }
        OnBackPressedCallback onBackPressedCallback = this.mOnBackPressedCallback;
        if (getBackStackEntryCount() <= 0 || !isPrimaryNavigation(this.mParent)) {
            z = false;
        }
        onBackPressedCallback.setEnabled(z);
    }

    /* renamed from: androidx_fragment_app_FragmentManagerImpl__execPendingActions$___twin___ */
    public final boolean m21157x898ba69f() {
        ensureExecReady(true);
        boolean z = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                z = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        burpActive();
        return z;
    }

    public final boolean checkForMenus() {
        for (Fragment fragment : this.mActive.values()) {
            if (fragment != null && isMenuAvailable(fragment)) {
                return true;
            }
        }
        return false;
    }

    public final void scheduleCommit() {
        boolean z;
        synchronized (this) {
            boolean z2 = false;
            if (this.mPostponedTransactions != null && !this.mPostponedTransactions.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (this.mPendingActions != null && this.mPendingActions.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.mHost.LIZLLL.removeCallbacks(this.mExecCommit);
                this.mHost.LIZLLL.post(this.mExecCommit);
                updateOnBackPressedCallbackEnabled();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            C65357BqZ.LIZ(fragment, sb);
        } else {
            C65357BqZ.LIZ(this.mHost, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    private void endAnimatingAwayFragments() {
        for (Fragment fragment : this.mActive.values()) {
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    m21159xa9a39a17(this, fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Parcelable saveAllState() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.saveAllState():android.os.Parcelable");
    }

    public final boolean isStateAtLeast(int i) {
        if (this.mCurState >= i) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void removeOnBackStackChangedListener(FragmentManager.AbstractC0273c abstractC0273c) {
        ArrayList<FragmentManager.AbstractC0273c> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(abstractC0273c);
        }
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(Fragment fragment) {
        if (fragment != null && this.mActive.get(fragment.mWho) == fragment) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public final void addRetainedFragment(Fragment fragment) {
        if (isStateSaved()) {
            return;
        }
        this.mNonConfig.LIZIZ.add(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final AnonymousClass298 getBackStackEntryAt(int i) {
        return this.mBackStack.get(i);
    }

    public final void hideFragment(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    public final void moveToState(Fragment fragment) {
        m21159xa9a39a17(this, fragment, this.mCurState, 0, 0, false);
    }

    public final void removeRetainedFragment(Fragment fragment) {
        if (isStateSaved()) {
            return;
        }
        this.mNonConfig.LIZIZ.remove(fragment);
    }

    public final void showFragment(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    private void dispatchStateChange(int i) {
        try {
            this.mExecutingActions = true;
            moveToState(i, false);
            this.mExecutingActions = false;
            execPendingActions();
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    private boolean isMenuAvailable(Fragment fragment) {
        if ((!fragment.mHasMenu || !fragment.mMenuVisible) && !fragment.mChildFragmentManager.checkForMenus()) {
            return false;
        }
        return true;
    }

    private void throwException(RuntimeException runtimeException) {
        PrintWriter printWriter = new PrintWriter(new C103348Qms("FragmentManager"));
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null) {
            abstractC145684eqi.LIZ("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } else {
            dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        }
    }

    public final void addBackStackState(C0289a c0289a) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(c0289a);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void addOnBackStackChangedListener(FragmentManager.AbstractC0273c abstractC0273c) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(abstractC0273c);
    }

    public final void dispatchConfigurationChanged(Configuration configuration) {
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final void dispatchMultiWindowModeChanged(boolean z) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public final void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mCurState <= 0) {
            return;
        }
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void dispatchPictureInPictureModeChanged(boolean z) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final void freeBackStackIndex(int i) {
        synchronized (this) {
            this.mBackStackIndices.set(i, null);
            if (this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList<>();
            }
            this.mAvailBackStackIndices.add(Integer.valueOf(i));
        }
    }

    public final C0292g getChildNonConfig(Fragment fragment) {
        C0292g c0292g = this.mNonConfig;
        C0292g c0292g2 = c0292g.LIZJ.get(fragment.mWho);
        if (c0292g2 == null) {
            C0292g c0292g3 = new C0292g(c0292g.f20261LJ);
            c0292g.LIZJ.put(fragment.mWho, c0292g3);
            return c0292g3;
        }
        return c0292g2;
    }

    public final ViewModelStore getViewModelStore(Fragment fragment) {
        C0292g c0292g = this.mNonConfig;
        ViewModelStore viewModelStore = c0292g.LIZLLL.get(fragment.mWho);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            c0292g.LIZLLL.put(fragment.mWho, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    public final boolean isPrimaryNavigation(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManagerImpl fragmentManagerImpl = fragment.mFragmentManager;
        if (fragment == fragmentManagerImpl.getPrimaryNavigationFragment() && isPrimaryNavigation(fragmentManagerImpl.mParent)) {
            return true;
        }
        return false;
    }

    public final void performPendingDeferredStart(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
                return;
            }
            fragment.mDeferStart = false;
            m21159xa9a39a17(this, fragment, this.mCurState, 0, 0, false);
        }
    }

    private void addAddedFragments(ArraySet<Fragment> arraySet) {
        int i = this.mCurState;
        if (i <= 0) {
            return;
        }
        int min = Math.min(i, 3);
        int size = this.mAdded.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.mAdded.get(i2);
            if (fragment.mState < min) {
                m21159xa9a39a17(this, fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    arraySet.add(fragment);
                }
            }
        }
    }

    /* renamed from: androidx_fragment_app_FragmentManagerImpl_com_bytedance_scalpel_scenemanager_lancet_common_FragmentManagerLancet_popBackStackImmediate */
    public static boolean m21154x5340ffba(final FragmentManagerImpl fragmentManagerImpl) {
        boolean m21156x468c781 = fragmentManagerImpl.m21156x468c781();
        if (!PatchProxy.proxy(new Object[]{fragmentManagerImpl}, null, W2R.LIZ, true, 8).isSupported) {
            W2R.LIZ().execute(new Runnable(fragmentManagerImpl) { // from class: X.W2b
                public static ChangeQuickRedirect LIZ;
                public final FragmentManager LIZIZ;

                static {
                    Covode.recordClassIndex(104949);
                }

                {
                    this.LIZIZ = fragmentManagerImpl;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    final FragmentManager fragmentManager = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{fragmentManager}, null, W2R.LIZ, true, 22).isSupported) {
                        return;
                    }
                    W2W.LIZ(new Runnable(fragmentManager) { // from class: X.W2Z
                        public static ChangeQuickRedirect LIZ;
                        public final FragmentManager LIZIZ;

                        static {
                            Covode.recordClassIndex(104952);
                        }

                        {
                            this.LIZIZ = fragmentManager;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            FragmentManager fragmentManager2 = this.LIZIZ;
                            if (PatchProxy.proxy(new Object[]{fragmentManager2}, null, W2R.LIZ, true, 23).isSupported) {
                                return;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            W2R.LIZ(fragmentManager2.getFragments());
                            W2W.LIZ("FragmentManagerLancet#popBackStackImmediate cost: " + (System.currentTimeMillis() - currentTimeMillis));
                        }
                    });
                }
            });
        }
        return m21156x468c781;
    }

    private Fragment findFragmentUnder(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.mAdded.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.mAdded.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void makeRemovedFragmentsInvisible(ArraySet<Fragment> arraySet) {
        int size = arraySet.size();
        for (int i = 0; i < size; i++) {
            Fragment valueAt = arraySet.valueAt(i);
            if (!valueAt.mAdded) {
                View requireView = valueAt.requireView();
                valueAt.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    public final void attachFragment(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                if (!this.mAdded.contains(fragment)) {
                    synchronized (this.mAdded) {
                        this.mAdded.add(fragment);
                    }
                    fragment.mAdded = true;
                    if (isMenuAvailable(fragment)) {
                        this.mNeedMenuInvalidate = true;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
        }
    }

    public final void detachFragment(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                synchronized (this.mAdded) {
                    this.mAdded.remove(fragment);
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public final boolean dispatchContextItemSelected(MenuItem menuItem) {
        if (this.mCurState <= 0) {
            return false;
        }
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        if (this.mCurState <= 0) {
            return false;
        }
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchPrepareOptionsMenu(Menu menu) {
        if (this.mCurState <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void ensureInflatedFragmentView(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null) {
                fragment.mInnerView = fragment.mView;
                fragment.mView.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public final Fragment findFragmentById(int i) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.mActive.values()) {
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
        return null;
    }

    public final Fragment findFragmentByWho(String str) {
        Fragment findFragmentByWho;
        for (Fragment fragment : this.mActive.values()) {
            if (fragment != null && (findFragmentByWho = fragment.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final void makeActive(Fragment fragment) {
        if (this.mActive.get(fragment.mWho) != null) {
            return;
        }
        this.mActive.put(fragment.mWho, fragment);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                addRetainedFragment(fragment);
            } else {
                removeRetainedFragment(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
    }

    public final void removeFragment(Fragment fragment) {
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.mAdded) {
                this.mAdded.remove(fragment);
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public final Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        Bundle saveFragmentBasicState;
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.mState <= 0 || (saveFragmentBasicState = saveFragmentBasicState(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(saveFragmentBasicState);
    }

    public final void saveFragmentViewState(Fragment fragment) {
        if (fragment.mInnerView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.mStateArray;
        if (sparseArray == null) {
            this.mStateArray = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.mInnerView.saveHierarchyState(this.mStateArray);
        if (this.mStateArray.size() > 0) {
            fragment.mSavedViewState = this.mStateArray;
            this.mStateArray = null;
        }
    }

    public final void setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || (this.mActive.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            dispatchParentPrimaryNavigationFragmentChanged(fragment2);
            dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void unregisterFragmentLifecycleCallbacks(AbstractC92843Mhp abstractC92843Mhp) {
        synchronized (this.mLifecycleCallbacks) {
            int i = 0;
            int size = this.mLifecycleCallbacks.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.mLifecycleCallbacks.get(i).LIZ == abstractC92843Mhp) {
                    this.mLifecycleCallbacks.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: androidx_fragment_app_FragmentManagerImpl_com_bytedance_scalpel_scenemanager_lancet_common_FragmentManagerLancet_execPendingActions */
    public static boolean m21155xc743403e(final FragmentManagerImpl fragmentManagerImpl) {
        long currentTimeMillis = System.currentTimeMillis();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!PatchProxy.proxy(new Object[]{atomicBoolean, fragmentManagerImpl}, null, W2R.LIZ, true, 3).isSupported) {
            W2W.LIZ(new Runnable(atomicBoolean, fragmentManagerImpl) { // from class: X.W2T
                public static ChangeQuickRedirect LIZ;
                public final AtomicBoolean LIZIZ;
                public final FragmentManager LIZJ;

                static {
                    Covode.recordClassIndex(104947);
                }

                {
                    this.LIZIZ = atomicBoolean;
                    this.LIZJ = fragmentManagerImpl;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    AtomicBoolean atomicBoolean2 = this.LIZIZ;
                    FragmentManager fragmentManager = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{atomicBoolean2, fragmentManager}, null, W2R.LIZ, true, 26).isSupported) {
                        return;
                    }
                    atomicBoolean2.set(W2R.LIZ(fragmentManager));
                }
            });
        }
        W2W.LIZ("FragmentManagerLancet#execPendingActions find action cost: " + (System.currentTimeMillis() - currentTimeMillis));
        boolean m21157x898ba69f = fragmentManagerImpl.m21157x898ba69f();
        if (!PatchProxy.proxy(new Object[]{atomicBoolean, fragmentManagerImpl}, null, W2R.LIZ, true, 5).isSupported) {
            W2R.LIZ().execute(new Runnable(atomicBoolean, fragmentManagerImpl) { // from class: X.W2a
                public static ChangeQuickRedirect LIZ;
                public final AtomicBoolean LIZIZ;
                public final FragmentManager LIZJ;

                static {
                    Covode.recordClassIndex(104948);
                }

                {
                    this.LIZIZ = atomicBoolean;
                    this.LIZJ = fragmentManagerImpl;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    final AtomicBoolean atomicBoolean2 = this.LIZIZ;
                    final FragmentManager fragmentManager = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{atomicBoolean2, fragmentManager}, null, W2R.LIZ, true, 24).isSupported) {
                        return;
                    }
                    W2W.LIZ(new Runnable(atomicBoolean2, fragmentManager) { // from class: X.W2Y
                        public static ChangeQuickRedirect LIZ;
                        public final AtomicBoolean LIZIZ;
                        public final FragmentManager LIZJ;

                        static {
                            if (ReDexClinitStringAb.abTest >= 5) {
                                Covode.recordClassIndex(104953);
                            } else {
                                Covode.recordClassIndex(104953);
                            }
                        }

                        {
                            this.LIZIZ = atomicBoolean2;
                            this.LIZJ = fragmentManager;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            AtomicBoolean atomicBoolean3 = this.LIZIZ;
                            FragmentManager fragmentManager2 = this.LIZJ;
                            if (PatchProxy.proxy(new Object[]{atomicBoolean3, fragmentManager2}, null, W2R.LIZ, true, 25).isSupported) {
                                return;
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (!atomicBoolean3.get()) {
                                return;
                            }
                            W2R.LIZ(fragmentManager2.getFragments());
                            W2W.LIZ("FragmentManagerLancet#execPendingActions find fragment cost:" + (System.currentTimeMillis() - currentTimeMillis2));
                        }
                    });
                }
            });
        }
        return m21157x898ba69f;
    }

    public final int allocBackStackIndex(C0289a c0289a) {
        synchronized (this) {
            if (this.mAvailBackStackIndices != null && this.mAvailBackStackIndices.size() > 0) {
                int intValue = this.mAvailBackStackIndices.remove(this.mAvailBackStackIndices.size() - 1).intValue();
                this.mBackStackIndices.set(intValue, c0289a);
                return intValue;
            }
            if (this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList<>();
            }
            int size = this.mBackStackIndices.size();
            this.mBackStackIndices.add(c0289a);
            return size;
        }
    }

    /* renamed from: androidx_fragment_app_FragmentManagerImpl__ensureExecReady$___twin___ */
    public final void m21158xe0e2dc2e(boolean z) {
        if (!this.mExecutingActions) {
            if (this.mHost != null) {
                if (Looper.myLooper() == this.mHost.LIZLLL.getLooper()) {
                    if (!z) {
                        checkStateLoss();
                    }
                    if (this.mTmpRecords == null) {
                        this.mTmpRecords = new ArrayList<>();
                        this.mTmpIsPop = new ArrayList<>();
                    }
                    this.mExecutingActions = true;
                    try {
                        executePostponedTransaction(null, null);
                        return;
                    } finally {
                        this.mExecutingActions = false;
                    }
                }
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    @Override // androidx.fragment.app.FragmentManager
    public final Fragment findFragmentByTag(String str) {
        if (str != null) {
            for (int size = this.mAdded.size() - 1; size >= 0; size--) {
                Fragment fragment = this.mAdded.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
            for (Fragment fragment2 : this.mActive.values()) {
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
            return null;
        }
        return null;
    }

    public final void makeInactive(Fragment fragment) {
        if (this.mActive.get(fragment.mWho) == null) {
            return;
        }
        for (Fragment fragment2 : this.mActive.values()) {
            if (fragment2 != null && fragment.mWho.equals(fragment2.mTargetWho)) {
                fragment2.mTarget = fragment;
                fragment2.mTargetWho = null;
            }
        }
        this.mActive.put(fragment.mWho, null);
        removeRetainedFragment(fragment);
        if (fragment.mTargetWho != null) {
            fragment.mTarget = this.mActive.get(fragment.mTargetWho);
        }
        fragment.initState();
    }

    public final Bundle saveFragmentBasicState(Fragment fragment) {
        Bundle bundle;
        if (this.mStateBundle == null) {
            this.mStateBundle = new Bundle();
        }
        fragment.performSaveInstanceState(this.mStateBundle);
        dispatchOnFragmentSaveInstanceState(fragment, this.mStateBundle, false);
        if (!this.mStateBundle.isEmpty()) {
            bundle = this.mStateBundle;
            this.mStateBundle = null;
        } else {
            bundle = null;
        }
        if (fragment.mView != null) {
            saveFragmentViewState(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final void completeShowHideFragment(final Fragment fragment) {
        int i;
        if (fragment.mView != null) {
            C145623epj loadAnimation = loadAnimation(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (loadAnimation != null) {
                if (loadAnimation.LIZIZ != null) {
                    loadAnimation.LIZIZ.setTarget(fragment.mView);
                    if (fragment.mHidden) {
                        if (fragment.isHideReplaced()) {
                            fragment.setHideReplaced(false);
                        } else {
                            final ViewGroup viewGroup = fragment.mContainer;
                            final View view = fragment.mView;
                            viewGroup.startViewTransition(view);
                            loadAnimation.LIZIZ.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.fragment.app.FragmentManagerImpl.5
                                static {
                                    Covode.recordClassIndex(1273);
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    viewGroup.endViewTransition(view);
                                    animator.removeListener(this);
                                    if (fragment.mView != null && fragment.mHidden) {
                                        fragment.mView.setVisibility(8);
                                    }
                                }
                            });
                        }
                    } else {
                        fragment.mView.setVisibility(0);
                    }
                    loadAnimation.LIZIZ.start();
                } else {
                    fragment.mView.startAnimation(loadAnimation.LIZ);
                    loadAnimation.LIZ.start();
                }
            }
            if (fragment.mHidden && !fragment.isHideReplaced()) {
                i = 8;
            } else {
                i = 0;
            }
            fragment.mView.setVisibility(i);
            if (fragment.isHideReplaced()) {
                fragment.setHideReplaced(false);
            }
        }
        if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public final void moveFragmentToExpectedState(Fragment fragment) {
        if (fragment == null || !this.mActive.containsKey(fragment.mWho)) {
            return;
        }
        int i = this.mCurState;
        if (fragment.mRemoving) {
            if (fragment.isInBackStack()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, 0);
            }
        }
        m21159xa9a39a17(this, fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
        if (fragment.mView != null) {
            Fragment findFragmentUnder = findFragmentUnder(fragment);
            if (findFragmentUnder != null) {
                View view = findFragmentUnder.mView;
                ViewGroup viewGroup = fragment.mContainer;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.mView, indexOfChild);
                }
            }
            if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                if (fragment.mPostponedAlpha > 0.0f) {
                    fragment.mView.setAlpha(fragment.mPostponedAlpha);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                C145623epj loadAnimation = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                if (loadAnimation != null) {
                    if (loadAnimation.LIZ != null) {
                        fragment.mView.startAnimation(loadAnimation.LIZ);
                    } else {
                        loadAnimation.LIZIZ.setTarget(fragment.mView);
                        loadAnimation.LIZIZ.start();
                    }
                }
            }
        }
        if (fragment.mHiddenChanged) {
            completeShowHideFragment(fragment);
        }
    }

    public final void restoreSaveState(Parcelable parcelable) {
        String str;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.LIZ == null) {
            return;
        }
        for (Fragment fragment : this.mNonConfig.LIZIZ) {
            Iterator<FragmentState> it = fragmentManagerState.LIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next.mWho.equals(fragment.mWho)) {
                        next.mInstance = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        if (fragment.mTarget != null) {
                            str = fragment.mTarget.mWho;
                        } else {
                            str = null;
                        }
                        fragment.mTargetWho = str;
                        fragment.mTarget = null;
                        if (next.mSavedFragmentState != null) {
                            next.mSavedFragmentState.setClassLoader(this.mHost.LIZJ.getClassLoader());
                            fragment.mSavedViewState = next.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = next.mSavedFragmentState;
                        }
                    }
                } else {
                    m21159xa9a39a17(this, fragment, 1, 0, 0, false);
                    fragment.mRemoving = true;
                    m21159xa9a39a17(this, fragment, 0, 0, 0, false);
                    break;
                }
            }
        }
        this.mActive.clear();
        Iterator<FragmentState> it2 = fragmentManagerState.LIZ.iterator();
        while (it2.hasNext()) {
            FragmentState next2 = it2.next();
            if (next2 != null) {
                Fragment instantiate = next2.instantiate(this.mHost.LIZJ.getClassLoader(), getFragmentFactory());
                instantiate.mFragmentManager = this;
                this.mActive.put(instantiate.mWho, instantiate);
                next2.mInstance = null;
            }
        }
        this.mAdded.clear();
        if (fragmentManagerState.LIZIZ != null) {
            Iterator<String> it3 = fragmentManagerState.LIZIZ.iterator();
            while (it3.hasNext()) {
                String next3 = it3.next();
                Fragment fragment2 = this.mActive.get(next3);
                if (fragment2 == null) {
                    throwException(new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                }
                fragment2.mAdded = true;
                if (!this.mAdded.contains(fragment2)) {
                    synchronized (this.mAdded) {
                        this.mAdded.add(fragment2);
                    }
                } else {
                    throw new IllegalStateException("Already added " + fragment2);
                }
            }
        }
        if (fragmentManagerState.LIZJ != null) {
            this.mBackStack = new ArrayList<>(fragmentManagerState.LIZJ.length);
            for (int i = 0; i < fragmentManagerState.LIZJ.length; i++) {
                C0289a LIZ = fragmentManagerState.LIZJ[i].LIZ(this);
                if (DEBUG) {
                    PrintWriter printWriter = new PrintWriter(new C103348Qms("FragmentManager"));
                    LIZ.LIZ("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(LIZ);
                if (LIZ.LIZJ >= 0) {
                    setBackStackIndex(LIZ.LIZJ, LIZ);
                }
            }
        } else {
            this.mBackStack = null;
        }
        if (fragmentManagerState.LIZLLL != null) {
            this.mPrimaryNav = this.mActive.get(fragmentManagerState.LIZLLL);
            dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
        }
        this.mNextFragmentIndex = fragmentManagerState.f20258LJ;
    }

    /* renamed from: androidx.fragment.app.FragmentManagerImpl$c */
    /* loaded from: classes19.dex */
    public static final class C0281c {
        public final AbstractC92843Mhp LIZ;
        public final boolean LIZIZ;

        static {
            Covode.recordClassIndex(1277);
        }

        public C0281c(AbstractC92843Mhp abstractC92843Mhp, boolean z) {
            this.LIZ = abstractC92843Mhp;
            this.LIZIZ = z;
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public final boolean popBackStackImmediate(String str, int i) {
        checkStateLoss();
        return popBackStackImmediate(str, -1, i);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void registerFragmentLifecycleCallbacks(AbstractC92843Mhp abstractC92843Mhp, boolean z) {
        this.mLifecycleCallbacks.add(new C0281c(abstractC92843Mhp, z));
    }

    public static C145623epj makeFadeAnimation(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220L);
        return new C145623epj(alphaAnimation);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void popBackStack(String str, int i) {
        enqueueAction(new C145624epk(this, str, -1, i), false);
    }

    public final void restoreAllState(Parcelable parcelable, C0291f c0291f) {
        if (this.mHost instanceof AbstractC0326p) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.LIZ(c0291f);
        restoreSaveState(parcelable);
    }

    /* renamed from: androidx_fragment_app_FragmentManagerImpl_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_ensureExecReady */
    public static void m21153xbd915a4d(FragmentManagerImpl fragmentManagerImpl, boolean z) {
        if (fragmentManagerImpl.mHost != null) {
            fragmentManagerImpl.m21158xe0e2dc2e(z);
            return;
        }
        throw new IllegalStateException("Fragment { +" + fragmentManagerImpl.mParent + "+ } host has been destroyed");
    }

    private boolean generateOpsForPendingActions(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.mPendingActions == null || this.mPendingActions.size() == 0) {
                return false;
            }
            int size = this.mPendingActions.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.mPendingActions.get(i).LIZ(arrayList, arrayList2);
            }
            this.mPendingActions.clear();
            this.mHost.LIZLLL.removeCallbacks(this.mExecCommit);
            return z;
        }
    }

    public final void dispatchOnFragmentDestroyed(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentDestroyed(fragment, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentDestroyed(this, fragment);
            }
        }
    }

    public final void dispatchOnFragmentDetached(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentDetached(fragment, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentDetached(this, fragment);
            }
        }
    }

    public final void dispatchOnFragmentPaused(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPaused(fragment, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentPaused(this, fragment);
            }
        }
    }

    public final void dispatchOnFragmentResumed(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentResumed(fragment, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentResumed(this, fragment);
            }
        }
    }

    public final void dispatchOnFragmentStarted(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentStarted(fragment, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentStarted(this, fragment);
            }
        }
    }

    public final void dispatchOnFragmentStopped(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentStopped(fragment, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentStopped(this, fragment);
            }
        }
    }

    public final void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentViewDestroyed(fragment, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentViewDestroyed(this, fragment);
            }
        }
    }

    public final void enqueueAction(AbstractC0282e abstractC0282e, boolean z) {
        if (!z) {
            checkStateLoss();
        }
        synchronized (this) {
            if (!this.mDestroyed && this.mHost != null) {
                if (this.mPendingActions == null) {
                    this.mPendingActions = new ArrayList<>();
                }
                this.mPendingActions.add(abstractC0282e);
                scheduleCommit();
            } else if (z) {
            } else {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void execSingleAction(AbstractC0282e abstractC0282e, boolean z) {
        if (z && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        ensureExecReady(z);
        if (abstractC0282e.LIZ(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        burpActive();
    }

    @Override // androidx.fragment.app.FragmentManager
    public final Fragment getFragment(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.mActive.get(string);
        if (fragment == null) {
            throwException(new IllegalStateException(C0002O.m25084C("Fragment no longer exists for key ", str, ": unique id ", string)));
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void popBackStack(int i, int i2) {
        if (i >= 0) {
            enqueueAction(new C145624epk(this, null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final boolean popBackStackImmediate(int i, int i2) {
        checkStateLoss();
        execPendingActions();
        if (i >= 0) {
            return popBackStackImmediate(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public final void setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (this.mActive.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    private void executePostponedTransaction(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0283g> arrayList3 = this.mPostponedTransactions;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                C0283g c0283g = this.mPostponedTransactions.get(i);
                if (arrayList != null && !c0283g.LIZ && (indexOf2 = arrayList.indexOf(c0283g.LIZIZ)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                    this.mPostponedTransactions.remove(i);
                    i--;
                    size--;
                    c0283g.LIZLLL();
                } else if (c0283g.LIZJ == 0 || (arrayList != null && c0283g.LIZIZ.LIZ(arrayList, 0, arrayList.size()))) {
                    this.mPostponedTransactions.remove(i);
                    i--;
                    size--;
                    if (arrayList != null && !c0283g.LIZ && (indexOf = arrayList.indexOf(c0283g.LIZIZ)) != -1 && arrayList2.get(indexOf).booleanValue()) {
                        c0283g.LIZLLL();
                    } else {
                        c0283g.LIZJ();
                    }
                }
                i++;
            }
        }
    }

    private void removeRedundantOperationsAndExecute(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 != null && arrayList.size() == arrayList2.size()) {
                executePostponedTransaction(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).mReorderingAllowed) {
                        if (i2 != i) {
                            executeOpsTogether(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).mReorderingAllowed) {
                                i2++;
                            }
                        }
                        executeOpsTogether(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    executeOpsTogether(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void addFragment(Fragment fragment, boolean z) {
        makeActive(fragment);
        if (!fragment.mDetached) {
            if (!this.mAdded.contains(fragment)) {
                synchronized (this.mAdded) {
                    this.mAdded.add(fragment);
                }
                fragment.mAdded = true;
                fragment.mRemoving = false;
                if (fragment.mView == null) {
                    fragment.mHiddenChanged = false;
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                if (z) {
                    moveToState(fragment);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public final boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.mCurState <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i2 = 0; i2 < this.mCreatedMenus.size(); i2++) {
                Fragment fragment2 = this.mCreatedMenus.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public final void moveToState(int i, boolean z) {
        AbstractC145684eqi abstractC145684eqi;
        if (this.mHost == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i == this.mCurState) {
            return;
        }
        this.mCurState = i;
        int size = this.mAdded.size();
        for (int i2 = 0; i2 < size; i2++) {
            moveFragmentToExpectedState(this.mAdded.get(i2));
        }
        for (Fragment fragment : this.mActive.values()) {
            if (fragment != null && (fragment.mRemoving || fragment.mDetached)) {
                if (!fragment.mIsNewlyAdded) {
                    moveFragmentToExpectedState(fragment);
                }
            }
        }
        startPendingDeferredFragments();
        if (this.mNeedMenuInvalidate && (abstractC145684eqi = this.mHost) != null && this.mCurState == 4) {
            abstractC145684eqi.LIZLLL();
            this.mNeedMenuInvalidate = false;
        }
    }

    public final void setBackStackIndex(int i, C0289a c0289a) {
        synchronized (this) {
            if (this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList<>();
            }
            int size = this.mBackStackIndices.size();
            if (i < size) {
                this.mBackStackIndices.set(i, c0289a);
            } else {
                while (size < i) {
                    this.mBackStackIndices.add(null);
                    if (this.mAvailBackStackIndices == null) {
                        this.mAvailBackStackIndices = new ArrayList<>();
                    }
                    this.mAvailBackStackIndices.add(Integer.valueOf(size));
                    size++;
                }
                this.mBackStackIndices.add(c0289a);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private void animateRemoveFragment(final Fragment fragment, C145623epj c145623epj, int i) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (c145623epj.LIZ != null) {
            RunnableC139217dA5 runnableC139217dA5 = new RunnableC139217dA5(c145623epj.LIZ, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            runnableC139217dA5.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.FragmentManagerImpl.3
                static {
                    Covode.recordClassIndex(1270);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    viewGroup.post(new Runnable() { // from class: androidx.fragment.app.FragmentManagerImpl.3.1
                        static {
                            Covode.recordClassIndex(1271);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                r13 = this;
                                androidx.fragment.app.FragmentManagerImpl$3 r0 = androidx.fragment.app.FragmentManagerImpl.animationAnimation$AnimationListenerC02763.this
                                androidx.fragment.app.Fragment r0 = r3
                                android.view.View r0 = r0.getAnimatingAway()
                                if (r0 == 0) goto Lca
                                androidx.fragment.app.FragmentManagerImpl$3 r0 = androidx.fragment.app.FragmentManagerImpl.animationAnimation$AnimationListenerC02763.this
                                androidx.fragment.app.Fragment r1 = r3
                                r0 = 0
                                r1.setAnimatingAway(r0)
                                androidx.fragment.app.FragmentManagerImpl$3 r0 = androidx.fragment.app.FragmentManagerImpl.animationAnimation$AnimationListenerC02763.this
                                androidx.fragment.app.FragmentManagerImpl r7 = androidx.fragment.app.FragmentManagerImpl.this
                                androidx.fragment.app.FragmentManagerImpl$3 r0 = androidx.fragment.app.FragmentManagerImpl.animationAnimation$AnimationListenerC02763.this
                                androidx.fragment.app.Fragment r8 = r3
                                androidx.fragment.app.FragmentManagerImpl$3 r0 = androidx.fragment.app.FragmentManagerImpl.animationAnimation$AnimationListenerC02763.this
                                androidx.fragment.app.Fragment r0 = r3
                                int r9 = r0.getStateAfterAnimating()
                                r10 = 0
                                r11 = 0
                                r12 = 0
                                r7.moveToState(r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L2a
                                goto Lc9
                            L2a:
                                r7 = move-exception
                                java.lang.String r4 = ""
                                if (r8 == 0) goto L30
                                goto L32
                            L30:
                                r5 = r4
                                goto L3a
                            L32:
                                java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Exception -> Laf
                                java.lang.String r5 = r0.getName()     // Catch: java.lang.Exception -> Laf
                            L3a:
                                com.bytedance.ies.ugc.appcontext.AppMonitor r0 = com.bytedance.ies.ugc.appcontext.AppMonitor.INSTANCE     // Catch: java.lang.Exception -> Laf
                                android.app.Activity r0 = r0.getCurrentActivity()     // Catch: java.lang.Exception -> Laf
                                if (r0 == 0) goto Lad
                                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> Laf
                                java.lang.String r6 = r0.getName()     // Catch: java.lang.Exception -> Laf
                            L4a:
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r1 = com.p1594ss.android.ugc.aweme.app.event.EventJsonBuilder.newBuilder()     // Catch: java.lang.Exception -> Laf
                                java.lang.String r0 = "fragmentname"
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r1.addValuePair(r0, r5)     // Catch: java.lang.Exception -> Laf
                                java.lang.String r1 = "newState"
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> Laf
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> Laf
                                java.lang.String r1 = "transit"
                                r3 = 0
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Laf
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> Laf
                                java.lang.String r1 = "transitionStyle"
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Laf
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> Laf
                                java.lang.String r1 = "keepActive"
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Laf
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r1 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> Laf
                                java.lang.String r0 = "currentActivity"
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r1.addValuePair(r0, r6)     // Catch: java.lang.Exception -> Laf
                                java.lang.String r1 = "errorMsg"
                                java.lang.String r0 = android.util.Log.getStackTraceString(r7)     // Catch: java.lang.Exception -> Laf
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r0 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> Laf
                                org.json.JSONObject r0 = r0.build()     // Catch: java.lang.Exception -> Laf
                                java.lang.String r3 = "fragment_crash_log"
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = com.p1594ss.android.ugc.aweme.app.event.EventJsonBuilder.newBuilder()     // Catch: java.lang.Exception -> Laf
                                java.lang.String r1 = "errorDesc"
                                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Laf
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r1 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> Laf
                                java.lang.String r0 = "fragment_name"
                                com.ss.android.ugc.aweme.app.event.EventJsonBuilder r0 = r1.addValuePair(r0, r5)     // Catch: java.lang.Exception -> Laf
                                org.json.JSONObject r0 = r0.build()     // Catch: java.lang.Exception -> Laf
                                p003X.C103460Qog.LIZ(r3, r4, r0)     // Catch: java.lang.Exception -> Laf
                                goto Laf
                            Lad:
                                r6 = r4
                                goto L4a
                            Laf:
                                java.util.List<java.lang.Class> r0 = p003X.Q1C.LIZ
                                java.util.Iterator r1 = r0.iterator()
                            Lb5:
                                boolean r0 = r1.hasNext()
                                if (r0 == 0) goto Lc8
                                java.lang.Object r0 = r1.next()
                                java.lang.Class r0 = (java.lang.Class) r0
                                boolean r0 = r0.isInstance(r8)
                                if (r0 != 0) goto Lca
                                goto Lb5
                            Lc8:
                                throw r7
                            Lc9:
                                return
                            Lca:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.animationAnimation$AnimationListenerC02763.RunnableC02771.run():void");
                        }
                    });
                }
            });
            fragment.mView.startAnimation(runnableC139217dA5);
            return;
        }
        Animator animator = c145623epj.LIZIZ;
        fragment.setAnimator(c145623epj.LIZIZ);
        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.FragmentManagerImpl.4
            static {
                Covode.recordClassIndex(1272);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                String str;
                viewGroup.endViewTransition(view);
                Animator animator3 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator3 != null && viewGroup.indexOfChild(view) < 0) {
                    FragmentManagerImpl fragmentManagerImpl = FragmentManagerImpl.this;
                    Fragment fragment2 = fragment;
                    int stateAfterAnimating = fragment2.getStateAfterAnimating();
                    try {
                        fragmentManagerImpl.moveToState(fragment2, stateAfterAnimating, 0, 0, false);
                    } catch (Exception e) {
                        try {
                            String name = fragment2.getClass().getName();
                            Activity currentActivity = AppMonitor.INSTANCE.getCurrentActivity();
                            if (currentActivity == null) {
                                str = "";
                            } else {
                                str = currentActivity.getClass().getName();
                            }
                            C103460Qog.LIZ("fragment_crash_log", "", EventJsonBuilder.newBuilder().addValuePair("errorDesc", EventJsonBuilder.newBuilder().addValuePair("fragmentname", name).addValuePair("newState", Integer.valueOf(stateAfterAnimating)).addValuePair("transit", (Integer) 0).addValuePair("transitionStyle", (Integer) 0).addValuePair("keepActive", Boolean.FALSE).addValuePair("currentActivity", str).addValuePair("errorMsg", Log.getStackTraceString(e)).build().toString()).addValuePair("fragment_name", name).build());
                        } catch (Exception unused) {
                        }
                        for (Class cls : Q1C.LIZ) {
                            if (cls.isInstance(fragment2)) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
            }
        });
        animator.setTarget(fragment.mView);
        animator.start();
    }

    public final void dispatchOnFragmentActivityCreated(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentActivityCreated(fragment, bundle, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentActivityCreated(this, fragment, bundle);
            }
        }
    }

    public final void dispatchOnFragmentAttached(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentAttached(fragment, context, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentAttached(this, fragment, context);
            }
        }
    }

    public final void dispatchOnFragmentCreated(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentCreated(fragment, bundle, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentCreated(this, fragment, bundle);
            }
        }
    }

    public final void dispatchOnFragmentPreAttached(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPreAttached(fragment, context, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentPreAttached(this, fragment, context);
            }
        }
    }

    public final void dispatchOnFragmentPreCreated(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPreCreated(fragment, bundle, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentPreCreated(this, fragment, bundle);
            }
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentSaveInstanceState(this, fragment, bundle);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    private boolean popBackStackImmediate(String str, int i, int i2) {
        execPendingActions();
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        burpActive();
        return popBackStackState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachController(AbstractC145684eqi abstractC145684eqi, AbstractC0290b abstractC0290b, Fragment fragment) {
        if (this.mHost == null) {
            this.mHost = abstractC145684eqi;
            this.mContainer = abstractC0290b;
            this.mParent = fragment;
            if (this.mParent != null) {
                updateOnBackPressedCallbackEnabled();
            }
            if (abstractC145684eqi instanceof AbstractC0182b) {
                AbstractC0182b abstractC0182b = (AbstractC0182b) abstractC145684eqi;
                this.mOnBackPressedDispatcher = abstractC0182b.getOnBackPressedDispatcher();
                Fragment fragment2 = abstractC0182b;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                this.mOnBackPressedDispatcher.addCallback(fragment2, this.mOnBackPressedCallback);
            }
            if (fragment != null) {
                this.mNonConfig = fragment.mFragmentManager.getChildNonConfig(fragment);
                return;
            } else if (abstractC145684eqi instanceof AbstractC0326p) {
                this.mNonConfig = (C0292g) new ViewModelProvider(((AbstractC0326p) abstractC145684eqi).getViewModelStore(), C0292g.LIZ).get(C0292g.class);
                return;
            } else {
                this.mNonConfig = new C0292g(false);
                return;
            }
        }
        throw new IllegalStateException("Already attached");
    }

    public static void executeOps(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0289a c0289a = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                c0289a.LIZ(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                c0289a.LIZ(z);
            } else {
                c0289a.LIZ(1);
                c0289a.LIZIZ();
            }
            i++;
        }
    }

    public static C145623epj makeOpenCloseAnimation(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(DECELERATE_QUINT);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new C145623epj(animationSet);
    }

    public final void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentViewCreated(fragment, view, bundle, true);
            }
        }
        Iterator<C0281c> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            C0281c next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentViewCreated(this, fragment, view, bundle);
            }
        }
    }

    public final void completeExecute(C0289a c0289a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0289a.LIZ(z3);
        } else {
            c0289a.LIZIZ();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0289a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C139228dAG.LIZ(this, (ArrayList<C0289a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            moveToState(this.mCurState, true);
        }
        for (Fragment fragment : this.mActive.values()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c0289a.LIZIZ(fragment.mContainerId)) {
                if (fragment.mPostponedAlpha > 0.0f) {
                    fragment.mView.setAlpha(fragment.mPostponedAlpha);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    private void executeOpsTogether(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4 = i;
        boolean z = arrayList.get(i4).mReorderingAllowed;
        ArrayList<Fragment> arrayList3 = this.mTmpAddedFragments;
        if (arrayList3 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.mTmpAddedFragments.addAll(this.mAdded);
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z2 = false;
        for (int i5 = i4; i5 < i2; i5++) {
            C0289a c0289a = arrayList.get(i5);
            if (!arrayList2.get(i5).booleanValue()) {
                primaryNavigationFragment = c0289a.LIZ(this.mTmpAddedFragments, primaryNavigationFragment);
            } else {
                primaryNavigationFragment = c0289a.LIZIZ(this.mTmpAddedFragments, primaryNavigationFragment);
            }
            if (!z2 && !c0289a.mAddToBackStack) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        this.mTmpAddedFragments.clear();
        if (!z) {
            C139228dAG.LIZ(this, arrayList, arrayList2, i4, i2, false);
        }
        executeOps(arrayList, arrayList2, i4, i2);
        if (z) {
            ArraySet<Fragment> arraySet = new ArraySet<>();
            addAddedFragments(arraySet);
            i3 = postponePostponableTransactions(arrayList, arrayList2, i4, i2, arraySet);
            makeRemovedFragmentsInvisible(arraySet);
        } else {
            i3 = i2;
        }
        if (i3 != i4 && z) {
            C139228dAG.LIZ(this, arrayList, arrayList2, i4, i3, true);
            moveToState(this.mCurState, true);
        }
        while (i4 < i2) {
            C0289a c0289a2 = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue() && c0289a2.LIZJ >= 0) {
                freeBackStackIndex(c0289a2.LIZJ);
                c0289a2.LIZJ = -1;
            }
            c0289a2.LIZ();
            i4++;
        }
        if (z2) {
            reportBackStackChanged();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0054, code lost:
        if (0 == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p003X.C145623epj loadAnimation(androidx.fragment.app.Fragment r7, int r8, boolean r9, int r10) {
        /*
            r6 = this;
            int r2 = r7.getNextAnim()
            r4 = 0
            r7.setNextAnim(r4)
            android.view.ViewGroup r0 = r7.mContainer
            r5 = 0
            if (r0 == 0) goto L16
            android.view.ViewGroup r0 = r7.mContainer
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L16
            return r5
        L16:
            android.view.animation.Animation r1 = r7.onCreateAnimation(r8, r9, r2)
            if (r1 == 0) goto L22
            X.epj r0 = new X.epj
            r0.<init>(r1)
            return r0
        L22:
            android.animation.Animator r1 = r7.onCreateAnimator(r8, r9, r2)
            if (r1 == 0) goto L2e
            X.epj r0 = new X.epj
            r0.<init>(r1)
            return r0
        L2e:
            if (r2 == 0) goto L7d
            X.eqi r0 = r6.mHost
            android.content.Context r0 = r0.LIZJ
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r2)
            java.lang.String r0 = "anim"
            boolean r3 = r0.equals(r1)
            if (r3 == 0) goto L59
            X.eqi r0 = r6.mHost     // Catch: java.lang.RuntimeException -> L54 android.content.res.Resources.NotFoundException -> L57
            android.content.Context r0 = r0.LIZJ     // Catch: java.lang.RuntimeException -> L54 android.content.res.Resources.NotFoundException -> L57
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r0, r2)     // Catch: java.lang.RuntimeException -> L54 android.content.res.Resources.NotFoundException -> L57
            if (r1 == 0) goto L7d
            X.epj r0 = new X.epj     // Catch: java.lang.RuntimeException -> L54 android.content.res.Resources.NotFoundException -> L57
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L54 android.content.res.Resources.NotFoundException -> L57
            return r0
        L54:
            if (r4 != 0) goto L7d
            goto L59
        L57:
            r0 = move-exception
            throw r0
        L59:
            X.eqi r0 = r6.mHost     // Catch: java.lang.RuntimeException -> L69
            android.content.Context r0 = r0.LIZJ     // Catch: java.lang.RuntimeException -> L69
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r0, r2)     // Catch: java.lang.RuntimeException -> L69
            if (r1 == 0) goto L7d
            X.epj r0 = new X.epj     // Catch: java.lang.RuntimeException -> L69
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L69
            return r0
        L69:
            r0 = move-exception
            if (r3 != 0) goto L7c
            X.eqi r0 = r6.mHost
            android.content.Context r0 = r0.LIZJ
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r0, r2)
            if (r1 == 0) goto L7d
            X.epj r0 = new X.epj
            r0.<init>(r1)
            return r0
        L7c:
            throw r0
        L7d:
            if (r8 != 0) goto L80
            return r5
        L80:
            int r3 = transitToStyleIndex(r8, r9)
            if (r3 >= 0) goto L87
            return r5
        L87:
            r0 = 1064933786(0x3f79999a, float:0.975)
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            switch(r3) {
                case 1: goto Lbd;
                case 2: goto Lb8;
                case 3: goto Lb3;
                case 4: goto Lab;
                case 5: goto La6;
                case 6: goto La1;
                default: goto L90;
            }
        L90:
            if (r10 != 0) goto La0
            X.eqi r0 = r6.mHost
            boolean r0 = r0.mo21420LJ()
            if (r0 == 0) goto La0
            X.eqi r0 = r6.mHost
            int r0 = r0.LJFF()
        La0:
            return r5
        La1:
            X.epj r0 = makeFadeAnimation(r1, r2)
            return r0
        La6:
            X.epj r0 = makeFadeAnimation(r2, r1)
            return r0
        Lab:
            r0 = 1065982362(0x3f89999a, float:1.075)
            X.epj r0 = makeOpenCloseAnimation(r1, r0, r1, r2)
            return r0
        Lb3:
            X.epj r0 = makeOpenCloseAnimation(r0, r1, r2, r1)
            return r0
        Lb8:
            X.epj r0 = makeOpenCloseAnimation(r1, r0, r1, r2)
            return r0
        Lbd:
            r0 = 1066401792(0x3f900000, float:1.125)
            X.epj r0 = makeOpenCloseAnimation(r0, r1, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.loadAnimation(androidx.fragment.app.Fragment, int, boolean, int):X.epj");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.FragmentManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r15 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r1 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        r15 = findFragmentById(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r15 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        r15 = getFragmentFactory().LIZJ(r23.getClassLoader(), r13);
        r15.mFromLayout = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r2 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
        r15.mFragmentId = r0;
        r15.mContainerId = r1;
        r15.mTag = r9;
        r15.mInLayout = true;
        r15.mFragmentManager = r20;
        r0 = r20.mHost;
        r15.mHost = r0;
        r15.onInflate(r0.LIZJ, r24, r15.mSavedFragmentState);
        addFragment(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0068, code lost:
        if (r9 != null) goto L20;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r21, java.lang.String r22, android.content.Context r23, android.util.AttributeSet r24) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    private int postponePostponableTransactions(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, ArraySet<Fragment> arraySet) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0289a c0289a = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            int i5 = 0;
            while (true) {
                if (i5 >= c0289a.mOps.size()) {
                    break;
                } else if (C0289a.LIZ(c0289a.mOps.get(i5))) {
                    if (!c0289a.LIZ(arrayList, i4 + 1, i2)) {
                        if (this.mPostponedTransactions == null) {
                            this.mPostponedTransactions = new ArrayList<>();
                        }
                        C0283g c0283g = new C0283g(c0289a, booleanValue);
                        this.mPostponedTransactions.add(c0283g);
                        c0289a.LIZ(c0283g);
                        if (booleanValue) {
                            c0289a.LIZIZ();
                        } else {
                            c0289a.LIZ(false);
                        }
                        i3--;
                        if (i4 != i3) {
                            arrayList.remove(i4);
                            arrayList.add(i3, c0289a);
                        }
                        addAddedFragments(arraySet);
                    }
                } else {
                    i5++;
                }
            }
        }
        return i3;
    }

    public final boolean popBackStackState(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int size;
        ArrayList<C0289a> arrayList3 = this.mBackStack;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0) {
            if ((i2 & 1) == 0) {
                int size2 = arrayList3.size() - 1;
                if (size2 < 0) {
                    return false;
                }
                arrayList.add(this.mBackStack.remove(size2));
                arrayList2.add(Boolean.TRUE);
                return true;
            }
            size = -1;
        } else {
            size = this.mBackStack.size() - 1;
            while (size >= 0) {
                C0289a c0289a = this.mBackStack.get(size);
                if ((str == null || !str.equals(c0289a.LIZJ())) && (i < 0 || i != c0289a.LIZJ)) {
                    size--;
                } else if ((i2 & 1) != 0) {
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C0289a c0289a2 = this.mBackStack.get(size);
                        if (str == null || !str.equals(c0289a2.LIZJ())) {
                            if (i < 0 || i != c0289a2.LIZJ) {
                                break;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (size == this.mBackStack.size() - 1) {
            return false;
        }
        for (int size3 = this.mBackStack.size() - 1; size3 > size; size3--) {
            arrayList.add(this.mBackStack.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01cb, code lost:
        if (r7 != 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02cf, code lost:
        if (r4 > 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void moveToState(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.moveToState(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* renamed from: INVOKEVIRTUAL_androidx_fragment_app_FragmentManagerImpl_com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m21159xa9a39a17(androidx.fragment.app.FragmentManagerImpl r6, androidx.fragment.app.Fragment r7, int r8, int r9, int r10, boolean r11) {
        /*
            r6.moveToState(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L5
            goto La5
        L5:
            r6 = move-exception
            java.lang.String r4 = ""
            if (r7 == 0) goto Lb
            goto Ld
        Lb:
            r5 = r4
            goto L15
        Ld:
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Exception -> L8b
            java.lang.String r5 = r0.getName()     // Catch: java.lang.Exception -> L8b
        L15:
            com.bytedance.ies.ugc.appcontext.AppMonitor r0 = com.bytedance.ies.ugc.appcontext.AppMonitor.INSTANCE     // Catch: java.lang.Exception -> L8b
            android.app.Activity r0 = r0.getCurrentActivity()     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L89
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L8b
            java.lang.String r3 = r0.getName()     // Catch: java.lang.Exception -> L8b
        L25:
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r1 = com.p1594ss.android.ugc.aweme.app.event.EventJsonBuilder.newBuilder()     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "fragmentname"
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r1.addValuePair(r0, r5)     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = "newState"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = "transit"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = "transitionStyle"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = "keepActive"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r1 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "currentActivity"
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = r1.addValuePair(r0, r3)     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = "errorMsg"
            java.lang.String r0 = android.util.Log.getStackTraceString(r6)     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r0 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> L8b
            org.json.JSONObject r0 = r0.build()     // Catch: java.lang.Exception -> L8b
            java.lang.String r3 = "fragment_crash_log"
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r2 = com.p1594ss.android.ugc.aweme.app.event.EventJsonBuilder.newBuilder()     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = "errorDesc"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r1 = r2.addValuePair(r1, r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "fragment_name"
            com.ss.android.ugc.aweme.app.event.EventJsonBuilder r0 = r1.addValuePair(r0, r5)     // Catch: java.lang.Exception -> L8b
            org.json.JSONObject r0 = r0.build()     // Catch: java.lang.Exception -> L8b
            p003X.C103460Qog.LIZ(r3, r4, r0)     // Catch: java.lang.Exception -> L8b
            goto L8b
        L89:
            r3 = r4
            goto L25
        L8b:
            java.util.List<java.lang.Class> r0 = p003X.Q1C.LIZ
            java.util.Iterator r1 = r0.iterator()
        L91:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r1.next()
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isInstance(r7)
            if (r0 == 0) goto L91
            return
        La4:
            throw r6
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.m21159xa9a39a17(androidx.fragment.app.FragmentManagerImpl, androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }
}
