package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.preview.viewmodel.StartLiveVisibilityContext$loadMoreOneLimitList$$inlined$let$lambda$1 */
/* loaded from: classes3.dex */
public final class C3201x66a41c79 extends Lambda implements Function2<List<C3195i>, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $filterType$inlined;
    public final /* synthetic */ C3209g $it;
    public final /* synthetic */ C3207d this$0;

    static {
        Covode.recordClassIndex(17462);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3201x66a41c79(C3209g c3209g, C3207d c3207d, int i) {
        super(2);
        this.$it = c3209g;
        this.this$0 = c3207d;
        this.$filterType$inlined = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(List<C3195i> list, Boolean bool) {
        Object obj;
        List<C3195i> list2 = list;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{list2, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (list2 != null) {
                this.$it.LIZLLL.addAll(list2);
                if (this.this$0.LJIIJJI == this.$it.LIZIZ) {
                    this.this$0.LJI.addAll(list2);
                }
            }
            this.this$0.LIZIZ(CollectionsKt___CollectionsKt.toMutableList((Collection) this.$it.LIZLLL), booleanValue);
            String str = this.this$0.LIZJ;
            StringBuilder sb = new StringBuilder("loadMore OneLimitList for ");
            sb.append(this.$filterType$inlined);
            sb.append(" success -- dataSize:");
            if (list2 != null) {
                obj = Integer.valueOf(list2.size());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(" hasMore:");
            sb.append(booleanValue);
            ALogger.m15801d(str, sb.toString());
        }
        return Unit.INSTANCE;
    }
}
