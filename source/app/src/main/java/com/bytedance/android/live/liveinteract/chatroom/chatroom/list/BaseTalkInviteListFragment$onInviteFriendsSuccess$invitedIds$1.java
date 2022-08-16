package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListFragment$onInviteFriendsSuccess$invitedIds$1 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig.AbstractC5787a, Boolean> {
    public static final BaseTalkInviteListFragment$onInviteFriendsSuccess$invitedIds$1 INSTANCE = new BaseTalkInviteListFragment$onInviteFriendsSuccess$invitedIds$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26151);
    }

    public BaseTalkInviteListFragment$onInviteFriendsSuccess$invitedIds$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a) {
        boolean LIZ;
        IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a2 = abstractC5787a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5787a2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(abstractC5787a2);
            LIZ = abstractC5787a2.LIZ();
        }
        return Boolean.valueOf(LIZ);
    }
}
