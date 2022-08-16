package com.bytedance.android.live.broadcastgame.opengame.lynx;

import com.bytedance.android.live.broadcastgame.opengame.panel.DialogC3611f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC88010Km4;
import p003X.C88008Km2;

/* loaded from: classes5.dex */
public final class LynxOpenPlugin$createOpenPanelFactory$1$providePanel$1 extends Lambda implements Function0<DialogC3611f> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88008Km2 this$0;

    static {
        Covode.recordClassIndex(20216);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOpenPlugin$createOpenPanelFactory$1$providePanel$1(C88008Km2 c88008Km2) {
        super(0);
        this.this$0 = c88008Km2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcastgame.opengame.panel.f, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ DialogC3611f mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new DialogC3611f(this.this$0.LIZIZ.pluginContext, new AbstractC88010Km4() { // from class: com.bytedance.android.live.broadcastgame.opengame.lynx.LynxOpenPlugin$createOpenPanelFactory$1$providePanel$1.1
            static {
                Covode.recordClassIndex(20217);
            }

            @Override // p003X.AbstractC88010Km4
            public final boolean LIZ() {
                return LynxOpenPlugin$createOpenPanelFactory$1$providePanel$1.this.this$0.LIZIZ.landscape;
            }
        }, null, 4);
    }
}
