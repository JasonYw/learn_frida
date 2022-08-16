package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C89004L5a;

/* loaded from: classes5.dex */
public final class GameDetailInfoTabWidget$onMount$2 extends Lambda implements Function1<NestedChildRecyclerView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailInfoTabWidget this$0;

    static {
        Covode.recordClassIndex(16299);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailInfoTabWidget$onMount$2(GameDetailInfoTabWidget gameDetailInfoTabWidget) {
        super(1);
        this.this$0 = gameDetailInfoTabWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(NestedChildRecyclerView nestedChildRecyclerView) {
        NestedChildRecyclerView nestedChildRecyclerView2 = nestedChildRecyclerView;
        if (!PatchProxy.proxy(new Object[]{nestedChildRecyclerView2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(nestedChildRecyclerView2);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(nestedChildRecyclerView2.getContext());
            linearLayoutManager.setOrientation(1);
            nestedChildRecyclerView2.setLayoutManager(linearLayoutManager);
            nestedChildRecyclerView2.addItemDecoration(new C89004L5a(this.this$0.f25856LJ));
        }
        return Unit.INSTANCE;
    }
}
