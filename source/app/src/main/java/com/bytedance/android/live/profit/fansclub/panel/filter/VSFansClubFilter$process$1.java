package com.bytedance.android.live.profit.fansclub.panel.filter;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.utils.C9303cy;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC134584bxD;
import p003X.C106862S5w;
import p003X.C4AY;

/* loaded from: classes12.dex */
public final class VSFansClubFilter$process$1 extends Lambda implements Function1<C9303cy, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4AY this$0;

    static {
        Covode.recordClassIndex(33314);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VSFansClubFilter$process$1(C4AY c4ay) {
        super(1);
        this.this$0 = c4ay;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C9303cy c9303cy) {
        LIZ(c9303cy);
        return Unit.INSTANCE;
    }

    public final void LIZ(C9303cy c9303cy) {
        String str;
        if (PatchProxy.proxy(new Object[]{c9303cy}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9303cy);
        IUser LIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        AbstractC134584bxD abstractC134584bxD = this.this$0.LIZIZ;
        if (abstractC134584bxD == null) {
            abstractC134584bxD = this.this$0.LIZJ.LIZ().LIZ();
        }
        AbstractC134584bxD abstractC134584bxD2 = abstractC134584bxD;
        c9303cy.LIZ("room_id", String.valueOf(abstractC134584bxD2.getId()));
        c9303cy.LIZ("anchor_id", String.valueOf(abstractC134584bxD2.getOwnerUserId()));
        User owner = abstractC134584bxD2.getOwner();
        if (owner == null || (str = owner.getSecUid()) == null) {
            str = "";
        }
        c9303cy.LIZ("sec_anchor_id", str);
        c9303cy.LIZ("user_id", String.valueOf(LIZ.getId()));
        String secUid = LIZ.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        c9303cy.LIZ("sec_user_id", secUid);
    }
}
