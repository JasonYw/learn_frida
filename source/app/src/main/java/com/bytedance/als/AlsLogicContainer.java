package com.bytedance.als;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.als.p194a.C2539f;
import com.bytedance.als.p195b.AbstractC2542a;
import com.bytedance.als.p196ui.Visibility;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.objectcontainer.C13805g;
import com.bytedance.objectcontainer.C13808o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC105709Rjr;
import p003X.AbstractC106099Rq9;
import p003X.AbstractC4569445g;
import p003X.C106097Rq7;
import p003X.C106862S5w;
import p003X.C65530BtM;
import p003X.NY6;
import p003X.RO3;
import p003X.RO4;

/* loaded from: classes9.dex */
public final class AlsLogicContainer implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final Lifecycle LIZIZ;

    /* renamed from: LJ */
    public boolean f25598LJ;
    public boolean LJFF;
    public final C13808o LJI;
    public C13805g LJII;
    public final C2541b LJIIIIZZ;
    public C13805g LJIIJJI;
    public final C2539f LJIIL;
    public final List<C2544e> LIZJ = new ArrayList();
    public final ArrayList<NY6<?>> LJIIIZ = new ArrayList<>();
    public final HashMap<Class<?>, NY6<?>> LIZLLL = new HashMap<>();
    public final RO4 LJIIJ = new RO3(this);

    static {
        Covode.recordClassIndex(10025);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 17).isSupported) {
            return;
        }
        if (event == Lifecycle.Event.ON_CREATE) {
            onActivityCreated();
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
            onDestroyView();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onActivityCreated() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.f25598LJ = true;
        for (NY6<?> ny6 : CollectionsKt___CollectionsKt.toList(this.LJIIIZ)) {
            LIZ(ny6, Lifecycle.State.CREATED);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        for (NY6<?> ny6 : CollectionsKt___CollectionsKt.toList(this.LJIIIZ)) {
            LIZ(ny6, Lifecycle.State.DESTROYED);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        for (NY6<?> ny6 : CollectionsKt___CollectionsKt.toList(this.LJIIIZ)) {
            LIZ(ny6, Lifecycle.State.STARTED);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        for (NY6<?> ny6 : CollectionsKt___CollectionsKt.toList(this.LJIIIZ)) {
            LIZ(ny6, Lifecycle.State.RESUMED);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        for (NY6<?> ny6 : CollectionsKt___CollectionsKt.toList(this.LJIIIZ)) {
            LIZ(ny6, Lifecycle.State.STARTED);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        for (NY6<?> ny6 : CollectionsKt___CollectionsKt.toList(this.LJIIIZ)) {
            LIZ(ny6, Lifecycle.State.CREATED);
        }
    }

    public final void LIZ(NY6<?> ny6) {
        if (PatchProxy.proxy(new Object[]{ny6}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(ny6);
        if (this.LIZIZ.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (!this.LJIIIZ.contains(ny6)) {
            this.LJIIIZ.add(ny6);
            if ((!Intrinsics.areEqual(ny6.iY_(), AbstractC2543c.class)) && !(ny6.iY_() instanceof AbstractC2545i) && !(ny6 instanceof AbstractC2542a)) {
                this.LJIIIIZZ.LIZ((C2541b) ny6.iY_());
            }
            if (!Intrinsics.areEqual(ny6.iY_().getClass(), AbstractC2543c.class)) {
                this.LIZLLL.put(ny6.iY_().getClass(), ny6);
                LIZ(ny6.iY_().getClass(), ny6);
            }
            if (this.LIZIZ.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                this.LJFF = true;
                ny6.cJ_();
                if (this.LIZIZ.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    ny6.cI_();
                    if (this.LIZIZ.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                        ny6.cM_();
                    }
                }
                this.LJFF = false;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LogicComponent already exists");
    }

    public final <A extends AbstractC2543c, B extends NY6<A>> void LIZ(Class<A> cls, final Class<B> cls2) {
        if (PatchProxy.proxy(new Object[]{cls, cls2}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, cls2);
        if (!Intrinsics.areEqual(cls, AbstractC2543c.class)) {
            C106097Rq7<?> LIZ2 = this.LJI.LIZ(cls, new AbstractC106099Rq9<A>() { // from class: X.6zm
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(10026);
                }

                @Override // p003X.AbstractC106099Rq9
                public final /* synthetic */ Object LIZ(C13805g c13805g) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c13805g}, this, LIZ, false, 1);
                    if (proxy.isSupported) {
                        return proxy.result;
                    }
                    C106862S5w.LIZ(c13805g);
                    return ((NY6) c13805g.LIZ(cls2)).iY_();
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(LIZ2, "");
            LIZ((Class<?>) cls, LIZ2);
        }
    }

    private final void LIZ(Class<?> cls, NY6<?> ny6) {
        if (PatchProxy.proxy(new Object[]{cls, ny6}, this, LIZ, false, 9).isSupported) {
            return;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkExpressionValueIsNotNull(interfaces, "");
        for (Class<?> cls2 : interfaces) {
            if ((!Intrinsics.areEqual(cls2, AbstractC2543c.class)) && AbstractC2543c.class.isAssignableFrom(cls2)) {
                HashMap<Class<?>, NY6<?>> hashMap = this.LIZLLL;
                Intrinsics.checkExpressionValueIsNotNull(cls2, "");
                hashMap.put(cls2, ny6);
                LIZ(cls2, ny6);
            }
        }
    }

    private final void LIZ(Class<?> cls, C106097Rq7<?> c106097Rq7) {
        if (PatchProxy.proxy(new Object[]{cls, c106097Rq7}, this, LIZ, false, 6).isSupported) {
            return;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkExpressionValueIsNotNull(interfaces, "");
        for (Class<?> cls2 : interfaces) {
            if ((!Intrinsics.areEqual(cls2, AbstractC2543c.class)) && AbstractC2543c.class.isAssignableFrom(cls2)) {
                Class[] clsArr = new Class[1];
                if (cls2 != null) {
                    clsArr[0] = cls2;
                    c106097Rq7.LIZ(clsArr);
                    LIZ(cls2, c106097Rq7);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                }
            }
        }
    }

    private final void LIZ(NY6<?> ny6, Lifecycle.State state) {
        if (PatchProxy.proxy(new Object[]{ny6, state}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJFF = true;
        int i = C65530BtM.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
                            ny6.cP_();
                        }
                        if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) >= 0) {
                            ny6.jj_();
                        }
                        if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) >= 0) {
                            ny6.LJIIL();
                            Object iY_ = ny6.iY_();
                            if (!Intrinsics.areEqual(iY_, AbstractC2543c.class)) {
                                this.LJIIIIZZ.LIZIZ((C2541b) iY_);
                            }
                        }
                    }
                } else if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) < 0) {
                    if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
                        ny6.cJ_();
                    }
                    if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) < 0) {
                        ny6.cI_();
                    }
                    ny6.cM_();
                }
            } else if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) < 0) {
                if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
                    ny6.cJ_();
                }
                ny6.cI_();
            } else if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) > 0) {
                ny6.cP_();
            }
        } else if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
            ny6.cJ_();
        } else {
            if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) > 0) {
                ny6.cP_();
            }
            if (ny6.mo29786getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) > 0) {
                ny6.jj_();
            }
        }
        this.LJFF = false;
    }

    public AlsLogicContainer(Lifecycle lifecycle, C2541b c2541b, C13805g c13805g, C2539f c2539f) {
        C106862S5w.LIZ(lifecycle, c2541b, c2539f);
        this.LJIIIIZZ = c2541b;
        this.LJIIJJI = c13805g;
        this.LJIIL = c2539f;
        this.LIZIZ = lifecycle;
        this.LIZIZ.addObserver(this);
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new C13808o(null, this.LJIIL.LIZ).LIZ();
        }
        this.LJI = new C13808o(this.LJIIJJI, this.LJIIL.LIZ);
    }

    public final <A extends AbstractC2543c, B extends NY6<A>> void LIZ(Class<B> cls, Class<? extends AbstractC105709Rjr<?, ?>> cls2, int i, Visibility visibility, AttachOption attachOption) {
        if (PatchProxy.proxy(new Object[]{cls, null, 0, null, attachOption}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, attachOption);
        this.LIZJ.add(new C2544e(cls, attachOption, null, 0, null));
    }
}
