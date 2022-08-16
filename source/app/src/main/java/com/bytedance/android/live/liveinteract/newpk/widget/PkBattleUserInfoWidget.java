package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
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
import p003X.HYD;
import p003X.HYE;
import p003X.LK1;

/* loaded from: classes3.dex */
public final class PkBattleUserInfoWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HYD LIZIZ;
    public boolean LIZJ;
    public final PkDataContext LJFF;
    public final LinkCrossRoomDataHolder LIZLLL = LinkCrossRoomDataHolder.LJII();

    /* renamed from: LJ */
    public final CompositeDisposable f26385LJ = new CompositeDisposable();
    public final Observer<AbstractC4256d> LJI = new HYE(this);

    static {
        Covode.recordClassIndex(28774);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
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
        this.LJFF.LJIIIZ.removeObserver(this.LJI);
        this.f26385LJ.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1966);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1966);
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
        this.LIZIZ = new HYD(context);
        ViewGroup viewGroup = this.containerView;
        HYD hyd = this.LIZIZ;
        if (hyd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(hyd, new ViewGroup.LayoutParams(-1, -1));
        HYD hyd2 = this.LIZIZ;
        if (hyd2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZ((View) hyd2, false);
        this.LJFF.LJIIIZ.observeForever(this.LJI);
        MethodCollector.m14707o(1966);
    }

    public PkBattleUserInfoWidget(PkDataContext pkDataContext) {
        C106862S5w.LIZ(pkDataContext);
        this.LJFF = pkDataContext;
    }

    public static final /* synthetic */ HYD LIZ(PkBattleUserInfoWidget pkBattleUserInfoWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkBattleUserInfoWidget}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (HYD) proxy.result;
        }
        HYD hyd = pkBattleUserInfoWidget.LIZIZ;
        if (hyd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hyd;
    }
}
