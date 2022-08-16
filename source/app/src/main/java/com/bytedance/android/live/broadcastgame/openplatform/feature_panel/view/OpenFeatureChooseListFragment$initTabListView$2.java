package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88172Kog;

/* loaded from: classes5.dex */
public final class OpenFeatureChooseListFragment$initTabListView$2 extends Lambda implements Function3<RecyclerView, LinearLayoutManager, Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88172Kog this$0;

    static {
        Covode.recordClassIndex(21367);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFeatureChooseListFragment$initTabListView$2(C88172Kog c88172Kog) {
        super(3);
        this.this$0 = c88172Kog;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view.OpenFeatureChooseListFragment$initTabListView$2$1 */
    /* loaded from: classes5.dex */
    public static final class C37721 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ LinearLayoutManager $layoutManager;
        public final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(21368);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37721(LinearLayoutManager linearLayoutManager, int i) {
            super(0);
            this.$layoutManager = linearLayoutManager;
            this.$position = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                OpenFeatureChooseListFragment$initTabListView$2.this.this$0.LIZ(this.$layoutManager, this.$position);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view.OpenFeatureChooseListFragment$initTabListView$2$2 */
    /* loaded from: classes5.dex */
    public static final class C37732 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ LinearLayoutManager $layoutManager;
        public final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(21369);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37732(int i, LinearLayoutManager linearLayoutManager) {
            super(0);
            this.$position = i;
            this.$layoutManager = linearLayoutManager;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && OpenFeatureChooseListFragment$initTabListView$2.this.this$0.LJIILJJIL != this.$position) {
                OpenFeatureChooseListFragment$initTabListView$2.this.this$0.LIZ(this.$layoutManager, this.$position);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, Integer num) {
        RecyclerView recyclerView2 = recyclerView;
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{recyclerView2, linearLayoutManager2, Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(recyclerView2, linearLayoutManager2);
            this.this$0.LIZ(recyclerView2, new C37721(linearLayoutManager2, intValue), new C37732(intValue, linearLayoutManager2));
        }
        return Unit.INSTANCE;
    }
}
