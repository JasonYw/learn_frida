package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.base.model.user.C2852e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveWidget$handleMediaViewChange$3 extends Lambda implements Function1<C2852e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveWidget$handleMediaViewChange$1 $changeClickBtnBg$1;
    public final /* synthetic */ Ref.BooleanRef $isCoverValid;

    static {
        Covode.recordClassIndex(18811);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$handleMediaViewChange$3(Ref.BooleanRef booleanRef, StartLiveWidget$handleMediaViewChange$1 startLiveWidget$handleMediaViewChange$1) {
        super(1);
        this.$isCoverValid = booleanRef;
        this.$changeClickBtnBg$1 = startLiveWidget$handleMediaViewChange$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2852e c2852e) {
        LIZ(c2852e);
        return Unit.INSTANCE;
    }

    public final void LIZ(C2852e c2852e) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{c2852e}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2852e);
        Ref.BooleanRef booleanRef = this.$isCoverValid;
        if (c2852e.LIZJ == null) {
            z = false;
        }
        booleanRef.element = z;
        this.$changeClickBtnBg$1.LIZ();
    }
}
