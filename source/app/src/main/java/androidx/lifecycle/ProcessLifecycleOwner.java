package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC106219Rs5;
import p003X.C115760Vha;
import p003X.FragmentC106217Rs3;

/* loaded from: classes19.dex */
public class ProcessLifecycleOwner implements LifecycleOwner {
    public static final ProcessLifecycleOwner sInstance = new ProcessLifecycleOwner();
    public Handler mHandler;
    public int mResumedCounter;
    public int mStartedCounter;
    public boolean mPauseSent = true;
    public boolean mStopSent = true;
    public final LifecycleRegistry mRegistry = new LifecycleRegistry(this);
    public Runnable mDelayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.ProcessLifecycleOwner.1
        static {
            Covode.recordClassIndex(1377);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.this.dispatchPauseIfNeeded();
            ProcessLifecycleOwner.this.dispatchStopIfNeeded();
        }
    };
    public AbstractC106219Rs5 mInitializationListener = new AbstractC106219Rs5() { // from class: androidx.lifecycle.ProcessLifecycleOwner.2
        static {
            Covode.recordClassIndex(1378);
        }

        @Override // p003X.AbstractC106219Rs5
        public final void LIZ() {
            ProcessLifecycleOwner.this.activityStarted();
        }

        @Override // p003X.AbstractC106219Rs5
        public final void LIZIZ() {
            ProcessLifecycleOwner.this.activityResumed();
        }
    };

    public static LifecycleOwner get() {
        return sInstance;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public Lifecycle mo29786getLifecycle() {
        return this.mRegistry;
    }

    static {
        Covode.recordClassIndex(1376);
    }

    public void activityStopped() {
        this.mStartedCounter--;
        dispatchStopIfNeeded();
    }

    public void dispatchPauseIfNeeded() {
        if (this.mResumedCounter == 0) {
            this.mPauseSent = true;
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public void activityPaused() {
        this.mResumedCounter--;
        if (this.mResumedCounter == 0) {
            this.mHandler.postDelayed(this.mDelayedPauseRunnable, 700L);
        }
    }

    public void activityStarted() {
        this.mStartedCounter++;
        if (this.mStartedCounter == 1 && this.mStopSent) {
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.mStopSent = false;
        }
    }

    public void dispatchStopIfNeeded() {
        if (this.mStartedCounter == 0 && this.mPauseSent) {
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.mStopSent = true;
        }
    }

    public void activityResumed() {
        this.mResumedCounter++;
        if (this.mResumedCounter == 1) {
            if (this.mPauseSent) {
                this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.mPauseSent = false;
                return;
            }
            this.mHandler.removeCallbacks(this.mDelayedPauseRunnable);
        }
    }

    public static void init(Context context) {
        sInstance.attach(context);
    }

    public void attach(Context context) {
        this.mHandler = new Handler();
        this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C115760Vha() { // from class: androidx.lifecycle.ProcessLifecycleOwner.3
            static {
                Covode.recordClassIndex(1379);
            }

            @Override // p003X.C115760Vha, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                ProcessLifecycleOwner.this.activityPaused();
            }

            @Override // p003X.C115760Vha, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                ProcessLifecycleOwner.this.activityStopped();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                activity.registerActivityLifecycleCallbacks(new C115760Vha() { // from class: androidx.lifecycle.ProcessLifecycleOwner.3.1
                    static {
                        Covode.recordClassIndex(1380);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostResumed(Activity activity2) {
                        ProcessLifecycleOwner.this.activityResumed();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostStarted(Activity activity2) {
                        ProcessLifecycleOwner.this.activityStarted();
                    }
                });
            }

            @Override // p003X.C115760Vha, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT < 29) {
                    ((FragmentC106217Rs3) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).LIZ = ProcessLifecycleOwner.this.mInitializationListener;
                }
            }
        });
    }
}
