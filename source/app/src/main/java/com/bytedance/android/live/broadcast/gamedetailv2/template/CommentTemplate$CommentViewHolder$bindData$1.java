package com.bytedance.android.live.broadcast.gamedetailv2.template;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.L4U;

/* loaded from: classes5.dex */
public final class CommentTemplate$CommentViewHolder$bindData$1 extends Lambda implements Function5<Integer, String, Integer, Integer, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L4U $mAdapter;
    public final /* synthetic */ c$a this$0;

    static {
        Covode.recordClassIndex(16687);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTemplate$CommentViewHolder$bindData$1(c$a c_a, L4U l4u) {
        super(5);
        this.this$0 = c_a;
        this.$mAdapter = l4u;
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* synthetic */ Unit invoke(Integer num, String str, Integer num2, Integer num3, String str2) {
        C2990g c2990g;
        int intValue = num.intValue();
        String str3 = str;
        Integer num4 = num2;
        Integer num5 = num3;
        String str4 = str2;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str3, num4, num5, str4}, this, changeQuickRedirect, false, 1).isSupported) {
            View view = this.this$0.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            Context context = view.getContext();
            if (context != null && (c2990g = this.this$0.LIZLLL) != null) {
                C2990g.LIZ(c2990g, context, intValue, str3, num4, num5, str4, null, null, null, new C3126x1673e59c(this, intValue, str3, num4, num5, str4), 448, null);
            }
        }
        return Unit.INSTANCE;
    }
}
