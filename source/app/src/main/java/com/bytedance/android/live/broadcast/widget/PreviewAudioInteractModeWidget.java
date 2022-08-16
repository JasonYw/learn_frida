package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C91513M3n;

/* loaded from: classes12.dex */
public final class PreviewAudioInteractModeWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ = "PreviewAudioInteractModeWidget";

    static {
        Covode.recordClassIndex(18426);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        final C3199v c3199v = (C3199v) LIZ(C3199v.class).mo27335getValue();
        if (c3199v.LJJI().LIZJ()) {
            return;
        }
        C3258d c3258d = new C3258d();
        c3199v.LJJI().LIZIZ(c3258d);
        Disposable subscribe = C91513M3n.LIZIZ(c3258d.LIZIZ).subscribe(new Consumer<AudioInteractMode>() { // from class: X.3Rv
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18427);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AudioInteractMode audioInteractMode) {
                AudioInteractMode audioInteractMode2 = audioInteractMode;
                if (!PatchProxy.proxy(new Object[]{audioInteractMode2}, this, LIZ, false, 1).isSupported) {
                    C3199v.this.LJJIJ().LIZ(Integer.valueOf(audioInteractMode2.linkMicScene));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }
}
