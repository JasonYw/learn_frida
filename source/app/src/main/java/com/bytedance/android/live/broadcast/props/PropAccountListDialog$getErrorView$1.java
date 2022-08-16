package com.bytedance.android.live.broadcast.props;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.DialogC89183LBx;

/* loaded from: classes5.dex */
public final class PropAccountListDialog$getErrorView$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC89183LBx this$0;

    static {
        Covode.recordClassIndex(17580);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropAccountListDialog$getErrorView$1(DialogC89183LBx dialogC89183LBx) {
        super(0);
        this.this$0 = dialogC89183LBx;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJI();
        }
        return Unit.INSTANCE;
    }
}
