package com.bytedance.android.live.liveinteract.interact.audience.context;

import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C79046HEa;
import p003X.HJ9;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.context.d */
/* loaded from: classes3.dex */
public final class C4428d extends C13491f implements OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public IMessageManager LIZJ;

    static {
        Covode.recordClassIndex(27105);
    }

    public C4428d(IMessageManager iMessageManager) {
        C106862S5w.LIZ(iMessageManager);
        this.LIZJ = iMessageManager;
        this.LIZJ.addMessageListener(MessageType.LINKER.LIZ(), this);
        this.LIZIZ.add(LLLLIIIILLL().subscribe(new HJ9(this)));
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 1).isSupported && iMessage != null && (iMessage instanceof C8874fl) && ((C8874fl) iMessage).LIZIZ == 22) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            Integer num = (Integer) LIZ2.LJJIIZI;
            if (num != null && num.intValue() == 1) {
                C79046HEa.LIZ().LIZ((Integer) 0);
            }
        }
    }
}
