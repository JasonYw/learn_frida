package com.bytedance.android.live.broadcast.gamedetailv2.template;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.template.CommentTemplate$CommentViewHolder$bindData$1$$special$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3126x1673e59c extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Integer $actionType$inlined;
    public final /* synthetic */ String $commentId$inlined;
    public final /* synthetic */ String $content$inlined;
    public final /* synthetic */ int $position$inlined;
    public final /* synthetic */ Integer $relationType$inlined;
    public final /* synthetic */ CommentTemplate$CommentViewHolder$bindData$1 this$0;

    static {
        Covode.recordClassIndex(16688);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3126x1673e59c(CommentTemplate$CommentViewHolder$bindData$1 commentTemplate$CommentViewHolder$bindData$1, int i, String str, Integer num, Integer num2, String str2) {
        super(1);
        this.this$0 = commentTemplate$CommentViewHolder$bindData$1;
        this.$position$inlined = i;
        this.$commentId$inlined = str;
        this.$relationType$inlined = num;
        this.$actionType$inlined = num2;
        this.$content$inlined = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.$mAdapter.LIZ(intValue);
        }
        return Unit.INSTANCE;
    }
}
