package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.collection.SparseArrayCompat;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.loader.p019a.AbstractC0327a;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p002O.C0002O;
import p003X.AbstractC109833TMd;
import p003X.AbstractC142821e6R;
import p003X.AbstractC142822e6S;
import p003X.C140181dPd;
import p003X.C145681eqf;
import p003X.C387041Uk;
import p003X.G4H;
import p003X.GFI;

/* loaded from: classes19.dex */
public class FragmentActivity extends ComponentActivity implements G4H, AbstractC142822e6S {
    public boolean mCreated;
    public int mNextCandidateRequestIndex;
    public SparseArrayCompat<String> mPendingFragmentActivityResults;
    public boolean mRequestedPermissionsFromFragment;
    public boolean mResumed;
    public boolean mStartedActivityFromFragment;
    public boolean mStartedIntentSenderFromFragment;
    public final FragmentController mFragments = FragmentController.createController(new C145681eqf(this));
    public final LifecycleRegistry mFragmentLifecycleRegistry = new LifecycleRegistry(this);
    public boolean mStopped = true;

    static {
        Covode.recordClassIndex(1260);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        m21165x4bbe6c9d(this);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        m21161x340834e9(this, intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        m21160x340834e9(this, intent, i, bundle);
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    public AbstractC0327a getSupportLoaderManager() {
        return AbstractC0327a.LIZ(this);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    public FragmentActivity() {
    }

    public void androidx_fragment_app_FragmentActivity__onStop$___twin___() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.noteStateNotSaved();
        this.mFragments.execPendingActions();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.noteStateNotSaved();
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.mFragments.dispatchStart();
    }

    public void setEnterSharedElementCallback(AbstractC109833TMd abstractC109833TMd) {
        ActivityCompat.setEnterSharedElementCallback(this, abstractC109833TMd);
    }

    public void setExitSharedElementCallback(AbstractC109833TMd abstractC109833TMd) {
        ActivityCompat.setExitSharedElementCallback(this, abstractC109833TMd);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.dispatchMultiWindowModeChanged(z);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.dispatchPictureInPictureModeChanged(z);
    }

    public static void checkForValidRequestCode(int i) {
        if ((i & (-65536)) == 0) {
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        m21169x6b7a9656(this, configuration);
        this.mFragments.noteStateNotSaved();
        this.mFragments.dispatchConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.noteStateNotSaved();
    }

    @Override // p003X.AbstractC142822e6S
    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    /* renamed from: androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m21165x4bbe6c9d(FragmentActivity fragmentActivity) {
        fragmentActivity.androidx_fragment_app_FragmentActivity__onStop$___twin___();
        int i = Build.VERSION.SDK_INT;
        try {
            fragmentActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    public FragmentActivity(int i) {
        super(i);
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.size() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.mPendingFragmentActivityResults.indexOfKey(this.mNextCandidateRequestIndex) >= 0) {
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
        }
        int i = this.mNextCandidateRequestIndex;
        this.mPendingFragmentActivityResults.put(i, fragment.mWho);
        this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
        return i;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mFragments.attachHost(null);
        if (bundle != null) {
            this.mFragments.restoreSaveState(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                    this.mPendingFragmentActivityResults = new SparseArrayCompat<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.put(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new SparseArrayCompat<>();
            this.mNextCandidateRequestIndex = 0;
        }
        m21168xb0e88474(this, bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        Parcelable saveAllState = this.mFragments.saveAllState();
        if (saveAllState != null) {
            bundle.putParcelable("android:support:fragments", saveAllState);
        }
        if (this.mPendingFragmentActivityResults.size() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.size()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.size()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.size(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.keyAt(i);
                strArr[i] = this.mPendingFragmentActivityResults.valueAt(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: androidx_fragment_app_FragmentActivity__startActivityForResult$___twin___ */
    public void m21167x4bfa1731(Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.dispatchOptionsMenuClosed(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* renamed from: INVOKESPECIAL_androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onConfigurationChanged */
    public static void m21169x6b7a9656(ComponentActivity componentActivity, Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(componentActivity, configuration);
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }

    /* renamed from: INVOKESPECIAL_androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onCreate */
    public static void m21168xb0e88474(ComponentActivity componentActivity, Bundle bundle) {
        super.onCreate(bundle);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(componentActivity, componentActivity.getResources().getConfiguration());
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.mFragments.dispatchContextItemSelected(menuItem);
        }
        return this.mFragments.dispatchOptionsItemSelected(menuItem);
    }

    public static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.mo29786getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    z = true;
                }
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
            }
        }
        return z;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    /* renamed from: androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_splash_hook_JumpMarketLancet_startActivityForResult */
    public static void m21163x1e0039f(FragmentActivity fragmentActivity, Intent intent, int i) {
        if (C387041Uk.LIZ(intent)) {
            return;
        }
        fragmentActivity.m21167x4bfa1731(intent, i);
    }

    /* renamed from: androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_splash_hook_StartLaunchActivityLancet_startActivityForResult */
    public static void m21161x340834e9(FragmentActivity fragmentActivity, Intent intent, int i) {
        GFI.LIZIZ(intent);
        GFI.LIZ(intent);
        m21163x1e0039f(fragmentActivity, intent, i);
    }

    /* renamed from: androidx_fragment_app_FragmentActivity__startActivityForResult$___twin___ */
    public void m21166x4bfa1731(Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.dispatchPrepareOptionsMenu(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment findFragmentByWho;
        this.mFragments.noteStateNotSaved();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = this.mPendingFragmentActivityResults.get(i4);
            this.mPendingFragmentActivityResults.remove(i4);
            if (str != null && (findFragmentByWho = this.mFragments.findFragmentByWho(str)) != null) {
                findFragmentByWho.onActivityResult(i & 65535, i2, intent);
                return;
            }
            return;
        }
        AbstractC142821e6R permissionCompatDelegate = ActivityCompat.getPermissionCompatDelegate();
        if (permissionCompatDelegate != null && permissionCompatDelegate.LIZIZ()) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, p003X.G4H
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Fragment findFragmentByWho;
        this.mFragments.noteStateNotSaved();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = this.mPendingFragmentActivityResults.get(i3);
            this.mPendingFragmentActivityResults.remove(i3);
            if (str != null && (findFragmentByWho = this.mFragments.findFragmentByWho(str)) != null) {
                findFragmentByWho.onRequestPermissionsResult(i & 65535, strArr, iArr);
            }
        }
    }

    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            ActivityCompat.requestPermissions(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            ActivityCompat.requestPermissions(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    /* renamed from: androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_startActivityForResult */
    public static void m21164xe8ec9322(FragmentActivity fragmentActivity, Intent intent, int i, Bundle bundle) {
        C140181dPd.LIZJ();
        fragmentActivity.m21166x4bfa1731(intent, i, bundle);
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    /* renamed from: androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_splash_hook_JumpMarketLancet_startActivityForResult */
    public static void m21162x1e0039f(FragmentActivity fragmentActivity, Intent intent, int i, Bundle bundle) {
        if (C387041Uk.LIZ(intent)) {
            return;
        }
        m21164xe8ec9322(fragmentActivity, intent, i, bundle);
    }

    /* renamed from: androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_splash_hook_StartLaunchActivityLancet_startActivityForResult */
    public static void m21160x340834e9(FragmentActivity fragmentActivity, Intent intent, int i, Bundle bundle) {
        GFI.LIZIZ(intent);
        GFI.LIZ(intent);
        m21162x1e0039f(fragmentActivity, intent, i, bundle);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        try {
            if (i == -1) {
                ActivityCompat.startActivityForResult(this, intent, -1, bundle);
                return;
            }
            checkForValidRequestCode(i);
            ActivityCompat.startActivityForResult(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
        } finally {
            this.mStartedActivityFromFragment = false;
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        new StringBuilder();
        String m25086C = C0002O.m25086C(str, "  ");
        printWriter.print(m25086C);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC0327a.LIZ(this).LIZ(m25086C, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.mStartedIntentSenderFromFragment = true;
        try {
            if (i == -1) {
                ActivityCompat.startIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
                return;
            }
            checkForValidRequestCode(i);
            ActivityCompat.startIntentSenderForResult(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), intent, i2, i3, i4, bundle);
        } finally {
            this.mStartedIntentSenderFromFragment = false;
        }
    }
}
