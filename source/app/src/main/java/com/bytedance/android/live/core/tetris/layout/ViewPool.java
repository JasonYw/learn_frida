package com.bytedance.android.live.core.tetris.layout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC133794bkN;
import p003X.AbstractC133796bkP;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C133795bkO;
import p003X.C133799bkS;

/* loaded from: classes17.dex */
public final class ViewPool implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final C133799bkS LIZJ;

    /* renamed from: LJ */
    public boolean f26197LJ;
    public AbstractC133794bkN LJI;
    public final AppCompatActivity LJIIIIZZ;
    public final HashMap<Integer, HashSet<C4120c>> LIZIZ = new HashMap<>();
    public final Map<Class<? extends View>, ViewGroup> LIZLLL = new LinkedHashMap();
    public int LJFF = 1;
    public final AbstractC133796bkP LJII = new C133795bkO(this);

    static {
        Covode.recordClassIndex(23744);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported && event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LIZIZ.clear();
        AbstractC133794bkN abstractC133794bkN = this.LJI;
        if (abstractC133794bkN != null) {
            abstractC133794bkN.LIZ(this.LJIIIIZZ);
        }
        this.LJI = null;
    }

    public ViewPool(AppCompatActivity appCompatActivity) {
        C106862S5w.LIZ(appCompatActivity);
        this.LJIIIIZZ = appCompatActivity;
        this.LIZJ = new C133799bkS(this.LJIIIIZZ);
    }

    public final View LIZ(int i) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        HashSet<C4120c> hashSet = this.LIZIZ.get(Integer.valueOf(i));
        if (hashSet == null) {
            return null;
        }
        Iterator<T> it = hashSet.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C4120c) obj).LIZJ == ViewState.CREATED) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C4120c c4120c = (C4120c) obj;
        if (c4120c == null) {
            return null;
        }
        ViewState viewState = ViewState.USING;
        if (!PatchProxy.proxy(new Object[]{viewState}, c4120c, C4120c.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(viewState);
            c4120c.LIZJ = viewState;
        }
        hashSet.remove(c4120c);
        return c4120c.LIZIZ;
    }

    public final boolean LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        HashSet<C4120c> hashSet = this.LIZIZ.get(Integer.valueOf(i));
        if (hashSet == null) {
            return false;
        }
        Iterator<T> it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C4120c) next).LIZJ == ViewState.CREATED) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZ(AbstractC133794bkN abstractC133794bkN) {
        if (PatchProxy.proxy(new Object[]{abstractC133794bkN}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC133794bkN);
        if (this.f26197LJ) {
            return;
        }
        this.LJI = abstractC133794bkN;
        this.f26197LJ = true;
        this.LJIIIIZZ.mo29786getLifecycle().addObserver(this);
    }

    public final View LIZ(int i, ViewGroup viewGroup, boolean z) {
        MethodCollector.m14708i(1597);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            View view = (View) proxy.result;
            MethodCollector.m14707o(1597);
            return view;
        } else if (LIZIZ(i)) {
            View LIZ2 = LIZ(i);
            if (z && viewGroup != null) {
                viewGroup.addView(LIZ2);
            }
            if (LIZ2 == null) {
                LIZ2 = C116971W2r.LIZ(LayoutInflater.from(this.LJIIIIZZ), i, viewGroup, z);
            }
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            MethodCollector.m14707o(1597);
            return LIZ2;
        } else {
            View LIZ3 = C116971W2r.LIZ(LayoutInflater.from(this.LJIIIIZZ), i, viewGroup, z);
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            MethodCollector.m14707o(1597);
            return LIZ3;
        }
    }

    public static /* synthetic */ View LIZ(ViewPool viewPool, int i, ViewGroup viewGroup, boolean z, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPool, Integer.valueOf(i), null, (byte) 0, Integer.valueOf(i2), null}, null, LIZ, true, 7);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return viewPool.LIZ(i, null, z);
    }
}
