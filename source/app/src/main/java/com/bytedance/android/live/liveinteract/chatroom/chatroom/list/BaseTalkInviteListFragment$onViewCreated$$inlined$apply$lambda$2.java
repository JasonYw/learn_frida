package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78156GrW;
import p003X.C106862S5w;
import p003X.C78299Gtp;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$2 extends Lambda implements Function1<LinkPlayerInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $view$inlined;
    public final /* synthetic */ AbstractC78156GrW this$0;

    static {
        Covode.recordClassIndex(26156);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$2(AbstractC78156GrW abstractC78156GrW, View view) {
        super(1);
        this.this$0 = abstractC78156GrW;
        this.$view$inlined = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LinkPlayerInfo linkPlayerInfo) {
        String str;
        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
        if (!PatchProxy.proxy(new Object[]{linkPlayerInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(linkPlayerInfo2);
            User LIZ = linkPlayerInfo2.LIZ();
            if (LIZ != null) {
                ((g$a) this.this$0.LJIIIZ).LIZ(linkPlayerInfo2);
                C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
                boolean LJIIL = this.this$0.LJIIL();
                long id = LIZ.getId();
                boolean z = linkPlayerInfo2.LJIJI;
                DataCenter LJIILL = this.this$0.LJIILL();
                if (LJIILL != null) {
                    str = (String) LJIILL.get("data_task_name_when_open_invite_panel", "");
                } else {
                    str = null;
                }
                C78299Gtp.LIZ(c78299Gtp, LJIIL, id, z, "icon", LIZ.isSubscriber(), str, null, 64, null);
            }
        }
        return Unit.INSTANCE;
    }
}
