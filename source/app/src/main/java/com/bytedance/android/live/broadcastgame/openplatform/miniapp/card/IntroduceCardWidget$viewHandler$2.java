package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.room.handler.AbstractC9669d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WD;
import p003X.C88098KnU;

/* loaded from: classes5.dex */
public final class IntroduceCardWidget$viewHandler$2 extends Lambda implements Function0<AbstractC9669d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88098KnU this$0;

    static {
        Covode.recordClassIndex(21544);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroduceCardWidget$viewHandler$2(C88098KnU c88098KnU) {
        super(0);
        this.this$0 = c88098KnU;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.livesdkapi.room.handler.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC9669d mo30099invoke() {
        C2WD<AbstractC9669d> LLJLLIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C5923dp LIZ = C5923dp.LJIIJ.LIZ(null, this.this$0.f8607LJ);
        if (LIZ == null || (LLJLLIL = LIZ.LLJLLIL()) == null) {
            return null;
        }
        return LLJLLIL.LIZ();
    }
}
