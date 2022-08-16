package com.bytedance.android.live.liveinteract.newpk.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C79432HSw;
import p003X.C79433HSx;
import p003X.C79434HSy;
import p003X.C79435HSz;
import p003X.HT1;
import p003X.HTW;
import p003X.View$OnClickListenerC79425HSp;

/* loaded from: classes3.dex */
public final class PkOperationalPlayWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HT1 LIZIZ;
    public View$OnClickListenerC79425HSp LIZJ;
    public final HTW LIZLLL;

    /* renamed from: LJ */
    public final CompositeDisposable f26394LJ = new CompositeDisposable();
    public final Observer<Integer> LJFF = new C79434HSy(this);
    public final Observer<Integer> LJI = new C79432HSw(this);
    public final Observer<Boolean> LJII = new C79435HSz(this);
    public final Observer<Boolean> LJIIIIZZ = new C79433HSx(this);

    static {
        Covode.recordClassIndex(28820);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        this.LIZLLL.LJIIJ.removeObserver(this.LJFF);
        this.LIZLLL.LJIIJJI.removeObserver(this.LJI);
        this.LIZLLL.LJIIL.removeObserver(this.LJII);
        this.LIZLLL.LJIILIIL.removeObserver(this.LJIIIIZZ);
        this.f26394LJ.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            LIZIZ.booleanValue();
        }
        this.LIZLLL.LJIIJ.observeForever(this.LJFF);
        this.LIZLLL.LJIIJJI.observeForever(this.LJI);
        this.LIZLLL.LJIIL.observeForever(this.LJII);
        this.LIZLLL.LJIILIIL.observeForever(this.LJIIIIZZ);
    }

    public PkOperationalPlayWidget(PkDataContext pkDataContext, HTW htw) {
        C106862S5w.LIZ(pkDataContext, htw);
        this.LIZLLL = htw;
        LinkCrossRoomDataHolder.LJII();
    }
}
