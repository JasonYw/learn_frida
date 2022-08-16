package com.bytedance.android.live.liveinteract.interact.audience;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.HCD;

/* loaded from: classes3.dex */
public final class InteractAudienceGuestWidget$onCreate$8 extends Lambda implements Function1<Unit, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ InteractAudienceGuestWidget this$0;

    static {
        Covode.recordClassIndex(27014);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractAudienceGuestWidget$onCreate$8(InteractAudienceGuestWidget interactAudienceGuestWidget) {
        super(1);
        this.this$0 = interactAudienceGuestWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Unit unit) {
        if (!PatchProxy.proxy(new Object[]{unit}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(unit);
            InteractAudienceGuestWidget interactAudienceGuestWidget = this.this$0;
            String str = HCD.LIZJ;
            Intrinsics.checkNotNullExpressionValue(str, "");
            interactAudienceGuestWidget.LIZ(str, true);
        }
        return Unit.INSTANCE;
    }
}
