package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC0326p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.p019a.AbstractC0327a;
import androidx.savedstate.AbstractC0403c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p002O.C0002O;
import p003X.AbstractC109833TMd;
import p003X.AbstractC145684eqi;
import p003X.AbstractC145688eqm;
import p003X.C106164RrC;
import p003X.C115757VhX;
import p003X.C116971W2r;
import p003X.C135099c5W;
import p003X.C144358eVE;
import p003X.C145685eqj;
import p003X.C145686eqk;
import p003X.C65357BqZ;
import p003X.W2R;

/* loaded from: classes19.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, AbstractC0326p, AbstractC0403c {
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public boolean mAdded;
    public C145685eqj mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mCalled;
    public FragmentManagerImpl mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManagerImpl mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC145684eqi mHost;
    public boolean mInLayout;
    public View mInnerView;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public LifecycleRegistry mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public C106164RrC mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C145686eqk mViewLifecycleOwner;
    public MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;
    public String mWho;

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onHiddenChanged(boolean z) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void setUserVisibleHint(boolean z) {
        m21170xe29adf54(this, z);
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public Lifecycle mo29786getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public final String getTag() {
        return this.mTag;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public AbstractC0327a getLoaderManager() {
        return AbstractC0327a.LIZ(this);
    }

    @Override // androidx.savedstate.AbstractC0403c
    public final C144358eVE getSavedStateRegistry() {
        return this.mSavedStateRegistryController.LIZ;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().LJIILLIIL = true;
    }

    /* loaded from: classes19.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.fragment.app.Fragment.SavedState.1
            static {
                Covode.recordClassIndex(1257);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        public final Bundle mState;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(1256);
        }

        public SavedState(Bundle bundle) {
            this.mState = bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle;
            this.mState = parcel.readBundle();
            if (classLoader != null && (bundle = this.mState) != null) {
                bundle.setClassLoader(classLoader);
            }
        }
    }

    static {
        Covode.recordClassIndex(1250);
    }

    private C145685eqj ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C145685eqj();
        }
        return this.mAnimationInfo;
    }

    public final FragmentActivity getActivity() {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi == null) {
            return null;
        }
        return (FragmentActivity) abstractC145684eqi.LIZIZ;
    }

    public View getAnimatingAway() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        return c145685eqj.LIZ;
    }

    public Animator getAnimator() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        return c145685eqj.LIZIZ;
    }

    public Context getContext() {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi == null) {
            return null;
        }
        return abstractC145684eqi.LIZJ;
    }

    public Object getEnterTransition() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        return c145685eqj.LJI;
    }

    public AbstractC109833TMd getEnterTransitionCallback() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        return c145685eqj.LJIILJJIL;
    }

    public Object getExitTransition() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        return c145685eqj.LJIIIIZZ;
    }

    public AbstractC109833TMd getExitTransitionCallback() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        return c145685eqj.LJIILL;
    }

    public final Object getHost() {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi == null) {
            return null;
        }
        return abstractC145684eqi.LJI();
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return layoutInflater;
    }

    public int getNextAnim() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return 0;
        }
        return c145685eqj.LIZLLL;
    }

    public int getNextTransition() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return 0;
        }
        return c145685eqj.f19434LJ;
    }

    public int getNextTransitionStyle() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return 0;
        }
        return c145685eqj.LJFF;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public Object getSharedElementEnterTransition() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        return c145685eqj.LJIIJ;
    }

    public int getStateAfterAnimating() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return 0;
        }
        return c145685eqj.LIZJ;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        C145686eqk c145686eqk = this.mViewLifecycleOwner;
        if (c145686eqk != null) {
            return c145686eqk;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public boolean isHideReplaced() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return false;
        }
        return c145685eqj.LJIJ;
    }

    public boolean isPostponed() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return false;
        }
        return c145685eqj.LJIILLIIL;
    }

    public final boolean isResumed() {
        if (this.mState >= 4) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        FragmentManagerImpl fragmentManagerImpl = this.mFragmentManager;
        if (fragmentManagerImpl == null) {
            return false;
        }
        return fragmentManagerImpl.isStateSaved();
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.dispatchLowMemory();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = C106164RrC.LIZ(this);
        int i = Build.VERSION.SDK_INT;
        this.mLifecycleRegistry.addObserver(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.2
            static {
                Covode.recordClassIndex(1252);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP && Fragment.this.mView != null) {
                    Fragment.this.mView.cancelPendingInputEvents();
                }
            }
        });
    }

    public void callStartTransitionListener() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj != null) {
            c145685eqj.LJIILLIIL = false;
            AbstractC145688eqm abstractC145688eqm = c145685eqj.LJIIZILJ;
            this.mAnimationInfo.LJIIZILJ = null;
            if (abstractC145688eqm != null) {
                abstractC145688eqm.LIZ();
            }
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj != null && c145685eqj.LJIILIIL != null) {
            return this.mAnimationInfo.LJIILIIL.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj != null && c145685eqj.LJIIL != null) {
            return this.mAnimationInfo.LJIIL.booleanValue();
        }
        return true;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Object getReenterTransition() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        if (c145685eqj.LJIIIZ == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return this.mAnimationInfo.LJIIIZ;
    }

    public Object getReturnTransition() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        if (c145685eqj.LJII == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return this.mAnimationInfo.LJII;
    }

    public Object getSharedElementReturnTransition() {
        C145685eqj c145685eqj = this.mAnimationInfo;
        if (c145685eqj == null) {
            return null;
        }
        if (c145685eqj.LJIIJJI == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.LJIIJJI;
    }

    public final Fragment getTargetFragment() {
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManagerImpl fragmentManagerImpl = this.mFragmentManager;
        if (fragmentManagerImpl != null && this.mTargetWho != null) {
            return fragmentManagerImpl.mActive.get(this.mTargetWho);
        }
        return null;
    }

    @Override // androidx.lifecycle.AbstractC0326p
    public ViewModelStore getViewModelStore() {
        FragmentManagerImpl fragmentManagerImpl = this.mFragmentManager;
        if (fragmentManagerImpl != null) {
            return fragmentManagerImpl.getViewModelStore(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean isPrimaryNavigation = this.mFragmentManager.isPrimaryNavigation(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != isPrimaryNavigation) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(isPrimaryNavigation);
            onPrimaryNavigationFragmentChanged(isPrimaryNavigation);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final FragmentManager requireFragmentManager() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Fragment() {
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() { // from class: androidx.fragment.app.Fragment.1
            static {
                Covode.recordClassIndex(1251);
            }

            @Override // java.lang.Runnable
            public final void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        initLifecycle();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void performAttach() {
        this.mChildFragmentManager.attachController(this.mHost, new AbstractC0290b() { // from class: androidx.fragment.app.Fragment.4
            static {
                Covode.recordClassIndex(1254);
            }

            @Override // androidx.fragment.app.AbstractC0290b
            public final boolean LIZ() {
                if (Fragment.this.mView != null) {
                    return true;
                }
                return false;
            }

            @Override // androidx.fragment.app.AbstractC0290b
            public final View LIZ(int i) {
                if (Fragment.this.mView != null) {
                    return Fragment.this.mView.findViewById(i);
                }
                throw new IllegalStateException("Fragment " + this + " does not have a view");
            }
        }, this);
        this.mCalled = false;
        onAttach(this.mHost.LIZJ);
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC0327a.LIZ(this).LIZ();
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (!this.mChildFragmentManager.isDestroyed()) {
                this.mChildFragmentManager.dispatchDestroy();
                this.mChildFragmentManager = new FragmentManagerImpl();
                return;
            }
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
    }

    public void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
    }

    public void startPostponedEnterTransition() {
        FragmentManagerImpl fragmentManagerImpl = this.mFragmentManager;
        if (fragmentManagerImpl != null && fragmentManagerImpl.mHost != null) {
            if (Looper.myLooper() != this.mFragmentManager.mHost.LIZLLL.getLooper()) {
                this.mFragmentManager.mHost.LIZLLL.postAtFrontOfQueue(new Runnable() { // from class: androidx.fragment.app.Fragment.3
                    static {
                        Covode.recordClassIndex(1253);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Fragment.this.callStartTransitionListener();
                    }
                });
                return;
            } else {
                callStartTransitionListener();
                return;
            }
        }
        ensureAnimationInfo().LJIILLIIL = false;
    }

    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions();
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_RESUME);
            }
            this.mChildFragmentManager.dispatchResume();
            this.mChildFragmentManager.execPendingActions();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions();
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_START);
            }
            this.mChildFragmentManager.dispatchStart();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C65357BqZ.LIZ(this, sb);
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().LIZ = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().LIZIZ = animator;
    }

    public void setEnterSharedElementCallback(AbstractC109833TMd abstractC109833TMd) {
        ensureAnimationInfo().LJIILJJIL = abstractC109833TMd;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().LJI = obj;
    }

    public void setExitSharedElementCallback(AbstractC109833TMd abstractC109833TMd) {
        ensureAnimationInfo().LJIILL = abstractC109833TMd;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().LJIIIIZZ = obj;
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().LJIJ = z;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().LJIIIZ = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().LJII = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().LJIIJ = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().LJIIJJI = obj;
    }

    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().LIZJ = i;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.findFragmentByWho(str);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.dispatchConfigurationChanged(configuration);
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.dispatchMultiWindowModeChanged(z);
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.dispatchPictureInPictureModeChanged(z);
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().LJIILIIL = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().LJIIL = Boolean.valueOf(z);
    }

    public void setNextAnim(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo().LIZLLL = i;
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null) {
            return abstractC145684eqi.LIZ(str);
        }
        return false;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null) {
            LayoutInflater LIZJ = abstractC145684eqi.LIZJ();
            FragmentManagerImpl fragmentManagerImpl = this.mChildFragmentManager;
            fragmentManagerImpl.getLayoutInflaterFactory();
            C135099c5W.LIZ(LIZJ, fragmentManagerImpl);
            return LIZJ;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null && (activity = abstractC145684eqi.LIZIZ) != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.isStateAtLeast(1)) {
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem) || this.mChildFragmentManager.dispatchContextItemSelected(menuItem)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if ((this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) || this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
        }
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.LIZIZ(bundle);
        Parcelable saveAllState = this.mChildFragmentManager.saveAllState();
        if (saveAllState != null) {
            bundle.putParcelable("android:support:fragments", saveAllState);
        }
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.restoreSaveState(parcelable);
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.LIZLLL();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState != null && savedState.mState != null) {
                bundle = savedState.mState;
            } else {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.LIZLLL();
            }
        }
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManagerImpl fragmentManagerImpl = this.mFragmentManager;
        if (fragmentManagerImpl != null) {
            if (z) {
                fragmentManagerImpl.addRetainedFragment(this);
                return;
            } else {
                fragmentManagerImpl.removeRetainedFragment(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void androidx_fragment_app_Fragment__setUserVisibleHint$___twin___(boolean z) {
        boolean z2;
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.performPendingDeferredStart(this);
        }
        this.mUserVisibleHint = z;
        if (this.mState < 3 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.dispatchActivityCreated();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.LIZ(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_CREATE);
                return;
            }
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public void setOnStartEnterTransitionListener(AbstractC145688eqm abstractC145688eqm) {
        ensureAnimationInfo();
        if (abstractC145688eqm == this.mAnimationInfo.LJIIZILJ) {
            return;
        }
        if (abstractC145688eqm != null && this.mAnimationInfo.LJIIZILJ != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (this.mAnimationInfo.LJIILLIIL) {
            this.mAnimationInfo.LJIIZILJ = abstractC145688eqm;
        }
        if (abstractC145688eqm != null) {
            abstractC145688eqm.LIZIZ();
        }
    }

    /* loaded from: classes13.dex */
    public static class InstantiationException extends RuntimeException {
        static {
            Covode.recordClassIndex(1255);
        }

        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        C145685eqj c145685eqj = this.mAnimationInfo;
        c145685eqj.f19434LJ = i;
        c145685eqj.LJFF = i2;
    }

    /* renamed from: androidx_fragment_app_Fragment_com_bytedance_scalpel_scenemanager_lancet_common_FragmentManagerLancet_setUserVisibleHint */
    public static void m21170xe29adf54(final Fragment fragment, final boolean z) {
        fragment.androidx_fragment_app_Fragment__setUserVisibleHint$___twin___(z);
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), fragment}, null, W2R.LIZ, true, 10).isSupported) {
            W2R.LIZ().execute(new Runnable(z, fragment) { // from class: X.W2X
                public static ChangeQuickRedirect LIZ;
                public final boolean LIZIZ;
                public final Fragment LIZJ;

                static {
                    Covode.recordClassIndex(104950);
                }

                {
                    this.LIZIZ = z;
                    this.LIZJ = fragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    boolean z2 = this.LIZIZ;
                    Fragment fragment2 = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0), fragment2}, null, W2R.LIZ, true, 20).isSupported) {
                        return;
                    }
                    W2W.LIZ(new Runnable(z2, fragment2) { // from class: X.W2V
                        public static ChangeQuickRedirect LIZ;
                        public final boolean LIZIZ;
                        public final Fragment LIZJ;

                        static {
                            Covode.recordClassIndex(104951);
                        }

                        {
                            this.LIZIZ = z2;
                            this.LIZJ = fragment2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            FragmentActivity activity;
                            Fragment LIZ2;
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            boolean z3 = this.LIZIZ;
                            Fragment fragment3 = this.LIZJ;
                            if (PatchProxy.proxy(new Object[]{Byte.valueOf(z3 ? (byte) 1 : (byte) 0), fragment3}, null, W2R.LIZ, true, 21).isSupported) {
                                return;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            C116957W2d LIZIZ = VWN.LIZIZ();
                            if (LIZIZ == null) {
                                return;
                            }
                            if (z3 && (activity = fragment3.getActivity()) != null && activity.getSupportFragmentManager() != null && (LIZ2 = W2R.LIZ(activity, fragment3)) != null) {
                                LIZIZ.LIZ(LIZ2.getActivity(), LIZ2);
                            }
                            W2W.LIZ("FragmentManagerLancet#setUserVisibleHint cost: " + (System.currentTimeMillis() - currentTimeMillis));
                        }
                    });
                }
            });
        }
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().LJIILLIIL = true;
        FragmentManagerImpl fragmentManagerImpl = this.mFragmentManager;
        if (fragmentManagerImpl != null) {
            handler = fragmentManagerImpl.mHost.LIZLLL;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final void requestPermissions(String[] strArr, int i) {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null) {
            abstractC145684eqi.LIZ(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null) {
            abstractC145684eqi.LIZ(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2 = getFragmentManager();
        if (fragment != null) {
            fragmentManager = fragment.getFragmentManager();
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
            if (fragment2 == this) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i;
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return C116971W2r.LIZ(layoutInflater, i, viewGroup, false);
        }
        return null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null && (activity = abstractC145684eqi.LIZIZ) != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C145686eqk();
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ();
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (this.mViewLifecycleOwner.LIZ != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.mViewLifecycleOwner = null;
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null) {
            abstractC145684eqi.LIZ(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C115757VhX.LIZIZ(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new InstantiationException(C0002O.m25085C("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (java.lang.InstantiationException e2) {
            throw new InstantiationException(C0002O.m25085C("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException(C0002O.m25085C("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException(C0002O.m25085C("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            AbstractC0327a.LIZ(this).LIZ(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + Constants.COLON_SEPARATOR);
        FragmentManagerImpl fragmentManagerImpl = this.mChildFragmentManager;
        fragmentManagerImpl.dump(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        AbstractC145684eqi abstractC145684eqi = this.mHost;
        if (abstractC145684eqi != null) {
            abstractC145684eqi.LIZ(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
}
