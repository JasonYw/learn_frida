package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.AbstractC4255c;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.HTW;
import p003X.HUN;
import p003X.HUP;
import p003X.HY5;

/* loaded from: classes3.dex */
public final class PkResultAnimWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HY5 LIZIZ;
    public final PkDataContext LIZJ;
    public final CompositeDisposable LIZLLL = new CompositeDisposable();

    /* renamed from: LJ */
    public final Observer<AbstractC4256d> f26397LJ = HUP.LIZ;
    public final Observer<AbstractC4255c> LJFF = new HUN(this);

    static {
        Covode.recordClassIndex(28844);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
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
        this.LIZJ.LJIIIZ.removeObserver(this.f26397LJ);
        this.LIZJ.LJIJJLI.removeObserver(this.LJFF);
        this.LIZLLL.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1980);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1980);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            LIZIZ.booleanValue();
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new HY5(context);
        ViewGroup viewGroup = this.containerView;
        HY5 hy5 = this.LIZIZ;
        if (hy5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(hy5, new ViewGroup.LayoutParams(-1, -1));
        this.LIZJ.LJIIIZ.observeForever(this.f26397LJ);
        this.LIZJ.LJIJJLI.observeForever(this.LJFF);
        MethodCollector.m14707o(1980);
    }

    public PkResultAnimWidget(PkDataContext pkDataContext, HTW htw) {
        C106862S5w.LIZ(pkDataContext, htw);
        this.LIZJ = pkDataContext;
        LinkCrossRoomDataHolder.LJII();
    }
}
