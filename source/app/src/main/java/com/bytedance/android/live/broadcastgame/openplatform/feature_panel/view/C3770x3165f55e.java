package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88172Kog;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view.OpenFeatureChooseListFragment$processTabListVisibleScroll$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3770x3165f55e extends Lambda implements Function1<d$b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ d$b $bound;
    public final /* synthetic */ LinearLayoutManager $layoutManager$inlined;
    public final /* synthetic */ int $position$inlined;
    public final /* synthetic */ C88172Kog this$0;

    static {
        Covode.recordClassIndex(21372);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3770x3165f55e(d$b d_b, C88172Kog c88172Kog, int i, LinearLayoutManager linearLayoutManager) {
        super(1);
        this.$bound = d_b;
        this.this$0 = c88172Kog;
        this.$position$inlined = i;
        this.$layoutManager$inlined = linearLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(d$b d_b) {
        d$b d_b2 = d_b;
        if (!PatchProxy.proxy(new Object[]{d_b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(d_b2);
            this.$bound.LIZIZ = d_b2.LIZIZ;
            this.$bound.LIZJ = d_b2.LIZJ;
            HashMap<Integer, d$b> hashMap = this.this$0.LJIILIIL;
            Integer valueOf = Integer.valueOf(this.$position$inlined);
            d$b d_b3 = this.$bound;
            Intrinsics.checkNotNullExpressionValue(d_b3, "");
            hashMap.put(valueOf, d_b3);
        }
        return Unit.INSTANCE;
    }
}
