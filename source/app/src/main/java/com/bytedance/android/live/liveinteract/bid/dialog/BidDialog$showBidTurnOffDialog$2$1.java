package com.bytedance.android.live.liveinteract.bid.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.DialogC78477Gwh;

/* loaded from: classes.dex */
public final /* synthetic */ class BidDialog$showBidTurnOffDialog$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25234);
    }

    public BidDialog$showBidTurnOffDialog$2$1(DialogC78477Gwh dialogC78477Gwh) {
        super(0, dialogC78477Gwh, DialogC78477Gwh.class, "closeBidPanel", "closeBidPanel()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ((DialogC78477Gwh) this.receiver).LIZLLL();
        }
        return Unit.INSTANCE;
    }
}
