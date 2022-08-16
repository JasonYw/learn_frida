package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78119Gqv;
import p003X.C106862S5w;
import p003X.C78299Gtp;
import p003X.C78828H5q;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.list.BaseTalkInviteListFragmentV2$onViewCreated$$inlined$apply$lambda$1 */
/* loaded from: classes3.dex */
public final class C4355xb972653 extends Lambda implements Function1<LinkPlayerInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC78119Gqv this$0;

    static {
        Covode.recordClassIndex(26161);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4355xb972653(AbstractC78119Gqv abstractC78119Gqv) {
        super(1);
        this.this$0 = abstractC78119Gqv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LinkPlayerInfo linkPlayerInfo) {
        String str;
        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
        if (!PatchProxy.proxy(new Object[]{linkPlayerInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(linkPlayerInfo2);
            if (linkPlayerInfo2.LIZ() != null) {
                AbstractC78119Gqv abstractC78119Gqv = this.this$0;
                if (!PatchProxy.proxy(new Object[]{linkPlayerInfo2}, abstractC78119Gqv, AbstractC78119Gqv.LIZIZ, false, 5).isSupported) {
                    if (linkPlayerInfo2.LJJIFFI == 1) {
                        ((g$a) abstractC78119Gqv.LJIIIZ).LIZ(linkPlayerInfo2, 1);
                        if (abstractC78119Gqv.LJIILJJIL) {
                            str = "administrator";
                        } else {
                            str = "anchor";
                        }
                        User LIZ = linkPlayerInfo2.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ, "");
                        C78828H5q.LIZ(str, LIZ.getId(), "mutual_page", 0, 8, (Object) null);
                    } else {
                        ((g$a) abstractC78119Gqv.LJIIIZ).LIZ(linkPlayerInfo2);
                        C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
                        boolean z = !abstractC78119Gqv.LJIILL;
                        User LIZ2 = linkPlayerInfo2.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        long id = LIZ2.getId();
                        User LIZ3 = linkPlayerInfo2.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                        C78299Gtp.LIZ(c78299Gtp, z, id, true, "mutual_page", LIZ3.isSubscriber(), null, null, 96, null);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
