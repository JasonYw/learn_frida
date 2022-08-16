package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.browser.jsbridge.event.C3948ai;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.C2WC;
import p003X.C87010KQi;
import p003X.C87308Kak;

@AbstractC445813kF(LIZ = "ALL_TYPE_STAR_GRAPH_TASK")
/* loaded from: classes3.dex */
public final class PreviewAllStarGraphTaskWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ = "";
    public View LIZJ;

    static {
        Covode.recordClassIndex(18409);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewAllStarGraphTaskWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698478;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public PreviewAllStarGraphTaskWidget() {
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ(C3948ai.class).m151as(autoDispose())).LIZ(new Consumer<C3948ai>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewAllStarGraphTaskWidget.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18410);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C3948ai c3948ai) {
                C3199v c3199v;
                C2WC<C3199v.C3200b> LJJIJLIJ;
                C3948ai c3948ai2 = c3948ai;
                if (!PatchProxy.proxy(new Object[]{c3948ai2}, this, LIZ, false, 1).isSupported) {
                    PreviewAllStarGraphTaskWidget previewAllStarGraphTaskWidget = PreviewAllStarGraphTaskWidget.this;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], previewAllStarGraphTaskWidget, PreviewAllStarGraphTaskWidget.LIZ, false, 1);
                    if (proxy.isSupported) {
                        c3199v = (C3199v) proxy.result;
                    } else {
                        c3199v = (C3199v) previewAllStarGraphTaskWidget.LIZ(C3199v.class).mo27335getValue();
                    }
                    if (c3199v != null && (LJJIJLIJ = c3199v.LJJIJLIJ()) != null) {
                        LJJIJLIJ.LIZ(new C3199v.C3200b(true, c3948ai2.LIZIZ));
                    }
                }
            }
        }, new Consumer<Throwable>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewAllStarGraphTaskWidget.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18411);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Throwable th) {
                if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                    String LIZ2 = PreviewAllStarGraphTaskWidget.this.LIZ();
                    ALogger.m15800e(LIZ2, "subscribe SetStarGraphTaskEvent error: " + th);
                }
            }
        });
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        this.LIZJ = findViewById(2131193094);
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7239fb;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        LIZ(!c87308Kak.LIZ().booleanValue());
        C3180k LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            disposable = LJIIJJI.LIZ(new PreviewAllStarGraphTaskWidget$onCreate$1(this));
        } else {
            disposable = null;
        }
        LIZ(disposable);
        LIZJ(new PreviewAllStarGraphTaskWidget$onCreate$2(this));
    }

    public final void LIZ(boolean z) {
        View view;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported && (view = this.LIZJ) != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
