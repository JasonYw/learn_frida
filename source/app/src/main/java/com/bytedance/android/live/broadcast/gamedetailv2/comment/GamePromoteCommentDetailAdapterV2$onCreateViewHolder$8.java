package com.bytedance.android.live.broadcast.gamedetailv2.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.L4U;

/* loaded from: classes.dex */
public final class GamePromoteCommentDetailAdapterV2$onCreateViewHolder$8 extends Lambda implements Function2<Integer, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L4U this$0;

    static {
        Covode.recordClassIndex(16610);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteCommentDetailAdapterV2$onCreateViewHolder$8(L4U l4u) {
        super(2);
        this.this$0 = l4u;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        int intValue = num.intValue();
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJI.invoke(Boolean.valueOf(booleanValue));
        }
        return Unit.INSTANCE;
    }
}
