package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.base.model.user.C2852e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveWidget$handleMediaViewChange$4 extends Lambda implements Function1<C2852e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveWidget$handleMediaViewChange$3 $onCoverChange$3;

    static {
        Covode.recordClassIndex(18812);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$handleMediaViewChange$4(StartLiveWidget$handleMediaViewChange$3 startLiveWidget$handleMediaViewChange$3) {
        super(1);
        this.$onCoverChange$3 = startLiveWidget$handleMediaViewChange$3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2852e c2852e) {
        C2852e c2852e2 = c2852e;
        if (!PatchProxy.proxy(new Object[]{c2852e2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2852e2);
            this.$onCoverChange$3.LIZ(c2852e2);
        }
        return Unit.INSTANCE;
    }
}
