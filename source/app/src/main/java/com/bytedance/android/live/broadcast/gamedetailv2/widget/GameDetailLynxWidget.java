package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.hybrid.uielement.GameDetailLynxCard;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.L7U;
import p003X.LAB;

/* loaded from: classes5.dex */
public final class GameDetailLynxWidget extends BaseGameDetailWidget<C3139b> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public GameDetailLynxCard LIZIZ;

    static {
        Covode.recordClassIndex(16761);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699253;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.mo14489r_();
        GameDetailLynxCard gameDetailLynxCard = this.LIZIZ;
        if (gameDetailLynxCard != null) {
            gameDetailLynxCard.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        GameDetailLynxCard gameDetailLynxCard;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        View view = this.contentView;
        if (view != null) {
            gameDetailLynxCard = (GameDetailLynxCard) view.findViewById(2131182418);
        } else {
            gameDetailLynxCard = null;
        }
        this.LIZIZ = gameDetailLynxCard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailLynxWidget(LAB<AbstractC3125c, ?> lab) {
        super(lab, null, 2);
        C106862S5w.LIZ(lab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, p003X.LAL
    public void LIZ(C3139b c3139b) {
        if (PatchProxy.proxy(new Object[]{c3139b}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3139b);
        super.LIZ((GameDetailLynxWidget) c3139b);
        L7U.LIZ(this, c3139b, GameDetailLynxWidget$onUpdate$1.INSTANCE, null, new GameDetailLynxWidget$onUpdate$2(this, c3139b), 2, null);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget
    public final /* synthetic */ void LIZ(boolean z, C3139b c3139b) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3139b}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(c3139b);
        }
    }
}
