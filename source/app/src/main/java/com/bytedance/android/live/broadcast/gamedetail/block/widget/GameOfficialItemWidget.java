package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.L7U;

/* loaded from: classes5.dex */
public final class GameOfficialItemWidget extends PureWidget<C3092r> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Button LIZIZ;
    public HSImageView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f25865LJ;
    public ImageView LJFF;

    static {
        Covode.recordClassIndex(16397);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699302;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public GameOfficialItemWidget() {
        super(null, 1);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (Button) this.containerView.findViewById(2131165405);
        this.LIZJ = (HSImageView) this.containerView.findViewById(2131179396);
        this.LIZLLL = (TextView) this.containerView.findViewById(2131172009);
        this.f25865LJ = (TextView) this.containerView.findViewById(2131194115);
        this.LJFF = (ImageView) this.containerView.findViewById(2131178676);
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        C3092r c3092r = (C3092r) abstractC12642p;
        if (!PatchProxy.proxy(new Object[]{c3092r}, this, LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(c3092r);
            L7U.LIZ(this, c3092r, GameOfficialItemWidget$onUpdate$1.INSTANCE, null, new GameOfficialItemWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, c3092r, GameOfficialItemWidget$onUpdate$3.INSTANCE, null, new GameOfficialItemWidget$onUpdate$4(this), 2, null);
            L7U.LIZ(this, c3092r, GameOfficialItemWidget$onUpdate$5.INSTANCE, null, new GameOfficialItemWidget$onUpdate$6(this), 2, null);
            L7U.LIZ(this, c3092r, GameOfficialItemWidget$onUpdate$7.INSTANCE, null, new GameOfficialItemWidget$onUpdate$8(this, c3092r), 2, null);
            L7U.LIZ(this, c3092r, GameOfficialItemWidget$onUpdate$9.INSTANCE, null, new GameOfficialItemWidget$onUpdate$10(this), 2, null);
        }
    }
}
