package com.bytedance.android.live.broadcast.bgbroadcast.game;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88799Kyn;

/* loaded from: classes5.dex */
public final class GameUiStateMachine$transitionToState$action$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88799Kyn $newState;
    public final /* synthetic */ Command $pendingCmd;
    public final /* synthetic */ C2942o this$0;

    static {
        Covode.recordClassIndex(14704);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameUiStateMachine$transitionToState$action$1(C2942o c2942o, C88799Kyn c88799Kyn, Command command) {
        super(0);
        this.this$0 = c2942o;
        this.$newState = c88799Kyn;
        this.$pendingCmd = command;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C88799Kyn c88799Kyn = this.$newState;
            c88799Kyn.LIZIZ = this.$pendingCmd;
            C2942o c2942o = this.this$0;
            if (!PatchProxy.proxy(new Object[]{c88799Kyn}, c2942o, C2942o.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(c88799Kyn);
                if (!Intrinsics.areEqual(c2942o.LJIIIIZZ, c88799Kyn)) {
                    C88799Kyn c88799Kyn2 = c2942o.LJIIIIZZ;
                    c88799Kyn2.LIZIZ(c2942o.LJIIIIZZ, c88799Kyn);
                    c2942o.LJIIIIZZ = c88799Kyn;
                    c88799Kyn.LIZ(c88799Kyn2, c2942o.LJIIIIZZ);
                }
            }
            Command command = this.this$0.LJIIIIZZ.LIZIZ;
            if (command != null) {
                this.this$0.LIZ(command);
                this.this$0.LJIIIIZZ.LIZIZ = null;
            }
        }
        return Unit.INSTANCE;
    }
}
