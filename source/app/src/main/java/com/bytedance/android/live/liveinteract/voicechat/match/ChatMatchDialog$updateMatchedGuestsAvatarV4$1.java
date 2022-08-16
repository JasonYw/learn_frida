package com.bytedance.android.live.liveinteract.voicechat.match;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.livesdk.chatroom.model.C6192s;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class ChatMatchDialog$updateMatchedGuestsAvatarV4$1 extends Lambda implements Function2<C6192s, List<AnchorLinkUser>, Unit> {
    public static final ChatMatchDialog$updateMatchedGuestsAvatarV4$1 INSTANCE = new ChatMatchDialog$updateMatchedGuestsAvatarV4$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31464);
    }

    public ChatMatchDialog$updateMatchedGuestsAvatarV4$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(C6192s c6192s, List<AnchorLinkUser> list) {
        LIZ(c6192s, list);
        return Unit.INSTANCE;
    }

    public final void LIZ(C6192s c6192s, List<AnchorLinkUser> list) {
        if (PatchProxy.proxy(new Object[]{c6192s, list}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6192s, list);
        Iterator<AnchorLinkUser> it = list.iterator();
        while (it.hasNext()) {
            User user = c6192s.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(user, "");
            long id = user.getId();
            User user2 = it.next().LIZIZ;
            Intrinsics.checkNotNullExpressionValue(user2, "");
            if (id == user2.getId()) {
                it.remove();
            }
        }
    }
}
