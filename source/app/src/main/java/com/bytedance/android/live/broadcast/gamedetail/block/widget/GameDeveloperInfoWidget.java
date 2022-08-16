package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.L7U;

/* loaded from: classes5.dex */
public final class GameDeveloperInfoWidget extends PureWidget<C3090p> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public TextView LIZJ;

    static {
        Covode.recordClassIndex(16383);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698328;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public GameDeveloperInfoWidget() {
        super(null, 1);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.mo14489r_();
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (TextView) this.contentView.findViewById(2131172331);
        this.LIZJ = (TextView) this.contentView.findViewById(2131184513);
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, GameDeveloperInfoWidget$onUpdate$1.INSTANCE, null, new GameDeveloperInfoWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, abstractC12642p, GameDeveloperInfoWidget$onUpdate$3.INSTANCE, null, new GameDeveloperInfoWidget$onUpdate$4(this), 2, null);
            L7U.LIZ(this, abstractC12642p, GameDeveloperInfoWidget$onUpdate$5.INSTANCE, null, new GameDeveloperInfoWidget$onUpdate$6(this), 2, null);
        }
    }
}
