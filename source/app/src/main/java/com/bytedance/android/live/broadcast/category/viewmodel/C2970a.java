package com.bytedance.android.live.broadcast.category.viewmodel;

import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;

/* renamed from: com.bytedance.android.live.broadcast.category.viewmodel.a */
/* loaded from: classes5.dex */
public final class C2970a extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$onSearchEvent$2.INSTANCE);
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$onSelectEvent$2.INSTANCE);
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$onFetchEvent$2.INSTANCE);

    /* renamed from: LJ */
    public final Lazy f25803LJ = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$enterFrom$2.INSTANCE);
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$categoryMap$2.INSTANCE);
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$selectedGameCategoryNode$2.INSTANCE);
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$selectedOtherGameCategoryNode$2.INSTANCE);
    public final Lazy LJIIIIZZ = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$recentGameCategoryNode$2.INSTANCE);
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$cachedGameCategoryNode$2.INSTANCE);
    public final Lazy LJIIJ = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$selectedCategoryNode$2.INSTANCE);
    public final Lazy LJIIJJI = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$recentVideoCategoryNode$2.INSTANCE);
    public final Lazy LJIIL = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$categoryClickTime$2.INSTANCE);
    public final Lazy LJIILIIL = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$liveMode$2.INSTANCE);
    public final Lazy LJIILJJIL = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$fromLiveRoom$2.INSTANCE);
    public final Lazy LJIILL = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$isClicked$2.INSTANCE);
    public final Lazy LJIILLIIL = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$dismissDialogOrNotifyDataChanged$2.INSTANCE);
    public final Lazy LJIIZILJ = LazyKt__LazyJVMKt.lazy(PreviewCategoryViewModel$customGameCategoryTitle$2.INSTANCE);

    static {
        Covode.recordClassIndex(15191);
    }

    public final NextLiveData<Integer> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    public final NextLiveData<CategoryScene> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final NextLiveData<CategoryScene> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final NextLiveData<String> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.f25803LJ.mo27335getValue());
    }

    /* renamed from: LJ */
    public final NextLiveData<HashMap<CategoryScene, List<CategoryNode>>> m15906LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final NextLiveData<CategoryNode> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final NextLiveData<CategoryNode> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    public final NextLiveData<List<CategoryNode>> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    public final NextLiveData<List<CategoryNode>> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    public final NextLiveData<CategoryNode> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue());
    }

    public final NextLiveData<List<CategoryNode>> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIIJJI.mo27335getValue());
    }

    public final NextLiveData<Long> LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    public final NextLiveData<LiveMode> LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    public final NextLiveData<Boolean> LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIILJJIL.mo27335getValue());
    }

    public final NextLiveData<Boolean> LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIILL.mo27335getValue());
    }

    public final NextLiveData<Boolean> LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIILLIIL.mo27335getValue());
    }

    public final NextLiveData<String> LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        return (NextLiveData) (proxy.isSupported ? proxy.result : this.LJIIZILJ.mo27335getValue());
    }
}
