package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.permissioncheck.p407c.C5184a;
import com.bytedance.android.live.permissioncheck.p407c.C5185b;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C77347GeT;
import p003X.C78394GvM;

/* loaded from: classes3.dex */
public final class PreviewLocalCheckWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = C77347GeT.LIZ(new PreviewLocalCheckWidget$rulesDataContext$2(this));

    static {
        Covode.recordClassIndex(18570);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLocalCheckWidget";
    }

    public final C5185b LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C5185b) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        Disposable subscribe = LJIIJJI().LJIIJ().LIZIZ().subscribe(new C78394GvM(this));
        if (subscribe != null) {
            LIZ(subscribe);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C2WC<C5184a> LIZ2 = LIZIZ().LIZ();
        if (liveMode == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ2.LIZ(new C5184a(liveMode, 0L, 2));
    }
}
