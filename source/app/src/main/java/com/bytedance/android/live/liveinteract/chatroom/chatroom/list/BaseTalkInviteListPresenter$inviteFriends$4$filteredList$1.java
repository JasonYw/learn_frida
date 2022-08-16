package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListPresenter$inviteFriends$4$filteredList$1 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig.AbstractC5787a, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Set $uidSet;

    static {
        Covode.recordClassIndex(26165);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListPresenter$inviteFriends$4$filteredList$1(Set set) {
        super(1);
        this.$uidSet = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a) {
        IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a2 = abstractC5787a;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5787a2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(abstractC5787a2);
            if (abstractC5787a2.LIZ() && !this.$uidSet.contains(abstractC5787a2.LIZIZ())) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
