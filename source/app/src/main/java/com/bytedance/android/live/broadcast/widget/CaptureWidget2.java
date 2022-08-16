package com.bytedance.android.live.broadcast.widget;

import android.view.SurfaceView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.p417a.AbstractC5437g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes5.dex */
public class CaptureWidget2 extends AbsCaptureWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIJJI;
    public AbstractC5437g LJIIL;
    public SurfaceView LJIILIIL;

    static {
        Covode.recordClassIndex(18308);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131700509;
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIJJI, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        this.LJIILIIL = (SurfaceView) this.contentView.findViewById(2131186181);
    }

    public CaptureWidget2(AbstractC5437g abstractC5437g, AbstractC5436a abstractC5436a) {
        super(abstractC5436a);
        this.LJIIL = abstractC5437g;
    }
}
