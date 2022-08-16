package com.bytedance.android.live.broadcastgame.opengame.lynx;

import android.view.View;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.navigator.LynxViewCreationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87975KlV;

/* loaded from: classes5.dex */
public final class LynxOpenPlugin$createLynxView$1$onLoadSuccess$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $lynxView;
    public final /* synthetic */ C87975KlV this$0;

    static {
        Covode.recordClassIndex(20215);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOpenPlugin$createLynxView$1$onLoadSuccess$1(C87975KlV c87975KlV, View view) {
        super(0);
        this.this$0 = c87975KlV;
        this.$lynxView = view;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC3609d abstractC3609d = this.this$0.LIZIZ.gameInteractPanel;
            if (abstractC3609d != null) {
                abstractC3609d.LJIIIIZZ();
            }
            View view = this.$lynxView;
            if (!(view instanceof LynxView)) {
                view = null;
            }
            LynxView lynxView = (LynxView) view;
            if (lynxView != null) {
                LynxViewCreationListener lynxViewCreationListener = this.this$0.LIZJ;
                if (lynxViewCreationListener != null) {
                    lynxViewCreationListener.onReady(lynxView);
                }
                this.this$0.LIZIZ.navLynxViewOnEnterBackground();
                this.this$0.LIZIZ.navLynxComponentStack.push(this.this$0.LIZLLL);
                if (this.this$0.LIZIZ.navLynxComponentStack.size() == 1) {
                    this.this$0.LIZIZ.rootLynxViewOnEnterBackground();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
