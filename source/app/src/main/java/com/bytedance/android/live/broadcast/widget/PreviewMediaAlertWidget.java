package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C413602Yo;

/* loaded from: classes5.dex */
public final class PreviewMediaAlertWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final Lazy LIZJ = LIZ(C3199v.class);

    static {
        Covode.recordClassIndex(18595);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewMediaAlertWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    private final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LIZJ, this, LIZIZ[0]));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewActivityCenterWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698463;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        LiveMode liveMode;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            booleanRef2.element = false;
            PreviewMediaAlertWidget$handleMediaViewChange$1 previewMediaAlertWidget$handleMediaViewChange$1 = new PreviewMediaAlertWidget$handleMediaViewChange$1(this, booleanRef, booleanRef2);
            PreviewMediaAlertWidget$handleMediaViewChange$2 previewMediaAlertWidget$handleMediaViewChange$2 = new PreviewMediaAlertWidget$handleMediaViewChange$2(booleanRef, previewMediaAlertWidget$handleMediaViewChange$1);
            PreviewMediaAlertWidget$handleMediaViewChange$3 previewMediaAlertWidget$handleMediaViewChange$3 = new PreviewMediaAlertWidget$handleMediaViewChange$3(booleanRef2, previewMediaAlertWidget$handleMediaViewChange$1);
            C2WC<LiveMode> c2wc = LIZIZ().LIZJ;
            if (c2wc != null) {
                liveMode = c2wc.LIZ();
            } else {
                liveMode = null;
            }
            if (liveMode == LiveMode.MEDIA) {
                View view = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                TextView textView = (TextView) view.findViewById(2131168471);
                if (textView != null) {
                    Context context = this.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textView.setText(context.getResources().getText(2131582556));
                }
                LIZ(C413602Yo.LIZ(LIZIZ().LJIIIIZZ(), new PreviewMediaAlertWidget$handleMediaViewChange$4(previewMediaAlertWidget$handleMediaViewChange$3)));
                LIZ(C413602Yo.LIZ(LIZIZ().LJII(), new PreviewMediaAlertWidget$handleMediaViewChange$5(previewMediaAlertWidget$handleMediaViewChange$2)));
            }
        }
        LJIILJJIL();
    }
}
