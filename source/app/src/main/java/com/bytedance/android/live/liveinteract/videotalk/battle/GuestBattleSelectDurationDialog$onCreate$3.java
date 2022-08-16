package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC77486Ggi;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC77488Ggk;

/* loaded from: classes3.dex */
public final class GuestBattleSelectDurationDialog$onCreate$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77488Ggk this$0;

    static {
        Covode.recordClassIndex(29818);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleSelectDurationDialog$onCreate$3(DialogC77488Ggk dialogC77488Ggk) {
        super(1);
        this.this$0 = dialogC77488Ggk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC77486Ggi abstractC77486Ggi = this.this$0.LIZLLL;
            Integer num = this.this$0.LIZJ;
            Intrinsics.checkNotNullExpressionValue(num, "");
            abstractC77486Ggi.LIZ(num.intValue());
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
