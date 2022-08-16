package com.bytedance.android.live.broadcast.anchorshow;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C89433LLn;

/* loaded from: classes5.dex */
public final class AddAnchorShowDialog$mItemDeleteClickListener$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89433LLn this$0;

    static {
        Covode.recordClassIndex(14356);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAnchorShowDialog$mItemDeleteClickListener$1(C89433LLn c89433LLn) {
        super(1);
        this.this$0 = c89433LLn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            C89433LLn c89433LLn = this.this$0;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, c89433LLn, C89433LLn.LIZ, false, 17).isSupported) {
                c89433LLn.LIZ(c89433LLn.LIZ().LIZ(intValue));
            }
        }
        return Unit.INSTANCE;
    }
}
