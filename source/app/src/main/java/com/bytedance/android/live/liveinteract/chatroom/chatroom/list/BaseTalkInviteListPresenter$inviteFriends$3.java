package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78145GrL;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListPresenter$inviteFriends$3 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig.AbstractC5787a, Long> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC78145GrL this$0;

    static {
        Covode.recordClassIndex(26164);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListPresenter$inviteFriends$3(AbstractC78145GrL abstractC78145GrL) {
        super(1);
        this.this$0 = abstractC78145GrL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: LIZ */
    public Long invoke(IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a) {
        Object createFailure;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5787a}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        C106862S5w.LIZ(abstractC5787a);
        try {
            createFailure = Long.valueOf(Long.parseLong(abstractC5787a.LIZIZ()));
            Result.m30308constructorimpl(createFailure);
        } catch (Throwable th) {
            createFailure = ResultKt.createFailure(th);
            Result.m30308constructorimpl(createFailure);
        }
        if (Result.m30314isFailureimpl(createFailure)) {
            createFailure = null;
        }
        return (Long) createFailure;
    }
}
