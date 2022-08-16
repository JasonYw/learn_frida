package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78156GrW;
import p003X.C106862S5w;
import p003X.HKN;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListFragment$onInviteFriendSuccess$1 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Room $room;
    public final /* synthetic */ AbstractC78156GrW this$0;

    static {
        Covode.recordClassIndex(26148);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListFragment$onInviteFriendSuccess$1(AbstractC78156GrW abstractC78156GrW, Room room) {
        super(1);
        this.this$0 = abstractC78156GrW;
        this.$room = room;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IHostSocial.InviteFriendsConfig inviteFriendsConfig) {
        IHostSocial.InviteFriendsConfig inviteFriendsConfig2 = inviteFriendsConfig;
        if (!PatchProxy.proxy(new Object[]{inviteFriendsConfig2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(inviteFriendsConfig2);
            HKN.LIZ(inviteFriendsConfig2, (String) null, this.$room, this.this$0.LJIIL(), this.this$0.LJIIJ(), this.this$0.LJIILJJIL(), 1, (Object) null);
            inviteFriendsConfig2.LIZ(this.this$0.LJIL);
        }
        return Unit.INSTANCE;
    }
}
