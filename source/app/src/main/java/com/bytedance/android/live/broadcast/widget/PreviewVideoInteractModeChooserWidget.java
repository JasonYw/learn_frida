package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.VideoInteractMode;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.C413602Yo;
import p003X.KL7;
import p003X.KL8;
import p003X.KL9;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class PreviewVideoInteractModeChooserWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public TextView LIZJ;
    public ImageView LIZLLL;

    /* renamed from: LJ */
    public TextView f26001LJ;
    public ImageView LJFF;
    public FrameLayout LJIIL;
    public FrameLayout LJIILIIL;
    public final BehaviorSubject<VideoInteractMode> LJIILJJIL;
    public final String LJI = "PreviewVideoInteractModeChooserWidget";
    public final Lazy LJIILL = LIZ(C3199v.class);

    static {
        Covode.recordClassIndex(18740);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewVideoInteractModeChooserWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIILL, this, LIZIZ[0]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698468;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return this.LJI;
    }

    public PreviewVideoInteractModeChooserWidget() {
        BehaviorSubject<VideoInteractMode> create = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "");
        this.LJIILJJIL = create;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        LK1.LIZIZ(viewGroup, true);
        View view = this.contentView;
        this.LIZJ = (TextView) view.findViewById(2131168552);
        this.LJIIL = (FrameLayout) view.findViewById(2131169380);
        this.f26001LJ = (TextView) view.findViewById(2131168645);
        this.LJIILIIL = (FrameLayout) view.findViewById(2131180099);
        this.LIZLLL = (ImageView) view.findViewById(2131177038);
        this.LJFF = (ImageView) view.findViewById(2131177065);
        LIZ(C413602Yo.LIZ(LIZIZ().LJJL(), new PreviewVideoInteractModeChooserWidget$onCreate$2(this)));
        Disposable subscribe = this.LJIILJJIL.subscribe(new KL7(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
        FrameLayout frameLayout = this.LJIIL;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new KL8(this));
        }
        FrameLayout frameLayout2 = this.LJIILIIL;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new KL9(this));
        }
    }

    public final void LIZ(VideoInteractMode videoInteractMode) {
        if (PatchProxy.proxy(new Object[]{videoInteractMode}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LJIILJJIL.getValue() == videoInteractMode) {
            this.LJIILJJIL.onNext(VideoInteractMode.NONE);
        } else {
            this.LJIILJJIL.onNext(videoInteractMode);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 5).isSupported) {
            return;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        if (liveMode != LiveMode.VIDEO) {
            z = false;
        }
        LK1.LIZ(view, z);
    }
}
