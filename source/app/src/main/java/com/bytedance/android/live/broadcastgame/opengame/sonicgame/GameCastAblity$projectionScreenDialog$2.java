package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import com.bytedance.android.live.broadcastgame.opengame.view.DialogC3739w;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87995Klp;

/* loaded from: classes5.dex */
public final class GameCastAblity$projectionScreenDialog$2 extends Lambda implements Function0<DialogC3739w> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87995Klp this$0;

    static {
        Covode.recordClassIndex(21094);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCastAblity$projectionScreenDialog$2(C87995Klp c87995Klp) {
        super(0);
        this.this$0 = c87995Klp;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.sonicgame.GameCastAblity$projectionScreenDialog$2$1 */
    /* loaded from: classes5.dex */
    public static final class C37211 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21095);
        }

        public C37211() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                GameCastAblity$projectionScreenDialog$2.this.this$0.LIZIZ();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.opengame.view.w] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ DialogC3739w mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new DialogC3739w(this.this$0.LIZJ.LJIILL(), new C37211());
    }
}
