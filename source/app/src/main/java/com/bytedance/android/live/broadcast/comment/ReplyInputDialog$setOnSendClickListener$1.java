package com.bytedance.android.live.broadcast.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class ReplyInputDialog$setOnSendClickListener$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $action;

    static {
        Covode.recordClassIndex(15249);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplyInputDialog$setOnSendClickListener$1(Function1 function1) {
        super(1);
        this.$action = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            this.$action.invoke(str);
        }
        return Unit.INSTANCE;
    }
}
