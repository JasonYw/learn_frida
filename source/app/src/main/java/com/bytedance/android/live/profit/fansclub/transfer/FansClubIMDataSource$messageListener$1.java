package com.bytedance.android.live.profit.fansclub.transfer;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C4BC;

/* loaded from: classes12.dex */
public final /* synthetic */ class FansClubIMDataSource$messageListener$1 extends FunctionReferenceImpl implements Function1<IMessage, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33332);
    }

    public FansClubIMDataSource$messageListener$1(C4BC c4bc) {
        super(1, c4bc, C4BC.class, "onMessage", "onMessage(Lcom/ss/ugc/live/sdk/message/data/IMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (!PatchProxy.proxy(new Object[]{iMessage2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iMessage2);
            ((C4BC) this.receiver).LIZ(iMessage2);
        }
        return Unit.INSTANCE;
    }
}
