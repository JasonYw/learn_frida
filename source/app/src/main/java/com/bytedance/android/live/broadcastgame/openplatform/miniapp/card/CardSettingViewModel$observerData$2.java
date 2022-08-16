package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3801k;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C1KL;
import p003X.C87838KjI;

/* loaded from: classes5.dex */
public final class CardSettingViewModel$observerData$2 extends Lambda implements Function1<C3801k, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3796c this$0;

    static {
        Covode.recordClassIndex(21532);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSettingViewModel$observerData$2(C3796c c3796c) {
        super(1);
        this.this$0 = c3796c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3801k c3801k) {
        C87838KjI c87838KjI;
        PageDataV2 pageDataV2;
        C3801k c3801k2 = c3801k;
        if (!PatchProxy.proxy(new Object[]{c3801k2}, this, changeQuickRedirect, false, 1).isSupported) {
            C3796c c3796c = this.this$0;
            PageDataV2.ReviewStatus reviewStatus = c3801k2.LIZ;
            if (!PatchProxy.proxy(new Object[]{reviewStatus}, c3796c, C3796c.LIZ, false, 19).isSupported) {
                c3796c.LIZ((C1KL<C1KL<PageDataV2.ReviewStatus>>) c3796c.LJII(), (C1KL<PageDataV2.ReviewStatus>) reviewStatus);
                if (reviewStatus == PageDataV2.ReviewStatus.REVIEW_REJECT) {
                    PageDataV2 pageDataV22 = c3796c.LIZJ;
                    if (pageDataV22 != null && (c87838KjI = pageDataV22.LJIIIIZZ) != null && (pageDataV2 = c3796c.LIZJ) != null) {
                        pageDataV2.LIZ(c87838KjI);
                    }
                } else if (reviewStatus == PageDataV2.ReviewStatus.REVIEW_PASS) {
                    c3796c.LIZ((C1KL<C1KL<Pair<C8733af, C3561g>>>) c3796c.LIZJ(), (C1KL<Pair<C8733af, C3561g>>) c3796c.LIZJ().LIZ());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
