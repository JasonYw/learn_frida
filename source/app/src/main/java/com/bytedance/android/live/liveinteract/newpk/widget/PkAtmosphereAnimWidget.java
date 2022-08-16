package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
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
import p003X.C116971W2r;
import p003X.C78470Gwa;
import p003X.LK1;

/* loaded from: classes3.dex */
public final class PkAtmosphereAnimWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C78470Gwa LIZIZ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public LinkCrossRoomDataHolder f26383LJ = LinkCrossRoomDataHolder.LJII();
    public final CompositeDisposable LIZJ = new CompositeDisposable();

    static {
        Covode.recordClassIndex(28766);
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
        this.LIZJ.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1965);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1965);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LIZLLL = z;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new C78470Gwa(context);
        ViewGroup viewGroup = this.containerView;
        C78470Gwa c78470Gwa = this.LIZIZ;
        if (c78470Gwa == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(c78470Gwa, new ViewGroup.LayoutParams(-1, -1));
        C78470Gwa c78470Gwa2 = this.LIZIZ;
        if (c78470Gwa2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        boolean z2 = this.LIZLLL;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.f26383LJ;
        Intrinsics.checkNotNullExpressionValue(linkCrossRoomDataHolder, "");
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0), linkCrossRoomDataHolder}, c78470Gwa2, C78470Gwa.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(linkCrossRoomDataHolder);
            C116971W2r.LIZ(LayoutInflater.from(c78470Gwa2.getContext()), 2131700474, (ViewGroup) c78470Gwa2, true);
        }
        C78470Gwa c78470Gwa3 = this.LIZIZ;
        if (c78470Gwa3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZ((View) c78470Gwa3, false);
        MethodCollector.m14707o(1965);
    }

    public PkAtmosphereAnimWidget(PkDataContext pkDataContext) {
        C106862S5w.LIZ(pkDataContext);
    }

    public static final /* synthetic */ C78470Gwa LIZ(PkAtmosphereAnimWidget pkAtmosphereAnimWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkAtmosphereAnimWidget}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return (C78470Gwa) proxy.result;
        }
        C78470Gwa c78470Gwa = pkAtmosphereAnimWidget.LIZIZ;
        if (c78470Gwa == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c78470Gwa;
    }
}
