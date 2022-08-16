package com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.vm.LinkBidViewModel$1 */
/* loaded from: classes3.dex */
public final class LinkBidViewModel$1 extends Lambda implements Function1<IMessageManager, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4378a this$0;

    static {
        Covode.recordClassIndex(26458);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBidViewModel$1(C4378a c4378a) {
        super(1);
        this.this$0 = c4378a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IMessageManager iMessageManager) {
        IMessageManager iMessageManager2 = iMessageManager;
        if (!PatchProxy.proxy(new Object[]{iMessageManager2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iMessageManager2);
            iMessageManager2.addMessageListener(MessageType.LINK_MIC_PROFIT.LIZ(), this.this$0);
        }
        return Unit.INSTANCE;
    }
}
