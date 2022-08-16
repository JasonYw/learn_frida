package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4702i;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.HTW;
import p003X.HX4;
import p003X.HX5;
import p003X.HX6;
import p003X.HX9;

/* loaded from: classes3.dex */
public final class PkStartAnimWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HX5 LIZIZ;
    public boolean LIZJ;
    public final PkDataContext LJI;
    public final HTW LJIIJ;
    public final LinkCrossRoomDataHolder LIZLLL = LinkCrossRoomDataHolder.LJII();

    /* renamed from: LJ */
    public boolean f26399LJ = true;
    public final CompositeDisposable LJFF = new CompositeDisposable();
    public final Observer<AbstractC4256d> LJII = new HX4(this);
    public final Observer<AbstractC4702i> LJIIIIZZ = new HX6(this);
    public final Observer<Boolean> LJIIIZ = new HX9(this);

    static {
        Covode.recordClassIndex(28851);
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
        this.LJI.LJIIIZ.removeObserver(this.LJII);
        this.LJIIJ.LJFF.removeObserver(this.LJIIIIZZ);
        this.LJIIJ.LJIILJJIL.removeObserver(this.LJIIIZ);
        this.LJFF.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1982);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1982);
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
        this.LIZIZ = new HX5(context);
        ViewGroup viewGroup = this.containerView;
        HX5 hx5 = this.LIZIZ;
        if (hx5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(hx5, new ViewGroup.LayoutParams(-1, -1));
        HX5 hx52 = this.LIZIZ;
        if (hx52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        boolean z2 = this.LIZJ;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0), dataCenter}, hx52, HX5.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(dataCenter);
            hx52.LIZIZ = z2;
            hx52.LIZJ = dataCenter;
            C116971W2r.LIZ(LayoutInflater.from(hx52.getContext()), 2131700494, (ViewGroup) hx52, true);
        }
        this.LJI.LJIIIZ.observeForever(this.LJII);
        this.LJIIJ.LJFF.observeForever(this.LJIIIIZZ);
        this.LJIIJ.LJIILJJIL.observeForever(this.LJIIIZ);
        MethodCollector.m14707o(1982);
    }

    public static final /* synthetic */ HX5 LIZ(PkStartAnimWidget pkStartAnimWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkStartAnimWidget}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return (HX5) proxy.result;
        }
        HX5 hx5 = pkStartAnimWidget.LIZIZ;
        if (hx5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hx5;
    }

    public PkStartAnimWidget(PkDataContext pkDataContext, HTW htw) {
        C106862S5w.LIZ(pkDataContext, htw);
        this.LJI = pkDataContext;
        this.LJIIJ = htw;
    }
}
