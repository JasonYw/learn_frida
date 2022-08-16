package com.bytedance.android.live.broadcast.gamedetailv2.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.comment.GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$1$$special$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3117xb2f2ea68 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ArrayList $list;
    public final /* synthetic */ GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$1 this$0;

    static {
        Covode.recordClassIndex(16608);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3117xb2f2ea68(ArrayList arrayList, GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$1 gamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$1) {
        super(0);
        this.$list = arrayList;
        this.this$0 = gamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.$list);
            arrayList.remove(this.this$0.this$0.LIZJ.getAdapterPosition());
            this.this$0.this$0.LIZIZ.LIZ(arrayList, this.this$0.this$0.LIZIZ.f8739LJ);
        }
        return Unit.INSTANCE;
    }
}
