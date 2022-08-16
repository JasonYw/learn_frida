package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;
import p003X.AbstractC81935IRd;
import p003X.K8Q;

/* loaded from: classes3.dex */
public final class PreviewVideoLiveThemeWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC2863ai LIZIZ;
    public AbstractC81935IRd LIZJ;

    static {
        Covode.recordClassIndex(18745);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewVideoLiveThemeWidget";
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
        AbstractC81935IRd abstractC81935IRd;
        AbstractC81935IRd abstractC81935IRd2;
        AbstractC81935IRd abstractC81935IRd3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJIIIIZZ().LIZ(this);
        AbstractC2863ai abstractC2863ai = this.LIZIZ;
        if (abstractC2863ai != null) {
            abstractC81935IRd = abstractC2863ai.LJII();
        } else {
            abstractC81935IRd = null;
        }
        this.LIZJ = abstractC81935IRd;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (abstractC81935IRd3 = this.LIZJ) != null) {
            abstractC81935IRd3.LIZJ(3);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (abstractC81935IRd2 = this.LIZJ) != null) {
            abstractC81935IRd2.LIZJ(4);
        }
    }
}
