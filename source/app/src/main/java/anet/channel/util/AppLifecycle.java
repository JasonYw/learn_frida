package anet.channel.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p003X.C109391T5d;

/* loaded from: classes2.dex */
public class AppLifecycle {
    public static CopyOnWriteArraySet<AppLifecycleListener> listeners = new CopyOnWriteArraySet<>();
    public static volatile long lastEnterBackgroundTime = 0;
    public static volatile boolean isGoingForeground = false;
    public static Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: anet.channel.util.AppLifecycle.2
        static {
            Covode.recordClassIndex(2361);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            AppLifecycle.onForeground();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (GlobalAppRuntimeInfo.isAppBackground()) {
                AppLifecycle.isGoingForeground = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (GlobalAppRuntimeInfo.isAppBackground()) {
                AppLifecycle.isGoingForeground = true;
            }
        }
    };
    public static ComponentCallbacks2 mComponentCallbacks2 = new ComponentCallbacks2() { // from class: anet.channel.util.AppLifecycle.3
        static {
            Covode.recordClassIndex(2362);
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            ALog.m20785i("awcn.AppLifeCycle", "onTrimMemory", null, "level", Integer.valueOf(i));
            if (i == 20) {
                AppLifecycle.onBackground();
            }
        }
    };

    /* loaded from: classes10.dex */
    public interface AppLifecycleListener {
        static {
            Covode.recordClassIndex(2363);
        }

        void background();

        void forground();
    }

    public static void onBackground() {
        if (!GlobalAppRuntimeInfo.isAppBackground()) {
            GlobalAppRuntimeInfo.setBackground(true);
            lastEnterBackgroundTime = System.currentTimeMillis();
            notifyListener(false);
        }
    }

    public static void onForeground() {
        if (GlobalAppRuntimeInfo.isAppBackground()) {
            GlobalAppRuntimeInfo.setBackground(false);
            isGoingForeground = false;
            notifyListener(true);
        }
    }

    static {
        Covode.recordClassIndex(2359);
    }

    public static void initialize() {
        int i = Build.VERSION.SDK_INT;
        if (AwcnConfig.isAppLifeCycleListenerEnable()) {
            ((Application) GlobalAppRuntimeInfo.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks);
            GlobalAppRuntimeInfo.getContext().registerComponentCallbacks(mComponentCallbacks2);
        }
    }

    public static void registerLifecycleListener(AppLifecycleListener appLifecycleListener) {
        if (appLifecycleListener != null) {
            listeners.add(appLifecycleListener);
        }
    }

    public static void unregisterLifecycleListener(AppLifecycleListener appLifecycleListener) {
        listeners.remove(appLifecycleListener);
    }

    public static void notifyListener(final boolean z) {
        ALog.m20785i("awcn.AppLifeCycle", "notifyListener", null, C109391T5d.LJI, Boolean.valueOf(z));
        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.util.AppLifecycle.1
            static {
                Covode.recordClassIndex(2360);
            }

            @Override // java.lang.Runnable
            public final void run() {
                Iterator<AppLifecycleListener> it = AppLifecycle.listeners.iterator();
                while (it.hasNext()) {
                    AppLifecycleListener next = it.next();
                    try {
                        if (z) {
                            next.forground();
                        } else {
                            next.background();
                        }
                    } catch (Exception e) {
                        ALog.m20787e("awcn.AppLifeCycle", "notifyListener exception.", null, e, new Object[0]);
                    }
                }
            }
        });
    }
}
