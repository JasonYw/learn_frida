package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.announcement.IAnnouncementService;
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
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$realOnViewCreated$9 extends Lambda implements Function1<PermissionResult, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17187);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$realOnViewCreated$9(KJV kjv) {
        super(1);
        this.this$0 = kjv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PermissionResult permissionResult) {
        PermissionResult permissionResult2 = permissionResult;
        if (!PatchProxy.proxy(new Object[]{permissionResult2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(permissionResult2);
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7110cf;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.valueOf(true ^ this.this$0.LJIIIZ));
            KJV kjv = this.this$0;
            kjv.LIZ(kjv.LJIIIIZZ);
            ((IAnnouncementService) ServiceManager.getService(IAnnouncementService.class)).setAnnouncementInfo(this.this$0.getContext(), permissionResult2.announcementInfo);
        }
        return Unit.INSTANCE;
    }
}
