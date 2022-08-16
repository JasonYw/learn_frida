package com.bytedance.android.live.core.tetris.layer.core.tetris;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.element.AbstractC4104d;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.p322a.AbstractC4094b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2LT;
import p003X.C2R9;
import p003X.C412502Ui;

/* loaded from: classes12.dex */
public abstract class Tetris<T extends AbstractC4092b> implements LifecycleOwner, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public C2R9 LIZLLL;

    /* renamed from: LJ */
    public T f26191LJ;
    public AbstractC4104d LJFF;
    public AbstractC4094b LJI;
    public C2LT LJII;
    public View LJIIIIZZ;
    public List<Element<?>> LIZJ = new ArrayList();
    public LifecycleRegistry LIZ = new LifecycleRegistry(this);

    static {
        Covode.recordClassIndex(23716);
    }

    public abstract View LIZ(C412502Ui c412502Ui);

    /* renamed from: LJ */
    public abstract void mo15269LJ();

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 28).isSupported) {
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

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public Lifecycle mo29786getLifecycle() {
        return this.LIZ;
    }

    public final T LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        T t = this.f26191LJ;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return t;
    }

    public final View LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View view = this.LJIIIIZZ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return view;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 20).isSupported) {
            return;
        }
        this.LIZ.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        mo15269LJ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 25).isSupported) {
            return;
        }
        this.LIZ.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 23).isSupported) {
            return;
        }
        this.LIZ.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22).isSupported) {
            return;
        }
        this.LIZ.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 21).isSupported) {
            return;
        }
        this.LIZ.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24).isSupported) {
            return;
        }
        this.LIZ.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroidx/lifecycle/ViewModel;>(Ljava/lang/Class<TT;>;)TT; */
    public final ViewModel LIZ(Class cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 26);
        if (proxy.isSupported) {
            return (ViewModel) proxy.result;
        }
        C106862S5w.LIZ(cls);
        AbstractC4094b abstractC4094b = this.LJI;
        if (abstractC4094b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4094b.LIZ(cls);
    }
}
