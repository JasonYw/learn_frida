package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.AbstractC78119Gqv;
import p003X.C106862S5w;
import p003X.HKN;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListFragmentV2$onInviteFriendSuccess$1 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $room;
    public final /* synthetic */ AbstractC78119Gqv this$0;

    static {
        Covode.recordClassIndex(26160);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListFragmentV2$onInviteFriendSuccess$1(AbstractC78119Gqv abstractC78119Gqv, Ref.ObjectRef objectRef) {
        super(1);
        this.this$0 = abstractC78119Gqv;
        this.$room = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IHostSocial.InviteFriendsConfig inviteFriendsConfig) {
        IHostSocial.InviteFriendsConfig inviteFriendsConfig2 = inviteFriendsConfig;
        if (!PatchProxy.proxy(new Object[]{inviteFriendsConfig2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(inviteFriendsConfig2);
            HKN.LIZ(inviteFriendsConfig2, (String) null, (Room) this.$room.element, true, false, false, 1, (Object) null);
            inviteFriendsConfig2.LIZ(this.this$0.LJIJ);
        }
        return Unit.INSTANCE;
    }
}
