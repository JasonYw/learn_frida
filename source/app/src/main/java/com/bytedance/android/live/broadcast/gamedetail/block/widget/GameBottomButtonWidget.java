package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetail.order.p269a.C3099a;
import com.bytedance.android.live.broadcast.gamedetail.order.view.ReserveButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import io.reactivex.disposables.Disposable;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C3807616g;
import p003X.C87010KQi;
import p003X.L7U;
import p003X.L9Q;

/* loaded from: classes5.dex */
public final class GameBottomButtonWidget extends PureWidget<C3088n> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public ReserveButton LIZIZ;
    public final boolean LIZJ;
    public Disposable LIZLLL;

    static {
        Covode.recordClassIndex(16365);
    }

    public GameBottomButtonWidget() {
        this(false, 1);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699322;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.mo14489r_();
        Disposable disposable = this.LIZLLL;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (ReserveButton) this.contentView.findViewById(2131184591);
        this.LIZLLL = C87010KQi.LIZ().LIZ(C3099a.class).subscribe(new L9Q(this), C3807616g.LIZ);
    }

    public GameBottomButtonWidget(boolean z) {
        super(null, 1);
        this.LIZJ = z;
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, GameBottomButtonWidget$onUpdate$1.INSTANCE, null, new GameBottomButtonWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, abstractC12642p, GameBottomButtonWidget$onUpdate$3.INSTANCE, null, new GameBottomButtonWidget$onUpdate$4(this), 2, null);
        }
    }

    public /* synthetic */ GameBottomButtonWidget(boolean z, int i) {
        this(false);
    }
}
