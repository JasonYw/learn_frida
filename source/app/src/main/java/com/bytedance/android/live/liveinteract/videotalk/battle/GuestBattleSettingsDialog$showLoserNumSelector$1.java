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
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C87308Kak;
import p003X.DialogC77484Ggg;
import p003X.DialogC77489Ggl;

/* loaded from: classes3.dex */
public final class GuestBattleSettingsDialog$showLoserNumSelector$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77484Ggg this$0;

    static {
        Covode.recordClassIndex(29823);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleSettingsDialog$showLoserNumSelector$1(DialogC77484Ggg dialogC77484Ggg) {
        super(1);
        this.this$0 = dialogC77484Ggg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7133dB;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Integer LIZ = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            C116971W2r.LIZJ(new DialogC77489Ggl(context, LIZ.intValue(), this.this$0.LIZJ(), this.this$0));
        }
        return Unit.INSTANCE;
    }
}
