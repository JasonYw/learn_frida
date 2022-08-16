package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0326p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.savedstate.AbstractC0403c;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.C106164RrC;
import p003X.C144358eVE;
import p003X.C145682eqg;
import p003X.FragmentC106217Rs3;

/* loaded from: classes19.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements AbstractC0182b, LifecycleOwner, AbstractC0326p, AbstractC0403c {
    public int mContentLayoutId;
    public final LifecycleRegistry mLifecycleRegistry;
    public final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final C106164RrC mSavedStateRegistryController;
    public ViewModelStore mViewModelStore;

    static {
        Covode.recordClassIndex(406);
    }

    public void androidx_activity_ComponentActivity__onStop$___twin___() {
        super.onStop();
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        m21213xa4b237d9(this);
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public Lifecycle mo29786getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.AbstractC0182b
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.AbstractC0403c
    public final C144358eVE getSavedStateRegistry() {
        return this.mSavedStateRegistryController.LIZ;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.onBackPressed();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C145682eqg c145682eqg = (C145682eqg) getLastNonConfigurationInstance();
        if (c145682eqg != null) {
            return c145682eqg.LIZ;
        }
        return null;
    }

    @Override // androidx.lifecycle.AbstractC0326p
    public ViewModelStore getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C145682eqg c145682eqg = (C145682eqg) getLastNonConfigurationInstance();
                if (c145682eqg != null) {
                    this.mViewModelStore = c145682eqg.LIZIZ;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new ViewModelStore();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C145682eqg c145682eqg;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (((c145682eqg = (C145682eqg) getLastNonConfigurationInstance()) == null || (viewModelStore = c145682eqg.LIZIZ) == null) && onRetainCustomNonConfigurationInstance == null)) {
            return null;
        }
        C145682eqg c145682eqg2 = new C145682eqg();
        c145682eqg2.LIZ = onRetainCustomNonConfigurationInstance;
        c145682eqg2.LIZIZ = viewModelStore;
        return c145682eqg2;
    }

    public ComponentActivity() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = C106164RrC.LIZ(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.ComponentActivity.1
            static {
                Covode.recordClassIndex(407);
            }

            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.super.onBackPressed();
            }
        });
        if (mo29786getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            mo29786getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.2
                static {
                    Covode.recordClassIndex(408);
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    Window window;
                    View peekDecorView;
                    if (event == Lifecycle.Event.ON_STOP && (window = ComponentActivity.this.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            });
            mo29786getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
                static {
                    Covode.recordClassIndex(409);
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().clear();
                    }
                }
            });
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT <= 23) {
                mo29786getLifecycle().addObserver(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }

    /* renamed from: androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m21213xa4b237d9(ComponentActivity componentActivity) {
        componentActivity.androidx_activity_ComponentActivity__onStop$___twin___();
        int i = Build.VERSION.SDK_INT;
        try {
            componentActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        m21214xcc721e34(this, bundle);
        this.mSavedStateRegistryController.LIZ(bundle);
        FragmentC106217Rs3.LIZ(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle mo29786getLifecycle = mo29786getLifecycle();
        if (mo29786getLifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) mo29786getLifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.LIZIZ(bundle);
    }

    /* renamed from: INVOKESPECIAL_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onCreate */
    public static void m21214xcc721e34(androidx.core.app.ComponentActivity componentActivity, Bundle bundle) {
        super.onCreate(bundle);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(componentActivity, componentActivity.getResources().getConfiguration());
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }
}
