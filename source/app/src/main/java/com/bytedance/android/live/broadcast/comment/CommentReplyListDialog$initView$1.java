package com.bytedance.android.live.broadcast.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.LAZ;

/* loaded from: classes3.dex */
public final class CommentReplyListDialog$initView$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LAZ this$0;

    static {
        Covode.recordClassIndex(15231);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReplyListDialog$initView$1(LAZ laz) {
        super(0);
        this.this$0 = laz;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
