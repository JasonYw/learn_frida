package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4675a;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C458614Br;
import p003X.C79568HYc;
import p003X.C80354Hls;
import p003X.HYX;
import p003X.HYY;
import p003X.HYZ;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class PkStarActivityInfoWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HYY LIZIZ;
    public boolean LIZJ;
    public final PkDataContext LIZLLL;

    /* renamed from: LJ */
    public final CompositeDisposable f26398LJ = new CompositeDisposable();
    public final Observer<AbstractC4256d> LJFF = new HYX(this);
    public final Observer<AbstractC4675a> LJI = new HYZ(this);
    public final Observer<Boolean> LJII = new C79568HYc(this);
    public final C80354Hls LJIIIIZZ;
    public final C458614Br LJIIIZ;

    static {
        Covode.recordClassIndex(28847);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
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
        this.LIZLLL.LJIIIZ.removeObserver(this.LJFF);
        this.LJIIIIZZ.LIZJ.removeObserver(this.LJI);
        this.LIZLLL.LJJIFFI.removeObserver(this.LJII);
        this.f26398LJ.clear();
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported || !this.LJIIIZ.LIZIZ()) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = LK5.LIZ(6.0f);
            layoutParams2.topToTop = 2131185184;
            layoutParams2.bottomToBottom = 2131185184;
            ViewGroup viewGroup2 = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
            viewGroup2.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1981);
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1981);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        }
        this.LIZJ = z;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new HYY(context);
        ViewGroup viewGroup = this.containerView;
        HYY hyy = this.LIZIZ;
        if (hyy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(hyy, new ViewGroup.LayoutParams(-1, -1));
        HYY hyy2 = this.LIZIZ;
        if (hyy2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hyy2.setDataCenter(this.dataCenter);
        this.LIZLLL.LJIIIZ.observeForever(this.LJFF);
        this.LJIIIIZZ.LIZJ.observeForever(this.LJI);
        this.LIZLLL.LJJIFFI.observeForever(this.LJII);
        LIZ();
        MethodCollector.m14707o(1981);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        LIZ();
    }

    public static final /* synthetic */ HYY LIZ(PkStarActivityInfoWidget pkStarActivityInfoWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkStarActivityInfoWidget}, null, LIZ, true, 5);
        if (proxy.isSupported) {
            return (HYY) proxy.result;
        }
        HYY hyy = pkStarActivityInfoWidget.LIZIZ;
        if (hyy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hyy;
    }

    public PkStarActivityInfoWidget(PkDataContext pkDataContext, C80354Hls c80354Hls, C458614Br c458614Br) {
        C106862S5w.LIZ(pkDataContext, c80354Hls, c458614Br);
        this.LIZLLL = pkDataContext;
        this.LJIIIIZZ = c80354Hls;
        this.LJIIIZ = c458614Br;
    }
}
