package com.bytedance.android.live.core.tetris.layer.core.delegate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.p322a.AbstractC4094b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2QT;

/* loaded from: classes12.dex */
public abstract class LayerDelegate<T extends AbstractC4093a, C extends AbstractC4092b> implements LifecycleOwner, AbstractC4094b, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public T LIZJ;
    public AbstractC4094b LIZLLL;

    /* renamed from: LJ */
    public C f26186LJ;
    public final Map<C4100c, Element<?>> LJFF = new LinkedHashMap();
    public final Set<C2QT<AbstractC4092b>> LJI = new LinkedHashSet();
    public LifecycleRegistry LJII = new LifecycleRegistry(this);

    static {
        Covode.recordClassIndex(23651);
    }

    public abstract void LIZ(Element<?> element);

    public abstract void LIZIZ(Element<?> element);

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 22).isSupported) {
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
        return this.LJII;
    }

    public final void LIZ(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(t);
        this.LIZJ = t;
    }

    public final T LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        T t = this.LIZJ;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return t;
    }

    public final C LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5);
        if (proxy.isSupported) {
            return (C) proxy.result;
        }
        C c = this.f26186LJ;
        if (c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported) {
            return;
        }
        this.LJII.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 19).isSupported) {
            return;
        }
        this.LJII.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 17).isSupported) {
            return;
        }
        this.LJII.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported) {
            return;
        }
        this.LJII.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 15).isSupported) {
            return;
        }
        this.LJII.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 18).isSupported) {
            return;
        }
        this.LJII.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public final void LIZJ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        this.LJFF.put(element.LIZLLL, element);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroidx/lifecycle/ViewModel;>(Ljava/lang/Class<TT;>;)TT; */
    @Override // com.bytedance.android.live.core.tetris.layer.core.p322a.AbstractC4094b
    public final ViewModel LIZ(Class cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 21);
        if (proxy.isSupported) {
            return (ViewModel) proxy.result;
        }
        C106862S5w.LIZ(cls);
        AbstractC4094b abstractC4094b = this.LIZLLL;
        if (abstractC4094b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4094b.LIZ(cls);
    }

    public void LIZLLL(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        if (this.LJFF.containsKey(element.LIZLLL)) {
            mo29786getLifecycle().addObserver(element);
            LIZ(element);
        }
    }

    /* renamed from: LJ */
    public void mo15791LJ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        mo29786getLifecycle().removeObserver(element);
        element.LIZ();
        LIZIZ(element);
    }

    public final Element<?> LIZ(C4100c c4100c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4100c}, this, LIZIZ, false, 8);
        if (proxy.isSupported) {
            return (Element) proxy.result;
        }
        C106862S5w.LIZ(c4100c);
        return this.LJFF.get(c4100c);
    }

    public final void LIZIZ(C4100c c4100c) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{c4100c}, this, LIZIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4100c);
        if (this.LJFF.containsKey(c4100c)) {
            Element<?> LIZ = LIZ(c4100c);
            Intrinsics.checkNotNull(LIZ);
            mo15791LJ(LIZ);
            this.LJFF.remove(c4100c);
            Iterator<T> it = this.LJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C2QT c2qt = (C2QT) obj;
                    C c = this.f26186LJ;
                    if (c == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    if (Intrinsics.areEqual(c2qt.LIZJ(c), c4100c)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                this.LJI.remove(obj);
            }
        }
    }

    public final void LIZ(C2QT<AbstractC4092b> c2qt) {
        if (PatchProxy.proxy(new Object[]{c2qt}, this, LIZIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2qt);
        this.LJI.add(c2qt);
    }

    public final void LIZ(C c) {
        if (PatchProxy.proxy(new Object[]{c}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c);
        this.f26186LJ = c;
    }

    public final void LIZ(AbstractC4094b abstractC4094b) {
        if (PatchProxy.proxy(new Object[]{abstractC4094b}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4094b);
        this.LIZLLL = abstractC4094b;
    }

    public final <T> T LIZ(C4100c c4100c, Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4100c, cls}, this, LIZIZ, false, 20);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(c4100c, cls);
        T t = this.LIZJ;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Element<?> LIZ = t.LIZ(c4100c);
        if (LIZ != null) {
            return (T) LIZ.LIZ(cls);
        }
        return null;
    }
}
