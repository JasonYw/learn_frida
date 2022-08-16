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
public final class BaseTalkInviteListFragment$onInviteFriendsSuccess$invitedIds$2 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig.AbstractC5787a, String> {
    public static final BaseTalkInviteListFragment$onInviteFriendsSuccess$invitedIds$2 INSTANCE = new BaseTalkInviteListFragment$onInviteFriendsSuccess$invitedIds$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26152);
    }

    public BaseTalkInviteListFragment$onInviteFriendsSuccess$invitedIds$2() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a) {
        IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a2 = abstractC5787a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5787a2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(abstractC5787a2);
        return abstractC5787a2.LIZIZ();
    }
}
