package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.p1594ss.android.ugc.aweme.young.reputation.utils.VolumeChangeObserver;
import p003X.AbstractC138442cxa;
import p003X.AbstractC138451cxj;
import p003X.AbstractC138457cxp;
import p003X.AbstractC138468cy0;
import p003X.AbstractC63283AyD;
import p003X.AbstractC74789FeJ;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C126472Zpy;
import p003X.C1RK;
import p003X.C5LA;
import p003X.C69134DOu;
import p003X.C74776Fe6;
import p003X.C74788FeI;
import p003X.G4E;

/* loaded from: classes17.dex */
public class AppCompatActivity extends FragmentActivity implements AbstractC138468cy0, AbstractC74789FeJ {
    public AppCompatDelegate mDelegate;
    public Resources mResources;

    static {
        Covode.recordClassIndex(456);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m21204xd9228fcb(this, keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m21206x1675fa7a(this);
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(C74788FeI c74788FeI) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        m21207x14585fa9(this);
    }

    @Override // p003X.AbstractC138468cy0
    public void onSupportActionModeFinished(AbstractC138442cxa abstractC138442cxa) {
    }

    @Override // p003X.AbstractC138468cy0
    public void onSupportActionModeStarted(AbstractC138442cxa abstractC138442cxa) {
    }

    public void onSupportContentChanged() {
    }

    @Override // p003X.AbstractC138468cy0
    public AbstractC138442cxa onWindowStartingSupportActionMode(AbstractC138451cxj abstractC138451cxj) {
        return null;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m21205x830efbac(this, i);
    }

    public void setSupportProgress(int i) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    public AppCompatActivity() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // p003X.AbstractC74789FeJ
    public Intent getSupportParentActivityIntent() {
        return C74776Fe6.LIZ(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    public void androidx_appcompat_app_AppCompatActivity__onStop$___twin___() {
        super.onStop();
        getDelegate().onStop();
    }

    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.create(this, this);
        }
        return this.mDelegate;
    }

    public C5LA getDrawerToggleDelegate() {
        return getDelegate().getDrawerToggleDelegate();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().getMenuInflater();
    }

    public AbstractC138457cxp getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().onStart();
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity__getResources$___twin___ */
    public Resources m21209x9d6f362b() {
        if (this.mResources == null && G4E.LIZ()) {
            this.mResources = new G4E(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo21650LJ()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.LIZLLL()) {
                super.openOptionsMenu();
            }
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C74788FeI c74788FeI = new C74788FeI(this);
            onCreateSupportNavigateUpTaskStack(c74788FeI);
            onPrepareSupportNavigateUpTaskStack(c74788FeI);
            if (!c74788FeI.LIZ.isEmpty()) {
                Intent[] intentArr = (Intent[]) c74788FeI.LIZ.toArray(new Intent[c74788FeI.LIZ.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!ContextCompat.startActivities(c74788FeI.LIZIZ, intentArr, null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    C116971W2r.LIZ(c74788FeI.LIZIZ, intent);
                }
                try {
                    ActivityCompat.finishAffinity(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        supportNavigateUpTo(supportParentActivityIntent);
        return true;
    }

    public AppCompatActivity(int i) {
        super(i);
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity__setContentView$___twin___ */
    public void m21208x9c2f2fe(int i) {
        getDelegate().setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        getDelegate().setContentView(view);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().setSupportActionBar(toolbar);
    }

    public void supportNavigateUpTo(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        navigateUpTo(intent);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().attachBaseContext2(context));
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().findViewById(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        AppCompatDelegate delegate = getDelegate();
        delegate.installViewFactory();
        delegate.onCreate(bundle);
        m21211x50524b68(this, bundle);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().onPostCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().setTheme(i);
    }

    public AbstractC138442cxa startSupportActionMode(AbstractC138451cxj abstractC138451cxj) {
        return getDelegate().startSupportActionMode(abstractC138451cxj);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().requestWindowFeature(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        return shouldUpRecreateTask(intent);
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m21207x14585fa9(AppCompatActivity appCompatActivity) {
        appCompatActivity.androidx_appcompat_app_AppCompatActivity__onStop$___twin___();
        int i = Build.VERSION.SDK_INT;
        try {
            appCompatActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity__dispatchKeyEvent$___twin___ */
    public boolean m21210x8566ccc5(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.LIZ(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        m21212xb873224a(this, configuration);
        if (this.mResources != null) {
            C116971W2r.LIZ(this.mResources, configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().onConfigurationChanged(configuration);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public void onCreateSupportNavigateUpTaskStack(C74788FeI c74788FeI) {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null || (supportParentActivityIntent = C74776Fe6.LIZ(this)) != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(c74788FeI.LIZIZ.getPackageManager());
            }
            c74788FeI.LIZ(component);
            c74788FeI.LIZ.add(supportParentActivityIntent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
        if (r0 != null) goto L41;
     */
    /* renamed from: androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.Resources m21206x1675fa7a(androidx.appcompat.app.AppCompatActivity r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.m21206x1675fa7a(androidx.appcompat.app.AppCompatActivity):android.content.res.Resources");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().addContentView(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().setTitle(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().setContentView(view, layoutParams);
    }

    /* renamed from: INVOKESPECIAL_androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onConfigurationChanged */
    public static void m21212xb873224a(FragmentActivity fragmentActivity, Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(fragmentActivity, configuration);
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }

    /* renamed from: INVOKESPECIAL_androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_pad_PadLancet_onCreate */
    public static void m21211x50524b68(FragmentActivity fragmentActivity, Bundle bundle) {
        super.onCreate(bundle);
        try {
            PadCommonServiceImpl.LIZ(false).LIZ(fragmentActivity, fragmentActivity.getResources().getConfiguration());
        } catch (ClassCastException unused) {
            ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
        }
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ViewInflateLancet_setContentView */
    public static void m21205x830efbac(AppCompatActivity appCompatActivity, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        appCompatActivity.m21208x9c2f2fe(i);
        C1RK.LIZ("set", i, SystemClock.elapsedRealtime() - elapsedRealtime, appCompatActivity);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.LIZ() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_young_reputation_global_MuteLancet_dispatchKeyEvent */
    public static boolean m21204xd9228fcb(AppCompatActivity appCompatActivity, KeyEvent keyEvent) {
        C106862S5w.LIZ(keyEvent);
        if (keyEvent.getKeyCode() == 25 || keyEvent.getKeyCode() == 24) {
            C69134DOu c69134DOu = C69134DOu.LJIILJJIL;
            if (!PatchProxy.proxy(new Object[0], c69134DOu, C69134DOu.LIZ, false, 24).isSupported && C126472Zpy.LIZIZ.LIZ() && C69134DOu.LIZJ) {
                ALog.m8953i("mute_open_douyin", "receive volume change action, callbackVolumeKeyClick");
                VolumeChangeObserver LIZJ = c69134DOu.LIZJ();
                if (LIZJ != null && !PatchProxy.proxy(new Object[0], LIZJ, VolumeChangeObserver.LIZ, false, 8).isSupported) {
                    int LIZJ2 = LIZJ.LIZJ();
                    AbstractC63283AyD abstractC63283AyD = LIZJ.LIZIZ;
                    if (abstractC63283AyD != null) {
                        abstractC63283AyD.LIZ(LIZJ2);
                    }
                }
            }
        }
        Boolean valueOf = Boolean.valueOf(appCompatActivity.m21210x8566ccc5(keyEvent));
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }
}
