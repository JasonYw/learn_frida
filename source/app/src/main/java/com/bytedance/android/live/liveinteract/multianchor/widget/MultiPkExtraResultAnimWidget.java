package com.bytedance.android.live.liveinteract.multianchor.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import p003X.AbstractC426192th;
import p003X.AbstractC4569445g;
import p003X.AbstractC79382HQy;
import p003X.C106862S5w;
import p003X.HRK;
import p003X.IQV;
import p003X.IQX;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class MultiPkExtraResultAnimWidget extends RoomWidget implements AbstractC4582b, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public final CompositeDisposable LIZJ = new CompositeDisposable();
    public AbstractC79382HQy LIZLLL;

    /* renamed from: LJ */
    public final C4536j f26375LJ;

    static {
        Covode.recordClassIndex(28466);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700033;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            return;
        }
        this.LIZJ.clear();
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Observable<Boolean> LIZIZ2;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        Pair LIZ = IQV.LIZ((Function0) MultiPkExtraResultAnimWidget$onCreate$pair$1.INSTANCE);
        ((C4583c) LIZ.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ.getFirst(), "MultiPkExtraResultAnimService");
        this.LIZJ.add((Disposable) LIZ.getSecond());
        AbstractC426192th<Boolean> m15724LJ = this.f26375LJ.m15724LJ();
        if (m15724LJ != null && (LIZIZ2 = m15724LJ.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new HRK(this))) != null) {
            QB4.LIZ(subscribe, this.LIZJ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.widget.AbstractC4582b
    public final void LIZ(AbstractC79382HQy abstractC79382HQy) {
        this.LIZLLL = abstractC79382HQy;
    }

    public MultiPkExtraResultAnimWidget(C4536j c4536j) {
        C106862S5w.LIZ(c4536j);
        this.f26375LJ = c4536j;
    }
}
