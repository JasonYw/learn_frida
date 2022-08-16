package com.bytedance.android.live.liveinteract.voicechat.match;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.RunnableC78871H7h;

/* loaded from: classes3.dex */
public final class ChatMatchDialog$startMatch$$inlined$let$lambda$1$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ RunnableC78871H7h this$0;

    static {
        Covode.recordClassIndex(31462);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMatchDialog$startMatch$$inlined$let$lambda$1$1(RunnableC78871H7h runnableC78871H7h) {
        super(0);
        this.this$0 = runnableC78871H7h;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZ(this.this$0.LIZJ.LIZLLL, 0);
        }
        return Unit.INSTANCE;
    }
}
