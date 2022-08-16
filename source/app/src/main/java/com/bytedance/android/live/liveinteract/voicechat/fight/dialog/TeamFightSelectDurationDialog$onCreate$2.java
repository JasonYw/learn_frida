package com.bytedance.android.live.liveinteract.voicechat.fight.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC77498Ggu;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC77493Ggp;

/* loaded from: classes3.dex */
public final class TeamFightSelectDurationDialog$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77493Ggp this$0;

    static {
        Covode.recordClassIndex(31366);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamFightSelectDurationDialog$onCreate$2(DialogC77493Ggp dialogC77493Ggp) {
        super(1);
        this.this$0 = dialogC77493Ggp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC77498Ggu abstractC77498Ggu = this.this$0.LIZJ;
            Integer num = this.this$0.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(num, "");
            abstractC77498Ggu.LIZ(num.intValue());
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
