package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C414192aL;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.LK1;

/* loaded from: classes12.dex */
public final class LiveSettingAnchorShowWidget extends AbsRecyclablePreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;
    public final Function0<Unit> LJII;
    public View LJIIIIZZ;
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(LiveSettingAnchorShowWidget$anchorShowUrl$2.INSTANCE);
    public final Lazy LJIIIZ = C77347GeT.LIZ(LiveSettingAnchorShowWidget$currentUid$2.INSTANCE);

    static {
        Covode.recordClassIndex(18348);
    }

    public final String LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 4);
        return (String) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699895;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "LiveSettingAnchorShowWidget" + hashCode();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        ViewGroup viewGroup;
        if (!PatchProxy.proxy(new Object[0], this, LJFF, false, 6).isSupported && !PatchProxy.proxy(new Object[0], this, AbsRecyclablePreviewWidget.LIZ, false, 8).isSupported && (viewGroup = this.containerView) != null) {
            LK1.LIZ((View) viewGroup);
        }
    }

    public LiveSettingAnchorShowWidget(Function0<Unit> function0) {
        C106862S5w.LIZ(function0);
        this.LJII = function0;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 3).isSupported) {
            return;
        }
        this.LJIIIIZZ = findViewById(2131166459);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 5).isSupported) {
            return;
        }
        View view = this.LJIIIIZZ;
        if (view != null) {
            view.setOnClickListener(C414192aL.LIZ(0L, new LiveSettingAnchorShowWidget$onLoad$1(this), 1, null));
        }
        LIZJ();
        C4574547f.LIZ().LIZ("livesdk_anchor_programlist_show", MapsKt__MapsKt.mapOf(TuplesKt.m137to("anchor_id", LIZLLL()), TuplesKt.m137to("enter_from", "live_takepage")), new Object[0]);
    }
}
