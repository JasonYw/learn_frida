package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListPresenter$inviteFriends$4$filteredList$2 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig.AbstractC5787a, Unit> {
    public static final BaseTalkInviteListPresenter$inviteFriends$4$filteredList$2 INSTANCE = new BaseTalkInviteListPresenter$inviteFriends$4$filteredList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26166);
    }

    public BaseTalkInviteListPresenter$inviteFriends$4$filteredList$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a) {
        IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a2 = abstractC5787a;
        if (!PatchProxy.proxy(new Object[]{abstractC5787a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC5787a2);
            abstractC5787a2.LIZ(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
