package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.livesdkapi.room.p781a.AbstractC9661d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C3VF;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$realOnViewCreated$$inlined$let$lambda$1 extends Lambda implements Function1<AbstractC9661d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3VF $userCenter;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17180);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$realOnViewCreated$$inlined$let$lambda$1(C3VF c3vf, KJV kjv) {
        super(1);
        this.$userCenter = c3vf;
        this.this$0 = kjv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC9661d abstractC9661d) {
        AbstractC9661d abstractC9661d2 = abstractC9661d;
        if (!PatchProxy.proxy(new Object[]{abstractC9661d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC9661d2);
            KJV kjv = this.this$0;
            IUser LIZ = this.$userCenter.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            abstractC9661d2.LIZ(kjv.LIZ(LIZ));
        }
        return Unit.INSTANCE;
    }
}
