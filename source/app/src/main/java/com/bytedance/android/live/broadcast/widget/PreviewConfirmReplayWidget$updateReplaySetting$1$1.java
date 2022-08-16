package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.C2922y;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C87308Kak;

/* loaded from: classes12.dex */
public final class PreviewConfirmReplayWidget$updateReplaySetting$1$1 extends Lambda implements Function1<C2922y, Unit> {
    public static final PreviewConfirmReplayWidget$updateReplaySetting$1$1 INSTANCE = new PreviewConfirmReplayWidget$updateReplaySetting$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18476);
    }

    public PreviewConfirmReplayWidget$updateReplaySetting$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2922y c2922y) {
        C2922y c2922y2 = c2922y;
        if (!PatchProxy.proxy(new Object[]{c2922y2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2922y2);
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLZIIL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.valueOf(c2922y2.LIZ));
            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLZIL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(Boolean.valueOf(c2922y2.LIZIZ));
            C87308Kak<Boolean> c87308Kak3 = AbstractC80293Hkt.LLLZL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
            c87308Kak3.LIZ(Boolean.valueOf(c2922y2.LIZJ));
            C87308Kak<Boolean> c87308Kak4 = AbstractC80293Hkt.LLLZLZ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak4, "");
            c87308Kak4.LIZ(Boolean.valueOf(c2922y2.LIZLLL));
            C87308Kak<Boolean> c87308Kak5 = AbstractC80293Hkt.LLZ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak5, "");
            c87308Kak5.LIZ(Boolean.valueOf(c2922y2.f25783LJ));
        }
        return Unit.INSTANCE;
    }
}
