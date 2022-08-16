package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
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
import p003X.View$OnClickListenerC88988L4k;

/* loaded from: classes5.dex */
public final class GameTitleBarWidget extends PureWidget<C3089o> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HSImageView LIZIZ;
    public TextView LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public final boolean f25866LJ = true;
    public View LJFF;

    static {
        Covode.recordClassIndex(16409);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699338;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        HSImageView hSImageView = this.LIZIZ;
        if (hSImageView != null) {
            hSImageView.setVisibility(8);
        }
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = this.LIZLLL;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (HSImageView) this.contentView.findViewById(2131175900);
        this.LIZJ = (TextView) this.contentView.findViewById(2131175929);
        this.LJFF = this.contentView.findViewById(2131167520);
        this.LIZLLL = this.contentView.findViewById(2131168203);
        this.contentView.findViewById(2131192273);
        View view = this.LJFF;
        if (view != null) {
            view.setOnClickListener(View$OnClickListenerC88988L4k.LIZIZ);
        }
        if (!this.f25866LJ) {
            HSImageView hSImageView = this.LIZIZ;
            if (hSImageView != null) {
                hSImageView.setVisibility(8);
            }
            View view2 = this.LJFF;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    public GameTitleBarWidget(boolean z) {
        super(null, 1);
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, GameTitleBarWidget$onUpdate$1.INSTANCE, null, new GameTitleBarWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, abstractC12642p, GameTitleBarWidget$onUpdate$3.INSTANCE, null, new GameTitleBarWidget$onUpdate$4(this), 2, null);
        }
    }
}
