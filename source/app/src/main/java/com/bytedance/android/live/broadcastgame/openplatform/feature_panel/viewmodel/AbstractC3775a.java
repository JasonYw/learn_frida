package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.model.C3388x;
import com.bytedance.android.live.broadcastgame.api.p282a.C3325a;
import com.bytedance.android.live.broadcastgame.api.p282a.C3326b;
import com.bytedance.android.live.broadcastgame.api.p286d.C3352k;
import com.bytedance.android.live.broadcastgame.api.p286d.C3355o;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3762g;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p298b.AbstractC3742c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC87943Kkz;
import p003X.AbstractC87945Kl1;
import p003X.AbstractC88158KoS;
import p003X.AbstractC88161KoV;
import p003X.AbstractC88191Koz;
import p003X.AbstractC88220KpS;
import p003X.AbstractC88225KpX;
import p003X.C106862S5w;
import p003X.C77347GeT;
import p003X.C87010KQi;
import p003X.C87549Ked;
import p003X.C87911KkT;
import p003X.C88163KoX;
import p003X.C88193Kp1;
import p003X.C88194Kp2;
import p003X.C88195Kp3;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.a */
/* loaded from: classes5.dex */
public abstract class AbstractC3775a extends ViewModel implements AbstractC88225KpX {
    public static ChangeQuickRedirect LIZ;
    public static final C88163KoX LJIILL = new C88163KoX((byte) 0);
    public volatile boolean LIZIZ;
    public List<C3380j> LIZJ;
    public List<C3355o> LIZLLL;

    /* renamed from: LJ */
    public final NextLiveData<Boolean> f26106LJ;
    public final NextLiveData<Boolean> LJFF;
    public final NextLiveData<Boolean> LJI;
    public final NextLiveData<Pair<String, String>> LJII;
    public final NextLiveData<Boolean> LJIIIIZZ;
    public final NextLiveData<Boolean> LJIIIZ;
    public final NextLiveData<Boolean> LJIIJ;
    public final NextLiveData<Boolean> LJIIJJI;
    public final NextLiveData<Boolean> LJIIL;
    public final NextLiveData<Boolean> LJIILIIL;
    public final NextLiveData<List<C3355o>> LJIILJJIL;
    public final NextLiveData<Boolean> LJIILLIIL;
    public final NextLiveData<Boolean> LJIIZILJ;
    public final NextLiveData<List<Object>> LJIJ;
    public final NextLiveData<Triple<List<String>, List<List<C3355o>>, Boolean>> LJIJI;
    public final Lazy LJIJJ;
    public final Lazy LJIJJLI;
    public final Lazy LJIL;
    public final Lazy LJJ;
    public final Lazy LJJI;
    public final Lazy LJJIFFI;
    public final /* synthetic */ C87549Ked LJJII = new C87549Ked();

    static {
        Covode.recordClassIndex(21454);
    }

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJJII.LIZ(disposable);
    }

    private void LJIJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        this.LJJII.LIZ();
    }

    public final AbstractC88161KoV LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        return (AbstractC88161KoV) (proxy.isSupported ? proxy.result : this.LJIJJ.mo27335getValue());
    }

    public final AbstractC88158KoS LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        return (AbstractC88158KoS) (proxy.isSupported ? proxy.result : this.LJIJJLI.mo27335getValue());
    }

    public final AbstractC88191Koz LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        return (AbstractC88191Koz) (proxy.isSupported ? proxy.result : this.LJIL.mo27335getValue());
    }

    public abstract AbstractC3742c LJIILJJIL();

    public final AbstractC87943Kkz LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        return (AbstractC87943Kkz) (proxy.isSupported ? proxy.result : this.LJJ.mo27335getValue());
    }

    public final AbstractC87945Kl1 LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        return (AbstractC87945Kl1) (proxy.isSupported ? proxy.result : this.LJJI.mo27335getValue());
    }

    public final C3762g LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        return (C3762g) (proxy.isSupported ? proxy.result : this.LJJIFFI.mo27335getValue());
    }

    public abstract AbstractC88220KpS<C3380j, ?> LJIJ();

    public final LiveData<Boolean> LIZIZ() {
        return this.LJIILLIIL;
    }

    /* renamed from: LJ */
    public final LiveData<Pair<String, String>> m15835LJ() {
        return this.LJII;
    }

    public final LiveData<Boolean> LJFF() {
        return this.LJIIZILJ;
    }

    public final LiveData<List<Object>> LJII() {
        return this.LJIJ;
    }

    public final LiveData<Triple<List<String>, List<List<C3355o>>, Boolean>> LJIIIIZZ() {
        return this.LJIJI;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJIILLIIL.setValue(Boolean.TRUE);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJI.postValue(Boolean.TRUE);
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJIIZILJ.setValue(Boolean.TRUE);
    }

    public final void LJIIIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && !this.LIZIZ) {
            LIZ(false);
            this.LJIIL.setValue(Boolean.TRUE);
        }
    }

    public final void LJIIJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && !this.LIZIZ) {
            LIZ(false);
            this.LJIILIIL.setValue(Boolean.TRUE);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        super.onCleared();
        LJIJI();
    }

    public final void LJIJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        LJI();
        LJIIL().LIZJ();
        LJIILIIL().LIZJ();
        LJIILJJIL().LIZ();
        LJIILLIIL().LIZIZ();
        LJIILL().LIZIZ();
        LJIJJ();
    }

    public AbstractC3775a() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            Disposable subscribe = C87010KQi.LIZ().LIZ(C3388x.class).subscribe(new C88193Kp1(this));
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
            Disposable subscribe2 = C87010KQi.LIZ().LIZ(C3325a.class).subscribe(new C88194Kp2(this));
            Intrinsics.checkNotNullExpressionValue(subscribe2, "");
            LIZ(subscribe2);
            Disposable subscribe3 = C87010KQi.LIZ().LIZ(C3326b.class).subscribe(new C88195Kp3(this));
            Intrinsics.checkNotNullExpressionValue(subscribe3, "");
            LIZ(subscribe3);
        }
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
        this.LJIILLIIL = new NextLiveData<>();
        this.f26106LJ = new NextLiveData<>();
        this.LJFF = new NextLiveData<>();
        this.LJI = new NextLiveData<>();
        this.LJII = new NextLiveData<>();
        this.LJIIIIZZ = new NextLiveData<>();
        this.LJIIZILJ = new NextLiveData<>();
        this.LJIIIZ = new NextLiveData<>();
        this.LJIJ = new NextLiveData<>();
        this.LJIJI = new NextLiveData<>();
        this.LJIIJ = new NextLiveData<>();
        this.LJIIJJI = new NextLiveData<>();
        this.LJIIL = new NextLiveData<>();
        this.LJIILIIL = new NextLiveData<>();
        this.LJIILJJIL = new NextLiveData<>();
        this.LJIJJ = C77347GeT.LIZ(AbsOpenFeaturePanelViewModel$featurePanelModel$2.INSTANCE);
        this.LJIJJLI = C77347GeT.LIZ(new AbsOpenFeaturePanelViewModel$featureListHandler$2(this));
        this.LJIL = C77347GeT.LIZ(new AbsOpenFeaturePanelViewModel$featureSearchHandler$2(this));
        this.LJJ = C77347GeT.LIZ(AbsOpenFeaturePanelViewModel$featureIconRunningStateManager$2.INSTANCE);
        this.LJJI = C77347GeT.LIZ(AbsOpenFeaturePanelViewModel$featureIconRecentUsedManager$2.INSTANCE);
        this.LJJIFFI = C77347GeT.LIZ(AbsOpenFeaturePanelViewModel$openFeatureSearchPageCacheHelper$2.INSTANCE);
    }

    public final void LIZIZ(List<C3355o> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJIILJJIL.setValue(list);
    }

    public final void LIZ(List<C3380j> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LIZJ = list;
    }

    public final void onEvent(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 27).isSupported) {
            return;
        }
        if (obj instanceof C3388x) {
            C87911KkT.LIZIZ.LIZ(obj.toString(), "AbsOpenFeaturePanelViewModel");
            C3388x c3388x = (C3388x) obj;
            if (c3388x.LIZIZ.length() == 0) {
                return;
            }
            if (c3388x.LIZLLL) {
                LJIILLIIL().LIZ(c3388x.LIZIZ);
            }
            if (c3388x.f26028LJ) {
                LJIILL().LIZ(c3388x.LIZIZ, LIZ());
            } else {
                LJIILL().LIZ(c3388x.LIZIZ);
            }
            if (c3388x.LIZJ) {
                LJIIL().LJFF();
            }
            if (!LIZ() && c3388x.f26028LJ) {
                LJI();
            }
        } else if (obj instanceof C3325a) {
            if (!LIZ()) {
                LJI();
            }
        } else if ((obj instanceof C3326b) && !LIZ() && !PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            this.LJFF.setValue(Boolean.TRUE);
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LJIIIZ.setValue(Boolean.valueOf(z));
    }

    private final void LIZ(List<String> list, List<? extends List<C3355o>> list2, boolean z) {
        if (PatchProxy.proxy(new Object[]{list, list2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJIJI.setValue(new Triple<>(list, list2, Boolean.valueOf(z)));
    }

    public void LIZ(List<List<C3355o>> list, List<String> list2, List<List<C3355o>> list3, List<String> list4, boolean z) {
        if (PatchProxy.proxy(new Object[]{list, list2, list3, list4, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 26).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, list2, list3, list4);
        if ((!list.isEmpty()) || (!list3.isEmpty())) {
            this.LIZIZ = true;
        }
        if (list.isEmpty() && list3.isEmpty()) {
            this.LIZIZ = false;
            LJIIIZ();
        } else if (list.isEmpty() && (!list3.isEmpty())) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
                this.LJIIJ.setValue(Boolean.TRUE);
            }
            LIZ(list4, list3, z);
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                List list5 = (List) obj;
                if (i < list2.size()) {
                    arrayList.add(new C3352k(list2.get(i)));
                } else {
                    arrayList.add(new C3352k(""));
                }
                arrayList.addAll(list5);
                i = i2;
            }
            if (!PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 10).isSupported) {
                this.LJIJ.setValue(arrayList);
            }
            if (list3.isEmpty()) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
                    this.LJIIJJI.setValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            LIZ(list4, list3, z);
        }
    }
}
