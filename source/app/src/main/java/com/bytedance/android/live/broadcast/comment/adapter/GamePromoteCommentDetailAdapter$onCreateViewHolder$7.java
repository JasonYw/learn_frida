package com.bytedance.android.live.broadcast.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.L4O;

/* loaded from: classes.dex */
public final class GamePromoteCommentDetailAdapter$onCreateViewHolder$7 extends Lambda implements Function2<Integer, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L4O this$0;

    static {
        Covode.recordClassIndex(15266);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteCommentDetailAdapter$onCreateViewHolder$7(L4O l4o) {
        super(2);
        this.this$0 = l4o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        int intValue = num.intValue();
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue) {
            this.this$0.LIZLLL.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
