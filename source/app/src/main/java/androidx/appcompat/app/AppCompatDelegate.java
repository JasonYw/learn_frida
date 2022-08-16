package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p003X.AbstractC138442cxa;
import p003X.AbstractC138451cxj;
import p003X.AbstractC138457cxp;
import p003X.AbstractC138468cy0;
import p003X.C5LA;
import p003X.G4E;

/* loaded from: classes17.dex */
public abstract class AppCompatDelegate {
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final ArraySet<WeakReference<AppCompatDelegate>> sActivityDelegates;
    public static final Object sActivityDelegatesLock;
    public static int sDefaultNightMode;

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyDayNight();

    public void attachBaseContext(Context context) {
    }

    public abstract View createView(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T findViewById(int i);

    public abstract C5LA getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    public abstract AbstractC138457cxp getSupportActionBar();

    public abstract boolean hasWindowFeature(int i);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z);

    public abstract void setLocalNightMode(int i);

    public abstract void setSupportActionBar(Toolbar toolbar);

    public void setTheme(int i) {
    }

    public abstract void setTitle(CharSequence charSequence);

    public abstract AbstractC138442cxa startSupportActionMode(AbstractC138451cxj abstractC138451cxj);

    public static int getDefaultNightMode() {
        return sDefaultNightMode;
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return G4E.LIZIZ();
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(457);
        sDefaultNightMode = -100;
        sActivityDelegates = new ArraySet<>();
        sActivityDelegatesLock = new Object();
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(457);
        sDefaultNightMode = -100;
        sActivityDelegates = new ArraySet<>();
        sActivityDelegatesLock = new Object();
    }

    public static void applyDayNightToActiveDelegates() {
        synchronized (sActivityDelegatesLock) {
            Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.applyDayNight();
                }
            }
        }
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        G4E.LIZ = z;
    }

    public Context attachBaseContext2(Context context) {
        attachBaseContext(context);
        return context;
    }

    public static void removeActivityDelegate(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
        }
    }

    public static void addActiveDelegate(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
            sActivityDelegates.add(new WeakReference<>(appCompatDelegate));
        }
    }

    public static void setDefaultNightMode(int i) {
        if ((i != -1 && i != 0 && i != 1 && i != 2 && i != 3) || sDefaultNightMode == i) {
            return;
        }
        sDefaultNightMode = i;
        applyDayNightToActiveDelegates();
    }

    public static void removeDelegateFromActives(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static AppCompatDelegate create(Activity activity, AbstractC138468cy0 abstractC138468cy0) {
        return new AppCompatDelegateImpl(activity, abstractC138468cy0);
    }

    public static AppCompatDelegate create(Dialog dialog, AbstractC138468cy0 abstractC138468cy0) {
        return new AppCompatDelegateImpl(dialog, abstractC138468cy0);
    }

    public static AppCompatDelegate create(Context context, Activity activity, AbstractC138468cy0 abstractC138468cy0) {
        return new AppCompatDelegateImpl(context, activity, abstractC138468cy0);
    }

    public static AppCompatDelegate create(Context context, Window window, AbstractC138468cy0 abstractC138468cy0) {
        return new AppCompatDelegateImpl(context, window, abstractC138468cy0);
    }
}
