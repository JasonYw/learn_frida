package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.p518ui.DouyinLoadingLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.L7U;

/* loaded from: classes5.dex */
public final class GameLoadingWidget extends PureWidget<C3093v> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public DouyinLoadingLayout LIZIZ;

    static {
        Covode.recordClassIndex(16394);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699274;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public GameLoadingWidget() {
        super(null, 1);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (DouyinLoadingLayout) this.contentView.findViewById(2131168840);
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, GameLoadingWidget$onUpdate$1.INSTANCE, null, new GameLoadingWidget$onUpdate$2(this), 2, null);
        }
    }
}
