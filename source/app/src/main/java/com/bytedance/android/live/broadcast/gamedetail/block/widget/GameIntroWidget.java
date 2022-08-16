package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.p518ui.ExpandableTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C5LE;
import p003X.L6M;
import p003X.L7U;

/* loaded from: classes5.dex */
public final class GameIntroWidget extends PureWidget<C3091q> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public L6M LIZIZ;
    public ExpandableTextView LIZJ;

    static {
        Covode.recordClassIndex(16390);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699272;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public GameIntroWidget() {
        super(null, 1);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            this.LIZIZ = new L6M(null, 1);
            RecyclerView recyclerView = (RecyclerView) this.contentView.findViewById(2131175912);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            L6M l6m = this.LIZIZ;
            if (l6m == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            recyclerView.setAdapter(l6m);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.context);
            linearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            View findViewById = this.contentView.findViewById(2131175915);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZJ = (ExpandableTextView) findViewById;
            ExpandableTextView expandableTextView = this.LIZJ;
            if (expandableTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            expandableTextView.setNeedFoldedAfterUnFolded(false);
            TextView textView = (TextView) this.contentView.findViewById(2131172330);
            C5LE c5le = C5LE.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c5le.LIZ(textView, 600);
        }
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, GameIntroWidget$onUpdate$1.INSTANCE, null, new GameIntroWidget$onUpdate$2(this), 2, null);
        }
    }
}
