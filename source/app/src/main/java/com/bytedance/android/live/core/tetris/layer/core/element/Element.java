package com.bytedance.android.live.core.tetris.layer.core.element;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a;
import com.bytedance.android.live.core.tetris.layer.core.event.LayerEventDispatcher;
import com.bytedance.android.live.core.tetris.layer.core.event.p324a.AbstractC4107d;
import com.bytedance.android.live.core.tetris.layer.core.p323d.AbstractC4097a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC410082La;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2LT;
import p003X.C2LZ;
import p003X.C411572Qt;
import p003X.C65524BtG;

/* loaded from: classes12.dex */
public abstract class Element<Content> implements LifecycleOwner, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public View LIZJ;

    /* renamed from: LJ */
    public LayerEventDispatcher f26187LJ;
    public C2LT LJFF;
    public final AbstractC4092b LJII;
    public Content LJIIIIZZ;
    public boolean LIZIZ = true;
    public C4100c LIZLLL = C4100c.LIZIZ;
    public LifecycleRegistry LJI = new LifecycleRegistry(this);

    static {
        Covode.recordClassIndex(23672);
    }

    public abstract View LIZ(Context context, ViewGroup viewGroup);

    public abstract void LIZ(View view);

    public void LIZIZ() {
    }

    public abstract AbstractC4106a LIZJ();

    public abstract Content LIZLLL();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 16).isSupported) {
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
        return this.LJI;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJI.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJI.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJI.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJI.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        this.LJI.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    /* renamed from: LJ */
    public final AbstractC4097a m15789LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (AbstractC4097a) proxy.result;
        }
        View view = this.LIZJ;
        if (view == null) {
            return null;
        }
        Intrinsics.checkNotNull(view);
        return new C411572Qt(view);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZIZ();
        int i = C65524BtG.LIZ[mo29786getLifecycle().getCurrentState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        onPause();
                        onStop();
                        onDestroy();
                    }
                } else {
                    onStop();
                    onDestroy();
                }
            } else {
                onDestroy();
            }
        }
        LayerEventDispatcher layerEventDispatcher = this.f26187LJ;
        if (layerEventDispatcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        layerEventDispatcher.LIZ((Element<?>) this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJI.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        LIZ(this.LIZJ);
        this.LJIIIIZZ = LIZLLL();
        LayerEventDispatcher layerEventDispatcher = this.f26187LJ;
        if (layerEventDispatcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{this}, layerEventDispatcher, LayerEventDispatcher.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(this);
            layerEventDispatcher.LIZ(LIZJ());
        }
        Content content = this.LJIIIIZZ;
        if (content != null && (content instanceof AbstractC4107d)) {
            Iterator<T> it = ((AbstractC4107d) content).LIZ().iterator();
            while (it.hasNext()) {
                AbstractC410082La abstractC410082La = (AbstractC410082La) it.next();
                C2LT c2lt = this.LJFF;
                if (c2lt == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                C2LZ LIZ2 = c2lt.LIZ(abstractC410082La.LIZ());
                if (LIZ2 != null) {
                    LIZ2.LIZ(abstractC410082La);
                }
            }
        }
    }

    public Element(AbstractC4092b abstractC4092b) {
        C106862S5w.LIZ(abstractC4092b);
        this.LJII = abstractC4092b;
    }

    public final void LIZ(C4100c c4100c) {
        if (PatchProxy.proxy(new Object[]{c4100c}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4100c);
        this.LIZLLL = c4100c;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, Content, java.lang.Object] */
    public final <T> T LIZ(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(cls);
        Content content = this.LJIIIIZZ;
        if (content == 0 || !cls.isAssignableFrom(content.getClass())) {
            return null;
        }
        return content;
    }
}
