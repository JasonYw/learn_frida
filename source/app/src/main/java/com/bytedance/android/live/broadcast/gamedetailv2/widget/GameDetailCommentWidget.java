package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C89045L6p;
import p003X.IQV;
import p003X.L7U;
import p003X.LAB;

/* loaded from: classes5.dex */
public final class GameDetailCommentWidget extends BaseGameDetailWidget<C3138a> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public NestedChildRecyclerView LIZIZ;
    public final C89045L6p LIZJ;
    public final C2990g LIZLLL;

    /* renamed from: LJ */
    public boolean f25899LJ;

    static {
        Covode.recordClassIndex(16737);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699246;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (NestedChildRecyclerView) this.contentView.findViewById(2131188455);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailCommentWidget(LAB<AbstractC3125c, ?> lab) {
        super(lab, null, 2);
        C106862S5w.LIZ(lab);
        C13491f LIZ2 = IQV.LIZ(C89045L6p.class);
        this.LIZJ = (C89045L6p) (!(LIZ2 instanceof C89045L6p) ? null : LIZ2);
        C13491f LIZ3 = IQV.LIZ(C2990g.class);
        this.LIZLLL = (C2990g) (!(LIZ3 instanceof C2990g) ? null : LIZ3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, p003X.LAL
    public void LIZ(C3138a c3138a) {
        if (PatchProxy.proxy(new Object[]{c3138a}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3138a);
        super.LIZ((GameDetailCommentWidget) c3138a);
        L7U.LIZ(this, c3138a, GameDetailCommentWidget$onUpdate$1.INSTANCE, null, new GameDetailCommentWidget$onUpdate$2(this, c3138a), 2, null);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget
    public final /* synthetic */ void LIZ(boolean z, C3138a c3138a) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3138a}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c3138a);
        }
    }
}
