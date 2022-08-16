package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.room.p781a.AbstractC9661d;
import com.bytedance.android.livesdkapi.room.p783c.C9664b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C86828KJi;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$realOnViewCreated$14$1 extends Lambda implements Function1<AbstractC9661d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86828KJi this$0;

    static {
        Covode.recordClassIndex(17184);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$realOnViewCreated$14$1(C86828KJi c86828KJi) {
        super(1);
        this.this$0 = c86828KJi;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC9661d abstractC9661d) {
        C9664b LIZ;
        AbstractC9661d abstractC9661d2 = abstractC9661d;
        if (!PatchProxy.proxy(new Object[]{abstractC9661d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC9661d2);
            KJV kjv = this.this$0.LIZIZ;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], kjv, KJV.LIZ, false, 78);
            if (proxy.isSupported) {
                LIZ = (C9664b) proxy.result;
            } else {
                IService service = ServiceManager.getService(IUserService.class);
                Intrinsics.checkNotNull(service);
                IUser LIZ2 = ((IUserService) service).user().LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                LIZ = kjv.LIZ(LIZ2);
            }
            abstractC9661d2.LIZ(LIZ);
        }
        return Unit.INSTANCE;
    }
}
