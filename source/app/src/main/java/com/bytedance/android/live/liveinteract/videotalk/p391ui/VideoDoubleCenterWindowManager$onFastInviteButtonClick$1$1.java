package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78986HBs;
import p003X.C106862S5w;
import p003X.C78135GrB;
import p003X.HKN;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.VideoDoubleCenterWindowManager$onFastInviteButtonClick$1$1 */
/* loaded from: classes3.dex */
public final class VideoDoubleCenterWindowManager$onFastInviteButtonClick$1$1 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78135GrB this$0;

    static {
        Covode.recordClassIndex(30463);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDoubleCenterWindowManager$onFastInviteButtonClick$1$1(C78135GrB c78135GrB) {
        super(1);
        this.this$0 = c78135GrB;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IHostSocial.InviteFriendsConfig inviteFriendsConfig) {
        IHostSocial.InviteFriendsConfig inviteFriendsConfig2 = inviteFriendsConfig;
        if (!PatchProxy.proxy(new Object[]{inviteFriendsConfig2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(inviteFriendsConfig2);
            HKN.LIZ(inviteFriendsConfig2, (String) null, this.this$0.LIZIZ.LJJIFFI, false, true, false, 1, (Object) null);
            inviteFriendsConfig2.LIZ(C49621.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.VideoDoubleCenterWindowManager$onFastInviteButtonClick$1$1$1 */
    /* loaded from: classes3.dex */
    public static final class C49621 extends Lambda implements Function1<Long, Boolean> {
        public static final C49621 INSTANCE = new C49621();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30464);
        }

        public C49621() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(Long l) {
            List<LinkPlayerInfo> LIZJ;
            long longValue = l.longValue();
            boolean z = true;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                z = ((Boolean) proxy.result).booleanValue();
            } else {
                AbstractC78986HBs<LinkPlayerInfo> LIZIZ = HKN.LIZIZ();
                if (LIZIZ != null && (LIZJ = LIZIZ.LIZJ()) != null && (!(LIZJ instanceof Collection) || !LIZJ.isEmpty())) {
                    Iterator<T> it = LIZJ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) it.next();
                        Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                        User LIZ = linkPlayerInfo.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ, "");
                        if (LIZ.getId() == longValue) {
                            z = false;
                            break;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }
}
