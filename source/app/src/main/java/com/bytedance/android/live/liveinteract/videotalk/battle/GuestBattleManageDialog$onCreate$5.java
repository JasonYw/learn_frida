package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78242Gsu;
import p003X.DialogC77516GhC;

/* loaded from: classes3.dex */
public final class GuestBattleManageDialog$onCreate$5 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77516GhC this$0;

    static {
        Covode.recordClassIndex(29809);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleManageDialog$onCreate$5(DialogC77516GhC dialogC77516GhC) {
        super(1);
        this.this$0 = dialogC77516GhC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C78242Gsu c78242Gsu = C78242Gsu.LIZIZ;
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C78242Gsu.LIZ(c78242Gsu, context, 9, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
