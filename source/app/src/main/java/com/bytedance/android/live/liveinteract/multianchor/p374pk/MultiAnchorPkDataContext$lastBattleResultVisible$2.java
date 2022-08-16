package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C81908IQc;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.MultiAnchorPkDataContext$lastBattleResultVisible$2 */
/* loaded from: classes12.dex */
public final class MultiAnchorPkDataContext$lastBattleResultVisible$2 extends Lambda implements Function1<C81908IQc<Boolean>, Unit> {
    public static final MultiAnchorPkDataContext$lastBattleResultVisible$2 INSTANCE = new MultiAnchorPkDataContext$lastBattleResultVisible$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28166);
    }

    public MultiAnchorPkDataContext$lastBattleResultVisible$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C81908IQc<Boolean> c81908IQc) {
        C81908IQc<Boolean> c81908IQc2 = c81908IQc;
        if (!PatchProxy.proxy(new Object[]{c81908IQc2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c81908IQc2);
            c81908IQc2.f7561LJ = null;
        }
        return Unit.INSTANCE;
    }
}
