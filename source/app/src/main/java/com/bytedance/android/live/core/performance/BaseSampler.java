package com.bytedance.android.live.core.performance;

import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import p003X.LOG;

/* loaded from: classes5.dex */
public abstract class BaseSampler<T> implements Runnable, Runnable {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public Handler LIZJ;
    public WeakReference<Context> LIZLLL;

    /* renamed from: LJ */
    public LOG f26174LJ;
    public ArrayList<T> LJFF = new ArrayList<>();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event != Lifecycle.Event.ON_DESTROY) {
        } else {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    static {
        Covode.recordClassIndex(23525);
        BaseSampler.class.getClass().getSimpleName();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        LIZ();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacks(this);
            this.LIZJ = null;
        }
        LOG log = this.f26174LJ;
        if (log != null) {
            log.LIZ();
            this.f26174LJ = null;
        }
    }

    public final void LIZ(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJFF.add(t);
    }

    public void LIZ(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZ, false, 4).isSupported) {
            return;
        }
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacks(this);
            this.LIZJ = null;
        }
        LOG log = this.f26174LJ;
        if (log != null) {
            log.LIZ(this.LJFF, hashMap);
            this.f26174LJ = null;
        }
    }

    public BaseSampler(int i, int i2) {
        this.LIZIZ = i;
    }

    public final void LIZ(Handler handler, Context context, LOG log) {
        if (PatchProxy.proxy(new Object[]{handler, context, log}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZJ = handler;
        this.LIZLLL = new WeakReference<>(context);
        this.f26174LJ = log;
        Handler handler2 = this.LIZJ;
        if (handler2 != null) {
            handler2.post(this);
        }
    }
}
