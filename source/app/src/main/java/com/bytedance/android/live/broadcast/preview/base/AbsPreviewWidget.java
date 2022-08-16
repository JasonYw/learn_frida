package com.bytedance.android.live.broadcast.preview.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C413602Yo;
import p003X.C519656g3;
import p003X.C77347GeT;
import p003X.C86892KLu;
import p003X.C86893KLv;
import p003X.LK1;

/* loaded from: classes5.dex */
public abstract class AbsPreviewWidget extends LiveWidget implements AbstractC3175a, AbstractC4569445g {
    public static ChangeQuickRedirect LJII;
    public static final /* synthetic */ KProperty[] LJIIIIZZ;
    public C3180k LJIIIZ;
    public Function1<? super View, Unit> LJIIJJI;
    public final Lazy LIZ = LazyKt__LazyJVMKt.lazy(new AbsPreviewWidget$dataContext$2(this));
    public final Lazy LIZIZ = C77347GeT.LIZ(AbsPreviewWidget$compositeDisposable$2.INSTANCE);
    public final List<AbstractC3176b> LJIIJ = new ArrayList();

    static {
        Covode.recordClassIndex(17211);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AbsPreviewWidget.class, "dataContext", "getDataContext()Lcom/bytedance/android/live/broadcast/preview/PreviewWidgetContext;", 0);
        Reflection.property1(propertyReference1Impl);
        LJIIIIZZ = new KProperty[]{propertyReference1Impl};
    }

    public void LIZ(LiveMode liveMode) {
    }

    public final C3180k LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJII, false, 1);
        return (C3180k) (proxy.isSupported ? proxy.result : LIZ(this.LIZ, this, LJIIIIZZ[0]));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final CompositeDisposable LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJII, false, 2);
        return (CompositeDisposable) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJII, false, 17).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final Context LJIILLIIL() {
        return this.context;
    }

    public void LJIILJJIL() {
        ViewGroup viewGroup;
        if (!PatchProxy.proxy(new Object[0], this, LJII, false, 7).isSupported && (viewGroup = this.containerView) != null) {
            LK1.LIZJ(viewGroup);
        }
    }

    public void LJIILL() {
        ViewGroup viewGroup;
        if (!PatchProxy.proxy(new Object[0], this, LJII, false, 8).isSupported && (viewGroup = this.containerView) != null) {
            LK1.LIZ((View) viewGroup);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LJII, false, 10).isSupported) {
            return;
        }
        super.onDestroy();
        LJIIL().dispose();
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final int LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJII, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            return viewGroup.getVisibility();
        }
        return 8;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LJII, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        C413602Yo.LIZ(LJIIJJI().LIZ(), new AbsPreviewWidget$onCreate$$inlined$let$lambda$1(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onStart() {
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[0], this, LJII, false, 4).isSupported) {
            return;
        }
        super.onStart();
        if (this.LJIIJJI != null && (subscribe = C519656g3.LIZ(this.contentView).throttleFirst(500L, TimeUnit.MILLISECONDS).subscribe(new C86892KLu(this))) != null) {
            LIZ(subscribe);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final void LIZ(C3180k c3180k) {
        this.LJIIIZ = c3180k;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final void LIZ(Function1<? super View, Unit> function1) {
        this.LJIIJJI = function1;
    }

    public final <T extends AbstractC3177c> Lazy<T> LIZ(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LJII, false, 15);
        if (proxy.isSupported) {
            return (Lazy) proxy.result;
        }
        C106862S5w.LIZ(cls);
        return C86893KLv.LIZ(this, cls);
    }

    public final void LIZJ(Function1<? super View, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LJII, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        if (!PatchProxy.proxy(new Object[]{this, function1}, null, C86893KLv.LIZ, true, 2).isSupported) {
            C106862S5w.LIZ(function1);
            LIZ(function1);
        }
    }

    public final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LJII, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(disposable);
        return C86893KLv.LIZ(this, disposable);
    }

    public final <T extends AbstractC3177c> T LIZ(Lazy<? extends T> lazy, AbstractC3175a abstractC3175a, KProperty<?> kProperty) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{lazy, abstractC3175a, kProperty}, this, LJII, false, 16);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(lazy, abstractC3175a, kProperty);
        return (T) C86893KLv.LIZ(this, lazy, abstractC3175a, kProperty);
    }
}
