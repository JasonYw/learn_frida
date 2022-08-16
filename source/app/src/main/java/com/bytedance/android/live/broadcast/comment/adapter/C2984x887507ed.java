package com.bytedance.android.live.broadcast.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.comment.adapter.GamePromoteCommentDetailAdapter$onCreateViewHolder$6$1$$special$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C2984x887507ed extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ArrayList $list;
    public final /* synthetic */ GamePromoteCommentDetailAdapter$onCreateViewHolder$6$1 this$0;

    static {
        Covode.recordClassIndex(15264);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2984x887507ed(ArrayList arrayList, GamePromoteCommentDetailAdapter$onCreateViewHolder$6$1 gamePromoteCommentDetailAdapter$onCreateViewHolder$6$1) {
        super(0);
        this.$list = arrayList;
        this.this$0 = gamePromoteCommentDetailAdapter$onCreateViewHolder$6$1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.$list);
            arrayList.remove(this.this$0.this$0.LIZJ.getAdapterPosition());
            this.this$0.this$0.LIZIZ.LIZ(arrayList, this.this$0.this$0.LIZIZ.LIZJ);
        }
        return Unit.INSTANCE;
    }
}
