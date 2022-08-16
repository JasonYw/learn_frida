package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.AbstractC4256d;
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
import p003X.C5850798b;
import p003X.C80354Hls;
import p003X.HYJ;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class PkConsecutiveVictoryInfoWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C5850798b LIZIZ;
    public boolean LIZJ;

    /* renamed from: LJ */
    public final PkDataContext f26387LJ;
    public final C80354Hls LJFF;
    public final C458614Br LJII;
    public final CompositeDisposable LIZLLL = new CompositeDisposable();
    public final Observer<AbstractC4256d> LJI = new HYJ(this);

    static {
        Covode.recordClassIndex(28779);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
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
        this.f26387LJ.LJIIIZ.removeObserver(this.LJI);
        this.LIZLLL.clear();
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported || !this.LJII.LIZIZ()) {
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
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1968);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1968);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LIZJ = z;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new C5850798b(context);
        ViewGroup viewGroup = this.containerView;
        C5850798b c5850798b = this.LIZIZ;
        if (c5850798b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(c5850798b, new ViewGroup.LayoutParams(-1, -1));
        C5850798b c5850798b2 = this.LIZIZ;
        if (c5850798b2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZ((View) c5850798b2, false);
        this.f26387LJ.LJIIIZ.observeForever(this.LJI);
        LIZ();
        MethodCollector.m14707o(1968);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        LIZ();
    }

    public static final /* synthetic */ C5850798b LIZ(PkConsecutiveVictoryInfoWidget pkConsecutiveVictoryInfoWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkConsecutiveVictoryInfoWidget}, null, LIZ, true, 7);
        if (proxy.isSupported) {
            return (C5850798b) proxy.result;
        }
        C5850798b c5850798b = pkConsecutiveVictoryInfoWidget.LIZIZ;
        if (c5850798b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c5850798b;
    }

    public PkConsecutiveVictoryInfoWidget(PkDataContext pkDataContext, C80354Hls c80354Hls, C458614Br c458614Br) {
        C106862S5w.LIZ(pkDataContext, c80354Hls, c458614Br);
        this.f26387LJ = pkDataContext;
        this.LJFF = c80354Hls;
        this.LJII = c458614Br;
    }
}
