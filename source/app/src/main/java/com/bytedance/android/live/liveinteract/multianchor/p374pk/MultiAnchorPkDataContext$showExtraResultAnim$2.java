package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.HNT;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.MultiAnchorPkDataContext$showExtraResultAnim$2 */
/* loaded from: classes12.dex */
public final class MultiAnchorPkDataContext$showExtraResultAnim$2 extends Lambda implements Function1<HNT<Boolean>, Unit> {
    public static final MultiAnchorPkDataContext$showExtraResultAnim$2 INSTANCE = new MultiAnchorPkDataContext$showExtraResultAnim$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28167);
    }

    public MultiAnchorPkDataContext$showExtraResultAnim$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(HNT<Boolean> hnt) {
        HNT<Boolean> hnt2 = hnt;
        if (!PatchProxy.proxy(new Object[]{hnt2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(hnt2);
            hnt2.f7561LJ = null;
        }
        return Unit.INSTANCE;
    }
}
