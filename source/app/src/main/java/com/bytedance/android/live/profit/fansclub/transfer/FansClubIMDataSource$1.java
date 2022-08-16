package com.bytedance.android.live.profit.fansclub.transfer;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.functions.Action;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4BC;
import p003X.QB4;
import p003X.QVQ;

/* loaded from: classes12.dex */
public final class FansClubIMDataSource$1 extends Lambda implements Function1<IMessageManager, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4BC this$0;

    static {
        Covode.recordClassIndex(33330);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansClubIMDataSource$1(C4BC c4bc) {
        super(1);
        this.this$0 = c4bc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IMessageManager iMessageManager) {
        final IMessageManager iMessageManager2 = iMessageManager;
        if (!PatchProxy.proxy(new Object[]{iMessageManager2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iMessageManager2);
            iMessageManager2.addMessageListener(MessageType.FANS_CLUB.LIZ(), this.this$0.LIZJ);
            iMessageManager2.addMessageListener(MessageType.FANS_CLUB_STATISTICS.LIZ(), this.this$0.LIZJ);
            iMessageManager2.addMessageListener(MessageType.FANS_CLUB_REVIEW.LIZ(), this.this$0.LIZJ);
            iMessageManager2.addMessageListener(MessageType.SUBSCRIBE_INFO.LIZ(), this.this$0.LIZJ);
            QB4.LIZ(QVQ.LIZ(new Action() { // from class: com.bytedance.android.live.profit.fansclub.transfer.FansClubIMDataSource$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33331);
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    iMessageManager2.removeMessageListener(FansClubIMDataSource$1.this.this$0.LIZJ);
                }
            }), this.this$0.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
