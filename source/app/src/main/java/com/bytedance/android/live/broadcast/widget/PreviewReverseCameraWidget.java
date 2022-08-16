package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewReverseCameraWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC426192th;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.KK6;
import p003X.LK5;
import p003X.LLY;

@AbstractC445813kF(LIZ = "REVERSE_CAMERA")
/* loaded from: classes12.dex */
public final class PreviewReverseCameraWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ = true;

    static {
        Covode.recordClassIndex(18636);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewReverseCameraWidget";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a173";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131700846;
        }
        return 2131700847;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Object LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        LIZ(LJIIJJI().LJII().LIZ().intValue());
        LIZJ(new PreviewReverseCameraWidget$onCreate$1(this));
        C3180k LJIIJJI = LJIIJJI();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LJIIJJI, C3180k.LIZ, false, 13);
        if (proxy.isSupported) {
            LIZ2 = proxy.result;
        } else {
            LIZ2 = LJIIJJI.LIZJ.LIZ(LJIIJJI, C3180k.LIZIZ[11]);
        }
        Disposable subscribe = ((AbstractC426192th) LIZ2).LIZIZ().subscribe(new Consumer<Boolean>() { // from class: X.3Oi
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18637);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Boolean bool) {
                float f;
                Boolean bool2 = bool;
                if (!PatchProxy.proxy(new Object[]{bool2}, this, LIZ, false, 1).isSupported) {
                    PreviewReverseCameraWidget previewReverseCameraWidget = PreviewReverseCameraWidget.this;
                    Intrinsics.checkNotNullExpressionValue(bool2, "");
                    previewReverseCameraWidget.LIZIZ = bool2.booleanValue();
                    View view = PreviewReverseCameraWidget.this.contentView;
                    if (view != null) {
                        if (PreviewReverseCameraWidget.this.LIZIZ) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        view.setAlpha(f);
                    }
                }
            }
        });
        if (subscribe != null) {
            LIZ(subscribe);
        }
    }

    public final void LIZ(int i) {
        String LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (i == 1) {
            LIZ2 = LK5.LIZ(2131581796);
        } else {
            LIZ2 = LK5.LIZ(2131581797);
        }
        LLY.LIZ(this.contentView, LIZ2);
    }
}
