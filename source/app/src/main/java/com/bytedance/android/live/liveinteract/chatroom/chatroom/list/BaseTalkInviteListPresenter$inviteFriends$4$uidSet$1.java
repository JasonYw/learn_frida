package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class BaseTalkInviteListPresenter$inviteFriends$4$uidSet$1 extends Lambda implements Function1<Long, String> {
    public static final BaseTalkInviteListPresenter$inviteFriends$4$uidSet$1 INSTANCE = new BaseTalkInviteListPresenter$inviteFriends$4$uidSet$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26167);
    }

    public BaseTalkInviteListPresenter$inviteFriends$4$uidSet$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(Long l) {
        long longValue = l.longValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return String.valueOf(longValue);
    }
}
