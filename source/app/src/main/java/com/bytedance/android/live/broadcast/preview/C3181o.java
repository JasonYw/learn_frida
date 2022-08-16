package com.bytedance.android.live.broadcast.preview;

import android.content.Intent;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3177c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC426192th;
import p003X.C81289I2h;
import p003X.HNS;

/* renamed from: com.bytedance.android.live.broadcast.preview.o */
/* loaded from: classes28.dex */
public final class C3181o extends AbstractC3177c {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$closeStatus$2.INSTANCE);
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$selectTagEvent$2.INSTANCE);

    /* renamed from: LJ */
    public final Lazy f25918LJ = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$selectGameEvent$2.INSTANCE);
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$requestRecordPermissionEvent$2.INSTANCE);
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$selectCoverEvent$2.INSTANCE);
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$broadcastPrepareEvent$2.INSTANCE);
    public final Lazy LJIIJJI = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$hideView$2.INSTANCE);
    public final Lazy LJIIL = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$voiceLiveThemePreviewEvent$2.INSTANCE);
    public final Lazy LJIILIIL = LazyKt__LazyJVMKt.lazy(StartLiveEventViewModel$voiceLiveCustomThemeEvent$2.INSTANCE);
    public final C81289I2h LJIILJJIL = HNS.LIZ(this, null, 1, null);

    static {
        Covode.recordClassIndex(17286);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C3181o.class, "clickStartLiveBtn", "getClickStartLiveBtn()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final NextLiveData<Integer> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final NextLiveData<Integer> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.f25918LJ.mo27335getValue());
    }

    public final NextLiveData<Intent> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final NextLiveData<Integer> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    /* renamed from: LJ */
    public final NextLiveData<Integer> m15892LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    public final NextLiveData<Integer> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIIJJI.mo27335getValue());
    }

    public final NextLiveData<Boolean> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    public final NextLiveData<Boolean> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    public final AbstractC426192th<Unit> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIILJJIL.LIZ(this, LIZIZ[0]));
    }
}
