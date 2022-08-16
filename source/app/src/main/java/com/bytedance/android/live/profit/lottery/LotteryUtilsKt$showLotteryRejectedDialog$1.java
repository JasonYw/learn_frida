package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.DialogC88906L1g;

/* loaded from: classes12.dex */
public final class LotteryUtilsKt$showLotteryRejectedDialog$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC88906L1g $dlg;

    static {
        Covode.recordClassIndex(33432);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryUtilsKt$showLotteryRejectedDialog$1(DialogC88906L1g dialogC88906L1g) {
        super(0);
        this.$dlg = dialogC88906L1g;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        DialogC88906L1g dialogC88906L1g;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (dialogC88906L1g = this.$dlg) != null) {
            C116971W2r.LIZ(dialogC88906L1g);
        }
        return Unit.INSTANCE;
    }
}
